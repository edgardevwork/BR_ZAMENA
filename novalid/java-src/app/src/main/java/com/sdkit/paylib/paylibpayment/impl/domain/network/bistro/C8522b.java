package com.sdkit.paylib.paylibpayment.impl.domain.network.bistro;

import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8533f;
import com.sdkit.paylib.paylibpayment.impl.domain.network.json.InterfaceC8556a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.bistro.b */
/* loaded from: classes8.dex */
public final class C8522b implements Factory {

    /* renamed from: a */
    public final Provider f4862a;

    /* renamed from: b */
    public final Provider f4863b;

    /* renamed from: c */
    public final Provider f4864c;

    public C8522b(Provider provider, Provider provider2, Provider provider3) {
        this.f4862a = provider;
        this.f4863b = provider2;
        this.f4864c = provider3;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8521a get() {
        return m3979a((C8533f) this.f4862a.get(), (InterfaceC8556a) this.f4863b.get(), (PaylibLoggerFactory) this.f4864c.get());
    }

    /* renamed from: a */
    public static C8521a m3979a(C8533f c8533f, InterfaceC8556a interfaceC8556a, PaylibLoggerFactory paylibLoggerFactory) {
        return new C8521a(c8533f, interfaceC8556a, paylibLoggerFactory);
    }

    /* renamed from: a */
    public static C8522b m3980a(Provider provider, Provider provider2, Provider provider3) {
        return new C8522b(provider, provider2, provider3);
    }
}
