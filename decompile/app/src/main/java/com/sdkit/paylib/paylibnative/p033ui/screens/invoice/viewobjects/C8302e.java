package com.sdkit.paylib.paylibnative.p033ui.screens.invoice.viewobjects;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8031b;
import com.sdkit.paylib.paylibpayment.api.domain.entity.Invoice;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.invoice.viewobjects.e */
/* loaded from: classes5.dex */
public final class C8302e {

    /* renamed from: a */
    public final String f3160a;

    /* renamed from: b */
    public final String f3161b;

    /* renamed from: c */
    public final String f3162c;

    /* renamed from: d */
    public final String f3163d;

    /* renamed from: e */
    public final boolean f3164e;

    /* renamed from: f */
    public final List f3165f;

    /* renamed from: g */
    public final String f3166g;

    /* renamed from: h */
    public final Invoice.LoyaltyInfoState f3167h;

    public C8302e(String invoiceId, String str, String title, String visibleAmount, boolean z, List paymentWays, String paymentActionByCard, Invoice.LoyaltyInfoState loyaltyInfoState) {
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(visibleAmount, "visibleAmount");
        Intrinsics.checkNotNullParameter(paymentWays, "paymentWays");
        Intrinsics.checkNotNullParameter(paymentActionByCard, "paymentActionByCard");
        Intrinsics.checkNotNullParameter(loyaltyInfoState, "loyaltyInfoState");
        this.f3160a = invoiceId;
        this.f3161b = str;
        this.f3162c = title;
        this.f3163d = visibleAmount;
        this.f3164e = z;
        this.f3165f = paymentWays;
        this.f3166g = paymentActionByCard;
        this.f3167h = loyaltyInfoState;
    }

    /* renamed from: b */
    public final String m2907b() {
        return this.f3161b;
    }

    /* renamed from: c */
    public final String m2908c() {
        return this.f3160a;
    }

    /* renamed from: d */
    public final Invoice.LoyaltyInfoState m2909d() {
        return this.f3167h;
    }

    /* renamed from: e */
    public final String m2910e() {
        return this.f3166g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8302e)) {
            return false;
        }
        C8302e c8302e = (C8302e) obj;
        return Intrinsics.areEqual(this.f3160a, c8302e.f3160a) && Intrinsics.areEqual(this.f3161b, c8302e.f3161b) && Intrinsics.areEqual(this.f3162c, c8302e.f3162c) && Intrinsics.areEqual(this.f3163d, c8302e.f3163d) && this.f3164e == c8302e.f3164e && Intrinsics.areEqual(this.f3165f, c8302e.f3165f) && Intrinsics.areEqual(this.f3166g, c8302e.f3166g) && this.f3167h == c8302e.f3167h;
    }

    /* renamed from: f */
    public final List m2911f() {
        return this.f3165f;
    }

    /* renamed from: g */
    public final String m2912g() {
        return this.f3162c;
    }

    /* renamed from: h */
    public final String m2913h() {
        return this.f3163d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.f3160a.hashCode() * 31;
        String str = this.f3161b;
        int iM1429a = C8031b.m1429a(this.f3163d, C8031b.m1429a(this.f3162c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        boolean z = this.f3164e;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return this.f3167h.hashCode() + C8031b.m1429a(this.f3166g, (this.f3165f.hashCode() + ((iM1429a + i) * 31)) * 31, 31);
    }

    public String toString() {
        return "InvoiceVO(invoiceId=" + this.f3160a + ", icon=" + this.f3161b + ", title=" + this.f3162c + ", visibleAmount=" + this.f3163d + ", hasValidCards=" + this.f3164e + ", paymentWays=" + this.f3165f + ", paymentActionByCard=" + this.f3166g + ", loyaltyInfoState=" + this.f3167h + ')';
    }

    /* renamed from: a */
    public final C8302e m2905a(String invoiceId, String str, String title, String visibleAmount, boolean z, List paymentWays, String paymentActionByCard, Invoice.LoyaltyInfoState loyaltyInfoState) {
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(visibleAmount, "visibleAmount");
        Intrinsics.checkNotNullParameter(paymentWays, "paymentWays");
        Intrinsics.checkNotNullParameter(paymentActionByCard, "paymentActionByCard");
        Intrinsics.checkNotNullParameter(loyaltyInfoState, "loyaltyInfoState");
        return new C8302e(invoiceId, str, title, visibleAmount, z, paymentWays, paymentActionByCard, loyaltyInfoState);
    }

    /* renamed from: a */
    public final boolean m2906a() {
        return this.f3164e;
    }
}
