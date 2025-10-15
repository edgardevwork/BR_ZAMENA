package ru.rustore.sdk.remoteconfig.internal;

import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.remoteconfig.RemoteConfig;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.u */
/* loaded from: classes5.dex */
public final class C11765u {

    /* renamed from: a */
    public final RemoteConfig f10977a;

    /* renamed from: b */
    public final String f10978b;

    public C11765u(RemoteConfig config, String shortSegments) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(shortSegments, "shortSegments");
        this.f10977a = config;
        this.f10978b = shortSegments;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11765u)) {
            return false;
        }
        C11765u c11765u = (C11765u) obj;
        return Intrinsics.areEqual(this.f10977a, c11765u.f10977a) && Intrinsics.areEqual(this.f10978b, c11765u.f10978b);
    }

    public final int hashCode() {
        return this.f10978b.hashCode() + (this.f10977a.hashCode() * 31);
    }

    public final String toString() {
        return "DefaultConfig(config=" + this.f10977a + ", shortSegments=" + ((Object) C11680H0.m7513a(this.f10978b)) + ')';
    }
}
