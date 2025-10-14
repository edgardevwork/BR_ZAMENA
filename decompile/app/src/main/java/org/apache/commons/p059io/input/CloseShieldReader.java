package org.apache.commons.p059io.input;

import java.io.FilterReader;
import java.io.Reader;

/* loaded from: classes5.dex */
public class CloseShieldReader extends ProxyReader {
    public static CloseShieldReader wrap(Reader reader) {
        return new CloseShieldReader(reader);
    }

    @Deprecated
    public CloseShieldReader(Reader reader) {
        super(reader);
    }

    @Override // org.apache.commons.p059io.input.ProxyReader, java.io.FilterReader, java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ((FilterReader) this).in = ClosedReader.CLOSED_READER;
    }
}
