package com.blackhub.bronline.game.gui.plates;

import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class PlatesGuiFragment_MembersInjector implements MembersInjector<PlatesGuiFragment> {
    public final Provider<MainViewModelFactory<PlatesViewModel>> factoryProvider;

    public PlatesGuiFragment_MembersInjector(Provider<MainViewModelFactory<PlatesViewModel>> factoryProvider) {
        this.factoryProvider = factoryProvider;
    }

    public static MembersInjector<PlatesGuiFragment> create(Provider<MainViewModelFactory<PlatesViewModel>> factoryProvider) {
        return new PlatesGuiFragment_MembersInjector(factoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(PlatesGuiFragment instance) {
        injectFactory(instance, this.factoryProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.plates.PlatesGuiFragment.factory")
    public static void injectFactory(PlatesGuiFragment instance, MainViewModelFactory<PlatesViewModel> factory) {
        instance.factory = factory;
    }
}
