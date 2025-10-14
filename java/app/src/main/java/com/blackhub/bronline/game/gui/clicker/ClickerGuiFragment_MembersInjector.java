package com.blackhub.bronline.game.gui.clicker;

import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class ClickerGuiFragment_MembersInjector implements MembersInjector<ClickerGuiFragment> {
    public final Provider<MainViewModelFactory<ClickerViewModel>> factoryProvider;

    public ClickerGuiFragment_MembersInjector(Provider<MainViewModelFactory<ClickerViewModel>> factoryProvider) {
        this.factoryProvider = factoryProvider;
    }

    public static MembersInjector<ClickerGuiFragment> create(Provider<MainViewModelFactory<ClickerViewModel>> factoryProvider) {
        return new ClickerGuiFragment_MembersInjector(factoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ClickerGuiFragment instance) {
        injectFactory(instance, this.factoryProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.clicker.ClickerGuiFragment.factory")
    public static void injectFactory(ClickerGuiFragment instance, MainViewModelFactory<ClickerViewModel> factory) {
        instance.factory = factory;
    }
}
