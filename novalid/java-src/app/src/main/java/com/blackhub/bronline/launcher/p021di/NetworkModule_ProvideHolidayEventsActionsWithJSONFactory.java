package com.blackhub.bronline.launcher.p021di;

import com.blackhub.bronline.game.gui.holidayevents.HolidayEventsActionsWithJSON;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class NetworkModule_ProvideHolidayEventsActionsWithJSONFactory implements Factory<HolidayEventsActionsWithJSON> {
    public final NetworkModule module;

    public NetworkModule_ProvideHolidayEventsActionsWithJSONFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public HolidayEventsActionsWithJSON get() {
        return provideHolidayEventsActionsWithJSON(this.module);
    }

    public static NetworkModule_ProvideHolidayEventsActionsWithJSONFactory create(NetworkModule module) {
        return new NetworkModule_ProvideHolidayEventsActionsWithJSONFactory(module);
    }

    public static HolidayEventsActionsWithJSON provideHolidayEventsActionsWithJSON(NetworkModule instance) {
        return (HolidayEventsActionsWithJSON) Preconditions.checkNotNullFromProvides(instance.provideHolidayEventsActionsWithJSON());
    }
}
