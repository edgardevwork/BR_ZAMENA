package com.blackhub.bronline.game.gui.gifts;

import android.app.Application;
import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.repository.GiftsRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class GiftsViewModel_Factory implements Factory<GiftsViewModel> {
    public final Provider<GiftsActionWithJSON> actionWithJSONProvider;
    public final Provider<Application> applicationProvider;
    public final Provider<GiftsRepository> giftsRepositoryProvider;
    public final Provider<LocalNotification> localNotificationProvider;

    public GiftsViewModel_Factory(Provider<GiftsActionWithJSON> actionWithJSONProvider, Provider<GiftsRepository> giftsRepositoryProvider, Provider<LocalNotification> localNotificationProvider, Provider<Application> applicationProvider) {
        this.actionWithJSONProvider = actionWithJSONProvider;
        this.giftsRepositoryProvider = giftsRepositoryProvider;
        this.localNotificationProvider = localNotificationProvider;
        this.applicationProvider = applicationProvider;
    }

    @Override // javax.inject.Provider
    public GiftsViewModel get() {
        return newInstance(this.actionWithJSONProvider.get(), this.giftsRepositoryProvider.get(), this.localNotificationProvider.get(), this.applicationProvider.get());
    }

    public static GiftsViewModel_Factory create(Provider<GiftsActionWithJSON> actionWithJSONProvider, Provider<GiftsRepository> giftsRepositoryProvider, Provider<LocalNotification> localNotificationProvider, Provider<Application> applicationProvider) {
        return new GiftsViewModel_Factory(actionWithJSONProvider, giftsRepositoryProvider, localNotificationProvider, applicationProvider);
    }

    public static GiftsViewModel newInstance(GiftsActionWithJSON actionWithJSON, GiftsRepository giftsRepository, LocalNotification localNotification, Application application) {
        return new GiftsViewModel(actionWithJSON, giftsRepository, localNotification, application);
    }
}
