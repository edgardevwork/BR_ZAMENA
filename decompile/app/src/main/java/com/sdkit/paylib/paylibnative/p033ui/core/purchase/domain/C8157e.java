package com.sdkit.paylib.paylibnative.p033ui.core.purchase.domain;

import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.InterfaceC8238l;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.core.purchase.domain.e */
/* loaded from: classes6.dex */
public final class C8157e implements Factory {

    /* renamed from: a */
    public final Provider f2049a;

    public C8157e(Provider provider) {
        this.f2049a = provider;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8156d get() {
        return m2073a((InterfaceC8238l) this.f2049a.get());
    }

    /* renamed from: a */
    public static C8156d m2073a(InterfaceC8238l interfaceC8238l) {
        return new C8156d(interfaceC8238l);
    }

    /* renamed from: a */
    public static C8157e m2074a(Provider provider) {
        return new C8157e(provider);
    }
}
