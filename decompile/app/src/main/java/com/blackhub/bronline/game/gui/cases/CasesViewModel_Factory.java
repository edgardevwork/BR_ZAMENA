package com.blackhub.bronline.game.gui.cases;

import android.app.Application;
import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.gui.cases.network.CasesActionWithJSON;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class CasesViewModel_Factory implements Factory<CasesViewModel> {
    public final Provider<CasesActionWithJSON> actionWithJSONProvider;
    public final Provider<Application> applicationProvider;
    public final Provider<LocalNotification> localNotificationProvider;
    public final Provider<StringResource> stringResourcesProvider;

    public CasesViewModel_Factory(Provider<CasesActionWithJSON> actionWithJSONProvider, Provider<LocalNotification> localNotificationProvider, Provider<StringResource> stringResourcesProvider, Provider<Application> applicationProvider) {
        this.actionWithJSONProvider = actionWithJSONProvider;
        this.localNotificationProvider = localNotificationProvider;
        this.stringResourcesProvider = stringResourcesProvider;
        this.applicationProvider = applicationProvider;
    }

    @Override // javax.inject.Provider
    public CasesViewModel get() {
        return newInstance(this.actionWithJSONProvider.get(), this.localNotificationProvider.get(), this.stringResourcesProvider.get(), this.applicationProvider.get());
    }

    public static CasesViewModel_Factory create(Provider<CasesActionWithJSON> actionWithJSONProvider, Provider<LocalNotification> localNotificationProvider, Provider<StringResource> stringResourcesProvider, Provider<Application> applicationProvider) {
        return new CasesViewModel_Factory(actionWithJSONProvider, localNotificationProvider, stringResourcesProvider, applicationProvider);
    }

    public static CasesViewModel newInstance(CasesActionWithJSON actionWithJSON, LocalNotification localNotification, StringResource stringResources, Application application) {
        return new CasesViewModel(actionWithJSON, localNotification, stringResources, application);
    }
}
