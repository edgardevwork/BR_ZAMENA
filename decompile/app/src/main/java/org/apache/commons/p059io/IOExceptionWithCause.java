package org.apache.commons.p059io;

import java.io.IOException;

@Deprecated
/* loaded from: classes8.dex */
public class IOExceptionWithCause extends IOException {
    public static final long serialVersionUID = 1;

    public IOExceptionWithCause(String str, Throwable th) {
        super(str, th);
    }

    public IOExceptionWithCause(Throwable th) {
        super(th);
    }
}
