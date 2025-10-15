package org.apache.commons.p059io.input;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class MarkShieldInputStream extends ProxyInputStream {
    @Override // org.apache.commons.p059io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
    }

    @Override // org.apache.commons.p059io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    public MarkShieldInputStream(InputStream inputStream) {
        super(inputStream);
    }

    @Override // org.apache.commons.p059io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        throw UnsupportedOperationExceptions.reset();
    }
}
