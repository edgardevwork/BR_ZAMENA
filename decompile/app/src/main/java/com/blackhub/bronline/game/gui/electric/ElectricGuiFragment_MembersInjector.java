package com.blackhub.bronline.game.gui.electric;

import com.blackhub.bronline.game.gui.electric.viewmodel.ElectricViewModel;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class ElectricGuiFragment_MembersInjector implements MembersInjector<ElectricGuiFragment> {
    public final Provider<MainViewModelFactory<ElectricViewModel>> miniGamesElectricFactoryProvider;

    public ElectricGuiFragment_MembersInjector(Provider<MainViewModelFactory<ElectricViewModel>> miniGamesElectricFactoryProvider) {
        this.miniGamesElectricFactoryProvider = miniGamesElectricFactoryProvider;
    }

    public static MembersInjector<ElectricGuiFragment> create(Provider<MainViewModelFactory<ElectricViewModel>> miniGamesElectricFactoryProvider) {
        return new ElectricGuiFragment_MembersInjector(miniGamesElectricFactoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ElectricGuiFragment instance) {
        injectMiniGamesElectricFactory(instance, this.miniGamesElectricFactoryProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.electric.ElectricGuiFragment.miniGamesElectricFactory")
    public static void injectMiniGamesElectricFactory(ElectricGuiFragment instance, MainViewModelFactory<ElectricViewModel> miniGamesElectricFactory) {
        instance.miniGamesElectricFactory = miniGamesElectricFactory;
    }
}
