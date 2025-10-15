package com.sdkit.paylib.paylibsdk.client.p041di;

import com.sdkit.paylib.paylibdomain.api.p027di.PaylibDomainTools;
import com.sdkit.paylib.payliblogging.api.p029di.PaylibLoggingTools;
import com.sdkit.paylib.paylibnative.api.p031di.PaylibNativeTools;
import com.sdkit.paylib.paylibnative.p033ui.p034di.PaylibNativePayMethodsDependencies;
import com.sdkit.paylib.paylibnetwork.api.p035di.PaylibNetworkTools;
import com.sdkit.paylib.paylibpayment.api.p037di.PaylibPaymentTools;
import com.sdkit.paylib.paylibplatform.api.p039di.PaylibPlatformTools;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibsdk.client.di.f */
/* loaded from: classes5.dex */
public final class C8599f implements Factory {

    /* renamed from: a */
    public final C8596c f5850a;

    /* renamed from: b */
    public final Provider f5851b;

    /* renamed from: c */
    public final Provider f5852c;

    /* renamed from: d */
    public final Provider f5853d;

    /* renamed from: e */
    public final Provider f5854e;

    /* renamed from: f */
    public final Provider f5855f;

    /* renamed from: g */
    public final Provider f5856g;

    public C8599f(C8596c c8596c, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f5850a = c8596c;
        this.f5851b = provider;
        this.f5852c = provider2;
        this.f5853d = provider3;
        this.f5854e = provider4;
        this.f5855f = provider5;
        this.f5856g = provider6;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public PaylibNativeTools get() {
        return m4691a(this.f5850a, (PaylibNativePayMethodsDependencies) this.f5851b.get(), (PaylibDomainTools) this.f5852c.get(), (PaylibLoggingTools) this.f5853d.get(), (PaylibNetworkTools) this.f5854e.get(), (PaylibPaymentTools) this.f5855f.get(), (PaylibPlatformTools) this.f5856g.get());
    }

    /* renamed from: a */
    public static PaylibNativeTools m4691a(C8596c c8596c, PaylibNativePayMethodsDependencies paylibNativePayMethodsDependencies, PaylibDomainTools paylibDomainTools, PaylibLoggingTools paylibLoggingTools, PaylibNetworkTools paylibNetworkTools, PaylibPaymentTools paylibPaymentTools, PaylibPlatformTools paylibPlatformTools) {
        return (PaylibNativeTools) Preconditions.checkNotNullFromProvides(c8596c.m4681a(paylibNativePayMethodsDependencies, paylibDomainTools, paylibLoggingTools, paylibNetworkTools, paylibPaymentTools, paylibPlatformTools));
    }

    /* renamed from: a */
    public static C8599f m4692a(C8596c c8596c, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        return new C8599f(c8596c, provider, provider2, provider3, provider4, provider5, provider6);
    }
}
