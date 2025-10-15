package com.sdkit.paylib.paylibnative.p033ui.screens.paymenterror;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8030a;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.paymenterror.h */
/* loaded from: classes5.dex */
public final class C8344h {

    /* renamed from: a */
    public final String f3496a;

    /* renamed from: b */
    public final boolean f3497b;

    /* renamed from: c */
    public final boolean f3498c;

    public C8344h(String str, boolean z, boolean z2) {
        this.f3496a = str;
        this.f3497b = z;
        this.f3498c = z2;
    }

    /* renamed from: a */
    public final C8344h m3257a(String str, boolean z, boolean z2) {
        return new C8344h(str, z, z2);
    }

    /* renamed from: b */
    public final boolean m3259b() {
        return this.f3498c;
    }

    /* renamed from: c */
    public final boolean m3260c() {
        return this.f3497b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8344h)) {
            return false;
        }
        C8344h c8344h = (C8344h) obj;
        return Intrinsics.areEqual(this.f3496a, c8344h.f3496a) && this.f3497b == c8344h.f3497b && this.f3498c == c8344h.f3498c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.f3496a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z = this.f3497b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iHashCode + i) * 31;
        boolean z2 = this.f3498c;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PaymentErrorViewState(traceId=");
        sb.append(this.f3496a);
        sb.append(", isTraceIdVisible=");
        sb.append(this.f3497b);
        sb.append(", isSandbox=");
        return C8030a.m1428a(sb, this.f3498c, ')');
    }

    /* renamed from: a */
    public final String m3258a() {
        return this.f3496a;
    }
}
