package com.blackhub.bronline.game.gui.activetask;

import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class ActiveTaskGuiFragment_MembersInjector implements MembersInjector<ActiveTaskGuiFragment> {
    public final Provider<MainViewModelFactory<ActiveTaskViewModel>> factoryProvider;

    public ActiveTaskGuiFragment_MembersInjector(Provider<MainViewModelFactory<ActiveTaskViewModel>> factoryProvider) {
        this.factoryProvider = factoryProvider;
    }

    public static MembersInjector<ActiveTaskGuiFragment> create(Provider<MainViewModelFactory<ActiveTaskViewModel>> factoryProvider) {
        return new ActiveTaskGuiFragment_MembersInjector(factoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ActiveTaskGuiFragment instance) {
        injectFactory(instance, this.factoryProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.activetask.ActiveTaskGuiFragment.factory")
    public static void injectFactory(ActiveTaskGuiFragment instance, MainViewModelFactory<ActiveTaskViewModel> factory) {
        instance.factory = factory;
    }
}
