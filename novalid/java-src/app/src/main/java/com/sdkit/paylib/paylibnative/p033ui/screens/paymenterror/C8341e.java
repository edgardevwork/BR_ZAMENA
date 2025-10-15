package com.sdkit.paylib.paylibnative.p033ui.screens.paymenterror;

import com.sdkit.paylib.paylibnative.p033ui.common.C8103b;
import com.sdkit.paylib.paylibnative.p033ui.rootcontainer.internaldi.AbstractC8258f;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.paymenterror.e */
/* loaded from: classes7.dex */
public final class C8341e implements Factory {

    /* renamed from: a */
    public final Provider f3477a;

    /* renamed from: b */
    public final Provider f3478b;

    public C8341e(Provider provider, Provider provider2) {
        this.f3477a = provider;
        this.f3478b = provider2;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8339c get() {
        return m3244a((AbstractC8258f) this.f3477a.get(), (C8103b) this.f3478b.get());
    }

    /* renamed from: a */
    public static C8339c m3244a(AbstractC8258f abstractC8258f, C8103b c8103b) {
        return new C8339c(abstractC8258f, c8103b);
    }

    /* renamed from: a */
    public static C8341e m3245a(Provider provider, Provider provider2) {
        return new C8341e(provider, provider2);
    }
}
