package org.apache.commons.compress.compressors.lz77support;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import org.apache.commons.compress.compressors.CompressorInputStream;
import org.apache.commons.compress.utils.ByteUtils;
import org.apache.commons.compress.utils.CountingInputStream;
import org.apache.commons.compress.utils.IOUtils;
import org.apache.commons.compress.utils.InputStreamStatistics;

/* loaded from: classes6.dex */
public abstract class AbstractLZ77CompressorInputStream extends CompressorInputStream implements InputStreamStatistics {
    public int backReferenceOffset;
    public final byte[] buf;
    public long bytesRemaining;

    /* renamed from: in */
    public final CountingInputStream f9855in;
    public int readIndex;
    public int size;
    public final int windowSize;
    public int writeIndex;
    public final byte[] oneByte = new byte[1];
    public final ByteUtils.ByteSupplier supplier = new ByteUtils.ByteSupplier() { // from class: org.apache.commons.compress.compressors.lz77support.AbstractLZ77CompressorInputStream$$ExternalSyntheticLambda0
        @Override // org.apache.commons.compress.utils.ByteUtils.ByteSupplier
        public final int getAsByte() {
            return this.f$0.readOneByte();
        }
    };

    public AbstractLZ77CompressorInputStream(InputStream inputStream, int i) {
        this.f9855in = new CountingInputStream(inputStream);
        if (i <= 0) {
            throw new IllegalArgumentException("windowSize must be bigger than 0");
        }
        this.windowSize = i;
        this.buf = new byte[i * 3];
        this.readIndex = 0;
        this.writeIndex = 0;
        this.bytesRemaining = 0L;
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
        this.f9855in.close();
    }

    @Override // java.io.InputStream
    public int available() {
        return this.writeIndex - this.readIndex;
    }

    public int getSize() {
        return this.size;
    }

    public void prefill(byte[] bArr) {
        if (this.writeIndex != 0) {
            throw new IllegalStateException("The stream has already been read from, can't prefill anymore");
        }
        int iMin = Math.min(this.windowSize, bArr.length);
        System.arraycopy(bArr, bArr.length - iMin, this.buf, 0, iMin);
        this.writeIndex += iMin;
        this.readIndex += iMin;
    }

    @Override // org.apache.commons.compress.utils.InputStreamStatistics
    public long getCompressedCount() {
        return this.f9855in.getBytesRead();
    }

    public final void startLiteral(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("length must not be negative");
        }
        this.bytesRemaining = j;
    }

    public final boolean hasMoreDataInBlock() {
        return this.bytesRemaining > 0;
    }

    public final int readLiteral(byte[] bArr, int i, int i2) throws IOException {
        int iAvailable = available();
        if (i2 > iAvailable) {
            tryToReadLiteral(i2 - iAvailable);
        }
        return readFromBuffer(bArr, i, i2);
    }

    public final void tryToReadLiteral(int i) throws IOException {
        int iMin = Math.min((int) Math.min(i, this.bytesRemaining), this.buf.length - this.writeIndex);
        int fully = iMin > 0 ? IOUtils.readFully(this.f9855in, this.buf, this.writeIndex, iMin) : 0;
        count(fully);
        if (iMin != fully) {
            throw new IOException("Premature end of stream reading literal");
        }
        this.writeIndex += iMin;
        this.bytesRemaining -= iMin;
    }

    public final int readFromBuffer(byte[] bArr, int i, int i2) {
        int iMin = Math.min(i2, available());
        if (iMin > 0) {
            System.arraycopy(this.buf, this.readIndex, bArr, i, iMin);
            int i3 = this.readIndex + iMin;
            this.readIndex = i3;
            if (i3 > this.windowSize * 2) {
                slideBuffer();
            }
        }
        this.size += iMin;
        return iMin;
    }

    public final void slideBuffer() {
        byte[] bArr = this.buf;
        int i = this.windowSize;
        System.arraycopy(bArr, i, bArr, 0, i * 2);
        int i2 = this.writeIndex;
        int i3 = this.windowSize;
        this.writeIndex = i2 - i3;
        this.readIndex -= i3;
    }

    public final void startBackReference(int i, long j) {
        if (i <= 0 || i > this.writeIndex) {
            throw new IllegalArgumentException("offset must be bigger than 0 but not bigger than the number of bytes available for back-references");
        }
        if (j < 0) {
            throw new IllegalArgumentException("length must not be negative");
        }
        this.backReferenceOffset = i;
        this.bytesRemaining = j;
    }

    public final int readBackReference(byte[] bArr, int i, int i2) {
        int iAvailable = available();
        if (i2 > iAvailable) {
            tryToCopy(i2 - iAvailable);
        }
        return readFromBuffer(bArr, i, i2);
    }

    public final void tryToCopy(int i) {
        int iMin = Math.min((int) Math.min(i, this.bytesRemaining), this.buf.length - this.writeIndex);
        if (iMin != 0) {
            int i2 = this.backReferenceOffset;
            if (i2 == 1) {
                byte[] bArr = this.buf;
                int i3 = this.writeIndex;
                Arrays.fill(bArr, i3, i3 + iMin, bArr[i3 - 1]);
                this.writeIndex += iMin;
            } else if (iMin < i2) {
                byte[] bArr2 = this.buf;
                int i4 = this.writeIndex;
                System.arraycopy(bArr2, i4 - i2, bArr2, i4, iMin);
                this.writeIndex += iMin;
            } else {
                int i5 = iMin / i2;
                for (int i6 = 0; i6 < i5; i6++) {
                    byte[] bArr3 = this.buf;
                    int i7 = this.writeIndex;
                    int i8 = this.backReferenceOffset;
                    System.arraycopy(bArr3, i7 - i8, bArr3, i7, i8);
                    this.writeIndex += this.backReferenceOffset;
                }
                int i9 = this.backReferenceOffset;
                int i10 = iMin - (i5 * i9);
                if (i10 > 0) {
                    byte[] bArr4 = this.buf;
                    int i11 = this.writeIndex;
                    System.arraycopy(bArr4, i11 - i9, bArr4, i11, i10);
                    this.writeIndex += i10;
                }
            }
        }
        this.bytesRemaining -= iMin;
    }

    public final int readOneByte() throws IOException {
        int i = this.f9855in.read();
        if (i == -1) {
            return -1;
        }
        count(1);
        return i & 255;
    }
}
