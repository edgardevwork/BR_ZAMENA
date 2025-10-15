package org.apache.commons.p059io.output;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* loaded from: classes5.dex */
public class CloseShieldOutputStream extends ProxyOutputStream {
    public static CloseShieldOutputStream wrap(OutputStream outputStream) {
        return new CloseShieldOutputStream(outputStream);
    }

    @Deprecated
    public CloseShieldOutputStream(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // org.apache.commons.p059io.output.ProxyOutputStream, java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ((FilterOutputStream) this).out = ClosedOutputStream.CLOSED_OUTPUT_STREAM;
    }
}
