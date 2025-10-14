package com.blackhub.bronline.game.gui.menupausesettingandmap.p016ui;

import com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel.MenuPauseViewModel;
import com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel.MenuSettingControlViewModel;
import com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel.MenuSettingGraphicViewModel;
import com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel.MenuSettingSoundViewModel;
import com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel.MenuSettingWinterViewModel;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class MenuSettingMainUiFragment_MembersInjector implements MembersInjector<MenuSettingMainUiFragment> {
    public final Provider<MainViewModelFactory<MenuPauseViewModel>> menuPauseViewModelVMFactoryProvider;
    public final Provider<MainViewModelFactory<MenuSettingControlViewModel>> menuSettingControlVMFactoryProvider;
    public final Provider<MainViewModelFactory<MenuSettingGraphicViewModel>> menuSettingGraphicVMFactoryProvider;
    public final Provider<MainViewModelFactory<MenuSettingSoundViewModel>> menuSettingSoundVMFactoryProvider;
    public final Provider<MainViewModelFactory<MenuSettingWinterViewModel>> menuSettingWinterVMFactoryProvider;

    public MenuSettingMainUiFragment_MembersInjector(Provider<MainViewModelFactory<MenuSettingGraphicViewModel>> menuSettingGraphicVMFactoryProvider, Provider<MainViewModelFactory<MenuSettingSoundViewModel>> menuSettingSoundVMFactoryProvider, Provider<MainViewModelFactory<MenuSettingControlViewModel>> menuSettingControlVMFactoryProvider, Provider<MainViewModelFactory<MenuSettingWinterViewModel>> menuSettingWinterVMFactoryProvider, Provider<MainViewModelFactory<MenuPauseViewModel>> menuPauseViewModelVMFactoryProvider) {
        this.menuSettingGraphicVMFactoryProvider = menuSettingGraphicVMFactoryProvider;
        this.menuSettingSoundVMFactoryProvider = menuSettingSoundVMFactoryProvider;
        this.menuSettingControlVMFactoryProvider = menuSettingControlVMFactoryProvider;
        this.menuSettingWinterVMFactoryProvider = menuSettingWinterVMFactoryProvider;
        this.menuPauseViewModelVMFactoryProvider = menuPauseViewModelVMFactoryProvider;
    }

    public static MembersInjector<MenuSettingMainUiFragment> create(Provider<MainViewModelFactory<MenuSettingGraphicViewModel>> menuSettingGraphicVMFactoryProvider, Provider<MainViewModelFactory<MenuSettingSoundViewModel>> menuSettingSoundVMFactoryProvider, Provider<MainViewModelFactory<MenuSettingControlViewModel>> menuSettingControlVMFactoryProvider, Provider<MainViewModelFactory<MenuSettingWinterViewModel>> menuSettingWinterVMFactoryProvider, Provider<MainViewModelFactory<MenuPauseViewModel>> menuPauseViewModelVMFactoryProvider) {
        return new MenuSettingMainUiFragment_MembersInjector(menuSettingGraphicVMFactoryProvider, menuSettingSoundVMFactoryProvider, menuSettingControlVMFactoryProvider, menuSettingWinterVMFactoryProvider, menuPauseViewModelVMFactoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(MenuSettingMainUiFragment instance) {
        injectMenuSettingGraphicVMFactory(instance, this.menuSettingGraphicVMFactoryProvider.get());
        injectMenuSettingSoundVMFactory(instance, this.menuSettingSoundVMFactoryProvider.get());
        injectMenuSettingControlVMFactory(instance, this.menuSettingControlVMFactoryProvider.get());
        injectMenuSettingWinterVMFactory(instance, this.menuSettingWinterVMFactoryProvider.get());
        injectMenuPauseViewModelVMFactory(instance, this.menuPauseViewModelVMFactoryProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment.menuSettingGraphicVMFactory")
    public static void injectMenuSettingGraphicVMFactory(MenuSettingMainUiFragment instance, MainViewModelFactory<MenuSettingGraphicViewModel> menuSettingGraphicVMFactory) {
        instance.menuSettingGraphicVMFactory = menuSettingGraphicVMFactory;
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment.menuSettingSoundVMFactory")
    public static void injectMenuSettingSoundVMFactory(MenuSettingMainUiFragment instance, MainViewModelFactory<MenuSettingSoundViewModel> menuSettingSoundVMFactory) {
        instance.menuSettingSoundVMFactory = menuSettingSoundVMFactory;
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment.menuSettingControlVMFactory")
    public static void injectMenuSettingControlVMFactory(MenuSettingMainUiFragment instance, MainViewModelFactory<MenuSettingControlViewModel> menuSettingControlVMFactory) {
        instance.menuSettingControlVMFactory = menuSettingControlVMFactory;
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment.menuSettingWinterVMFactory")
    public static void injectMenuSettingWinterVMFactory(MenuSettingMainUiFragment instance, MainViewModelFactory<MenuSettingWinterViewModel> menuSettingWinterVMFactory) {
        instance.menuSettingWinterVMFactory = menuSettingWinterVMFactory;
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.menupausesettingandmap.ui.MenuSettingMainUiFragment.menuPauseViewModelVMFactory")
    public static void injectMenuPauseViewModelVMFactory(MenuSettingMainUiFragment instance, MainViewModelFactory<MenuPauseViewModel> menuPauseViewModelVMFactory) {
        instance.menuPauseViewModelVMFactory = menuPauseViewModelVMFactory;
    }
}
