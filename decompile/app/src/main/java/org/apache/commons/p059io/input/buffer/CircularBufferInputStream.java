package org.apache.commons.p059io.input.buffer;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import org.apache.commons.p059io.IOUtils;

/* loaded from: classes6.dex */
public class CircularBufferInputStream extends InputStream {
    public final CircularByteBuffer buffer;
    public final int bufferSize;
    public boolean eof;

    /* renamed from: in */
    public final InputStream f9897in;

    public CircularBufferInputStream(InputStream inputStream, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Invalid bufferSize: " + i);
        }
        Objects.requireNonNull(inputStream, "inputStream");
        this.f9897in = inputStream;
        this.buffer = new CircularByteBuffer(i);
        this.bufferSize = i;
        this.eof = false;
    }

    public CircularBufferInputStream(InputStream inputStream) {
        this(inputStream, 8192);
    }

    public void fillBuffer() throws IOException {
        if (this.eof) {
            return;
        }
        int space = this.buffer.getSpace();
        byte[] bArrByteArray = IOUtils.byteArray(space);
        while (space > 0) {
            int i = this.f9897in.read(bArrByteArray, 0, space);
            if (i == -1) {
                this.eof = true;
                return;
            } else if (i > 0) {
                this.buffer.add(bArrByteArray, 0, i);
                space -= i;
            }
        }
    }

    public boolean haveBytes(int i) throws IOException {
        if (this.buffer.getCurrentNumberOfBytes() < i) {
            fillBuffer();
        }
        return this.buffer.hasBytes();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (haveBytes(1)) {
            return this.buffer.read() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        Objects.requireNonNull(bArr, "targetBuffer");
        if (i < 0) {
            throw new IllegalArgumentException("Offset must not be negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Length must not be negative");
        }
        if (!haveBytes(i2)) {
            return -1;
        }
        int iMin = Math.min(i2, this.buffer.getCurrentNumberOfBytes());
        for (int i3 = 0; i3 < iMin; i3++) {
            bArr[i + i3] = this.buffer.read();
        }
        return iMin;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f9897in.close();
        this.eof = true;
        this.buffer.clear();
    }
}
