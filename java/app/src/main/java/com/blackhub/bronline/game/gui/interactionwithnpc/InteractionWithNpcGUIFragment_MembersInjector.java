package com.blackhub.bronline.game.gui.interactionwithnpc;

import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata

public final class InteractionWithNpcGUIFragment_MembersInjector implements MembersInjector<InteractionWithNpcGUIFragment> {
    public final Provider<MainViewModelFactory<InteractionWithNpcViewModel>> factoryProvider;

    public InteractionWithNpcGUIFragment_MembersInjector(Provider<MainViewModelFactory<InteractionWithNpcViewModel>> factoryProvider) {
        this.factoryProvider = factoryProvider;
    }

    public static MembersInjector<InteractionWithNpcGUIFragment> create(Provider<MainViewModelFactory<InteractionWithNpcViewModel>> factoryProvider) {
        return new InteractionWithNpcGUIFragment_MembersInjector(factoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(InteractionWithNpcGUIFragment instance) {
        injectFactory(instance, this.factoryProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.interactionwithnpc.InteractionWithNpcGUIFragment.factory")
    public static void injectFactory(InteractionWithNpcGUIFragment instance, MainViewModelFactory<InteractionWithNpcViewModel> factory) {
        instance.factory = factory;
    }
}
