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
@Metadata(m7104d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH'J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH'¨\u0006\u000f"}, m7105d2 = {"Lcom/blackhub/bronline/launcher/di/RdsBindModule;", "", "()V", "bindGiftsDataSource", "Lcom/blackhub/bronline/game/sources/remote/GiftsDataSource;", "giftsDataSourceImpl", "Lcom/blackhub/bronline/game/sources/remote/GiftsDataSourceImpl;", "bindLauncherDataSource", "Lcom/blackhub/bronline/game/sources/remote/LauncherDataSource;", "launcherDataSourceImpl", "Lcom/blackhub/bronline/game/sources/remote/LauncherDataSourceImpl;", "bindUpgradeObjectDataSource", "Lcom/blackhub/bronline/game/sources/remote/UpgradeObjectEventDataSource;", "upgradeObjectEventDataSourceImpl", "Lcom/blackhub/bronline/game/sources/remote/UpgradeObjectEventDataSourceImpl;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
