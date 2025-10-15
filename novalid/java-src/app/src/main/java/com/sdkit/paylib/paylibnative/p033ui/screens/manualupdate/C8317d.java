package com.sdkit.paylib.paylibnative.p033ui.screens.manualupdate;

import com.sdkit.paylib.paylibdomain.api.invoice.InvoiceHolder;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.FinishCodeReceiver;
import com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter;
import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8412a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.manualupdate.d */
/* loaded from: classes7.dex */
public final class C8317d implements Factory {

    /* renamed from: a */
    public final Provider f3254a;

    /* renamed from: b */
    public final Provider f3255b;

    /* renamed from: c */
    public final Provider f3256c;

    /* renamed from: d */
    public final Provider f3257d;

    /* renamed from: e */
    public final Provider f3258e;

    /* renamed from: f */
    public final Provider f3259f;

    public C8317d(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f3254a = provider;
        this.f3255b = provider2;
        this.f3256c = provider3;
        this.f3257d = provider4;
        this.f3258e = provider5;
        this.f3259f = provider6;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8316c get() {
        return m2984a((InternalPaylibRouter) this.f3254a.get(), (InvoiceHolder) this.f3255b.get(), (InterfaceC8131b) this.f3256c.get(), (FinishCodeReceiver) this.f3257d.get(), (InterfaceC8412a) this.f3258e.get(), (PaylibLoggerFactory) this.f3259f.get());
    }

    /* renamed from: a */
    public static C8316c m2984a(InternalPaylibRouter internalPaylibRouter, InvoiceHolder invoiceHolder, InterfaceC8131b interfaceC8131b, FinishCodeReceiver finishCodeReceiver, InterfaceC8412a interfaceC8412a, PaylibLoggerFactory paylibLoggerFactory) {
        return new C8316c(internalPaylibRouter, invoiceHolder, interfaceC8131b, finishCodeReceiver, interfaceC8412a, paylibLoggerFactory);
    }

    /* renamed from: a */
    public static C8317d m2985a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        return new C8317d(provider, provider2, provider3, provider4, provider5, provider6);
    }
}
