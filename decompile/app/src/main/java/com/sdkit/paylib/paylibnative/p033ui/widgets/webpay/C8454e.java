package com.sdkit.paylib.paylibnative.p033ui.widgets.webpay;

import com.sdkit.paylib.paylibdomain.api.invoice.InvoiceHolder;
import com.sdkit.paylib.paylibnative.p033ui.analytics.InterfaceC8097f;
import com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b;
import com.sdkit.paylib.paylibnative.p033ui.domain.savecardscreen.InterfaceC8220b;
import com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter;
import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8412a;
import com.sdkit.paylib.paylibplatform.api.coroutines.CoroutineDispatchers;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.webpay.e */
/* loaded from: classes6.dex */
public final class C8454e implements Factory {

    /* renamed from: a */
    public final Provider f4097a;

    /* renamed from: b */
    public final Provider f4098b;

    /* renamed from: c */
    public final Provider f4099c;

    /* renamed from: d */
    public final Provider f4100d;

    /* renamed from: e */
    public final Provider f4101e;

    /* renamed from: f */
    public final Provider f4102f;

    /* renamed from: g */
    public final Provider f4103g;

    public C8454e(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.f4097a = provider;
        this.f4098b = provider2;
        this.f4099c = provider3;
        this.f4100d = provider4;
        this.f4101e = provider5;
        this.f4102f = provider6;
        this.f4103g = provider7;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8453d get() {
        return m3788a((InvoiceHolder) this.f4097a.get(), (InternalPaylibRouter) this.f4098b.get(), (InterfaceC8131b) this.f4099c.get(), (InterfaceC8412a) this.f4100d.get(), (CoroutineDispatchers) this.f4101e.get(), (InterfaceC8097f) this.f4102f.get(), (InterfaceC8220b) this.f4103g.get());
    }

    /* renamed from: a */
    public static C8453d m3788a(InvoiceHolder invoiceHolder, InternalPaylibRouter internalPaylibRouter, InterfaceC8131b interfaceC8131b, InterfaceC8412a interfaceC8412a, CoroutineDispatchers coroutineDispatchers, InterfaceC8097f interfaceC8097f, InterfaceC8220b interfaceC8220b) {
        return new C8453d(invoiceHolder, internalPaylibRouter, interfaceC8131b, interfaceC8412a, coroutineDispatchers, interfaceC8097f, interfaceC8220b);
    }

    /* renamed from: a */
    public static C8454e m3789a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        return new C8454e(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }
}
