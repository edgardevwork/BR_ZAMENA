package com.sdkit.paylib.paylibdomain.impl.purchases;

import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibpayment.api.network.purchases.PurchasesNetworkClient;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibdomain.impl.purchases.b */
/* loaded from: classes6.dex */
public final class C8068b implements Factory {

    /* renamed from: a */
    public final Provider f1471a;

    /* renamed from: b */
    public final Provider f1472b;

    public C8068b(Provider provider, Provider provider2) {
        this.f1471a = provider;
        this.f1472b = provider2;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8067a get() {
        return m1643a((PurchasesNetworkClient) this.f1471a.get(), (PaylibLoggerFactory) this.f1472b.get());
    }

    /* renamed from: a */
    public static C8067a m1643a(PurchasesNetworkClient purchasesNetworkClient, PaylibLoggerFactory paylibLoggerFactory) {
        return new C8067a(purchasesNetworkClient, paylibLoggerFactory);
    }

    /* renamed from: a */
    public static C8068b m1644a(Provider provider, Provider provider2) {
        return new C8068b(provider, provider2);
    }
}
