package com.sdkit.paylib.paylibnative.p033ui.widgets.bistro;

import com.sdkit.paylib.paylibdomain.api.invoice.InvoiceHolder;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b;
import com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter;
import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8412a;
import com.sdkit.paylib.paylibplatform.api.coroutines.CoroutineDispatchers;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.bistro.d */
/* loaded from: classes6.dex */
public final class C8382d implements Factory {

    /* renamed from: a */
    public final Provider f3710a;

    /* renamed from: b */
    public final Provider f3711b;

    /* renamed from: c */
    public final Provider f3712c;

    /* renamed from: d */
    public final Provider f3713d;

    /* renamed from: e */
    public final Provider f3714e;

    /* renamed from: f */
    public final Provider f3715f;

    public C8382d(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f3710a = provider;
        this.f3711b = provider2;
        this.f3712c = provider3;
        this.f3713d = provider4;
        this.f3714e = provider5;
        this.f3715f = provider6;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8381c get() {
        return m3499a((InvoiceHolder) this.f3710a.get(), (InternalPaylibRouter) this.f3711b.get(), (InterfaceC8131b) this.f3712c.get(), (InterfaceC8412a) this.f3713d.get(), (CoroutineDispatchers) this.f3714e.get(), (PaylibLoggerFactory) this.f3715f.get());
    }

    /* renamed from: a */
    public static C8381c m3499a(InvoiceHolder invoiceHolder, InternalPaylibRouter internalPaylibRouter, InterfaceC8131b interfaceC8131b, InterfaceC8412a interfaceC8412a, CoroutineDispatchers coroutineDispatchers, PaylibLoggerFactory paylibLoggerFactory) {
        return new C8381c(invoiceHolder, internalPaylibRouter, interfaceC8131b, interfaceC8412a, coroutineDispatchers, paylibLoggerFactory);
    }

    /* renamed from: a */
    public static C8382d m3500a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        return new C8382d(provider, provider2, provider3, provider4, provider5, provider6);
    }
}
