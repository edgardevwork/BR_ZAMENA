package org.apache.commons.p059io.input;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes5.dex */
public class TeeInputStream extends ProxyInputStream {
    public final OutputStream branch;
    public final boolean closeBranch;

    public TeeInputStream(InputStream inputStream, OutputStream outputStream) {
        this(inputStream, outputStream, false);
    }

    public TeeInputStream(InputStream inputStream, OutputStream outputStream, boolean z) {
        super(inputStream);
        this.branch = outputStream;
        this.closeBranch = z;
    }

    @Override // org.apache.commons.p059io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            super.close();
        } finally {
            if (this.closeBranch) {
                this.branch.close();
            }
        }
    }

    @Override // org.apache.commons.p059io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i = super.read();
        if (i != -1) {
            this.branch.write(i);
        }
        return i;
    }

    @Override // org.apache.commons.p059io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = super.read(bArr, i, i2);
        if (i3 != -1) {
            this.branch.write(bArr, i, i3);
        }
        return i3;
    }

    @Override // org.apache.commons.p059io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        int i = super.read(bArr);
        if (i != -1) {
            this.branch.write(bArr, 0, i);
        }
        return i;
    }
}
