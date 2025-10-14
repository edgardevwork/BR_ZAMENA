package io.appmetrica.analytics.networktasks.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreapi.internal.model.SdkEnvironment;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;

/* loaded from: classes7.dex */
public class BaseRequestConfig {

    /* renamed from: a */
    private String f9567a;

    /* renamed from: b */
    private SdkEnvironment f9568b;

    /* renamed from: c */
    private SdkIdentifiers f9569c;

    /* renamed from: d */
    private AdvertisingIdsHolder f9570d;

    /* renamed from: e */
    private AppSetId f9571e;

    /* renamed from: f */
    private RetryPolicyConfig f9572f;

    /* loaded from: classes5.dex */
    public static abstract class BaseRequestArguments<I, O> implements ArgumentsMerger<I, O> {
    }

    /* loaded from: classes5.dex */
    public static abstract class ComponentLoader<T extends BaseRequestConfig, A extends BaseRequestArguments, D extends DataSource<A>> implements RequestConfigLoader<T, D> {

        /* renamed from: a */
        final Context f9573a;

        /* renamed from: b */
        final String f9574b;

        public ComponentLoader(@NonNull Context context, @NonNull String str) {
            this.f9573a = context;
            this.f9574b = str;
        }

        @NonNull
        public abstract T createBlankConfig();

        @NonNull
        public Context getContext() {
            return this.f9573a;
        }

        @NonNull
        public String getPackageName() {
            return this.f9574b;
        }

        @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
        @NonNull
        public T load(@NonNull D d) {
            T t = (T) createBlankConfig();
            t.setSdkIdentifiers(d.sdkIdentifiers);
            t.setSdkEnvironment(d.sdkEnvironmentProvider.getSdkEnvironment());
            PlatformIdentifiers platformIdentifiers = d.platformIdentifiers;
            t.setAppSetId(platformIdentifiers.getAppSetIdProvider().getAppSetId());
            t.setAdvertisingIdsHolder(platformIdentifiers.getAdvIdentifiersProvider().getIdentifiers(this.f9573a));
            t.setPackageName(this.f9574b);
            return t;
        }
    }

    public static class DataSource<A> {

        @NonNull
        public final A componentArguments;

        @NonNull
        public final PlatformIdentifiers platformIdentifiers;

        @NonNull
        public final SdkEnvironmentProvider sdkEnvironmentProvider;

        @NonNull
        public final SdkIdentifiers sdkIdentifiers;

        public DataSource(@NonNull SdkIdentifiers sdkIdentifiers, @NonNull SdkEnvironmentProvider sdkEnvironmentProvider, @NonNull PlatformIdentifiers platformIdentifiers, @NonNull A a2) {
            this.sdkIdentifiers = sdkIdentifiers;
            this.componentArguments = a2;
            this.sdkEnvironmentProvider = sdkEnvironmentProvider;
            this.platformIdentifiers = platformIdentifiers;
        }
    }

    public interface RequestConfigLoader<T extends BaseRequestConfig, D> {
        @NonNull
        T load(D d);
    }

    @Nullable
    public AdvertisingIdsHolder getAdvertisingIdsHolder() {
        return this.f9570d;
    }

    public String getAnalyticsSdkBuildNumber() {
        SdkEnvironment sdkEnvironment = this.f9568b;
        return sdkEnvironment == null ? "" : sdkEnvironment.getSdkInfo().getSdkBuildNumber();
    }

    @NonNull
    public String getAnalyticsSdkBuildType() {
        SdkEnvironment sdkEnvironment = this.f9568b;
        return sdkEnvironment == null ? "" : sdkEnvironment.getSdkInfo().getSdkBuildType();
    }

    public String getAnalyticsSdkVersionName() {
        SdkEnvironment sdkEnvironment = this.f9568b;
        return sdkEnvironment == null ? "" : sdkEnvironment.getSdkInfo().getSdkVersionName();
    }

    public String getAppBuildNumber() {
        SdkEnvironment sdkEnvironment = this.f9568b;
        return sdkEnvironment == null ? "" : sdkEnvironment.getAppVersionInfo().getAppBuildNumber();
    }

    @NonNull
    public String getAppFramework() {
        SdkEnvironment sdkEnvironment = this.f9568b;
        return sdkEnvironment == null ? "" : sdkEnvironment.getAppFramework();
    }

    public String getAppPlatform() {
        return "android";
    }

    @NonNull
    public synchronized String getAppSetId() {
        AppSetId appSetId;
        try {
            appSetId = this.f9571e;
        } finally {
        }
        return (appSetId == null || appSetId.getId() == null) ? "" : this.f9571e.getId();
    }

    @NonNull
    public synchronized String getAppSetIdScope() {
        AppSetId appSetId;
        try {
            appSetId = this.f9571e;
        } finally {
        }
        return appSetId == null ? "" : appSetId.getScope().getValue();
    }

    public String getAppVersion() {
        SdkEnvironment sdkEnvironment = this.f9568b;
        return sdkEnvironment == null ? "" : sdkEnvironment.getAppVersionInfo().getAppVersionName();
    }

    @NonNull
    public synchronized String getDeviceIDHash() {
        String deviceIdHash;
        deviceIdHash = "";
        SdkIdentifiers sdkIdentifiers = this.f9569c;
        if (sdkIdentifiers != null && sdkIdentifiers.getDeviceIdHash() != null) {
            deviceIdHash = this.f9569c.getDeviceIdHash();
        }
        return deviceIdHash;
    }

    @NonNull
    public synchronized String getDeviceId() {
        String deviceId;
        deviceId = "";
        SdkIdentifiers sdkIdentifiers = this.f9569c;
        if (sdkIdentifiers != null && sdkIdentifiers.getDeviceId() != null) {
            deviceId = this.f9569c.getDeviceId();
        }
        return deviceId;
    }

    @NonNull
    public String getDeviceRootStatus() {
        return ConstantDeviceInfo.DEVICE_ROOT_STATUS;
    }

    @NonNull
    public String getDeviceType() {
        SdkEnvironment sdkEnvironment = this.f9568b;
        return sdkEnvironment != null ? sdkEnvironment.getDeviceType() : "phone";
    }

    @NonNull
    public String getManufacturer() {
        return (String) WrapUtils.getOrDefault(ConstantDeviceInfo.MANUFACTURER, "");
    }

    @NonNull
    public String getModel() {
        return ConstantDeviceInfo.MODEL;
    }

    public int getOsApiLevel() {
        return ConstantDeviceInfo.OS_API_LEVEL;
    }

    @NonNull
    public String getOsVersion() {
        return ConstantDeviceInfo.OS_VERSION;
    }

    public String getPackageName() {
        return this.f9567a;
    }

    public String getProtocolVersion() {
        return "2";
    }

    public RetryPolicyConfig getRetryPolicyConfig() {
        return this.f9572f;
    }

    public float getScaleFactor() {
        SdkEnvironment sdkEnvironment = this.f9568b;
        if (sdkEnvironment == null) {
            return 0.0f;
        }
        return sdkEnvironment.getScreenInfo().getScaleFactor();
    }

    public int getScreenDpi() {
        SdkEnvironment sdkEnvironment = this.f9568b;
        if (sdkEnvironment == null) {
            return 0;
        }
        return sdkEnvironment.getScreenInfo().getDpi();
    }

    public int getScreenHeight() {
        SdkEnvironment sdkEnvironment = this.f9568b;
        if (sdkEnvironment == null) {
            return 0;
        }
        return sdkEnvironment.getScreenInfo().getHeight();
    }

    public int getScreenWidth() {
        SdkEnvironment sdkEnvironment = this.f9568b;
        if (sdkEnvironment == null) {
            return 0;
        }
        return sdkEnvironment.getScreenInfo().getWidth();
    }

    @NonNull
    public synchronized String getUuid() {
        String uuid;
        uuid = "";
        SdkIdentifiers sdkIdentifiers = this.f9569c;
        if (sdkIdentifiers != null && sdkIdentifiers.getUuid() != null) {
            uuid = this.f9569c.getUuid();
        }
        return uuid;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized boolean isIdentifiersValid() {
        boolean z;
        String uuid;
        String deviceId;
        String deviceIdHash;
        SdkIdentifiers sdkIdentifiers = this.f9569c;
        if (sdkIdentifiers == null || (uuid = sdkIdentifiers.getUuid()) == null || uuid.length() == 0 || (deviceId = sdkIdentifiers.getDeviceId()) == null || deviceId.length() == 0 || (deviceIdHash = sdkIdentifiers.getDeviceIdHash()) == null) {
            z = false;
        } else if (deviceIdHash.length() != 0) {
            z = true;
        }
        return z;
    }

    public void setAdvertisingIdsHolder(@NonNull AdvertisingIdsHolder advertisingIdsHolder) {
        this.f9570d = advertisingIdsHolder;
    }

    public void setAppSetId(@NonNull AppSetId appSetId) {
        this.f9571e = appSetId;
    }

    public void setPackageName(String str) {
        this.f9567a = str;
    }

    public void setRetryPolicyConfig(RetryPolicyConfig retryPolicyConfig) {
        this.f9572f = retryPolicyConfig;
    }

    public void setSdkEnvironment(@NonNull SdkEnvironment sdkEnvironment) {
        this.f9568b = sdkEnvironment;
    }

    public void setSdkIdentifiers(@Nullable SdkIdentifiers sdkIdentifiers) {
        this.f9569c = sdkIdentifiers;
    }

    public String toString() {
        return "BaseRequestConfig{mPackageName='" + this.f9567a + "', sdkEnvironment=" + this.f9568b + ", mProtocolVersion='2', sdkIdentifiers=" + this.f9569c + ", retryPolicyConfig=" + this.f9572f + '}';
    }

    @NonNull
    public String getLocale() {
        String str;
        SdkEnvironment sdkEnvironment = this.f9568b;
        return (sdkEnvironment == null || (str = (String) CollectionUtils.getFirstOrNull(sdkEnvironment.getLocales())) == null) ? "" : str;
    }
}
