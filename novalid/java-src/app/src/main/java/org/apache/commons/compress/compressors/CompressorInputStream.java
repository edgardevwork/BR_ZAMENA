package org.apache.commons.compress.compressors;

import java.io.InputStream;

/* loaded from: classes6.dex */
public abstract class CompressorInputStream extends InputStream {
    public long bytesRead;

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

    public long getUncompressedCount() {
        return getBytesRead();
    }
}
