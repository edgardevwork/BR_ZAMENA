package com.sdkit.paylib.paylibnative.p033ui.widgets.sbolpay;

import com.sdkit.paylib.paylibdomain.api.invoice.InvoiceHolder;
import com.sdkit.paylib.paylibdomain.api.invoice.InvoicePaymentInteractor;
import com.sdkit.paylib.paylibdomain.api.payment.PaymentMethodSelector;
import com.sdkit.paylib.paylibnative.p033ui.analytics.InterfaceC8097f;
import com.sdkit.paylib.paylibnative.p033ui.core.sbolpay.SbolPayDeeplinkResolver;
import com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter;
import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8412a;
import com.sdkit.paylib.paylibplatform.api.coroutines.CoroutineDispatchers;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.sbolpay.f */
/* loaded from: classes6.dex */
public final class C8432f implements Factory {

    /* renamed from: a */
    public final Provider f4008a;

    /* renamed from: b */
    public final Provider f4009b;

    /* renamed from: c */
    public final Provider f4010c;

    /* renamed from: d */
    public final Provider f4011d;

    /* renamed from: e */
    public final Provider f4012e;

    /* renamed from: f */
    public final Provider f4013f;

    /* renamed from: g */
    public final Provider f4014g;

    /* renamed from: h */
    public final Provider f4015h;

    public C8432f(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8) {
        this.f4008a = provider;
        this.f4009b = provider2;
        this.f4010c = provider3;
        this.f4011d = provider4;
        this.f4012e = provider5;
        this.f4013f = provider6;
        this.f4014g = provider7;
        this.f4015h = provider8;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8431e get() {
        return m3731a((InvoicePaymentInteractor) this.f4008a.get(), (InterfaceC8097f) this.f4009b.get(), (CoroutineDispatchers) this.f4010c.get(), (InvoiceHolder) this.f4011d.get(), (InterfaceC8412a) this.f4012e.get(), (SbolPayDeeplinkResolver) this.f4013f.get(), (InternalPaylibRouter) this.f4014g.get(), (PaymentMethodSelector) this.f4015h.get());
    }

    /* renamed from: a */
    public static C8431e m3731a(InvoicePaymentInteractor invoicePaymentInteractor, InterfaceC8097f interfaceC8097f, CoroutineDispatchers coroutineDispatchers, InvoiceHolder invoiceHolder, InterfaceC8412a interfaceC8412a, SbolPayDeeplinkResolver sbolPayDeeplinkResolver, InternalPaylibRouter internalPaylibRouter, PaymentMethodSelector paymentMethodSelector) {
        return new C8431e(invoicePaymentInteractor, interfaceC8097f, coroutineDispatchers, invoiceHolder, interfaceC8412a, sbolPayDeeplinkResolver, internalPaylibRouter, paymentMethodSelector);
    }

    /* renamed from: a */
    public static C8432f m3732a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8) {
        return new C8432f(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }
}
