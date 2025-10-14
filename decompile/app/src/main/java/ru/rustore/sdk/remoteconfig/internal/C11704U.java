package ru.rustore.sdk.remoteconfig.internal;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.U */
/* loaded from: classes5.dex */
public final class C11704U {

    /* renamed from: a */
    public final Map<String, String> f10858a;

    /* renamed from: b */
    public final C11759r f10859b;

    /* renamed from: c */
    public final String f10860c;

    public C11704U() {
        throw null;
    }

    public C11704U(Map data, C11759r configMetadata, String shortSegments) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(configMetadata, "configMetadata");
        Intrinsics.checkNotNullParameter(shortSegments, "shortSegments");
        this.f10858a = data;
        this.f10859b = configMetadata;
        this.f10860c = shortSegments;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11704U)) {
            return false;
        }
        C11704U c11704u = (C11704U) obj;
        return Intrinsics.areEqual(this.f10858a, c11704u.f10858a) && Intrinsics.areEqual(this.f10859b, c11704u.f10859b) && Intrinsics.areEqual(this.f10860c, c11704u.f10860c);
    }

    public final int hashCode() {
        return this.f10860c.hashCode() + ((this.f10859b.hashCode() + (this.f10858a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "NetworkConfig(data=" + this.f10858a + ", configMetadata=" + this.f10859b + ", shortSegments=" + ((Object) C11680H0.m7513a(this.f10860c)) + ')';
    }
}
