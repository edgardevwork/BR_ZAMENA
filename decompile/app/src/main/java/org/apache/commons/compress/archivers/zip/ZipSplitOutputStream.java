package org.apache.commons.compress.archivers.zip;

import androidx.multidex.MultiDexExtractor;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Objects;
import org.apache.commons.compress.utils.FileNameUtils;

/* loaded from: classes6.dex */
public class ZipSplitOutputStream extends OutputStream {
    public static final long ZIP_SEGMENT_MAX_SIZE = 4294967295L;
    public static final long ZIP_SEGMENT_MIN_SIZE = 65536;
    public long currentSplitSegmentBytesWritten;
    public int currentSplitSegmentIndex;
    public boolean finished;
    public OutputStream outputStream;
    public final byte[] singleByte;
    public final long splitSize;
    public Path zipFile;

    public ZipSplitOutputStream(File file, long j) throws IOException, IllegalArgumentException {
        this(file.toPath(), j);
    }

    public ZipSplitOutputStream(Path path, long j) throws IOException, IllegalArgumentException {
        this.singleByte = new byte[1];
        if (j < 65536 || j > 4294967295L) {
            throw new IllegalArgumentException("zip split segment size should between 64K and 4,294,967,295");
        }
        this.zipFile = path;
        this.splitSize = j;
        this.outputStream = Files.newOutputStream(path, new OpenOption[0]);
        writeZipSplitSignature();
    }

    public void prepareToWriteUnsplittableContent(long j) throws IOException, IllegalArgumentException {
        long j2 = this.splitSize;
        if (j > j2) {
            throw new IllegalArgumentException("The unsplittable content size is bigger than the split segment size");
        }
        if (j2 - this.currentSplitSegmentBytesWritten < j) {
            openNewSplitSegment();
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this.singleByte;
        bArr[0] = (byte) (i & 255);
        write(bArr);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (i2 <= 0) {
            return;
        }
        long j = this.currentSplitSegmentBytesWritten;
        long j2 = this.splitSize;
        if (j >= j2) {
            openNewSplitSegment();
            write(bArr, i, i2);
            return;
        }
        long j3 = i2;
        if (j + j3 > j2) {
            int i3 = ((int) j2) - ((int) j);
            write(bArr, i, i3);
            openNewSplitSegment();
            write(bArr, i + i3, i2 - i3);
            return;
        }
        this.outputStream.write(bArr, i, i2);
        this.currentSplitSegmentBytesWritten += j3;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.finished) {
            return;
        }
        finish();
    }

    public final void finish() throws IOException {
        if (this.finished) {
            throw new IOException("This archive has already been finished");
        }
        String baseName = FileNameUtils.getBaseName(this.zipFile);
        this.outputStream.close();
        Path path = this.zipFile;
        Files.move(path, path.resolveSibling(baseName + MultiDexExtractor.EXTRACTED_SUFFIX), StandardCopyOption.ATOMIC_MOVE);
        this.finished = true;
    }

    public final void openNewSplitSegment() throws IOException {
        if (this.currentSplitSegmentIndex == 0) {
            this.outputStream.close();
            Files.move(this.zipFile, createNewSplitSegmentFile(1), StandardCopyOption.ATOMIC_MOVE);
        }
        Path pathCreateNewSplitSegmentFile = createNewSplitSegmentFile(null);
        this.outputStream.close();
        this.outputStream = Files.newOutputStream(pathCreateNewSplitSegmentFile, new OpenOption[0]);
        this.currentSplitSegmentBytesWritten = 0L;
        this.zipFile = pathCreateNewSplitSegmentFile;
        this.currentSplitSegmentIndex++;
    }

    public final void writeZipSplitSignature() throws IOException {
        this.outputStream.write(ZipArchiveOutputStream.DD_SIG);
        this.currentSplitSegmentBytesWritten += r1.length;
    }

    public final Path createNewSplitSegmentFile(Integer num) throws IOException {
        String str;
        int iIntValue = num == null ? this.currentSplitSegmentIndex + 2 : num.intValue();
        String baseName = FileNameUtils.getBaseName(this.zipFile);
        if (iIntValue <= 9) {
            str = ".z0" + iIntValue;
        } else {
            str = ".z" + iIntValue;
        }
        Path parent = this.zipFile.getParent();
        String string = Objects.nonNull(parent) ? parent.toAbsolutePath().toString() : ".";
        Path path = this.zipFile.getFileSystem().getPath(string, baseName + str);
        if (!Files.exists(path, new LinkOption[0])) {
            return path;
        }
        throw new IOException("split zip segment " + baseName + str + " already exists");
    }

    public int getCurrentSplitSegmentIndex() {
        return this.currentSplitSegmentIndex;
    }

    public long getCurrentSplitSegmentBytesWritten() {
        return this.currentSplitSegmentBytesWritten;
    }
}
