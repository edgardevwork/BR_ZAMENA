package io.reactivex.rxjava3.operators;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.annotations.Nullable;

/* loaded from: classes7.dex */
public interface SimpleQueue<T> {
    void clear();

    boolean isEmpty();

    boolean offer(@NonNull T value);

    boolean offer(@NonNull T v1, @NonNull T v2);

    @Nullable
    T poll() throws Throwable;
}
