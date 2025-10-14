package com.blackhub.bronline.game.gui.holidayevents;

import android.app.Application;
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
public final class HolidayEventsViewModel_Factory implements Factory<HolidayEventsViewModel> {
    public final Provider<HolidayEventsActionsWithJSON> actionWithJSONProvider;
    public final Provider<Application> applicationProvider;
    public final Provider<StringResource> stringResourceProvider;

    public HolidayEventsViewModel_Factory(Provider<HolidayEventsActionsWithJSON> actionWithJSONProvider, Provider<StringResource> stringResourceProvider, Provider<Application> applicationProvider) {
        this.actionWithJSONProvider = actionWithJSONProvider;
        this.stringResourceProvider = stringResourceProvider;
        this.applicationProvider = applicationProvider;
    }

    @Override // javax.inject.Provider
    public HolidayEventsViewModel get() {
        return newInstance(this.actionWithJSONProvider.get(), this.stringResourceProvider.get(), this.applicationProvider.get());
    }

    public static HolidayEventsViewModel_Factory create(Provider<HolidayEventsActionsWithJSON> actionWithJSONProvider, Provider<StringResource> stringResourceProvider, Provider<Application> applicationProvider) {
        return new HolidayEventsViewModel_Factory(actionWithJSONProvider, stringResourceProvider, applicationProvider);
    }

    public static HolidayEventsViewModel newInstance(HolidayEventsActionsWithJSON actionWithJSON, StringResource stringResource, Application application) {
        return new HolidayEventsViewModel(actionWithJSON, stringResource, application);
    }
}
