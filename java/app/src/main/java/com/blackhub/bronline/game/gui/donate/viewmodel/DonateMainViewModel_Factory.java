package com.blackhub.bronline.game.gui.donate.viewmodel;

import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.gui.donate.network.DonateActionWithJSON;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata

public final class DonateMainViewModel_Factory implements Factory<DonateMainViewModel> {
    public final Provider<DonateActionWithJSON> actionWithJsonProvider;
    public final Provider<LocalNotification> localNotificationProvider;

    public DonateMainViewModel_Factory(Provider<DonateActionWithJSON> actionWithJsonProvider, Provider<LocalNotification> localNotificationProvider) {
        this.actionWithJsonProvider = actionWithJsonProvider;
        this.localNotificationProvider = localNotificationProvider;
    }

    @Override // javax.inject.Provider
    public DonateMainViewModel get() {
        return newInstance(this.actionWithJsonProvider.get(), this.localNotificationProvider.get());
    }

    public static DonateMainViewModel_Factory create(Provider<DonateActionWithJSON> actionWithJsonProvider, Provider<LocalNotification> localNotificationProvider) {
        return new DonateMainViewModel_Factory(actionWithJsonProvider, localNotificationProvider);
    }

    public static DonateMainViewModel newInstance(DonateActionWithJSON actionWithJson, LocalNotification localNotification) {
        return new DonateMainViewModel(actionWithJson, localNotification);
    }
}
