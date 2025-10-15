package com.sdkit.paylib.paylibnative.sbol;

import com.sdkit.paylib.paylibdomain.api.deeplink.PaylibDeeplinkFactory;
import com.sdkit.paylib.paylibdomain.api.deeplink.PaylibDeeplinkParser;
import com.sdkit.paylib.paylibdomain.api.invoice.InvoiceHolder;
import com.sdkit.paylib.paylibdomain.api.invoice.InvoicePaymentInteractor;
import com.sdkit.paylib.paylibdomain.api.payment.PaymentMethodSelector;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibnative.api.analytics.CustomPaylibAnalytics;
import com.sdkit.paylib.paylibnative.api.presentation.PaylibSbolPayReturnDeepLinkProvider;
import com.sdkit.paylib.paylibplatform.api.coroutines.CoroutineDispatchers;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.sbol.b */
/* loaded from: classes6.dex */
public final class C8084b implements Factory {

    /* renamed from: a */
    public final Provider f1684a;

    /* renamed from: b */
    public final Provider f1685b;

    /* renamed from: c */
    public final Provider f1686c;

    /* renamed from: d */
    public final Provider f1687d;

    /* renamed from: e */
    public final Provider f1688e;

    /* renamed from: f */
    public final Provider f1689f;

    /* renamed from: g */
    public final Provider f1690g;

    /* renamed from: h */
    public final Provider f1691h;

    /* renamed from: i */
    public final Provider f1692i;

    public C8084b(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9) {
        this.f1684a = provider;
        this.f1685b = provider2;
        this.f1686c = provider3;
        this.f1687d = provider4;
        this.f1688e = provider5;
        this.f1689f = provider6;
        this.f1690g = provider7;
        this.f1691h = provider8;
        this.f1692i = provider9;
    }

    @Override // javax.inject.Provider
    /* renamed from: a */
    public C8081a get() {
        return m1753a((InvoiceHolder) this.f1684a.get(), (InvoicePaymentInteractor) this.f1685b.get(), (CoroutineDispatchers) this.f1686c.get(), (PaylibSbolPayReturnDeepLinkProvider) this.f1687d.get(), (CustomPaylibAnalytics) this.f1688e.get(), (PaylibLoggerFactory) this.f1689f.get(), (PaylibDeeplinkParser) this.f1690g.get(), (PaylibDeeplinkFactory) this.f1691h.get(), (PaymentMethodSelector) this.f1692i.get());
    }

    /* renamed from: a */
    public static C8081a m1753a(InvoiceHolder invoiceHolder, InvoicePaymentInteractor invoicePaymentInteractor, CoroutineDispatchers coroutineDispatchers, PaylibSbolPayReturnDeepLinkProvider paylibSbolPayReturnDeepLinkProvider, CustomPaylibAnalytics customPaylibAnalytics, PaylibLoggerFactory paylibLoggerFactory, PaylibDeeplinkParser paylibDeeplinkParser, PaylibDeeplinkFactory paylibDeeplinkFactory, PaymentMethodSelector paymentMethodSelector) {
        return new C8081a(invoiceHolder, invoicePaymentInteractor, coroutineDispatchers, paylibSbolPayReturnDeepLinkProvider, customPaylibAnalytics, paylibLoggerFactory, paylibDeeplinkParser, paylibDeeplinkFactory, paymentMethodSelector);
    }

    /* renamed from: a */
    public static C8084b m1754a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9) {
        return new C8084b(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }
}
