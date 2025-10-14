package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.sm */
/* loaded from: classes6.dex */
public final class C9863sm implements TempCacheStorage {

    /* renamed from: a */
    public final TempCacheStorage f9056a;

    public C9863sm(@NotNull Context context, @NotNull EnumC9316Wl enumC9316Wl, @NotNull TempCacheStorage tempCacheStorage) {
        this.f9056a = tempCacheStorage;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    @Nullable
    public final TempCacheStorage.Entry get(@NotNull String str) {
        return this.f9056a.get(str);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final long put(@NotNull String str, long j, @NotNull byte[] bArr) {
        return this.f9056a.put(str, j, bArr);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final void remove(long j) {
        this.f9056a.remove(j);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final void removeOlderThan(@NotNull String str, long j) {
        this.f9056a.removeOlderThan(str, j);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    @NotNull
    public final Collection<TempCacheStorage.Entry> get(@NotNull String str, int i) {
        return this.f9056a.get(str, i);
    }
}
