package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.network.NetworkClientWithCacheControl;
import io.appmetrica.analytics.networktasks.internal.CacheControlHttpsConnectionPerformer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.w3 */
/* loaded from: classes5.dex */
public final class C9944w3 implements CacheControlHttpsConnectionPerformer.Client {

    /* renamed from: a */
    public final NetworkClientWithCacheControl f9248a;

    public C9944w3(@NotNull NetworkClientWithCacheControl networkClientWithCacheControl) {
        this.f9248a = networkClientWithCacheControl;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.CacheControlHttpsConnectionPerformer.Client
    @Nullable
    public final String getOldETag() {
        return this.f9248a.getETag();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.CacheControlHttpsConnectionPerformer.Client
    public final void onError() {
        this.f9248a.onError();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.CacheControlHttpsConnectionPerformer.Client
    public final void onNotModified() {
        this.f9248a.onNotModified();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.CacheControlHttpsConnectionPerformer.Client
    public final void onResponse(@NotNull String str, @NotNull byte[] bArr) {
        this.f9248a.onResponse(str, bArr);
    }
}
