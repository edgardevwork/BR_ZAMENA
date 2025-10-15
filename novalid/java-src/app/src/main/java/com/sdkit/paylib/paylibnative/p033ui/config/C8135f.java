package com.sdkit.paylib.paylibnative.p033ui.config;

import com.sdkit.paylib.paylibdomain.api.deeplink.DeeplinkHandler;
import com.sdkit.paylib.paylibnative.api.analytics.CustomPaylibAnalytics;
import com.sdkit.paylib.paylibnative.api.config.PaylibNativeFeatureFlags;
import com.sdkit.paylib.paylibnative.api.deviceauth.DeviceAuthDelegate;
import com.sdkit.paylib.paylibnative.api.presentation.PaylibNativeConfigProvider;
import com.sdkit.paylib.paylibnative.p033ui.p034di.AdditionalPaylibNativeDependencies;
import com.sdkit.paylib.paylibnative.p033ui.p034di.PaylibNativePayMethodsDependencies;
import com.sdkit.paylib.paylibpayment.api.config.InternalConfigProvider;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.config.f */
/* loaded from: classes8.dex */
public final class C8135f {

    /* renamed from: a */
    public static final C8135f f1954a = new C8135f();

    /* renamed from: com.sdkit.paylib.paylibnative.ui.config.f$a */
    /* loaded from: classes5.dex */
    public static final class a implements InterfaceC8134e {

        /* renamed from: a */
        public final CustomPaylibAnalytics f1955a;

        /* renamed from: b */
        public final /* synthetic */ PaylibNativePayMethodsDependencies f1956b;

        /* renamed from: c */
        public final /* synthetic */ AbstractC8130a f1957c;

        /* renamed from: d */
        public final /* synthetic */ AdditionalPaylibNativeDependencies f1958d;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.config.f$a$a, reason: collision with other inner class name */
        public static final class C11909a implements DeeplinkHandler {
            @Override // com.sdkit.paylib.paylibdomain.api.deeplink.DeeplinkHandler
            public boolean openDeeplink(String deeplink, String str) {
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                return false;
            }

            @Override // com.sdkit.paylib.paylibdomain.api.deeplink.DeeplinkHandler
            public String provideInitialReturnDeepLink() {
                return "";
            }
        }

        public a(PaylibNativePayMethodsDependencies paylibNativePayMethodsDependencies, AbstractC8130a abstractC8130a, AdditionalPaylibNativeDependencies additionalPaylibNativeDependencies) {
            this.f1956b = paylibNativePayMethodsDependencies;
            this.f1957c = abstractC8130a;
            this.f1958d = additionalPaylibNativeDependencies;
            this.f1955a = paylibNativePayMethodsDependencies != null ? paylibNativePayMethodsDependencies.getCustomPaylibAnalytics() : null;
        }

        @Override // com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8134e
        /* renamed from: a */
        public AbstractC8130a mo2018a() {
            return this.f1957c;
        }

        @Override // com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8134e
        /* renamed from: b */
        public CustomPaylibAnalytics mo2019b() {
            return this.f1955a;
        }

        @Override // com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8134e
        public InternalConfigProvider getConfigProvider() {
            AdditionalPaylibNativeDependencies additionalPaylibNativeDependencies = this.f1958d;
            if (additionalPaylibNativeDependencies != null) {
                return additionalPaylibNativeDependencies.getConfigProvider();
            }
            return null;
        }

        @Override // com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8134e
        public DeeplinkHandler getDeeplinkHandler() {
            DeeplinkHandler deeplinkHandler;
            PaylibNativePayMethodsDependencies paylibNativePayMethodsDependencies = this.f1956b;
            return (paylibNativePayMethodsDependencies == null || (deeplinkHandler = paylibNativePayMethodsDependencies.getDeeplinkHandler()) == null) ? new C11909a() : deeplinkHandler;
        }

        @Override // com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8134e
        public DeviceAuthDelegate getDeviceAuthDelegate() {
            PaylibNativePayMethodsDependencies paylibNativePayMethodsDependencies = this.f1956b;
            if (paylibNativePayMethodsDependencies != null) {
                return paylibNativePayMethodsDependencies.getDeviceAuthDelegate();
            }
            return null;
        }

        @Override // com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8134e
        public PaylibNativeFeatureFlags getFeatureFlags() {
            PaylibNativePayMethodsDependencies paylibNativePayMethodsDependencies = this.f1956b;
            if (paylibNativePayMethodsDependencies != null) {
                return paylibNativePayMethodsDependencies.getFeatureFlags();
            }
            return null;
        }

        @Override // com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8134e
        public PaylibNativeConfigProvider getPaylibNativeConfigProvider() {
            AdditionalPaylibNativeDependencies additionalPaylibNativeDependencies = this.f1958d;
            if (additionalPaylibNativeDependencies != null) {
                return additionalPaylibNativeDependencies.getPaylibNativeConfigProvider();
            }
            return null;
        }
    }

    /* renamed from: a */
    public final InterfaceC8134e m2020a(PaylibNativePayMethodsDependencies paylibNativePayMethodsDependencies, AbstractC8130a displayMode) {
        Intrinsics.checkNotNullParameter(displayMode, "displayMode");
        return new a(paylibNativePayMethodsDependencies, displayMode, paylibNativePayMethodsDependencies instanceof AdditionalPaylibNativeDependencies ? (AdditionalPaylibNativeDependencies) paylibNativePayMethodsDependencies : null);
    }
}
