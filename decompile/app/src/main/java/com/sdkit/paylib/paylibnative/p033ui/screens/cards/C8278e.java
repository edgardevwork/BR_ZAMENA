package com.sdkit.paylib.paylibnative.p033ui.screens.cards;

import com.sdkit.paylib.paylibdomain.api.cards.CardsHolder;
import com.sdkit.paylib.paylibdomain.api.invoice.InvoiceHolder;
import com.sdkit.paylib.paylibnative.p033ui.analytics.InterfaceC8097f;
import com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b;
import com.sdkit.paylib.paylibnative.p033ui.domain.savecardscreen.InterfaceC8220b;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.FinishCodeReceiver;
import com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter;
import com.sdkit.paylib.paylibnative.p033ui.widgets.card.viewobjects.C8397c;
import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8412a;
import com.sdkit.paylib.paylibnative.p033ui.widgets.sbolpay.InterfaceC8430d;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.cards.e */
/* loaded from: classes5.dex */
public final class C8278e implements Factory {

    /* renamed from: a */
    public final Provider f2928a;

    /* renamed from: b */
    public final Provider f2929b;

    /* renamed from: c */
    public final Provider f2930c;

    /* renamed from: d */
    public final Provider f2931d;

    /* renamed from: e */
    public final Provider f2932e;

    /* renamed from: f */
    public final Provider f2933f;

    /* renamed from: g */
    public final Provider f2934g;

    /* renamed from: h */
    public final Provider f2935h;

    /* renamed from: i */
    public final Provider f2936i;

    /* renamed from: j */
    public final Provider f2937j;

    public C8278e(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10) {
        this.f2928a = provider;
        this.f2929b = provider2;
        this.f2930c = provider3;
        this.f2931d = provider4;
        this.f2932e = provider5;
        this.f2933f = provider6;
        this.f2934g = provider7;
        this.f2935h = provider8;
        this.f2936i = provider9;
        this.f2937j = provider10;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8277d get() {
        return m2670a((FinishCodeReceiver) this.f2928a.get(), (InvoiceHolder) this.f2929b.get(), (InternalPaylibRouter) this.f2930c.get(), (InterfaceC8430d) this.f2931d.get(), (InterfaceC8131b) this.f2932e.get(), (C8397c) this.f2933f.get(), (InterfaceC8097f) this.f2934g.get(), (InterfaceC8412a) this.f2935h.get(), (CardsHolder) this.f2936i.get(), (InterfaceC8220b) this.f2937j.get());
    }

    /* renamed from: a */
    public static C8277d m2670a(FinishCodeReceiver finishCodeReceiver, InvoiceHolder invoiceHolder, InternalPaylibRouter internalPaylibRouter, InterfaceC8430d interfaceC8430d, InterfaceC8131b interfaceC8131b, C8397c c8397c, InterfaceC8097f interfaceC8097f, InterfaceC8412a interfaceC8412a, CardsHolder cardsHolder, InterfaceC8220b interfaceC8220b) {
        return new C8277d(finishCodeReceiver, invoiceHolder, internalPaylibRouter, interfaceC8430d, interfaceC8131b, c8397c, interfaceC8097f, interfaceC8412a, cardsHolder, interfaceC8220b);
    }

    /* renamed from: a */
    public static C8278e m2671a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10) {
        return new C8278e(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }
}
