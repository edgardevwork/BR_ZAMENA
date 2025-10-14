package ru.rustore.sdk.remoteconfig.internal;

import android.net.http.X509TrustManagerExtensions;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p051io.CloseableKt;
import kotlin.text.Charsets;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.p */
/* loaded from: classes5.dex */
public final class C11755p implements X509TrustManager {

    /* renamed from: a */
    public final ArrayList f10967a;

    public C11755p(List selfSignedCertificates) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        Intrinsics.checkNotNullParameter(selfSignedCertificates, "selfSignedCertificates");
        ArrayList arrayList = new ArrayList();
        X509TrustManager x509TrustManagerM7549a = m7549a(null);
        if (x509TrustManagerM7549a != null) {
            arrayList.add(x509TrustManagerM7549a);
        }
        if (!selfSignedCertificates.isEmpty()) {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            Intrinsics.checkNotNullExpressionValue(certificateFactory, "getInstance(\"X.509\")");
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(selfSignedCertificates, 10));
            Iterator it = selfSignedCertificates.iterator();
            while (it.hasNext()) {
                byte[] bytes = ((String) it.next()).getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
                try {
                    Certificate certificateGenerateCertificate = certificateFactory.generateCertificate(byteArrayInputStream);
                    CloseableKt.closeFinally(byteArrayInputStream, null);
                    arrayList2.add(certificateGenerateCertificate);
                } finally {
                }
            }
            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            keyStore.load(null, null);
            Iterator it2 = arrayList2.iterator();
            int i = 0;
            while (it2.hasNext()) {
                Object next = it2.next();
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                keyStore.setCertificateEntry("ca" + i, (Certificate) next);
                i = i2;
            }
            X509TrustManager x509TrustManagerM7549a2 = m7549a(keyStore);
            if (x509TrustManagerM7549a2 != null) {
                arrayList.add(x509TrustManagerM7549a2);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            X509TrustManager x509TrustManager = (X509TrustManager) it3.next();
            arrayList3.add(new C11734e1(x509TrustManager, new X509TrustManagerExtensions(x509TrustManager)));
        }
        this.f10967a = arrayList3;
    }

    /* renamed from: a */
    public static X509TrustManager m7549a(KeyStore keyStore) throws NoSuchAlgorithmException, KeyStoreException {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init(keyStore);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            Intrinsics.checkNotNullExpressionValue(trustManagers, "factory.trustManagers");
            ArrayList arrayList = new ArrayList();
            for (TrustManager trustManager : trustManagers) {
                if (trustManager instanceof X509TrustManager) {
                    arrayList.add(trustManager);
                }
            }
            return (X509TrustManager) CollectionsKt___CollectionsKt.firstOrNull((List) arrayList);
        } catch (KeyStoreException e) {
            e = e;
            Log.e("CompositeX509TrustManager", e.toString());
            return null;
        } catch (NoSuchAlgorithmException e2) {
            e = e2;
            Log.e("CompositeX509TrustManager", e.toString());
            return null;
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        Iterator it = this.f10967a.iterator();
        while (it.hasNext()) {
            try {
                ((C11734e1) it.next()).f10921a.checkServerTrusted(x509CertificateArr, str);
                return;
            } catch (CertificateException e) {
                Log.e("CompositeX509TrustManager", e.toString());
            }
        }
        throw new CertificateException("None of the TrustManagers trust this certificate chain");
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        Iterator it = this.f10967a.iterator();
        while (it.hasNext()) {
            try {
                ((C11734e1) it.next()).f10921a.checkServerTrusted(x509CertificateArr, str);
                return;
            } catch (CertificateException e) {
                Log.e("CompositeX509TrustManager", e.toString());
            }
        }
        throw new CertificateException("None of the TrustManagers trust this certificate chain");
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        ArrayList arrayList = this.f10967a;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            X509Certificate[] acceptedIssuers = ((C11734e1) it.next()).f10921a.getAcceptedIssuers();
            Intrinsics.checkNotNullExpressionValue(acceptedIssuers, "it.trustManager.acceptedIssuers");
            CollectionsKt__MutableCollectionsKt.addAll(arrayList2, ArraysKt___ArraysKt.toList(acceptedIssuers));
        }
        Object[] array = arrayList2.toArray(new X509Certificate[0]);
        Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (X509Certificate[]) array;
    }
}
