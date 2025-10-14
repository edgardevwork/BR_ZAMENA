package com.blackhub.bronline.game.gui.electric.p013ui;

import com.blackhub.bronline.game.gui.electric.viewmodel.CollectSchemeViewModel;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class CollectSchemeFragment_MembersInjector implements MembersInjector<CollectSchemeFragment> {
    public final Provider<MainViewModelFactory<CollectSchemeViewModel>> factoryProvider;

    public CollectSchemeFragment_MembersInjector(Provider<MainViewModelFactory<CollectSchemeViewModel>> factoryProvider) {
        this.factoryProvider = factoryProvider;
    }

    public static MembersInjector<CollectSchemeFragment> create(Provider<MainViewModelFactory<CollectSchemeViewModel>> factoryProvider) {
        return new CollectSchemeFragment_MembersInjector(factoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(CollectSchemeFragment instance) {
        injectFactory(instance, this.factoryProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.electric.ui.CollectSchemeFragment.factory")
    public static void injectFactory(CollectSchemeFragment instance, MainViewModelFactory<CollectSchemeViewModel> factory) {
        instance.factory = factory;
    }
}
