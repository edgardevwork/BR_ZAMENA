package com.sdkit.paylib.paylibnetwork.impl.ssl;

import android.net.http.X509TrustManagerExtensions;
import com.sdkit.paylib.paylibnetwork.impl.utils.C8492c;
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
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p051io.CloseableKt;
import kotlin.text.Charsets;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\b\u001a\u00020\u00072\u0010\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ+\u0010\n\u001a\u00020\u00072\u0010\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\n\u0010\tJ;\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0010\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\n\u0010\rJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014¨\u0006\u001b"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnetwork/impl/ssl/CompositeX509TrustManager;", "Ljavax/net/ssl/X509TrustManager;", "", "Ljava/security/cert/X509Certificate;", "chain", "", "authType", "", "checkClientTrusted", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V", "checkServerTrusted", "host", "", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "getAcceptedIssuers", "()[Ljava/security/cert/X509Certificate;", "Ljava/security/KeyStore;", "keystore", "a", "Lcom/sdkit/paylib/paylibnetwork/impl/ssl/a;", "Ljava/util/List;", "trustPairs", "selfSignedCertificates", "", "withDefaultRoots", SegmentConstantPool.INITSTRING, "(Ljava/util/List;Z)V", "com-sdkit-assistant_paylib_network"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class CompositeX509TrustManager implements X509TrustManager {

    /* renamed from: a, reason: from kotlin metadata */
    public final List trustPairs;

    public CompositeX509TrustManager(List selfSignedCertificates, boolean z) throws NoSuchAlgorithmException, IOException, CertificateException, KeyStoreException {
        X509TrustManager x509TrustManagerM3872a;
        Intrinsics.checkNotNullParameter(selfSignedCertificates, "selfSignedCertificates");
        ArrayList arrayList = new ArrayList();
        if (z && (x509TrustManagerM3872a = m3872a(this, null, 1, null)) != null) {
            arrayList.add(x509TrustManagerM3872a);
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
                keyStore.setCertificateEntry("ca" + i, (Certificate) it2.next());
                i++;
            }
            X509TrustManager x509TrustManagerM3873a = m3873a(keyStore);
            if (x509TrustManagerM3873a != null) {
                arrayList.add(x509TrustManagerM3873a);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            X509TrustManager x509TrustManager = (X509TrustManager) it3.next();
            arrayList3.add(new C8489a(x509TrustManager, new X509TrustManagerExtensions(x509TrustManager)));
        }
        this.trustPairs = arrayList3;
    }

    /* renamed from: a */
    public static /* synthetic */ X509TrustManager m3872a(CompositeX509TrustManager compositeX509TrustManager, KeyStore keyStore, int i, Object obj) {
        if ((i & 1) != 0) {
            keyStore = null;
        }
        return compositeX509TrustManager.m3873a(keyStore);
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
        Iterator it = this.trustPairs.iterator();
        while (it.hasNext()) {
            try {
                ((C8489a) it.next()).m3882b().checkServerTrusted(chain, authType);
                return;
            } catch (CertificateException unused) {
            }
        }
        throw new CertificateException("None of the TrustManagers trust this certificate chain: " + C8492c.f4209a.m3884a(null, chain));
    }

    public final List<X509Certificate> checkServerTrusted(X509Certificate[] chain, String authType, String host) throws CertificateException {
        Iterator it = this.trustPairs.iterator();
        while (it.hasNext()) {
            try {
                List<X509Certificate> listCheckServerTrusted = ((C8489a) it.next()).m3881a().checkServerTrusted(chain, authType, host);
                Intrinsics.checkNotNullExpressionValue(listCheckServerTrusted, "trustManager.trustExtens…ed(chain, authType, host)");
                return listCheckServerTrusted;
            } catch (CertificateException unused) {
            }
        }
        throw new CertificateException("None of the TrustManagers trust this certificate chain: " + C8492c.f4209a.m3884a(host, chain));
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        List list = this.trustPairs;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            X509Certificate[] acceptedIssuers = ((C8489a) it.next()).m3882b().getAcceptedIssuers();
            Intrinsics.checkNotNullExpressionValue(acceptedIssuers, "it.trustManager.acceptedIssuers");
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, ArraysKt___ArraysKt.toList(acceptedIssuers));
        }
        return (X509Certificate[]) arrayList.toArray(new X509Certificate[0]);
    }

    /* renamed from: a */
    public final X509TrustManager m3873a(KeyStore keystore) throws NoSuchAlgorithmException, KeyStoreException {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init(keystore);
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
            e.printStackTrace();
            return null;
        } catch (NoSuchAlgorithmException e2) {
            e = e2;
            e.printStackTrace();
            return null;
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
        Iterator it = this.trustPairs.iterator();
        while (it.hasNext()) {
            try {
                ((C8489a) it.next()).m3882b().checkServerTrusted(chain, authType);
                return;
            } catch (CertificateException unused) {
            }
        }
        throw new CertificateException("None of the TrustManagers trust this certificate chain: " + C8492c.f4209a.m3884a(null, chain));
    }
}
