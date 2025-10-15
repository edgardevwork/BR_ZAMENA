package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.Hl */
/* loaded from: classes8.dex */
public final class C8957Hl {

    /* renamed from: a */
    public final int f6734a;

    public C8957Hl(int i) {
        this.f6734a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8957Hl) && this.f6734a == ((C8957Hl) obj).f6734a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6734a);
    }

    public final String toString() {
        return "StartupUpdateConfig(intervalSeconds=" + this.f6734a + ')';
    }
}
