package com.sdkit.paylib.paylibnative.p033ui.screens.manualupdate;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8030a;
import com.sdkit.paylib.paylibnative.p033ui.screens.invoice.viewobjects.C8302e;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.manualupdate.e */
/* loaded from: classes5.dex */
public final class C8318e {

    /* renamed from: a */
    public final C8302e f3260a;

    /* renamed from: b */
    public final boolean f3261b;

    /* renamed from: c */
    public final boolean f3262c;

    public C8318e(C8302e c8302e, boolean z, boolean z2) {
        this.f3260a = c8302e;
        this.f3261b = z;
        this.f3262c = z2;
    }

    /* renamed from: a */
    public final C8302e m2987a() {
        return this.f3260a;
    }

    /* renamed from: b */
    public final boolean m2989b() {
        return this.f3261b;
    }

    /* renamed from: c */
    public final boolean m2990c() {
        return this.f3262c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8318e)) {
            return false;
        }
        C8318e c8318e = (C8318e) obj;
        return Intrinsics.areEqual(this.f3260a, c8318e.f3260a) && this.f3261b == c8318e.f3261b && this.f3262c == c8318e.f3262c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        C8302e c8302e = this.f3260a;
        int iHashCode = (c8302e == null ? 0 : c8302e.hashCode()) * 31;
        boolean z = this.f3261b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iHashCode + i) * 31;
        boolean z2 = this.f3262c;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ManualUpdateViewState(invoice=");
        sb.append(this.f3260a);
        sb.append(", needToLoadBrandInfo=");
        sb.append(this.f3261b);
        sb.append(", isSandbox=");
        return C8030a.m1428a(sb, this.f3262c, ')');
    }

    /* renamed from: a */
    public final C8318e m2988a(C8302e c8302e, boolean z, boolean z2) {
        return new C8318e(c8302e, z, z2);
    }
}
