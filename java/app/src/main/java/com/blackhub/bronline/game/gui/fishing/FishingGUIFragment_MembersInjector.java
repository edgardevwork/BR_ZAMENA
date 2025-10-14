package com.blackhub.bronline.game.gui.fishing;

import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class FishingGUIFragment_MembersInjector implements MembersInjector<FishingGUIFragment> {
    public final Provider<MainViewModelFactory<FishingViewModel>> factoryProvider;

    public FishingGUIFragment_MembersInjector(Provider<MainViewModelFactory<FishingViewModel>> factoryProvider) {
        this.factoryProvider = factoryProvider;
    }

    public static MembersInjector<FishingGUIFragment> create(Provider<MainViewModelFactory<FishingViewModel>> factoryProvider) {
        return new FishingGUIFragment_MembersInjector(factoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(FishingGUIFragment instance) {
        injectFactory(instance, this.factoryProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.fishing.FishingGUIFragment.factory")
    public static void injectFactory(FishingGUIFragment instance, MainViewModelFactory<FishingViewModel> factory) {
        instance.factory = factory;
    }
}
