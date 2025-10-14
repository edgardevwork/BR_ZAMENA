package com.blackhub.bronline.game.gui.upgradeobjectevent;

import android.app.Application;
import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.repository.UpgradeObjectRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class UpgradeObjectEventViewModel_Factory implements Factory<UpgradeObjectEventViewModel> {
    public final Provider<UpgradeObjectEventActionWithJSON> actionWithJSONProvider;
    public final Provider<Application> applicationProvider;
    public final Provider<LocalNotification> localNotificationProvider;
    public final Provider<StringResource> stringResourceProvider;
    public final Provider<UpgradeObjectRepository> upgradeObjectRepositoryProvider;

    public UpgradeObjectEventViewModel_Factory(Provider<UpgradeObjectEventActionWithJSON> actionWithJSONProvider, Provider<UpgradeObjectRepository> upgradeObjectRepositoryProvider, Provider<StringResource> stringResourceProvider, Provider<LocalNotification> localNotificationProvider, Provider<Application> applicationProvider) {
        this.actionWithJSONProvider = actionWithJSONProvider;
        this.upgradeObjectRepositoryProvider = upgradeObjectRepositoryProvider;
        this.stringResourceProvider = stringResourceProvider;
        this.localNotificationProvider = localNotificationProvider;
        this.applicationProvider = applicationProvider;
    }

    @Override // javax.inject.Provider
    public UpgradeObjectEventViewModel get() {
        return newInstance(this.actionWithJSONProvider.get(), this.upgradeObjectRepositoryProvider.get(), this.stringResourceProvider.get(), this.localNotificationProvider.get(), this.applicationProvider.get());
    }

    public static UpgradeObjectEventViewModel_Factory create(Provider<UpgradeObjectEventActionWithJSON> actionWithJSONProvider, Provider<UpgradeObjectRepository> upgradeObjectRepositoryProvider, Provider<StringResource> stringResourceProvider, Provider<LocalNotification> localNotificationProvider, Provider<Application> applicationProvider) {
        return new UpgradeObjectEventViewModel_Factory(actionWithJSONProvider, upgradeObjectRepositoryProvider, stringResourceProvider, localNotificationProvider, applicationProvider);
    }

    public static UpgradeObjectEventViewModel newInstance(UpgradeObjectEventActionWithJSON actionWithJSON, UpgradeObjectRepository upgradeObjectRepository, StringResource stringResource, LocalNotification localNotification, Application application) {
        return new UpgradeObjectEventViewModel(actionWithJSON, upgradeObjectRepository, stringResource, localNotification, application);
    }
}
