package com.blackhub.bronline.game.gui.taxi;

import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class TaxiFragment_MembersInjector implements MembersInjector<TaxiFragment> {
    public final Provider<MainViewModelFactory<TaxiViewModel>> mainFactoryProvider;

    public TaxiFragment_MembersInjector(Provider<MainViewModelFactory<TaxiViewModel>> mainFactoryProvider) {
        this.mainFactoryProvider = mainFactoryProvider;
    }

    public static MembersInjector<TaxiFragment> create(Provider<MainViewModelFactory<TaxiViewModel>> mainFactoryProvider) {
        return new TaxiFragment_MembersInjector(mainFactoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(TaxiFragment instance) {
        injectMainFactory(instance, this.mainFactoryProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.taxi.TaxiFragment.mainFactory")
    public static void injectMainFactory(TaxiFragment instance, MainViewModelFactory<TaxiViewModel> mainFactory) {
        instance.mainFactory = mainFactory;
    }
}
