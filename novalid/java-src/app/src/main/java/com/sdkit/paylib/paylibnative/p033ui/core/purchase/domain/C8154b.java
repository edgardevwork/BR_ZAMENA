package com.sdkit.paylib.paylibnative.p033ui.core.purchase.domain;

import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.InterfaceC8238l;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.core.purchase.domain.b */
/* loaded from: classes6.dex */
public final class C8154b implements Factory {

    /* renamed from: a */
    public final Provider f2047a;

    public C8154b(Provider provider) {
        this.f2047a = provider;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8153a get() {
        return m2070a((InterfaceC8238l) this.f2047a.get());
    }

    /* renamed from: a */
    public static C8153a m2070a(InterfaceC8238l interfaceC8238l) {
        return new C8153a(interfaceC8238l);
    }

    /* renamed from: a */
    public static C8154b m2071a(Provider provider) {
        return new C8154b(provider);
    }
}
