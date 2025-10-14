package com.blackhub.bronline.game.gui.taxi;

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
/* loaded from: classes2.dex */
public final class TaxiViewModel_Factory implements Factory<TaxiViewModel> {
    public final Provider<TaxiActionWithJSON> actionWithJSONProvider;
    public final Provider<LocalNotification> localNotificationProvider;
    public final Provider<StringResource> stringResourceProvider;

    public TaxiViewModel_Factory(Provider<LocalNotification> localNotificationProvider, Provider<StringResource> stringResourceProvider, Provider<TaxiActionWithJSON> actionWithJSONProvider) {
        this.localNotificationProvider = localNotificationProvider;
        this.stringResourceProvider = stringResourceProvider;
        this.actionWithJSONProvider = actionWithJSONProvider;
    }

    @Override // javax.inject.Provider
    public TaxiViewModel get() {
        return newInstance(this.localNotificationProvider.get(), this.stringResourceProvider.get(), this.actionWithJSONProvider.get());
    }

    public static TaxiViewModel_Factory create(Provider<LocalNotification> localNotificationProvider, Provider<StringResource> stringResourceProvider, Provider<TaxiActionWithJSON> actionWithJSONProvider) {
        return new TaxiViewModel_Factory(localNotificationProvider, stringResourceProvider, actionWithJSONProvider);
    }

    public static TaxiViewModel newInstance(LocalNotification localNotification, StringResource stringResource, TaxiActionWithJSON actionWithJSON) {
        return new TaxiViewModel(localNotification, stringResource, actionWithJSON);
    }
}
