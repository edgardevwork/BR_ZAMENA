package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.d0 */
/* loaded from: classes6.dex */
public final class C9466d0 {

    /* renamed from: a */
    public final String f7885a;

    /* renamed from: b */
    public final long f7886b;

    public C9466d0(String str, long j) {
        this.f7885a = str;
        this.f7886b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9466d0.class != obj.getClass()) {
            return false;
        }
        C9466d0 c9466d0 = (C9466d0) obj;
        if (this.f7886b != c9466d0.f7886b) {
            return false;
        }
        String str = this.f7885a;
        String str2 = c9466d0.f7885a;
        if (str != null) {
            if (str.equals(str2)) {
                return true;
            }
        } else if (str2 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f7885a;
        int iHashCode = str != null ? str.hashCode() : 0;
        long j = this.f7886b;
        return (iHashCode * 31) + ((int) (j ^ (j >>> 32)));
    }
}
