package org.apache.commons.p059io.filefilter;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import org.apache.commons.p059io.IOUtils;

/* loaded from: classes5.dex */
public class MagicNumberFileFilter extends AbstractFileFilter implements Serializable {
    public static final long serialVersionUID = -547733176983104172L;
    public final long byteOffset;
    public final byte[] magicNumbers;

    public MagicNumberFileFilter(byte[] bArr) {
        this(bArr, 0L);
    }

    public MagicNumberFileFilter(byte[] bArr, long j) {
        if (bArr == null) {
            throw new IllegalArgumentException("The magic number cannot be null");
        }
        if (bArr.length == 0) {
            throw new IllegalArgumentException("The magic number must contain at least one byte");
        }
        if (j < 0) {
            throw new IllegalArgumentException("The offset cannot be negative");
        }
        byte[] bArrByteArray = IOUtils.byteArray(bArr.length);
        this.magicNumbers = bArrByteArray;
        System.arraycopy(bArr, 0, bArrByteArray, 0, bArr.length);
        this.byteOffset = j;
    }

    public MagicNumberFileFilter(String str) {
        this(str, 0L);
    }

    public MagicNumberFileFilter(String str, long j) {
        if (str == null) {
            throw new IllegalArgumentException("The magic number cannot be null");
        }
        if (str.isEmpty()) {
            throw new IllegalArgumentException("The magic number must contain at least one byte");
        }
        if (j < 0) {
            throw new IllegalArgumentException("The offset cannot be negative");
        }
        this.magicNumbers = str.getBytes(Charset.defaultCharset());
        this.byteOffset = j;
    }

    @Override // org.apache.commons.p059io.filefilter.AbstractFileFilter, org.apache.commons.p059io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) throws IOException {
        if (file != null && file.isFile() && file.canRead()) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    byte[] bArrByteArray = IOUtils.byteArray(this.magicNumbers.length);
                    randomAccessFile.seek(this.byteOffset);
                    int i = randomAccessFile.read(bArrByteArray);
                    byte[] bArr = this.magicNumbers;
                    if (i == bArr.length) {
                        boolean zEquals = Arrays.equals(bArr, bArrByteArray);
                        randomAccessFile.close();
                        return zEquals;
                    }
                    randomAccessFile.close();
                    return false;
                } finally {
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    @Override // org.apache.commons.p059io.filefilter.IOFileFilter, org.apache.commons.p059io.file.PathFilter
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        if (path != null && Files.isRegularFile(path, new LinkOption[0]) && Files.isReadable(path)) {
            try {
                FileChannel fileChannelOpen = FileChannel.open(path, new OpenOption[0]);
                try {
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.magicNumbers.length);
                    int i = fileChannelOpen.read(byteBufferAllocate);
                    byte[] bArr = this.magicNumbers;
                    if (i != bArr.length) {
                        FileVisitResult fileVisitResult = FileVisitResult.TERMINATE;
                        fileChannelOpen.close();
                        return fileVisitResult;
                    }
                    FileVisitResult fileVisitResult2 = AbstractFileFilter.toFileVisitResult(Arrays.equals(bArr, byteBufferAllocate.array()), path);
                    fileChannelOpen.close();
                    return fileVisitResult2;
                } finally {
                }
            } catch (IOException unused) {
            }
        }
        return FileVisitResult.TERMINATE;
    }

    @Override // org.apache.commons.p059io.filefilter.AbstractFileFilter
    public String toString() {
        return super.toString() + "(" + new String(this.magicNumbers, Charset.defaultCharset()) + "," + this.byteOffset + ")";
    }
}
