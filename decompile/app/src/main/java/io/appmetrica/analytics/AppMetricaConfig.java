package io.appmetrica.analytics;

import android.location.Location;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.AbstractC9346Y3;
import io.appmetrica.analytics.impl.AbstractC9452cb;
import io.appmetrica.analytics.impl.AbstractC9664kn;
import io.appmetrica.analytics.impl.C8858Dm;
import io.appmetrica.analytics.impl.C9441c0;
import io.appmetrica.analytics.impl.C9896u5;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class AppMetricaConfig {

    @NonNull
    public final Map<String, Object> additionalConfig;

    @Nullable
    public final Boolean anrMonitoring;

    @Nullable
    public final Integer anrMonitoringTimeout;

    @NonNull
    public final String apiKey;

    @Nullable
    public final Integer appBuildNumber;

    @Nullable
    public final Map<String, String> appEnvironment;

    @Nullable
    public final Boolean appOpenTrackingEnabled;

    @Nullable
    public final String appVersion;

    @Nullable
    public final Boolean crashReporting;

    @Nullable
    public final ICrashTransformer crashTransformer;

    @Nullable
    public final List<String> customHosts;

    @Nullable
    public final Boolean dataSendingEnabled;

    @Nullable
    public final String deviceType;

    @Nullable
    public final Integer dispatchPeriodSeconds;

    @Nullable
    public final Map<String, String> errorEnvironment;

    @Nullable
    public final Boolean firstActivationAsUpdate;

    @Nullable
    public final Location location;

    @Nullable
    public final Boolean locationTracking;

    @Nullable
    public final Boolean logs;

    @Nullable
    public final Integer maxReportsCount;

    @Nullable
    public final Integer maxReportsInDatabaseCount;

    @Nullable
    public final Boolean nativeCrashReporting;

    @Nullable
    public final PreloadInfo preloadInfo;

    @Nullable
    public final Boolean revenueAutoTrackingEnabled;

    @Nullable
    public final Integer sessionTimeout;

    @Nullable
    public final Boolean sessionsAutoTrackingEnabled;

    @Nullable
    public final String userProfileID;

    public static class Builder {

        /* renamed from: C */
        private static final C8858Dm f5930C = new C8858Dm(new C9441c0());

        /* renamed from: A */
        private List f5931A;

        /* renamed from: B */
        private final HashMap f5932B;

        /* renamed from: a */
        private final C9896u5 f5933a;

        /* renamed from: b */
        private final String f5934b;

        /* renamed from: c */
        private String f5935c;

        /* renamed from: d */
        private Integer f5936d;

        /* renamed from: e */
        private Boolean f5937e;

        /* renamed from: f */
        private Boolean f5938f;

        /* renamed from: g */
        private Location f5939g;

        /* renamed from: h */
        private Boolean f5940h;

        /* renamed from: i */
        private Boolean f5941i;

        /* renamed from: j */
        private PreloadInfo f5942j;

        /* renamed from: k */
        private Boolean f5943k;

        /* renamed from: l */
        private Boolean f5944l;

        /* renamed from: m */
        private Integer f5945m;

        /* renamed from: n */
        private final LinkedHashMap f5946n;

        /* renamed from: o */
        private String f5947o;

        /* renamed from: p */
        private Boolean f5948p;

        /* renamed from: q */
        private Boolean f5949q;

        /* renamed from: r */
        private Boolean f5950r;

        /* renamed from: s */
        private String f5951s;

        /* renamed from: t */
        private Integer f5952t;

        /* renamed from: u */
        private Integer f5953u;

        /* renamed from: v */
        private Integer f5954v;

        /* renamed from: w */
        private final LinkedHashMap f5955w;

        /* renamed from: x */
        private ICrashTransformer f5956x;

        /* renamed from: y */
        private Boolean f5957y;

        /* renamed from: z */
        private Integer f5958z;

        public /* synthetic */ Builder(String str, int i) {
            this(str);
        }

        @NonNull
        public AppMetricaConfig build() {
            return new AppMetricaConfig(this, 0);
        }

        @NonNull
        public Builder handleFirstActivationAsUpdate(boolean z) {
            this.f5943k = Boolean.valueOf(z);
            return this;
        }

        @NonNull
        public Builder withAdditionalConfig(@NonNull String str, @Nullable Object obj) {
            this.f5932B.put(str, obj);
            return this;
        }

        @NonNull
        public Builder withAnrMonitoring(boolean z) {
            this.f5957y = Boolean.valueOf(z);
            return this;
        }

        @NonNull
        public Builder withAnrMonitoringTimeout(int i) {
            this.f5958z = Integer.valueOf(i);
            return this;
        }

        @NonNull
        public Builder withAppBuildNumber(int i) {
            if (i < 0) {
                throw new IllegalArgumentException(String.format(Locale.US, "Invalid %1$s. %1$s should be positive.", "App Build Number"));
            }
            this.f5952t = Integer.valueOf(i);
            return this;
        }

        @NonNull
        public Builder withAppEnvironmentValue(@NonNull String str, @Nullable String str2) {
            this.f5955w.put(str, str2);
            return this;
        }

        @NonNull
        public Builder withAppOpenTrackingEnabled(boolean z) {
            this.f5950r = Boolean.valueOf(z);
            return this;
        }

        @NonNull
        public Builder withAppVersion(@Nullable String str) {
            this.f5935c = str;
            return this;
        }

        @NonNull
        public Builder withCrashReporting(boolean z) {
            this.f5937e = Boolean.valueOf(z);
            return this;
        }

        @NonNull
        public Builder withCrashTransformer(@Nullable ICrashTransformer iCrashTransformer) {
            this.f5956x = iCrashTransformer;
            return this;
        }

        @NonNull
        public Builder withCustomHosts(@NonNull List<String> list) {
            this.f5931A = CollectionUtils.unmodifiableListCopy(list);
            return this;
        }

        @NonNull
        public Builder withDataSendingEnabled(boolean z) {
            this.f5944l = Boolean.valueOf(z);
            return this;
        }

        @NonNull
        public Builder withDeviceType(@Nullable String str) {
            this.f5951s = str;
            return this;
        }

        @NonNull
        public Builder withDispatchPeriodSeconds(int i) {
            this.f5953u = Integer.valueOf(i);
            return this;
        }

        @NonNull
        public Builder withErrorEnvironmentValue(@NonNull String str, @Nullable String str2) {
            this.f5946n.put(str, str2);
            return this;
        }

        @NonNull
        public Builder withLocation(@Nullable Location location) {
            this.f5939g = location;
            return this;
        }

        @NonNull
        public Builder withLocationTracking(boolean z) {
            this.f5940h = Boolean.valueOf(z);
            return this;
        }

        @NonNull
        public Builder withLogs() {
            this.f5941i = Boolean.TRUE;
            return this;
        }

        @NonNull
        public Builder withMaxReportsCount(int i) {
            this.f5954v = Integer.valueOf(i);
            return this;
        }

        @NonNull
        public Builder withMaxReportsInDatabaseCount(int i) {
            this.f5945m = Integer.valueOf(this.f5933a.m6851a(i));
            return this;
        }

        @NonNull
        public Builder withNativeCrashReporting(boolean z) {
            this.f5938f = Boolean.valueOf(z);
            return this;
        }

        @NonNull
        public Builder withPreloadInfo(@Nullable PreloadInfo preloadInfo) {
            this.f5942j = preloadInfo;
            return this;
        }

        @NonNull
        public Builder withRevenueAutoTrackingEnabled(boolean z) {
            this.f5948p = Boolean.valueOf(z);
            return this;
        }

        @NonNull
        public Builder withSessionTimeout(int i) {
            this.f5936d = Integer.valueOf(i);
            return this;
        }

        @NonNull
        public Builder withSessionsAutoTrackingEnabled(boolean z) {
            this.f5949q = Boolean.valueOf(z);
            return this;
        }

        @NonNull
        public Builder withUserProfileID(@Nullable String str) {
            this.f5947o = str;
            return this;
        }

        private Builder(String str) {
            this.f5946n = new LinkedHashMap();
            this.f5955w = new LinkedHashMap();
            this.f5932B = new HashMap();
            f5930C.mo5086a(str);
            this.f5933a = new C9896u5(str);
            this.f5934b = str;
        }
    }

    public /* synthetic */ AppMetricaConfig(Builder builder, int i) {
        this(builder);
    }

    @Nullable
    public static AppMetricaConfig fromJson(String str) {
        AppMetricaConfig appMetricaConfig;
        HashMap mapM5970c;
        HashMap mapM5970c2;
        HashMap mapM5970c3;
        if (TextUtils.isEmpty(str)) {
            appMetricaConfig = null;
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Builder builderNewConfigBuilder = newConfigBuilder(jSONObject.getString("apikey"));
                if (jSONObject.has("app_version")) {
                    builderNewConfigBuilder.withAppVersion(jSONObject.optString("app_version"));
                }
                if (jSONObject.has("session_timeout")) {
                    builderNewConfigBuilder.withSessionTimeout(jSONObject.getInt("session_timeout"));
                }
                builderNewConfigBuilder.withLocation(AbstractC9346Y3.m5768a(jSONObject.optString("location")));
                builderNewConfigBuilder.withPreloadInfo(AbstractC9346Y3.m5770b(jSONObject.optString("preload_info")));
                if (jSONObject.has("logs") && jSONObject.optBoolean("logs")) {
                    builderNewConfigBuilder.withLogs();
                }
                if (jSONObject.has("crash_enabled")) {
                    builderNewConfigBuilder.withCrashReporting(jSONObject.optBoolean("crash_enabled"));
                }
                if (jSONObject.has("crash_native_enabled")) {
                    builderNewConfigBuilder.withNativeCrashReporting(jSONObject.optBoolean("crash_native_enabled"));
                }
                if (jSONObject.has("location_enabled")) {
                    builderNewConfigBuilder.withLocationTracking(jSONObject.optBoolean("location_enabled"));
                }
                if (jSONObject.has("max_reports_in_db_count")) {
                    builderNewConfigBuilder.withMaxReportsInDatabaseCount(jSONObject.optInt("max_reports_in_db_count"));
                }
                if (jSONObject.has("error_environment") && (mapM5970c3 = AbstractC9452cb.m5970c(jSONObject.optString("error_environment"))) != null) {
                    for (Map.Entry entry : mapM5970c3.entrySet()) {
                        builderNewConfigBuilder.withErrorEnvironmentValue((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                if (jSONObject.has("first_activation_as_update")) {
                    builderNewConfigBuilder.handleFirstActivationAsUpdate(jSONObject.optBoolean("first_activation_as_update"));
                }
                if (jSONObject.has("data_sending_enabled")) {
                    builderNewConfigBuilder.withDataSendingEnabled(jSONObject.optBoolean("data_sending_enabled"));
                }
                if (jSONObject.has("user_profile_id")) {
                    appMetricaConfig = null;
                    try {
                        builderNewConfigBuilder.withUserProfileID(jSONObject.optString("user_profile_id", null));
                    } catch (Throwable unused) {
                    }
                } else {
                    appMetricaConfig = null;
                }
                if (jSONObject.has("revenue_auto_tracking_enabled")) {
                    builderNewConfigBuilder.withRevenueAutoTrackingEnabled(jSONObject.optBoolean("revenue_auto_tracking_enabled"));
                }
                if (jSONObject.has("sessions_auto_tracking_enabled")) {
                    builderNewConfigBuilder.withSessionsAutoTrackingEnabled(jSONObject.optBoolean("sessions_auto_tracking_enabled"));
                }
                if (jSONObject.has("app_open_tracking_enabled")) {
                    builderNewConfigBuilder.withAppOpenTrackingEnabled(jSONObject.optBoolean("app_open_tracking_enabled"));
                }
                if (jSONObject.has(CommonUrlParts.DEVICE_TYPE)) {
                    builderNewConfigBuilder.withDeviceType(jSONObject.optString(CommonUrlParts.DEVICE_TYPE));
                }
                if (jSONObject.has(CommonUrlParts.APP_VERSION_CODE)) {
                    builderNewConfigBuilder.withAppBuildNumber(jSONObject.optInt(CommonUrlParts.APP_VERSION_CODE));
                }
                if (jSONObject.has("dispatch_period_seconds")) {
                    builderNewConfigBuilder.withDispatchPeriodSeconds(jSONObject.optInt("dispatch_period_seconds"));
                }
                if (jSONObject.has("max_reports_count")) {
                    builderNewConfigBuilder.withMaxReportsCount(jSONObject.optInt("max_reports_count"));
                }
                if (jSONObject.has("app_environment") && (mapM5970c2 = AbstractC9452cb.m5970c(jSONObject.optString("app_environment"))) != null) {
                    for (Map.Entry entry2 : mapM5970c2.entrySet()) {
                        builderNewConfigBuilder.withAppEnvironmentValue((String) entry2.getKey(), (String) entry2.getValue());
                    }
                }
                if (jSONObject.has("anr_monitoring")) {
                    builderNewConfigBuilder.withAnrMonitoring(jSONObject.optBoolean("anr_monitoring"));
                }
                if (jSONObject.has("anr_monitoring_timeout")) {
                    builderNewConfigBuilder.withAnrMonitoringTimeout(jSONObject.optInt("anr_monitoring_timeout"));
                }
                if (jSONObject.has("customHosts")) {
                    builderNewConfigBuilder.withCustomHosts(AbstractC9452cb.m5966a(jSONObject.optJSONArray("customHosts")));
                }
                if (jSONObject.has("additional_config") && (mapM5970c = AbstractC9452cb.m5970c(jSONObject.optString("additional_config"))) != null) {
                    for (Map.Entry entry3 : mapM5970c.entrySet()) {
                        builderNewConfigBuilder.withAdditionalConfig((String) entry3.getKey(), entry3.getValue());
                    }
                }
                return builderNewConfigBuilder.build();
            } catch (Throwable unused2) {
            }
        }
        return appMetricaConfig;
    }

    @NonNull
    public static Builder newConfigBuilder(@NonNull String str) {
        return new Builder(str, 0);
    }

    public String toJson() {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("apikey", this.apiKey);
            jSONObject.put("app_version", this.appVersion);
            jSONObject.put("session_timeout", this.sessionTimeout);
            jSONObject.put("location", AbstractC9346Y3.m5769a(this.location));
            PreloadInfo preloadInfo = this.preloadInfo;
            JSONObject jSONObject2 = null;
            if (preloadInfo == null) {
                string = null;
            } else {
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("trackid", preloadInfo.getTrackingId());
                    Map<String, String> additionalParams = preloadInfo.getAdditionalParams();
                    jSONObject3.put("params", additionalParams == null ? null : new JSONObject(additionalParams));
                    string = jSONObject3.toString();
                } catch (Throwable unused) {
                }
            }
            jSONObject.put("preload_info", string);
            jSONObject.put("logs", this.logs);
            jSONObject.put("crash_enabled", this.crashReporting);
            jSONObject.put("crash_native_enabled", this.nativeCrashReporting);
            jSONObject.put("location_enabled", this.locationTracking);
            jSONObject.put("max_reports_in_db_count", this.maxReportsInDatabaseCount);
            Map<String, String> map = this.errorEnvironment;
            jSONObject.put("error_environment", map == null ? null : new JSONObject(map));
            jSONObject.put("first_activation_as_update", this.firstActivationAsUpdate);
            jSONObject.put("data_sending_enabled", this.dataSendingEnabled);
            jSONObject.put("user_profile_id", this.userProfileID);
            jSONObject.put("revenue_auto_tracking_enabled", this.revenueAutoTrackingEnabled);
            jSONObject.put("sessions_auto_tracking_enabled", this.sessionsAutoTrackingEnabled);
            jSONObject.put("app_open_tracking_enabled", this.appOpenTrackingEnabled);
            jSONObject.put(CommonUrlParts.DEVICE_TYPE, this.deviceType);
            jSONObject.put(CommonUrlParts.APP_VERSION_CODE, this.appBuildNumber);
            jSONObject.put("dispatch_period_seconds", this.dispatchPeriodSeconds);
            jSONObject.put("max_reports_count", this.maxReportsCount);
            Map<String, String> map2 = this.appEnvironment;
            jSONObject.put("app_environment", map2 == null ? null : new JSONObject(map2));
            jSONObject.put("anr_monitoring", this.anrMonitoring);
            jSONObject.put("anr_monitoring_timeout", this.anrMonitoringTimeout);
            List<String> list = this.customHosts;
            if (list != null) {
                jSONObject.put("customHosts", AbstractC9664kn.m6344a((Collection) list) ? null : new JSONArray((Collection) list));
            }
            Map<String, Object> map3 = this.additionalConfig;
            if (map3 != null) {
                jSONObject2 = new JSONObject(map3);
            }
            jSONObject.put("additional_config", jSONObject2);
            return jSONObject.toString();
        } catch (Throwable unused2) {
            return "";
        }
    }

    private AppMetricaConfig(Builder builder) {
        this.apiKey = builder.f5934b;
        this.appVersion = builder.f5935c;
        this.sessionTimeout = builder.f5936d;
        this.crashReporting = builder.f5937e;
        this.nativeCrashReporting = builder.f5938f;
        this.location = builder.f5939g;
        this.locationTracking = builder.f5940h;
        this.logs = builder.f5941i;
        this.preloadInfo = builder.f5942j;
        this.firstActivationAsUpdate = builder.f5943k;
        this.dataSendingEnabled = builder.f5944l;
        this.maxReportsInDatabaseCount = builder.f5945m;
        this.errorEnvironment = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f5946n);
        this.userProfileID = builder.f5947o;
        this.revenueAutoTrackingEnabled = builder.f5948p;
        this.sessionsAutoTrackingEnabled = builder.f5949q;
        this.appOpenTrackingEnabled = builder.f5950r;
        this.deviceType = builder.f5951s;
        this.appBuildNumber = builder.f5952t;
        this.dispatchPeriodSeconds = builder.f5953u;
        this.maxReportsCount = builder.f5954v;
        this.appEnvironment = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f5955w);
        this.crashTransformer = builder.f5956x;
        this.anrMonitoring = builder.f5957y;
        this.anrMonitoringTimeout = builder.f5958z;
        this.customHosts = builder.f5931A;
        this.additionalConfig = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f5932B);
    }

    public AppMetricaConfig(@NonNull AppMetricaConfig appMetricaConfig) {
        this.apiKey = appMetricaConfig.apiKey;
        this.appVersion = appMetricaConfig.appVersion;
        this.sessionTimeout = appMetricaConfig.sessionTimeout;
        this.crashReporting = appMetricaConfig.crashReporting;
        this.nativeCrashReporting = appMetricaConfig.nativeCrashReporting;
        this.location = appMetricaConfig.location;
        this.locationTracking = appMetricaConfig.locationTracking;
        this.logs = appMetricaConfig.logs;
        this.preloadInfo = appMetricaConfig.preloadInfo;
        this.firstActivationAsUpdate = appMetricaConfig.firstActivationAsUpdate;
        this.dataSendingEnabled = appMetricaConfig.dataSendingEnabled;
        this.maxReportsInDatabaseCount = appMetricaConfig.maxReportsInDatabaseCount;
        this.errorEnvironment = appMetricaConfig.errorEnvironment;
        this.userProfileID = appMetricaConfig.userProfileID;
        this.revenueAutoTrackingEnabled = appMetricaConfig.revenueAutoTrackingEnabled;
        this.sessionsAutoTrackingEnabled = appMetricaConfig.sessionsAutoTrackingEnabled;
        this.appOpenTrackingEnabled = appMetricaConfig.appOpenTrackingEnabled;
        this.deviceType = appMetricaConfig.deviceType;
        this.appBuildNumber = appMetricaConfig.appBuildNumber;
        this.dispatchPeriodSeconds = appMetricaConfig.dispatchPeriodSeconds;
        this.maxReportsCount = appMetricaConfig.maxReportsCount;
        this.appEnvironment = appMetricaConfig.appEnvironment;
        this.crashTransformer = appMetricaConfig.crashTransformer;
        this.anrMonitoring = appMetricaConfig.anrMonitoring;
        this.anrMonitoringTimeout = appMetricaConfig.anrMonitoringTimeout;
        this.customHosts = appMetricaConfig.customHosts;
        this.additionalConfig = appMetricaConfig.additionalConfig;
    }
}
