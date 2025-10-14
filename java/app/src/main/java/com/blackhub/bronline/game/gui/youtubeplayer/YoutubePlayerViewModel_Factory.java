package com.blackhub.bronline.game.gui.youtubeplayer;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class YoutubePlayerViewModel_Factory implements Factory<YoutubePlayerViewModel> {
    public final Provider<YoutubePlayerActionWithJSON> actionWithJSONProvider;

    public YoutubePlayerViewModel_Factory(Provider<YoutubePlayerActionWithJSON> actionWithJSONProvider) {
        this.actionWithJSONProvider = actionWithJSONProvider;
    }

    @Override // javax.inject.Provider
    public YoutubePlayerViewModel get() {
        return newInstance(this.actionWithJSONProvider.get());
    }

    public static YoutubePlayerViewModel_Factory create(Provider<YoutubePlayerActionWithJSON> actionWithJSONProvider) {
        return new YoutubePlayerViewModel_Factory(actionWithJSONProvider);
    }

    public static YoutubePlayerViewModel newInstance(YoutubePlayerActionWithJSON actionWithJSON) {
        return new YoutubePlayerViewModel(actionWithJSON);
    }
}
