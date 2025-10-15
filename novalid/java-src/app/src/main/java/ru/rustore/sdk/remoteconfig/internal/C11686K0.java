package ru.rustore.sdk.remoteconfig.internal;

import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.remoteconfig.RemoteConfig;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.K0 */
/* loaded from: classes5.dex */
public final class C11686K0 {

    /* renamed from: a */
    public final RemoteConfig f10829a;

    /* renamed from: b */
    public final String f10830b;

    public C11686K0(RemoteConfig config, String shortSegments) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(shortSegments, "shortSegments");
        this.f10829a = config;
        this.f10830b = shortSegments;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11686K0)) {
            return false;
        }
        C11686K0 c11686k0 = (C11686K0) obj;
        return Intrinsics.areEqual(this.f10829a, c11686k0.f10829a) && Intrinsics.areEqual(this.f10830b, c11686k0.f10830b);
    }

    public final int hashCode() {
        return this.f10830b.hashCode() + (this.f10829a.hashCode() * 31);
    }

    public final String toString() {
        return "SnapshotConfig(config=" + this.f10829a + ", shortSegments=" + ((Object) C11680H0.m7513a(this.f10830b)) + ')';
    }
}
