package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.p046io.IExecutionPolicy;
import io.appmetrica.analytics.coreapi.internal.p046io.SslSocketFactoryProvider;
import io.appmetrica.analytics.modulesapi.internal.network.SimpleNetworkApi;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.od */
/* loaded from: classes6.dex */
public final class C9754od implements ServiceNetworkContext {

    /* renamed from: a */
    public final C9925v9 f8835a;

    /* renamed from: b */
    public final String f8836b = new C9439bn().m5926a();

    /* renamed from: c */
    public final C9961wk f8837c = new C9961wk();

    public C9754od(@NotNull Context context) {
        this.f8835a = new C9925v9(context);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext
    @NotNull
    public final IExecutionPolicy getExecutionPolicy() {
        return this.f8835a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext
    @NotNull
    public final SimpleNetworkApi getNetworkApi() {
        return this.f8837c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext
    @NotNull
    public final SslSocketFactoryProvider getSslSocketFactoryProvider() {
        return C9676la.f8552C.m6387x();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext
    @NotNull
    public final String getUserAgent() {
        return this.f8836b;
    }
}
