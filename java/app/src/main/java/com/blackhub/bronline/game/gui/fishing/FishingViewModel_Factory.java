package com.blackhub.bronline.game.gui.fishing;

import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.core.resources.StringResource;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata

public final class FishingViewModel_Factory implements Factory<FishingViewModel> {
    public final Provider<FishingActionWithJSON> actionWithJSONProvider;
    public final Provider<LocalNotification> localNotificationProvider;
    public final Provider<StringResource> stringResourceProvider;

    public FishingViewModel_Factory(Provider<LocalNotification> localNotificationProvider, Provider<StringResource> stringResourceProvider, Provider<FishingActionWithJSON> actionWithJSONProvider) {
        this.localNotificationProvider = localNotificationProvider;
        this.stringResourceProvider = stringResourceProvider;
        this.actionWithJSONProvider = actionWithJSONProvider;
    }

    @Override // javax.inject.Provider
    public FishingViewModel get() {
        return newInstance(this.localNotificationProvider.get(), this.stringResourceProvider.get(), this.actionWithJSONProvider.get());
    }

    public static FishingViewModel_Factory create(Provider<LocalNotification> localNotificationProvider, Provider<StringResource> stringResourceProvider, Provider<FishingActionWithJSON> actionWithJSONProvider) {
        return new FishingViewModel_Factory(localNotificationProvider, stringResourceProvider, actionWithJSONProvider);
    }

    public static FishingViewModel newInstance(LocalNotification localNotification, StringResource stringResource, FishingActionWithJSON actionWithJSON) {
        return new FishingViewModel(localNotification, stringResource, actionWithJSON);
    }
}
