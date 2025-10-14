package com.blackhub.bronline.game.gui.calendar;

import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.gui.calendar.network.CalendarActionWithJSON;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class CalendarViewModel_Factory implements Factory<CalendarViewModel> {
    public final Provider<CalendarActionWithJSON> actionWithJSONProvider;
    public final Provider<LocalNotification> localNotificationProvider;
    public final Provider<StringResource> stringResourcesProvider;

    public CalendarViewModel_Factory(Provider<CalendarActionWithJSON> actionWithJSONProvider, Provider<StringResource> stringResourcesProvider, Provider<LocalNotification> localNotificationProvider) {
        this.actionWithJSONProvider = actionWithJSONProvider;
        this.stringResourcesProvider = stringResourcesProvider;
        this.localNotificationProvider = localNotificationProvider;
    }

    @Override // javax.inject.Provider
    public CalendarViewModel get() {
        return newInstance(this.actionWithJSONProvider.get(), this.stringResourcesProvider.get(), this.localNotificationProvider.get());
    }

    public static CalendarViewModel_Factory create(Provider<CalendarActionWithJSON> actionWithJSONProvider, Provider<StringResource> stringResourcesProvider, Provider<LocalNotification> localNotificationProvider) {
        return new CalendarViewModel_Factory(actionWithJSONProvider, stringResourcesProvider, localNotificationProvider);
    }

    public static CalendarViewModel newInstance(CalendarActionWithJSON actionWithJSON, StringResource stringResources, LocalNotification localNotification) {
        return new CalendarViewModel(actionWithJSON, stringResources, localNotification);
    }
}
