package com.sdkit.paylib.paylibnative.p033ui.launcher.domain;

import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.domain.b */
/* loaded from: classes6.dex */
public final class C8228b implements Factory {

    /* renamed from: a */
    public final Provider f2439a;

    /* renamed from: b */
    public final Provider f2440b;

    /* renamed from: c */
    public final Provider f2441c;

    public C8228b(Provider provider, Provider provider2, Provider provider3) {
        this.f2439a = provider;
        this.f2440b = provider2;
        this.f2441c = provider3;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8227a get() {
        return m2270a((InterfaceC8238l) this.f2439a.get(), (C8235i) this.f2440b.get(), (PaylibLoggerFactory) this.f2441c.get());
    }

    /* renamed from: a */
    public static C8227a m2270a(InterfaceC8238l interfaceC8238l, C8235i c8235i, PaylibLoggerFactory paylibLoggerFactory) {
        return new C8227a(interfaceC8238l, c8235i, paylibLoggerFactory);
    }

    /* renamed from: a */
    public static C8228b m2271a(Provider provider, Provider provider2, Provider provider3) {
        return new C8228b(provider, provider2, provider3);
    }
}
