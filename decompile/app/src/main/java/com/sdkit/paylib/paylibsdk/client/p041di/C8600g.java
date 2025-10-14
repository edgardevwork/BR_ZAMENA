package com.sdkit.paylib.paylibsdk.client.p041di;

import com.sdkit.paylib.payliblogging.api.p029di.PaylibLoggingTools;
import com.sdkit.paylib.paylibnetwork.api.p035di.PaylibNetworkTools;
import com.sdkit.paylib.paylibplatform.api.p039di.PaylibPlatformTools;
import com.sdkit.paylib.paylibsdk.client.p041di.utils.InterfaceC8604b;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibsdk.client.di.g */
/* loaded from: classes5.dex */
public final class C8600g implements Factory {

    /* renamed from: a */
    public final C8596c f5857a;

    /* renamed from: b */
    public final Provider f5858b;

    /* renamed from: c */
    public final Provider f5859c;

    /* renamed from: d */
    public final Provider f5860d;

    public C8600g(C8596c c8596c, Provider provider, Provider provider2, Provider provider3) {
        this.f5857a = c8596c;
        this.f5858b = provider;
        this.f5859c = provider2;
        this.f5860d = provider3;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public PaylibNetworkTools get() {
        return m4694a(this.f5857a, (InterfaceC8604b) this.f5858b.get(), (PaylibLoggingTools) this.f5859c.get(), (PaylibPlatformTools) this.f5860d.get());
    }

    /* renamed from: a */
    public static PaylibNetworkTools m4694a(C8596c c8596c, InterfaceC8604b interfaceC8604b, PaylibLoggingTools paylibLoggingTools, PaylibPlatformTools paylibPlatformTools) {
        return (PaylibNetworkTools) Preconditions.checkNotNullFromProvides(c8596c.m4682a(interfaceC8604b, paylibLoggingTools, paylibPlatformTools));
    }

    /* renamed from: a */
    public static C8600g m4695a(C8596c c8596c, Provider provider, Provider provider2, Provider provider3) {
        return new C8600g(c8596c, provider, provider2, provider3);
    }
}
