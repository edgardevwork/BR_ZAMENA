package org.apache.commons.compress.compressors.deflate;

/* loaded from: classes6.dex */
public class DeflateParameters {
    public static final int MAX_LEVEL = 9;
    public static final int MIN_LEVEL = 0;
    public boolean zlibHeader = true;
    public int compressionLevel = -1;

    public boolean withZlibHeader() {
        return this.zlibHeader;
    }

    public void setWithZlibHeader(boolean z) {
        this.zlibHeader = z;
    }

    public int getCompressionLevel() {
        return this.compressionLevel;
    }

    public void setCompressionLevel(int i) {
        if (i < 0 || i > 9) {
            throw new IllegalArgumentException("Invalid Deflate compression level: " + i);
        }
        this.compressionLevel = i;
    }
}
