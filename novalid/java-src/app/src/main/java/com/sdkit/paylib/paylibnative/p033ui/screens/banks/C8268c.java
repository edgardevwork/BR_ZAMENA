package com.sdkit.paylib.paylibnative.p033ui.screens.banks;

import com.sdkit.paylib.paylibnative.p033ui.common.C8103b;
import com.sdkit.paylib.paylibnative.p033ui.rootcontainer.internaldi.AbstractC8258f;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.banks.c */
/* loaded from: classes5.dex */
public final class C8268c implements Factory {

    /* renamed from: a */
    public final Provider f2810a;

    /* renamed from: b */
    public final Provider f2811b;

    public C8268c(Provider provider, Provider provider2) {
        this.f2810a = provider;
        this.f2811b = provider2;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8267b get() {
        return m2583a((AbstractC8258f) this.f2810a.get(), (C8103b) this.f2811b.get());
    }

    /* renamed from: a */
    public static C8267b m2583a(AbstractC8258f abstractC8258f, C8103b c8103b) {
        return new C8267b(abstractC8258f, c8103b);
    }

    /* renamed from: a */
    public static C8268c m2584a(Provider provider, Provider provider2) {
        return new C8268c(provider, provider2);
    }
}
