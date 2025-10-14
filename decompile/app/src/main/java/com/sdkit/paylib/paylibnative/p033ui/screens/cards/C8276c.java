package com.sdkit.paylib.paylibnative.p033ui.screens.cards;

import com.sdkit.paylib.paylibnative.p033ui.common.C8103b;
import com.sdkit.paylib.paylibnative.p033ui.rootcontainer.internaldi.AbstractC8258f;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.cards.c */
/* loaded from: classes5.dex */
public final class C8276c implements Factory {

    /* renamed from: a */
    public final Provider f2865a;

    /* renamed from: b */
    public final Provider f2866b;

    public C8276c(Provider provider, Provider provider2) {
        this.f2865a = provider;
        this.f2866b = provider2;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8275b get() {
        return m2640a((AbstractC8258f) this.f2865a.get(), (C8103b) this.f2866b.get());
    }

    /* renamed from: a */
    public static C8275b m2640a(AbstractC8258f abstractC8258f, C8103b c8103b) {
        return new C8275b(abstractC8258f, c8103b);
    }

    /* renamed from: a */
    public static C8276c m2641a(Provider provider, Provider provider2) {
        return new C8276c(provider, provider2);
    }
}
