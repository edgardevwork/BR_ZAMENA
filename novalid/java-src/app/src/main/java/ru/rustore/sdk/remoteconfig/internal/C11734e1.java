package ru.rustore.sdk.remoteconfig.internal;

import android.net.http.X509TrustManagerExtensions;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.e1 */
/* loaded from: classes5.dex */
public final class C11734e1 {

    /* renamed from: a */
    public final X509TrustManager f10921a;

    /* renamed from: b */
    public final X509TrustManagerExtensions f10922b;

    public C11734e1(X509TrustManager trustManager, X509TrustManagerExtensions trustExtensions) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        Intrinsics.checkNotNullParameter(trustExtensions, "trustExtensions");
        this.f10921a = trustManager;
        this.f10922b = trustExtensions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11734e1)) {
            return false;
        }
        C11734e1 c11734e1 = (C11734e1) obj;
        return Intrinsics.areEqual(this.f10921a, c11734e1.f10921a) && Intrinsics.areEqual(this.f10922b, c11734e1.f10922b);
    }

    public final int hashCode() {
        return this.f10922b.hashCode() + (this.f10921a.hashCode() * 31);
    }

    public final String toString() {
        return "X509TrustPair(trustManager=" + this.f10921a + ", trustExtensions=" + this.f10922b + ')';
    }
}
