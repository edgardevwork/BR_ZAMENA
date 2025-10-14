package org.apache.commons.compress.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.Checksum;

/* loaded from: classes8.dex */
public class ChecksumVerifyingInputStream extends InputStream {
    public long bytesRemaining;
    public final Checksum checksum;
    public final long expectedChecksum;

    /* renamed from: in */
    public final InputStream f9887in;

    public ChecksumVerifyingInputStream(Checksum checksum, InputStream inputStream, long j, long j2) {
        this.checksum = checksum;
        this.f9887in = inputStream;
        this.expectedChecksum = j2;
        this.bytesRemaining = j;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f9887in.close();
    }

    public long getBytesRemaining() {
        return this.bytesRemaining;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.bytesRemaining <= 0) {
            return -1;
        }
        int i = this.f9887in.read();
        if (i >= 0) {
            this.checksum.update(i);
            this.bytesRemaining--;
        }
        verify();
        return i;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f9887in.read(bArr, i, i2);
        if (i3 >= 0) {
            this.checksum.update(bArr, i, i3);
            this.bytesRemaining -= i3;
        }
        verify();
        return i3;
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        return read() >= 0 ? 1L : 0L;
    }

    public final void verify() throws IOException {
        if (this.bytesRemaining <= 0 && this.expectedChecksum != this.checksum.getValue()) {
            throw new IOException("Checksum verification failed");
        }
    }
}
