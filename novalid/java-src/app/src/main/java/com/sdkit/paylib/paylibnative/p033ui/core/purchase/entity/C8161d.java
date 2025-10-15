package com.sdkit.paylib.paylibnative.p033ui.core.purchase.entity;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8031b;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.core.purchase.entity.d */
/* loaded from: classes8.dex */
public final class C8161d {

    /* renamed from: a */
    public final a f2056a;

    /* renamed from: b */
    public final String f2057b;

    /* renamed from: c */
    public final String f2058c;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.core.purchase.entity.d$a */
    public enum a {
        APPLICATION,
        PRODUCT,
        CHANGE_PAYMENT_METHOD
    }

    public C8161d(a purchaseType, String purchaseId, String invoiceId) {
        Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        this.f2056a = purchaseType;
        this.f2057b = purchaseId;
        this.f2058c = invoiceId;
    }

    /* renamed from: a */
    public final String m2082a() {
        return this.f2058c;
    }

    /* renamed from: b */
    public final String m2083b() {
        return this.f2057b;
    }

    /* renamed from: c */
    public final a m2084c() {
        return this.f2056a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8161d)) {
            return false;
        }
        C8161d c8161d = (C8161d) obj;
        return this.f2056a == c8161d.f2056a && Intrinsics.areEqual(this.f2057b, c8161d.f2057b) && Intrinsics.areEqual(this.f2058c, c8161d.f2058c);
    }

    public int hashCode() {
        return this.f2058c.hashCode() + C8031b.m1429a(this.f2057b, this.f2056a.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GmarktPurchasePayload(purchaseType=");
        sb.append(this.f2056a);
        sb.append(", purchaseId=");
        sb.append(this.f2057b);
        sb.append(", invoiceId=");
        return C8032c.m1430a(sb, this.f2058c, ')');
    }
}
