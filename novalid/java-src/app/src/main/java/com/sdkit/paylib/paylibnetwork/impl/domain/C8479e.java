package com.sdkit.paylib.paylibnetwork.impl.domain;

import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibnetwork.impl.ssl.CompositeX509TrustManagerApi24;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.X509TrustManager;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.sdkit.paylib.paylibnetwork.impl.domain.e */
/* loaded from: classes6.dex */
public final class C8479e {

    /* renamed from: a */
    public final Function0 f4173a;

    /* renamed from: b */
    public final boolean f4174b;

    /* renamed from: c */
    public final PaylibLoggerFactory f4175c;

    /* renamed from: d */
    public final Lazy f4176d;

    /* renamed from: e */
    public final Lazy f4177e;

    /* renamed from: com.sdkit.paylib.paylibnetwork.impl.domain.e$a */
    public static final class a extends Lambda implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final SSLContext invoke() throws NoSuchAlgorithmException, KeyManagementException {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new X509TrustManager[]{C8479e.this.m3848b()}, null);
            return sSLContext;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnetwork.impl.domain.e$b */
    public static final class b extends Lambda implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final X509TrustManager invoke() {
            return new CompositeX509TrustManagerApi24((List) C8479e.this.f4173a.invoke(), C8479e.this.f4174b, C8479e.this.f4175c);
        }
    }

    public C8479e(Function0 funcSelfSignedCertificates, boolean z, PaylibLoggerFactory loggerFactory) {
        Intrinsics.checkNotNullParameter(funcSelfSignedCertificates, "funcSelfSignedCertificates");
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        this.f4173a = funcSelfSignedCertificates;
        this.f4174b = z;
        this.f4175c = loggerFactory;
        this.f4176d = LazyKt__LazyJVMKt.lazy(new b());
        this.f4177e = LazyKt__LazyJVMKt.lazy(new a());
    }

    /* renamed from: a */
    public final SSLContext m3847a() {
        Object value = this.f4177e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-sslContext>(...)");
        return (SSLContext) value;
    }

    /* renamed from: b */
    public final X509TrustManager m3848b() {
        return (X509TrustManager) this.f4176d.getValue();
    }
}
