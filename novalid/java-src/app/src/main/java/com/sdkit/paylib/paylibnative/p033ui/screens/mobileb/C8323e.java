package com.sdkit.paylib.paylibnative.p033ui.screens.mobileb;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8030a;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.mobileb.e */
/* loaded from: classes5.dex */
public final class C8323e {

    /* renamed from: a */
    public final String f3295a;

    /* renamed from: b */
    public final String f3296b;

    /* renamed from: c */
    public final boolean f3297c;

    /* renamed from: d */
    public final boolean f3298d;

    /* renamed from: e */
    public final boolean f3299e;

    public C8323e(String str, String str2, boolean z, boolean z2, boolean z3) {
        this.f3295a = str;
        this.f3296b = str2;
        this.f3297c = z;
        this.f3298d = z2;
        this.f3299e = z3;
    }

    /* renamed from: a */
    public static /* synthetic */ C8323e m3033a(C8323e c8323e, String str, String str2, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c8323e.f3295a;
        }
        if ((i & 2) != 0) {
            str2 = c8323e.f3296b;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            z = c8323e.f3297c;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            z2 = c8323e.f3298d;
        }
        boolean z5 = z2;
        if ((i & 16) != 0) {
            z3 = c8323e.f3299e;
        }
        return c8323e.m3034a(str, str3, z4, z5, z3);
    }

    /* renamed from: b */
    public final String m3036b() {
        return this.f3296b;
    }

    /* renamed from: c */
    public final boolean m3037c() {
        return this.f3297c;
    }

    /* renamed from: d */
    public final boolean m3038d() {
        return this.f3298d;
    }

    /* renamed from: e */
    public final boolean m3039e() {
        return this.f3299e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8323e)) {
            return false;
        }
        C8323e c8323e = (C8323e) obj;
        return Intrinsics.areEqual(this.f3295a, c8323e.f3295a) && Intrinsics.areEqual(this.f3296b, c8323e.f3296b) && this.f3297c == c8323e.f3297c && this.f3298d == c8323e.f3298d && this.f3299e == c8323e.f3299e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.f3295a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f3296b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.f3297c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iHashCode2 + i) * 31;
        boolean z2 = this.f3298d;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.f3299e;
        return i4 + (z3 ? 1 : z3 ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MobileBViewState(disclaimerText=");
        sb.append(this.f3295a);
        sb.append(", errorText=");
        sb.append(this.f3296b);
        sb.append(", isContinueAvailable=");
        sb.append(this.f3297c);
        sb.append(", isLoading=");
        sb.append(this.f3298d);
        sb.append(", isSandbox=");
        return C8030a.m1428a(sb, this.f3299e, ')');
    }

    /* renamed from: a */
    public final C8323e m3034a(String str, String str2, boolean z, boolean z2, boolean z3) {
        return new C8323e(str, str2, z, z2, z3);
    }

    /* renamed from: a */
    public final String m3035a() {
        return this.f3295a;
    }
}
