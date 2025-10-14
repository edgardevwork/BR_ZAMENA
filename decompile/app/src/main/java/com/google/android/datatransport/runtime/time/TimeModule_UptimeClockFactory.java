package com.google.android.datatransport.runtime.time;

import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;

@QualifierMetadata({"com.google.android.datatransport.runtime.time.Monotonic"})
@ScopeMetadata
@DaggerGenerated
/* loaded from: classes8.dex */
public final class TimeModule_UptimeClockFactory implements Factory<Clock> {
    @Override // javax.inject.Provider
    public Clock get() {
        return uptimeClock();
    }

    public static TimeModule_UptimeClockFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Clock uptimeClock() {
        return (Clock) Preconditions.checkNotNullFromProvides(TimeModule.uptimeClock());
    }

    /* loaded from: classes4.dex */
    public static final class InstanceHolder {
        public static final TimeModule_UptimeClockFactory INSTANCE = new TimeModule_UptimeClockFactory();
    }
}
