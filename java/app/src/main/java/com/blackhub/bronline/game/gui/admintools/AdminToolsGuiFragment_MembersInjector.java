package com.blackhub.bronline.game.gui.admintools;

import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata

public final class AdminToolsGuiFragment_MembersInjector implements MembersInjector<AdminToolsGuiFragment> {
    public final Provider<MainViewModelFactory<AdminToolsViewModel>> factoryProvider;

    public AdminToolsGuiFragment_MembersInjector(Provider<MainViewModelFactory<AdminToolsViewModel>> factoryProvider) {
        this.factoryProvider = factoryProvider;
    }

    public static MembersInjector<AdminToolsGuiFragment> create(Provider<MainViewModelFactory<AdminToolsViewModel>> factoryProvider) {
        return new AdminToolsGuiFragment_MembersInjector(factoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(AdminToolsGuiFragment instance) {
        injectFactory(instance, this.factoryProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.admintools.AdminToolsGuiFragment.factory")
    public static void injectFactory(AdminToolsGuiFragment instance, MainViewModelFactory<AdminToolsViewModel> factory) {
        instance.factory = factory;
    }
}
