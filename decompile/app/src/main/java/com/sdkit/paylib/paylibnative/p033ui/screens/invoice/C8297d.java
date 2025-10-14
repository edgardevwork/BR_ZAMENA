package com.sdkit.paylib.paylibnative.p033ui.screens.invoice;

import com.sdkit.paylib.paylibdomain.api.cards.CardsHolder;
import com.sdkit.paylib.paylibdomain.api.invoice.InvoiceHolder;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibnative.p033ui.analytics.InterfaceC8097f;
import com.sdkit.paylib.paylibnative.p033ui.domain.savecardscreen.InterfaceC8220b;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.FinishCodeReceiver;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.InterfaceC8238l;
import com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter;
import com.sdkit.paylib.paylibnative.p033ui.screens.invoice.viewobjects.C8303f;
import com.sdkit.paylib.paylibnative.p033ui.screens.invoice.viewobjects.InterfaceC8298a;
import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8412a;
import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8421g;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.invoice.d */
/* loaded from: classes7.dex */
public final class C8297d implements Factory {

    /* renamed from: a */
    public final Provider f3136a;

    /* renamed from: b */
    public final Provider f3137b;

    /* renamed from: c */
    public final Provider f3138c;

    /* renamed from: d */
    public final Provider f3139d;

    /* renamed from: e */
    public final Provider f3140e;

    /* renamed from: f */
    public final Provider f3141f;

    /* renamed from: g */
    public final Provider f3142g;

    /* renamed from: h */
    public final Provider f3143h;

    /* renamed from: i */
    public final Provider f3144i;

    /* renamed from: j */
    public final Provider f3145j;

    /* renamed from: k */
    public final Provider f3146k;

    /* renamed from: l */
    public final Provider f3147l;

    public C8297d(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12) {
        this.f3136a = provider;
        this.f3137b = provider2;
        this.f3138c = provider3;
        this.f3139d = provider4;
        this.f3140e = provider5;
        this.f3141f = provider6;
        this.f3142g = provider7;
        this.f3143h = provider8;
        this.f3144i = provider9;
        this.f3145j = provider10;
        this.f3146k = provider11;
        this.f3147l = provider12;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8296c get() {
        return m2885a((InvoiceHolder) this.f3136a.get(), (FinishCodeReceiver) this.f3137b.get(), (InterfaceC8097f) this.f3138c.get(), (InternalPaylibRouter) this.f3139d.get(), (InterfaceC8238l) this.f3140e.get(), (PaylibLoggerFactory) this.f3141f.get(), (InterfaceC8298a) this.f3142g.get(), (C8303f) this.f3143h.get(), (InterfaceC8412a) this.f3144i.get(), (InterfaceC8421g) this.f3145j.get(), (CardsHolder) this.f3146k.get(), (InterfaceC8220b) this.f3147l.get());
    }

    /* renamed from: a */
    public static C8296c m2885a(InvoiceHolder invoiceHolder, FinishCodeReceiver finishCodeReceiver, InterfaceC8097f interfaceC8097f, InternalPaylibRouter internalPaylibRouter, InterfaceC8238l interfaceC8238l, PaylibLoggerFactory paylibLoggerFactory, InterfaceC8298a interfaceC8298a, C8303f c8303f, InterfaceC8412a interfaceC8412a, InterfaceC8421g interfaceC8421g, CardsHolder cardsHolder, InterfaceC8220b interfaceC8220b) {
        return new C8296c(invoiceHolder, finishCodeReceiver, interfaceC8097f, internalPaylibRouter, interfaceC8238l, paylibLoggerFactory, interfaceC8298a, c8303f, interfaceC8412a, interfaceC8421g, cardsHolder, interfaceC8220b);
    }

    /* renamed from: a */
    public static C8297d m2886a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12) {
        return new C8297d(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }
}
