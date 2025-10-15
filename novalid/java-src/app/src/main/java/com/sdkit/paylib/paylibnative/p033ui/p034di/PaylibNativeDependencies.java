package com.sdkit.paylib.paylibnative.p033ui.p034di;

import com.sdkit.paylib.paylibdomain.api.deeplink.DeeplinkHandler;
import com.sdkit.paylib.paylibnative.api.analytics.CustomPaylibAnalytics;
import com.sdkit.paylib.paylibnative.api.config.PaylibNativeFeatureFlags;
import com.sdkit.paylib.paylibnative.api.deviceauth.DeviceAuthDelegate;
import com.sdkit.paylib.paylibnative.p033ui.p034di.PaylibNativePayMethodsDependencies;
import kotlin.Metadata;

@Metadata(m7104d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/ui/di/PaylibNativeDependencies;", "Lcom/sdkit/paylib/paylibnative/ui/di/PaylibNativePayMethodsDependencies;", "Lcom/sdkit/paylib/paylibnative/ui/di/PaylibHostRouterDependencies;", "com-sdkit-assistant_paylib_native"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes5.dex */
public interface PaylibNativeDependencies extends PaylibNativePayMethodsDependencies, PaylibHostRouterDependencies {

    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes8.dex */
    public static final class DefaultImpls {
        public static CustomPaylibAnalytics getCustomPaylibAnalytics(PaylibNativeDependencies paylibNativeDependencies) {
            return PaylibNativePayMethodsDependencies.DefaultImpls.getCustomPaylibAnalytics(paylibNativeDependencies);
        }

        public static DeeplinkHandler getDeeplinkHandler(PaylibNativeDependencies paylibNativeDependencies) {
            return PaylibNativePayMethodsDependencies.DefaultImpls.getDeeplinkHandler(paylibNativeDependencies);
        }

        public static DeviceAuthDelegate getDeviceAuthDelegate(PaylibNativeDependencies paylibNativeDependencies) {
            return PaylibNativePayMethodsDependencies.DefaultImpls.getDeviceAuthDelegate(paylibNativeDependencies);
        }

        public static PaylibNativeFeatureFlags getFeatureFlags(PaylibNativeDependencies paylibNativeDependencies) {
            return PaylibNativePayMethodsDependencies.DefaultImpls.getFeatureFlags(paylibNativeDependencies);
        }
    }
}
