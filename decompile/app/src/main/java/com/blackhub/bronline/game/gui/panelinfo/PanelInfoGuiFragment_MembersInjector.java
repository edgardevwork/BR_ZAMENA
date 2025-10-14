package com.blackhub.bronline.game.gui.panelinfo;

import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class PanelInfoGuiFragment_MembersInjector implements MembersInjector<PanelInfoGuiFragment> {
    public final Provider<MainViewModelFactory<PanelInfoViewModel>> factoryProvider;

    public PanelInfoGuiFragment_MembersInjector(Provider<MainViewModelFactory<PanelInfoViewModel>> factoryProvider) {
        this.factoryProvider = factoryProvider;
    }

    public static MembersInjector<PanelInfoGuiFragment> create(Provider<MainViewModelFactory<PanelInfoViewModel>> factoryProvider) {
        return new PanelInfoGuiFragment_MembersInjector(factoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(PanelInfoGuiFragment instance) {
        injectFactory(instance, this.factoryProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.panelinfo.PanelInfoGuiFragment.factory")
    public static void injectFactory(PanelInfoGuiFragment instance, MainViewModelFactory<PanelInfoViewModel> factory) {
        instance.factory = factory;
    }
}
