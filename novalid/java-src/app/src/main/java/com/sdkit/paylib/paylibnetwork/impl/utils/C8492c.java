package com.sdkit.paylib.paylibnetwork.impl.utils;

import java.security.cert.X509Certificate;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnetwork.impl.utils.c */
/* loaded from: classes6.dex */
public final class C8492c {

    /* renamed from: a */
    public static final C8492c f4209a = new C8492c();

    /* renamed from: a */
    public final String m3884a(String str, X509Certificate[] x509CertificateArr) {
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            sb.append("host: " + str + ", ");
        }
        if (x509CertificateArr != null) {
            for (X509Certificate x509Certificate : x509CertificateArr) {
                sb.append("Issuer: " + x509Certificate.getIssuerDN() + ", Subject: " + x509Certificate.getSubjectDN() + ", DateNotAfter: " + x509Certificate.getNotAfter() + '\n');
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
