package org.apache.commons.p059io.input;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class AutoCloseInputStream extends ProxyInputStream {
    public AutoCloseInputStream(InputStream inputStream) {
        super(inputStream);
    }

    @Override // org.apache.commons.p059io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ((FilterInputStream) this).in.close();
        ((FilterInputStream) this).in = ClosedInputStream.CLOSED_INPUT_STREAM;
    }

    @Override // org.apache.commons.p059io.input.ProxyInputStream
    public void afterRead(int i) throws IOException {
        if (i == -1) {
            close();
        }
    }

    public void finalize() throws Throwable {
        close();
        super.finalize();
    }
}
