package com.sdkit.paylib.paylibnative.p033ui.screens.cards;

import com.sdkit.paylib.paylibnative.p033ui.domain.AbstractC8217a;
import com.sdkit.paylib.paylibnative.p033ui.screens.invoice.viewobjects.C8302e;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.cards.f */
/* loaded from: classes8.dex */
public final class C8279f {

    /* renamed from: a */
    public final List f2938a;

    /* renamed from: b */
    public final boolean f2939b;

    /* renamed from: c */
    public final AbstractC8217a f2940c;

    /* renamed from: d */
    public final C8302e f2941d;

    /* renamed from: e */
    public final boolean f2942e;

    /* renamed from: f */
    public final boolean f2943f;

    /* renamed from: g */
    public final int f2944g;

    public C8279f(List cardsItems, boolean z, AbstractC8217a paymentState, C8302e c8302e, boolean z2, boolean z3, int i) {
        Intrinsics.checkNotNullParameter(cardsItems, "cardsItems");
        Intrinsics.checkNotNullParameter(paymentState, "paymentState");
        this.f2938a = cardsItems;
        this.f2939b = z;
        this.f2940c = paymentState;
        this.f2941d = c8302e;
        this.f2942e = z2;
        this.f2943f = z3;
        this.f2944g = i;
    }

    /* renamed from: a */
    public static /* synthetic */ C8279f m2673a(C8279f c8279f, List list, boolean z, AbstractC8217a abstractC8217a, C8302e c8302e, boolean z2, boolean z3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = c8279f.f2938a;
        }
        if ((i2 & 2) != 0) {
            z = c8279f.f2939b;
        }
        boolean z4 = z;
        if ((i2 & 4) != 0) {
            abstractC8217a = c8279f.f2940c;
        }
        AbstractC8217a abstractC8217a2 = abstractC8217a;
        if ((i2 & 8) != 0) {
            c8302e = c8279f.f2941d;
        }
        C8302e c8302e2 = c8302e;
        if ((i2 & 16) != 0) {
            z2 = c8279f.f2942e;
        }
        boolean z5 = z2;
        if ((i2 & 32) != 0) {
            z3 = c8279f.f2943f;
        }
        boolean z6 = z3;
        if ((i2 & 64) != 0) {
            i = c8279f.f2944g;
        }
        return c8279f.m2674a(list, z4, abstractC8217a2, c8302e2, z5, z6, i);
    }

    /* renamed from: b */
    public final int m2676b() {
        return this.f2944g;
    }

    /* renamed from: c */
    public final List m2677c() {
        return this.f2938a;
    }

    /* renamed from: d */
    public final C8302e m2678d() {
        return this.f2941d;
    }

    /* renamed from: e */
    public final boolean m2679e() {
        return this.f2942e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8279f)) {
            return false;
        }
        C8279f c8279f = (C8279f) obj;
        return Intrinsics.areEqual(this.f2938a, c8279f.f2938a) && this.f2939b == c8279f.f2939b && Intrinsics.areEqual(this.f2940c, c8279f.f2940c) && Intrinsics.areEqual(this.f2941d, c8279f.f2941d) && this.f2942e == c8279f.f2942e && this.f2943f == c8279f.f2943f && this.f2944g == c8279f.f2944g;
    }

    /* renamed from: f */
    public final AbstractC8217a m2680f() {
        return this.f2940c;
    }

    /* renamed from: g */
    public final boolean m2681g() {
        return this.f2943f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.f2938a.hashCode() * 31;
        boolean z = this.f2939b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int iHashCode2 = (this.f2940c.hashCode() + ((iHashCode + i) * 31)) * 31;
        C8302e c8302e = this.f2941d;
        int iHashCode3 = (iHashCode2 + (c8302e == null ? 0 : c8302e.hashCode())) * 31;
        boolean z2 = this.f2942e;
        int i2 = z2;
        if (z2 != 0) {
            i2 = 1;
        }
        int i3 = (iHashCode3 + i2) * 31;
        boolean z3 = this.f2943f;
        return Integer.hashCode(this.f2944g) + ((i3 + (z3 ? 1 : z3 ? 1 : 0)) * 31);
    }

    public String toString() {
        return "CardsViewState(cardsItems=" + this.f2938a + ", addCardAndPayBtnVisible=" + this.f2939b + ", paymentState=" + this.f2940c + ", invoice=" + this.f2941d + ", needToLoadBrandInfo=" + this.f2942e + ", isSandbox=" + this.f2943f + ", addCardAndPayButtonTextRes=" + this.f2944g + ')';
    }

    /* renamed from: a */
    public final C8279f m2674a(List cardsItems, boolean z, AbstractC8217a paymentState, C8302e c8302e, boolean z2, boolean z3, int i) {
        Intrinsics.checkNotNullParameter(cardsItems, "cardsItems");
        Intrinsics.checkNotNullParameter(paymentState, "paymentState");
        return new C8279f(cardsItems, z, paymentState, c8302e, z2, z3, i);
    }

    /* renamed from: a */
    public final boolean m2675a() {
        return this.f2939b;
    }
}
