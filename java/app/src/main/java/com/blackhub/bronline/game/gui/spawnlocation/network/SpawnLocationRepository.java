package com.blackhub.bronline.game.gui.spawnlocation.network;

import com.blackhub.bronline.game.gui.spawnlocation.data.SpawnLocationList;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: SpawnLocationRepository.kt */
/* loaded from: classes2.dex */
public interface SpawnLocationRepository {
    @NotNull
    Single<SpawnLocationList> getListOfSpawnLocationItems();
}

