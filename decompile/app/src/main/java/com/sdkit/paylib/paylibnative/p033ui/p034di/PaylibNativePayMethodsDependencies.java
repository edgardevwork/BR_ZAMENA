package com.sdkit.paylib.paylibnative.p033ui.p034di;

import com.sdkit.paylib.paylibdomain.api.deeplink.DeeplinkHandler;
import com.sdkit.paylib.paylibnative.api.analytics.CustomPaylibAnalytics;
import com.sdkit.paylib.paylibnative.api.config.PaylibNativeFeatureFlags;
import com.sdkit.paylib.paylibnative.api.deviceauth.DeviceAuthDelegate;
import kotlin.Metadata;

@Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/ui/di/PaylibNativePayMethodsDependencies;", "", "customPaylibAnalytics", "Lcom/sdkit/paylib/paylibnative/api/analytics/CustomPaylibAnalytics;", "getCustomPaylibAnalytics", "()Lcom/sdkit/paylib/paylibnative/api/analytics/CustomPaylibAnalytics;", "deeplinkHandler", "Lcom/sdkit/paylib/paylibdomain/api/deeplink/DeeplinkHandler;", "getDeeplinkHandler", "()Lcom/sdkit/paylib/paylibdomain/api/deeplink/DeeplinkHandler;", "deviceAuthDelegate", "Lcom/sdkit/paylib/paylibnative/api/deviceauth/DeviceAuthDelegate;", "getDeviceAuthDelegate", "()Lcom/sdkit/paylib/paylibnative/api/deviceauth/DeviceAuthDelegate;", "featureFlags", "Lcom/sdkit/paylib/paylibnative/api/config/PaylibNativeFeatureFlags;", "getFeatureFlags", "()Lcom/sdkit/paylib/paylibnative/api/config/PaylibNativeFeatureFlags;", "com-sdkit-assistant_paylib_native"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public interface PaylibNativePayMethodsDependencies {

    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class DefaultImpls {
        public static CustomPaylibAnalytics getCustomPaylibAnalytics(PaylibNativePayMethodsDependencies paylibNativePayMethodsDependencies) {
            return null;
        }

        public static DeeplinkHandler getDeeplinkHandler(PaylibNativePayMethodsDependencies paylibNativePayMethodsDependencies) {
            return null;
        }

        public static DeviceAuthDelegate getDeviceAuthDelegate(PaylibNativePayMethodsDependencies paylibNativePayMethodsDependencies) {
            return null;
        }

        public static PaylibNativeFeatureFlags getFeatureFlags(PaylibNativePayMethodsDependencies paylibNativePayMethodsDependencies) {
            return null;
        }
    }

    CustomPaylibAnalytics getCustomPaylibAnalytics();

    DeeplinkHandler getDeeplinkHandler();

    DeviceAuthDelegate getDeviceAuthDelegate();

    PaylibNativeFeatureFlags getFeatureFlags();
}
