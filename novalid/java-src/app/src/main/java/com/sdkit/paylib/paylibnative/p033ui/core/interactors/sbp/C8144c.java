package com.sdkit.paylib.paylibnative.p033ui.core.interactors.sbp;

import com.sdkit.paylib.paylibdomain.api.deeplink.DeeplinkHandler;
import com.sdkit.paylib.paylibdomain.api.deeplink.PaylibDeeplinkFactory;
import com.sdkit.paylib.paylibdomain.api.invoice.InvoicePaymentInteractor;
import com.sdkit.paylib.paylibdomain.api.payment.PaymentMethodSelector;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.InterfaceC8238l;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.core.interactors.sbp.c */
/* loaded from: classes6.dex */
public final class C8144c implements Factory {

    /* renamed from: a */
    public final Provider f2002a;

    /* renamed from: b */
    public final Provider f2003b;

    /* renamed from: c */
    public final Provider f2004c;

    /* renamed from: d */
    public final Provider f2005d;

    /* renamed from: e */
    public final Provider f2006e;

    /* renamed from: f */
    public final Provider f2007f;

    public C8144c(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f2002a = provider;
        this.f2003b = provider2;
        this.f2004c = provider3;
        this.f2005d = provider4;
        this.f2006e = provider5;
        this.f2007f = provider6;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8143b get() {
        return m2045a((InvoicePaymentInteractor) this.f2002a.get(), (DeeplinkHandler) this.f2003b.get(), (PaylibDeeplinkFactory) this.f2004c.get(), (InterfaceC8238l) this.f2005d.get(), (PaylibLoggerFactory) this.f2006e.get(), (PaymentMethodSelector) this.f2007f.get());
    }

    /* renamed from: a */
    public static C8143b m2045a(InvoicePaymentInteractor invoicePaymentInteractor, DeeplinkHandler deeplinkHandler, PaylibDeeplinkFactory paylibDeeplinkFactory, InterfaceC8238l interfaceC8238l, PaylibLoggerFactory paylibLoggerFactory, PaymentMethodSelector paymentMethodSelector) {
        return new C8143b(invoicePaymentInteractor, deeplinkHandler, paylibDeeplinkFactory, interfaceC8238l, paylibLoggerFactory, paymentMethodSelector);
    }

    /* renamed from: a */
    public static C8144c m2046a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        return new C8144c(provider, provider2, provider3, provider4, provider5, provider6);
    }
}
