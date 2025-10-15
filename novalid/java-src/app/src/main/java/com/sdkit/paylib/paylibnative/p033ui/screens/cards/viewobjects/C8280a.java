package com.sdkit.paylib.paylibnative.p033ui.screens.cards.viewobjects;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8030a;
import com.sdkit.paylib.paylibnative.p033ui.widgets.card.viewobjects.C8395a;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.cards.viewobjects.a */
/* loaded from: classes8.dex */
public final class C8280a {

    /* renamed from: a */
    public final C8395a f2945a;

    /* renamed from: b */
    public final boolean f2946b;

    public C8280a(C8395a cardVO, boolean z) {
        Intrinsics.checkNotNullParameter(cardVO, "cardVO");
        this.f2945a = cardVO;
        this.f2946b = z;
    }

    /* renamed from: a */
    public static /* synthetic */ C8280a m2682a(C8280a c8280a, C8395a c8395a, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            c8395a = c8280a.f2945a;
        }
        if ((i & 2) != 0) {
            z = c8280a.f2946b;
        }
        return c8280a.m2683a(c8395a, z);
    }

    /* renamed from: b */
    public final boolean m2685b() {
        return this.f2946b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8280a)) {
            return false;
        }
        C8280a c8280a = (C8280a) obj;
        return Intrinsics.areEqual(this.f2945a, c8280a.f2945a) && this.f2946b == c8280a.f2946b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.f2945a.hashCode() * 31;
        boolean z = this.f2946b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iHashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CardPayVO(cardVO=");
        sb.append(this.f2945a);
        sb.append(", showSelection=");
        return C8030a.m1428a(sb, this.f2946b, ')');
    }

    /* renamed from: a */
    public final C8280a m2683a(C8395a cardVO, boolean z) {
        Intrinsics.checkNotNullParameter(cardVO, "cardVO");
        return new C8280a(cardVO, z);
    }

    /* renamed from: a */
    public final C8395a m2684a() {
        return this.f2945a;
    }
}
