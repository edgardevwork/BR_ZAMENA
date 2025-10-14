package com.blackhub.bronline.game.gui.chat;

import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata

public final class ChatGuiFragment_MembersInjector implements MembersInjector<ChatGuiFragment> {
    public final Provider<MainViewModelFactory<ChatViewModel>> factoryProvider;

    public ChatGuiFragment_MembersInjector(Provider<MainViewModelFactory<ChatViewModel>> factoryProvider) {
        this.factoryProvider = factoryProvider;
    }

    public static MembersInjector<ChatGuiFragment> create(Provider<MainViewModelFactory<ChatViewModel>> factoryProvider) {
        return new ChatGuiFragment_MembersInjector(factoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ChatGuiFragment instance) {
        injectFactory(instance, this.factoryProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.chat.ChatGuiFragment.factory")
    public static void injectFactory(ChatGuiFragment instance, MainViewModelFactory<ChatViewModel> factory) {
        instance.factory = factory;
    }
}
