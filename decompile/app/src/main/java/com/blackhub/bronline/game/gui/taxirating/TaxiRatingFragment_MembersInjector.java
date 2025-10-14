package com.blackhub.bronline.game.gui.taxirating;

import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class TaxiRatingFragment_MembersInjector implements MembersInjector<TaxiRatingFragment> {
    public final Provider<MainViewModelFactory<TaxiRatingViewModel>> mainFactoryProvider;

    public TaxiRatingFragment_MembersInjector(Provider<MainViewModelFactory<TaxiRatingViewModel>> mainFactoryProvider) {
        this.mainFactoryProvider = mainFactoryProvider;
    }

    public static MembersInjector<TaxiRatingFragment> create(Provider<MainViewModelFactory<TaxiRatingViewModel>> mainFactoryProvider) {
        return new TaxiRatingFragment_MembersInjector(mainFactoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(TaxiRatingFragment instance) {
        injectMainFactory(instance, this.mainFactoryProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.taxirating.TaxiRatingFragment.mainFactory")
    public static void injectMainFactory(TaxiRatingFragment instance, MainViewModelFactory<TaxiRatingViewModel> mainFactory) {
        instance.mainFactory = mainFactory;
    }
}
