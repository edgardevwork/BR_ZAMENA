package com.blackhub.bronline.game.gui.entertainmentsystem.p014ui;

import com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel.FinalWindowViewModel;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class GUIEntertainmentSystemFinalWindow_MembersInjector implements MembersInjector<GUIEntertainmentSystemFinalWindow> {
    public final Provider<MainViewModelFactory<FinalWindowViewModel>> finalWindowFactoryProvider;

    public GUIEntertainmentSystemFinalWindow_MembersInjector(Provider<MainViewModelFactory<FinalWindowViewModel>> finalWindowFactoryProvider) {
        this.finalWindowFactoryProvider = finalWindowFactoryProvider;
    }

    public static MembersInjector<GUIEntertainmentSystemFinalWindow> create(Provider<MainViewModelFactory<FinalWindowViewModel>> finalWindowFactoryProvider) {
        return new GUIEntertainmentSystemFinalWindow_MembersInjector(finalWindowFactoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(GUIEntertainmentSystemFinalWindow instance) {
        injectFinalWindowFactory(instance, this.finalWindowFactoryProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.entertainmentsystem.ui.GUIEntertainmentSystemFinalWindow.finalWindowFactory")
    public static void injectFinalWindowFactory(GUIEntertainmentSystemFinalWindow instance, MainViewModelFactory<FinalWindowViewModel> finalWindowFactory) {
        instance.finalWindowFactory = finalWindowFactory;
    }
}
