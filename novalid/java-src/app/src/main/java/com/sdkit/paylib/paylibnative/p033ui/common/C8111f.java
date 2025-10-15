package com.sdkit.paylib.paylibnative.p033ui.common;

import com.sdkit.paylib.paylibdomain.api.invoice.InvoicePaymentInteractor;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibnative.p033ui.analytics.InterfaceC8097f;
import com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b;
import com.sdkit.paylib.paylibnative.p033ui.core.purchase.models.InterfaceC8166d;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.InterfaceC8232f;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.InterfaceC8238l;
import com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.common.f */
/* loaded from: classes6.dex */
public final class C8111f implements Factory {

    /* renamed from: a */
    public final Provider f1882a;

    /* renamed from: b */
    public final Provider f1883b;

    /* renamed from: c */
    public final Provider f1884c;

    /* renamed from: d */
    public final Provider f1885d;

    /* renamed from: e */
    public final Provider f1886e;

    /* renamed from: f */
    public final Provider f1887f;

    /* renamed from: g */
    public final Provider f1888g;

    /* renamed from: h */
    public final Provider f1889h;

    public C8111f(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8) {
        this.f1882a = provider;
        this.f1883b = provider2;
        this.f1884c = provider3;
        this.f1885d = provider4;
        this.f1886e = provider5;
        this.f1887f = provider6;
        this.f1888g = provider7;
        this.f1889h = provider8;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8106e get() {
        return m1937a((InterfaceC8097f) this.f1882a.get(), (InterfaceC8131b) this.f1883b.get(), (InterfaceC8166d) this.f1884c.get(), (InvoicePaymentInteractor) this.f1885d.get(), (InterfaceC8238l) this.f1886e.get(), (InterfaceC8232f) this.f1887f.get(), (InternalPaylibRouter) this.f1888g.get(), (PaylibLoggerFactory) this.f1889h.get());
    }

    /* renamed from: a */
    public static C8106e m1937a(InterfaceC8097f interfaceC8097f, InterfaceC8131b interfaceC8131b, InterfaceC8166d interfaceC8166d, InvoicePaymentInteractor invoicePaymentInteractor, InterfaceC8238l interfaceC8238l, InterfaceC8232f interfaceC8232f, InternalPaylibRouter internalPaylibRouter, PaylibLoggerFactory paylibLoggerFactory) {
        return new C8106e(interfaceC8097f, interfaceC8131b, interfaceC8166d, invoicePaymentInteractor, interfaceC8238l, interfaceC8232f, internalPaylibRouter, paylibLoggerFactory);
    }

    /* renamed from: a */
    public static C8111f m1938a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8) {
        return new C8111f(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }
}
