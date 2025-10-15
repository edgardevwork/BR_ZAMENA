package ru.rustore.sdk.remoteconfig.internal;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.g0 */
/* loaded from: classes5.dex */
public final class C11738g0 {

    /* renamed from: a */
    public final long f10927a;

    /* renamed from: b */
    public final Map<String, String> f10928b;

    /* renamed from: c */
    public final C11759r f10929c;

    /* renamed from: d */
    public final String f10930d;

    public C11738g0() {
        throw null;
    }

    public C11738g0(long j, Map data, C11759r configMetadata, String shortSegments) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(configMetadata, "configMetadata");
        Intrinsics.checkNotNullParameter(shortSegments, "shortSegments");
        this.f10927a = j;
        this.f10928b = data;
        this.f10929c = configMetadata;
        this.f10930d = shortSegments;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11738g0)) {
            return false;
        }
        C11738g0 c11738g0 = (C11738g0) obj;
        return this.f10927a == c11738g0.f10927a && Intrinsics.areEqual(this.f10928b, c11738g0.f10928b) && Intrinsics.areEqual(this.f10929c, c11738g0.f10929c) && Intrinsics.areEqual(this.f10930d, c11738g0.f10930d);
    }

    public final int hashCode() {
        return this.f10930d.hashCode() + ((this.f10929c.hashCode() + ((this.f10928b.hashCode() + (Long.hashCode(this.f10927a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PersistableConfigDto(updateTimeStamp=" + this.f10927a + ", data=" + this.f10928b + ", configMetadata=" + this.f10929c + ", shortSegments=" + ((Object) C11680H0.m7513a(this.f10930d)) + ')';
    }
}
