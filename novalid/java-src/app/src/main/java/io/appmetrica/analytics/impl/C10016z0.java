package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.impl.z0 */
/* loaded from: classes8.dex */
public final class C10016z0 {

    /* renamed from: a */
    public final NativeCrashSource f9374a;

    /* renamed from: b */
    public final String f9375b;

    /* renamed from: c */
    public final String f9376c;

    /* renamed from: d */
    public final String f9377d;

    /* renamed from: e */
    public final long f9378e;

    /* renamed from: f */
    public final C8761A0 f9379f;

    public C10016z0(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j, C8761A0 c8761a0) {
        this.f9374a = nativeCrashSource;
        this.f9375b = str;
        this.f9376c = str2;
        this.f9377d = str3;
        this.f9378e = j;
        this.f9379f = c8761a0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10016z0)) {
            return false;
        }
        C10016z0 c10016z0 = (C10016z0) obj;
        return this.f9374a == c10016z0.f9374a && Intrinsics.areEqual(this.f9375b, c10016z0.f9375b) && Intrinsics.areEqual(this.f9376c, c10016z0.f9376c) && Intrinsics.areEqual(this.f9377d, c10016z0.f9377d) && this.f9378e == c10016z0.f9378e && Intrinsics.areEqual(this.f9379f, c10016z0.f9379f);
    }

    public final int hashCode() {
        return this.f9379f.hashCode() + ((Long.hashCode(this.f9378e) + ((this.f9377d.hashCode() + ((this.f9376c.hashCode() + ((this.f9375b.hashCode() + (this.f9374a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AppMetricaNativeCrash(source=" + this.f9374a + ", handlerVersion=" + this.f9375b + ", uuid=" + this.f9376c + ", dumpFile=" + this.f9377d + ", creationTime=" + this.f9378e + ", metadata=" + this.f9379f + ')';
    }
}
