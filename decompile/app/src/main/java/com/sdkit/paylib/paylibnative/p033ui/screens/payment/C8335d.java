package com.sdkit.paylib.paylibnative.p033ui.screens.payment;

import com.sdkit.paylib.paylibdomain.api.invoice.InvoiceHolder;
import com.sdkit.paylib.paylibdomain.api.invoice.InvoicePaymentInteractor;
import com.sdkit.paylib.paylibnative.p033ui.analytics.InterfaceC8093b;
import com.sdkit.paylib.paylibnative.p033ui.analytics.InterfaceC8097f;
import com.sdkit.paylib.paylibnative.p033ui.common.C8106e;
import com.sdkit.paylib.paylibnative.p033ui.common.error.C8107a;
import com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b;
import com.sdkit.paylib.paylibnative.p033ui.deviceauth.C8208c;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.FinishCodeReceiver;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.InterfaceC8238l;
import com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.payment.d */
/* loaded from: classes7.dex */
public final class C8335d implements Factory {

    /* renamed from: a */
    public final Provider f3435a;

    /* renamed from: b */
    public final Provider f3436b;

    /* renamed from: c */
    public final Provider f3437c;

    /* renamed from: d */
    public final Provider f3438d;

    /* renamed from: e */
    public final Provider f3439e;

    /* renamed from: f */
    public final Provider f3440f;

    /* renamed from: g */
    public final Provider f3441g;

    /* renamed from: h */
    public final Provider f3442h;

    /* renamed from: i */
    public final Provider f3443i;

    /* renamed from: j */
    public final Provider f3444j;

    /* renamed from: k */
    public final Provider f3445k;

    public C8335d(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11) {
        this.f3435a = provider;
        this.f3436b = provider2;
        this.f3437c = provider3;
        this.f3438d = provider4;
        this.f3439e = provider5;
        this.f3440f = provider6;
        this.f3441g = provider7;
        this.f3442h = provider8;
        this.f3443i = provider9;
        this.f3444j = provider10;
        this.f3445k = provider11;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8334c get() {
        return m3195a((InterfaceC8097f) this.f3435a.get(), (C8208c) this.f3436b.get(), (InvoiceHolder) this.f3437c.get(), (InvoicePaymentInteractor) this.f3438d.get(), (FinishCodeReceiver) this.f3439e.get(), (InternalPaylibRouter) this.f3440f.get(), (InterfaceC8131b) this.f3441g.get(), (InterfaceC8093b) this.f3442h.get(), (C8106e) this.f3443i.get(), (C8107a) this.f3444j.get(), (InterfaceC8238l) this.f3445k.get());
    }

    /* renamed from: a */
    public static C8334c m3195a(InterfaceC8097f interfaceC8097f, C8208c c8208c, InvoiceHolder invoiceHolder, InvoicePaymentInteractor invoicePaymentInteractor, FinishCodeReceiver finishCodeReceiver, InternalPaylibRouter internalPaylibRouter, InterfaceC8131b interfaceC8131b, InterfaceC8093b interfaceC8093b, C8106e c8106e, C8107a c8107a, InterfaceC8238l interfaceC8238l) {
        return new C8334c(interfaceC8097f, c8208c, invoiceHolder, invoicePaymentInteractor, finishCodeReceiver, internalPaylibRouter, interfaceC8131b, interfaceC8093b, c8106e, c8107a, interfaceC8238l);
    }

    /* renamed from: a */
    public static C8335d m3196a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11) {
        return new C8335d(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }
}
