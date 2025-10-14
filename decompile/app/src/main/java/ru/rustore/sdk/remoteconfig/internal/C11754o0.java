package ru.rustore.sdk.remoteconfig.internal;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.o0 */
/* loaded from: classes5.dex */
public final class C11754o0 {

    /* renamed from: a */
    public final String f10965a;

    /* renamed from: b */
    public final Map<String, String> f10966b;

    public C11754o0(String eventName, Map<String, String> eventData) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        this.f10965a = eventName;
        this.f10966b = eventData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11754o0)) {
            return false;
        }
        C11754o0 c11754o0 = (C11754o0) obj;
        return Intrinsics.areEqual(this.f10965a, c11754o0.f10965a) && Intrinsics.areEqual(this.f10966b, c11754o0.f10966b);
    }

    public final int hashCode() {
        return this.f10966b.hashCode() + (this.f10965a.hashCode() * 31);
    }

    public final String toString() {
        return "RemoteConfigAnalyticsEvent(eventName=" + this.f10965a + ", eventData=" + this.f10966b + ')';
    }
}
