package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.impl.A0 */
/* loaded from: classes6.dex */
public final class C8761A0 {

    /* renamed from: a */
    public final String f6298a;

    /* renamed from: b */
    public final String f6299b;

    /* renamed from: c */
    public final CounterConfigurationReporterType f6300c;

    /* renamed from: d */
    public final int f6301d;

    /* renamed from: e */
    public final String f6302e;

    /* renamed from: f */
    public final String f6303f;

    public C8761A0(String str, String str2, CounterConfigurationReporterType counterConfigurationReporterType, int i, String str3, String str4) {
        this.f6298a = str;
        this.f6299b = str2;
        this.f6300c = counterConfigurationReporterType;
        this.f6301d = i;
        this.f6302e = str3;
        this.f6303f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8761A0)) {
            return false;
        }
        C8761A0 c8761a0 = (C8761A0) obj;
        return Intrinsics.areEqual(this.f6298a, c8761a0.f6298a) && Intrinsics.areEqual(this.f6299b, c8761a0.f6299b) && this.f6300c == c8761a0.f6300c && this.f6301d == c8761a0.f6301d && Intrinsics.areEqual(this.f6302e, c8761a0.f6302e) && Intrinsics.areEqual(this.f6303f, c8761a0.f6303f);
    }

    public final int hashCode() {
        int iHashCode = (this.f6302e.hashCode() + ((Integer.hashCode(this.f6301d) + ((this.f6300c.hashCode() + ((this.f6299b.hashCode() + (this.f6298a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.f6303f;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "AppMetricaNativeCrashMetadata(apiKey=" + this.f6298a + ", packageName=" + this.f6299b + ", reporterType=" + this.f6300c + ", processID=" + this.f6301d + ", processSessionID=" + this.f6302e + ", errorEnvironment=" + this.f6303f + ')';
    }
}
