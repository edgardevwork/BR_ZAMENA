package com.blackhub.bronline.game.gui.cases;

import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata

public final class CasesGUIFragment_MembersInjector implements MembersInjector<CasesGUIFragment> {
    public final Provider<MainViewModelFactory<CasesViewModel>> factoryProvider;

    public CasesGUIFragment_MembersInjector(Provider<MainViewModelFactory<CasesViewModel>> factoryProvider) {
        this.factoryProvider = factoryProvider;
    }

    public static MembersInjector<CasesGUIFragment> create(Provider<MainViewModelFactory<CasesViewModel>> factoryProvider) {
        return new CasesGUIFragment_MembersInjector(factoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(CasesGUIFragment instance) {
        injectFactory(instance, this.factoryProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.cases.CasesGUIFragment.factory")
    public static void injectFactory(CasesGUIFragment instance, MainViewModelFactory<CasesViewModel> factory) {
        instance.factory = factory;
    }
}
