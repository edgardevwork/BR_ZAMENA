package com.blackhub.bronline.game.gui.fuelfill;

import com.blackhub.bronline.game.gui.fuelfill.viewmodel.FuelFillViewModel;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class GUIFuelFill_MembersInjector implements MembersInjector<GUIFuelFill> {
    public final Provider<MainViewModelFactory<FuelFillViewModel>> fuelFillFactoryProvider;

    public GUIFuelFill_MembersInjector(Provider<MainViewModelFactory<FuelFillViewModel>> fuelFillFactoryProvider) {
        this.fuelFillFactoryProvider = fuelFillFactoryProvider;
    }

    public static MembersInjector<GUIFuelFill> create(Provider<MainViewModelFactory<FuelFillViewModel>> fuelFillFactoryProvider) {
        return new GUIFuelFill_MembersInjector(fuelFillFactoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(GUIFuelFill instance) {
        injectFuelFillFactory(instance, this.fuelFillFactoryProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.fuelfill.GUIFuelFill.fuelFillFactory")
    public static void injectFuelFillFactory(GUIFuelFill instance, MainViewModelFactory<FuelFillViewModel> fuelFillFactory) {
        instance.fuelFillFactory = fuelFillFactory;
    }
}
