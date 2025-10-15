package ru.rustore.sdk.remoteconfig.internal;

import java.util.List;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.d1 */
/* loaded from: classes5.dex */
public final class C11731d1 {
    /* renamed from: a */
    public static X509TrustManager m7537a(List signedCertificates) {
        Intrinsics.checkNotNullParameter(signedCertificates, "signedCertificates");
        return new C11757q(signedCertificates);
    }
}
