package io.appmetrica.analytics.coreapi.internal.data;

import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public interface ProtobufStateStorage<T> {
    void delete();

    @NonNull
    T read();

    void save(@NonNull T t);
}
