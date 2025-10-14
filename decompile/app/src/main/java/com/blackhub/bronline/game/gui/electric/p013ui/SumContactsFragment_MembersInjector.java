package com.blackhub.bronline.game.gui.electric.p013ui;

import com.blackhub.bronline.game.gui.electric.viewmodel.SumContactsViewModel;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class SumContactsFragment_MembersInjector implements MembersInjector<SumContactsFragment> {
    public final Provider<MainViewModelFactory<SumContactsViewModel>> factoryProvider;

    public SumContactsFragment_MembersInjector(Provider<MainViewModelFactory<SumContactsViewModel>> factoryProvider) {
        this.factoryProvider = factoryProvider;
    }

    public static MembersInjector<SumContactsFragment> create(Provider<MainViewModelFactory<SumContactsViewModel>> factoryProvider) {
        return new SumContactsFragment_MembersInjector(factoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(SumContactsFragment instance) {
        injectFactory(instance, this.factoryProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.electric.ui.SumContactsFragment.factory")
    public static void injectFactory(SumContactsFragment instance, MainViewModelFactory<SumContactsViewModel> factory) {
        instance.factory = factory;
    }
}
