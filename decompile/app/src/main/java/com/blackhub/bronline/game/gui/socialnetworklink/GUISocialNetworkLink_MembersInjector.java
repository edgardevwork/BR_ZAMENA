package com.blackhub.bronline.game.gui.socialnetworklink;

import com.blackhub.bronline.game.gui.socialnetworklink.viewmodel.SocialNetworkLinkViewModel;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class GUISocialNetworkLink_MembersInjector implements MembersInjector<GUISocialNetworkLink> {
    public final Provider<MainViewModelFactory<SocialNetworkLinkViewModel>> mainFactoryProvider;

    public GUISocialNetworkLink_MembersInjector(Provider<MainViewModelFactory<SocialNetworkLinkViewModel>> mainFactoryProvider) {
        this.mainFactoryProvider = mainFactoryProvider;
    }

    public static MembersInjector<GUISocialNetworkLink> create(Provider<MainViewModelFactory<SocialNetworkLinkViewModel>> mainFactoryProvider) {
        return new GUISocialNetworkLink_MembersInjector(mainFactoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(GUISocialNetworkLink instance) {
        injectMainFactory(instance, this.mainFactoryProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.socialnetworklink.GUISocialNetworkLink.mainFactory")
    public static void injectMainFactory(GUISocialNetworkLink instance, MainViewModelFactory<SocialNetworkLinkViewModel> mainFactory) {
        instance.mainFactory = mainFactory;
    }
}
