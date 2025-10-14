package com.sdkit.paylib.paylibnative.p033ui.screens.invoice.viewobjects;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8030a;
import com.sdkit.paylib.paylibnative.p033ui.common.view.AbstractC8128b;
import com.sdkit.paylib.paylibnative.p033ui.common.view.C8127a;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.invoice.viewobjects.d */
/* loaded from: classes5.dex */
public final class C8301d {

    /* renamed from: a */
    public final C8302e f3150a;

    /* renamed from: b */
    public final a f3151b;

    /* renamed from: c */
    public final boolean f3152c;

    /* renamed from: d */
    public final boolean f3153d;

    /* renamed from: e */
    public final boolean f3154e;

    /* renamed from: f */
    public final boolean f3155f;

    /* renamed from: g */
    public final boolean f3156g;

    /* renamed from: h */
    public final boolean f3157h;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.screens.invoice.viewobjects.d$a */
    public static final class a {

        /* renamed from: a */
        public final AbstractC8128b f3158a;

        /* renamed from: b */
        public final C8127a f3159b;

        public a(AbstractC8128b action, C8127a style) {
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(style, "style");
            this.f3158a = action;
            this.f3159b = style;
        }

        /* renamed from: a */
        public final AbstractC8128b m2902a() {
            return this.f3158a;
        }

        /* renamed from: b */
        public final C8127a m2903b() {
            return this.f3159b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f3158a, aVar.f3158a) && Intrinsics.areEqual(this.f3159b, aVar.f3159b);
        }

        public int hashCode() {
            return this.f3159b.hashCode() + (this.f3158a.hashCode() * 31);
        }

        public String toString() {
            return "PaymentButton(action=" + this.f3158a + ", style=" + this.f3159b + ')';
        }
    }

    public C8301d(C8302e c8302e, a aVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f3150a = c8302e;
        this.f3151b = aVar;
        this.f3152c = z;
        this.f3153d = z2;
        this.f3154e = z3;
        this.f3155f = z4;
        this.f3156g = z5;
        this.f3157h = z6;
    }

    /* renamed from: b */
    public final boolean m2895b() {
        return this.f3152c;
    }

    /* renamed from: c */
    public final boolean m2896c() {
        return this.f3153d;
    }

    /* renamed from: d */
    public final boolean m2897d() {
        return this.f3155f;
    }

    /* renamed from: e */
    public final boolean m2898e() {
        return this.f3157h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8301d)) {
            return false;
        }
        C8301d c8301d = (C8301d) obj;
        return Intrinsics.areEqual(this.f3150a, c8301d.f3150a) && Intrinsics.areEqual(this.f3151b, c8301d.f3151b) && this.f3152c == c8301d.f3152c && this.f3153d == c8301d.f3153d && this.f3154e == c8301d.f3154e && this.f3155f == c8301d.f3155f && this.f3156g == c8301d.f3156g && this.f3157h == c8301d.f3157h;
    }

    /* renamed from: f */
    public final a m2899f() {
        return this.f3151b;
    }

    /* renamed from: g */
    public final boolean m2900g() {
        return this.f3154e;
    }

    /* renamed from: h */
    public final boolean m2901h() {
        return this.f3156g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        C8302e c8302e = this.f3150a;
        int iHashCode = (c8302e == null ? 0 : c8302e.hashCode()) * 31;
        a aVar = this.f3151b;
        int iHashCode2 = (iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        boolean z = this.f3152c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iHashCode2 + i) * 31;
        boolean z2 = this.f3153d;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.f3154e;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        boolean z4 = this.f3155f;
        int i7 = z4;
        if (z4 != 0) {
            i7 = 1;
        }
        int i8 = (i6 + i7) * 31;
        boolean z5 = this.f3156g;
        int i9 = z5;
        if (z5 != 0) {
            i9 = 1;
        }
        int i10 = (i8 + i9) * 31;
        boolean z6 = this.f3157h;
        return i10 + (z6 ? 1 : z6 ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("InvoiceDetailsViewState(invoice=");
        sb.append(this.f3150a);
        sb.append(", paymentButton=");
        sb.append(this.f3151b);
        sb.append(", invoiceDetailsVisible=");
        sb.append(this.f3152c);
        sb.append(", loadingViewVisible=");
        sb.append(this.f3153d);
        sb.append(", paymentWaysVisible=");
        sb.append(this.f3154e);
        sb.append(", needToLoadBrandInfo=");
        sb.append(this.f3155f);
        sb.append(", isSandbox=");
        sb.append(this.f3156g);
        sb.append(", offerInfoVisible=");
        return C8030a.m1428a(sb, this.f3157h, ')');
    }

    /* renamed from: a */
    public final C8301d m2893a(C8302e c8302e, a aVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        return new C8301d(c8302e, aVar, z, z2, z3, z4, z5, z6);
    }

    /* renamed from: a */
    public final C8302e m2894a() {
        return this.f3150a;
    }
}
