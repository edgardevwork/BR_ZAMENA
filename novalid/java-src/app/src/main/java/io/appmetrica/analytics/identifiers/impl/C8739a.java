package io.appmetrica.analytics.identifiers.impl;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.identifiers.impl.a */
/* loaded from: classes6.dex */
public final class C8739a {

    /* renamed from: a */
    public final String f6274a;

    /* renamed from: b */
    public final String f6275b;

    /* renamed from: c */
    public final Boolean f6276c;

    public C8739a(String str, String str2, Boolean bool) {
        this.f6274a = str;
        this.f6275b = str2;
        this.f6276c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8739a)) {
            return false;
        }
        C8739a c8739a = (C8739a) obj;
        return Intrinsics.areEqual(this.f6274a, c8739a.f6274a) && Intrinsics.areEqual(this.f6275b, c8739a.f6275b) && Intrinsics.areEqual(this.f6276c, c8739a.f6276c);
    }

    public final int hashCode() {
        int iHashCode = this.f6274a.hashCode() * 31;
        String str = this.f6275b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f6276c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "AdvIdInfo(provider=" + this.f6274a + ", advId=" + this.f6275b + ", limitedAdTracking=" + this.f6276c + ')';
    }
}
