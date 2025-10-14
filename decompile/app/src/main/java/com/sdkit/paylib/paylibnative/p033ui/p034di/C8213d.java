package com.sdkit.paylib.paylibnative.p033ui.p034di;

import com.sdkit.paylib.paylibdomain.api.deeplink.DeeplinkHandler;
import com.sdkit.paylib.paylibnative.api.deviceauth.DeviceAuthDelegate;
import com.sdkit.paylib.paylibnative.api.presentation.PaylibHostRouter;
import com.sdkit.paylib.paylibnative.p033ui.analytics.InterfaceC8097f;
import com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b;
import com.sdkit.paylib.paylibnative.p033ui.core.interactors.sbp.InterfaceC8142a;
import com.sdkit.paylib.paylibnative.p033ui.domain.savecardscreen.InterfaceC8220b;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.C8241o;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.FinishCodeReceiver;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.InterfaceC8232f;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.InterfaceC8238l;
import com.sdkit.paylib.paylibnetwork.api.domain.WebViewCertificateVerifier;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.di.d */
/* loaded from: classes6.dex */
public final class C8213d implements Factory {

    /* renamed from: a */
    public final Provider f2365a;

    /* renamed from: b */
    public final Provider f2366b;

    /* renamed from: c */
    public final Provider f2367c;

    /* renamed from: d */
    public final Provider f2368d;

    /* renamed from: e */
    public final Provider f2369e;

    /* renamed from: f */
    public final Provider f2370f;

    /* renamed from: g */
    public final Provider f2371g;

    /* renamed from: h */
    public final Provider f2372h;

    /* renamed from: i */
    public final Provider f2373i;

    /* renamed from: j */
    public final Provider f2374j;

    /* renamed from: k */
    public final Provider f2375k;

    /* renamed from: l */
    public final Provider f2376l;

    /* renamed from: m */
    public final Provider f2377m;

    /* renamed from: n */
    public final Provider f2378n;

    /* renamed from: o */
    public final Provider f2379o;

    /* renamed from: p */
    public final Provider f2380p;

    public C8213d(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, Provider provider15, Provider provider16) {
        this.f2365a = provider;
        this.f2366b = provider2;
        this.f2367c = provider3;
        this.f2368d = provider4;
        this.f2369e = provider5;
        this.f2370f = provider6;
        this.f2371g = provider7;
        this.f2372h = provider8;
        this.f2373i = provider9;
        this.f2374j = provider10;
        this.f2375k = provider11;
        this.f2376l = provider12;
        this.f2377m = provider13;
        this.f2378n = provider14;
        this.f2379o = provider15;
        this.f2380p = provider16;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8212c get() {
        return m2223a(this.f2365a, this.f2366b, this.f2367c, this.f2368d, (InterfaceC8131b) this.f2369e.get(), (PaylibHostRouter) this.f2370f.get(), (InterfaceC8097f) this.f2371g.get(), (FinishCodeReceiver) this.f2372h.get(), (DeeplinkHandler) this.f2373i.get(), (DeviceAuthDelegate) this.f2374j.get(), (C8241o) this.f2375k.get(), (InterfaceC8238l) this.f2376l.get(), (InterfaceC8232f) this.f2377m.get(), (InterfaceC8220b) this.f2378n.get(), (InterfaceC8142a) this.f2379o.get(), (WebViewCertificateVerifier) this.f2380p.get());
    }

    /* renamed from: a */
    public static C8212c m2223a(Provider provider, Provider provider2, Provider provider3, Provider provider4, InterfaceC8131b interfaceC8131b, PaylibHostRouter paylibHostRouter, InterfaceC8097f interfaceC8097f, FinishCodeReceiver finishCodeReceiver, DeeplinkHandler deeplinkHandler, DeviceAuthDelegate deviceAuthDelegate, C8241o c8241o, InterfaceC8238l interfaceC8238l, InterfaceC8232f interfaceC8232f, InterfaceC8220b interfaceC8220b, InterfaceC8142a interfaceC8142a, WebViewCertificateVerifier webViewCertificateVerifier) {
        return new C8212c(provider, provider2, provider3, provider4, interfaceC8131b, paylibHostRouter, interfaceC8097f, finishCodeReceiver, deeplinkHandler, deviceAuthDelegate, c8241o, interfaceC8238l, interfaceC8232f, interfaceC8220b, interfaceC8142a, webViewCertificateVerifier);
    }

    /* renamed from: a */
    public static C8213d m2224a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, Provider provider15, Provider provider16) {
        return new C8213d(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16);
    }
}
