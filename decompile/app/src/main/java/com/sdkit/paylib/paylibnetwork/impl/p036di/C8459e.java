package com.sdkit.paylib.paylibnetwork.impl.p036di;

import com.sdkit.paylib.paylibnetwork.impl.domain.C8479e;
import com.sdkit.paylib.paylibnetwork.impl.domain.C8480f;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnetwork.impl.di.e */
/* loaded from: classes6.dex */
public final class C8459e implements Factory {

    /* renamed from: a */
    public final Provider f4133a;

    public C8459e(Provider provider) {
        this.f4133a = provider;
    }

    /* renamed from: a */
    public static C8459e m3807a(Provider provider) {
        return new C8459e(provider);
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8479e get() {
        return m3808a((C8480f) this.f4133a.get());
    }

    /* renamed from: a */
    public static C8479e m3808a(C8480f c8480f) {
        return (C8479e) Preconditions.checkNotNullFromProvides(C8457c.f4130a.m3803a(c8480f));
    }
}
