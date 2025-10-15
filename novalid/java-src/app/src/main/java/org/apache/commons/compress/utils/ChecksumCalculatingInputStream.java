package org.apache.commons.compress.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.zip.Checksum;

/* loaded from: classes8.dex */
public class ChecksumCalculatingInputStream extends InputStream {
    public final Checksum checksum;

    /* renamed from: in */
    public final InputStream f9886in;

    public ChecksumCalculatingInputStream(Checksum checksum, InputStream inputStream) {
        Objects.requireNonNull(checksum, "checksum");
        Objects.requireNonNull(inputStream, "in");
        this.checksum = checksum;
        this.f9886in = inputStream;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int i = this.f9886in.read();
        if (i >= 0) {
            this.checksum.update(i);
        }
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
        int i3 = this.f9886in.read(bArr, i, i2);
        if (i3 >= 0) {
            this.checksum.update(bArr, i, i3);
        }
        return i3;
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        return read() >= 0 ? 1L : 0L;
    }

    public long getValue() {
        return this.checksum.getValue();
    }
}
