package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.Ll */
/* loaded from: classes8.dex */
public final class C9053Ll {

    /* renamed from: a */
    public final long f6953a;

    public C9053Ll(long j) {
        this.f6953a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C9053Ll.class == obj.getClass() && this.f6953a == ((C9053Ll) obj).f6953a;
    }

    public final int hashCode() {
        long j = this.f6953a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "StatSending{disabledReportingInterval=" + this.f6953a + '}';
    }
}
