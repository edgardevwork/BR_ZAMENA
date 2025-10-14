package com.blackhub.bronline.game.gui.spawnlocation.network;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.gui.spawnlocation.data.SpawnLocationList;
import com.blackhub.bronline.launcher.network.Api;
import io.reactivex.rxjava3.core.Single;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: SpawnLocationDataSource.kt */
@StabilityInferred(parameters = 0)

public final class SpawnLocationDataSource {
    public static final int $stable = 8;

    @Inject
    public Api apiService;

    @NotNull
    public final Api getApiService() {
        Api api = this.apiService;
        if (api != null) {
            return api;
        }
        Intrinsics.throwUninitializedPropertyAccessException("apiService");
        return null;
    }

    public final void setApiService(@NotNull Api api) {
        Intrinsics.checkNotNullParameter(api, "<set-?>");
        this.apiService = api;
    }

    @NotNull
    public final Single<SpawnLocationList> getSpawnLocationList() {
        return getApiService().getSpawnLocationList();
    }
}

