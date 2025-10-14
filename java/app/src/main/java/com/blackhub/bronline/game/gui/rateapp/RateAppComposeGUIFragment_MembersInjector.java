package com.blackhub.bronline.game.gui.rateapp;

import com.blackhub.bronline.game.gui.rateapp.viewmodel.RateAppViewModel;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class RateAppComposeGUIFragment_MembersInjector implements MembersInjector<RateAppComposeGUIFragment> {
    public final Provider<MainViewModelFactory<RateAppViewModel>> factoryProvider;

    public RateAppComposeGUIFragment_MembersInjector(Provider<MainViewModelFactory<RateAppViewModel>> factoryProvider) {
        this.factoryProvider = factoryProvider;
    }

    public static MembersInjector<RateAppComposeGUIFragment> create(Provider<MainViewModelFactory<RateAppViewModel>> factoryProvider) {
        return new RateAppComposeGUIFragment_MembersInjector(factoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(RateAppComposeGUIFragment instance) {
        injectFactory(instance, this.factoryProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.rateapp.RateAppComposeGUIFragment.factory")
    public static void injectFactory(RateAppComposeGUIFragment instance, MainViewModelFactory<RateAppViewModel> factory) {
        instance.factory = factory;
    }
}
