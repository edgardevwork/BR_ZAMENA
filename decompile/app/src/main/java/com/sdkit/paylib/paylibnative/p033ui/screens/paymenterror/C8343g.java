package com.sdkit.paylib.paylibnative.p033ui.screens.paymenterror;

import com.sdkit.paylib.paylibnative.p033ui.analytics.InterfaceC8093b;
import com.sdkit.paylib.paylibnative.p033ui.analytics.InterfaceC8097f;
import com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.FinishCodeReceiver;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.InterfaceC8238l;
import com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.paymenterror.g */
/* loaded from: classes7.dex */
public final class C8343g implements Factory {

    /* renamed from: a */
    public final Provider f3490a;

    /* renamed from: b */
    public final Provider f3491b;

    /* renamed from: c */
    public final Provider f3492c;

    /* renamed from: d */
    public final Provider f3493d;

    /* renamed from: e */
    public final Provider f3494e;

    /* renamed from: f */
    public final Provider f3495f;

    public C8343g(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f3490a = provider;
        this.f3491b = provider2;
        this.f3492c = provider3;
        this.f3493d = provider4;
        this.f3494e = provider5;
        this.f3495f = provider6;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8342f get() {
        return m3254a((InterfaceC8097f) this.f3490a.get(), (FinishCodeReceiver) this.f3491b.get(), (InternalPaylibRouter) this.f3492c.get(), (InterfaceC8093b) this.f3493d.get(), (InterfaceC8131b) this.f3494e.get(), (InterfaceC8238l) this.f3495f.get());
    }

    /* renamed from: a */
    public static C8342f m3254a(InterfaceC8097f interfaceC8097f, FinishCodeReceiver finishCodeReceiver, InternalPaylibRouter internalPaylibRouter, InterfaceC8093b interfaceC8093b, InterfaceC8131b interfaceC8131b, InterfaceC8238l interfaceC8238l) {
        return new C8342f(interfaceC8097f, finishCodeReceiver, internalPaylibRouter, interfaceC8093b, interfaceC8131b, interfaceC8238l);
    }

    /* renamed from: a */
    public static C8343g m3255a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        return new C8343g(provider, provider2, provider3, provider4, provider5, provider6);
    }
}
