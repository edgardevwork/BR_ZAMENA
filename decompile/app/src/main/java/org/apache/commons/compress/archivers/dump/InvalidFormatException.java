package org.apache.commons.compress.archivers.dump;

/* loaded from: classes8.dex */
public class InvalidFormatException extends DumpArchiveException {
    public static final long serialVersionUID = 1;
    public long offset;

    public InvalidFormatException() {
        super("there was an error decoding a tape segment");
    }

    public InvalidFormatException(long j) {
        super("there was an error decoding a tape segment header at offset " + j + ".");
        this.offset = j;
    }

    public long getOffset() {
        return this.offset;
    }
}
