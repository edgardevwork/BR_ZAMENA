package com.blackhub.bronline.game.gui.brsimbanner;

import android.app.Application;
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
/* loaded from: classes.dex */
public final class BrSimBannerViewModel_Factory implements Factory<BrSimBannerViewModel> {
    public final Provider<BrSimBannerActionsWithJson> actionsWithJsonProvider;
    public final Provider<Application> applicationProvider;
    public final Provider<LocalNotification> localNotificationProvider;
    public final Provider<StringResource> stringResourcesProvider;

    public BrSimBannerViewModel_Factory(Provider<BrSimBannerActionsWithJson> actionsWithJsonProvider, Provider<Application> applicationProvider, Provider<LocalNotification> localNotificationProvider, Provider<StringResource> stringResourcesProvider) {
        this.actionsWithJsonProvider = actionsWithJsonProvider;
        this.applicationProvider = applicationProvider;
        this.localNotificationProvider = localNotificationProvider;
        this.stringResourcesProvider = stringResourcesProvider;
    }

    @Override // javax.inject.Provider
    public BrSimBannerViewModel get() {
        return newInstance(this.actionsWithJsonProvider.get(), this.applicationProvider.get(), this.localNotificationProvider.get(), this.stringResourcesProvider.get());
    }

    public static BrSimBannerViewModel_Factory create(Provider<BrSimBannerActionsWithJson> actionsWithJsonProvider, Provider<Application> applicationProvider, Provider<LocalNotification> localNotificationProvider, Provider<StringResource> stringResourcesProvider) {
        return new BrSimBannerViewModel_Factory(actionsWithJsonProvider, applicationProvider, localNotificationProvider, stringResourcesProvider);
    }

    public static BrSimBannerViewModel newInstance(BrSimBannerActionsWithJson actionsWithJson, Application application, LocalNotification localNotification, StringResource stringResources) {
        return new BrSimBannerViewModel(actionsWithJson, application, localNotification, stringResources);
    }
}
