package com.sdkit.paylib.paylibnative.p033ui.screens.invoice.viewobjects;

import com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b;
import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8412a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.invoice.viewobjects.g */
/* loaded from: classes7.dex */
public final class C8304g implements Factory {

    /* renamed from: a */
    public final Provider f3171a;

    /* renamed from: b */
    public final Provider f3172b;

    public C8304g(Provider provider, Provider provider2) {
        this.f3171a = provider;
        this.f3172b = provider2;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8303f get() {
        return m2915a((InterfaceC8131b) this.f3171a.get(), (InterfaceC8412a) this.f3172b.get());
    }

    /* renamed from: a */
    public static C8303f m2915a(InterfaceC8131b interfaceC8131b, InterfaceC8412a interfaceC8412a) {
        return new C8303f(interfaceC8131b, interfaceC8412a);
    }

    /* renamed from: a */
    public static C8304g m2916a(Provider provider, Provider provider2) {
        return new C8304g(provider, provider2);
    }
}
