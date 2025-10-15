package io.appmetrica.analytics;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.webkit.WebView;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.impl.AbstractC8836D0;
import io.appmetrica.analytics.impl.AbstractC9717n1;
import io.appmetrica.analytics.impl.C9692m1;
import io.appmetrica.analytics.plugins.AppMetricaPlugins;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class AppMetrica {
    public static void activate(@NonNull Context context, @NonNull AppMetricaConfig appMetricaConfig) {
        AbstractC9717n1.f8693a.m6420a(context, appMetricaConfig);
    }

    public static void activateReporter(@NonNull Context context, @NonNull ReporterConfig reporterConfig) {
        AbstractC9717n1.f8693a.m6421a(context, reporterConfig);
    }

    public static void clearAppEnvironment() {
        AbstractC9717n1.f8693a.m6417a();
    }

    public static void enableActivityAutoTracking(@NonNull Application application) {
        AbstractC9717n1.f8693a.m6419a(application);
    }

    @Nullable
    public static String getDeviceId(@NonNull Context context) {
        return AbstractC9717n1.f8693a.m6442b();
    }

    public static int getLibraryApiLevel() {
        return 115;
    }

    @NonNull
    public static String getLibraryVersion() {
        return "7.3.0";
    }

    @NonNull
    public static AppMetricaPlugins getPluginExtension() {
        return AbstractC8836D0.f6440a;
    }

    @NonNull
    public static IReporter getReporter(@NonNull Context context, @NonNull String str) {
        return AbstractC9717n1.f8693a.m6415a(context, str);
    }

    @Nullable
    public static String getUuid(@NonNull Context context) {
        return AbstractC9717n1.f8693a.m6416a(context).f9419id;
    }

    @MainThread
    public static void initWebViewReporting(@NonNull WebView webView) {
        AbstractC9717n1.f8693a.m6425a(webView);
    }

    public static void pauseSession(@Nullable Activity activity) {
        AbstractC9717n1.f8693a.m6418a(activity);
    }

    public static void putAppEnvironmentValue(@NonNull String str, @Nullable String str2) {
        AbstractC9717n1.f8693a.m6435a(str, str2);
    }

    public static void putErrorEnvironmentValue(@NonNull String str, @Nullable String str2) {
        AbstractC9717n1.f8693a.m6446b(str, str2);
    }

    public static void registerAnrListener(@NonNull AnrListener anrListener) {
        AbstractC9717n1.f8693a.m6427a(anrListener);
    }

    public static void reportAdRevenue(@NonNull AdRevenue adRevenue) {
        AbstractC9717n1.f8693a.m6426a(adRevenue);
    }

    public static void reportAnr(@NonNull Map<Thread, StackTraceElement[]> map) {
        AbstractC9717n1.f8693a.m6440a(map);
    }

    public static void reportAppOpen(@NonNull Activity activity) {
        AbstractC9717n1.f8693a.m6443b(activity);
    }

    public static void reportECommerce(@NonNull ECommerceEvent eCommerceEvent) {
        AbstractC9717n1.f8693a.m6432a(eCommerceEvent);
    }

    public static void reportError(@NonNull String str, @Nullable String str2) {
        AbstractC9717n1.f8693a.m6436a(str, str2, (Throwable) null);
    }

    public static void reportEvent(@NonNull String str) {
        AbstractC9717n1.f8693a.m6445b(str);
    }

    public static void reportExternalAdRevenue(@NonNull Object... objArr) {
        AbstractC9717n1.f8693a.m6448b(objArr);
    }

    public static void reportExternalAttribution(@NonNull ExternalAttribution externalAttribution) {
        AbstractC9717n1.f8693a.m6430a(externalAttribution);
    }

    public static void reportReferralUrl(@NonNull String str) {
        AbstractC9717n1.f8693a.m6453d(str);
    }

    public static void reportRevenue(@NonNull Revenue revenue) {
        AbstractC9717n1.f8693a.m6431a(revenue);
    }

    public static void reportUnhandledException(@NonNull Throwable th) {
        AbstractC9717n1.f8693a.m6439a(th);
    }

    public static void reportUserProfile(@NonNull UserProfile userProfile) {
        AbstractC9717n1.f8693a.m6433a(userProfile);
    }

    public static void requestDeferredDeeplink(@NonNull DeferredDeeplinkListener deferredDeeplinkListener) {
        AbstractC9717n1.f8693a.m6428a(deferredDeeplinkListener);
    }

    public static void requestDeferredDeeplinkParameters(@NonNull DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        AbstractC9717n1.f8693a.m6429a(deferredDeeplinkParametersListener);
    }

    public static void requestStartupParams(@NonNull Context context, @NonNull StartupParamsCallback startupParamsCallback, @NonNull List<String> list) {
        C9692m1 c9692m1 = AbstractC9717n1.f8693a;
        if (list.isEmpty()) {
            list = Arrays.asList(StartupParamsCallback.APPMETRICA_UUID, StartupParamsCallback.APPMETRICA_DEVICE_ID, StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH);
        }
        c9692m1.m6422a(context, startupParamsCallback, list);
    }

    public static void resumeSession(@Nullable Activity activity) {
        AbstractC9717n1.f8693a.m6449c(activity);
    }

    public static void sendEventsBuffer() {
        AbstractC9717n1.f8693a.m6457f();
    }

    public static void setDataSendingEnabled(boolean z) {
        AbstractC9717n1.f8693a.m6441a(z);
    }

    public static void setLocation(@Nullable Location location) {
        AbstractC9717n1.f8693a.m6424a(location);
    }

    public static void setLocationTracking(boolean z) {
        AbstractC9717n1.f8693a.m6447b(z);
    }

    public static void setUserProfileID(@Nullable String str) {
        AbstractC9717n1.f8693a.m6456e(str);
    }

    public static void reportAppOpen(@NonNull Intent intent) {
        AbstractC9717n1.f8693a.m6423a(intent);
    }

    public static void reportError(@NonNull String str, @Nullable String str2, @Nullable Throwable th) {
        AbstractC9717n1.f8693a.m6436a(str, str2, th);
    }

    public static void reportEvent(@NonNull String str, @Nullable String str2) {
        AbstractC9717n1.f8693a.m6451c(str, str2);
    }

    public static void reportAppOpen(@NonNull String str) {
        AbstractC9717n1.f8693a.m6434a(str);
    }

    public static void reportError(@NonNull String str, @Nullable Throwable th) {
        AbstractC9717n1.f8693a.m6437a(str, th);
    }

    public static void reportEvent(@NonNull String str, @Nullable Map<String, Object> map) {
        AbstractC9717n1.f8693a.m6438a(str, map);
    }
}
