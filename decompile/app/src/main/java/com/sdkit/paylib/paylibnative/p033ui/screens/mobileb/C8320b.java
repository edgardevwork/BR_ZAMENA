package com.sdkit.paylib.paylibnative.p033ui.screens.mobileb;

import com.sdkit.paylib.paylibnative.p033ui.common.C8103b;
import com.sdkit.paylib.paylibnative.p033ui.rootcontainer.internaldi.AbstractC8258f;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileb.b */
/* loaded from: classes7.dex */
public final class C8320b implements Factory {

    /* renamed from: a */
    public final Provider f3277a;

    /* renamed from: b */
    public final Provider f3278b;

    public C8320b(Provider provider, Provider provider2) {
        this.f3277a = provider;
        this.f3278b = provider2;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8319a get() {
        return m3014a((AbstractC8258f) this.f3277a.get(), (C8103b) this.f3278b.get());
    }

    /* renamed from: a */
    public static C8319a m3014a(AbstractC8258f abstractC8258f, C8103b c8103b) {
        return new C8319a(abstractC8258f, c8103b);
    }

    /* renamed from: a */
    public static C8320b m3015a(Provider provider, Provider provider2) {
        return new C8320b(provider, provider2);
    }
}
