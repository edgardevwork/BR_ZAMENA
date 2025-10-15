package com.blackhub.bronline.game.gui.marketplace;

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
public final class MarketplaceViewModel_Factory implements Factory<MarketplaceViewModel> {
    public final Provider<MarketplaceActionWithJson> actionWithJSONProvider;
    public final Provider<Application> applicationProvider;
    public final Provider<LocalNotification> localNotificationProvider;
    public final Provider<StringResource> stringResourcesProvider;

    public MarketplaceViewModel_Factory(Provider<MarketplaceActionWithJson> actionWithJSONProvider, Provider<StringResource> stringResourcesProvider, Provider<Application> applicationProvider, Provider<LocalNotification> localNotificationProvider) {
        this.actionWithJSONProvider = actionWithJSONProvider;
        this.stringResourcesProvider = stringResourcesProvider;
        this.applicationProvider = applicationProvider;
        this.localNotificationProvider = localNotificationProvider;
    }

    @Override // javax.inject.Provider
    public MarketplaceViewModel get() {
        return newInstance(this.actionWithJSONProvider.get(), this.stringResourcesProvider.get(), this.applicationProvider.get(), this.localNotificationProvider.get());
    }

    public static MarketplaceViewModel_Factory create(Provider<MarketplaceActionWithJson> actionWithJSONProvider, Provider<StringResource> stringResourcesProvider, Provider<Application> applicationProvider, Provider<LocalNotification> localNotificationProvider) {
        return new MarketplaceViewModel_Factory(actionWithJSONProvider, stringResourcesProvider, applicationProvider, localNotificationProvider);
    }

    public static MarketplaceViewModel newInstance(MarketplaceActionWithJson actionWithJSON, StringResource stringResources, Application application, LocalNotification localNotification) {
        return new MarketplaceViewModel(actionWithJSON, stringResources, application, localNotification);
    }
}
