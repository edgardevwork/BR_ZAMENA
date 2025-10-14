package org.apache.commons.compress.archivers;

/* loaded from: classes5.dex */
public class ArchiveException extends Exception {
    public static final long serialVersionUID = 2772690708123267100L;

    public ArchiveException(String str) {
        super(str);
    }

    public ArchiveException(String str, Exception exc) {
        super(str);
        initCause(exc);
    }
}
