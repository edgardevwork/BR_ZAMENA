package org.apache.commons.p059io.input;

import java.io.IOException;
import java.io.Reader;

/* loaded from: classes6.dex */
public class ClosedReader extends Reader {
    public static final ClosedReader CLOSED_READER = new ClosedReader();

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) {
        return -1;
    }
}
