package io.appmetrica.analytics.coreapi.internal.backport;

import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public interface ConsumerWithThrowable<T> {
    void consume(@NonNull T t) throws Throwable;
}
