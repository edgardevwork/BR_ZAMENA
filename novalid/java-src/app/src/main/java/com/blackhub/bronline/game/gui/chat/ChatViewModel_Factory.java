package com.blackhub.bronline.game.gui.chat;

import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.gui.chat.network.ChatActionsWithJson;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class ChatViewModel_Factory implements Factory<ChatViewModel> {
    public final Provider<ChatActionsWithJson> actionsWithJsonProvider;
    public final Provider<StringResource> stringResourceProvider;

    public ChatViewModel_Factory(Provider<StringResource> stringResourceProvider, Provider<ChatActionsWithJson> actionsWithJsonProvider) {
        this.stringResourceProvider = stringResourceProvider;
        this.actionsWithJsonProvider = actionsWithJsonProvider;
    }

    @Override // javax.inject.Provider
    public ChatViewModel get() {
        return newInstance(this.stringResourceProvider.get(), this.actionsWithJsonProvider.get());
    }

    public static ChatViewModel_Factory create(Provider<StringResource> stringResourceProvider, Provider<ChatActionsWithJson> actionsWithJsonProvider) {
        return new ChatViewModel_Factory(stringResourceProvider, actionsWithJsonProvider);
    }

    public static ChatViewModel newInstance(StringResource stringResource, ChatActionsWithJson actionsWithJson) {
        return new ChatViewModel(stringResource, actionsWithJson);
    }
}
