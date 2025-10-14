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

