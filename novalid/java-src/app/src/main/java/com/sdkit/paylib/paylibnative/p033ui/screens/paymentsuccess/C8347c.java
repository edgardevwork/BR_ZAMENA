package com.sdkit.paylib.paylibnative.p033ui.screens.paymentsuccess;

import com.sdkit.paylib.paylibnative.p033ui.common.C8103b;
import com.sdkit.paylib.paylibnative.p033ui.rootcontainer.internaldi.AbstractC8258f;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.paymentsuccess.c */
/* loaded from: classes7.dex */
public final class C8347c implements Factory {

    /* renamed from: a */
    public final Provider f3520a;

    /* renamed from: b */
    public final Provider f3521b;

    public C8347c(Provider provider, Provider provider2) {
        this.f3520a = provider;
        this.f3521b = provider2;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8345a get() {
        return m3282a((AbstractC8258f) this.f3520a.get(), (C8103b) this.f3521b.get());
    }

    /* renamed from: a */
    public static C8345a m3282a(AbstractC8258f abstractC8258f, C8103b c8103b) {
        return new C8345a(abstractC8258f, c8103b);
    }

    /* renamed from: a */
    public static C8347c m3283a(Provider provider, Provider provider2) {
        return new C8347c(provider, provider2);
    }
}
