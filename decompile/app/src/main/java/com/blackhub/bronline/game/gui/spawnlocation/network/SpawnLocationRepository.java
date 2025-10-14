package com.blackhub.bronline.game.gui.spawnlocation.network;

import com.blackhub.bronline.game.gui.spawnlocation.data.SpawnLocationList;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: SpawnLocationRepository.kt */
@Metadata(m7104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/spawnlocation/network/SpawnLocationRepository;", "", "getListOfSpawnLocationItems", "Lio/reactivex/rxjava3/core/Single;", "Lcom/blackhub/bronline/game/gui/spawnlocation/data/SpawnLocationList;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public interface SpawnLocationRepository {
    @NotNull
    Single<SpawnLocationList> getListOfSpawnLocationItems();
}
