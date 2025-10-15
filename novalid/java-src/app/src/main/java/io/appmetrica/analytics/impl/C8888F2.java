package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.F2 */
/* loaded from: classes6.dex */
public final class C8888F2 {

    /* renamed from: a */
    public final EnumC8863E2 f6567a;

    /* renamed from: b */
    public final Boolean f6568b;

    public C8888F2(EnumC8863E2 enumC8863E2, Boolean bool) {
        this.f6567a = enumC8863E2;
        this.f6568b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8888F2.class != obj.getClass()) {
            return false;
        }
        C8888F2 c8888f2 = (C8888F2) obj;
        if (this.f6567a != c8888f2.f6567a) {
            return false;
        }
        Boolean bool = this.f6568b;
        return bool != null ? bool.equals(c8888f2.f6568b) : c8888f2.f6568b == null;
    }

    public final int hashCode() {
        EnumC8863E2 enumC8863E2 = this.f6567a;
        int iHashCode = (enumC8863E2 != null ? enumC8863E2.hashCode() : 0) * 31;
        Boolean bool = this.f6568b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }
}
