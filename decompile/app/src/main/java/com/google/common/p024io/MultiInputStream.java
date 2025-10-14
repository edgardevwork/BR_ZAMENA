package com.google.common.p024io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
/* loaded from: classes7.dex */
public final class MultiInputStream extends InputStream {

    /* renamed from: in */
    @CheckForNull
    public InputStream f858in;

    /* renamed from: it */
    public Iterator<? extends ByteSource> f859it;

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    public MultiInputStream(Iterator<? extends ByteSource> it) throws IOException {
        this.f859it = (Iterator) Preconditions.checkNotNull(it);
        advance();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.f858in;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.f858in = null;
            }
        }
    }

    public final void advance() throws IOException {
        close();
        if (this.f859it.hasNext()) {
            this.f858in = this.f859it.next().openStream();
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        InputStream inputStream = this.f858in;
        if (inputStream == null) {
            return 0;
        }
        return inputStream.available();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        while (true) {
            InputStream inputStream = this.f858in;
            if (inputStream == null) {
                return -1;
            }
            int i = inputStream.read();
            if (i != -1) {
                return i;
            }
            advance();
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] b, int off, int len) throws IOException {
        Preconditions.checkNotNull(b);
        while (true) {
            InputStream inputStream = this.f858in;
            if (inputStream == null) {
                return -1;
            }
            int i = inputStream.read(b, off, len);
            if (i != -1) {
                return i;
            }
            advance();
        }
    }

    @Override // java.io.InputStream
    public long skip(long n) throws IOException {
        InputStream inputStream = this.f858in;
        if (inputStream == null || n <= 0) {
            return 0L;
        }
        long jSkip = inputStream.skip(n);
        if (jSkip != 0) {
            return jSkip;
        }
        if (read() == -1) {
            return 0L;
        }
        return this.f858in.skip(n - 1) + 1;
    }
}
