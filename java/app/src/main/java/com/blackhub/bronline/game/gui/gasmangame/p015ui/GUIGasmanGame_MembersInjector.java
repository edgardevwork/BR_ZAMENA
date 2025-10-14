package com.blackhub.bronline.game.gui.gasmangame.p015ui;

import com.blackhub.bronline.game.gui.gasmangame.viewmodel.GasmanChildViewModel;
import com.blackhub.bronline.game.gui.gasmangame.viewmodel.GasmanParentViewModel;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata

public final class GUIGasmanGame_MembersInjector implements MembersInjector<GUIGasmanGame> {
    public final Provider<MainViewModelFactory<GasmanChildViewModel>> vmChildFactoryProvider;
    public final Provider<MainViewModelFactory<GasmanParentViewModel>> vmParentFactoryProvider;

    public GUIGasmanGame_MembersInjector(Provider<MainViewModelFactory<GasmanParentViewModel>> vmParentFactoryProvider, Provider<MainViewModelFactory<GasmanChildViewModel>> vmChildFactoryProvider) {
        this.vmParentFactoryProvider = vmParentFactoryProvider;
        this.vmChildFactoryProvider = vmChildFactoryProvider;
    }

    public static MembersInjector<GUIGasmanGame> create(Provider<MainViewModelFactory<GasmanParentViewModel>> vmParentFactoryProvider, Provider<MainViewModelFactory<GasmanChildViewModel>> vmChildFactoryProvider) {
        return new GUIGasmanGame_MembersInjector(vmParentFactoryProvider, vmChildFactoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(GUIGasmanGame instance) {
        injectVmParentFactory(instance, this.vmParentFactoryProvider.get());
        injectVmChildFactory(instance, this.vmChildFactoryProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.gasmangame.ui.GUIGasmanGame.vmParentFactory")
    public static void injectVmParentFactory(GUIGasmanGame instance, MainViewModelFactory<GasmanParentViewModel> vmParentFactory) {
        instance.vmParentFactory = vmParentFactory;
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.gasmangame.ui.GUIGasmanGame.vmChildFactory")
    public static void injectVmChildFactory(GUIGasmanGame instance, MainViewModelFactory<GasmanChildViewModel> vmChildFactory) {
        instance.vmChildFactory = vmChildFactory;
    }
}
