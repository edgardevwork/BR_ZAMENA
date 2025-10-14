package com.blackhub.bronline.game.gui.menu;

import com.blackhub.bronline.game.gui.menu.viewModel.MenuViewModel;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class MenuComposeGUIFragment_MembersInjector implements MembersInjector<MenuComposeGUIFragment> {
    public final Provider<MainViewModelFactory<MenuViewModel>> factoryProvider;

    public MenuComposeGUIFragment_MembersInjector(Provider<MainViewModelFactory<MenuViewModel>> factoryProvider) {
        this.factoryProvider = factoryProvider;
    }

    public static MembersInjector<MenuComposeGUIFragment> create(Provider<MainViewModelFactory<MenuViewModel>> factoryProvider) {
        return new MenuComposeGUIFragment_MembersInjector(factoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(MenuComposeGUIFragment instance) {
        injectFactory(instance, this.factoryProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.menu.MenuComposeGUIFragment.factory")
    public static void injectFactory(MenuComposeGUIFragment instance, MainViewModelFactory<MenuViewModel> factory) {
        instance.factory = factory;
    }
}
