package com.sdkit.paylib.paylibnative.p033ui.screens.mobileb;

import com.sdkit.paylib.paylibdomain.api.mobileb.interactors.MobileBPaymentsInteractor;
import com.sdkit.paylib.paylibnative.p033ui.analytics.InterfaceC8097f;
import com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.FinishCodeReceiver;
import com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileb.d */
/* loaded from: classes7.dex */
public final class C8322d implements Factory {

    /* renamed from: a */
    public final Provider f3290a;

    /* renamed from: b */
    public final Provider f3291b;

    /* renamed from: c */
    public final Provider f3292c;

    /* renamed from: d */
    public final Provider f3293d;

    /* renamed from: e */
    public final Provider f3294e;

    public C8322d(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f3290a = provider;
        this.f3291b = provider2;
        this.f3292c = provider3;
        this.f3293d = provider4;
        this.f3294e = provider5;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8321c get() {
        return m3030a((FinishCodeReceiver) this.f3290a.get(), (MobileBPaymentsInteractor) this.f3291b.get(), (InternalPaylibRouter) this.f3292c.get(), (InterfaceC8097f) this.f3293d.get(), (InterfaceC8131b) this.f3294e.get());
    }

    /* renamed from: a */
    public static C8321c m3030a(FinishCodeReceiver finishCodeReceiver, MobileBPaymentsInteractor mobileBPaymentsInteractor, InternalPaylibRouter internalPaylibRouter, InterfaceC8097f interfaceC8097f, InterfaceC8131b interfaceC8131b) {
        return new C8321c(finishCodeReceiver, mobileBPaymentsInteractor, internalPaylibRouter, interfaceC8097f, interfaceC8131b);
    }

    /* renamed from: a */
    public static C8322d m3031a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new C8322d(provider, provider2, provider3, provider4, provider5);
    }
}
