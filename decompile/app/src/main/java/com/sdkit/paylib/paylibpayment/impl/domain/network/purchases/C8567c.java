package com.sdkit.paylib.paylibpayment.impl.domain.network.purchases;

import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibpayment.impl.domain.info.InterfaceC8511f;
import com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8533f;
import com.sdkit.paylib.paylibpayment.impl.domain.network.json.InterfaceC8556a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.purchases.c */
/* loaded from: classes8.dex */
public final class C8567c implements Factory {

    /* renamed from: a */
    public final Provider f5063a;

    /* renamed from: b */
    public final Provider f5064b;

    /* renamed from: c */
    public final Provider f5065c;

    /* renamed from: d */
    public final Provider f5066d;

    /* renamed from: e */
    public final Provider f5067e;

    public C8567c(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f5063a = provider;
        this.f5064b = provider2;
        this.f5065c = provider3;
        this.f5066d = provider4;
        this.f5067e = provider5;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8565a get() {
        return m4182a((C8568d) this.f5063a.get(), (C8533f) this.f5064b.get(), (InterfaceC8511f) this.f5065c.get(), (InterfaceC8556a) this.f5066d.get(), (PaylibLoggerFactory) this.f5067e.get());
    }

    /* renamed from: a */
    public static C8565a m4182a(C8568d c8568d, C8533f c8533f, InterfaceC8511f interfaceC8511f, InterfaceC8556a interfaceC8556a, PaylibLoggerFactory paylibLoggerFactory) {
        return new C8565a(c8568d, c8533f, interfaceC8511f, interfaceC8556a, paylibLoggerFactory);
    }

    /* renamed from: a */
    public static C8567c m4183a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new C8567c(provider, provider2, provider3, provider4, provider5);
    }
}
