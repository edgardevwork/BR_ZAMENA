package com.blackhub.bronline.game.gui.gifts;

import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class GiftsGuiFragment_MembersInjector implements MembersInjector<GiftsGuiFragment> {
    public final Provider<MainViewModelFactory<GiftsViewModel>> factoryProvider;

    public GiftsGuiFragment_MembersInjector(Provider<MainViewModelFactory<GiftsViewModel>> factoryProvider) {
        this.factoryProvider = factoryProvider;
    }

    public static MembersInjector<GiftsGuiFragment> create(Provider<MainViewModelFactory<GiftsViewModel>> factoryProvider) {
        return new GiftsGuiFragment_MembersInjector(factoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(GiftsGuiFragment instance) {
        injectFactory(instance, this.factoryProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.gifts.GiftsGuiFragment.factory")
    public static void injectFactory(GiftsGuiFragment instance, MainViewModelFactory<GiftsViewModel> factory) {
        instance.factory = factory;
    }
}
