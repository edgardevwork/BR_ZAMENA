package com.sdkit.paylib.paylibnative.p033ui.screens.cardsaving;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8030a;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.cardsaving.e */
/* loaded from: classes5.dex */
public final class C8286e {

    /* renamed from: a */
    public final boolean f2967a;

    /* renamed from: b */
    public final boolean f2968b;

    public C8286e(boolean z, boolean z2) {
        this.f2967a = z;
        this.f2968b = z2;
    }

    /* renamed from: a */
    public static /* synthetic */ C8286e m2715a(C8286e c8286e, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = c8286e.f2967a;
        }
        if ((i & 2) != 0) {
            z2 = c8286e.f2968b;
        }
        return c8286e.m2716a(z, z2);
    }

    /* renamed from: b */
    public final boolean m2718b() {
        return this.f2968b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8286e)) {
            return false;
        }
        C8286e c8286e = (C8286e) obj;
        return this.f2967a == c8286e.f2967a && this.f2968b == c8286e.f2968b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.f2967a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.f2968b;
        return i + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CardSavingViewState(isLoading=");
        sb.append(this.f2967a);
        sb.append(", isSandbox=");
        return C8030a.m1428a(sb, this.f2968b, ')');
    }

    /* renamed from: a */
    public final C8286e m2716a(boolean z, boolean z2) {
        return new C8286e(z, z2);
    }

    /* renamed from: a */
    public final boolean m2717a() {
        return this.f2967a;
    }
}
