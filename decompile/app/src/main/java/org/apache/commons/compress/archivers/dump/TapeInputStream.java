package org.apache.commons.compress.archivers.dump;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.apache.commons.compress.archivers.dump.DumpArchiveConstants;
import org.apache.commons.compress.utils.ExactMath;
import org.apache.commons.compress.utils.IOUtils;

/* loaded from: classes5.dex */
public class TapeInputStream extends FilterInputStream {
    public static final int RECORD_SIZE = 1024;
    public byte[] blockBuffer;
    public int blockSize;
    public long bytesRead;
    public int currBlkIdx;
    public boolean isCompressed;
    public int readOffset;

    public TapeInputStream(InputStream inputStream) {
        super(inputStream);
        this.blockBuffer = new byte[1024];
        this.currBlkIdx = -1;
        this.blockSize = 1024;
        this.readOffset = 1024;
    }

    public void resetBlockSize(int i, boolean z) throws IOException {
        this.isCompressed = z;
        if (i < 1) {
            throw new IOException("Block with " + i + " records found, must be at least 1");
        }
        int i2 = i * 1024;
        this.blockSize = i2;
        byte[] bArr = this.blockBuffer;
        byte[] bArr2 = new byte[i2];
        this.blockBuffer = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, 1024);
        readFully(this.blockBuffer, 1024, this.blockSize - 1024);
        this.currBlkIdx = 0;
        this.readOffset = 1024;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        int i = this.readOffset;
        int i2 = this.blockSize;
        return i < i2 ? i2 - i : ((FilterInputStream) this).in.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        throw new IllegalArgumentException("All reads must be multiple of record size (1024 bytes.");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        if (i2 % 1024 != 0) {
            throw new IllegalArgumentException("All reads must be multiple of record size (1024 bytes.");
        }
        while (i3 < i2) {
            if (this.readOffset == this.blockSize) {
                try {
                    readBlock(true);
                } catch (ShortFileException unused) {
                    return -1;
                }
            }
            int i4 = this.readOffset;
            int i5 = i2 - i3;
            int i6 = i4 + i5;
            int i7 = this.blockSize;
            if (i6 > i7) {
                i5 = i7 - i4;
            }
            System.arraycopy(this.blockBuffer, i4, bArr, i, i5);
            this.readOffset += i5;
            i3 += i5;
            i += i5;
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long j2 = 0;
        if (j % 1024 != 0) {
            throw new IllegalArgumentException("All reads must be multiple of record size (1024 bytes.");
        }
        while (j2 < j) {
            int i = this.readOffset;
            int i2 = this.blockSize;
            if (i == i2) {
                try {
                    readBlock(j - j2 < ((long) i2));
                } catch (ShortFileException unused) {
                    return -1L;
                }
            }
            int i3 = this.readOffset;
            long j3 = j - j2;
            long j4 = i3 + j3;
            int i4 = this.blockSize;
            if (j4 > i4) {
                j3 = i4 - i3;
            }
            this.readOffset = ExactMath.add(i3, j3);
            j2 += j3;
        }
        return j2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (((FilterInputStream) this).in == null || ((FilterInputStream) this).in == System.in) {
            return;
        }
        ((FilterInputStream) this).in.close();
    }

    public byte[] peek() throws IOException {
        if (this.readOffset == this.blockSize) {
            try {
                readBlock(true);
            } catch (ShortFileException unused) {
                return null;
            }
        }
        byte[] bArr = new byte[1024];
        System.arraycopy(this.blockBuffer, this.readOffset, bArr, 0, 1024);
        return bArr;
    }

    public byte[] readRecord() throws IOException {
        byte[] bArr = new byte[1024];
        if (-1 != read(bArr, 0, 1024)) {
            return bArr;
        }
        throw new ShortFileException();
    }

    public final void readBlock(boolean z) throws IOException {
        if (((FilterInputStream) this).in == null) {
            throw new IOException("Input buffer is closed");
        }
        if (!this.isCompressed || this.currBlkIdx == -1) {
            readFully(this.blockBuffer, 0, this.blockSize);
            this.bytesRead += this.blockSize;
        } else {
            readFully(this.blockBuffer, 0, 4);
            this.bytesRead += 4;
            int iConvert32 = DumpArchiveUtil.convert32(this.blockBuffer, 0);
            if ((iConvert32 & 1) != 1) {
                readFully(this.blockBuffer, 0, this.blockSize);
                this.bytesRead += this.blockSize;
            } else {
                int i = iConvert32 >> 1;
                int i2 = (iConvert32 >> 4) & 268435455;
                byte[] range = readRange(i2);
                this.bytesRead += i2;
                if (!z) {
                    Arrays.fill(this.blockBuffer, (byte) 0);
                } else {
                    int i3 = C110171.f9831x24f7e417[DumpArchiveConstants.COMPRESSION_TYPE.find(i & 3).ordinal()];
                    if (i3 != 1) {
                        if (i3 == 2) {
                            throw new UnsupportedCompressionAlgorithmException("BZLIB2");
                        }
                        if (i3 == 3) {
                            throw new UnsupportedCompressionAlgorithmException("LZO");
                        }
                        throw new UnsupportedCompressionAlgorithmException();
                    }
                    Inflater inflater = new Inflater();
                    try {
                        try {
                            inflater.setInput(range, 0, range.length);
                            if (inflater.inflate(this.blockBuffer) != this.blockSize) {
                                throw new ShortFileException();
                            }
                        } catch (DataFormatException e) {
                            throw new DumpArchiveException("Bad data", e);
                        }
                    } finally {
                        inflater.end();
                    }
                }
            }
        }
        this.currBlkIdx++;
        this.readOffset = 0;
    }

    /* renamed from: org.apache.commons.compress.archivers.dump.TapeInputStream$1 */
    public static /* synthetic */ class C110171 {

        /* renamed from: $SwitchMap$org$apache$commons$compress$archivers$dump$DumpArchiveConstants$COMPRESSION_TYPE */
        public static final /* synthetic */ int[] f9831x24f7e417;

        static {
            int[] iArr = new int[DumpArchiveConstants.COMPRESSION_TYPE.values().length];
            f9831x24f7e417 = iArr;
            try {
                iArr[DumpArchiveConstants.COMPRESSION_TYPE.ZLIB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9831x24f7e417[DumpArchiveConstants.COMPRESSION_TYPE.BZLIB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9831x24f7e417[DumpArchiveConstants.COMPRESSION_TYPE.LZO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public final void readFully(byte[] bArr, int i, int i2) throws IOException {
        if (IOUtils.readFully(((FilterInputStream) this).in, bArr, i, i2) < i2) {
            throw new ShortFileException();
        }
    }

    public final byte[] readRange(int i) throws IOException {
        byte[] range = IOUtils.readRange(((FilterInputStream) this).in, i);
        if (range.length >= i) {
            return range;
        }
        throw new ShortFileException();
    }

    public long getBytesRead() {
        return this.bytesRead;
    }
}
