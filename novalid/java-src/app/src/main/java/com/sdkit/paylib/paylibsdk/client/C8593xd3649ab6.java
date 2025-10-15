package com.sdkit.paylib.paylibsdk.client;

import com.sdkit.paylib.paylibdomain.api.deeplink.DeeplinkHandler;
import com.sdkit.paylib.paylibnative.api.analytics.CustomPaylibAnalytics;
import com.sdkit.paylib.paylibnative.api.config.PaylibNativeFeatureFlags;
import com.sdkit.paylib.paylibnative.api.deviceauth.DeviceAuthDelegate;
import com.sdkit.paylib.paylibnative.api.presentation.PaylibNativeConfigProvider;
import com.sdkit.paylib.paylibnative.p033ui.p034di.AdditionalPaylibNativeDependencies;
import com.sdkit.paylib.paylibnative.p033ui.p034di.PaylibNativePayMethodsDependencies;
import com.sdkit.paylib.paylibpayment.api.config.InternalConfigProvider;
import com.sdkit.paylib.paylibsdk.client.p041di.utils.C8603a;
import com.sdkit.paylib.paylibsdk.client.p041di.utils.C8607e;
import com.sdkit.paylib.paylibsdk.client.p041di.utils.C8608f;
import kotlin.Metadata;

@Metadata(m7104d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010 \u001a\u0004\u0018\u00010\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010&\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006'"}, m7105d2 = {"com/sdkit/paylib/paylibsdk/client/PaylibSdkClient$installDefault$paylibNativePayMethodsDependencies$1", "Lcom/sdkit/paylib/paylibnative/ui/di/PaylibNativePayMethodsDependencies;", "Lcom/sdkit/paylib/paylibnative/ui/di/AdditionalPaylibNativeDependencies;", "Lcom/sdkit/paylib/paylibnative/api/analytics/CustomPaylibAnalytics;", "a", "Lcom/sdkit/paylib/paylibnative/api/analytics/CustomPaylibAnalytics;", "getCustomPaylibAnalytics", "()Lcom/sdkit/paylib/paylibnative/api/analytics/CustomPaylibAnalytics;", "customPaylibAnalytics", "Lcom/sdkit/paylib/paylibnative/api/presentation/PaylibNativeConfigProvider;", "b", "Lcom/sdkit/paylib/paylibnative/api/presentation/PaylibNativeConfigProvider;", "getPaylibNativeConfigProvider", "()Lcom/sdkit/paylib/paylibnative/api/presentation/PaylibNativeConfigProvider;", "paylibNativeConfigProvider", "Lcom/sdkit/paylib/paylibpayment/api/config/InternalConfigProvider;", "c", "Lcom/sdkit/paylib/paylibpayment/api/config/InternalConfigProvider;", "getConfigProvider", "()Lcom/sdkit/paylib/paylibpayment/api/config/InternalConfigProvider;", "configProvider", "Lcom/sdkit/paylib/paylibdomain/api/deeplink/DeeplinkHandler;", "d", "Lcom/sdkit/paylib/paylibdomain/api/deeplink/DeeplinkHandler;", "getDeeplinkHandler", "()Lcom/sdkit/paylib/paylibdomain/api/deeplink/DeeplinkHandler;", "deeplinkHandler", "Lcom/sdkit/paylib/paylibnative/api/deviceauth/DeviceAuthDelegate;", "e", "Lcom/sdkit/paylib/paylibnative/api/deviceauth/DeviceAuthDelegate;", "getDeviceAuthDelegate", "()Lcom/sdkit/paylib/paylibnative/api/deviceauth/DeviceAuthDelegate;", "deviceAuthDelegate", "Lcom/sdkit/paylib/paylibnative/api/config/PaylibNativeFeatureFlags;", "f", "Lcom/sdkit/paylib/paylibnative/api/config/PaylibNativeFeatureFlags;", "getFeatureFlags", "()Lcom/sdkit/paylib/paylibnative/api/config/PaylibNativeFeatureFlags;", "featureFlags", "com-sdkit-assistant_paylibsdk_client"}, m7106k = 1, m7107mv = {1, 8, 0})
/* renamed from: com.sdkit.paylib.paylibsdk.client.PaylibSdkClient$installDefault$paylibNativePayMethodsDependencies$1 */
/* loaded from: classes8.dex */
public final class C8593xd3649ab6 implements PaylibNativePayMethodsDependencies, AdditionalPaylibNativeDependencies {

    /* renamed from: a, reason: from kotlin metadata */
    public final CustomPaylibAnalytics customPaylibAnalytics;

    /* renamed from: b, reason: from kotlin metadata */
    public final PaylibNativeConfigProvider paylibNativeConfigProvider;

    /* renamed from: c, reason: from kotlin metadata */
    public final InternalConfigProvider configProvider;

    /* renamed from: d, reason: from kotlin metadata */
    public final DeeplinkHandler deeplinkHandler;

    /* renamed from: e, reason: from kotlin metadata */
    public final DeviceAuthDelegate deviceAuthDelegate;

    /* renamed from: f, reason: from kotlin metadata */
    public final PaylibNativeFeatureFlags featureFlags;

    public C8593xd3649ab6(CustomPaylibAnalytics customPaylibAnalytics, C8607e c8607e, InternalConfigProvider internalConfigProvider, DeeplinkHandler deeplinkHandler, DeviceAuthDelegate deviceAuthDelegate, C8608f c8608f) {
        this.customPaylibAnalytics = customPaylibAnalytics;
        this.paylibNativeConfigProvider = c8607e.m4709b();
        this.configProvider = internalConfigProvider == null ? new C8603a() : internalConfigProvider;
        this.deeplinkHandler = deeplinkHandler;
        this.deviceAuthDelegate = deviceAuthDelegate;
        this.featureFlags = c8608f.m4711b();
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.p034di.AdditionalPaylibNativeDependencies
    public InternalConfigProvider getConfigProvider() {
        return this.configProvider;
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.p034di.PaylibNativePayMethodsDependencies
    public CustomPaylibAnalytics getCustomPaylibAnalytics() {
        return this.customPaylibAnalytics;
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.p034di.PaylibNativePayMethodsDependencies
    public DeeplinkHandler getDeeplinkHandler() {
        return this.deeplinkHandler;
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.p034di.PaylibNativePayMethodsDependencies
    public DeviceAuthDelegate getDeviceAuthDelegate() {
        return this.deviceAuthDelegate;
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.p034di.PaylibNativePayMethodsDependencies
    public PaylibNativeFeatureFlags getFeatureFlags() {
        return this.featureFlags;
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.p034di.AdditionalPaylibNativeDependencies
    public PaylibNativeConfigProvider getPaylibNativeConfigProvider() {
        return this.paylibNativeConfigProvider;
    }
}
