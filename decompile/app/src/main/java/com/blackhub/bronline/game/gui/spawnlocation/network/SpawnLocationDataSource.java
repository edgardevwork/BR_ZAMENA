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
@Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nR\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/spawnlocation/network/SpawnLocationDataSource;", "", "()V", "apiService", "Lcom/blackhub/bronline/launcher/network/Api;", "getApiService", "()Lcom/blackhub/bronline/launcher/network/Api;", "setApiService", "(Lcom/blackhub/bronline/launcher/network/Api;)V", "getSpawnLocationList", "Lio/reactivex/rxjava3/core/Single;", "Lcom/blackhub/bronline/game/gui/spawnlocation/data/SpawnLocationList;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
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
