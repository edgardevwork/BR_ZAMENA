package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.z9 */
/* loaded from: classes8.dex */
public final class C10025z9 {

    /* renamed from: a */
    public final long f9398a;

    public C10025z9(long j) {
        this.f9398a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10025z9) && this.f9398a == ((C10025z9) obj).f9398a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f9398a);
    }

    public final String toString() {
        return "ExternalAttributionConfig(collectingInterval=" + this.f9398a + ')';
    }
}
