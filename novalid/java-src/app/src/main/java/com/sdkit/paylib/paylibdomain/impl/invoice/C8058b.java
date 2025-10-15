package com.sdkit.paylib.paylibdomain.impl.invoice;

import com.sdkit.paylib.paylibdomain.api.cards.CardsHolder;
import com.sdkit.paylib.paylibdomain.api.config.PaylibDomainFeatureFlags;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibpayment.api.network.invoice.InvoiceNetworkClient;
import com.sdkit.paylib.paylibplatform.api.coroutines.CoroutineDispatchers;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibdomain.impl.invoice.b */
/* loaded from: classes6.dex */
public final class C8058b implements Factory {

    /* renamed from: a */
    public final Provider f1281a;

    /* renamed from: b */
    public final Provider f1282b;

    /* renamed from: c */
    public final Provider f1283c;

    /* renamed from: d */
    public final Provider f1284d;

    /* renamed from: e */
    public final Provider f1285e;

    public C8058b(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f1281a = provider;
        this.f1282b = provider2;
        this.f1283c = provider3;
        this.f1284d = provider4;
        this.f1285e = provider5;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8057a get() {
        return m1573a((CardsHolder) this.f1281a.get(), (CoroutineDispatchers) this.f1282b.get(), (PaylibDomainFeatureFlags) this.f1283c.get(), (InvoiceNetworkClient) this.f1284d.get(), (PaylibLoggerFactory) this.f1285e.get());
    }

    /* renamed from: a */
    public static C8057a m1573a(CardsHolder cardsHolder, CoroutineDispatchers coroutineDispatchers, PaylibDomainFeatureFlags paylibDomainFeatureFlags, InvoiceNetworkClient invoiceNetworkClient, PaylibLoggerFactory paylibLoggerFactory) {
        return new C8057a(cardsHolder, coroutineDispatchers, paylibDomainFeatureFlags, invoiceNetworkClient, paylibLoggerFactory);
    }

    /* renamed from: a */
    public static C8058b m1574a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new C8058b(provider, provider2, provider3, provider4, provider5);
    }
}
