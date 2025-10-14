package com.blackhub.bronline.game.gui.electric.p013ui;

import com.blackhub.bronline.game.gui.electric.viewmodel.RaiseChargeViewModel;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class RaiseChargeFragment_MembersInjector implements MembersInjector<RaiseChargeFragment> {
    public final Provider<MainViewModelFactory<RaiseChargeViewModel>> factoryProvider;

    public RaiseChargeFragment_MembersInjector(Provider<MainViewModelFactory<RaiseChargeViewModel>> factoryProvider) {
        this.factoryProvider = factoryProvider;
    }

    public static MembersInjector<RaiseChargeFragment> create(Provider<MainViewModelFactory<RaiseChargeViewModel>> factoryProvider) {
        return new RaiseChargeFragment_MembersInjector(factoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(RaiseChargeFragment instance) {
        injectFactory(instance, this.factoryProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.electric.ui.RaiseChargeFragment.factory")
    public static void injectFactory(RaiseChargeFragment instance, MainViewModelFactory<RaiseChargeViewModel> factory) {
        instance.factory = factory;
    }
}
