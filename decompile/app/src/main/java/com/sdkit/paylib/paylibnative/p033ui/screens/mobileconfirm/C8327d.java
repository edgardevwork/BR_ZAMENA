package com.sdkit.paylib.paylibnative.p033ui.screens.mobileconfirm;

import android.content.Context;
import com.sdkit.paylib.paylibdomain.api.mobileb.interactors.MoblieBOtpCodeInteractor;
import com.sdkit.paylib.paylibnative.p033ui.analytics.InterfaceC8097f;
import com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.FinishCodeReceiver;
import com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileconfirm.d */
/* loaded from: classes7.dex */
public final class C8327d implements Factory {

    /* renamed from: a */
    public final Provider f3365a;

    /* renamed from: b */
    public final Provider f3366b;

    /* renamed from: c */
    public final Provider f3367c;

    /* renamed from: d */
    public final Provider f3368d;

    /* renamed from: e */
    public final Provider f3369e;

    /* renamed from: f */
    public final Provider f3370f;

    /* renamed from: g */
    public final Provider f3371g;

    public C8327d(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.f3365a = provider;
        this.f3366b = provider2;
        this.f3367c = provider3;
        this.f3368d = provider4;
        this.f3369e = provider5;
        this.f3370f = provider6;
        this.f3371g = provider7;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8326c get() {
        return m3110a((Context) this.f3365a.get(), (MoblieBOtpCodeInteractor) this.f3366b.get(), (FinishCodeReceiver) this.f3367c.get(), (InternalPaylibRouter) this.f3368d.get(), (C8329f) this.f3369e.get(), (InterfaceC8097f) this.f3370f.get(), (InterfaceC8131b) this.f3371g.get());
    }

    /* renamed from: a */
    public static C8326c m3110a(Context context, MoblieBOtpCodeInteractor moblieBOtpCodeInteractor, FinishCodeReceiver finishCodeReceiver, InternalPaylibRouter internalPaylibRouter, C8329f c8329f, InterfaceC8097f interfaceC8097f, InterfaceC8131b interfaceC8131b) {
        return new C8326c(context, moblieBOtpCodeInteractor, finishCodeReceiver, internalPaylibRouter, c8329f, interfaceC8097f, interfaceC8131b);
    }

    /* renamed from: a */
    public static C8327d m3111a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        return new C8327d(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }
}
