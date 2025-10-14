package ru.rustore.sdk.remoteconfig.internal;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.e0 */
/* loaded from: classes5.dex */
public final class C11733e0 {

    /* renamed from: a */
    public final long f10917a;

    /* renamed from: b */
    public final Map<String, String> f10918b;

    /* renamed from: c */
    public final C11759r f10919c;

    /* renamed from: d */
    public final String f10920d;

    public C11733e0() {
        throw null;
    }

    public C11733e0(long j, Map data, C11759r configMetadata, String shortSegments) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(configMetadata, "configMetadata");
        Intrinsics.checkNotNullParameter(shortSegments, "shortSegments");
        this.f10917a = j;
        this.f10918b = data;
        this.f10919c = configMetadata;
        this.f10920d = shortSegments;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11733e0)) {
            return false;
        }
        C11733e0 c11733e0 = (C11733e0) obj;
        return this.f10917a == c11733e0.f10917a && Intrinsics.areEqual(this.f10918b, c11733e0.f10918b) && Intrinsics.areEqual(this.f10919c, c11733e0.f10919c) && Intrinsics.areEqual(this.f10920d, c11733e0.f10920d);
    }

    public final int hashCode() {
        return this.f10920d.hashCode() + ((this.f10919c.hashCode() + ((this.f10918b.hashCode() + (C11761s.m7551a(this.f10917a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistableConfig(updateTime=");
        sb.append((Object) ("ConfigUpdateTime(unixTimeStamp=" + this.f10917a + ')'));
        sb.append(", data=");
        sb.append(this.f10918b);
        sb.append(", configMetadata=");
        sb.append(this.f10919c);
        sb.append(", shortSegments=");
        sb.append((Object) C11680H0.m7513a(this.f10920d));
        sb.append(')');
        return sb.toString();
    }
}
