package ru.rustore.sdk.remoteconfig.internal;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.W */
/* loaded from: classes5.dex */
public final class C11708W {

    /* renamed from: a */
    public final Map<String, String> f10865a;

    /* renamed from: b */
    public final C11759r f10866b;

    /* renamed from: c */
    public final String f10867c;

    public C11708W() {
        throw null;
    }

    public C11708W(Map data, C11759r configMetadata, String shortSegments) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(configMetadata, "configMetadata");
        Intrinsics.checkNotNullParameter(shortSegments, "shortSegments");
        this.f10865a = data;
        this.f10866b = configMetadata;
        this.f10867c = shortSegments;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11708W)) {
            return false;
        }
        C11708W c11708w = (C11708W) obj;
        return Intrinsics.areEqual(this.f10865a, c11708w.f10865a) && Intrinsics.areEqual(this.f10866b, c11708w.f10866b) && Intrinsics.areEqual(this.f10867c, c11708w.f10867c);
    }

    public final int hashCode() {
        return this.f10867c.hashCode() + ((this.f10866b.hashCode() + (this.f10865a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "NetworkConfigDto(data=" + this.f10865a + ", configMetadata=" + this.f10866b + ", shortSegments=" + ((Object) C11680H0.m7513a(this.f10867c)) + ')';
    }
}
