package ru.rustore.sdk.remoteconfig.internal;

import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.remoteconfig.RemoteConfig;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.a */
/* loaded from: classes5.dex */
public final class C11716a {

    /* renamed from: a */
    public final RemoteConfig f10883a;

    /* renamed from: b */
    public final String f10884b;

    public C11716a(RemoteConfig config, String shortSegments) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(shortSegments, "shortSegments");
        this.f10883a = config;
        this.f10884b = shortSegments;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11716a)) {
            return false;
        }
        C11716a c11716a = (C11716a) obj;
        return Intrinsics.areEqual(this.f10883a, c11716a.f10883a) && Intrinsics.areEqual(this.f10884b, c11716a.f10884b);
    }

    public final int hashCode() {
        return this.f10884b.hashCode() + (this.f10883a.hashCode() * 31);
    }

    public final String toString() {
        return "ActualConfig(config=" + this.f10883a + ", shortSegments=" + ((Object) C11680H0.m7513a(this.f10884b)) + ')';
    }
}
