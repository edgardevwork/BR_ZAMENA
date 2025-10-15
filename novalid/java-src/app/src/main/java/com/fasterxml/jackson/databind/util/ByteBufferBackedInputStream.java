package com.fasterxml.jackson.databind.util;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public class ByteBufferBackedInputStream extends InputStream {

    /* renamed from: _b */
    public final ByteBuffer f650_b;

    public ByteBufferBackedInputStream(ByteBuffer byteBuffer) {
        this.f650_b = byteBuffer;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f650_b.remaining();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.f650_b.hasRemaining()) {
            return this.f650_b.get() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f650_b.hasRemaining()) {
            return -1;
        }
        int iMin = Math.min(i2, this.f650_b.remaining());
        this.f650_b.get(bArr, i, iMin);
        return iMin;
    }
}
