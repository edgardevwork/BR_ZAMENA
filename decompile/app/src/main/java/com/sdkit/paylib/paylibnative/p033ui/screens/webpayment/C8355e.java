package com.sdkit.paylib.paylibnative.p033ui.screens.webpayment;

import com.sdkit.paylib.paylibdomain.api.invoice.InvoicePaymentInteractor;
import com.sdkit.paylib.paylibdomain.api.payment.PaymentMethodSelector;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibnative.p033ui.analytics.InterfaceC8097f;
import com.sdkit.paylib.paylibnative.p033ui.common.C8106e;
import com.sdkit.paylib.paylibnative.p033ui.common.error.C8107a;
import com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.FinishCodeReceiver;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.InterfaceC8238l;
import com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter;
import com.sdkit.paylib.paylibplatform.api.coroutines.CoroutineDispatchers;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.webpayment.e */
/* loaded from: classes7.dex */
public final class C8355e implements Factory {

    /* renamed from: a */
    public final Provider f3635a;

    /* renamed from: b */
    public final Provider f3636b;

    /* renamed from: c */
    public final Provider f3637c;

    /* renamed from: d */
    public final Provider f3638d;

    /* renamed from: e */
    public final Provider f3639e;

    /* renamed from: f */
    public final Provider f3640f;

    /* renamed from: g */
    public final Provider f3641g;

    /* renamed from: h */
    public final Provider f3642h;

    /* renamed from: i */
    public final Provider f3643i;

    /* renamed from: j */
    public final Provider f3644j;

    /* renamed from: k */
    public final Provider f3645k;

    public C8355e(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11) {
        this.f3635a = provider;
        this.f3636b = provider2;
        this.f3637c = provider3;
        this.f3638d = provider4;
        this.f3639e = provider5;
        this.f3640f = provider6;
        this.f3641g = provider7;
        this.f3642h = provider8;
        this.f3643i = provider9;
        this.f3644j = provider10;
        this.f3645k = provider11;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8354d get() {
        return m3410a((InvoicePaymentInteractor) this.f3635a.get(), (FinishCodeReceiver) this.f3636b.get(), (InterfaceC8097f) this.f3637c.get(), (InternalPaylibRouter) this.f3638d.get(), (C8106e) this.f3639e.get(), (C8107a) this.f3640f.get(), (PaylibLoggerFactory) this.f3641g.get(), (CoroutineDispatchers) this.f3642h.get(), (PaymentMethodSelector) this.f3643i.get(), (InterfaceC8131b) this.f3644j.get(), (InterfaceC8238l) this.f3645k.get());
    }

    /* renamed from: a */
    public static C8354d m3410a(InvoicePaymentInteractor invoicePaymentInteractor, FinishCodeReceiver finishCodeReceiver, InterfaceC8097f interfaceC8097f, InternalPaylibRouter internalPaylibRouter, C8106e c8106e, C8107a c8107a, PaylibLoggerFactory paylibLoggerFactory, CoroutineDispatchers coroutineDispatchers, PaymentMethodSelector paymentMethodSelector, InterfaceC8131b interfaceC8131b, InterfaceC8238l interfaceC8238l) {
        return new C8354d(invoicePaymentInteractor, finishCodeReceiver, interfaceC8097f, internalPaylibRouter, c8106e, c8107a, paylibLoggerFactory, coroutineDispatchers, paymentMethodSelector, interfaceC8131b, interfaceC8238l);
    }

    /* renamed from: a */
    public static C8355e m3411a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11) {
        return new C8355e(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }
}
