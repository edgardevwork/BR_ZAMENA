package com.sdkit.paylib.paylibnative.p033ui.widgets.card;

import com.sdkit.paylib.paylibdomain.api.cards.CardsHolder;
import com.sdkit.paylib.paylibdomain.api.invoice.InvoiceHolder;
import com.sdkit.paylib.paylibdomain.api.payment.PaymentMethodSelector;
import com.sdkit.paylib.paylibnative.p033ui.analytics.InterfaceC8097f;
import com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter;
import com.sdkit.paylib.paylibnative.p033ui.widgets.card.viewobjects.C8397c;
import com.sdkit.paylib.paylibnative.p033ui.widgets.card.viewobjects.mappers.InterfaceC8400a;
import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8412a;
import com.sdkit.paylib.paylibplatform.api.coroutines.CoroutineDispatchers;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.card.g */
/* loaded from: classes6.dex */
public final class C8394g implements Factory {

    /* renamed from: a */
    public final Provider f3802a;

    /* renamed from: b */
    public final Provider f3803b;

    /* renamed from: c */
    public final Provider f3804c;

    /* renamed from: d */
    public final Provider f3805d;

    /* renamed from: e */
    public final Provider f3806e;

    /* renamed from: f */
    public final Provider f3807f;

    /* renamed from: g */
    public final Provider f3808g;

    /* renamed from: h */
    public final Provider f3809h;

    /* renamed from: i */
    public final Provider f3810i;

    public C8394g(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9) {
        this.f3802a = provider;
        this.f3803b = provider2;
        this.f3804c = provider3;
        this.f3805d = provider4;
        this.f3806e = provider5;
        this.f3807f = provider6;
        this.f3808g = provider7;
        this.f3809h = provider8;
        this.f3810i = provider9;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8393f get() {
        return m3573a((InvoiceHolder) this.f3802a.get(), (PaymentMethodSelector) this.f3803b.get(), (InternalPaylibRouter) this.f3804c.get(), (InterfaceC8097f) this.f3805d.get(), (CoroutineDispatchers) this.f3806e.get(), (InterfaceC8400a) this.f3807f.get(), (InterfaceC8412a) this.f3808g.get(), (C8397c) this.f3809h.get(), (CardsHolder) this.f3810i.get());
    }

    /* renamed from: a */
    public static C8393f m3573a(InvoiceHolder invoiceHolder, PaymentMethodSelector paymentMethodSelector, InternalPaylibRouter internalPaylibRouter, InterfaceC8097f interfaceC8097f, CoroutineDispatchers coroutineDispatchers, InterfaceC8400a interfaceC8400a, InterfaceC8412a interfaceC8412a, C8397c c8397c, CardsHolder cardsHolder) {
        return new C8393f(invoiceHolder, paymentMethodSelector, internalPaylibRouter, interfaceC8097f, coroutineDispatchers, interfaceC8400a, interfaceC8412a, c8397c, cardsHolder);
    }

    /* renamed from: a */
    public static C8394g m3574a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9) {
        return new C8394g(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }
}
