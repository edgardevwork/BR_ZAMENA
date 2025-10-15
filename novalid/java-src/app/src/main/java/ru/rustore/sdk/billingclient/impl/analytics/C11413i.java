package ru.rustore.sdk.billingclient.impl.analytics;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.analytics.event.AnalyticsEvent;

/* renamed from: ru.rustore.sdk.billingclient.impl.analytics.i */
/* loaded from: classes7.dex */
public final class C11413i extends AnalyticsEvent {

    /* renamed from: a */
    public final String f10177a;

    /* renamed from: b */
    public final Map<String, String> f10178b;

    public C11413i(String eventName, Map<String, String> eventData) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        this.f10177a = eventName;
        this.f10178b = eventData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11413i)) {
            return false;
        }
        C11413i c11413i = (C11413i) obj;
        return Intrinsics.areEqual(this.f10177a, c11413i.f10177a) && Intrinsics.areEqual(this.f10178b, c11413i.f10178b);
    }

    @Override // ru.rustore.sdk.analytics.event.AnalyticsEvent
    public final Map<String, String> getEventData() {
        return this.f10178b;
    }

    @Override // ru.rustore.sdk.analytics.event.AnalyticsEvent
    public final String getEventName() {
        return this.f10177a;
    }

    public final int hashCode() {
        return this.f10178b.hashCode() + (this.f10177a.hashCode() * 31);
    }

    public final String toString() {
        return "BillingAnalyticsEvent(eventName=" + this.f10177a + ", eventData=" + this.f10178b + ')';
    }
}
