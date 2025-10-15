package com.sdkit.paylib.paylibnative.p033ui.launcher.domain;

import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.domain.n */
/* loaded from: classes6.dex */
public final class C8240n implements Factory {

    /* renamed from: a */
    public final Provider f2525a;

    /* renamed from: b */
    public final Provider f2526b;

    public C8240n(Provider provider, Provider provider2) {
        this.f2525a = provider;
        this.f2526b = provider2;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8239m get() {
        return m2357a((PaylibLoggerFactory) this.f2525a.get(), (InterfaceC8232f) this.f2526b.get());
    }

    /* renamed from: a */
    public static C8239m m2357a(PaylibLoggerFactory paylibLoggerFactory, InterfaceC8232f interfaceC8232f) {
        return new C8239m(paylibLoggerFactory, interfaceC8232f);
    }

    /* renamed from: a */
    public static C8240n m2358a(Provider provider, Provider provider2) {
        return new C8240n(provider, provider2);
    }
}
