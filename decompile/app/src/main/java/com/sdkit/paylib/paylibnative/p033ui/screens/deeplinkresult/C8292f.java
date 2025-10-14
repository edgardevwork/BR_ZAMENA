package com.sdkit.paylib.paylibnative.p033ui.screens.deeplinkresult;

import com.sdkit.paylib.paylibdomain.api.invoice.InvoiceHolder;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibnative.p033ui.analytics.InterfaceC8097f;
import com.sdkit.paylib.paylibnative.p033ui.common.C8106e;
import com.sdkit.paylib.paylibnative.p033ui.common.error.C8107a;
import com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.C8229c;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.InterfaceC8238l;
import com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.deeplinkresult.f */
/* loaded from: classes5.dex */
public final class C8292f implements Factory {

    /* renamed from: a */
    public final Provider f3029a;

    /* renamed from: b */
    public final Provider f3030b;

    /* renamed from: c */
    public final Provider f3031c;

    /* renamed from: d */
    public final Provider f3032d;

    /* renamed from: e */
    public final Provider f3033e;

    /* renamed from: f */
    public final Provider f3034f;

    /* renamed from: g */
    public final Provider f3035g;

    /* renamed from: h */
    public final Provider f3036h;

    /* renamed from: i */
    public final Provider f3037i;

    public C8292f(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9) {
        this.f3029a = provider;
        this.f3030b = provider2;
        this.f3031c = provider3;
        this.f3032d = provider4;
        this.f3033e = provider5;
        this.f3034f = provider6;
        this.f3035g = provider7;
        this.f3036h = provider8;
        this.f3037i = provider9;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8290d get() {
        return m2780a((InterfaceC8097f) this.f3029a.get(), (InvoiceHolder) this.f3030b.get(), (InternalPaylibRouter) this.f3031c.get(), (InterfaceC8238l) this.f3032d.get(), (C8106e) this.f3033e.get(), (C8107a) this.f3034f.get(), (InterfaceC8131b) this.f3035g.get(), (C8229c) this.f3036h.get(), (PaylibLoggerFactory) this.f3037i.get());
    }

    /* renamed from: a */
    public static C8290d m2780a(InterfaceC8097f interfaceC8097f, InvoiceHolder invoiceHolder, InternalPaylibRouter internalPaylibRouter, InterfaceC8238l interfaceC8238l, C8106e c8106e, C8107a c8107a, InterfaceC8131b interfaceC8131b, C8229c c8229c, PaylibLoggerFactory paylibLoggerFactory) {
        return new C8290d(interfaceC8097f, invoiceHolder, internalPaylibRouter, interfaceC8238l, c8106e, c8107a, interfaceC8131b, c8229c, paylibLoggerFactory);
    }

    /* renamed from: a */
    public static C8292f m2781a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9) {
        return new C8292f(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }
}
