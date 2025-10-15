package com.blackhub.bronline.game.gui.entertainmentsystem;

import com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel.EntertainmentGamesViewModel;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class GUIEntertainmentSystem_MembersInjector implements MembersInjector<GUIEntertainmentSystem> {
    public final Provider<MainViewModelFactory<EntertainmentGamesViewModel>> gamesFactoryProvider;

    public GUIEntertainmentSystem_MembersInjector(Provider<MainViewModelFactory<EntertainmentGamesViewModel>> gamesFactoryProvider) {
        this.gamesFactoryProvider = gamesFactoryProvider;
    }

    public static MembersInjector<GUIEntertainmentSystem> create(Provider<MainViewModelFactory<EntertainmentGamesViewModel>> gamesFactoryProvider) {
        return new GUIEntertainmentSystem_MembersInjector(gamesFactoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(GUIEntertainmentSystem instance) {
        injectGamesFactory(instance, this.gamesFactoryProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.entertainmentsystem.GUIEntertainmentSystem.gamesFactory")
    public static void injectGamesFactory(GUIEntertainmentSystem instance, MainViewModelFactory<EntertainmentGamesViewModel> gamesFactory) {
        instance.gamesFactory = gamesFactory;
    }
}
