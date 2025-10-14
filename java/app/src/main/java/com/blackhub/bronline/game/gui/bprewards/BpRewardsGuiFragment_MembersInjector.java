package com.blackhub.bronline.game.gui.bprewards;

import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class BpRewardsGuiFragment_MembersInjector implements MembersInjector<BpRewardsGuiFragment> {
    public final Provider<MainViewModelFactory<BpRewardsViewModel>> factoryProvider;

    public BpRewardsGuiFragment_MembersInjector(Provider<MainViewModelFactory<BpRewardsViewModel>> factoryProvider) {
        this.factoryProvider = factoryProvider;
    }

    public static MembersInjector<BpRewardsGuiFragment> create(Provider<MainViewModelFactory<BpRewardsViewModel>> factoryProvider) {
        return new BpRewardsGuiFragment_MembersInjector(factoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(BpRewardsGuiFragment instance) {
        injectFactory(instance, this.factoryProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.bprewards.BpRewardsGuiFragment.factory")
    public static void injectFactory(BpRewardsGuiFragment instance, MainViewModelFactory<BpRewardsViewModel> factory) {
        instance.factory = factory;
    }
}
