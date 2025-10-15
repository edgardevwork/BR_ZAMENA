package com.sdkit.paylib.paylibpayment.impl.domain.network.products;

import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibpayment.impl.domain.info.InterfaceC8511f;
import com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8533f;
import com.sdkit.paylib.paylibpayment.impl.domain.network.json.InterfaceC8556a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.products.c */
/* loaded from: classes8.dex */
public final class C8562c implements Factory {

    /* renamed from: a */
    public final Provider f5044a;

    /* renamed from: b */
    public final Provider f5045b;

    /* renamed from: c */
    public final Provider f5046c;

    /* renamed from: d */
    public final Provider f5047d;

    /* renamed from: e */
    public final Provider f5048e;

    public C8562c(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f5044a = provider;
        this.f5045b = provider2;
        this.f5046c = provider3;
        this.f5047d = provider4;
        this.f5048e = provider5;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8560a get() {
        return m4159a((C8563d) this.f5044a.get(), (C8533f) this.f5045b.get(), (InterfaceC8511f) this.f5046c.get(), (InterfaceC8556a) this.f5047d.get(), (PaylibLoggerFactory) this.f5048e.get());
    }

    /* renamed from: a */
    public static C8560a m4159a(C8563d c8563d, C8533f c8533f, InterfaceC8511f interfaceC8511f, InterfaceC8556a interfaceC8556a, PaylibLoggerFactory paylibLoggerFactory) {
        return new C8560a(c8563d, c8533f, interfaceC8511f, interfaceC8556a, paylibLoggerFactory);
    }

    /* renamed from: a */
    public static C8562c m4160a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new C8562c(provider, provider2, provider3, provider4, provider5);
    }
}
