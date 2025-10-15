package io.appmetrica.analytics.internal;

import android.content.ContentValues;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreutils.internal.LocationUtils;
import io.appmetrica.analytics.impl.AbstractC9664kn;

/* loaded from: classes8.dex */
public class CounterConfiguration implements Parcelable {
    public static final Parcelable.Creator<CounterConfiguration> CREATOR = new C10041b();

    /* renamed from: a */
    private final ContentValues f9416a;

    public /* synthetic */ CounterConfiguration(ContentValues contentValues, int i) {
        this(contentValues);
    }

    /* renamed from: a */
    private void m7016a(String str) {
        if (AbstractC9664kn.m6342a(str)) {
            setApiKey(str);
        }
    }

    /* renamed from: b */
    private void m7019b(String str) {
        if ("20799a27-fa80-4b36-b2db-0f8141f24180".equals(str)) {
            setReporterType(CounterConfigurationReporterType.SELF_SDK);
        } else {
            setReporterType(CounterConfigurationReporterType.MANUAL);
        }
    }

    /* renamed from: c */
    private void m7020c(Integer num) {
        if (AbstractC9664kn.m6342a(num)) {
            this.f9416a.put("MAX_REPORTS_IN_DB_COUNT", num);
        }
    }

    /* renamed from: d */
    private void m7021d(Integer num) {
        if (AbstractC9664kn.m6342a(num)) {
            setSessionTimeout(num.intValue());
        }
    }

    public static CounterConfiguration fromBundle(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        try {
            return (CounterConfiguration) bundle.getParcelable("COUNTER_CFG_OBJ");
        } catch (Throwable unused) {
            return null;
        }
    }

    public synchronized void applyFromConfig(@NonNull AppMetricaConfig appMetricaConfig) {
        try {
            m7016a(appMetricaConfig.apiKey);
            m7021d(appMetricaConfig.sessionTimeout);
            if (AbstractC9664kn.m6342a(appMetricaConfig.location)) {
                setManualLocation(appMetricaConfig.location);
            }
            if (AbstractC9664kn.m6342a(appMetricaConfig.locationTracking)) {
                setLocationTracking(appMetricaConfig.locationTracking.booleanValue());
            }
            if (AbstractC9664kn.m6342a(appMetricaConfig.deviceType)) {
                setDeviceType(appMetricaConfig.deviceType);
            }
            m7015a(appMetricaConfig.dispatchPeriodSeconds);
            m7018b(appMetricaConfig.maxReportsCount);
            m7017b(appMetricaConfig.logs);
            if (!TextUtils.isEmpty(appMetricaConfig.appVersion)) {
                setCustomAppVersion(appMetricaConfig.appVersion);
            }
            if (AbstractC9664kn.m6342a(appMetricaConfig.appBuildNumber)) {
                setAppBuildNumber(appMetricaConfig.appBuildNumber.intValue());
            }
            if (AbstractC9664kn.m6342a(appMetricaConfig.firstActivationAsUpdate)) {
                setFirstActivationAsUpdate(appMetricaConfig.firstActivationAsUpdate.booleanValue());
            }
            m7014a(appMetricaConfig.dataSendingEnabled);
            m7020c(appMetricaConfig.maxReportsInDatabaseCount);
            Boolean bool = appMetricaConfig.nativeCrashReporting;
            if (AbstractC9664kn.m6342a(bool)) {
                this.f9416a.put("CFG_NATIVE_CRASHES_ENABLED", bool);
            }
            if (AbstractC9664kn.m6342a(appMetricaConfig.revenueAutoTrackingEnabled)) {
                setRevenueAutoTrackingEnabled(appMetricaConfig.revenueAutoTrackingEnabled.booleanValue());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getApiKey() {
        return this.f9416a.getAsString("CFG_API_KEY");
    }

    public String getAppBuildNumber() {
        return this.f9416a.getAsString("CFG_APP_VERSION_CODE");
    }

    public String getAppVersion() {
        return this.f9416a.getAsString("CFG_APP_VERSION");
    }

    public Boolean getDataSendingEnabled() {
        return this.f9416a.getAsBoolean("CFG_DATA_SENDING_ENABLED");
    }

    @Nullable
    public String getDeviceType() {
        return this.f9416a.getAsString("CFG_DEVICE_SIZE_TYPE");
    }

    @Nullable
    public Integer getDispatchPeriod() {
        return this.f9416a.getAsInteger("CFG_DISPATCH_PERIOD");
    }

    public Location getManualLocation() {
        if (this.f9416a.containsKey("CFG_MANUAL_LOCATION")) {
            return LocationUtils.bytesToLocation(this.f9416a.getAsByteArray("CFG_MANUAL_LOCATION"));
        }
        return null;
    }

    @Nullable
    public Integer getMaxReportsCount() {
        return this.f9416a.getAsInteger("CFG_MAX_REPORTS_COUNT");
    }

    @Nullable
    public Integer getMaxReportsInDbCount() {
        return this.f9416a.getAsInteger("MAX_REPORTS_IN_DB_COUNT");
    }

    @Nullable
    public Boolean getReportNativeCrashesEnabled() {
        return this.f9416a.getAsBoolean("CFG_NATIVE_CRASHES_ENABLED");
    }

    @NonNull
    public CounterConfigurationReporterType getReporterType() {
        return CounterConfigurationReporterType.fromStringValue(this.f9416a.getAsString("CFG_REPORTER_TYPE"));
    }

    @Nullable
    public Integer getSessionTimeout() {
        return this.f9416a.getAsInteger("CFG_SESSION_TIMEOUT");
    }

    public String getUuid() {
        return this.f9416a.getAsString("CFG_UUID");
    }

    @Nullable
    public Boolean isFirstActivationAsUpdate() {
        return this.f9416a.getAsBoolean("CFG_IS_FIRST_ACTIVATION_AS_UPDATE");
    }

    @Nullable
    public Boolean isLocationTrackingEnabled() {
        return this.f9416a.getAsBoolean("CFG_LOCATION_TRACKING");
    }

    @Nullable
    public Boolean isLogEnabled() {
        return this.f9416a.getAsBoolean("CFG_IS_LOG_ENABLED");
    }

    @Nullable
    public synchronized Boolean isRevenueAutoTrackingEnabled() {
        return this.f9416a.getAsBoolean("CFG_REVENUE_AUTO_TRACKING_ENABLED");
    }

    @VisibleForTesting
    public synchronized void setApiKey(String str) {
        this.f9416a.put("CFG_API_KEY", str);
    }

    public synchronized void setAppBuildNumber(int i) {
        this.f9416a.put("CFG_APP_VERSION_CODE", String.valueOf(i));
    }

    public final synchronized void setCustomAppVersion(String str) {
        this.f9416a.put("CFG_APP_VERSION", str);
    }

    public final synchronized void setDataSendingEnabled(boolean z) {
        this.f9416a.put("CFG_DATA_SENDING_ENABLED", Boolean.valueOf(z));
    }

    public final synchronized void setDeviceType(@Nullable String str) {
        ContentValues contentValues = this.f9416a;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        contentValues.put("CFG_DEVICE_SIZE_TYPE", str);
    }

    @VisibleForTesting
    public synchronized void setDispatchPeriod(int i) {
        this.f9416a.put("CFG_DISPATCH_PERIOD", Integer.valueOf(i));
    }

    public final synchronized void setFirstActivationAsUpdate(boolean z) {
        this.f9416a.put("CFG_IS_FIRST_ACTIVATION_AS_UPDATE", Boolean.valueOf(z));
    }

    public synchronized void setLocationTracking(boolean z) {
        this.f9416a.put("CFG_LOCATION_TRACKING", Boolean.valueOf(z));
    }

    public synchronized void setLogEnabled(boolean z) {
        this.f9416a.put("CFG_IS_LOG_ENABLED", Boolean.valueOf(z));
    }

    public final synchronized void setManualLocation(@Nullable Location location) {
        this.f9416a.put("CFG_MANUAL_LOCATION", LocationUtils.locationToBytes(location));
    }

    @VisibleForTesting
    public synchronized void setMaxReportsCount(int i) {
        ContentValues contentValues = this.f9416a;
        if (i <= 0) {
            i = Integer.MAX_VALUE;
        }
        contentValues.put("CFG_MAX_REPORTS_COUNT", Integer.valueOf(i));
    }

    @VisibleForTesting
    public void setMaxReportsInDbCount(int i) {
        this.f9416a.put("MAX_REPORTS_IN_DB_COUNT", Integer.valueOf(i));
    }

    public synchronized void setReporterType(@NonNull CounterConfigurationReporterType counterConfigurationReporterType) {
        this.f9416a.put("CFG_REPORTER_TYPE", counterConfigurationReporterType.getStringValue());
    }

    public synchronized void setRevenueAutoTrackingEnabled(boolean z) {
        this.f9416a.put("CFG_REVENUE_AUTO_TRACKING_ENABLED", Boolean.valueOf(z));
    }

    @VisibleForTesting
    public synchronized void setSessionTimeout(int i) {
        this.f9416a.put("CFG_SESSION_TIMEOUT", Integer.valueOf(i));
    }

    public synchronized void setUuid(String str) {
        this.f9416a.put("CFG_UUID", str);
    }

    public synchronized void toBundle(Bundle bundle) {
        bundle.putParcelable("COUNTER_CFG_OBJ", this);
    }

    public synchronized String toString() {
        return "CounterConfiguration{mParamsMapping=" + this.f9416a + '}';
    }

    @Override // android.os.Parcelable
    public synchronized void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.internal.CounterConfiguration.data", this.f9416a);
        parcel.writeBundle(bundle);
    }

    public CounterConfiguration(@NonNull CounterConfiguration counterConfiguration) {
        synchronized (counterConfiguration) {
            this.f9416a = new ContentValues(counterConfiguration.f9416a);
        }
    }

    /* renamed from: a */
    private void m7015a(Integer num) {
        if (AbstractC9664kn.m6342a(num)) {
            setDispatchPeriod(num.intValue());
        }
    }

    /* renamed from: a */
    private void m7014a(Boolean bool) {
        if (AbstractC9664kn.m6342a(bool)) {
            setDataSendingEnabled(bool.booleanValue());
        }
    }

    /* renamed from: b */
    private void m7018b(Integer num) {
        if (AbstractC9664kn.m6342a(num)) {
            setMaxReportsCount(num.intValue());
        }
    }

    public CounterConfiguration() {
        this.f9416a = new ContentValues();
    }

    /* renamed from: b */
    private void m7017b(Boolean bool) {
        if (AbstractC9664kn.m6342a(bool)) {
            setLogEnabled(bool.booleanValue());
        }
    }

    public CounterConfiguration(@NonNull String str) {
        this();
        synchronized (this) {
            setApiKey(str);
        }
    }

    public CounterConfiguration(@NonNull CounterConfigurationReporterType counterConfigurationReporterType) {
        this();
        synchronized (this) {
            setReporterType(counterConfigurationReporterType);
        }
    }

    public CounterConfiguration(AppMetricaConfig appMetricaConfig, @NonNull CounterConfigurationReporterType counterConfigurationReporterType) {
        this();
        synchronized (this) {
            applyFromConfig(appMetricaConfig);
            setReporterType(counterConfigurationReporterType);
        }
    }

    public CounterConfiguration(@NonNull ReporterConfig reporterConfig) {
        this();
        synchronized (this) {
            m7016a(reporterConfig.apiKey);
            m7021d(reporterConfig.sessionTimeout);
            m7015a(reporterConfig.dispatchPeriodSeconds);
            m7018b(reporterConfig.maxReportsCount);
            m7017b(reporterConfig.logs);
            m7014a(reporterConfig.dataSendingEnabled);
            m7020c(reporterConfig.maxReportsInDatabaseCount);
            m7019b(reporterConfig.apiKey);
        }
    }

    private CounterConfiguration(ContentValues contentValues) {
        this.f9416a = contentValues;
    }
}
