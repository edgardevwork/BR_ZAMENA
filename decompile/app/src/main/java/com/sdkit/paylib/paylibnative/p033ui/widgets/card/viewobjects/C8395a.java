package com.sdkit.paylib.paylibnative.p033ui.widgets.card.viewobjects;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8031b;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.card.viewobjects.a */
/* loaded from: classes6.dex */
public final class C8395a {

    /* renamed from: a */
    public final String f3811a;

    /* renamed from: b */
    public final String f3812b;

    /* renamed from: c */
    public final String f3813c;

    /* renamed from: d */
    public final String f3814d;

    public C8395a(String id, String cardNumber, String str, String str2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
        this.f3811a = id;
        this.f3812b = cardNumber;
        this.f3813c = str;
        this.f3814d = str2;
    }

    /* renamed from: a */
    public final String m3576a() {
        return this.f3814d;
    }

    /* renamed from: b */
    public final String m3577b() {
        return this.f3813c;
    }

    /* renamed from: c */
    public final String m3578c() {
        return this.f3812b;
    }

    /* renamed from: d */
    public final String m3579d() {
        return this.f3811a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8395a)) {
            return false;
        }
        C8395a c8395a = (C8395a) obj;
        return Intrinsics.areEqual(this.f3811a, c8395a.f3811a) && Intrinsics.areEqual(this.f3812b, c8395a.f3812b) && Intrinsics.areEqual(this.f3813c, c8395a.f3813c) && Intrinsics.areEqual(this.f3814d, c8395a.f3814d);
    }

    public int hashCode() {
        int iM1429a = C8031b.m1429a(this.f3812b, this.f3811a.hashCode() * 31, 31);
        String str = this.f3813c;
        int iHashCode = (iM1429a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f3814d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CardVO(id=");
        sb.append(this.f3811a);
        sb.append(", cardNumber=");
        sb.append(this.f3812b);
        sb.append(", cardImageUrl=");
        sb.append(this.f3813c);
        sb.append(", bankName=");
        return C8032c.m1430a(sb, this.f3814d, ')');
    }
}
