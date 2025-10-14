package com.sdkit.paylib.paylibnative.p033ui.core.purchase.entity;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.core.purchase.entity.a */
/* loaded from: classes5.dex */
public final class C8158a implements InterfaceC8159b {

    /* renamed from: a */
    public final String f2050a;

    /* renamed from: b */
    public final String f2051b;

    public C8158a(String applicationId, String str) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        this.f2050a = applicationId;
        this.f2051b = str;
    }

    /* renamed from: a */
    public final String m2076a() {
        return this.f2050a;
    }

    /* renamed from: b */
    public final String m2077b() {
        return this.f2051b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8158a)) {
            return false;
        }
        C8158a c8158a = (C8158a) obj;
        return Intrinsics.areEqual(this.f2050a, c8158a.f2050a) && Intrinsics.areEqual(this.f2051b, c8158a.f2051b);
    }

    public int hashCode() {
        int iHashCode = this.f2050a.hashCode() * 31;
        String str = this.f2051b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GmarktApplicationPayload(applicationId=");
        sb.append(this.f2050a);
        sb.append(", developerPayload=");
        return C8032c.m1430a(sb, this.f2051b, ')');
    }
}
