package com.sdkit.paylib.paylibsdk.client.p041di;

import com.sdkit.paylib.payliblogging.api.p029di.PaylibLoggingTools;
import com.sdkit.paylib.paylibnetwork.api.p035di.PaylibNetworkTools;
import com.sdkit.paylib.paylibpayment.api.p037di.PaylibPaymentTools;
import com.sdkit.paylib.paylibpayment.impl.p038di.PaylibPaymentDependencies;
import com.sdkit.paylib.paylibplatform.api.p039di.PaylibPlatformTools;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibsdk.client.di.h */
/* loaded from: classes5.dex */
public final class C8601h implements Factory {

    /* renamed from: a */
    public final C8596c f5861a;

    /* renamed from: b */
    public final Provider f5862b;

    /* renamed from: c */
    public final Provider f5863c;

    /* renamed from: d */
    public final Provider f5864d;

    /* renamed from: e */
    public final Provider f5865e;

    public C8601h(C8596c c8596c, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f5861a = c8596c;
        this.f5862b = provider;
        this.f5863c = provider2;
        this.f5864d = provider3;
        this.f5865e = provider4;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public PaylibPaymentTools get() {
        return m4697a(this.f5861a, (PaylibPaymentDependencies) this.f5862b.get(), (PaylibNetworkTools) this.f5863c.get(), (PaylibLoggingTools) this.f5864d.get(), (PaylibPlatformTools) this.f5865e.get());
    }

    /* renamed from: a */
    public static PaylibPaymentTools m4697a(C8596c c8596c, PaylibPaymentDependencies paylibPaymentDependencies, PaylibNetworkTools paylibNetworkTools, PaylibLoggingTools paylibLoggingTools, PaylibPlatformTools paylibPlatformTools) {
        return (PaylibPaymentTools) Preconditions.checkNotNullFromProvides(c8596c.m4683a(paylibPaymentDependencies, paylibNetworkTools, paylibLoggingTools, paylibPlatformTools));
    }

    /* renamed from: a */
    public static C8601h m4698a(C8596c c8596c, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new C8601h(c8596c, provider, provider2, provider3, provider4);
    }
}
