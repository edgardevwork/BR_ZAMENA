package org.apache.commons.compress.archivers.dump;

/* loaded from: classes8.dex */
public class ShortFileException extends DumpArchiveException {
    public static final long serialVersionUID = 1;

    public ShortFileException() {
        super("unexpected EOF");
    }
}
