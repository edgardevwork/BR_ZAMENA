package org.apache.commons.compress.compressors.gzip;

/* loaded from: classes6.dex */
public class GzipParameters {
    public String comment;
    public String filename;
    public long modificationTime;
    public int compressionLevel = -1;
    public int operatingSystem = 255;
    public int bufferSize = 512;

    public int getCompressionLevel() {
        return this.compressionLevel;
    }

    public void setCompressionLevel(int i) {
        if (i < -1 || i > 9) {
            throw new IllegalArgumentException("Invalid gzip compression level: " + i);
        }
        this.compressionLevel = i;
    }

    public long getModificationTime() {
        return this.modificationTime;
    }

    public void setModificationTime(long j) {
        this.modificationTime = j;
    }

    public String getFilename() {
        return this.filename;
    }

    public void setFilename(String str) {
        this.filename = str;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String str) {
        this.comment = str;
    }

    public int getOperatingSystem() {
        return this.operatingSystem;
    }

    public void setOperatingSystem(int i) {
        this.operatingSystem = i;
    }

    public int getBufferSize() {
        return this.bufferSize;
    }

    public void setBufferSize(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("invalid buffer size: " + i);
        }
        this.bufferSize = i;
    }
}
