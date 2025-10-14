package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.network.NetworkClientWithCacheControl;
import io.appmetrica.analytics.modulesapi.internal.network.SimpleNetworkApi;
import io.appmetrica.analytics.networktasks.internal.CacheControlHttpsConnectionPerformer;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.wk */
/* loaded from: classes5.dex */
public final class C9961wk implements SimpleNetworkApi {

    /* renamed from: a */
    public final CacheControlHttpsConnectionPerformer f9277a = new CacheControlHttpsConnectionPerformer(((C8881Ek) C9676la.m6362h().m6387x()).getSslSocketFactory());

    @Override // io.appmetrica.analytics.modulesapi.internal.network.SimpleNetworkApi
    public final void performRequestWithCacheControl(@NotNull String str, @NotNull NetworkClientWithCacheControl networkClientWithCacheControl) {
        this.f9277a.performConnection(str, new C9944w3(networkClientWithCacheControl));
    }
}
