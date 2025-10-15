package org.apache.commons.p059io.input;

import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class CloseShieldInputStream extends ProxyInputStream {
    public static CloseShieldInputStream wrap(InputStream inputStream) {
        return new CloseShieldInputStream(inputStream);
    }

    @Deprecated
    public CloseShieldInputStream(InputStream inputStream) {
        super(inputStream);
    }

    @Override // org.apache.commons.p059io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ((FilterInputStream) this).in = ClosedInputStream.CLOSED_INPUT_STREAM;
    }
}
