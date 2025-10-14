package com.blackhub.bronline.game.gui.blackpassbanner;

import com.blackhub.bronline.game.gui.blackpassbanner.viewmodel.BlackPassBannerViewModel;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class BlackPassBannerComposeGUIFragment_MembersInjector implements MembersInjector<BlackPassBannerComposeGUIFragment> {
    public final Provider<MainViewModelFactory<BlackPassBannerViewModel>> mainFactoryProvider;

    public BlackPassBannerComposeGUIFragment_MembersInjector(Provider<MainViewModelFactory<BlackPassBannerViewModel>> mainFactoryProvider) {
        this.mainFactoryProvider = mainFactoryProvider;
    }

    public static MembersInjector<BlackPassBannerComposeGUIFragment> create(Provider<MainViewModelFactory<BlackPassBannerViewModel>> mainFactoryProvider) {
        return new BlackPassBannerComposeGUIFragment_MembersInjector(mainFactoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(BlackPassBannerComposeGUIFragment instance) {
        injectMainFactory(instance, this.mainFactoryProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.blackpassbanner.BlackPassBannerComposeGUIFragment.mainFactory")
    public static void injectMainFactory(BlackPassBannerComposeGUIFragment instance, MainViewModelFactory<BlackPassBannerViewModel> mainFactory) {
        instance.mainFactory = mainFactory;
    }
}
