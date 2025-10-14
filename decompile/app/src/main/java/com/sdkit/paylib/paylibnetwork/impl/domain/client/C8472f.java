package com.sdkit.paylib.paylibnetwork.impl.domain.client;

import com.sdkit.paylib.paylibnetwork.impl.domain.C8462c;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnetwork.impl.domain.client.f */
/* loaded from: classes6.dex */
public final class C8472f implements Factory {

    /* renamed from: a */
    public final Provider f4154a;

    public C8472f(Provider provider) {
        this.f4154a = provider;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8471e get() {
        return m3829a((C8462c) this.f4154a.get());
    }

    /* renamed from: a */
    public static C8471e m3829a(C8462c c8462c) {
        return new C8471e(c8462c);
    }

    /* renamed from: a */
    public static C8472f m3830a(Provider provider) {
        return new C8472f(provider);
    }
}
