package com.blackhub.bronline.game.gui.menupausesettingandmap;

import com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel.MenuPauseViewModel;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class MenuGuiFragment_MembersInjector implements MembersInjector<MenuGuiFragment> {
    public final Provider<MainViewModelFactory<MenuPauseViewModel>> newMenuPauseVMFactoryProvider;

    public MenuGuiFragment_MembersInjector(Provider<MainViewModelFactory<MenuPauseViewModel>> newMenuPauseVMFactoryProvider) {
        this.newMenuPauseVMFactoryProvider = newMenuPauseVMFactoryProvider;
    }

    public static MembersInjector<MenuGuiFragment> create(Provider<MainViewModelFactory<MenuPauseViewModel>> newMenuPauseVMFactoryProvider) {
        return new MenuGuiFragment_MembersInjector(newMenuPauseVMFactoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(MenuGuiFragment instance) {
        injectNewMenuPauseVMFactory(instance, this.newMenuPauseVMFactoryProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.menupausesettingandmap.MenuGuiFragment.newMenuPauseVMFactory")
    public static void injectNewMenuPauseVMFactory(MenuGuiFragment instance, MainViewModelFactory<MenuPauseViewModel> newMenuPauseVMFactory) {
        instance.newMenuPauseVMFactory = newMenuPauseVMFactory;
    }
}
