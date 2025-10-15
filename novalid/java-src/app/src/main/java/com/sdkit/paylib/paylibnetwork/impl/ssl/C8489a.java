package com.sdkit.paylib.paylibnetwork.impl.ssl;

import android.net.http.X509TrustManagerExtensions;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnetwork.impl.ssl.a */
/* loaded from: classes6.dex */
public final class C8489a {

    /* renamed from: a */
    public final X509TrustManager f4205a;

    /* renamed from: b */
    public final X509TrustManagerExtensions f4206b;

    public C8489a(X509TrustManager trustManager, X509TrustManagerExtensions trustExtensions) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        Intrinsics.checkNotNullParameter(trustExtensions, "trustExtensions");
        this.f4205a = trustManager;
        this.f4206b = trustExtensions;
    }

    /* renamed from: a */
    public final X509TrustManagerExtensions m3881a() {
        return this.f4206b;
    }

    /* renamed from: b */
    public final X509TrustManager m3882b() {
        return this.f4205a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8489a)) {
            return false;
        }
        C8489a c8489a = (C8489a) obj;
        return Intrinsics.areEqual(this.f4205a, c8489a.f4205a) && Intrinsics.areEqual(this.f4206b, c8489a.f4206b);
    }

    public int hashCode() {
        return this.f4206b.hashCode() + (this.f4205a.hashCode() * 31);
    }

    public String toString() {
        return "X509TrustPair(trustManager=" + this.f4205a + ", trustExtensions=" + this.f4206b + ')';
    }
}
