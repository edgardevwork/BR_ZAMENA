package io.appmetrica.analytics.location.impl;

import io.appmetrica.analytics.locationapi.internal.CacheArguments;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.location.impl.i */
/* loaded from: classes8.dex */
public final class C10052i {

    /* renamed from: a */
    public final LocationFilter f9436a;

    /* renamed from: b */
    public final CacheArguments f9437b;

    public C10052i(LocationFilter locationFilter, CacheArguments cacheArguments) {
        this.f9436a = locationFilter;
        this.f9437b = cacheArguments;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C10052i.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.location.impl.LocationConfig");
        }
        C10052i c10052i = (C10052i) obj;
        return Intrinsics.areEqual(this.f9436a, c10052i.f9436a) && Intrinsics.areEqual(this.f9437b, c10052i.f9437b);
    }

    public final int hashCode() {
        return this.f9437b.hashCode() + (this.f9436a.hashCode() * 31);
    }

    public final String toString() {
        return "LocationConfig(locationFilter=" + this.f9436a + ", cacheArguments=" + this.f9437b + ')';
    }

    public /* synthetic */ C10052i() {
        this(new LocationFilter(0L, 0.0f, 3, null), new CacheArguments(0L, 0L, 3, null));
    }
}
