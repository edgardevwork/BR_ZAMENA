package com.sdkit.paylib.paylibnetwork.impl.domain;

import com.sdkit.paylib.paylibnetwork.impl.domain.certificatepinning.C8464b;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnetwork.impl.domain.d */
/* loaded from: classes6.dex */
public final class C8478d implements Factory {

    /* renamed from: a */
    public final Provider f4171a;

    /* renamed from: b */
    public final Provider f4172b;

    public C8478d(Provider provider, Provider provider2) {
        this.f4171a = provider;
        this.f4172b = provider2;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8462c get() {
        return m3841a((C8464b) this.f4171a.get(), (C8479e) this.f4172b.get());
    }

    /* renamed from: a */
    public static C8462c m3841a(C8464b c8464b, C8479e c8479e) {
        return new C8462c(c8464b, c8479e);
    }

    /* renamed from: a */
    public static C8478d m3842a(Provider provider, Provider provider2) {
        return new C8478d(provider, provider2);
    }
}
