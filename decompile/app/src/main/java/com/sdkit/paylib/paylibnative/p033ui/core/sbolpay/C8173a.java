package com.sdkit.paylib.paylibnative.p033ui.core.sbolpay;

import com.sdkit.paylib.paylibdomain.api.deeplink.DeeplinkHandler;
import com.sdkit.paylib.paylibdomain.api.deeplink.PaylibDeeplinkFactory;
import com.sdkit.paylib.paylibdomain.api.deeplink.interactors.DeeplinkSupportInteractor;
import com.sdkit.paylib.paylibdomain.api.sbol.interactors.SbolAvailabilityInteractor;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.InterfaceC8238l;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.core.sbolpay.a */
/* loaded from: classes6.dex */
public final class C8173a implements Factory {

    /* renamed from: a */
    public final Provider f2080a;

    /* renamed from: b */
    public final Provider f2081b;

    /* renamed from: c */
    public final Provider f2082c;

    /* renamed from: d */
    public final Provider f2083d;

    /* renamed from: e */
    public final Provider f2084e;

    /* renamed from: f */
    public final Provider f2085f;

    /* renamed from: g */
    public final Provider f2086g;

    public C8173a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.f2080a = provider;
        this.f2081b = provider2;
        this.f2082c = provider3;
        this.f2083d = provider4;
        this.f2084e = provider5;
        this.f2085f = provider6;
        this.f2086g = provider7;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public SbolPayDeeplinkResolver get() {
        return m2101a((InterfaceC8238l) this.f2080a.get(), (DeeplinkHandler) this.f2081b.get(), (PaylibDeeplinkFactory) this.f2082c.get(), (SbolAvailabilityInteractor) this.f2083d.get(), (DeeplinkSupportInteractor) this.f2084e.get(), (InterfaceC8131b) this.f2085f.get(), (PaylibLoggerFactory) this.f2086g.get());
    }

    /* renamed from: a */
    public static SbolPayDeeplinkResolver m2101a(InterfaceC8238l interfaceC8238l, DeeplinkHandler deeplinkHandler, PaylibDeeplinkFactory paylibDeeplinkFactory, SbolAvailabilityInteractor sbolAvailabilityInteractor, DeeplinkSupportInteractor deeplinkSupportInteractor, InterfaceC8131b interfaceC8131b, PaylibLoggerFactory paylibLoggerFactory) {
        return new SbolPayDeeplinkResolver(interfaceC8238l, deeplinkHandler, paylibDeeplinkFactory, sbolAvailabilityInteractor, deeplinkSupportInteractor, interfaceC8131b, paylibLoggerFactory);
    }

    /* renamed from: a */
    public static C8173a m2102a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        return new C8173a(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }
}
