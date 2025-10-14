package com.blackhub.bronline.game.gui.upgradeobjectevent;

import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class UpgradeObjectEventGuiFragment_MembersInjector implements MembersInjector<UpgradeObjectEventGuiFragment> {
    public final Provider<MainViewModelFactory<UpgradeObjectEventViewModel>> factoryProvider;

    public UpgradeObjectEventGuiFragment_MembersInjector(Provider<MainViewModelFactory<UpgradeObjectEventViewModel>> factoryProvider) {
        this.factoryProvider = factoryProvider;
    }

    public static MembersInjector<UpgradeObjectEventGuiFragment> create(Provider<MainViewModelFactory<UpgradeObjectEventViewModel>> factoryProvider) {
        return new UpgradeObjectEventGuiFragment_MembersInjector(factoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(UpgradeObjectEventGuiFragment instance) {
        injectFactory(instance, this.factoryProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.upgradeobjectevent.UpgradeObjectEventGuiFragment.factory")
    public static void injectFactory(UpgradeObjectEventGuiFragment instance, MainViewModelFactory<UpgradeObjectEventViewModel> factory) {
        instance.factory = factory;
    }
}
