package com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways;

import com.sdkit.paylib.paylibdomain.api.invoice.InvoiceHolder;
import com.sdkit.paylib.paylibnative.p033ui.analytics.InterfaceC8097f;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.InterfaceC8238l;
import com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter;
import com.sdkit.paylib.paylibnative.p033ui.widgets.bistro.InterfaceC8380b;
import com.sdkit.paylib.paylibnative.p033ui.widgets.card.InterfaceC8392e;
import com.sdkit.paylib.paylibnative.p033ui.widgets.mobile.InterfaceC8404b;
import com.sdkit.paylib.paylibnative.p033ui.widgets.sbolpay.InterfaceC8430d;
import com.sdkit.paylib.paylibnative.p033ui.widgets.tbank.InterfaceC8446b;
import com.sdkit.paylib.paylibnative.p033ui.widgets.webpay.InterfaceC8452c;
import com.sdkit.paylib.paylibplatform.api.coroutines.CoroutineDispatchers;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.paymentways.i */
/* loaded from: classes6.dex */
public final class C8423i implements Factory {

    /* renamed from: a */
    public final Provider f3963a;

    /* renamed from: b */
    public final Provider f3964b;

    /* renamed from: c */
    public final Provider f3965c;

    /* renamed from: d */
    public final Provider f3966d;

    /* renamed from: e */
    public final Provider f3967e;

    /* renamed from: f */
    public final Provider f3968f;

    /* renamed from: g */
    public final Provider f3969g;

    /* renamed from: h */
    public final Provider f3970h;

    /* renamed from: i */
    public final Provider f3971i;

    /* renamed from: j */
    public final Provider f3972j;

    /* renamed from: k */
    public final Provider f3973k;

    /* renamed from: l */
    public final Provider f3974l;

    public C8423i(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12) {
        this.f3963a = provider;
        this.f3964b = provider2;
        this.f3965c = provider3;
        this.f3966d = provider4;
        this.f3967e = provider5;
        this.f3968f = provider6;
        this.f3969g = provider7;
        this.f3970h = provider8;
        this.f3971i = provider9;
        this.f3972j = provider10;
        this.f3973k = provider11;
        this.f3974l = provider12;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8422h get() {
        return m3703a((InvoiceHolder) this.f3963a.get(), (InterfaceC8097f) this.f3964b.get(), (InternalPaylibRouter) this.f3965c.get(), (CoroutineDispatchers) this.f3966d.get(), (InterfaceC8430d) this.f3967e.get(), (InterfaceC8380b) this.f3968f.get(), (InterfaceC8446b) this.f3969g.get(), (InterfaceC8404b) this.f3970h.get(), (InterfaceC8452c) this.f3971i.get(), (InterfaceC8392e) this.f3972j.get(), (InterfaceC8412a) this.f3973k.get(), (InterfaceC8238l) this.f3974l.get());
    }

    /* renamed from: a */
    public static C8422h m3703a(InvoiceHolder invoiceHolder, InterfaceC8097f interfaceC8097f, InternalPaylibRouter internalPaylibRouter, CoroutineDispatchers coroutineDispatchers, InterfaceC8430d interfaceC8430d, InterfaceC8380b interfaceC8380b, InterfaceC8446b interfaceC8446b, InterfaceC8404b interfaceC8404b, InterfaceC8452c interfaceC8452c, InterfaceC8392e interfaceC8392e, InterfaceC8412a interfaceC8412a, InterfaceC8238l interfaceC8238l) {
        return new C8422h(invoiceHolder, interfaceC8097f, internalPaylibRouter, coroutineDispatchers, interfaceC8430d, interfaceC8380b, interfaceC8446b, interfaceC8404b, interfaceC8452c, interfaceC8392e, interfaceC8412a, interfaceC8238l);
    }

    /* renamed from: a */
    public static C8423i m3704a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12) {
        return new C8423i(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }
}
