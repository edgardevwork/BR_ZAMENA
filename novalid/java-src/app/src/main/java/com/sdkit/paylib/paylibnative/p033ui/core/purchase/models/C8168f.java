package com.sdkit.paylib.paylibnative.p033ui.core.purchase.models;

import com.sdkit.paylib.paylibnative.p033ui.core.common.C8137b;
import com.sdkit.paylib.paylibnative.p033ui.core.purchase.actions.InterfaceC8150d;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.core.purchase.models.f */
/* loaded from: classes6.dex */
public final class C8168f implements Factory {

    /* renamed from: a */
    public final Provider f2067a;

    /* renamed from: b */
    public final Provider f2068b;

    public C8168f(Provider provider, Provider provider2) {
        this.f2067a = provider;
        this.f2068b = provider2;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8167e get() {
        return m2091a((InterfaceC8150d) this.f2067a.get(), (C8137b) this.f2068b.get());
    }

    /* renamed from: a */
    public static C8167e m2091a(InterfaceC8150d interfaceC8150d, C8137b c8137b) {
        return new C8167e(interfaceC8150d, c8137b);
    }

    /* renamed from: a */
    public static C8168f m2092a(Provider provider, Provider provider2) {
        return new C8168f(provider, provider2);
    }
}
