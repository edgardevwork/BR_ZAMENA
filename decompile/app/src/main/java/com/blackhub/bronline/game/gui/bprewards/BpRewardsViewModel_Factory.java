package com.blackhub.bronline.game.gui.bprewards;

import android.app.Application;
import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.core.resources.BitmapResource;
import com.blackhub.bronline.game.core.resources.StringResource;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class BpRewardsViewModel_Factory implements Factory<BpRewardsViewModel> {
    public final Provider<BpRewardsActionWithJSON> actionWithJSONProvider;
    public final Provider<Application> applicationProvider;
    public final Provider<BitmapResource> bitmapResourceProvider;
    public final Provider<LocalNotification> localNotificationProvider;
    public final Provider<StringResource> stringResourceProvider;

    public BpRewardsViewModel_Factory(Provider<BpRewardsActionWithJSON> actionWithJSONProvider, Provider<StringResource> stringResourceProvider, Provider<LocalNotification> localNotificationProvider, Provider<Application> applicationProvider, Provider<BitmapResource> bitmapResourceProvider) {
        this.actionWithJSONProvider = actionWithJSONProvider;
        this.stringResourceProvider = stringResourceProvider;
        this.localNotificationProvider = localNotificationProvider;
        this.applicationProvider = applicationProvider;
        this.bitmapResourceProvider = bitmapResourceProvider;
    }

    @Override // javax.inject.Provider
    public BpRewardsViewModel get() {
        return newInstance(this.actionWithJSONProvider.get(), this.stringResourceProvider.get(), this.localNotificationProvider.get(), this.applicationProvider.get(), this.bitmapResourceProvider.get());
    }

    public static BpRewardsViewModel_Factory create(Provider<BpRewardsActionWithJSON> actionWithJSONProvider, Provider<StringResource> stringResourceProvider, Provider<LocalNotification> localNotificationProvider, Provider<Application> applicationProvider, Provider<BitmapResource> bitmapResourceProvider) {
        return new BpRewardsViewModel_Factory(actionWithJSONProvider, stringResourceProvider, localNotificationProvider, applicationProvider, bitmapResourceProvider);
    }

    public static BpRewardsViewModel newInstance(BpRewardsActionWithJSON actionWithJSON, StringResource stringResource, LocalNotification localNotification, Application application, BitmapResource bitmapResource) {
        return new BpRewardsViewModel(actionWithJSON, stringResource, localNotification, application, bitmapResource);
    }
}
