package com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.viewobjects;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8030a;
import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8419e;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.paymentways.viewobjects.a */
/* loaded from: classes6.dex */
public final class C8426a {

    /* renamed from: a */
    public final InterfaceC8419e.a f3975a;

    /* renamed from: b */
    public final boolean f3976b;

    public C8426a(InterfaceC8419e.a widget, boolean z) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        this.f3975a = widget;
        this.f3976b = z;
    }

    /* renamed from: a */
    public final boolean m3706a() {
        return this.f3976b;
    }

    /* renamed from: b */
    public final InterfaceC8419e.a m3707b() {
        return this.f3975a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8426a)) {
            return false;
        }
        C8426a c8426a = (C8426a) obj;
        return this.f3975a == c8426a.f3975a && this.f3976b == c8426a.f3976b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.f3975a.hashCode() * 31;
        boolean z = this.f3976b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iHashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PaymentWayVO(widget=");
        sb.append(this.f3975a);
        sb.append(", selected=");
        return C8030a.m1428a(sb, this.f3976b, ')');
    }
}
