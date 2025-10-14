package com.sdkit.paylib.paylibpayment.impl.domain.network.data;

import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibpayment.api.config.BackendUrlProvider;
import com.sdkit.paylib.paylibpayment.impl.domain.network.data.interceptor.C8537a;
import com.sdkit.paylib.paylibpayment.impl.domain.network.data.okhttp.C8545a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.data.i */
/* loaded from: classes8.dex */
public final class C8536i implements Factory {

    /* renamed from: a */
    public final Provider f4929a;

    /* renamed from: b */
    public final Provider f4930b;

    /* renamed from: c */
    public final Provider f4931c;

    /* renamed from: d */
    public final Provider f4932d;

    /* renamed from: e */
    public final Provider f4933e;

    /* renamed from: f */
    public final Provider f4934f;

    /* renamed from: g */
    public final Provider f4935g;

    public C8536i(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.f4929a = provider;
        this.f4930b = provider2;
        this.f4931c = provider3;
        this.f4932d = provider4;
        this.f4933e = provider5;
        this.f4934f = provider6;
        this.f4935g = provider7;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8533f get() {
        return m4054a((C8545a) this.f4929a.get(), (C8543n) this.f4930b.get(), (BackendUrlProvider) this.f4931c.get(), (C8530c) this.f4932d.get(), (C8537a) this.f4933e.get(), (InterfaceC8540k) this.f4934f.get(), (PaylibLoggerFactory) this.f4935g.get());
    }

    /* renamed from: a */
    public static C8533f m4054a(C8545a c8545a, C8543n c8543n, BackendUrlProvider backendUrlProvider, C8530c c8530c, C8537a c8537a, InterfaceC8540k interfaceC8540k, PaylibLoggerFactory paylibLoggerFactory) {
        return new C8533f(c8545a, c8543n, backendUrlProvider, c8530c, c8537a, interfaceC8540k, paylibLoggerFactory);
    }

    /* renamed from: a */
    public static C8536i m4055a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        return new C8536i(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }
}
