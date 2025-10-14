package ru.rustore.sdk.remoteconfig.internal;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.c */
/* loaded from: classes5.dex */
public final class C11722c {

    /* renamed from: a */
    public final Map<String, String> f10890a;

    /* renamed from: b */
    public final C11759r f10891b;

    /* renamed from: c */
    public final String f10892c;

    public C11722c() {
        throw null;
    }

    public C11722c(Map data, C11759r configMetadata, String shortSegments) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(configMetadata, "configMetadata");
        Intrinsics.checkNotNullParameter(shortSegments, "shortSegments");
        this.f10890a = data;
        this.f10891b = configMetadata;
        this.f10892c = shortSegments;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11722c)) {
            return false;
        }
        C11722c c11722c = (C11722c) obj;
        return Intrinsics.areEqual(this.f10890a, c11722c.f10890a) && Intrinsics.areEqual(this.f10891b, c11722c.f10891b) && Intrinsics.areEqual(this.f10892c, c11722c.f10892c);
    }

    public final int hashCode() {
        return this.f10892c.hashCode() + ((this.f10891b.hashCode() + (this.f10890a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ActualConfigDto(data=" + this.f10890a + ", configMetadata=" + this.f10891b + ", shortSegments=" + ((Object) C11680H0.m7513a(this.f10892c)) + ')';
    }
}
