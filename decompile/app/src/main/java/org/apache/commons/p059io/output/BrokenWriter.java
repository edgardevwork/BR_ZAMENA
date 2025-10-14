package org.apache.commons.p059io.output;

import java.io.IOException;
import java.io.Writer;

/* loaded from: classes6.dex */
public class BrokenWriter extends Writer {
    public final IOException exception;

    public BrokenWriter(IOException iOException) {
        this.exception = iOException;
    }

    public BrokenWriter() {
        this(new IOException("Broken writer"));
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) throws IOException {
        throw this.exception;
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        throw this.exception;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        throw this.exception;
    }
}
