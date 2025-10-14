package com.google.android.datatransport.runtime.time;

import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;

@QualifierMetadata({"com.google.android.datatransport.runtime.time.WallTime"})
@ScopeMetadata
@DaggerGenerated
/* loaded from: classes8.dex */
public final class TimeModule_EventClockFactory implements Factory<Clock> {
    @Override // javax.inject.Provider
    public Clock get() {
        return eventClock();
    }

    public static TimeModule_EventClockFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Clock eventClock() {
        return (Clock) Preconditions.checkNotNullFromProvides(TimeModule.eventClock());
    }

    /* loaded from: classes4.dex */
    public static final class InstanceHolder {
        public static final TimeModule_EventClockFactory INSTANCE = new TimeModule_EventClockFactory();
    }
}
