package com.sdkit.paylib.paylibnative.p033ui.widgets.tbank;

import android.content.Context;
import com.sdkit.paylib.paylibdomain.api.deeplink.DeeplinkHandler;
import com.sdkit.paylib.paylibdomain.api.deeplink.PaylibDeeplinkFactory;
import com.sdkit.paylib.paylibdomain.api.deeplink.interactors.DeeplinkSupportInteractor;
import com.sdkit.paylib.paylibdomain.api.invoice.InvoiceHolder;
import com.sdkit.paylib.paylibdomain.api.invoice.InvoicePaymentInteractor;
import com.sdkit.paylib.paylibdomain.api.payment.PaymentMethodSelector;
import com.sdkit.paylib.paylibdomain.api.tbank.interactors.TBankAvailabilityInteractor;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.InterfaceC8238l;
import com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter;
import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8412a;
import com.sdkit.paylib.paylibplatform.api.coroutines.CoroutineDispatchers;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.tbank.c */
/* loaded from: classes6.dex */
public final class C8447c implements Factory {

    /* renamed from: a */
    public final Provider f4052a;

    /* renamed from: b */
    public final Provider f4053b;

    /* renamed from: c */
    public final Provider f4054c;

    /* renamed from: d */
    public final Provider f4055d;

    /* renamed from: e */
    public final Provider f4056e;

    /* renamed from: f */
    public final Provider f4057f;

    /* renamed from: g */
    public final Provider f4058g;

    /* renamed from: h */
    public final Provider f4059h;

    /* renamed from: i */
    public final Provider f4060i;

    /* renamed from: j */
    public final Provider f4061j;

    /* renamed from: k */
    public final Provider f4062k;

    /* renamed from: l */
    public final Provider f4063l;

    /* renamed from: m */
    public final Provider f4064m;

    /* renamed from: n */
    public final Provider f4065n;

    public C8447c(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14) {
        this.f4052a = provider;
        this.f4053b = provider2;
        this.f4054c = provider3;
        this.f4055d = provider4;
        this.f4056e = provider5;
        this.f4057f = provider6;
        this.f4058g = provider7;
        this.f4059h = provider8;
        this.f4060i = provider9;
        this.f4061j = provider10;
        this.f4062k = provider11;
        this.f4063l = provider12;
        this.f4064m = provider13;
        this.f4065n = provider14;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public TBankWidgetHandlerImpl get() {
        return m3760a((InvoiceHolder) this.f4052a.get(), (InvoicePaymentInteractor) this.f4053b.get(), (InternalPaylibRouter) this.f4054c.get(), (InterfaceC8131b) this.f4055d.get(), (InterfaceC8412a) this.f4056e.get(), (CoroutineDispatchers) this.f4057f.get(), (PaylibLoggerFactory) this.f4058g.get(), (DeeplinkSupportInteractor) this.f4059h.get(), (TBankAvailabilityInteractor) this.f4060i.get(), (DeeplinkHandler) this.f4061j.get(), (InterfaceC8238l) this.f4062k.get(), (PaylibDeeplinkFactory) this.f4063l.get(), (Context) this.f4064m.get(), (PaymentMethodSelector) this.f4065n.get());
    }

    /* renamed from: a */
    public static TBankWidgetHandlerImpl m3760a(InvoiceHolder invoiceHolder, InvoicePaymentInteractor invoicePaymentInteractor, InternalPaylibRouter internalPaylibRouter, InterfaceC8131b interfaceC8131b, InterfaceC8412a interfaceC8412a, CoroutineDispatchers coroutineDispatchers, PaylibLoggerFactory paylibLoggerFactory, DeeplinkSupportInteractor deeplinkSupportInteractor, TBankAvailabilityInteractor tBankAvailabilityInteractor, DeeplinkHandler deeplinkHandler, InterfaceC8238l interfaceC8238l, PaylibDeeplinkFactory paylibDeeplinkFactory, Context context, PaymentMethodSelector paymentMethodSelector) {
        return new TBankWidgetHandlerImpl(invoiceHolder, invoicePaymentInteractor, internalPaylibRouter, interfaceC8131b, interfaceC8412a, coroutineDispatchers, paylibLoggerFactory, deeplinkSupportInteractor, tBankAvailabilityInteractor, deeplinkHandler, interfaceC8238l, paylibDeeplinkFactory, context, paymentMethodSelector);
    }

    /* renamed from: a */
    public static C8447c m3761a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14) {
        return new C8447c(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14);
    }
}
