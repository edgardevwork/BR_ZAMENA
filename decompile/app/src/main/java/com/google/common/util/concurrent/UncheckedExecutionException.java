package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes6.dex */
public class UncheckedExecutionException extends RuntimeException {
    public static final long serialVersionUID = 0;

    public UncheckedExecutionException() {
    }

    public UncheckedExecutionException(@CheckForNull String message) {
        super(message);
    }

    public UncheckedExecutionException(@CheckForNull String message, @CheckForNull Throwable cause) {
        super(message, cause);
    }

    public UncheckedExecutionException(@CheckForNull Throwable cause) {
        super(cause);
    }
}
