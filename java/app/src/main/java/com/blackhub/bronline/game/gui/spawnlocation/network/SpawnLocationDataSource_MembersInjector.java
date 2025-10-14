package com.blackhub.bronline.game.gui.spawnlocation.network;

import com.blackhub.bronline.launcher.network.Api;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class SpawnLocationDataSource_MembersInjector implements MembersInjector<SpawnLocationDataSource> {
    public final Provider<Api> apiServiceProvider;

    public SpawnLocationDataSource_MembersInjector(Provider<Api> apiServiceProvider) {
        this.apiServiceProvider = apiServiceProvider;
    }

    public static MembersInjector<SpawnLocationDataSource> create(Provider<Api> apiServiceProvider) {
        return new SpawnLocationDataSource_MembersInjector(apiServiceProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(SpawnLocationDataSource instance) {
        injectApiService(instance, this.apiServiceProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.spawnlocation.network.SpawnLocationDataSource.apiService")
    public static void injectApiService(SpawnLocationDataSource instance, Api apiService) {
        instance.apiService = apiService;
    }
}
