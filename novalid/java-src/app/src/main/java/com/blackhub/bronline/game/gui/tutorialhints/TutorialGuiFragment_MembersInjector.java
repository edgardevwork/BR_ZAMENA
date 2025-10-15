package com.blackhub.bronline.game.gui.tutorialhints;

import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class TutorialGuiFragment_MembersInjector implements MembersInjector<TutorialGuiFragment> {
    public final Provider<MainViewModelFactory<TutorialViewModel>> factoryProvider;

    public TutorialGuiFragment_MembersInjector(Provider<MainViewModelFactory<TutorialViewModel>> factoryProvider) {
        this.factoryProvider = factoryProvider;
    }

    public static MembersInjector<TutorialGuiFragment> create(Provider<MainViewModelFactory<TutorialViewModel>> factoryProvider) {
        return new TutorialGuiFragment_MembersInjector(factoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(TutorialGuiFragment instance) {
        injectFactory(instance, this.factoryProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.tutorialhints.TutorialGuiFragment.factory")
    public static void injectFactory(TutorialGuiFragment instance, MainViewModelFactory<TutorialViewModel> factory) {
        instance.factory = factory;
    }
}
