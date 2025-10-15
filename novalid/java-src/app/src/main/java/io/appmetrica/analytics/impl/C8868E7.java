package io.appmetrica.analytics.impl;

import android.location.Location;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AppMetricaConfig;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.E7 */
/* loaded from: classes7.dex */
public final class C8868E7 implements InterfaceC9878tc {

    /* renamed from: a */
    public Location f6529a;

    /* renamed from: b */
    public Boolean f6530b;

    /* renamed from: c */
    public Boolean f6531c;

    /* renamed from: d */
    public final LinkedHashMap f6532d = new LinkedHashMap();

    /* renamed from: e */
    public final LinkedHashMap f6533e = new LinkedHashMap();

    /* renamed from: f */
    public boolean f6534f;

    /* renamed from: g */
    public String f6535g;

    /* renamed from: h */
    public boolean f6536h;

    /* renamed from: i */
    public C9145Ph f6537i;

    @Override // io.appmetrica.analytics.impl.InterfaceC9878tc
    /* renamed from: a */
    public final void mo4942a(boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        this.f6530b = boolValueOf;
        C9145Ph c9145Ph = this.f6537i;
        if (c9145Ph != null) {
            Boolean bool = this.f6531c;
            if (AbstractC9664kn.m6342a(boolValueOf)) {
                c9145Ph.f7115a.f7617b.setLocationTracking(z);
            }
            if (AbstractC9664kn.m6342a(bool)) {
                c9145Ph.f7115a.f7617b.setDataSendingEnabled(bool.booleanValue());
            }
            C9252U5 c9252u5M5632a = C9252U5.m5632a();
            C9251U4 c9251u4 = c9145Ph.f7115a;
            c9145Ph.m5493a(C9145Ph.m5490a(c9252u5M5632a, c9251u4), c9251u4, 1, null);
        }
    }

    /* renamed from: b */
    public final AppMetricaConfig m5105b(AppMetricaConfig appMetricaConfig) {
        if (this.f6536h) {
            return appMetricaConfig;
        }
        AppMetricaConfig.Builder builderNewConfigBuilder = AppMetricaConfig.newConfigBuilder(appMetricaConfig.apiKey);
        builderNewConfigBuilder.withDeviceType(appMetricaConfig.deviceType);
        builderNewConfigBuilder.withPreloadInfo(appMetricaConfig.preloadInfo);
        builderNewConfigBuilder.withLocation(appMetricaConfig.location);
        if (AbstractC9664kn.m6342a(appMetricaConfig.appVersion)) {
            builderNewConfigBuilder.withAppVersion(appMetricaConfig.appVersion);
        }
        if (AbstractC9664kn.m6342a(appMetricaConfig.dispatchPeriodSeconds)) {
            builderNewConfigBuilder.withDispatchPeriodSeconds(appMetricaConfig.dispatchPeriodSeconds.intValue());
        }
        if (AbstractC9664kn.m6342a(appMetricaConfig.appBuildNumber)) {
            builderNewConfigBuilder.withAppBuildNumber(appMetricaConfig.appBuildNumber.intValue());
        }
        if (AbstractC9664kn.m6342a(appMetricaConfig.maxReportsCount)) {
            builderNewConfigBuilder.withMaxReportsCount(appMetricaConfig.maxReportsCount.intValue());
        }
        if (AbstractC9664kn.m6342a(appMetricaConfig.logs) && appMetricaConfig.logs.booleanValue()) {
            builderNewConfigBuilder.withLogs();
        }
        if (AbstractC9664kn.m6342a(appMetricaConfig.sessionTimeout)) {
            builderNewConfigBuilder.withSessionTimeout(appMetricaConfig.sessionTimeout.intValue());
        }
        if (AbstractC9664kn.m6342a(appMetricaConfig.sessionsAutoTrackingEnabled)) {
            builderNewConfigBuilder.withSessionsAutoTrackingEnabled(appMetricaConfig.sessionsAutoTrackingEnabled.booleanValue());
        }
        if (AbstractC9664kn.m6342a(appMetricaConfig.crashReporting)) {
            builderNewConfigBuilder.withCrashReporting(appMetricaConfig.crashReporting.booleanValue());
        }
        if (AbstractC9664kn.m6342a(appMetricaConfig.nativeCrashReporting)) {
            builderNewConfigBuilder.withNativeCrashReporting(appMetricaConfig.nativeCrashReporting.booleanValue());
        }
        if (AbstractC9664kn.m6342a(appMetricaConfig.locationTracking)) {
            builderNewConfigBuilder.withLocationTracking(appMetricaConfig.locationTracking.booleanValue());
        }
        if (AbstractC9664kn.m6342a(appMetricaConfig.firstActivationAsUpdate)) {
            builderNewConfigBuilder.handleFirstActivationAsUpdate(appMetricaConfig.firstActivationAsUpdate.booleanValue());
        }
        if (AbstractC9664kn.m6342a(appMetricaConfig.dataSendingEnabled)) {
            builderNewConfigBuilder.withDataSendingEnabled(appMetricaConfig.dataSendingEnabled.booleanValue());
        }
        if (AbstractC9664kn.m6342a(appMetricaConfig.anrMonitoring)) {
            builderNewConfigBuilder.withAnrMonitoring(appMetricaConfig.anrMonitoring.booleanValue());
        }
        if (AbstractC9664kn.m6342a(appMetricaConfig.anrMonitoringTimeout)) {
            builderNewConfigBuilder.withAnrMonitoringTimeout(appMetricaConfig.anrMonitoringTimeout.intValue());
        }
        if (AbstractC9664kn.m6342a(appMetricaConfig.maxReportsInDatabaseCount)) {
            builderNewConfigBuilder.withMaxReportsInDatabaseCount(appMetricaConfig.maxReportsInDatabaseCount.intValue());
        }
        if (AbstractC9664kn.m6342a(appMetricaConfig.crashTransformer)) {
            builderNewConfigBuilder.withCrashTransformer(appMetricaConfig.crashTransformer);
        }
        if (AbstractC9664kn.m6342a(appMetricaConfig.userProfileID)) {
            builderNewConfigBuilder.withUserProfileID(appMetricaConfig.userProfileID);
        }
        if (AbstractC9664kn.m6342a(appMetricaConfig.revenueAutoTrackingEnabled)) {
            builderNewConfigBuilder.withRevenueAutoTrackingEnabled(appMetricaConfig.revenueAutoTrackingEnabled.booleanValue());
        }
        if (AbstractC9664kn.m6342a(appMetricaConfig.appOpenTrackingEnabled)) {
            builderNewConfigBuilder.withAppOpenTrackingEnabled(appMetricaConfig.appOpenTrackingEnabled.booleanValue());
        }
        if (AbstractC9664kn.m6342a((Object) appMetricaConfig.customHosts)) {
            builderNewConfigBuilder.withCustomHosts(appMetricaConfig.customHosts);
        }
        LinkedHashMap linkedHashMap = this.f6532d;
        if (!AbstractC9664kn.m6345a((Map) linkedHashMap)) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                builderNewConfigBuilder.withAppEnvironmentValue((String) entry.getKey(), (String) entry.getValue());
            }
        }
        Map<String, String> map = appMetricaConfig.appEnvironment;
        if (!AbstractC9664kn.m6345a((Map) map)) {
            for (Map.Entry<String, String> entry2 : map.entrySet()) {
                builderNewConfigBuilder.withAppEnvironmentValue(entry2.getKey(), entry2.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = this.f6533e;
        if (!AbstractC9664kn.m6345a((Map) linkedHashMap2)) {
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                builderNewConfigBuilder.withErrorEnvironmentValue((String) entry3.getKey(), (String) entry3.getValue());
            }
        }
        Map<String, String> map2 = appMetricaConfig.errorEnvironment;
        if (!AbstractC9664kn.m6345a((Map) map2)) {
            for (Map.Entry<String, String> entry4 : map2.entrySet()) {
                builderNewConfigBuilder.withErrorEnvironmentValue(entry4.getKey(), entry4.getValue());
            }
        }
        Map<String, Object> map3 = appMetricaConfig.additionalConfig;
        if (!AbstractC9664kn.m6345a((Map) map3)) {
            for (Map.Entry<String, Object> entry5 : map3.entrySet()) {
                builderNewConfigBuilder.withAdditionalConfig(entry5.getKey(), entry5.getValue());
            }
        }
        Boolean bool = this.f6530b;
        if (appMetricaConfig.locationTracking == null && AbstractC9664kn.m6342a(bool)) {
            builderNewConfigBuilder.withLocationTracking(bool.booleanValue());
        }
        Location location = this.f6529a;
        if (appMetricaConfig.location == null && AbstractC9664kn.m6342a(location)) {
            builderNewConfigBuilder.withLocation(location);
        }
        Boolean bool2 = this.f6531c;
        if (appMetricaConfig.dataSendingEnabled == null && AbstractC9664kn.m6342a(bool2)) {
            builderNewConfigBuilder.withDataSendingEnabled(bool2.booleanValue());
        }
        if (!AbstractC9664kn.m6342a(appMetricaConfig.userProfileID) && AbstractC9664kn.m6342a(this.f6535g)) {
            builderNewConfigBuilder.withUserProfileID(this.f6535g);
        }
        this.f6536h = true;
        this.f6529a = null;
        this.f6530b = null;
        this.f6531c = null;
        this.f6532d.clear();
        this.f6533e.clear();
        this.f6534f = false;
        this.f6535g = null;
        return builderNewConfigBuilder.build();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9878tc
    public final void clearAppEnvironment() {
        this.f6534f = true;
        this.f6532d.clear();
    }

    /* renamed from: k */
    public final Location m5106k() {
        return this.f6529a;
    }

    /* renamed from: l */
    public final Boolean m5107l() {
        return this.f6531c;
    }

    /* renamed from: m */
    public final Boolean m5108m() {
        return this.f6530b;
    }

    /* renamed from: n */
    public final boolean m5109n() {
        return this.f6534f;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9878tc
    public final void putAppEnvironmentValue(String str, String str2) {
        this.f6532d.put(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9878tc
    public final void setDataSendingEnabled(boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        this.f6531c = boolValueOf;
        C9145Ph c9145Ph = this.f6537i;
        if (c9145Ph != null) {
            Boolean bool = this.f6530b;
            if (AbstractC9664kn.m6342a(bool)) {
                c9145Ph.f7115a.f7617b.setLocationTracking(bool.booleanValue());
            }
            if (AbstractC9664kn.m6342a(boolValueOf)) {
                c9145Ph.f7115a.f7617b.setDataSendingEnabled(z);
            }
            C9252U5 c9252u5M5632a = C9252U5.m5632a();
            C9251U4 c9251u4 = c9145Ph.f7115a;
            c9145Ph.m5493a(C9145Ph.m5490a(c9252u5M5632a, c9251u4), c9251u4, 1, null);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9878tc
    public final void setUserProfileID(@Nullable String str) {
        this.f6535g = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9878tc
    /* renamed from: a */
    public final void mo4935a(@Nullable Location location) {
        this.f6529a = location;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9878tc
    /* renamed from: a */
    public final void mo4941a(String str, String str2) {
        this.f6533e.put(str, str2);
    }

    /* renamed from: a */
    public final void m5104a(C9145Ph c9145Ph) {
        this.f6537i = c9145Ph;
    }
}
