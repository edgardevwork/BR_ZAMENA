package com.blackhub.bronline.game.gui.videoplayer;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class VideoPlayerViewModel_Factory implements Factory<VideoPlayerViewModel> {
    public final Provider<VideoPlayerActionWithJson> actionWithJSONProvider;
    public final Provider<Application> applicationProvider;

    public VideoPlayerViewModel_Factory(Provider<VideoPlayerActionWithJson> actionWithJSONProvider, Provider<Application> applicationProvider) {
        this.actionWithJSONProvider = actionWithJSONProvider;
        this.applicationProvider = applicationProvider;
    }

    @Override // javax.inject.Provider
    public VideoPlayerViewModel get() {
        return newInstance(this.actionWithJSONProvider.get(), this.applicationProvider.get());
    }

    public static VideoPlayerViewModel_Factory create(Provider<VideoPlayerActionWithJson> actionWithJSONProvider, Provider<Application> applicationProvider) {
        return new VideoPlayerViewModel_Factory(actionWithJSONProvider, applicationProvider);
    }

    public static VideoPlayerViewModel newInstance(VideoPlayerActionWithJson actionWithJSON, Application application) {
        return new VideoPlayerViewModel(actionWithJSON, application);
    }
}
