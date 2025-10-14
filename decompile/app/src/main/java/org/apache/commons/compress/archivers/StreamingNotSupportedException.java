package org.apache.commons.compress.archivers;

/* loaded from: classes8.dex */
public class StreamingNotSupportedException extends ArchiveException {
    public static final long serialVersionUID = 1;
    public final String format;

    public StreamingNotSupportedException(String str) {
        super("The " + str + " doesn't support streaming.");
        this.format = str;
    }

    public String getFormat() {
        return this.format;
    }
}
