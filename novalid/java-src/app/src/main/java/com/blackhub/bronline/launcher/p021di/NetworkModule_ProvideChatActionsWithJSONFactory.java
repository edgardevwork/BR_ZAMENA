package com.blackhub.bronline.launcher.p021di;

import com.blackhub.bronline.game.gui.chat.network.ChatActionsWithJson;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class NetworkModule_ProvideChatActionsWithJSONFactory implements Factory<ChatActionsWithJson> {
    public final NetworkModule module;

    public NetworkModule_ProvideChatActionsWithJSONFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public ChatActionsWithJson get() {
        return provideChatActionsWithJSON(this.module);
    }

    public static NetworkModule_ProvideChatActionsWithJSONFactory create(NetworkModule module) {
        return new NetworkModule_ProvideChatActionsWithJSONFactory(module);
    }

    public static ChatActionsWithJson provideChatActionsWithJSON(NetworkModule instance) {
        return (ChatActionsWithJson) Preconditions.checkNotNullFromProvides(instance.provideChatActionsWithJSON());
    }
}
