package com.blackhub.bronline.launcher.p021di;

import com.blackhub.bronline.game.gui.youtubeplayer.YoutubePlayerActionWithJSON;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class NetworkModule_ProvideYoutubePlayerActionWithJSONFactory implements Factory<YoutubePlayerActionWithJSON> {
    public final NetworkModule module;

    public NetworkModule_ProvideYoutubePlayerActionWithJSONFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public YoutubePlayerActionWithJSON get() {
        return provideYoutubePlayerActionWithJSON(this.module);
    }

    public static NetworkModule_ProvideYoutubePlayerActionWithJSONFactory create(NetworkModule module) {
        return new NetworkModule_ProvideYoutubePlayerActionWithJSONFactory(module);
    }

    public static YoutubePlayerActionWithJSON provideYoutubePlayerActionWithJSON(NetworkModule instance) {
        return (YoutubePlayerActionWithJSON) Preconditions.checkNotNullFromProvides(instance.provideYoutubePlayerActionWithJSON());
    }
}
