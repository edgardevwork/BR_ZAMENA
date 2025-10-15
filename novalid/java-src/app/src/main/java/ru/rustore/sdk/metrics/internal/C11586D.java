package ru.rustore.sdk.metrics.internal;

import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.metrics.MetricsEvent;

/* renamed from: ru.rustore.sdk.metrics.internal.D */
/* loaded from: classes7.dex */
public final class C11586D {

    /* renamed from: a */
    public final String f10616a;

    /* renamed from: b */
    public final MetricsEvent f10617b;

    public C11586D(String uuid, MetricsEvent metricsEvent) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(metricsEvent, "metricsEvent");
        this.f10616a = uuid;
        this.f10617b = metricsEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C11586D.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type ru.rustore.sdk.metrics.internal.domain.model.PersistentMetricsEvent");
        C11586D c11586d = (C11586D) obj;
        return Intrinsics.areEqual(this.f10616a, c11586d.f10616a) && Intrinsics.areEqual(this.f10617b, c11586d.f10617b);
    }

    public final int hashCode() {
        return this.f10617b.hashCode() + (this.f10616a.hashCode() * 31);
    }
}
