package org.apache.commons.compress.compressors.snappy;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.Arrays;
import org.apache.commons.compress.compressors.CompressorInputStream;
import org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorInputStream;
import org.apache.commons.compress.utils.BoundedInputStream;
import org.apache.commons.compress.utils.ByteUtils;
import org.apache.commons.compress.utils.CountingInputStream;
import org.apache.commons.compress.utils.IOUtils;
import org.apache.commons.compress.utils.InputStreamStatistics;

/* loaded from: classes6.dex */
public class FramedSnappyCompressorInputStream extends CompressorInputStream implements InputStreamStatistics {
    public static final int COMPRESSED_CHUNK_TYPE = 0;
    public static final long MASK_OFFSET = 2726488792L;
    public static final int MAX_SKIPPABLE_TYPE = 253;
    public static final int MAX_UNSKIPPABLE_TYPE = 127;
    public static final int MIN_UNSKIPPABLE_TYPE = 2;
    public static final int PADDING_CHUNK_TYPE = 254;
    public static final int STREAM_IDENTIFIER_TYPE = 255;
    public static final byte[] SZ_SIGNATURE = {-1, 6, 0, 0, 115, 78, 97, FramedLZ4CompressorInputStream.SKIPPABLE_FRAME_PREFIX_BYTE_MASK, 112, 89};
    public static final int UNCOMPRESSED_CHUNK_TYPE = 1;
    public final int blockSize;
    public final PureJavaCrc32C checksum;
    public final CountingInputStream countingStream;
    public SnappyCompressorInputStream currentCompressedChunk;
    public final FramedSnappyDialect dialect;
    public boolean endReached;
    public long expectedChecksum;
    public boolean inUncompressedChunk;
    public final PushbackInputStream inputStream;
    public final byte[] oneByte;
    public final ByteUtils.ByteSupplier supplier;
    public int uncompressedBytesRemaining;
    public long unreadBytes;

    public static long unmask(long j) {
        long j2 = (j - MASK_OFFSET) & 4294967295L;
        return ((j2 << 15) | (j2 >> 17)) & 4294967295L;
    }

    public FramedSnappyCompressorInputStream(InputStream inputStream) throws IOException {
        this(inputStream, FramedSnappyDialect.STANDARD);
    }

    public FramedSnappyCompressorInputStream(InputStream inputStream, FramedSnappyDialect framedSnappyDialect) throws IOException {
        this(inputStream, 32768, framedSnappyDialect);
    }

    public FramedSnappyCompressorInputStream(InputStream inputStream, int i, FramedSnappyDialect framedSnappyDialect) throws IOException {
        this.oneByte = new byte[1];
        this.expectedChecksum = -1L;
        this.checksum = new PureJavaCrc32C();
        this.supplier = new ByteUtils.ByteSupplier() { // from class: org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream$$ExternalSyntheticLambda0
            @Override // org.apache.commons.compress.utils.ByteUtils.ByteSupplier
            public final int getAsByte() {
                return this.f$0.readOneByte();
            }
        };
        if (i <= 0) {
            throw new IllegalArgumentException("blockSize must be bigger than 0");
        }
        CountingInputStream countingInputStream = new CountingInputStream(inputStream);
        this.countingStream = countingInputStream;
        this.inputStream = new PushbackInputStream(countingInputStream, 1);
        this.blockSize = i;
        this.dialect = framedSnappyDialect;
        if (framedSnappyDialect.hasStreamIdentifier()) {
            readStreamIdentifier();
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.oneByte, 0, 1) == -1) {
            return -1;
        }
        return this.oneByte[0] & 255;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            SnappyCompressorInputStream snappyCompressorInputStream = this.currentCompressedChunk;
            if (snappyCompressorInputStream != null) {
                snappyCompressorInputStream.close();
                this.currentCompressedChunk = null;
            }
        } finally {
            this.inputStream.close();
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        int once = readOnce(bArr, i, i2);
        if (once != -1) {
            return once;
        }
        readNextBlock();
        if (this.endReached) {
            return -1;
        }
        return readOnce(bArr, i, i2);
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        if (this.inUncompressedChunk) {
            return Math.min(this.uncompressedBytesRemaining, this.inputStream.available());
        }
        SnappyCompressorInputStream snappyCompressorInputStream = this.currentCompressedChunk;
        if (snappyCompressorInputStream != null) {
            return snappyCompressorInputStream.available();
        }
        return 0;
    }

    @Override // org.apache.commons.compress.utils.InputStreamStatistics
    public long getCompressedCount() {
        return this.countingStream.getBytesRead() - this.unreadBytes;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int readOnce(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = -1;
        if (this.inUncompressedChunk) {
            int iMin = Math.min(this.uncompressedBytesRemaining, i2);
            if (iMin == 0) {
                return -1;
            }
            i3 = this.inputStream.read(bArr, i, iMin);
            if (i3 != -1) {
                this.uncompressedBytesRemaining -= i3;
                count(i3);
            }
        } else {
            SnappyCompressorInputStream snappyCompressorInputStream = this.currentCompressedChunk;
            if (snappyCompressorInputStream != null) {
                long bytesRead = snappyCompressorInputStream.getBytesRead();
                i3 = this.currentCompressedChunk.read(bArr, i, i2);
                if (i3 == -1) {
                    this.currentCompressedChunk.close();
                    this.currentCompressedChunk = null;
                } else {
                    count(this.currentCompressedChunk.getBytesRead() - bytesRead);
                }
            }
            if (i4 > 0) {
                this.checksum.update(bArr, i, i4);
            }
            return i4;
        }
        i4 = i3;
        if (i4 > 0) {
        }
        return i4;
    }

    public final void readNextBlock() throws IOException {
        verifyLastChecksumAndReset();
        this.inUncompressedChunk = false;
        int oneByte = readOneByte();
        if (oneByte == -1) {
            this.endReached = true;
            return;
        }
        if (oneByte == 255) {
            this.inputStream.unread(oneByte);
            this.unreadBytes++;
            pushedBackBytes(1L);
            readStreamIdentifier();
            readNextBlock();
            return;
        }
        if (oneByte == 254 || (oneByte > 127 && oneByte <= 253)) {
            skipBlock();
            readNextBlock();
            return;
        }
        if (oneByte >= 2 && oneByte <= 127) {
            throw new IOException("Unskippable chunk with type " + oneByte + " (hex " + Integer.toHexString(oneByte) + ") detected.");
        }
        if (oneByte == 1) {
            this.inUncompressedChunk = true;
            int size = readSize() - 4;
            this.uncompressedBytesRemaining = size;
            if (size < 0) {
                throw new IOException("Found illegal chunk with negative size");
            }
            this.expectedChecksum = unmask(readCrc());
            return;
        }
        if (oneByte == 0) {
            boolean zUsesChecksumWithCompressedChunks = this.dialect.usesChecksumWithCompressedChunks();
            long size2 = readSize() - (zUsesChecksumWithCompressedChunks ? 4L : 0L);
            if (size2 < 0) {
                throw new IOException("Found illegal chunk with negative size");
            }
            if (zUsesChecksumWithCompressedChunks) {
                this.expectedChecksum = unmask(readCrc());
            } else {
                this.expectedChecksum = -1L;
            }
            SnappyCompressorInputStream snappyCompressorInputStream = new SnappyCompressorInputStream(new BoundedInputStream(this.inputStream, size2), this.blockSize);
            this.currentCompressedChunk = snappyCompressorInputStream;
            count(snappyCompressorInputStream.getBytesRead());
            return;
        }
        throw new IOException("Unknown chunk type " + oneByte + " detected.");
    }

    public final long readCrc() throws IOException {
        byte[] bArr = new byte[4];
        int fully = IOUtils.readFully(this.inputStream, bArr);
        count(fully);
        if (fully != 4) {
            throw new IOException("Premature end of stream");
        }
        return ByteUtils.fromLittleEndian(bArr);
    }

    public final int readSize() throws IOException {
        return (int) ByteUtils.fromLittleEndian(this.supplier, 3);
    }

    public final void skipBlock() throws IOException {
        int size = readSize();
        if (size < 0) {
            throw new IOException("Found illegal chunk with negative size");
        }
        long j = size;
        long jSkip = IOUtils.skip(this.inputStream, j);
        count(jSkip);
        if (jSkip != j) {
            throw new IOException("Premature end of stream");
        }
    }

    public final void readStreamIdentifier() throws IOException {
        byte[] bArr = new byte[10];
        int fully = IOUtils.readFully(this.inputStream, bArr);
        count(fully);
        if (10 != fully || !matches(bArr, 10)) {
            throw new IOException("Not a framed Snappy stream");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int readOneByte() throws IOException {
        int i = this.inputStream.read();
        if (i == -1) {
            return -1;
        }
        count(1);
        return i & 255;
    }

    public final void verifyLastChecksumAndReset() throws IOException {
        long j = this.expectedChecksum;
        if (j >= 0 && j != this.checksum.getValue()) {
            throw new IOException("Checksum verification failed");
        }
        this.expectedChecksum = -1L;
        this.checksum.reset();
    }

    public static boolean matches(byte[] bArr, int i) {
        byte[] bArr2 = SZ_SIGNATURE;
        if (i < bArr2.length) {
            return false;
        }
        if (bArr.length > bArr2.length) {
            byte[] bArr3 = new byte[bArr2.length];
            System.arraycopy(bArr, 0, bArr3, 0, bArr2.length);
            bArr = bArr3;
        }
        return Arrays.equals(bArr, bArr2);
    }
}
