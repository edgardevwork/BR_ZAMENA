package com.sdkit.paylib.paylibpayment.impl.domain.network.cards;

import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibpayment.impl.domain.info.InterfaceC8511f;
import com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8533f;
import com.sdkit.paylib.paylibpayment.impl.domain.network.json.InterfaceC8556a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.cards.c */
/* loaded from: classes8.dex */
public final class C8525c implements Factory {

    /* renamed from: a */
    public final Provider f4874a;

    /* renamed from: b */
    public final Provider f4875b;

    /* renamed from: c */
    public final Provider f4876c;

    /* renamed from: d */
    public final Provider f4877d;

    /* renamed from: e */
    public final Provider f4878e;

    public C8525c(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f4874a = provider;
        this.f4875b = provider2;
        this.f4876c = provider3;
        this.f4877d = provider4;
        this.f4878e = provider5;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8523a get() {
        return m3990a((C8526d) this.f4874a.get(), (C8533f) this.f4875b.get(), (InterfaceC8511f) this.f4876c.get(), (InterfaceC8556a) this.f4877d.get(), (PaylibLoggerFactory) this.f4878e.get());
    }

    /* renamed from: a */
    public static C8523a m3990a(C8526d c8526d, C8533f c8533f, InterfaceC8511f interfaceC8511f, InterfaceC8556a interfaceC8556a, PaylibLoggerFactory paylibLoggerFactory) {
        return new C8523a(c8526d, c8533f, interfaceC8511f, interfaceC8556a, paylibLoggerFactory);
    }

    /* renamed from: a */
    public static C8525c m3991a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new C8525c(provider, provider2, provider3, provider4, provider5);
    }
}
