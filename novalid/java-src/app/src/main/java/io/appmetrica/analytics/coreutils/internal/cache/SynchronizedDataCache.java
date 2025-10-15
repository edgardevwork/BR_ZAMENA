package io.appmetrica.analytics.coreutils.internal.cache;

import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes8.dex */
public abstract class SynchronizedDataCache<T> extends DataCache<T> {
    public SynchronizedDataCache(long j, long j2, @NonNull String str) {
        super(j, j2, str);
    }

    @Override // io.appmetrica.analytics.coreutils.internal.cache.DataCache
    @Nullable
    public synchronized T getData() {
        return (T) super.getData();
    }

    @Override // io.appmetrica.analytics.coreutils.internal.cache.DataCache, io.appmetrica.analytics.coreapi.internal.cache.UpdateConditionsChecker
    @AnyThread
    public synchronized boolean shouldUpdate() {
        return super.shouldUpdate();
    }

    @Override // io.appmetrica.analytics.coreutils.internal.cache.DataCache
    public synchronized void updateData(@NonNull T t) {
        super.updateData(t);
    }
}
