package org.apache.commons.compress.archivers.dump;

import java.io.IOException;

/* loaded from: classes5.dex */
public class DumpArchiveException extends IOException {
    public static final long serialVersionUID = 1;

    public DumpArchiveException() {
    }

    public DumpArchiveException(String str) {
        super(str);
    }

    public DumpArchiveException(Throwable th) {
        initCause(th);
    }

    public DumpArchiveException(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
