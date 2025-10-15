package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.v3 */
/* loaded from: classes7.dex */
public final class C9919v3 {

    /* renamed from: a */
    public final long f9210a;

    public C9919v3(long j) {
        this.f9210a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C9919v3.class == obj.getClass() && this.f9210a == ((C9919v3) obj).f9210a;
    }

    public final int hashCode() {
        long j = this.f9210a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "CacheControl{lastKnownLocationTtl=" + this.f9210a + '}';
    }
}
