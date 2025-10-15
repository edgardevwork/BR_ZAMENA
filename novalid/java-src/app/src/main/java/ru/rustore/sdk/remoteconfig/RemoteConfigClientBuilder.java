package ru.rustore.sdk.remoteconfig;

import android.content.Context;
import android.provider.Settings;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import ru.rustore.sdk.remoteconfig.UpdateBehaviour;
import ru.rustore.sdk.remoteconfig.internal.C11676F0;
import ru.rustore.sdk.remoteconfig.internal.C11711X0;
import ru.rustore.sdk.remoteconfig.internal.C11773y;
import ru.rustore.sdk.remoteconfig.internal.C11775z;

@Metadata(m7104d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 /2\u00020\u0001:\u0001/B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u001d\u001a\u00020\u001eH\u0007J\u001a\u0010\u001f\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bø\u0001\u0000¢\u0006\u0004\b \u0010!J\u001a\u0010\"\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bø\u0001\u0000¢\u0006\u0004\b#\u0010!J\u000e\u0010$\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rJ\u001a\u0010%\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011ø\u0001\u0000¢\u0006\u0004\b&\u0010!J\u001a\u0010'\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fø\u0001\u0000¢\u0006\u0004\b(\u0010!J\u0010\u0010)\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u001a\u0010*\u001a\u00020\u00002\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015J\u001a\u0010+\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018ø\u0001\u0000¢\u0006\u0004\b,\u0010!J\u000e\u0010-\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010.\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001cR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\tR\u0016\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\tR\u0018\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\tR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\tR\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00060"}, m7105d2 = {"Lru/rustore/sdk/remoteconfig/RemoteConfigClientBuilder;", "", RemoteConfigConstants.RequestFieldKey.APP_ID, "Lru/rustore/sdk/remoteconfig/AppId;", "context", "Landroid/content/Context;", "(Ljava/lang/String;Landroid/content/Context;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", RemoteConfigConstants.RequestFieldKey.APP_BUILD, "Lru/rustore/sdk/remoteconfig/AppBuild;", "Ljava/lang/String;", RemoteConfigConstants.RequestFieldKey.APP_VERSION, "Lru/rustore/sdk/remoteconfig/AppVersion;", "configRequestParameterProvider", "Lru/rustore/sdk/remoteconfig/ConfigRequestParameterProvider;", "deviceId", "Lru/rustore/sdk/remoteconfig/DeviceId;", "deviceModel", "Lru/rustore/sdk/remoteconfig/DeviceModel;", "environment", "Lru/rustore/sdk/remoteconfig/Environment;", "internalConfig", "", "", "osVersion", "Lru/rustore/sdk/remoteconfig/OsVersion;", "remoteConfigClientEventListener", "Lru/rustore/sdk/remoteconfig/RemoteConfigClientEventListener;", "updateBehaviour", "Lru/rustore/sdk/remoteconfig/UpdateBehaviour;", "build", "Lru/rustore/sdk/remoteconfig/RemoteConfigClient;", "setAppBuild", "setAppBuild-EvE1hLk", "(Ljava/lang/String;)Lru/rustore/sdk/remoteconfig/RemoteConfigClientBuilder;", "setAppVersion", "setAppVersion-nqGfzuc", "setConfigRequestParameterProvider", "setDevice", "setDevice-85-4qGc", "setDeviceId", "setDeviceId-elguAwk", "setEnvironment", "setInternalConfig", "setOsVersion", "setOsVersion-MtLrvTQ", "setRemoteConfigClientEventListener", "setUpdateBehaviour", "Companion", "sdk-public-remoteconfig_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes5.dex */
public final class RemoteConfigClientBuilder {

    @Deprecated
    public static final long DEFAULT_UPDATE_INTERVAL_MIN = 15;
    public String appBuild;
    public final String appId;
    public String appVersion;
    public ConfigRequestParameterProvider configRequestParameterProvider;
    public final Context context;
    public String deviceId;
    public String deviceModel;
    public Environment environment;
    public Map<String, ? extends Object> internalConfig;
    public String osVersion;
    public RemoteConfigClientEventListener remoteConfigClientEventListener;
    public UpdateBehaviour updateBehaviour;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Object staticMonitor = new Object();

    @Metadata(m7104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m7105d2 = {"Lru/rustore/sdk/remoteconfig/RemoteConfigClientBuilder$Companion;", "", "()V", "DEFAULT_UPDATE_INTERVAL_MIN", "", "staticMonitor", "getStaticMonitor", "()Ljava/lang/Object;", "sdk-public-remoteconfig_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public final Object getStaticMonitor() {
            return RemoteConfigClientBuilder.staticMonitor;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public RemoteConfigClientBuilder(String appId, Context context) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(context, "context");
        this.appId = appId;
        this.context = context;
        this.configRequestParameterProvider = new C11773y();
        this.remoteConfigClientEventListener = new C11775z();
        Duration.Companion companion = Duration.INSTANCE;
        this.updateBehaviour = new UpdateBehaviour.Default(DurationKt.toDuration(15L, DurationUnit.MINUTES), null);
    }

    public final RemoteConfigClient build() {
        RemoteConfigClient companion;
        synchronized (staticMonitor) {
            try {
                new C11676F0.a();
                Context applicationContext = this.context.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
                String str = this.appId;
                String strM17630constructorimpl = this.deviceId;
                if (strM17630constructorimpl == null) {
                    String string = Settings.Secure.getString(this.context.getContentResolver(), "android_id");
                    Intrinsics.checkNotNullExpressionValue(string, "getString(context.conten…olver, Secure.ANDROID_ID)");
                    strM17630constructorimpl = DeviceId.m17630constructorimpl(string);
                }
                C11676F0.a.m7512a(applicationContext, str, new C11711X0(strM17630constructorimpl, this.osVersion, this.appBuild, this.appVersion, this.deviceModel, this.environment), this.updateBehaviour, this.configRequestParameterProvider, this.remoteConfigClientEventListener, this.internalConfig);
                companion = RemoteConfigClient.INSTANCE.getInstance();
            } catch (Throwable th) {
                throw th;
            }
        }
        return companion;
    }

    /* renamed from: setAppBuild-EvE1hLk */
    public final RemoteConfigClientBuilder m17657setAppBuildEvE1hLk(String str) {
        synchronized (staticMonitor) {
            this.appBuild = str;
        }
        return this;
    }

    /* renamed from: setAppVersion-nqGfzuc */
    public final RemoteConfigClientBuilder m17658setAppVersionnqGfzuc(String str) {
        synchronized (staticMonitor) {
            this.appVersion = str;
        }
        return this;
    }

    public final RemoteConfigClientBuilder setConfigRequestParameterProvider(ConfigRequestParameterProvider configRequestParameterProvider) {
        Intrinsics.checkNotNullParameter(configRequestParameterProvider, "configRequestParameterProvider");
        synchronized (staticMonitor) {
            this.configRequestParameterProvider = configRequestParameterProvider;
        }
        return this;
    }

    /* renamed from: setDevice-85-4qGc */
    public final RemoteConfigClientBuilder m17659setDevice854qGc(String deviceModel) {
        synchronized (staticMonitor) {
            this.deviceModel = deviceModel;
        }
        return this;
    }

    /* renamed from: setDeviceId-elguAwk */
    public final RemoteConfigClientBuilder m17660setDeviceIdelguAwk(String deviceId) {
        synchronized (staticMonitor) {
            this.deviceId = deviceId;
        }
        return this;
    }

    public final RemoteConfigClientBuilder setEnvironment(Environment environment) {
        synchronized (staticMonitor) {
            this.environment = environment;
        }
        return this;
    }

    public final RemoteConfigClientBuilder setInternalConfig(Map<String, ? extends Object> internalConfig) {
        Intrinsics.checkNotNullParameter(internalConfig, "internalConfig");
        synchronized (staticMonitor) {
            this.internalConfig = internalConfig;
        }
        return this;
    }

    /* renamed from: setOsVersion-MtLrvTQ */
    public final RemoteConfigClientBuilder m17661setOsVersionMtLrvTQ(String osVersion) {
        synchronized (staticMonitor) {
            this.osVersion = osVersion;
        }
        return this;
    }

    public final RemoteConfigClientBuilder setRemoteConfigClientEventListener(RemoteConfigClientEventListener remoteConfigClientEventListener) {
        Intrinsics.checkNotNullParameter(remoteConfigClientEventListener, "remoteConfigClientEventListener");
        synchronized (staticMonitor) {
            this.remoteConfigClientEventListener = remoteConfigClientEventListener;
        }
        return this;
    }

    public final RemoteConfigClientBuilder setUpdateBehaviour(UpdateBehaviour updateBehaviour) {
        Intrinsics.checkNotNullParameter(updateBehaviour, "updateBehaviour");
        synchronized (staticMonitor) {
            this.updateBehaviour = updateBehaviour;
        }
        return this;
    }

    public /* synthetic */ RemoteConfigClientBuilder(String str, Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, context);
    }
}
