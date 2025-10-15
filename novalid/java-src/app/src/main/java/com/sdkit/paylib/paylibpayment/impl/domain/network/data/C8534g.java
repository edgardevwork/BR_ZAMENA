package com.sdkit.paylib.paylibpayment.impl.domain.network.data;

import com.sdkit.paylib.paylibpayment.impl.domain.network.utils.C8584a;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.data.g */
/* loaded from: classes8.dex */
public final class C8534g {

    /* renamed from: a */
    public final C8584a f4926a;

    public C8534g(C8584a b3) {
        Intrinsics.checkNotNullParameter(b3, "b3");
        this.f4926a = b3;
    }

    /* renamed from: a */
    public final C8584a m4051a() {
        return this.f4926a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8534g) && Intrinsics.areEqual(this.f4926a, ((C8534g) obj).f4926a);
    }

    public int hashCode() {
        return this.f4926a.hashCode();
    }

    public String toString() {
        return "NetworkClientRequest(b3=" + this.f4926a + ')';
    }
}
