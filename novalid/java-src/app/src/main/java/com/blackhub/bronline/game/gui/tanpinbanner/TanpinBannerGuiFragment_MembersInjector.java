package com.blackhub.bronline.game.gui.tanpinbanner;

import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class TanpinBannerGuiFragment_MembersInjector implements MembersInjector<TanpinBannerGuiFragment> {
    public final Provider<MainViewModelFactory<TanpinBannerViewModel>> factoryProvider;

    public TanpinBannerGuiFragment_MembersInjector(Provider<MainViewModelFactory<TanpinBannerViewModel>> factoryProvider) {
        this.factoryProvider = factoryProvider;
    }

    public static MembersInjector<TanpinBannerGuiFragment> create(Provider<MainViewModelFactory<TanpinBannerViewModel>> factoryProvider) {
        return new TanpinBannerGuiFragment_MembersInjector(factoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(TanpinBannerGuiFragment instance) {
        injectFactory(instance, this.factoryProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.tanpinbanner.TanpinBannerGuiFragment.factory")
    public static void injectFactory(TanpinBannerGuiFragment instance, MainViewModelFactory<TanpinBannerViewModel> factory) {
        instance.factory = factory;
    }
}
