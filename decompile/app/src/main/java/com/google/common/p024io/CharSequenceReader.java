package com.google.common.p024io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.Objects;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
/* loaded from: classes7.dex */
public final class CharSequenceReader extends Reader {
    public int mark;
    public int pos;

    @CheckForNull
    public CharSequence seq;

    @Override // java.io.Reader
    public boolean markSupported() {
        return true;
    }

    public CharSequenceReader(CharSequence seq) {
        this.seq = (CharSequence) Preconditions.checkNotNull(seq);
    }

    public final void checkOpen() throws IOException {
        if (this.seq == null) {
            throw new IOException("reader closed");
        }
    }

    public final boolean hasRemaining() {
        return remaining() > 0;
    }

    public final int remaining() {
        Objects.requireNonNull(this.seq);
        return this.seq.length() - this.pos;
    }

    @Override // java.io.Reader, java.lang.Readable
    public synchronized int read(CharBuffer target) throws IOException {
        Preconditions.checkNotNull(target);
        checkOpen();
        Objects.requireNonNull(this.seq);
        if (!hasRemaining()) {
            return -1;
        }
        int iMin = Math.min(target.remaining(), remaining());
        for (int i = 0; i < iMin; i++) {
            CharSequence charSequence = this.seq;
            int i2 = this.pos;
            this.pos = i2 + 1;
            target.put(charSequence.charAt(i2));
        }
        return iMin;
    }

    @Override // java.io.Reader
    public synchronized int read() throws IOException {
        char cCharAt;
        checkOpen();
        Objects.requireNonNull(this.seq);
        if (hasRemaining()) {
            CharSequence charSequence = this.seq;
            int i = this.pos;
            this.pos = i + 1;
            cCharAt = charSequence.charAt(i);
        } else {
            cCharAt = 65535;
        }
        return cCharAt;
    }

    @Override // java.io.Reader
    public synchronized int read(char[] cbuf, int off, int len) throws IOException {
        Preconditions.checkPositionIndexes(off, off + len, cbuf.length);
        checkOpen();
        Objects.requireNonNull(this.seq);
        if (!hasRemaining()) {
            return -1;
        }
        int iMin = Math.min(len, remaining());
        for (int i = 0; i < iMin; i++) {
            CharSequence charSequence = this.seq;
            int i2 = this.pos;
            this.pos = i2 + 1;
            cbuf[off + i] = charSequence.charAt(i2);
        }
        return iMin;
    }

    @Override // java.io.Reader
    public synchronized long skip(long n) throws IOException {
        int iMin;
        Preconditions.checkArgument(n >= 0, "n (%s) may not be negative", n);
        checkOpen();
        iMin = (int) Math.min(remaining(), n);
        this.pos += iMin;
        return iMin;
    }

    @Override // java.io.Reader
    public synchronized boolean ready() throws IOException {
        checkOpen();
        return true;
    }

    @Override // java.io.Reader
    public synchronized void mark(int readAheadLimit) throws IOException {
        Preconditions.checkArgument(readAheadLimit >= 0, "readAheadLimit (%s) may not be negative", readAheadLimit);
        checkOpen();
        this.mark = this.pos;
    }

    @Override // java.io.Reader
    public synchronized void reset() throws IOException {
        checkOpen();
        this.pos = this.mark;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.seq = null;
    }
}
