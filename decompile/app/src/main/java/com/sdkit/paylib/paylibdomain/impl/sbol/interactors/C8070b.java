package com.sdkit.paylib.paylibdomain.impl.sbol.interactors;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibdomain.impl.sbol.interactors.b */
/* loaded from: classes6.dex */
public final class C8070b implements Factory {

    /* renamed from: a */
    public final Provider f1474a;

    public C8070b(Provider provider) {
        this.f1474a = provider;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8069a get() {
        return m1647a((Context) this.f1474a.get());
    }

    /* renamed from: a */
    public static C8069a m1647a(Context context) {
        return new C8069a(context);
    }

    /* renamed from: a */
    public static C8070b m1648a(Provider provider) {
        return new C8070b(provider);
    }
}
