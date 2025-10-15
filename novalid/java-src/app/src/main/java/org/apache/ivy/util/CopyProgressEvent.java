package org.apache.ivy.util;

/* loaded from: classes8.dex */
public class CopyProgressEvent {
    public byte[] buffer;
    public int readBytes;
    public long totalReadBytes;

    public CopyProgressEvent() {
    }

    public CopyProgressEvent(byte[] bArr, int i, long j) {
        update(bArr, i, j);
    }

    public CopyProgressEvent(byte[] bArr, long j) {
        update(bArr, 0, j);
    }

    public CopyProgressEvent update(byte[] bArr, int i, long j) {
        this.buffer = bArr;
        this.readBytes = i;
        this.totalReadBytes = j;
        return this;
    }

    public long getTotalReadBytes() {
        return this.totalReadBytes;
    }

    public byte[] getBuffer() {
        return this.buffer;
    }

    public int getReadBytes() {
        return this.readBytes;
    }
}
