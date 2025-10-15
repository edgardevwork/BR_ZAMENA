package com.sdkit.paylib.paylibnative.p033ui.screens.cardsaving;

import com.sdkit.paylib.paylibnative.p033ui.analytics.InterfaceC8097f;
import com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b;
import com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.cardsaving.d */
/* loaded from: classes5.dex */
public final class C8285d implements Factory {

    /* renamed from: a */
    public final Provider f2964a;

    /* renamed from: b */
    public final Provider f2965b;

    /* renamed from: c */
    public final Provider f2966c;

    public C8285d(Provider provider, Provider provider2, Provider provider3) {
        this.f2964a = provider;
        this.f2965b = provider2;
        this.f2966c = provider3;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8284c get() {
        return m2712a((InternalPaylibRouter) this.f2964a.get(), (InterfaceC8097f) this.f2965b.get(), (InterfaceC8131b) this.f2966c.get());
    }

    /* renamed from: a */
    public static C8284c m2712a(InternalPaylibRouter internalPaylibRouter, InterfaceC8097f interfaceC8097f, InterfaceC8131b interfaceC8131b) {
        return new C8284c(internalPaylibRouter, interfaceC8097f, interfaceC8131b);
    }

    /* renamed from: a */
    public static C8285d m2713a(Provider provider, Provider provider2, Provider provider3) {
        return new C8285d(provider, provider2, provider3);
    }
}
