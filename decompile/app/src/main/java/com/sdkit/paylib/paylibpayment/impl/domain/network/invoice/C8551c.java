package com.sdkit.paylib.paylibpayment.impl.domain.network.invoice;

import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibpayment.impl.domain.info.InterfaceC8511f;
import com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8533f;
import com.sdkit.paylib.paylibpayment.impl.domain.network.json.InterfaceC8556a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.invoice.c */
/* loaded from: classes8.dex */
public final class C8551c implements Factory {

    /* renamed from: a */
    public final Provider f5010a;

    /* renamed from: b */
    public final Provider f5011b;

    /* renamed from: c */
    public final Provider f5012c;

    /* renamed from: d */
    public final Provider f5013d;

    /* renamed from: e */
    public final Provider f5014e;

    /* renamed from: f */
    public final Provider f5015f;

    public C8551c(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f5010a = provider;
        this.f5011b = provider2;
        this.f5012c = provider3;
        this.f5013d = provider4;
        this.f5014e = provider5;
        this.f5015f = provider6;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8549a get() {
        return m4124a((C8552d) this.f5010a.get(), (C8533f) this.f5011b.get(), (InterfaceC8511f) this.f5012c.get(), (C8554f) this.f5013d.get(), (InterfaceC8556a) this.f5014e.get(), (PaylibLoggerFactory) this.f5015f.get());
    }

    /* renamed from: a */
    public static C8549a m4124a(C8552d c8552d, C8533f c8533f, InterfaceC8511f interfaceC8511f, C8554f c8554f, InterfaceC8556a interfaceC8556a, PaylibLoggerFactory paylibLoggerFactory) {
        return new C8549a(c8552d, c8533f, interfaceC8511f, c8554f, interfaceC8556a, paylibLoggerFactory);
    }

    /* renamed from: a */
    public static C8551c m4125a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        return new C8551c(provider, provider2, provider3, provider4, provider5, provider6);
    }
}
