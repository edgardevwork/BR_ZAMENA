package com.sdkit.paylib.paylibnetwork.impl.domain;

import com.sdkit.paylib.paylibnetwork.impl.domain.certificatepinning.C8464b;
import com.sdkit.paylib.paylibnetwork.impl.domain.certificatepinning.InterfaceC8463a;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.CertificatePinner;
import okhttp3.OkHttpClient;

/* renamed from: com.sdkit.paylib.paylibnetwork.impl.domain.c */
/* loaded from: classes6.dex */
public final class C8462c {

    /* renamed from: a */
    public final C8464b f4142a;

    /* renamed from: b */
    public final C8479e f4143b;

    public C8462c(C8464b pinEntryProvider, C8479e sslProvider) {
        Intrinsics.checkNotNullParameter(pinEntryProvider, "pinEntryProvider");
        Intrinsics.checkNotNullParameter(sslProvider, "sslProvider");
        this.f4142a = pinEntryProvider;
        this.f4143b = sslProvider;
    }

    /* renamed from: a */
    public final CertificatePinner.Builder m3812a(CertificatePinner.Builder builder) {
        for (InterfaceC8463a interfaceC8463a : this.f4142a.m3816a()) {
            builder = builder.add(interfaceC8463a.mo3814a(), interfaceC8463a.mo3815b());
        }
        return builder;
    }

    /* renamed from: a */
    public final OkHttpClient.Builder m3813a(OkHttpClient.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        CertificatePinner certificatePinnerBuild = m3812a(new CertificatePinner.Builder()).build();
        SSLSocketFactory socketFactory = this.f4143b.m3847a().getSocketFactory();
        Intrinsics.checkNotNullExpressionValue(socketFactory, "sslProvider.sslContext.socketFactory");
        return builder.sslSocketFactory(socketFactory, this.f4143b.m3848b()).certificatePinner(certificatePinnerBuild);
    }
}
