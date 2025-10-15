package com.sdkit.paylib.paylibnative.p033ui.core.purchase.actions;

import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibnative.p033ui.core.purchase.domain.InterfaceC8155c;
import com.sdkit.paylib.paylibpayment.api.network.applications.ApplicationsNetworkClient;
import com.sdkit.paylib.paylibpayment.api.network.purchases.PurchasesNetworkClient;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.core.purchase.actions.f */
/* loaded from: classes6.dex */
public final class C8152f implements Factory {

    /* renamed from: a */
    public final Provider f2042a;

    /* renamed from: b */
    public final Provider f2043b;

    /* renamed from: c */
    public final Provider f2044c;

    /* renamed from: d */
    public final Provider f2045d;

    public C8152f(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f2042a = provider;
        this.f2043b = provider2;
        this.f2044c = provider3;
        this.f2045d = provider4;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8151e get() {
        return m2066a((InterfaceC8155c) this.f2042a.get(), (PurchasesNetworkClient) this.f2043b.get(), (ApplicationsNetworkClient) this.f2044c.get(), (PaylibLoggerFactory) this.f2045d.get());
    }

    /* renamed from: a */
    public static C8151e m2066a(InterfaceC8155c interfaceC8155c, PurchasesNetworkClient purchasesNetworkClient, ApplicationsNetworkClient applicationsNetworkClient, PaylibLoggerFactory paylibLoggerFactory) {
        return new C8151e(interfaceC8155c, purchasesNetworkClient, applicationsNetworkClient, paylibLoggerFactory);
    }

    /* renamed from: a */
    public static C8152f m2067a(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new C8152f(provider, provider2, provider3, provider4);
    }
}
