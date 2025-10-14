package com.blackhub.bronline.game.gui.brsimbanner;

import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata

public final class BrSimBannerComposeGUIFragment_MembersInjector implements MembersInjector<BrSimBannerComposeGUIFragment> {
    public final Provider<MainViewModelFactory<BrSimBannerViewModel>> factoryProvider;

    public BrSimBannerComposeGUIFragment_MembersInjector(Provider<MainViewModelFactory<BrSimBannerViewModel>> factoryProvider) {
        this.factoryProvider = factoryProvider;
    }

    public static MembersInjector<BrSimBannerComposeGUIFragment> create(Provider<MainViewModelFactory<BrSimBannerViewModel>> factoryProvider) {
        return new BrSimBannerComposeGUIFragment_MembersInjector(factoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(BrSimBannerComposeGUIFragment instance) {
        injectFactory(instance, this.factoryProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.brsimbanner.BrSimBannerComposeGUIFragment.factory")
    public static void injectFactory(BrSimBannerComposeGUIFragment instance, MainViewModelFactory<BrSimBannerViewModel> factory) {
        instance.factory = factory;
    }
}
