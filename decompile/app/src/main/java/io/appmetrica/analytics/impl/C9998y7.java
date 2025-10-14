package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.y7 */
/* loaded from: classes8.dex */
public final class C9998y7 {

    /* renamed from: a */
    public final long f9351a;

    /* renamed from: b */
    public final int f9352b;

    public C9998y7(int i, long j) {
        this.f9351a = j;
        this.f9352b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9998y7)) {
            return false;
        }
        C9998y7 c9998y7 = (C9998y7) obj;
        return this.f9351a == c9998y7.f9351a && this.f9352b == c9998y7.f9352b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9352b) + (Long.hashCode(this.f9351a) * 31);
    }

    public final String toString() {
        return "DecimalProtoModel(mantissa=" + this.f9351a + ", exponent=" + this.f9352b + ')';
    }
}
