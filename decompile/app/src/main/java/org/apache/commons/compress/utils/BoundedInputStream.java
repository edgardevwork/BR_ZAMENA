package org.apache.commons.compress.utils;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes8.dex */
public class BoundedInputStream extends InputStream {
    public long bytesRemaining;

    /* renamed from: in */
    public final InputStream f9883in;

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public BoundedInputStream(InputStream inputStream, long j) {
        this.f9883in = inputStream;
        this.bytesRemaining = j;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        long j = this.bytesRemaining;
        if (j <= 0) {
            return -1;
        }
        this.bytesRemaining = j - 1;
        return this.f9883in.read();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.bytesRemaining;
        if (j == 0) {
            return -1;
        }
        if (i2 > j) {
            i2 = (int) j;
        }
        int i3 = this.f9883in.read(bArr, i, i2);
        if (i3 >= 0) {
            this.bytesRemaining -= i3;
        }
        return i3;
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        long jSkip = this.f9883in.skip(Math.min(this.bytesRemaining, j));
        this.bytesRemaining -= jSkip;
        return jSkip;
    }

    public long getBytesRemaining() {
        return this.bytesRemaining;
    }
}
