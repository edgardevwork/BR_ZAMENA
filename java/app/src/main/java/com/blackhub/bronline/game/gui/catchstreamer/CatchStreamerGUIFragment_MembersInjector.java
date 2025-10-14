package com.blackhub.bronline.game.gui.catchstreamer;

import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata

public final class CatchStreamerGUIFragment_MembersInjector implements MembersInjector<CatchStreamerGUIFragment> {
    public final Provider<MainViewModelFactory<CatchStreamerViewModel>> factoryProvider;

    public CatchStreamerGUIFragment_MembersInjector(Provider<MainViewModelFactory<CatchStreamerViewModel>> factoryProvider) {
        this.factoryProvider = factoryProvider;
    }

    public static MembersInjector<CatchStreamerGUIFragment> create(Provider<MainViewModelFactory<CatchStreamerViewModel>> factoryProvider) {
        return new CatchStreamerGUIFragment_MembersInjector(factoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(CatchStreamerGUIFragment instance) {
        injectFactory(instance, this.factoryProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerGUIFragment.factory")
    public static void injectFactory(CatchStreamerGUIFragment instance, MainViewModelFactory<CatchStreamerViewModel> factory) {
        instance.factory = factory;
    }
}
