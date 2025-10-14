package com.blackhub.bronline.game.gui.minigameshelper;

import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class MiniGamesHelperGuiFragment_MembersInjector implements MembersInjector<MiniGamesHelperGuiFragment> {
    public final Provider<MainViewModelFactory<MiniGamesHelperViewModel>> factoryProvider;

    public MiniGamesHelperGuiFragment_MembersInjector(Provider<MainViewModelFactory<MiniGamesHelperViewModel>> factoryProvider) {
        this.factoryProvider = factoryProvider;
    }

    public static MembersInjector<MiniGamesHelperGuiFragment> create(Provider<MainViewModelFactory<MiniGamesHelperViewModel>> factoryProvider) {
        return new MiniGamesHelperGuiFragment_MembersInjector(factoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(MiniGamesHelperGuiFragment instance) {
        injectFactory(instance, this.factoryProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.minigameshelper.MiniGamesHelperGuiFragment.factory")
    public static void injectFactory(MiniGamesHelperGuiFragment instance, MainViewModelFactory<MiniGamesHelperViewModel> factory) {
        instance.factory = factory;
    }
}
