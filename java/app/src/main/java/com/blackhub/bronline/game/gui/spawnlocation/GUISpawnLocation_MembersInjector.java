package com.blackhub.bronline.game.gui.spawnlocation;

import com.blackhub.bronline.game.gui.spawnlocation.viewmodels.SpawnLocationViewModel;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class GUISpawnLocation_MembersInjector implements MembersInjector<GUISpawnLocation> {
    public final Provider<MainViewModelFactory<SpawnLocationViewModel>> mainVMFactoryProvider;

    public GUISpawnLocation_MembersInjector(Provider<MainViewModelFactory<SpawnLocationViewModel>> mainVMFactoryProvider) {
        this.mainVMFactoryProvider = mainVMFactoryProvider;
    }

    public static MembersInjector<GUISpawnLocation> create(Provider<MainViewModelFactory<SpawnLocationViewModel>> mainVMFactoryProvider) {
        return new GUISpawnLocation_MembersInjector(mainVMFactoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(GUISpawnLocation instance) {
        injectMainVMFactory(instance, this.mainVMFactoryProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.spawnlocation.GUISpawnLocation.mainVMFactory")
    public static void injectMainVMFactory(GUISpawnLocation instance, MainViewModelFactory<SpawnLocationViewModel> mainVMFactory) {
        instance.mainVMFactory = mainVMFactory;
    }
}
