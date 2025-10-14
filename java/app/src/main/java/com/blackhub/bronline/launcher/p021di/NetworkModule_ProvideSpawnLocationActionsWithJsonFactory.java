package com.blackhub.bronline.launcher.p021di;

import com.blackhub.bronline.game.gui.spawnlocation.network.SpawnLocationActionsWithJson;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class NetworkModule_ProvideSpawnLocationActionsWithJsonFactory implements Factory<SpawnLocationActionsWithJson> {
    public final NetworkModule module;

    public NetworkModule_ProvideSpawnLocationActionsWithJsonFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public SpawnLocationActionsWithJson get() {
        return provideSpawnLocationActionsWithJson(this.module);
    }

    public static NetworkModule_ProvideSpawnLocationActionsWithJsonFactory create(NetworkModule module) {
        return new NetworkModule_ProvideSpawnLocationActionsWithJsonFactory(module);
    }

    public static SpawnLocationActionsWithJson provideSpawnLocationActionsWithJson(NetworkModule instance) {
        return (SpawnLocationActionsWithJson) Preconditions.checkNotNullFromProvides(instance.provideSpawnLocationActionsWithJson());
    }
}
