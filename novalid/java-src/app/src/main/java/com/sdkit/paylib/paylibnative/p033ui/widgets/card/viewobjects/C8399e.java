package com.sdkit.paylib.paylibnative.p033ui.widgets.card.viewobjects;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.card.viewobjects.e */
/* loaded from: classes6.dex */
public final class C8399e {

    /* renamed from: a */
    public final boolean f3818a;

    /* renamed from: b */
    public final boolean f3819b;

    /* renamed from: c */
    public final Integer f3820c;

    /* renamed from: d */
    public final boolean f3821d;

    /* renamed from: e */
    public final String f3822e;

    /* renamed from: f */
    public final Boolean f3823f;

    public C8399e(boolean z, boolean z2, Integer num, boolean z3, String str, Boolean bool) {
        this.f3818a = z;
        this.f3819b = z2;
        this.f3820c = num;
        this.f3821d = z3;
        this.f3822e = str;
        this.f3823f = bool;
    }

    /* renamed from: a */
    public static /* synthetic */ C8399e m3588a(C8399e c8399e, boolean z, boolean z2, Integer num, boolean z3, String str, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            z = c8399e.f3818a;
        }
        if ((i & 2) != 0) {
            z2 = c8399e.f3819b;
        }
        boolean z4 = z2;
        if ((i & 4) != 0) {
            num = c8399e.f3820c;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            z3 = c8399e.f3821d;
        }
        boolean z5 = z3;
        if ((i & 16) != 0) {
            str = c8399e.f3822e;
        }
        String str2 = str;
        if ((i & 32) != 0) {
            bool = c8399e.f3823f;
        }
        return c8399e.m3589a(z, z4, num2, z5, str2, bool);
    }

    /* renamed from: b */
    public final Integer m3591b() {
        return this.f3820c;
    }

    /* renamed from: c */
    public final boolean m3592c() {
        return this.f3821d;
    }

    /* renamed from: d */
    public final boolean m3593d() {
        return this.f3818a;
    }

    /* renamed from: e */
    public final Boolean m3594e() {
        return this.f3823f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8399e)) {
            return false;
        }
        C8399e c8399e = (C8399e) obj;
        return this.f3818a == c8399e.f3818a && this.f3819b == c8399e.f3819b && Intrinsics.areEqual(this.f3820c, c8399e.f3820c) && this.f3821d == c8399e.f3821d && Intrinsics.areEqual(this.f3822e, c8399e.f3822e) && Intrinsics.areEqual(this.f3823f, c8399e.f3823f);
    }

    /* renamed from: f */
    public final boolean m3595f() {
        return this.f3819b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    public int hashCode() {
        boolean z = this.f3818a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.f3819b;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        Integer num = this.f3820c;
        int iHashCode = (i3 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z2 = this.f3821d;
        int i4 = (iHashCode + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        String str = this.f3822e;
        int iHashCode2 = (i4 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f3823f;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "LoyaltyStateVO(isLoading=" + this.f3818a + ", isUnavailable=" + this.f3819b + ", loyaltyUnavailableTextRes=" + this.f3820c + ", isInfoAvailable=" + this.f3821d + ", loyaltyInfoText=" + this.f3822e + ", isLoyaltyChecked=" + this.f3823f + ')';
    }

    public /* synthetic */ C8399e(boolean z, boolean z2, Integer num, boolean z3, String str, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : num, (i & 8) == 0 ? z3 : false, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : bool);
    }

    /* renamed from: a */
    public final C8399e m3589a(boolean z, boolean z2, Integer num, boolean z3, String str, Boolean bool) {
        return new C8399e(z, z2, num, z3, str, bool);
    }

    /* renamed from: a */
    public final String m3590a() {
        return this.f3822e;
    }
}
