package com.sdkit.paylib.paylibpayment.impl.domain.network.data;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.data.h */
/* loaded from: classes8.dex */
public final class C8535h {

    /* renamed from: a */
    public final C8534g f4927a;

    /* renamed from: b */
    public final String f4928b;

    public C8535h(C8534g request, String jsonString) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        this.f4927a = request;
        this.f4928b = jsonString;
    }

    /* renamed from: a */
    public final String m4052a() {
        return this.f4928b;
    }

    /* renamed from: b */
    public final C8534g m4053b() {
        return this.f4927a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8535h)) {
            return false;
        }
        C8535h c8535h = (C8535h) obj;
        return Intrinsics.areEqual(this.f4927a, c8535h.f4927a) && Intrinsics.areEqual(this.f4928b, c8535h.f4928b);
    }

    public int hashCode() {
        return this.f4928b.hashCode() + (this.f4927a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NetworkClientResponse(request=");
        sb.append(this.f4927a);
        sb.append(", jsonString=");
        return C8032c.m1430a(sb, this.f4928b, ')');
    }
}
