package com.sdkit.paylib.paylibnative.p033ui.screens.paymentsuccess;

import com.sdkit.paylib.paylibdomain.impl.entity.C8054b;
import com.sdkit.paylib.paylibnative.p033ui.screens.invoice.viewobjects.C8302e;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.paymentsuccess.f */
/* loaded from: classes5.dex */
public final class C8350f {

    /* renamed from: a */
    public final C8302e f3556a;

    /* renamed from: b */
    public final boolean f3557b;

    /* renamed from: c */
    public final boolean f3558c;

    /* renamed from: d */
    public final int f3559d;

    /* renamed from: e */
    public final Pair f3560e;

    public C8350f(C8302e c8302e, boolean z, boolean z2, int i, Pair pair) {
        this.f3556a = c8302e;
        this.f3557b = z;
        this.f3558c = z2;
        this.f3559d = i;
        this.f3560e = pair;
    }

    /* renamed from: a */
    public final C8350f m3308a(C8302e c8302e, boolean z, boolean z2, int i, Pair pair) {
        return new C8350f(c8302e, z, z2, i, pair);
    }

    /* renamed from: b */
    public final C8302e m3310b() {
        return this.f3556a;
    }

    /* renamed from: c */
    public final int m3311c() {
        return this.f3559d;
    }

    /* renamed from: d */
    public final boolean m3312d() {
        return this.f3557b;
    }

    /* renamed from: e */
    public final boolean m3313e() {
        return this.f3558c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8350f)) {
            return false;
        }
        C8350f c8350f = (C8350f) obj;
        return Intrinsics.areEqual(this.f3556a, c8350f.f3556a) && this.f3557b == c8350f.f3557b && this.f3558c == c8350f.f3558c && this.f3559d == c8350f.f3559d && Intrinsics.areEqual(this.f3560e, c8350f.f3560e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        C8302e c8302e = this.f3556a;
        int iHashCode = (c8302e == null ? 0 : c8302e.hashCode()) * 31;
        boolean z = this.f3557b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iHashCode + i) * 31;
        boolean z2 = this.f3558c;
        int iM1525a = C8054b.m1525a(this.f3559d, (i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31, 31);
        Pair pair = this.f3560e;
        return iM1525a + (pair != null ? pair.hashCode() : 0);
    }

    public String toString() {
        return "PaymentSuccessViewState(invoice=" + this.f3556a + ", needToLoadBrandInfo=" + this.f3557b + ", isSandbox=" + this.f3558c + ", message=" + this.f3559d + ", additionalMessage=" + this.f3560e + ')';
    }

    /* renamed from: a */
    public static /* synthetic */ C8350f m3307a(C8350f c8350f, C8302e c8302e, boolean z, boolean z2, int i, Pair pair, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            c8302e = c8350f.f3556a;
        }
        if ((i2 & 2) != 0) {
            z = c8350f.f3557b;
        }
        boolean z3 = z;
        if ((i2 & 4) != 0) {
            z2 = c8350f.f3558c;
        }
        boolean z4 = z2;
        if ((i2 & 8) != 0) {
            i = c8350f.f3559d;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            pair = c8350f.f3560e;
        }
        return c8350f.m3308a(c8302e, z3, z4, i3, pair);
    }

    /* renamed from: a */
    public final Pair m3309a() {
        return this.f3560e;
    }
}
