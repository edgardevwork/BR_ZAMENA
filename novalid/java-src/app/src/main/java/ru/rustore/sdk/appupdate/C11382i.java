package ru.rustore.sdk.appupdate;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.analytics.event.AnalyticsEvent;

/* renamed from: ru.rustore.sdk.appupdate.i */
/* loaded from: classes8.dex */
public final class C11382i extends AnalyticsEvent {

    /* renamed from: a */
    @NotNull
    public final String f10122a;

    /* renamed from: b */
    @NotNull
    public final Map<String, String> f10123b;

    public C11382i(@NotNull String eventName, @NotNull Map<String, String> eventData) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        this.f10122a = eventName;
        this.f10123b = eventData;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11382i)) {
            return false;
        }
        C11382i c11382i = (C11382i) obj;
        return Intrinsics.areEqual(this.f10122a, c11382i.f10122a) && Intrinsics.areEqual(this.f10123b, c11382i.f10123b);
    }

    @Override // ru.rustore.sdk.analytics.event.AnalyticsEvent
    @NotNull
    public final Map<String, String> getEventData() {
        return this.f10123b;
    }

    @Override // ru.rustore.sdk.analytics.event.AnalyticsEvent
    @NotNull
    public final String getEventName() {
        return this.f10122a;
    }

    public final int hashCode() {
        return this.f10123b.hashCode() + (this.f10122a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "AppUpdateAnalyticsEvent(eventName=" + this.f10122a + ", eventData=" + this.f10123b + ')';
    }
}
