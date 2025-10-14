package com.blackhub.bronline.game.gui.marketplace;

import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata

public final class MarketplaceGuiFragment_MembersInjector implements MembersInjector<MarketplaceGuiFragment> {
    public final Provider<MainViewModelFactory<MarketplaceViewModel>> mainFactoryProvider;

    public MarketplaceGuiFragment_MembersInjector(Provider<MainViewModelFactory<MarketplaceViewModel>> mainFactoryProvider) {
        this.mainFactoryProvider = mainFactoryProvider;
    }

    public static MembersInjector<MarketplaceGuiFragment> create(Provider<MainViewModelFactory<MarketplaceViewModel>> mainFactoryProvider) {
        return new MarketplaceGuiFragment_MembersInjector(mainFactoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(MarketplaceGuiFragment instance) {
        injectMainFactory(instance, this.mainFactoryProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.marketplace.MarketplaceGuiFragment.mainFactory")
    public static void injectMainFactory(MarketplaceGuiFragment instance, MainViewModelFactory<MarketplaceViewModel> mainFactory) {
        instance.mainFactory = mainFactory;
    }
}
