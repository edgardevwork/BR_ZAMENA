package com.sdkit.paylib.paylibnative.p033ui.launcher.domain;

import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.domain.j */
/* loaded from: classes6.dex */
public final class C8236j implements Factory {

    /* renamed from: a */
    public final Provider f2467a;

    public C8236j(Provider provider) {
        this.f2467a = provider;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8235i get() {
        return m2295a((InterfaceC8238l) this.f2467a.get());
    }

    /* renamed from: a */
    public static C8235i m2295a(InterfaceC8238l interfaceC8238l) {
        return new C8235i(interfaceC8238l);
    }

    /* renamed from: a */
    public static C8236j m2296a(Provider provider) {
        return new C8236j(provider);
    }
}
