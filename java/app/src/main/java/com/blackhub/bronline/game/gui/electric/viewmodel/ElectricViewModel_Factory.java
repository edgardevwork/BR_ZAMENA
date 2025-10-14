package com.blackhub.bronline.game.gui.electric.viewmodel;

import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.gui.electric.network.ElectricActionWithJSON;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata

public final class ElectricViewModel_Factory implements Factory<ElectricViewModel> {
    public final Provider<ElectricActionWithJSON> actionWithJSONProvider;
    public final Provider<LocalNotification> localNotificationProvider;

    public ElectricViewModel_Factory(Provider<ElectricActionWithJSON> actionWithJSONProvider, Provider<LocalNotification> localNotificationProvider) {
        this.actionWithJSONProvider = actionWithJSONProvider;
        this.localNotificationProvider = localNotificationProvider;
    }

    @Override // javax.inject.Provider
    public ElectricViewModel get() {
        return newInstance(this.actionWithJSONProvider.get(), this.localNotificationProvider.get());
    }

    public static ElectricViewModel_Factory create(Provider<ElectricActionWithJSON> actionWithJSONProvider, Provider<LocalNotification> localNotificationProvider) {
        return new ElectricViewModel_Factory(actionWithJSONProvider, localNotificationProvider);
    }

    public static ElectricViewModel newInstance(ElectricActionWithJSON actionWithJSON, LocalNotification localNotification) {
        return new ElectricViewModel(actionWithJSON, localNotification);
    }
}
