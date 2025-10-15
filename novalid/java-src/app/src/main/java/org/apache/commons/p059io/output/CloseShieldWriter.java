package org.apache.commons.p059io.output;

import java.io.FilterWriter;
import java.io.Writer;

/* loaded from: classes5.dex */
public class CloseShieldWriter extends ProxyWriter {
    public static CloseShieldWriter wrap(Writer writer) {
        return new CloseShieldWriter(writer);
    }

    @Deprecated
    public CloseShieldWriter(Writer writer) {
        super(writer);
    }

    @Override // org.apache.commons.p059io.output.ProxyWriter, java.io.FilterWriter, java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ((FilterWriter) this).out = ClosedWriter.CLOSED_WRITER;
    }
}
