package com.sdkit.paylib.paylibnative.p033ui.core.purchase.models;

import com.sdkit.paylib.paylibnative.p033ui.core.common.C8137b;
import com.sdkit.paylib.paylibnative.p033ui.core.purchase.actions.InterfaceC8147a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.core.purchase.models.c */
/* loaded from: classes6.dex */
public final class C8165c implements Factory {

    /* renamed from: a */
    public final Provider f2065a;

    /* renamed from: b */
    public final Provider f2066b;

    public C8165c(Provider provider, Provider provider2) {
        this.f2065a = provider;
        this.f2066b = provider2;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8164b get() {
        return m2088a((InterfaceC8147a) this.f2065a.get(), (C8137b) this.f2066b.get());
    }

    /* renamed from: a */
    public static C8164b m2088a(InterfaceC8147a interfaceC8147a, C8137b c8137b) {
        return new C8164b(interfaceC8147a, c8137b);
    }

    /* renamed from: a */
    public static C8165c m2089a(Provider provider, Provider provider2) {
        return new C8165c(provider, provider2);
    }
}
