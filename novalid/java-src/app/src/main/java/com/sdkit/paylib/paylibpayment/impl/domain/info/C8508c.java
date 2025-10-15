package com.sdkit.paylib.paylibpayment.impl.domain.info;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.info.c */
/* loaded from: classes8.dex */
public final class C8508c implements Factory {

    /* renamed from: a */
    public final Provider f4829a;

    public C8508c(Provider provider) {
        this.f4829a = provider;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8507b get() {
        return m3946a((Context) this.f4829a.get());
    }

    /* renamed from: a */
    public static C8507b m3946a(Context context) {
        return new C8507b(context);
    }

    /* renamed from: a */
    public static C8508c m3947a(Provider provider) {
        return new C8508c(provider);
    }
}
