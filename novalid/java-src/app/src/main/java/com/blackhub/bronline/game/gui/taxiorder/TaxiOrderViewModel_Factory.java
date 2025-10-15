package com.blackhub.bronline.game.gui.taxiorder;

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
public final class TaxiOrderViewModel_Factory implements Factory<TaxiOrderViewModel> {
    public final Provider<TaxiOrderActionWithJSON> actionWithJSONProvider;
    public final Provider<LocalNotification> localNotificationProvider;
    public final Provider<StringResource> stringResourceProvider;

    public TaxiOrderViewModel_Factory(Provider<LocalNotification> localNotificationProvider, Provider<StringResource> stringResourceProvider, Provider<TaxiOrderActionWithJSON> actionWithJSONProvider) {
        this.localNotificationProvider = localNotificationProvider;
        this.stringResourceProvider = stringResourceProvider;
        this.actionWithJSONProvider = actionWithJSONProvider;
    }

    @Override // javax.inject.Provider
    public TaxiOrderViewModel get() {
        return newInstance(this.localNotificationProvider.get(), this.stringResourceProvider.get(), this.actionWithJSONProvider.get());
    }

    public static TaxiOrderViewModel_Factory create(Provider<LocalNotification> localNotificationProvider, Provider<StringResource> stringResourceProvider, Provider<TaxiOrderActionWithJSON> actionWithJSONProvider) {
        return new TaxiOrderViewModel_Factory(localNotificationProvider, stringResourceProvider, actionWithJSONProvider);
    }

    public static TaxiOrderViewModel newInstance(LocalNotification localNotification, StringResource stringResource, TaxiOrderActionWithJSON actionWithJSON) {
        return new TaxiOrderViewModel(localNotification, stringResource, actionWithJSON);
    }
}
