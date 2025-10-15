package com.blackhub.bronline.launcher.p021di;

import android.app.Application;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.launcher.App;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AppModule.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, m7105d2 = {"Lcom/blackhub/bronline/launcher/di/AppModule;", "", "()V", "provideAppContext", "Landroid/content/Context;", "application", "Landroid/app/Application;", "provideApplication", "app", "Lcom/blackhub/bronline/launcher/App;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@Module
/* loaded from: classes3.dex */
public final class AppModule {
    public static final int $stable = 0;

    @Provides
    @Singleton
    @NotNull
    public final Application provideApplication(@NotNull App app) {
        Intrinsics.checkNotNullParameter(app, "app");
        return app;
    }

    @Provides
    @AppContext
    @NotNull
    public final Context provideAppContext(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        Context applicationContext = application.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        return applicationContext;
    }
}
