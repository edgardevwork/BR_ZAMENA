package org.apache.commons.compress.archivers;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public abstract class ArchiveInputStream extends InputStream {
    public static final int BYTE_MASK = 255;
    public long bytesRead;
    public final byte[] single = new byte[1];

    public boolean canReadEntryData(ArchiveEntry archiveEntry) {
        return true;
    }

    public abstract ArchiveEntry getNextEntry() throws IOException;

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.single, 0, 1) == -1) {
            return -1;
        }
        return this.single[0] & 255;
    }

    public void count(int i) {
        count(i);
    }

    public void count(long j) {
        if (j != -1) {
            this.bytesRead += j;
        }
    }

    public void pushedBackBytes(long j) {
        this.bytesRead -= j;
    }

    @Deprecated
    public int getCount() {
        return (int) this.bytesRead;
    }

    public long getBytesRead() {
        return this.bytesRead;
    }
}
