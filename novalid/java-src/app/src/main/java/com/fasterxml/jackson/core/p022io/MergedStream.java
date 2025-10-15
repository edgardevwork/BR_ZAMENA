package com.fasterxml.jackson.core.p022io;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes8.dex */
public final class MergedStream extends InputStream {

    /* renamed from: _b */
    public byte[] f623_b;
    public final IOContext _ctxt;
    public final int _end;
    public final InputStream _in;
    public int _ptr;

    public MergedStream(IOContext iOContext, InputStream inputStream, byte[] bArr, int i, int i2) {
        this._ctxt = iOContext;
        this._in = inputStream;
        this.f623_b = bArr;
        this._ptr = i;
        this._end = i2;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        if (this.f623_b != null) {
            return this._end - this._ptr;
        }
        return this._in.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        _free();
        this._in.close();
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i) {
        if (this.f623_b == null) {
            this._in.mark(i);
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f623_b == null && this._in.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        byte[] bArr = this.f623_b;
        if (bArr != null) {
            int i = this._ptr;
            int i2 = i + 1;
            this._ptr = i2;
            int i3 = bArr[i] & 255;
            if (i2 >= this._end) {
                _free();
            }
            return i3;
        }
        return this._in.read();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2 = this.f623_b;
        if (bArr2 != null) {
            int i3 = this._end;
            int i4 = this._ptr;
            int i5 = i3 - i4;
            if (i2 > i5) {
                i2 = i5;
            }
            System.arraycopy(bArr2, i4, bArr, i, i2);
            int i6 = this._ptr + i2;
            this._ptr = i6;
            if (i6 >= this._end) {
                _free();
            }
            return i2;
        }
        return this._in.read(bArr, i, i2);
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        if (this.f623_b == null) {
            this._in.reset();
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        long j2;
        if (this.f623_b != null) {
            int i = this._end;
            int i2 = this._ptr;
            j2 = i - i2;
            if (j2 > j) {
                this._ptr = i2 + ((int) j);
                return j;
            }
            _free();
            j -= j2;
        } else {
            j2 = 0;
        }
        return j > 0 ? j2 + this._in.skip(j) : j2;
    }

    public final void _free() {
        byte[] bArr = this.f623_b;
        if (bArr != null) {
            this.f623_b = null;
            IOContext iOContext = this._ctxt;
            if (iOContext != null) {
                iOContext.releaseReadIOBuffer(bArr);
            }
        }
    }
}
