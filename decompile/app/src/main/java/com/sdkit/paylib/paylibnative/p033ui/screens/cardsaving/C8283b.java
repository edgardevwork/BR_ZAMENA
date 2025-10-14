package com.sdkit.paylib.paylibnative.p033ui.screens.cardsaving;

import com.sdkit.paylib.paylibnative.p033ui.common.C8103b;
import com.sdkit.paylib.paylibnative.p033ui.rootcontainer.internaldi.AbstractC8258f;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.cardsaving.b */
/* loaded from: classes5.dex */
public final class C8283b implements Factory {

    /* renamed from: a */
    public final Provider f2956a;

    /* renamed from: b */
    public final Provider f2957b;

    public C8283b(Provider provider, Provider provider2) {
        this.f2956a = provider;
        this.f2957b = provider2;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8282a get() {
        return m2701a((AbstractC8258f) this.f2956a.get(), (C8103b) this.f2957b.get());
    }

    /* renamed from: a */
    public static C8282a m2701a(AbstractC8258f abstractC8258f, C8103b c8103b) {
        return new C8282a(abstractC8258f, c8103b);
    }

    /* renamed from: a */
    public static C8283b m2702a(Provider provider, Provider provider2) {
        return new C8283b(provider, provider2);
    }
}
