package com.sdkit.paylib.paylibnative.p033ui.screens.deeplinkresult;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import com.sdkit.paylib.paylibnative.p033ui.screens.invoice.viewobjects.C8302e;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.deeplinkresult.g */
/* loaded from: classes5.dex */
public final class C8293g {

    /* renamed from: a */
    public final C8302e f3038a;

    /* renamed from: b */
    public final boolean f3039b;

    /* renamed from: c */
    public final boolean f3040c;

    /* renamed from: d */
    public final EnumC8289c f3041d;

    /* renamed from: e */
    public final String f3042e;

    public C8293g(C8302e c8302e, boolean z, boolean z2, EnumC8289c enumC8289c, String str) {
        this.f3038a = c8302e;
        this.f3039b = z;
        this.f3040c = z2;
        this.f3041d = enumC8289c;
        this.f3042e = str;
    }

    /* renamed from: a */
    public static /* synthetic */ C8293g m2783a(C8293g c8293g, C8302e c8302e, boolean z, boolean z2, EnumC8289c enumC8289c, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            c8302e = c8293g.f3038a;
        }
        if ((i & 2) != 0) {
            z = c8293g.f3039b;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            z2 = c8293g.f3040c;
        }
        boolean z4 = z2;
        if ((i & 8) != 0) {
            enumC8289c = c8293g.f3041d;
        }
        EnumC8289c enumC8289c2 = enumC8289c;
        if ((i & 16) != 0) {
            str = c8293g.f3042e;
        }
        return c8293g.m2784a(c8302e, z3, z4, enumC8289c2, str);
    }

    /* renamed from: b */
    public final boolean m2786b() {
        return this.f3039b;
    }

    /* renamed from: c */
    public final String m2787c() {
        return this.f3042e;
    }

    /* renamed from: d */
    public final boolean m2788d() {
        return this.f3040c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8293g)) {
            return false;
        }
        C8293g c8293g = (C8293g) obj;
        return Intrinsics.areEqual(this.f3038a, c8293g.f3038a) && this.f3039b == c8293g.f3039b && this.f3040c == c8293g.f3040c && this.f3041d == c8293g.f3041d && Intrinsics.areEqual(this.f3042e, c8293g.f3042e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        C8302e c8302e = this.f3038a;
        int iHashCode = (c8302e == null ? 0 : c8302e.hashCode()) * 31;
        boolean z = this.f3039b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iHashCode + i) * 31;
        boolean z2 = this.f3040c;
        int i3 = (i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        EnumC8289c enumC8289c = this.f3041d;
        int iHashCode2 = (i3 + (enumC8289c == null ? 0 : enumC8289c.hashCode())) * 31;
        String str = this.f3042e;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DeeplinkResultViewState(invoice=");
        sb.append(this.f3038a);
        sb.append(", needToLoadBrandInfo=");
        sb.append(this.f3039b);
        sb.append(", isSandbox=");
        sb.append(this.f3040c);
        sb.append(", paymentState=");
        sb.append(this.f3041d);
        sb.append(", userMessage=");
        return C8032c.m1430a(sb, this.f3042e, ')');
    }

    /* renamed from: a */
    public final C8293g m2784a(C8302e c8302e, boolean z, boolean z2, EnumC8289c enumC8289c, String str) {
        return new C8293g(c8302e, z, z2, enumC8289c, str);
    }

    /* renamed from: a */
    public final C8302e m2785a() {
        return this.f3038a;
    }
}
