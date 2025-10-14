package com.blackhub.bronline.game.gui.spawnlocation.network;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.gui.spawnlocation.data.SpawnLocationList;
import io.reactivex.rxjava3.core.Single;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: SpawnLocationRepositoryImpl.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class SpawnLocationRepositoryImpl implements SpawnLocationRepository {
    public static final int $stable = 8;

    /* renamed from: spawnLocationDataSource$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy spawnLocationDataSource = LazyKt__LazyJVMKt.lazy(new Function0<SpawnLocationDataSource>() { // from class: com.blackhub.bronline.game.gui.spawnlocation.network.SpawnLocationRepositoryImpl$spawnLocationDataSource$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final SpawnLocationDataSource invoke() {
            return new SpawnLocationDataSource();
        }
    });

    public final SpawnLocationDataSource getSpawnLocationDataSource() {
        return (SpawnLocationDataSource) this.spawnLocationDataSource.getValue();
    }

    @Override // com.blackhub.bronline.game.gui.spawnlocation.network.SpawnLocationRepository
    @NotNull
    public Single<SpawnLocationList> getListOfSpawnLocationItems() {
        return getSpawnLocationDataSource().getSpawnLocationList();
    }
}

