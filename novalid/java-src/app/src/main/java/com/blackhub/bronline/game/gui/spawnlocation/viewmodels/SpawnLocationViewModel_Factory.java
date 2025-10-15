package com.blackhub.bronline.game.gui.spawnlocation.viewmodels;

import com.blackhub.bronline.game.gui.spawnlocation.network.SpawnLocationActionsWithJson;
import com.blackhub.bronline.game.gui.spawnlocation.network.SpawnLocationRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class SpawnLocationViewModel_Factory implements Factory<SpawnLocationViewModel> {
    public final Provider<SpawnLocationActionsWithJson> spawnLocationActionsWithJsonProvider;
    public final Provider<SpawnLocationRepository> spawnLocationRepositoryProvider;

    public SpawnLocationViewModel_Factory(Provider<SpawnLocationActionsWithJson> spawnLocationActionsWithJsonProvider, Provider<SpawnLocationRepository> spawnLocationRepositoryProvider) {
        this.spawnLocationActionsWithJsonProvider = spawnLocationActionsWithJsonProvider;
        this.spawnLocationRepositoryProvider = spawnLocationRepositoryProvider;
    }

    @Override // javax.inject.Provider
    public SpawnLocationViewModel get() {
        return newInstance(this.spawnLocationActionsWithJsonProvider.get(), this.spawnLocationRepositoryProvider.get());
    }

    public static SpawnLocationViewModel_Factory create(Provider<SpawnLocationActionsWithJson> spawnLocationActionsWithJsonProvider, Provider<SpawnLocationRepository> spawnLocationRepositoryProvider) {
        return new SpawnLocationViewModel_Factory(spawnLocationActionsWithJsonProvider, spawnLocationRepositoryProvider);
    }

    public static SpawnLocationViewModel newInstance(SpawnLocationActionsWithJson spawnLocationActionsWithJson, SpawnLocationRepository spawnLocationRepository) {
        return new SpawnLocationViewModel(spawnLocationActionsWithJson, spawnLocationRepository);
    }
}
