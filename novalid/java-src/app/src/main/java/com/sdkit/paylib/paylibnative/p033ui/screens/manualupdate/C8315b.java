package com.sdkit.paylib.paylibnative.p033ui.screens.manualupdate;

import com.sdkit.paylib.paylibnative.p033ui.common.C8103b;
import com.sdkit.paylib.paylibnative.p033ui.rootcontainer.internaldi.AbstractC8258f;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.manualupdate.b */
/* loaded from: classes7.dex */
public final class C8315b implements Factory {

    /* renamed from: a */
    public final Provider f3232a;

    /* renamed from: b */
    public final Provider f3233b;

    public C8315b(Provider provider, Provider provider2) {
        this.f3232a = provider;
        this.f3233b = provider2;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8314a get() {
        return m2968a((AbstractC8258f) this.f3232a.get(), (C8103b) this.f3233b.get());
    }

    /* renamed from: a */
    public static C8314a m2968a(AbstractC8258f abstractC8258f, C8103b c8103b) {
        return new C8314a(abstractC8258f, c8103b);
    }

    /* renamed from: a */
    public static C8315b m2969a(Provider provider, Provider provider2) {
        return new C8315b(provider, provider2);
    }
}
