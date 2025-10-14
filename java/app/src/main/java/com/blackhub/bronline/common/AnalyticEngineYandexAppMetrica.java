package com.blackhub.bronline.common;

import android.app.Activity;
import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.BuildConfig;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.profile.Attribute;
import io.appmetrica.analytics.profile.UserProfile;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
public final class AnalyticEngineYandexAppMetrica implements IAnalyticEngine {
    public static final int $stable = 8;

    @NotNull
    public final Application app;

    @NotNull
    public final String key;

    public static /* synthetic */ void getKey$annotations() {
    }

    public AnalyticEngineYandexAppMetrica(@NotNull Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
        this.app = app;
        this.key = BuildConfig.AM_API_KEY_SITE;
        AppMetricaConfig appMetricaConfigBuild = AppMetricaConfig.newConfigBuilder(BuildConfig.AM_API_KEY_SITE).build();
        Intrinsics.checkNotNullExpressionValue(appMetricaConfigBuild, "build(...)");
        AppMetrica.activate(app.getApplicationContext(), appMetricaConfigBuild);
        AppMetrica.enableActivityAutoTracking(app);
    }

    @Override // com.blackhub.bronline.common.IAnalyticEngine
    public void pauseSession(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        AppMetrica.pauseSession(activity);
    }

    @Override // com.blackhub.bronline.common.IAnalyticEngine
    public void resumeSession(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        AppMetrica.resumeSession(activity);
    }

    @Override // com.blackhub.bronline.common.IAnalyticEngine
    public void reportEvent(@NotNull String name, @NotNull String json) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(json, "json");
        AppMetrica.getReporter(this.app.getApplicationContext(), this.key).reportEvent(name, json);
    }

    @Override // com.blackhub.bronline.common.IAnalyticEngine
    public void setNickServer(@NotNull String nickServer) {
        Intrinsics.checkNotNullParameter(nickServer, "nickServer");
        UserProfile userProfileBuild = UserProfile.newBuilder().apply(Attribute.name().withValue(nickServer)).apply(Attribute.customString(AnalyticEngineYandexAppMetricaKt.NICK_SERVER_CUSTOM_KEY).withValue(nickServer)).build();
        Intrinsics.checkNotNullExpressionValue(userProfileBuild, "build(...)");
        AppMetrica.reportUserProfile(userProfileBuild);
    }

    @Override // com.blackhub.bronline.common.IAnalyticEngine
    public void setUserId(@NotNull String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        AppMetrica.setUserProfileID(id);
    }
}

