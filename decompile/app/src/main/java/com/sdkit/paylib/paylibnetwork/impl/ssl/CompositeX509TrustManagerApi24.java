package com.sdkit.paylib.paylibnetwork.impl.ssl;

import android.net.http.X509TrustManagerExtensions;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibnetwork.impl.utils.C8492c;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.Socket;
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
import javax.net.ssl.SSLEngine;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.p051io.CloseableKt;
import kotlin.text.Charsets;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B%\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J/\u0010\n\u001a\u00020\t2\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ1\u0010\n\u001a\u00020\t2\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\n\u0010\u000eJ/\u0010\u000f\u001a\u00020\t2\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u000bJ1\u0010\u000f\u001a\u00020\t2\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ+\u0010\n\u001a\u00020\t2\u0010\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\n\u0010\u0010J+\u0010\u000f\u001a\u00020\t2\u0010\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J;\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0010\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u000f\u0010\u0013J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006("}, m7105d2 = {"Lcom/sdkit/paylib/paylibnetwork/impl/ssl/CompositeX509TrustManagerApi24;", "Ljavax/net/ssl/X509ExtendedTrustManager;", "", "Ljava/security/cert/X509Certificate;", "chain", "", "authType", "Ljava/net/Socket;", "conn", "", "checkClientTrusted", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljava/net/Socket;)V", "Ljavax/net/ssl/SSLEngine;", "ssl", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljavax/net/ssl/SSLEngine;)V", "checkServerTrusted", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V", "host", "", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "getAcceptedIssuers", "()[Ljava/security/cert/X509Certificate;", "Ljava/security/KeyStore;", "keystore", "Ljavax/net/ssl/X509TrustManager;", "a", "Lcom/sdkit/paylib/payliblogging/api/logging/PaylibLogger;", "Lcom/sdkit/paylib/payliblogging/api/logging/PaylibLogger;", "logger", "Lcom/sdkit/paylib/paylibnetwork/impl/ssl/a;", "b", "Ljava/util/List;", "pairs", "selfSignedCertificates", "", "withDefaultRoots", "Lcom/sdkit/paylib/payliblogging/api/logging/PaylibLoggerFactory;", "loggerFactory", SegmentConstantPool.INITSTRING, "(Ljava/util/List;ZLcom/sdkit/paylib/payliblogging/api/logging/PaylibLoggerFactory;)V", "com-sdkit-assistant_paylib_network"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class CompositeX509TrustManagerApi24 extends X509ExtendedTrustManager {

    /* renamed from: a, reason: from kotlin metadata */
    public final PaylibLogger logger;

    /* renamed from: b, reason: from kotlin metadata */
    public final List pairs;

    /* renamed from: com.sdkit.paylib.paylibnetwork.impl.ssl.CompositeX509TrustManagerApi24$a */
    public static final class C8484a extends Lambda implements Function0 {

        /* renamed from: a */
        public static final C8484a f4200a = new C8484a();

        public C8484a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "init";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnetwork.impl.ssl.CompositeX509TrustManagerApi24$b */
    public static final class C8485b extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ Exception f4201a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8485b(Exception exc) {
            super(0);
            this.f4201a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "X509TrustManagerExtensions init error " + this.f4201a;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnetwork.impl.ssl.CompositeX509TrustManagerApi24$c */
    public static final class C8486c extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ Exception f4202a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8486c(Exception exc) {
            super(0);
            this.f4202a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "X509TrustManagerExtensions init error " + this.f4202a;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnetwork.impl.ssl.CompositeX509TrustManagerApi24$d */
    public static final class C8487d extends Lambda implements Function0 {

        /* renamed from: a */
        public static final C8487d f4203a = new C8487d();

        public C8487d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "getTrustManager NoSuchAlgorithmException";
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnetwork.impl.ssl.CompositeX509TrustManagerApi24$e */
    public static final class C8488e extends Lambda implements Function0 {

        /* renamed from: a */
        public static final C8488e f4204a = new C8488e();

        public C8488e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "getTrustManager KeyStoreException";
        }
    }

    public CompositeX509TrustManagerApi24(List selfSignedCertificates, boolean z, PaylibLoggerFactory loggerFactory) throws NoSuchAlgorithmException, IOException, CertificateException, KeyStoreException {
        X509TrustManager x509TrustManagerM3874a;
        Intrinsics.checkNotNullParameter(selfSignedCertificates, "selfSignedCertificates");
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        PaylibLogger paylibLogger = loggerFactory.get("CompositeX509TrustManagerApi24");
        this.logger = paylibLogger;
        PaylibLogger.DefaultImpls.d$default(paylibLogger, null, C8484a.f4200a, 1, null);
        ArrayList arrayList = new ArrayList();
        if (z && (x509TrustManagerM3874a = m3874a(this, null, 1, null)) != null) {
            try {
                arrayList.add(new C8489a(x509TrustManagerM3874a, new X509TrustManagerExtensions(x509TrustManagerM3874a)));
            } catch (Exception e) {
                PaylibLogger.DefaultImpls.e$default(this.logger, null, new C8485b(e), 1, null);
                Unit unit = Unit.INSTANCE;
            }
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
            X509TrustManager x509TrustManagerM3875a = m3875a(keyStore);
            if (x509TrustManagerM3875a != null) {
                try {
                    arrayList.add(new C8489a(x509TrustManagerM3875a, new X509TrustManagerExtensions(x509TrustManagerM3875a)));
                } catch (Exception e2) {
                    PaylibLogger.DefaultImpls.e$default(this.logger, null, new C8486c(e2), 1, null);
                    Unit unit2 = Unit.INSTANCE;
                }
            }
        }
        this.pairs = arrayList;
    }

    /* renamed from: a */
    public static /* synthetic */ X509TrustManager m3874a(CompositeX509TrustManagerApi24 compositeX509TrustManagerApi24, KeyStore keyStore, int i, Object obj) {
        if ((i & 1) != 0) {
            keyStore = null;
        }
        return compositeX509TrustManagerApi24.m3875a(keyStore);
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
        Iterator it = this.pairs.iterator();
        while (it.hasNext()) {
            try {
                ((C8489a) it.next()).m3882b().checkClientTrusted(chain, authType);
                return;
            } catch (CertificateException unused) {
            }
        }
        throw new CertificateException("None of the TrustManagers trust this certificate chain: " + C8492c.f4209a.m3884a(null, chain));
    }

    public final List<X509Certificate> checkServerTrusted(X509Certificate[] chain, String authType, String host) throws CertificateException {
        Iterator it = this.pairs.iterator();
        while (it.hasNext()) {
            try {
                List<X509Certificate> listCheckServerTrusted = ((C8489a) it.next()).m3881a().checkServerTrusted(chain, authType, host);
                Intrinsics.checkNotNullExpressionValue(listCheckServerTrusted, "pair.trustExtensions.che…ed(chain, authType, host)");
                return listCheckServerTrusted;
            } catch (CertificateException unused) {
            }
        }
        throw new CertificateException("None of the TrustManagers trust this certificate chain: " + C8492c.f4209a.m3884a(host, chain));
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        List list = this.pairs;
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
    public final X509TrustManager m3875a(KeyStore keystore) throws NoSuchAlgorithmException, KeyStoreException {
        PaylibLogger paylibLogger;
        Function0<String> function0;
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
            paylibLogger = this.logger;
            function0 = C8488e.f4204a;
            paylibLogger.mo1701e(e, function0);
            return null;
        } catch (NoSuchAlgorithmException e2) {
            e = e2;
            paylibLogger = this.logger;
            function0 = C8487d.f4203a;
            paylibLogger.mo1701e(e, function0);
            return null;
        }
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkClientTrusted(X509Certificate[] chain, String authType, Socket conn) throws CertificateException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(authType, "authType");
        Intrinsics.checkNotNullParameter(conn, "conn");
        checkClientTrusted(chain, authType);
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
        Iterator it = this.pairs.iterator();
        while (it.hasNext()) {
            try {
                ((C8489a) it.next()).m3882b().checkServerTrusted(chain, authType);
                return;
            } catch (CertificateException unused) {
            }
        }
        throw new CertificateException("None of the TrustManagers trust this certificate chain: " + C8492c.f4209a.m3884a(null, chain));
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkClientTrusted(X509Certificate[] chain, String authType, SSLEngine ssl) throws CertificateException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(ssl, "ssl");
        checkClientTrusted(chain, authType);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkServerTrusted(X509Certificate[] chain, String authType, Socket conn) throws CertificateException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(authType, "authType");
        Intrinsics.checkNotNullParameter(conn, "conn");
        String hostName = conn.getInetAddress().getHostName();
        Iterator it = this.pairs.iterator();
        while (it.hasNext()) {
            try {
                ((C8489a) it.next()).m3881a().checkServerTrusted(chain, authType, hostName);
                return;
            } catch (CertificateException unused) {
            }
        }
        throw new CertificateException("None of the TrustManagers trust this certificate chain: " + C8492c.f4209a.m3884a(hostName, chain));
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkServerTrusted(X509Certificate[] chain, String authType, SSLEngine ssl) throws CertificateException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(ssl, "ssl");
        String peerHost = ssl.getSession().getPeerHost();
        Iterator it = this.pairs.iterator();
        while (it.hasNext()) {
            try {
                ((C8489a) it.next()).m3881a().checkServerTrusted(chain, authType, peerHost);
                return;
            } catch (CertificateException unused) {
            }
        }
        throw new CertificateException("None of the TrustManagers trust this certificate chain: " + C8492c.f4209a.m3884a(peerHost, chain));
    }
}
