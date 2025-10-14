package com.sdkit.paylib.paylibnative.p033ui.widgets.mobile;

import com.sdkit.paylib.paylibdomain.api.invoice.InvoiceHolder;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b;
import com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter;
import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8412a;
import com.sdkit.paylib.paylibplatform.api.coroutines.CoroutineDispatchers;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.mobile.d */
/* loaded from: classes6.dex */
public final class C8406d implements Factory {

    /* renamed from: a */
    public final Provider f3849a;

    /* renamed from: b */
    public final Provider f3850b;

    /* renamed from: c */
    public final Provider f3851c;

    /* renamed from: d */
    public final Provider f3852d;

    /* renamed from: e */
    public final Provider f3853e;

    /* renamed from: f */
    public final Provider f3854f;

    public C8406d(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f3849a = provider;
        this.f3850b = provider2;
        this.f3851c = provider3;
        this.f3852d = provider4;
        this.f3853e = provider5;
        this.f3854f = provider6;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8405c get() {
        return m3615a((InvoiceHolder) this.f3849a.get(), (InternalPaylibRouter) this.f3850b.get(), (InterfaceC8131b) this.f3851c.get(), (InterfaceC8412a) this.f3852d.get(), (CoroutineDispatchers) this.f3853e.get(), (PaylibLoggerFactory) this.f3854f.get());
    }

    /* renamed from: a */
    public static C8405c m3615a(InvoiceHolder invoiceHolder, InternalPaylibRouter internalPaylibRouter, InterfaceC8131b interfaceC8131b, InterfaceC8412a interfaceC8412a, CoroutineDispatchers coroutineDispatchers, PaylibLoggerFactory paylibLoggerFactory) {
        return new C8405c(invoiceHolder, internalPaylibRouter, interfaceC8131b, interfaceC8412a, coroutineDispatchers, paylibLoggerFactory);
    }

    /* renamed from: a */
    public static C8406d m3616a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        return new C8406d(provider, provider2, provider3, provider4, provider5, provider6);
    }
}
