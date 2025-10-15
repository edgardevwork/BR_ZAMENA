package com.sdkit.paylib.paylibnative.p033ui.screens.paymentsuccess;

import com.sdkit.paylib.paylibdomain.api.invoice.InvoiceHolder;
import com.sdkit.paylib.paylibnative.p033ui.analytics.InterfaceC8093b;
import com.sdkit.paylib.paylibnative.p033ui.analytics.InterfaceC8097f;
import com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.FinishCodeReceiver;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.InterfaceC8238l;
import com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter;
import com.sdkit.paylib.paylibplatform.api.coroutines.CoroutineDispatchers;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.paymentsuccess.e */
/* loaded from: classes7.dex */
public final class C8349e implements Factory {

    /* renamed from: a */
    public final Provider f3548a;

    /* renamed from: b */
    public final Provider f3549b;

    /* renamed from: c */
    public final Provider f3550c;

    /* renamed from: d */
    public final Provider f3551d;

    /* renamed from: e */
    public final Provider f3552e;

    /* renamed from: f */
    public final Provider f3553f;

    /* renamed from: g */
    public final Provider f3554g;

    /* renamed from: h */
    public final Provider f3555h;

    public C8349e(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8) {
        this.f3548a = provider;
        this.f3549b = provider2;
        this.f3550c = provider3;
        this.f3551d = provider4;
        this.f3552e = provider5;
        this.f3553f = provider6;
        this.f3554g = provider7;
        this.f3555h = provider8;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8348d get() {
        return m3304a((InterfaceC8097f) this.f3548a.get(), (CoroutineDispatchers) this.f3549b.get(), (InvoiceHolder) this.f3550c.get(), (FinishCodeReceiver) this.f3551d.get(), (InternalPaylibRouter) this.f3552e.get(), (InterfaceC8131b) this.f3553f.get(), (InterfaceC8093b) this.f3554g.get(), (InterfaceC8238l) this.f3555h.get());
    }

    /* renamed from: a */
    public static C8348d m3304a(InterfaceC8097f interfaceC8097f, CoroutineDispatchers coroutineDispatchers, InvoiceHolder invoiceHolder, FinishCodeReceiver finishCodeReceiver, InternalPaylibRouter internalPaylibRouter, InterfaceC8131b interfaceC8131b, InterfaceC8093b interfaceC8093b, InterfaceC8238l interfaceC8238l) {
        return new C8348d(interfaceC8097f, coroutineDispatchers, invoiceHolder, finishCodeReceiver, internalPaylibRouter, interfaceC8131b, interfaceC8093b, interfaceC8238l);
    }

    /* renamed from: a */
    public static C8349e m3305a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8) {
        return new C8349e(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }
}
