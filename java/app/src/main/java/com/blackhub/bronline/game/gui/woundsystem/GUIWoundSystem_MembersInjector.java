package com.blackhub.bronline.game.gui.woundsystem;

import com.blackhub.bronline.game.gui.woundsystem.viewmodel.WoundSystemViewModel;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class GUIWoundSystem_MembersInjector implements MembersInjector<GUIWoundSystem> {
    public final Provider<MainViewModelFactory<WoundSystemViewModel>> woundSystemFactoryProvider;

    public GUIWoundSystem_MembersInjector(Provider<MainViewModelFactory<WoundSystemViewModel>> woundSystemFactoryProvider) {
        this.woundSystemFactoryProvider = woundSystemFactoryProvider;
    }

    public static MembersInjector<GUIWoundSystem> create(Provider<MainViewModelFactory<WoundSystemViewModel>> woundSystemFactoryProvider) {
        return new GUIWoundSystem_MembersInjector(woundSystemFactoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(GUIWoundSystem instance) {
        injectWoundSystemFactory(instance, this.woundSystemFactoryProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.woundsystem.GUIWoundSystem.woundSystemFactory")
    public static void injectWoundSystemFactory(GUIWoundSystem instance, MainViewModelFactory<WoundSystemViewModel> woundSystemFactory) {
        instance.woundSystemFactory = woundSystemFactory;
    }
}
