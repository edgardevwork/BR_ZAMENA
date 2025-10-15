package org.apache.commons.compress.archivers.dump;

/* loaded from: classes8.dex */
public class UnrecognizedFormatException extends DumpArchiveException {
    public static final long serialVersionUID = 1;

    public UnrecognizedFormatException() {
        super("this is not a recognized format.");
    }
}
