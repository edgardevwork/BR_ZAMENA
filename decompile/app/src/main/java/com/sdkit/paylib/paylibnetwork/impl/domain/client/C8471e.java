package com.sdkit.paylib.paylibnetwork.impl.domain.client;

import com.sdkit.paylib.paylibnetwork.impl.domain.C8462c;
import com.sdkit.paylib.paylibnetwork.impl.domain.security.C8483a;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

/* renamed from: com.sdkit.paylib.paylibnetwork.impl.domain.client.e */
/* loaded from: classes6.dex */
public final class C8471e {

    /* renamed from: a */
    public final C8462c f4153a;

    public C8471e(C8462c okHttpClientBuilderSslModifier) {
        Intrinsics.checkNotNullParameter(okHttpClientBuilderSslModifier, "okHttpClientBuilderSslModifier");
        this.f4153a = okHttpClientBuilderSslModifier;
    }

    /* renamed from: a */
    public final void m3827a(OkHttpClient.Builder builder) throws NoSuchAlgorithmException, KeyManagementException {
        Intrinsics.checkNotNullParameter(builder, "builder");
        C8483a c8483a = new C8483a();
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.init(null, new C8483a[]{c8483a}, null);
        SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
        Intrinsics.checkNotNullExpressionValue(socketFactory, "debugSslContext.socketFactory");
        builder.sslSocketFactory(socketFactory, c8483a);
    }

    /* renamed from: b */
    public final OkHttpClient.Builder m3828b(OkHttpClient.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        return this.f4153a.m3813a(builder);
    }
}
