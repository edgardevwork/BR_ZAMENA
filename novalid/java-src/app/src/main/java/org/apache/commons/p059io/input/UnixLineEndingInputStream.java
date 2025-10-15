package org.apache.commons.p059io.input;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes6.dex */
public class UnixLineEndingInputStream extends InputStream {
    public final boolean ensureLineFeedAtEndOfFile;
    public boolean eofSeen;
    public boolean slashNSeen;
    public boolean slashRSeen;
    public final InputStream target;

    public UnixLineEndingInputStream(InputStream inputStream, boolean z) {
        this.target = inputStream;
        this.ensureLineFeedAtEndOfFile = z;
    }

    public final int readWithUpdate() throws IOException {
        int i = this.target.read();
        boolean z = i == -1;
        this.eofSeen = z;
        if (z) {
            return i;
        }
        this.slashNSeen = i == 10;
        this.slashRSeen = i == 13;
        return i;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        boolean z = this.slashRSeen;
        if (this.eofSeen) {
            return eofGame(z);
        }
        int withUpdate = readWithUpdate();
        if (this.eofSeen) {
            return eofGame(z);
        }
        if (this.slashRSeen) {
            return 10;
        }
        return (z && this.slashNSeen) ? read() : withUpdate;
    }

    public final int eofGame(boolean z) {
        if (z || !this.ensureLineFeedAtEndOfFile || this.slashNSeen) {
            return -1;
        }
        this.slashNSeen = true;
        return 10;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        this.target.close();
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i) {
        throw UnsupportedOperationExceptions.mark();
    }
}
