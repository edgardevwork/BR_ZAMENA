package org.apache.commons.p059io;

import java.io.IOException;

/* loaded from: classes8.dex */
public class IOIndexedException extends IOException {
    public static final long serialVersionUID = 1;
    public final int index;

    public IOIndexedException(int i, Throwable th) {
        super(toMessage(i, th), th);
        this.index = i;
    }

    public static String toMessage(int i, Throwable th) {
        String message = "Null";
        String simpleName = th == null ? "Null" : th.getClass().getSimpleName();
        if (th != null) {
            message = th.getMessage();
        }
        return String.format("%s #%,d: %s", simpleName, Integer.valueOf(i), message);
    }

    public int getIndex() {
        return this.index;
    }
}
