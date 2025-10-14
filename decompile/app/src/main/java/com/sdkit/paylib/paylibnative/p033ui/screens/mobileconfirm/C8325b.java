package com.sdkit.paylib.paylibnative.p033ui.screens.mobileconfirm;

import com.sdkit.paylib.paylibnative.p033ui.common.C8103b;
import com.sdkit.paylib.paylibnative.p033ui.rootcontainer.internaldi.AbstractC8258f;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileconfirm.b */
/* loaded from: classes7.dex */
public final class C8325b implements Factory {

    /* renamed from: a */
    public final Provider f3321a;

    /* renamed from: b */
    public final Provider f3322b;

    public C8325b(Provider provider, Provider provider2) {
        this.f3321a = provider;
        this.f3322b = provider2;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8324a get() {
        return m3066a((AbstractC8258f) this.f3321a.get(), (C8103b) this.f3322b.get());
    }

    /* renamed from: a */
    public static C8324a m3066a(AbstractC8258f abstractC8258f, C8103b c8103b) {
        return new C8324a(abstractC8258f, c8103b);
    }

    /* renamed from: a */
    public static C8325b m3067a(Provider provider, Provider provider2) {
        return new C8325b(provider, provider2);
    }
}
