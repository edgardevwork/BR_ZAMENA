package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.cg */
/* loaded from: classes8.dex */
public final class C9457cg implements RemoteConfigMetaInfo {

    /* renamed from: a */
    public final long f7849a;

    /* renamed from: b */
    public final long f7850b;

    public C9457cg(long j, long j2) {
        this.f7849a = j;
        this.f7850b = j2;
    }

    @NotNull
    /* renamed from: a */
    public final C9457cg m5987a(long j, long j2) {
        return new C9457cg(j, j2);
    }

    /* renamed from: b */
    public final long m5988b() {
        return this.f7850b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9457cg)) {
            return false;
        }
        C9457cg c9457cg = (C9457cg) obj;
        return this.f7849a == c9457cg.f7849a && this.f7850b == c9457cg.f7850b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo
    public final long getFirstSendTime() {
        return this.f7849a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo
    public final long getLastUpdateTime() {
        return this.f7850b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f7850b) + (Long.hashCode(this.f7849a) * 31);
    }

    @NotNull
    public final String toString() {
        return "RemoteConfigMetaInfoModel(firstSendTime=" + this.f7849a + ", lastUpdateTime=" + this.f7850b + ')';
    }

    /* renamed from: a */
    public final long m5986a() {
        return this.f7849a;
    }

    /* renamed from: a */
    public static C9457cg m5985a(C9457cg c9457cg, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = c9457cg.f7849a;
        }
        if ((i & 2) != 0) {
            j2 = c9457cg.f7850b;
        }
        c9457cg.getClass();
        return new C9457cg(j, j2);
    }
}
