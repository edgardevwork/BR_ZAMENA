package io.reactivex.rxjava3.flowables;

import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.core.Flowable;

/* loaded from: classes6.dex */
public abstract class GroupedFlowable<K, T> extends Flowable<T> {
    public final K key;

    public GroupedFlowable(@Nullable K key) {
        this.key = key;
    }

    @Nullable
    public K getKey() {
        return this.key;
    }
}
