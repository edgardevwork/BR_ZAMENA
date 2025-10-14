package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import javax.annotation.CheckForNull;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public interface Predicate<T> {
    boolean apply(@ParametricNullness T input);

    boolean equals(@CheckForNull Object object);
}
