package com.sdkit.paylib.paylibpayment.impl.domain.network.subscriptions;

import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8533f;
import com.sdkit.paylib.paylibpayment.impl.domain.network.json.InterfaceC8556a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.subscriptions.b */
/* loaded from: classes5.dex */
public final class C8581b implements Factory {

    /* renamed from: a */
    public final Provider f5777a;

    /* renamed from: b */
    public final Provider f5778b;

    /* renamed from: c */
    public final Provider f5779c;

    /* renamed from: d */
    public final Provider f5780d;

    public C8581b(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f5777a = provider;
        this.f5778b = provider2;
        this.f5779c = provider3;
        this.f5780d = provider4;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8580a get() {
        return m4629a((C8582c) this.f5777a.get(), (C8533f) this.f5778b.get(), (InterfaceC8556a) this.f5779c.get(), (PaylibLoggerFactory) this.f5780d.get());
    }

    /* renamed from: a */
    public static C8580a m4629a(C8582c c8582c, C8533f c8533f, InterfaceC8556a interfaceC8556a, PaylibLoggerFactory paylibLoggerFactory) {
        return new C8580a(c8582c, c8533f, interfaceC8556a, paylibLoggerFactory);
    }

    /* renamed from: a */
    public static C8581b m4630a(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new C8581b(provider, provider2, provider3, provider4);
    }
}
