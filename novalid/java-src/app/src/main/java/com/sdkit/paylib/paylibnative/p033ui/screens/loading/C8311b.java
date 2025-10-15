package com.sdkit.paylib.paylibnative.p033ui.screens.loading;

import com.sdkit.paylib.paylibnative.p033ui.common.C8103b;
import com.sdkit.paylib.paylibnative.p033ui.rootcontainer.internaldi.AbstractC8258f;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.loading.b */
/* loaded from: classes7.dex */
public final class C8311b implements Factory {

    /* renamed from: a */
    public final Provider f3205a;

    /* renamed from: b */
    public final Provider f3206b;

    public C8311b(Provider provider, Provider provider2) {
        this.f3205a = provider;
        this.f3206b = provider2;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8310a get() {
        return m2947a((AbstractC8258f) this.f3205a.get(), (C8103b) this.f3206b.get());
    }

    /* renamed from: a */
    public static C8310a m2947a(AbstractC8258f abstractC8258f, C8103b c8103b) {
        return new C8310a(abstractC8258f, c8103b);
    }

    /* renamed from: a */
    public static C8311b m2948a(Provider provider, Provider provider2) {
        return new C8311b(provider, provider2);
    }
}
