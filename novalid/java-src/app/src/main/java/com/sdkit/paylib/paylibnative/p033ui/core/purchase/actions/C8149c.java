package com.sdkit.paylib.paylibnative.p033ui.core.purchase.actions;

import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibnative.p033ui.core.purchase.domain.C8153a;
import com.sdkit.paylib.paylibpayment.api.network.applications.ApplicationsNetworkClient;
import com.sdkit.paylib.paylibpayment.api.network.purchases.PurchasesNetworkClient;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.core.purchase.actions.c */
/* loaded from: classes6.dex */
public final class C8149c implements Factory {

    /* renamed from: a */
    public final Provider f2023a;

    /* renamed from: b */
    public final Provider f2024b;

    /* renamed from: c */
    public final Provider f2025c;

    /* renamed from: d */
    public final Provider f2026d;

    public C8149c(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f2023a = provider;
        this.f2024b = provider2;
        this.f2025c = provider3;
        this.f2026d = provider4;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8148b get() {
        return m2059a((C8153a) this.f2023a.get(), (PurchasesNetworkClient) this.f2024b.get(), (ApplicationsNetworkClient) this.f2025c.get(), (PaylibLoggerFactory) this.f2026d.get());
    }

    /* renamed from: a */
    public static C8148b m2059a(C8153a c8153a, PurchasesNetworkClient purchasesNetworkClient, ApplicationsNetworkClient applicationsNetworkClient, PaylibLoggerFactory paylibLoggerFactory) {
        return new C8148b(c8153a, purchasesNetworkClient, applicationsNetworkClient, paylibLoggerFactory);
    }

    /* renamed from: a */
    public static C8149c m2060a(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new C8149c(provider, provider2, provider3, provider4);
    }
}
