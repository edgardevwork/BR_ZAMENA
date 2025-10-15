package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.p4 */
/* loaded from: classes7.dex */
public final class C9770p4 {

    /* renamed from: a */
    public final String f8868a;

    /* renamed from: b */
    public final Integer f8869b;

    /* renamed from: c */
    public final String f8870c;

    public C9770p4(String str, Integer num, String str2) {
        this.f8868a = str;
        this.f8869b = num;
        this.f8870c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9770p4.class != obj.getClass()) {
            return false;
        }
        C9770p4 c9770p4 = (C9770p4) obj;
        if (!this.f8868a.equals(c9770p4.f8868a)) {
            return false;
        }
        Integer num = this.f8869b;
        if (num == null ? c9770p4.f8869b != null : !num.equals(c9770p4.f8869b)) {
            return false;
        }
        String str = this.f8870c;
        String str2 = c9770p4.f8870c;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public final int hashCode() {
        int iHashCode = this.f8868a.hashCode() * 31;
        Integer num = this.f8869b;
        int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str = this.f8870c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
