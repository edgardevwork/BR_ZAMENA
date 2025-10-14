package com.sdkit.paylib.paylibpayment.impl.domain.info;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.info.e */
/* loaded from: classes8.dex */
public final class C8510e implements Factory {

    /* renamed from: a */
    public final Provider f4832a;

    public C8510e(Provider provider) {
        this.f4832a = provider;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8509d get() {
        return m3950a((Context) this.f4832a.get());
    }

    /* renamed from: a */
    public static C8509d m3950a(Context context) {
        return new C8509d(context);
    }

    /* renamed from: a */
    public static C8510e m3951a(Provider provider) {
        return new C8510e(provider);
    }
}
