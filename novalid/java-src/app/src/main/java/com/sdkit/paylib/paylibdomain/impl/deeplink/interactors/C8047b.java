package com.sdkit.paylib.paylibdomain.impl.deeplink.interactors;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibdomain.impl.deeplink.interactors.b */
/* loaded from: classes7.dex */
public final class C8047b implements Factory {

    /* renamed from: a */
    public final Provider f1165a;

    public C8047b(Provider provider) {
        this.f1165a = provider;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8046a get() {
        return m1490a((Context) this.f1165a.get());
    }

    /* renamed from: a */
    public static C8046a m1490a(Context context) {
        return new C8046a(context);
    }

    /* renamed from: a */
    public static C8047b m1491a(Provider provider) {
        return new C8047b(provider);
    }
}
