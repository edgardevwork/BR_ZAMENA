package com.blackhub.bronline.common;

import android.app.Activity;
import android.app.Application;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.BuildConfig;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.profile.Attribute;
import io.appmetrica.analytics.profile.UserProfile;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AnalyticEngineYandexAppMetrica.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0006H\u0016J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\b¨\u0006\u0015"}, m7105d2 = {"Lcom/blackhub/bronline/common/AnalyticEngineYandexAppMetrica;", "Lcom/blackhub/bronline/common/IAnalyticEngine;", "app", "Landroid/app/Application;", "(Landroid/app/Application;)V", "key", "", "getKey$annotations", "()V", "pauseSession", "", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "Landroid/app/Activity;", "reportEvent", "name", "json", "resumeSession", "setNickServer", "nickServer", "setUserId", "id", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
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
