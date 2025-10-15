package com.sdkit.paylib.paylibnative.p033ui.core.purchase.entity;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.core.purchase.entity.c */
/* loaded from: classes5.dex */
public final class C8160c implements InterfaceC8159b {

    /* renamed from: a */
    public final String f2052a;

    /* renamed from: b */
    public final String f2053b;

    /* renamed from: c */
    public final Integer f2054c;

    /* renamed from: d */
    public final String f2055d;

    public C8160c(String productId, String str, Integer num, String str2) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        this.f2052a = productId;
        this.f2053b = str;
        this.f2054c = num;
        this.f2055d = str2;
    }

    /* renamed from: a */
    public final String m2078a() {
        return this.f2055d;
    }

    /* renamed from: b */
    public final String m2079b() {
        return this.f2053b;
    }

    /* renamed from: c */
    public final String m2080c() {
        return this.f2052a;
    }

    /* renamed from: d */
    public final Integer m2081d() {
        return this.f2054c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8160c)) {
            return false;
        }
        C8160c c8160c = (C8160c) obj;
        return Intrinsics.areEqual(this.f2052a, c8160c.f2052a) && Intrinsics.areEqual(this.f2053b, c8160c.f2053b) && Intrinsics.areEqual(this.f2054c, c8160c.f2054c) && Intrinsics.areEqual(this.f2055d, c8160c.f2055d);
    }

    public int hashCode() {
        int iHashCode = this.f2052a.hashCode() * 31;
        String str = this.f2053b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f2054c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f2055d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GmarktProductPayload(productId=");
        sb.append(this.f2052a);
        sb.append(", orderId=");
        sb.append(this.f2053b);
        sb.append(", quantity=");
        sb.append(this.f2054c);
        sb.append(", developerPayload=");
        return C8032c.m1430a(sb, this.f2055d, ')');
    }
}
