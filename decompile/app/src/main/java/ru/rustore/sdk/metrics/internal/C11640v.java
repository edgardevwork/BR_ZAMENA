package ru.rustore.sdk.metrics.internal;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ru.rustore.sdk.metrics.internal.v */
/* loaded from: classes8.dex */
public final class C11640v {

    /* renamed from: a */
    public final String f10712a;

    /* renamed from: b */
    public final String f10713b;

    /* renamed from: c */
    public final Map<String, String> f10714c;

    public C11640v() {
        throw null;
    }

    public C11640v(String uuid, String eventName, Map eventData) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        this.f10712a = uuid;
        this.f10713b = eventName;
        this.f10714c = eventData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11640v)) {
            return false;
        }
        C11640v c11640v = (C11640v) obj;
        return Intrinsics.areEqual(this.f10712a, c11640v.f10712a) && Intrinsics.areEqual(this.f10713b, c11640v.f10713b) && Intrinsics.areEqual(this.f10714c, c11640v.f10714c);
    }

    public final int hashCode() {
        return this.f10714c.hashCode() + ((this.f10713b.hashCode() + (this.f10712a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MigrationDtoVer1(uuid=");
        sb.append((Object) ("MetricsEventUuid(value=" + this.f10712a + ')'));
        sb.append(", eventName=");
        sb.append(this.f10713b);
        sb.append(", eventData=");
        sb.append(this.f10714c);
        sb.append(')');
        return sb.toString();
    }
}
