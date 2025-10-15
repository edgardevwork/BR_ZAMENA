package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.f4 */
/* loaded from: classes6.dex */
public final class C9520f4 {

    /* renamed from: a */
    public final String f8052a;

    /* renamed from: b */
    public final String f8053b;

    /* renamed from: c */
    public final Integer f8054c;

    /* renamed from: d */
    public final String f8055d;

    /* renamed from: e */
    public final CounterConfigurationReporterType f8056e;

    public C9520f4(String str, String str2, Integer num, String str3, CounterConfigurationReporterType counterConfigurationReporterType) {
        this.f8052a = str;
        this.f8053b = str2;
        this.f8054c = num;
        this.f8055d = str3;
        this.f8056e = counterConfigurationReporterType;
    }

    /* renamed from: a */
    public static C9520f4 m6080a(C9370Z3 c9370z3) {
        return new C9520f4(c9370z3.f7617b.getApiKey(), c9370z3.f7616a.f7251a.getAsString("PROCESS_CFG_PACKAGE_NAME"), c9370z3.f7616a.f7251a.getAsInteger("PROCESS_CFG_PROCESS_ID"), c9370z3.f7616a.f7251a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID"), c9370z3.f7617b.getReporterType());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9520f4.class != obj.getClass()) {
            return false;
        }
        C9520f4 c9520f4 = (C9520f4) obj;
        String str = this.f8052a;
        if (str == null ? c9520f4.f8052a != null : !str.equals(c9520f4.f8052a)) {
            return false;
        }
        if (!this.f8053b.equals(c9520f4.f8053b)) {
            return false;
        }
        Integer num = this.f8054c;
        if (num == null ? c9520f4.f8054c != null : !num.equals(c9520f4.f8054c)) {
            return false;
        }
        String str2 = this.f8055d;
        if (str2 == null ? c9520f4.f8055d == null : str2.equals(c9520f4.f8055d)) {
            return this.f8056e == c9520f4.f8056e;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f8052a;
        int iHashCode = (this.f8053b.hashCode() + ((str != null ? str.hashCode() : 0) * 31)) * 31;
        Integer num = this.f8054c;
        int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.f8055d;
        return this.f8056e.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ClientDescription{mApiKey='" + this.f8052a + "', mPackageName='" + this.f8053b + "', mProcessID=" + this.f8054c + ", mProcessSessionID='" + this.f8055d + "', mReporterType=" + this.f8056e + '}';
    }
}
