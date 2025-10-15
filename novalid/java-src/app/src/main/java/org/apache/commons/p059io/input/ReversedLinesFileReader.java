package org.apache.commons.p059io.input;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.p059io.Charsets;
import org.apache.commons.p059io.IOUtils;
import org.apache.commons.p059io.StandardLineSeparator;

/* loaded from: classes6.dex */
public class ReversedLinesFileReader implements Closeable {
    public static final int DEFAULT_BLOCK_SIZE = 8192;
    public static final String EMPTY_STRING = "";
    public final int avoidNewlineSplitBufferSize;
    public final int blockSize;
    public final int byteDecrement;
    public final SeekableByteChannel channel;
    public final Charset charset;
    public FilePart currentFilePart;
    public final byte[][] newLineSequences;
    public final long totalBlockCount;
    public final long totalByteLength;
    public boolean trailingNewlineOfFileSkipped;

    public class FilePart {
        public int currentLastBytePos;
        public final byte[] data;
        public byte[] leftOver;

        /* renamed from: no */
        public final long f9896no;

        public FilePart(long j, int i, byte[] bArr) throws IOException {
            this.f9896no = j;
            byte[] bArr2 = new byte[(bArr != null ? bArr.length : 0) + i];
            this.data = bArr2;
            long j2 = (j - 1) * ReversedLinesFileReader.this.blockSize;
            if (j > 0) {
                ReversedLinesFileReader.this.channel.position(j2);
                if (ReversedLinesFileReader.this.channel.read(ByteBuffer.wrap(bArr2, 0, i)) != i) {
                    throw new IllegalStateException("Count of requested bytes and actually read bytes don't match");
                }
            }
            if (bArr != null) {
                System.arraycopy(bArr, 0, bArr2, i, bArr.length);
            }
            this.currentLastBytePos = bArr2.length - 1;
            this.leftOver = null;
        }

        public final void createLeftOver() {
            int i = this.currentLastBytePos + 1;
            if (i > 0) {
                byte[] bArrByteArray = IOUtils.byteArray(i);
                this.leftOver = bArrByteArray;
                System.arraycopy(this.data, 0, bArrByteArray, 0, i);
            } else {
                this.leftOver = null;
            }
            this.currentLastBytePos = -1;
        }

        public final int getNewLineMatchByteCount(byte[] bArr, int i) {
            for (byte[] bArr2 : ReversedLinesFileReader.this.newLineSequences) {
                boolean z = true;
                for (int length = bArr2.length - 1; length >= 0; length--) {
                    int length2 = (i + length) - (bArr2.length - 1);
                    z &= length2 >= 0 && bArr[length2] == bArr2[length];
                }
                if (z) {
                    return bArr2.length;
                }
            }
            return 0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
        
            r1 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x006d, code lost:
        
            if (r0 == false) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x006f, code lost:
        
            r0 = r9.leftOver;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0071, code lost:
        
            if (r0 == null) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
        
            r1 = new java.lang.String(r0, r9.this$0.charset);
            r9.leftOver = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0080, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
        
            return r1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final String readLine() {
            boolean z = this.f9896no == 1;
            int i = this.currentLastBytePos;
            while (true) {
                if (i > -1) {
                    if (!z && i < ReversedLinesFileReader.this.avoidNewlineSplitBufferSize) {
                        createLeftOver();
                        break;
                    }
                    int newLineMatchByteCount = getNewLineMatchByteCount(this.data, i);
                    if (newLineMatchByteCount <= 0) {
                        i -= ReversedLinesFileReader.this.byteDecrement;
                        if (i < 0) {
                            createLeftOver();
                            break;
                        }
                    } else {
                        int i2 = i + 1;
                        int i3 = (this.currentLastBytePos - i2) + 1;
                        if (i3 < 0) {
                            throw new IllegalStateException("Unexpected negative line length=" + i3);
                        }
                        byte[] bArrByteArray = IOUtils.byteArray(i3);
                        System.arraycopy(this.data, i2, bArrByteArray, 0, i3);
                        String str = new String(bArrByteArray, ReversedLinesFileReader.this.charset);
                        this.currentLastBytePos = i - newLineMatchByteCount;
                    }
                } else {
                    break;
                }
            }
        }

        public final FilePart rollOver() throws IOException {
            if (this.currentLastBytePos > -1) {
                throw new IllegalStateException("Current currentLastCharPos unexpectedly positive... last readLine() should have returned something! currentLastCharPos=" + this.currentLastBytePos);
            }
            long j = this.f9896no;
            if (j > 1) {
                ReversedLinesFileReader reversedLinesFileReader = ReversedLinesFileReader.this;
                return reversedLinesFileReader.new FilePart(j - 1, reversedLinesFileReader.blockSize, this.leftOver);
            }
            if (this.leftOver == null) {
                return null;
            }
            throw new IllegalStateException("Unexpected leftover of the last block: leftOverOfThisFilePart=" + new String(this.leftOver, ReversedLinesFileReader.this.charset));
        }
    }

    @Deprecated
    public ReversedLinesFileReader(File file) throws IOException {
        this(file, 8192, Charset.defaultCharset());
    }

    public ReversedLinesFileReader(File file, Charset charset) throws IOException {
        this(file.toPath(), charset);
    }

    public ReversedLinesFileReader(File file, int i, Charset charset) throws IOException {
        this(file.toPath(), i, charset);
    }

    public ReversedLinesFileReader(File file, int i, String str) throws IOException {
        this(file.toPath(), i, str);
    }

    public ReversedLinesFileReader(Path path, Charset charset) throws IOException {
        this(path, 8192, charset);
    }

    public ReversedLinesFileReader(Path path, int i, Charset charset) throws IOException {
        int i2;
        this.blockSize = i;
        Charset charset2 = Charsets.toCharset(charset);
        this.charset = charset2;
        if (charset2.newEncoder().maxBytesPerChar() == 1.0f || charset2 == StandardCharsets.UTF_8 || charset2 == Charset.forName("Shift_JIS") || charset2 == Charset.forName("windows-31j") || charset2 == Charset.forName("x-windows-949") || charset2 == Charset.forName("gbk") || charset2 == Charset.forName("x-windows-950")) {
            this.byteDecrement = 1;
        } else if (charset2 == StandardCharsets.UTF_16BE || charset2 == StandardCharsets.UTF_16LE) {
            this.byteDecrement = 2;
        } else {
            if (charset2 == StandardCharsets.UTF_16) {
                throw new UnsupportedEncodingException("For UTF-16, you need to specify the byte order (use UTF-16BE or UTF-16LE)");
            }
            throw new UnsupportedEncodingException("Encoding " + charset + " is not supported yet (feel free to submit a patch)");
        }
        byte[][] bArr = {StandardLineSeparator.CRLF.getBytes(charset2), StandardLineSeparator.LF.getBytes(charset2), StandardLineSeparator.CR.getBytes(charset2)};
        this.newLineSequences = bArr;
        this.avoidNewlineSplitBufferSize = bArr[0].length;
        SeekableByteChannel seekableByteChannelNewByteChannel = Files.newByteChannel(path, StandardOpenOption.READ);
        this.channel = seekableByteChannelNewByteChannel;
        long size = seekableByteChannelNewByteChannel.size();
        this.totalByteLength = size;
        long j = i;
        int i3 = (int) (size % j);
        if (i3 > 0) {
            this.totalBlockCount = (size / j) + 1;
        } else {
            this.totalBlockCount = size / j;
            i2 = size > 0 ? i : i2;
            this.currentFilePart = new FilePart(this.totalBlockCount, i2, null);
        }
        i2 = i3;
        this.currentFilePart = new FilePart(this.totalBlockCount, i2, null);
    }

    public ReversedLinesFileReader(Path path, int i, String str) throws IOException {
        this(path, i, Charsets.toCharset(str));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.channel.close();
    }

    public String readLine() throws IOException {
        String line = this.currentFilePart.readLine();
        while (line == null) {
            FilePart filePartRollOver = this.currentFilePart.rollOver();
            this.currentFilePart = filePartRollOver;
            if (filePartRollOver == null) {
                break;
            }
            line = filePartRollOver.readLine();
        }
        if (!"".equals(line) || this.trailingNewlineOfFileSkipped) {
            return line;
        }
        this.trailingNewlineOfFileSkipped = true;
        return readLine();
    }

    public List<String> readLines(int i) throws IOException {
        if (i < 0) {
            throw new IllegalArgumentException("lineCount < 0");
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            String line = readLine();
            if (line == null) {
                return arrayList;
            }
            arrayList.add(line);
        }
        return arrayList;
    }

    public String toString(int i) throws IOException {
        List<String> lines = readLines(i);
        Collections.reverse(lines);
        if (lines.isEmpty()) {
            return "";
        }
        return ReversedLinesFileReader$$ExternalSyntheticBackport0.m7340m(System.lineSeparator(), lines) + System.lineSeparator();
    }
}
