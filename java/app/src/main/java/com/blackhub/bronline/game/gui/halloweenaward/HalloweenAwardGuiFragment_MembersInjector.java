package com.blackhub.bronline.game.gui.halloweenaward;

import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata

public final class HalloweenAwardGuiFragment_MembersInjector implements MembersInjector<HalloweenAwardGuiFragment> {
    public final Provider<MainViewModelFactory<HalloweenAwardViewModel>> factoryProvider;

    public HalloweenAwardGuiFragment_MembersInjector(Provider<MainViewModelFactory<HalloweenAwardViewModel>> factoryProvider) {
        this.factoryProvider = factoryProvider;
    }

    public static MembersInjector<HalloweenAwardGuiFragment> create(Provider<MainViewModelFactory<HalloweenAwardViewModel>> factoryProvider) {
        return new HalloweenAwardGuiFragment_MembersInjector(factoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(HalloweenAwardGuiFragment instance) {
        injectFactory(instance, this.factoryProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.halloweenaward.HalloweenAwardGuiFragment.factory")
    public static void injectFactory(HalloweenAwardGuiFragment instance, MainViewModelFactory<HalloweenAwardViewModel> factory) {
        instance.factory = factory;
    }
}
