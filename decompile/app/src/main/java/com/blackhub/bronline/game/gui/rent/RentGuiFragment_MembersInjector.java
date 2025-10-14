package com.blackhub.bronline.game.gui.rent;

import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class RentGuiFragment_MembersInjector implements MembersInjector<RentGuiFragment> {
    public final Provider<MainViewModelFactory<RentViewModel>> factoryProvider;

    public RentGuiFragment_MembersInjector(Provider<MainViewModelFactory<RentViewModel>> factoryProvider) {
        this.factoryProvider = factoryProvider;
    }

    public static MembersInjector<RentGuiFragment> create(Provider<MainViewModelFactory<RentViewModel>> factoryProvider) {
        return new RentGuiFragment_MembersInjector(factoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(RentGuiFragment instance) {
        injectFactory(instance, this.factoryProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.rent.RentGuiFragment.factory")
    public static void injectFactory(RentGuiFragment instance, MainViewModelFactory<RentViewModel> factory) {
        instance.factory = factory;
    }
}
