package com.sdkit.paylib.paylibsdk.client;

import android.content.Context;
import com.sdkit.paylib.paylibdomain.api.config.PaylibDomainFeatureFlags;
import com.sdkit.paylib.paylibdomain.api.deeplink.DeeplinkHandler;
import com.sdkit.paylib.paylibdomain.impl.p028di.PaylibDomainDependencies;
import com.sdkit.paylib.payliblogging.api.logging.ExternalPaylibLoggerFactory;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggingConfig;
import com.sdkit.paylib.payliblogging.impl.p030di.PaylibLoggingDependencies;
import com.sdkit.paylib.paylibnative.api.analytics.CustomPaylibAnalytics;
import com.sdkit.paylib.paylibnative.api.deviceauth.DeviceAuthDelegate;
import com.sdkit.paylib.paylibpayment.api.config.BackendUrlProvider;
import com.sdkit.paylib.paylibpayment.api.config.InternalConfigProvider;
import com.sdkit.paylib.paylibpayment.api.domain.PaylibClientInfoProvider;
import com.sdkit.paylib.paylibpayment.api.domain.PaylibTokenProvider;
import com.sdkit.paylib.paylibplatform.impl.p040di.PaylibPlatformDependencies;
import com.sdkit.paylib.paylibsdk.client.domain.PaylibSdkConfig;
import com.sdkit.paylib.paylibsdk.client.p041di.InterfaceC8595b;
import com.sdkit.paylib.paylibsdk.client.p041di.utils.C8606d;
import com.sdkit.paylib.paylibsdk.client.p041di.utils.C8607e;
import com.sdkit.paylib.paylibsdk.client.p041di.utils.C8608f;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m7104d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0082\u0001\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0007¨\u0006\u001b"}, m7105d2 = {"Lcom/sdkit/paylib/paylibsdk/client/PaylibSdkClient;", "", "()V", "installDefault", "Lcom/sdkit/paylib/paylibsdk/client/PaylibSdk;", "appContext", "Landroid/content/Context;", "tokenProvider", "Lcom/sdkit/paylib/paylibpayment/api/domain/PaylibTokenProvider;", "backendUrlProvider", "Lcom/sdkit/paylib/paylibpayment/api/config/BackendUrlProvider;", "deepLinkHandler", "Lcom/sdkit/paylib/paylibdomain/api/deeplink/DeeplinkHandler;", "deviceAuthDelegate", "Lcom/sdkit/paylib/paylibnative/api/deviceauth/DeviceAuthDelegate;", "paylibSdkConfig", "Lcom/sdkit/paylib/paylibsdk/client/domain/PaylibSdkConfig;", "configProvider", "Lcom/sdkit/paylib/paylibpayment/api/config/InternalConfigProvider;", "clientInfoProviderOverrides", "Lcom/sdkit/paylib/paylibpayment/api/domain/PaylibClientInfoProvider;", "externalPaylibLoggerFactory", "Lcom/sdkit/paylib/payliblogging/api/logging/ExternalPaylibLoggerFactory;", "customPaylibAnalytics", "Lcom/sdkit/paylib/paylibnative/api/analytics/CustomPaylibAnalytics;", "debugLogs", "", "com-sdkit-assistant_paylibsdk_client"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes5.dex */
public final class PaylibSdkClient {
    public static final PaylibSdkClient INSTANCE = new PaylibSdkClient();

    @JvmStatic
    public static final PaylibSdk installDefault(final Context appContext, PaylibTokenProvider tokenProvider, BackendUrlProvider backendUrlProvider, DeeplinkHandler deepLinkHandler, DeviceAuthDelegate deviceAuthDelegate, PaylibSdkConfig paylibSdkConfig, InternalConfigProvider configProvider, PaylibClientInfoProvider clientInfoProviderOverrides, final ExternalPaylibLoggerFactory externalPaylibLoggerFactory, CustomPaylibAnalytics customPaylibAnalytics, final boolean debugLogs) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(tokenProvider, "tokenProvider");
        final C8607e c8607e = new C8607e(paylibSdkConfig);
        final C8608f c8608f = new C8608f();
        return InterfaceC8595b.f5841a.m4678a(new C8606d(configProvider).m4707a(), new PaylibDomainDependencies(c8608f) { // from class: com.sdkit.paylib.paylibsdk.client.PaylibSdkClient$installDefault$paylibDomainDependencies$1

            /* renamed from: a, reason: from kotlin metadata */
            public final PaylibDomainFeatureFlags featureFlags;

            {
                this.featureFlags = c8608f.m4710a();
            }

            @Override // com.sdkit.paylib.paylibdomain.impl.p028di.PaylibDomainDependencies
            public PaylibDomainFeatureFlags getFeatureFlags() {
                return this.featureFlags;
            }
        }, new PaylibLoggingDependencies(externalPaylibLoggerFactory, c8607e, debugLogs) { // from class: com.sdkit.paylib.paylibsdk.client.PaylibSdkClient$installDefault$paylibLoggingDependencies$1

            /* renamed from: a, reason: from kotlin metadata */
            public final ExternalPaylibLoggerFactory externalPaylibLoggerFactory;

            /* renamed from: b, reason: from kotlin metadata */
            public final PaylibLoggingConfig paylibLoggingConfig;

            {
                this.externalPaylibLoggerFactory = debugLogs ? externalPaylibLoggerFactory : null;
                this.paylibLoggingConfig = c8607e.m4708a();
            }

            @Override // com.sdkit.paylib.payliblogging.impl.p030di.PaylibLoggingDependencies
            public ExternalPaylibLoggerFactory getExternalPaylibLoggerFactory() {
                return this.externalPaylibLoggerFactory;
            }

            @Override // com.sdkit.paylib.payliblogging.impl.p030di.PaylibLoggingDependencies
            public PaylibLoggingConfig getPaylibLoggingConfig() {
                return this.paylibLoggingConfig;
            }
        }, new PaylibSdkClient$installDefault$paylibPaymentDependencies$1(configProvider, backendUrlProvider, clientInfoProviderOverrides, tokenProvider, c8608f), new PaylibPlatformDependencies(appContext) { // from class: com.sdkit.paylib.paylibsdk.client.PaylibSdkClient$installDefault$paylibPlatformDependencies$1

            /* renamed from: a, reason: from kotlin metadata */
            public final Context appContext;

            {
                this.appContext = appContext;
            }

            @Override // com.sdkit.paylib.paylibplatform.impl.p040di.PaylibPlatformDependencies
            public Context getAppContext() {
                return this.appContext;
            }
        }, new C8593xd3649ab6(customPaylibAnalytics, c8607e, configProvider, deepLinkHandler, deviceAuthDelegate, c8608f)).mo4675a();
    }
}
