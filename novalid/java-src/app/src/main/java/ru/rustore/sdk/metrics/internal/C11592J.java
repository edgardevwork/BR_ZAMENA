package ru.rustore.sdk.metrics.internal;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ru.rustore.sdk.metrics.internal.J */
/* loaded from: classes7.dex */
public final class C11592J {

    /* renamed from: a */
    public final String f10628a;

    /* renamed from: b */
    public final byte[] f10629b;

    public C11592J(String uuid, byte[] serializedMetricsEvent) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(serializedMetricsEvent, "serializedMetricsEvent");
        this.f10628a = uuid;
        this.f10629b = serializedMetricsEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C11592J.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type ru.rustore.sdk.metrics.internal.data.dto.PersistentMetricsEventDto");
        C11592J c11592j = (C11592J) obj;
        return Intrinsics.areEqual(this.f10628a, c11592j.f10628a) && Arrays.equals(this.f10629b, c11592j.f10629b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f10629b) + (this.f10628a.hashCode() * 31);
    }
}
