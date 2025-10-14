package com.sdkit.paylib.paylibnative.p033ui.screens.banks;

import android.content.Context;
import com.sdkit.paylib.paylibdomain.api.sbp.interactors.BanksInteractor;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibnative.p033ui.analytics.InterfaceC8097f;
import com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b;
import com.sdkit.paylib.paylibnative.p033ui.core.interactors.sbp.InterfaceC8142a;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.FinishCodeReceiver;
import com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.banks.e */
/* loaded from: classes5.dex */
public final class C8270e implements Factory {

    /* renamed from: a */
    public final Provider f2827a;

    /* renamed from: b */
    public final Provider f2828b;

    /* renamed from: c */
    public final Provider f2829c;

    /* renamed from: d */
    public final Provider f2830d;

    /* renamed from: e */
    public final Provider f2831e;

    /* renamed from: f */
    public final Provider f2832f;

    /* renamed from: g */
    public final Provider f2833g;

    /* renamed from: h */
    public final Provider f2834h;

    public C8270e(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8) {
        this.f2827a = provider;
        this.f2828b = provider2;
        this.f2829c = provider3;
        this.f2830d = provider4;
        this.f2831e = provider5;
        this.f2832f = provider6;
        this.f2833g = provider7;
        this.f2834h = provider8;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8269d get() {
        return m2613a((InterfaceC8097f) this.f2827a.get(), (InterfaceC8131b) this.f2828b.get(), (Context) this.f2829c.get(), (BanksInteractor) this.f2830d.get(), (InterfaceC8142a) this.f2831e.get(), (FinishCodeReceiver) this.f2832f.get(), (InternalPaylibRouter) this.f2833g.get(), (PaylibLoggerFactory) this.f2834h.get());
    }

    /* renamed from: a */
    public static C8269d m2613a(InterfaceC8097f interfaceC8097f, InterfaceC8131b interfaceC8131b, Context context, BanksInteractor banksInteractor, InterfaceC8142a interfaceC8142a, FinishCodeReceiver finishCodeReceiver, InternalPaylibRouter internalPaylibRouter, PaylibLoggerFactory paylibLoggerFactory) {
        return new C8269d(interfaceC8097f, interfaceC8131b, context, banksInteractor, interfaceC8142a, finishCodeReceiver, internalPaylibRouter, paylibLoggerFactory);
    }

    /* renamed from: a */
    public static C8270e m2614a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8) {
        return new C8270e(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }
}
