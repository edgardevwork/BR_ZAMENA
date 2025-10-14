package org.apache.commons.compress.compressors.snappy;

/* loaded from: classes6.dex */
public enum FramedSnappyDialect {
    STANDARD(true, true),
    IWORK_ARCHIVE(false, false);

    public final boolean checksumWithCompressedChunks;
    public final boolean streamIdentifier;

    FramedSnappyDialect(boolean z, boolean z2) {
        this.streamIdentifier = z;
        this.checksumWithCompressedChunks = z2;
    }

    public boolean hasStreamIdentifier() {
        return this.streamIdentifier;
    }

    public boolean usesChecksumWithCompressedChunks() {
        return this.checksumWithCompressedChunks;
    }
}
