package ru.rustore.sdk.review;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ru.rustore.sdk.review.g */
/* loaded from: classes5.dex */
public final class C11788g {

    /* renamed from: a */
    public final String f11019a;

    /* renamed from: b */
    public final Map<String, String> f11020b;

    public C11788g(Map eventData) {
        Intrinsics.checkNotNullParameter("sdkInfo", "eventName");
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        this.f11019a = "sdkInfo";
        this.f11020b = eventData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11788g)) {
            return false;
        }
        C11788g c11788g = (C11788g) obj;
        return Intrinsics.areEqual(this.f11019a, c11788g.f11019a) && Intrinsics.areEqual(this.f11020b, c11788g.f11020b);
    }

    public final int hashCode() {
        return this.f11020b.hashCode() + (this.f11019a.hashCode() * 31);
    }

    public final String toString() {
        return "ReviewAnalyticsEvent(eventName=" + this.f11019a + ", eventData=" + this.f11020b + ')';
    }
}
