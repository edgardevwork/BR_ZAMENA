package com.sdkit.paylib.paylibnative.p033ui.screens.invoice.viewobjects;

import com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.invoice.viewobjects.c */
/* loaded from: classes7.dex */
public final class C8300c implements Factory {

    /* renamed from: a */
    public final Provider f3149a;

    public C8300c(Provider provider) {
        this.f3149a = provider;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8299b get() {
        return m2889a((InterfaceC8131b) this.f3149a.get());
    }

    /* renamed from: a */
    public static C8299b m2889a(InterfaceC8131b interfaceC8131b) {
        return new C8299b(interfaceC8131b);
    }

    /* renamed from: a */
    public static C8300c m2890a(Provider provider) {
        return new C8300c(provider);
    }
}
