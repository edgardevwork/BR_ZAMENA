package com.blackhub.bronline.game.gui.taximap;

import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class TaxiMapFragment_MembersInjector implements MembersInjector<TaxiMapFragment> {
    public final Provider<MainViewModelFactory<TaxiMapViewModel>> factoryProvider;

    public TaxiMapFragment_MembersInjector(Provider<MainViewModelFactory<TaxiMapViewModel>> factoryProvider) {
        this.factoryProvider = factoryProvider;
    }

    public static MembersInjector<TaxiMapFragment> create(Provider<MainViewModelFactory<TaxiMapViewModel>> factoryProvider) {
        return new TaxiMapFragment_MembersInjector(factoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(TaxiMapFragment instance) {
        injectFactory(instance, this.factoryProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.taximap.TaxiMapFragment.factory")
    public static void injectFactory(TaxiMapFragment instance, MainViewModelFactory<TaxiMapViewModel> factory) {
        instance.factory = factory;
    }
}
