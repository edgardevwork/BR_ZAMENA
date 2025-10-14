package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes5.dex */
public class ExecutionError extends Error {
    public static final long serialVersionUID = 0;

    public ExecutionError() {
    }

    public ExecutionError(@CheckForNull String message) {
        super(message);
    }

    public ExecutionError(@CheckForNull String message, @CheckForNull Error cause) {
        super(message, cause);
    }

    public ExecutionError(@CheckForNull Error cause) {
        super(cause);
    }
}
