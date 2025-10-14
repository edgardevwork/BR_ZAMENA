package com.blackhub.bronline.launcher.p021di;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.repository.GiftsRepository;
import com.blackhub.bronline.game.repository.LauncherRepository;
import com.blackhub.bronline.game.repository.UpgradeObjectRepository;
import com.blackhub.bronline.game.repository.impl.GiftsRepositoryImpl;
import com.blackhub.bronline.game.repository.impl.LauncherRepositoryImpl;
import com.blackhub.bronline.game.repository.impl.UpgradeObjectRepositoryImpl;
import dagger.Binds;
import dagger.Module;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: RepositoryBindModule.kt */
@StabilityInferred(parameters = 1)
@Module
/* loaded from: classes3.dex */
public abstract class RepositoryBindModule {
    public static final int $stable = 0;

    @Binds
    @NotNull
    public abstract GiftsRepository bindGiftsRepository(@NotNull GiftsRepositoryImpl giftsRepositoryImpl);

    @Binds
    @NotNull
    public abstract LauncherRepository bindLauncherRepository(@NotNull LauncherRepositoryImpl launcherRepositoryImpl);

    @Binds
    @NotNull
    public abstract UpgradeObjectRepository bindUpgradeObjectRepository(@NotNull UpgradeObjectRepositoryImpl upgradeObjectRepositoryImpl);
}

