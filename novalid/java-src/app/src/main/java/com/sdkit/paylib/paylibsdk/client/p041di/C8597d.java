package com.sdkit.paylib.paylibsdk.client.p041di;

import com.sdkit.paylib.paylibdomain.api.p027di.PaylibDomainTools;
import com.sdkit.paylib.paylibdomain.impl.p028di.PaylibDomainDependencies;
import com.sdkit.paylib.payliblogging.api.p029di.PaylibLoggingTools;
import com.sdkit.paylib.paylibpayment.api.p037di.PaylibPaymentTools;
import com.sdkit.paylib.paylibplatform.api.p039di.PaylibPlatformTools;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibsdk.client.di.d */
/* loaded from: classes5.dex */
public final class C8597d implements Factory {

    /* renamed from: a */
    public final C8596c f5843a;

    /* renamed from: b */
    public final Provider f5844b;

    /* renamed from: c */
    public final Provider f5845c;

    /* renamed from: d */
    public final Provider f5846d;

    /* renamed from: e */
    public final Provider f5847e;

    public C8597d(C8596c c8596c, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f5843a = c8596c;
        this.f5844b = provider;
        this.f5845c = provider2;
        this.f5846d = provider3;
        this.f5847e = provider4;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public PaylibDomainTools get() {
        return m4685a(this.f5843a, (PaylibDomainDependencies) this.f5844b.get(), (PaylibLoggingTools) this.f5845c.get(), (PaylibPaymentTools) this.f5846d.get(), (PaylibPlatformTools) this.f5847e.get());
    }

    /* renamed from: a */
    public static PaylibDomainTools m4685a(C8596c c8596c, PaylibDomainDependencies paylibDomainDependencies, PaylibLoggingTools paylibLoggingTools, PaylibPaymentTools paylibPaymentTools, PaylibPlatformTools paylibPlatformTools) {
        return (PaylibDomainTools) Preconditions.checkNotNullFromProvides(c8596c.m4679a(paylibDomainDependencies, paylibLoggingTools, paylibPaymentTools, paylibPlatformTools));
    }

    /* renamed from: a */
    public static C8597d m4686a(C8596c c8596c, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new C8597d(c8596c, provider, provider2, provider3, provider4);
    }
}
