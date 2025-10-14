package ru.rustore.sdk.metrics.internal;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ru.rustore.sdk.metrics.internal.y */
/* loaded from: classes8.dex */
public final class C11643y {

    /* renamed from: a */
    public final String f10715a;

    /* renamed from: b */
    public final String f10716b;

    /* renamed from: c */
    public final Map<String, String> f10717c;

    /* renamed from: d */
    public final long f10718d;

    public C11643y() {
        throw null;
    }

    public C11643y(String uuid, String eventName, Map eventData, long j) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        this.f10715a = uuid;
        this.f10716b = eventName;
        this.f10717c = eventData;
        this.f10718d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11643y)) {
            return false;
        }
        C11643y c11643y = (C11643y) obj;
        return Intrinsics.areEqual(this.f10715a, c11643y.f10715a) && Intrinsics.areEqual(this.f10716b, c11643y.f10716b) && Intrinsics.areEqual(this.f10717c, c11643y.f10717c) && this.f10718d == c11643y.f10718d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f10718d) + ((this.f10717c.hashCode() + ((this.f10716b.hashCode() + (this.f10715a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MigrationDtoVer2(uuid=");
        sb.append((Object) ("MetricsEventUuid(value=" + this.f10715a + ')'));
        sb.append(", eventName=");
        sb.append(this.f10716b);
        sb.append(", eventData=");
        sb.append(this.f10717c);
        sb.append(", eventTimeStamp=");
        sb.append(this.f10718d);
        sb.append(')');
        return sb.toString();
    }
}
