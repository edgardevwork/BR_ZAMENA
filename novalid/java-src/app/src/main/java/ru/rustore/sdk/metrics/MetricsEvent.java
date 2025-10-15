package ru.rustore.sdk.metrics;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m7104d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006B+\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, m7105d2 = {"Lru/rustore/sdk/metrics/MetricsEvent;", "", "eventName", "", "eventData", "", "(Ljava/lang/String;Ljava/util/Map;)V", "eventTime", "", "(Ljava/lang/String;Ljava/util/Map;J)V", "getEventData", "()Ljava/util/Map;", "getEventName", "()Ljava/lang/String;", "getEventTime$sdk_public_metrics_release", "()J", "equals", "", "other", "hashCode", "", "sdk-public-metrics_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class MetricsEvent {
    public final Map<String, String> eventData;
    public final String eventName;
    public final long eventTime;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MetricsEvent(String eventName, Map<String, String> eventData) {
        this(eventName, eventData, System.currentTimeMillis());
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(eventData, "eventData");
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MetricsEvent)) {
            return false;
        }
        MetricsEvent metricsEvent = (MetricsEvent) other;
        return Intrinsics.areEqual(this.eventName, metricsEvent.eventName) && Intrinsics.areEqual(this.eventData, metricsEvent.eventData);
    }

    public final Map<String, String> getEventData() {
        return this.eventData;
    }

    public final String getEventName() {
        return this.eventName;
    }

    /* renamed from: getEventTime$sdk_public_metrics_release, reason: from getter */
    public final long getEventTime() {
        return this.eventTime;
    }

    public int hashCode() {
        return this.eventData.hashCode() + (this.eventName.hashCode() * 31);
    }

    public MetricsEvent(String eventName, Map<String, String> eventData, long j) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        this.eventName = eventName;
        this.eventData = eventData;
        this.eventTime = j;
    }
}
