package com.blackhub.bronline.launcher.p021di;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.sources.remote.GiftsDataSource;
import com.blackhub.bronline.game.sources.remote.GiftsDataSourceImpl;
import com.blackhub.bronline.game.sources.remote.LauncherDataSource;
import com.blackhub.bronline.game.sources.remote.LauncherDataSourceImpl;
import com.blackhub.bronline.game.sources.remote.UpgradeObjectEventDataSource;
import com.blackhub.bronline.game.sources.remote.UpgradeObjectEventDataSourceImpl;
import dagger.Binds;
import dagger.Module;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: RdsBindModule.kt */
@StabilityInferred(parameters = 1)
@Module
/* loaded from: classes3.dex */
public abstract class RdsBindModule {
    public static final int $stable = 0;

    @Binds
    @NotNull
    public abstract GiftsDataSource bindGiftsDataSource(@NotNull GiftsDataSourceImpl giftsDataSourceImpl);

    @Binds
    @NotNull
    public abstract LauncherDataSource bindLauncherDataSource(@NotNull LauncherDataSourceImpl launcherDataSourceImpl);

    @Binds
    @NotNull
    public abstract UpgradeObjectEventDataSource bindUpgradeObjectDataSource(@NotNull UpgradeObjectEventDataSourceImpl upgradeObjectEventDataSourceImpl);
}

