package com.sdkit.paylib.paylibnative.p033ui.p034di;

import com.sdkit.paylib.paylibdomain.api.deeplink.DeeplinkHandler;
import com.sdkit.paylib.paylibdomain.api.p027di.PaylibDomainTools;
import com.sdkit.paylib.payliblogging.api.p029di.PaylibLoggingTools;
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
import com.sdkit.paylib.paylibnative.p033ui.rootcontainer.internaldi.InterfaceC8254b;
import com.sdkit.paylib.paylibnetwork.api.domain.WebViewCertificateVerifier;
import com.sdkit.paylib.paylibpayment.api.p037di.PaylibPaymentTools;
import com.sdkit.paylib.paylibplatform.api.p039di.PaylibPlatformTools;
import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.di.c */
/* loaded from: classes8.dex */
public final class C8212c {

    /* renamed from: a */
    public final Provider f2349a;

    /* renamed from: b */
    public final Provider f2350b;

    /* renamed from: c */
    public final Provider f2351c;

    /* renamed from: d */
    public final Provider f2352d;

    /* renamed from: e */
    public final InterfaceC8131b f2353e;

    /* renamed from: f */
    public final PaylibHostRouter f2354f;

    /* renamed from: g */
    public final InterfaceC8097f f2355g;

    /* renamed from: h */
    public final FinishCodeReceiver f2356h;

    /* renamed from: i */
    public final DeeplinkHandler f2357i;

    /* renamed from: j */
    public final DeviceAuthDelegate f2358j;

    /* renamed from: k */
    public final C8241o f2359k;

    /* renamed from: l */
    public final InterfaceC8238l f2360l;

    /* renamed from: m */
    public final InterfaceC8232f f2361m;

    /* renamed from: n */
    public final InterfaceC8220b f2362n;

    /* renamed from: o */
    public final InterfaceC8142a f2363o;

    /* renamed from: p */
    public final WebViewCertificateVerifier f2364p;

    public C8212c(Provider paylibDomainToolsProvider, Provider paylibLoggingToolsProvider, Provider paylibPaymentToolsProvider, Provider paylibPlatformToolsProvider, InterfaceC8131b config, PaylibHostRouter paylibHostRouter, InterfaceC8097f paylibInternalAnalytics, FinishCodeReceiver finishCodeReceiver, DeeplinkHandler deeplinkHandler, DeviceAuthDelegate deviceAuthDelegate, C8241o rootFragmentListenerHolder, InterfaceC8238l paylibStateManager, InterfaceC8232f paylibLongPollingStateManager, InterfaceC8220b paylibSaveCardScreenStateManager, InterfaceC8142a openBankAppInteractor, WebViewCertificateVerifier webViewCertificateVerifier) {
        Intrinsics.checkNotNullParameter(paylibDomainToolsProvider, "paylibDomainToolsProvider");
        Intrinsics.checkNotNullParameter(paylibLoggingToolsProvider, "paylibLoggingToolsProvider");
        Intrinsics.checkNotNullParameter(paylibPaymentToolsProvider, "paylibPaymentToolsProvider");
        Intrinsics.checkNotNullParameter(paylibPlatformToolsProvider, "paylibPlatformToolsProvider");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(paylibInternalAnalytics, "paylibInternalAnalytics");
        Intrinsics.checkNotNullParameter(finishCodeReceiver, "finishCodeReceiver");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(rootFragmentListenerHolder, "rootFragmentListenerHolder");
        Intrinsics.checkNotNullParameter(paylibStateManager, "paylibStateManager");
        Intrinsics.checkNotNullParameter(paylibLongPollingStateManager, "paylibLongPollingStateManager");
        Intrinsics.checkNotNullParameter(paylibSaveCardScreenStateManager, "paylibSaveCardScreenStateManager");
        Intrinsics.checkNotNullParameter(openBankAppInteractor, "openBankAppInteractor");
        Intrinsics.checkNotNullParameter(webViewCertificateVerifier, "webViewCertificateVerifier");
        this.f2349a = paylibDomainToolsProvider;
        this.f2350b = paylibLoggingToolsProvider;
        this.f2351c = paylibPaymentToolsProvider;
        this.f2352d = paylibPlatformToolsProvider;
        this.f2353e = config;
        this.f2354f = paylibHostRouter;
        this.f2355g = paylibInternalAnalytics;
        this.f2356h = finishCodeReceiver;
        this.f2357i = deeplinkHandler;
        this.f2358j = deviceAuthDelegate;
        this.f2359k = rootFragmentListenerHolder;
        this.f2360l = paylibStateManager;
        this.f2361m = paylibLongPollingStateManager;
        this.f2362n = paylibSaveCardScreenStateManager;
        this.f2363o = openBankAppInteractor;
        this.f2364p = webViewCertificateVerifier;
    }

    /* renamed from: a */
    public final InterfaceC8254b m2210a() {
        InterfaceC8254b.a aVar = InterfaceC8254b.f2708a;
        PaylibDomainTools paylibDomainTools = (PaylibDomainTools) this.f2349a.get();
        PaylibLoggingTools paylibLoggingTools = (PaylibLoggingTools) this.f2350b.get();
        PaylibPaymentTools paylibPaymentTools = (PaylibPaymentTools) this.f2351c.get();
        PaylibPlatformTools paylibPlatformTools = (PaylibPlatformTools) this.f2352d.get();
        Intrinsics.checkNotNullExpressionValue(paylibPaymentTools, "get()");
        Intrinsics.checkNotNullExpressionValue(paylibDomainTools, "get()");
        Intrinsics.checkNotNullExpressionValue(paylibLoggingTools, "get()");
        Intrinsics.checkNotNullExpressionValue(paylibPlatformTools, "get()");
        return aVar.m2473a(this, paylibPaymentTools, paylibDomainTools, paylibLoggingTools, paylibPlatformTools);
    }

    /* renamed from: b */
    public final InterfaceC8131b m2211b() {
        return this.f2353e;
    }

    /* renamed from: c */
    public final DeeplinkHandler m2212c() {
        return this.f2357i;
    }

    /* renamed from: d */
    public final DeviceAuthDelegate m2213d() {
        return this.f2358j;
    }

    /* renamed from: e */
    public final FinishCodeReceiver m2214e() {
        return this.f2356h;
    }

    /* renamed from: f */
    public final PaylibHostRouter m2215f() {
        return this.f2354f;
    }

    /* renamed from: g */
    public final InterfaceC8142a m2216g() {
        return this.f2363o;
    }

    /* renamed from: h */
    public final InterfaceC8097f m2217h() {
        return this.f2355g;
    }

    /* renamed from: i */
    public final InterfaceC8232f m2218i() {
        return this.f2361m;
    }

    /* renamed from: j */
    public final InterfaceC8220b m2219j() {
        return this.f2362n;
    }

    /* renamed from: k */
    public final InterfaceC8238l m2220k() {
        return this.f2360l;
    }

    /* renamed from: l */
    public final C8241o m2221l() {
        return this.f2359k;
    }

    /* renamed from: m */
    public final WebViewCertificateVerifier m2222m() {
        return this.f2364p;
    }
}
