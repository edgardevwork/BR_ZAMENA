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
@Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m7105d2 = {"Lcom/blackhub/bronline/launcher/di/AppLifeCycleObserverModule;", "", "()V", "provideAppLifeCycleObserver", "Lcom/blackhub/bronline/game/core/utils/lifecycleobserver/AppLifecycleObserverImpl;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
