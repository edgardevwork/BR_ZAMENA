package com.sdkit.paylib.paylibnative.p033ui.screens.payment;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import com.sdkit.paylib.paylibdomain.api.entity.AsyncState;
import com.sdkit.paylib.paylibnative.p033ui.screens.invoice.viewobjects.C8302e;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.payment.e */
/* loaded from: classes5.dex */
public final class C8336e {

    /* renamed from: a */
    public final AsyncState f3446a;

    /* renamed from: b */
    public final C8302e f3447b;

    /* renamed from: c */
    public final boolean f3448c;

    /* renamed from: d */
    public final boolean f3449d;

    /* renamed from: e */
    public final boolean f3450e;

    /* renamed from: f */
    public final String f3451f;

    public C8336e(AsyncState paymentState, C8302e c8302e, boolean z, boolean z2, boolean z3, String str) {
        Intrinsics.checkNotNullParameter(paymentState, "paymentState");
        this.f3446a = paymentState;
        this.f3447b = c8302e;
        this.f3448c = z;
        this.f3449d = z2;
        this.f3450e = z3;
        this.f3451f = str;
    }

    /* renamed from: a */
    public final C8302e m3199a() {
        return this.f3447b;
    }

    /* renamed from: b */
    public final String m3201b() {
        return this.f3451f;
    }

    /* renamed from: c */
    public final boolean m3202c() {
        return this.f3449d;
    }

    /* renamed from: d */
    public final AsyncState m3203d() {
        return this.f3446a;
    }

    /* renamed from: e */
    public final boolean m3204e() {
        return this.f3450e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8336e)) {
            return false;
        }
        C8336e c8336e = (C8336e) obj;
        return Intrinsics.areEqual(this.f3446a, c8336e.f3446a) && Intrinsics.areEqual(this.f3447b, c8336e.f3447b) && this.f3448c == c8336e.f3448c && this.f3449d == c8336e.f3449d && this.f3450e == c8336e.f3450e && Intrinsics.areEqual(this.f3451f, c8336e.f3451f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.f3446a.hashCode() * 31;
        C8302e c8302e = this.f3447b;
        int iHashCode2 = (iHashCode + (c8302e == null ? 0 : c8302e.hashCode())) * 31;
        boolean z = this.f3448c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iHashCode2 + i) * 31;
        boolean z2 = this.f3449d;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.f3450e;
        int i5 = (i4 + (z3 ? 1 : z3 ? 1 : 0)) * 31;
        String str = this.f3451f;
        return i5 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PaymentViewState(paymentState=");
        sb.append(this.f3446a);
        sb.append(", invoice=");
        sb.append(this.f3447b);
        sb.append(", showCards=");
        sb.append(this.f3448c);
        sb.append(", needToLoadBrandInfo=");
        sb.append(this.f3449d);
        sb.append(", isSandbox=");
        sb.append(this.f3450e);
        sb.append(", loadingUserMessage=");
        return C8032c.m1430a(sb, this.f3451f, ')');
    }

    /* renamed from: a */
    public final C8336e m3200a(AsyncState paymentState, C8302e c8302e, boolean z, boolean z2, boolean z3, String str) {
        Intrinsics.checkNotNullParameter(paymentState, "paymentState");
        return new C8336e(paymentState, c8302e, z, z2, z3, str);
    }

    /* renamed from: a */
    public static /* synthetic */ C8336e m3198a(C8336e c8336e, AsyncState asyncState, C8302e c8302e, boolean z, boolean z2, boolean z3, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            asyncState = c8336e.f3446a;
        }
        if ((i & 2) != 0) {
            c8302e = c8336e.f3447b;
        }
        C8302e c8302e2 = c8302e;
        if ((i & 4) != 0) {
            z = c8336e.f3448c;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            z2 = c8336e.f3449d;
        }
        boolean z5 = z2;
        if ((i & 16) != 0) {
            z3 = c8336e.f3450e;
        }
        boolean z6 = z3;
        if ((i & 32) != 0) {
            str = c8336e.f3451f;
        }
        return c8336e.m3200a(asyncState, c8302e2, z4, z5, z6, str);
    }
}
