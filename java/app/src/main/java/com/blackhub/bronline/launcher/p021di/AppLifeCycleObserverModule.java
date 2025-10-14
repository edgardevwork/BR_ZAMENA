package com.blackhub.bronline.launcher.p021di;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.utils.lifecycleobserver.AppLifecycleObserverImpl;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: AppLifeCycleObserverModule.kt */
@StabilityInferred(parameters = 1)
@Module
/* loaded from: classes3.dex */
public final class AppLifeCycleObserverModule {
    public static final int $stable = 0;

    @Provides
    @Singleton
    @NotNull
    public final AppLifecycleObserverImpl provideAppLifeCycleObserver() {
        return new AppLifecycleObserverImpl();
    }
}

