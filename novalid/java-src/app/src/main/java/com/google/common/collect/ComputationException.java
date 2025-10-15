package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import javax.annotation.CheckForNull;

@GwtCompatible
@ElementTypesAreNonnullByDefault
@Deprecated
/* loaded from: classes7.dex */
public class ComputationException extends RuntimeException {
    public static final long serialVersionUID = 0;

    public ComputationException(@CheckForNull Throwable cause) {
        super(cause);
    }
}
