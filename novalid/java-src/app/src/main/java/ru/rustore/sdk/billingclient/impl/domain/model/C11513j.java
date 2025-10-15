package ru.rustore.sdk.billingclient.impl.domain.model;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8031b;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ru.rustore.sdk.billingclient.impl.domain.model.j */
/* loaded from: classes5.dex */
public final class C11513j {

    /* renamed from: a */
    public final long f10502a;

    /* renamed from: b */
    public final String f10503b;

    /* renamed from: c */
    public final int f10504c;

    public C11513j(long j, String jwe, int i) {
        Intrinsics.checkNotNullParameter(jwe, "jwe");
        this.f10502a = j;
        this.f10503b = jwe;
        this.f10504c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11513j)) {
            return false;
        }
        C11513j c11513j = (C11513j) obj;
        return this.f10502a == c11513j.f10502a && Intrinsics.areEqual(this.f10503b, c11513j.f10503b) && this.f10504c == c11513j.f10504c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10504c) + C8031b.m1429a(this.f10503b, Long.hashCode(this.f10502a) * 31, 31);
    }

    public final String toString() {
        return "WebPayToken(receivingTime=" + this.f10502a + ", jwe=" + this.f10503b + ", ttl=" + this.f10504c + ')';
    }
}
