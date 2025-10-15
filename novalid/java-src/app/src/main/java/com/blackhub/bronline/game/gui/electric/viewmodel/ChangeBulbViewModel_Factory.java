package com.blackhub.bronline.game.gui.electric.viewmodel;

import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.core.preferences.PreferencesRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class ChangeBulbViewModel_Factory implements Factory<ChangeBulbViewModel> {
    public final Provider<LocalNotification> localNotificationProvider;
    public final Provider<PreferencesRepository> preferencesRepositoryProvider;

    public ChangeBulbViewModel_Factory(Provider<LocalNotification> localNotificationProvider, Provider<PreferencesRepository> preferencesRepositoryProvider) {
        this.localNotificationProvider = localNotificationProvider;
        this.preferencesRepositoryProvider = preferencesRepositoryProvider;
    }

    @Override // javax.inject.Provider
    public ChangeBulbViewModel get() {
        return newInstance(this.localNotificationProvider.get(), this.preferencesRepositoryProvider.get());
    }

    public static ChangeBulbViewModel_Factory create(Provider<LocalNotification> localNotificationProvider, Provider<PreferencesRepository> preferencesRepositoryProvider) {
        return new ChangeBulbViewModel_Factory(localNotificationProvider, preferencesRepositoryProvider);
    }

    public static ChangeBulbViewModel newInstance(LocalNotification localNotification, PreferencesRepository preferencesRepository) {
        return new ChangeBulbViewModel(localNotification, preferencesRepository);
    }
}
