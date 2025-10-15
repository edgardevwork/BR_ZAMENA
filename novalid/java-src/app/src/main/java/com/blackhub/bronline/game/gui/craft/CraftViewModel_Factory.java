package com.blackhub.bronline.game.gui.craft;

import android.app.Application;
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
/* loaded from: classes3.dex */
public final class CraftViewModel_Factory implements Factory<CraftViewModel> {
    public final Provider<CraftActionWithJSON> actionWithJSONProvider;
    public final Provider<Application> applicationProvider;
    public final Provider<LocalNotification> localNotificationProvider;
    public final Provider<PreferencesRepository> preferencesRepositoryProvider;
    public final Provider<StringResource> stringResourcesProvider;

    public CraftViewModel_Factory(Provider<CraftActionWithJSON> actionWithJSONProvider, Provider<StringResource> stringResourcesProvider, Provider<Application> applicationProvider, Provider<LocalNotification> localNotificationProvider, Provider<PreferencesRepository> preferencesRepositoryProvider) {
        this.actionWithJSONProvider = actionWithJSONProvider;
        this.stringResourcesProvider = stringResourcesProvider;
        this.applicationProvider = applicationProvider;
        this.localNotificationProvider = localNotificationProvider;
        this.preferencesRepositoryProvider = preferencesRepositoryProvider;
    }

    @Override // javax.inject.Provider
    public CraftViewModel get() {
        return newInstance(this.actionWithJSONProvider.get(), this.stringResourcesProvider.get(), this.applicationProvider.get(), this.localNotificationProvider.get(), this.preferencesRepositoryProvider.get());
    }

    public static CraftViewModel_Factory create(Provider<CraftActionWithJSON> actionWithJSONProvider, Provider<StringResource> stringResourcesProvider, Provider<Application> applicationProvider, Provider<LocalNotification> localNotificationProvider, Provider<PreferencesRepository> preferencesRepositoryProvider) {
        return new CraftViewModel_Factory(actionWithJSONProvider, stringResourcesProvider, applicationProvider, localNotificationProvider, preferencesRepositoryProvider);
    }

    public static CraftViewModel newInstance(CraftActionWithJSON actionWithJSON, StringResource stringResources, Application application, LocalNotification localNotification, PreferencesRepository preferencesRepository) {
        return new CraftViewModel(actionWithJSON, stringResources, application, localNotification, preferencesRepository);
    }
}
