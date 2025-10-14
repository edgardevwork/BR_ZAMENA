package org.apache.commons.p059io.input;

import java.io.IOException;
import java.io.Reader;

/* loaded from: classes6.dex */
public class BrokenReader extends Reader {
    public final IOException exception;

    public BrokenReader(IOException iOException) {
        this.exception = iOException;
    }

    public BrokenReader() {
        this(new IOException("Broken reader"));
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) throws IOException {
        throw this.exception;
    }

    @Override // java.io.Reader
    public long skip(long j) throws IOException {
        throw this.exception;
    }

    @Override // java.io.Reader
    public boolean ready() throws IOException {
        throw this.exception;
    }

    @Override // java.io.Reader
    public void mark(int i) throws IOException {
        throw this.exception;
    }

    @Override // java.io.Reader
    public synchronized void reset() throws IOException {
        throw this.exception;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        throw this.exception;
    }
}
