package ru.rustore.sdk.metrics.internal;

import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.metrics.MetricsEvent;

/* renamed from: ru.rustore.sdk.metrics.internal.P */
/* loaded from: classes7.dex */
public final class C11598P {

    /* renamed from: a */
    public final String f10639a;

    /* renamed from: b */
    public final String f10640b;

    /* renamed from: c */
    public final String f10641c;

    /* renamed from: d */
    public final String f10642d;

    /* renamed from: e */
    public final MetricsEvent f10643e;

    public C11598P(String packageName, String uuid, String userId, String str, MetricsEvent metricsEvent) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(metricsEvent, "metricsEvent");
        this.f10639a = packageName;
        this.f10640b = uuid;
        this.f10641c = userId;
        this.f10642d = str;
        this.f10643e = metricsEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean zAreEqual;
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C11598P.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type ru.rustore.sdk.metrics.internal.data.dto.RemoteMetricsEventDto");
        C11598P c11598p = (C11598P) obj;
        if (!Intrinsics.areEqual(this.f10639a, c11598p.f10639a) || !Intrinsics.areEqual(this.f10640b, c11598p.f10640b) || !Intrinsics.areEqual(this.f10641c, c11598p.f10641c)) {
            return false;
        }
        String str = this.f10642d;
        String str2 = c11598p.f10642d;
        if (str == null) {
            zAreEqual = str2 == null;
        } else if (str2 != null) {
            zAreEqual = Intrinsics.areEqual(str, str2);
        }
        return zAreEqual && Intrinsics.areEqual(this.f10643e, c11598p.f10643e);
    }

    public final int hashCode() {
        int iHashCode = (this.f10641c.hashCode() + ((this.f10640b.hashCode() + (this.f10639a.hashCode() * 31)) * 31)) * 31;
        String str = this.f10642d;
        C11615d0 c11615d0 = str != null ? new C11615d0(str) : null;
        return this.f10643e.hashCode() + ((iHashCode + (c11615d0 != null ? c11615d0.f10671a.hashCode() : 0)) * 31);
    }
}
