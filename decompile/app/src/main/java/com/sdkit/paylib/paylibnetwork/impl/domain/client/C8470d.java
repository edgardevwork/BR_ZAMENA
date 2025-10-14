package com.sdkit.paylib.paylibnetwork.impl.domain.client;

import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnetwork.impl.domain.client.d */
/* loaded from: classes6.dex */
public final class C8470d implements Factory {

    /* renamed from: a */
    public final Provider f4152a;

    public C8470d(Provider provider) {
        this.f4152a = provider;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8469c get() {
        return m3824a((C8471e) this.f4152a.get());
    }

    /* renamed from: a */
    public static C8469c m3824a(C8471e c8471e) {
        return new C8469c(c8471e);
    }

    /* renamed from: a */
    public static C8470d m3825a(Provider provider) {
        return new C8470d(provider);
    }
}
