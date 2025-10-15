package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.A4 */
/* loaded from: classes6.dex */
public final class C8765A4 {

    /* renamed from: a */
    public final boolean f6311a;

    /* renamed from: b */
    public final boolean f6312b;

    /* renamed from: c */
    public final boolean f6313c;

    /* renamed from: d */
    public final boolean f6314d;

    /* renamed from: e */
    public final boolean f6315e;

    /* renamed from: f */
    public final Boolean f6316f;

    public C8765A4(C9995y4 c9995y4) {
        this.f6311a = c9995y4.f9340a;
        this.f6312b = c9995y4.f9341b;
        this.f6313c = c9995y4.f9342c;
        this.f6314d = c9995y4.f9343d;
        this.f6315e = c9995y4.f9344e;
        this.f6316f = c9995y4.f9345f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8765A4.class != obj.getClass()) {
            return false;
        }
        C8765A4 c8765a4 = (C8765A4) obj;
        if (this.f6311a != c8765a4.f6311a || this.f6312b != c8765a4.f6312b || this.f6313c != c8765a4.f6313c || this.f6314d != c8765a4.f6314d || this.f6315e != c8765a4.f6315e) {
            return false;
        }
        Boolean bool = this.f6316f;
        Boolean bool2 = c8765a4.f6316f;
        return bool != null ? bool.equals(bool2) : bool2 == null;
    }

    public final int hashCode() {
        int i = (((((((((this.f6311a ? 1 : 0) * 31) + (this.f6312b ? 1 : 0)) * 31) + (this.f6313c ? 1 : 0)) * 31) + (this.f6314d ? 1 : 0)) * 31) + (this.f6315e ? 1 : 0)) * 31;
        Boolean bool = this.f6316f;
        return i + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "CollectingFlags{permissionsCollectingEnabled=" + this.f6311a + ", featuresCollectingEnabled=" + this.f6312b + ", googleAid=" + this.f6313c + ", simInfo=" + this.f6314d + ", huaweiOaid=" + this.f6315e + ", sslPinning=" + this.f6316f + '}';
    }
}
