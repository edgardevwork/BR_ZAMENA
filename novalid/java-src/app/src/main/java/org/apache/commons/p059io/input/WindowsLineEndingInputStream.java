package org.apache.commons.p059io.input;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes6.dex */
public class WindowsLineEndingInputStream extends InputStream {
    public final boolean ensureLineFeedAtEndOfFile;
    public boolean eofSeen;
    public boolean injectSlashN;
    public boolean slashNSeen;
    public boolean slashRSeen;
    public final InputStream target;

    public WindowsLineEndingInputStream(InputStream inputStream, boolean z) {
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
        this.slashRSeen = i == 13;
        this.slashNSeen = i == 10;
        return i;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.eofSeen) {
            return eofGame();
        }
        if (this.injectSlashN) {
            this.injectSlashN = false;
            return 10;
        }
        boolean z = this.slashRSeen;
        int withUpdate = readWithUpdate();
        if (this.eofSeen) {
            return eofGame();
        }
        if (withUpdate != 10 || z) {
            return withUpdate;
        }
        this.injectSlashN = true;
        return 13;
    }

    public final int eofGame() {
        if (!this.ensureLineFeedAtEndOfFile) {
            return -1;
        }
        boolean z = this.slashNSeen;
        if (!z && !this.slashRSeen) {
            this.slashRSeen = true;
            return 13;
        }
        if (z) {
            return -1;
        }
        this.slashRSeen = false;
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
