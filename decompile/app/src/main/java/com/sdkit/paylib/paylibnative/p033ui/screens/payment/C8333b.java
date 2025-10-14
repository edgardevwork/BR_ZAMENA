package com.sdkit.paylib.paylibnative.p033ui.screens.payment;

import com.sdkit.paylib.paylibnative.p033ui.common.C8103b;
import com.sdkit.paylib.paylibnative.p033ui.rootcontainer.internaldi.AbstractC8258f;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.payment.b */
/* loaded from: classes7.dex */
public final class C8333b implements Factory {

    /* renamed from: a */
    public final Provider f3398a;

    /* renamed from: b */
    public final Provider f3399b;

    public C8333b(Provider provider, Provider provider2) {
        this.f3398a = provider;
        this.f3399b = provider2;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8332a get() {
        return m3155a((AbstractC8258f) this.f3398a.get(), (C8103b) this.f3399b.get());
    }

    /* renamed from: a */
    public static C8332a m3155a(AbstractC8258f abstractC8258f, C8103b c8103b) {
        return new C8332a(abstractC8258f, c8103b);
    }

    /* renamed from: a */
    public static C8333b m3156a(Provider provider, Provider provider2) {
        return new C8333b(provider, provider2);
    }
}
