package com.sdkit.paylib.paylibnative.p033ui.launcher.domain;

import com.sdkit.paylib.paylibdomain.api.invoice.InvoiceHolder;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.domain.d */
/* loaded from: classes6.dex */
public final class C8230d implements Factory {

    /* renamed from: a */
    public final Provider f2453a;

    /* renamed from: b */
    public final Provider f2454b;

    /* renamed from: c */
    public final Provider f2455c;

    public C8230d(Provider provider, Provider provider2, Provider provider3) {
        this.f2453a = provider;
        this.f2454b = provider2;
        this.f2455c = provider3;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8229c get() {
        return m2277a((InvoiceHolder) this.f2453a.get(), (InterfaceC8238l) this.f2454b.get(), (PaylibLoggerFactory) this.f2455c.get());
    }

    /* renamed from: a */
    public static C8229c m2277a(InvoiceHolder invoiceHolder, InterfaceC8238l interfaceC8238l, PaylibLoggerFactory paylibLoggerFactory) {
        return new C8229c(invoiceHolder, interfaceC8238l, paylibLoggerFactory);
    }

    /* renamed from: a */
    public static C8230d m2278a(Provider provider, Provider provider2, Provider provider3) {
        return new C8230d(provider, provider2, provider3);
    }
}
