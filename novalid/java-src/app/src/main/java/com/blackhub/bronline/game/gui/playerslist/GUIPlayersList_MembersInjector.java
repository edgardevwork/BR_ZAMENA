package com.blackhub.bronline.game.gui.playerslist;

import com.blackhub.bronline.game.gui.playerslist.viewmodel.PlayersListViewModel;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class GUIPlayersList_MembersInjector implements MembersInjector<GUIPlayersList> {
    public final Provider<MainViewModelFactory<PlayersListViewModel>> vmFactoryProvider;

    public GUIPlayersList_MembersInjector(Provider<MainViewModelFactory<PlayersListViewModel>> vmFactoryProvider) {
        this.vmFactoryProvider = vmFactoryProvider;
    }

    public static MembersInjector<GUIPlayersList> create(Provider<MainViewModelFactory<PlayersListViewModel>> vmFactoryProvider) {
        return new GUIPlayersList_MembersInjector(vmFactoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(GUIPlayersList instance) {
        injectVmFactory(instance, this.vmFactoryProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.playerslist.GUIPlayersList.vmFactory")
    public static void injectVmFactory(GUIPlayersList instance, MainViewModelFactory<PlayersListViewModel> vmFactory) {
        instance.vmFactory = vmFactory;
    }
}
