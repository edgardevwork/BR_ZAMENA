package com.blackhub.bronline.game.gui.rating;

import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class RatingGuiFragment_MembersInjector implements MembersInjector<RatingGuiFragment> {
    public final Provider<MainViewModelFactory<RatingViewModel>> factoryProvider;

    public RatingGuiFragment_MembersInjector(Provider<MainViewModelFactory<RatingViewModel>> factoryProvider) {
        this.factoryProvider = factoryProvider;
    }

    public static MembersInjector<RatingGuiFragment> create(Provider<MainViewModelFactory<RatingViewModel>> factoryProvider) {
        return new RatingGuiFragment_MembersInjector(factoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(RatingGuiFragment instance) {
        injectFactory(instance, this.factoryProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.rating.RatingGuiFragment.factory")
    public static void injectFactory(RatingGuiFragment instance, MainViewModelFactory<RatingViewModel> factory) {
        instance.factory = factory;
    }
}
