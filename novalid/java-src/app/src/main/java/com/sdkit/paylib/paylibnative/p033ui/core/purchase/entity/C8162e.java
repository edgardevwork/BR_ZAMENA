package com.sdkit.paylib.paylibnative.p033ui.core.purchase.entity;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import com.sdkit.paylib.paylibpayment.api.network.entity.purchases.PurchaseState;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.core.purchase.entity.e */
/* loaded from: classes8.dex */
public final class C8162e {

    /* renamed from: a */
    public final PurchaseState f2063a;

    /* renamed from: b */
    public final String f2064b;

    public C8162e(PurchaseState state, String str) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f2063a = state;
        this.f2064b = str;
    }

    /* renamed from: a */
    public final PurchaseState m2086a() {
        return this.f2063a;
    }

    /* renamed from: b */
    public final String m2087b() {
        return this.f2064b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8162e)) {
            return false;
        }
        C8162e c8162e = (C8162e) obj;
        return this.f2063a == c8162e.f2063a && Intrinsics.areEqual(this.f2064b, c8162e.f2064b);
    }

    public int hashCode() {
        int iHashCode = this.f2063a.hashCode() * 31;
        String str = this.f2064b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PurchaseStatePayload(state=");
        sb.append(this.f2063a);
        sb.append(", traceId=");
        return C8032c.m1430a(sb, this.f2064b, ')');
    }
}
