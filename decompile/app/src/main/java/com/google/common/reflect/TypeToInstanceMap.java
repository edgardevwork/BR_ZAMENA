package com.google.common.reflect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotMock;
import java.util.Map;
import javax.annotation.CheckForNull;

@DoNotMock("Use ImmutableTypeToInstanceMap or MutableTypeToInstanceMap")
@ElementTypesAreNonnullByDefault
/* loaded from: classes8.dex */
public interface TypeToInstanceMap<B> extends Map<TypeToken<? extends B>, B> {
    @CheckForNull
    <T extends B> T getInstance(TypeToken<T> type);

    @CheckForNull
    <T extends B> T getInstance(Class<T> type);

    @CanIgnoreReturnValue
    @CheckForNull
    <T extends B> T putInstance(TypeToken<T> type, @ParametricNullness T value);

    @CanIgnoreReturnValue
    @CheckForNull
    <T extends B> T putInstance(Class<T> type, @ParametricNullness T value);
}
