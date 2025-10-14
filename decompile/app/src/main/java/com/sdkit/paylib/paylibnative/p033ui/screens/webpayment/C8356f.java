package com.sdkit.paylib.paylibnative.p033ui.screens.webpayment;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8030a;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.webpayment.f */
/* loaded from: classes5.dex */
public final class C8356f {

    /* renamed from: a */
    public final AbstractC8353c f3646a;

    /* renamed from: b */
    public final String f3647b;

    /* renamed from: c */
    public final boolean f3648c;

    public C8356f(AbstractC8353c webPaymentState, String str, boolean z) {
        Intrinsics.checkNotNullParameter(webPaymentState, "webPaymentState");
        this.f3646a = webPaymentState;
        this.f3647b = str;
        this.f3648c = z;
    }

    /* renamed from: a */
    public final C8356f m3414a(AbstractC8353c webPaymentState, String str, boolean z) {
        Intrinsics.checkNotNullParameter(webPaymentState, "webPaymentState");
        return new C8356f(webPaymentState, str, z);
    }

    /* renamed from: b */
    public final AbstractC8353c m3416b() {
        return this.f3646a;
    }

    /* renamed from: c */
    public final boolean m3417c() {
        return this.f3648c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8356f)) {
            return false;
        }
        C8356f c8356f = (C8356f) obj;
        return Intrinsics.areEqual(this.f3646a, c8356f.f3646a) && Intrinsics.areEqual(this.f3647b, c8356f.f3647b) && this.f3648c == c8356f.f3648c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.f3646a.hashCode() * 31;
        String str = this.f3647b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.f3648c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iHashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WebPaymentViewState(webPaymentState=");
        sb.append(this.f3646a);
        sb.append(", actionLink=");
        sb.append(this.f3647b);
        sb.append(", isSandbox=");
        return C8030a.m1428a(sb, this.f3648c, ')');
    }

    /* renamed from: a */
    public static /* synthetic */ C8356f m3413a(C8356f c8356f, AbstractC8353c abstractC8353c, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            abstractC8353c = c8356f.f3646a;
        }
        if ((i & 2) != 0) {
            str = c8356f.f3647b;
        }
        if ((i & 4) != 0) {
            z = c8356f.f3648c;
        }
        return c8356f.m3414a(abstractC8353c, str, z);
    }

    /* renamed from: a */
    public final String m3415a() {
        return this.f3647b;
    }
}
