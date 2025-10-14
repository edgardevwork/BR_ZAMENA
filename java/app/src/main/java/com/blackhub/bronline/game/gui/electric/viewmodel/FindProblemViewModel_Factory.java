package com.blackhub.bronline.game.gui.electric.viewmodel;

import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.core.preferences.PreferencesRepository;
import com.blackhub.bronline.game.core.resources.StringResource;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata

public final class FindProblemViewModel_Factory implements Factory<FindProblemViewModel> {
    public final Provider<LocalNotification> localNotificationProvider;
    public final Provider<PreferencesRepository> preferencesRepositoryProvider;
    public final Provider<StringResource> stringResourceProvider;

    public FindProblemViewModel_Factory(Provider<StringResource> stringResourceProvider, Provider<LocalNotification> localNotificationProvider, Provider<PreferencesRepository> preferencesRepositoryProvider) {
        this.stringResourceProvider = stringResourceProvider;
        this.localNotificationProvider = localNotificationProvider;
        this.preferencesRepositoryProvider = preferencesRepositoryProvider;
    }

    @Override // javax.inject.Provider
    public FindProblemViewModel get() {
        return newInstance(this.stringResourceProvider.get(), this.localNotificationProvider.get(), this.preferencesRepositoryProvider.get());
    }

    public static FindProblemViewModel_Factory create(Provider<StringResource> stringResourceProvider, Provider<LocalNotification> localNotificationProvider, Provider<PreferencesRepository> preferencesRepositoryProvider) {
        return new FindProblemViewModel_Factory(stringResourceProvider, localNotificationProvider, preferencesRepositoryProvider);
    }

    public static FindProblemViewModel newInstance(StringResource stringResource, LocalNotification localNotification, PreferencesRepository preferencesRepository) {
        return new FindProblemViewModel(stringResource, localNotification, preferencesRepository);
    }
}
