package com.sdkit.paylib.paylibnetwork.impl.domain;

import android.content.Context;
import android.content.res.Resources;
import android.net.http.SslCertificate;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibnetwork.api.domain.WebViewCertificateVerifier;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
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
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.p051io.CloseableKt;
import ru.rustore.sdk.billingclient.C11403R;

/* renamed from: com.sdkit.paylib.paylibnetwork.impl.domain.h */
/* loaded from: classes6.dex */
public final class C8482h implements WebViewCertificateVerifier {

    /* renamed from: a */
    public final Context f4187a;

    /* renamed from: b */
    public final Lazy f4188b;

    /* renamed from: c */
    public final Lazy f4189c;

    /* renamed from: d */
    public final PaylibLogger f4190d;

    /* renamed from: com.sdkit.paylib.paylibnetwork.impl.domain.h$a */
    public static final class a extends Lambda implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final List invoke() throws Resources.NotFoundException, CertificateException {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(C11403R.raw.paylib_network_globalsign_gcc_r3_dv_tls_ca_2020), Integer.valueOf(C11403R.raw.paylib_network_ministry_of_digital_dev), Integer.valueOf(C11403R.raw.paylib_network_ministry_of_digital_root), Integer.valueOf(C11403R.raw.paylib_network_ministry_of_digital_sub), Integer.valueOf(C11403R.raw.paylib_network_ministry_of_digital_new), Integer.valueOf(C11403R.raw.paylib_network_sbol_ca_root_ext), Integer.valueOf(C11403R.raw.paylib_network_sbol_ca_root_ext_web)});
            C8482h c8482h = C8482h.this;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listListOf, 10));
            Iterator it = listListOf.iterator();
            while (it.hasNext()) {
                InputStream inputStreamOpenRawResource = c8482h.f4187a.getResources().openRawResource(((Number) it.next()).intValue());
                try {
                    Certificate certificateGenerateCertificate = certificateFactory.generateCertificate(inputStreamOpenRawResource);
                    CloseableKt.closeFinally(inputStreamOpenRawResource, null);
                    arrayList.add(certificateGenerateCertificate);
                } finally {
                }
            }
            return arrayList;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnetwork.impl.domain.h$b */
    public static final class b extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ CertificateException f4192a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CertificateException certificateException) {
            super(0);
            this.f4192a = certificateException;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            String message = this.f4192a.getMessage();
            return message == null ? "" : message;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnetwork.impl.domain.h$c */
    public static final class c extends Lambda implements Function0 {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final TrustManagerFactory invoke() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
            KeyStore keyStore = KeyStore.getInstance("BKS");
            Intrinsics.checkNotNullExpressionValue(keyStore, "getInstance(\"BKS\")");
            keyStore.load(null, null);
            int size = C8482h.this.m3864a().size();
            for (int i = 0; i < size; i++) {
                keyStore.setCertificateEntry("av-ca" + i, (Certificate) C8482h.this.m3864a().get(i));
            }
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init(keyStore);
            return trustManagerFactory;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnetwork.impl.domain.h$d */
    public static final class d extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ IllegalArgumentException f4194a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(IllegalArgumentException illegalArgumentException) {
            super(0);
            this.f4194a = illegalArgumentException;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            String message = this.f4194a.getMessage();
            return message == null ? "" : message;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnetwork.impl.domain.h$e */
    public static final class e extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ CertificateException f4195a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(CertificateException certificateException) {
            super(0);
            this.f4195a = certificateException;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            String message = this.f4195a.getMessage();
            return message == null ? "" : message;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnetwork.impl.domain.h$f */
    public static final class f extends Lambda implements Function0 {

        /* renamed from: a */
        public static final f f4196a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "verifyCert failed";
        }
    }

    public C8482h(Context context, PaylibLoggerFactory loggerFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        this.f4187a = context;
        this.f4188b = LazyKt__LazyJVMKt.lazy(new c());
        this.f4189c = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new a());
        this.f4190d = loggerFactory.get("WebViewCertificateVerifierImpl");
    }

    /* renamed from: a */
    public final Certificate m3863a(byte[] bArr) throws CertificateException {
        if (bArr == null) {
            return null;
        }
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            Intrinsics.checkNotNullExpressionValue(certificateFactory, "getInstance(\"X.509\")");
            return certificateFactory.generateCertificate(new ByteArrayInputStream(bArr));
        } catch (CertificateException e2) {
            this.f4190d.mo1701e(e2, new b(e2));
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sdkit.paylib.paylibnetwork.api.domain.WebViewCertificateVerifier
    public boolean verifyCert(Object obj) throws CertificateException {
        Function0<String> eVar;
        PaylibLogger paylibLogger;
        CertificateException certificateException;
        if (!(obj instanceof SslCertificate)) {
            return false;
        }
        Certificate certificateM3863a = m3863a(SslCertificate.saveState((SslCertificate) obj).getByteArray("x509-certificate"));
        try {
            X509Certificate[] x509CertificateArr = {certificateM3863a instanceof X509Certificate ? (X509Certificate) certificateM3863a : null};
            TrustManager[] trustManagers = m3865b().getTrustManagers();
            Intrinsics.checkNotNullExpressionValue(trustManagers, "trustManagerFactory.trustManagers");
            for (TrustManager trustManager : trustManagers) {
                if (trustManager instanceof X509TrustManager) {
                    try {
                        try {
                            ((X509TrustManager) trustManager).checkServerTrusted(x509CertificateArr, "generic");
                            return true;
                        } catch (CertificateException e2) {
                            PaylibLogger paylibLogger2 = this.f4190d;
                            eVar = new e(e2);
                            certificateException = e2;
                            paylibLogger = paylibLogger2;
                            paylibLogger.mo1701e(certificateException, eVar);
                        }
                    } catch (IllegalArgumentException e3) {
                        PaylibLogger paylibLogger3 = this.f4190d;
                        eVar = new d(e3);
                        certificateException = e3;
                        paylibLogger = paylibLogger3;
                        paylibLogger.mo1701e(certificateException, eVar);
                    }
                }
            }
            return false;
        } catch (IllegalStateException e4) {
            this.f4190d.mo1701e(e4, f.f4196a);
            return false;
        }
    }

    /* renamed from: a */
    public final List m3864a() {
        return (List) this.f4189c.getValue();
    }

    /* renamed from: b */
    public final TrustManagerFactory m3865b() {
        Object value = this.f4188b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-trustManagerFactory>(...)");
        return (TrustManagerFactory) value;
    }
}
