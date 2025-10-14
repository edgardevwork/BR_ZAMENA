package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import javax.annotation.CheckForNull;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public interface Function<F, T> {
    @ParametricNullness
    T apply(@ParametricNullness F input);

    boolean equals(@CheckForNull Object object);
}
