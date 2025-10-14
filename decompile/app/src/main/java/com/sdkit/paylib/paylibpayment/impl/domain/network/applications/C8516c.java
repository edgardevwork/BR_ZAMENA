package com.sdkit.paylib.paylibpayment.impl.domain.network.applications;

import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8533f;
import com.sdkit.paylib.paylibpayment.impl.domain.network.json.InterfaceC8556a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.applications.c */
/* loaded from: classes8.dex */
public final class C8516c implements Factory {

    /* renamed from: a */
    public final Provider f4852a;

    /* renamed from: b */
    public final Provider f4853b;

    /* renamed from: c */
    public final Provider f4854c;

    /* renamed from: d */
    public final Provider f4855d;

    public C8516c(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f4852a = provider;
        this.f4853b = provider2;
        this.f4854c = provider3;
        this.f4855d = provider4;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8514a get() {
        return m3965a((C8517d) this.f4852a.get(), (C8533f) this.f4853b.get(), (InterfaceC8556a) this.f4854c.get(), (PaylibLoggerFactory) this.f4855d.get());
    }

    /* renamed from: a */
    public static C8514a m3965a(C8517d c8517d, C8533f c8533f, InterfaceC8556a interfaceC8556a, PaylibLoggerFactory paylibLoggerFactory) {
        return new C8514a(c8517d, c8533f, interfaceC8556a, paylibLoggerFactory);
    }

    /* renamed from: a */
    public static C8516c m3966a(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new C8516c(provider, provider2, provider3, provider4);
    }
}
