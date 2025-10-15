package com.sdkit.paylib.paylibnetwork.impl.domain.client;

import com.sdkit.paylib.paylibnetwork.api.domain.client.WebClientConfig;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

/* renamed from: com.sdkit.paylib.paylibnetwork.impl.domain.client.c */
/* loaded from: classes6.dex */
public final class C8469c {

    /* renamed from: a */
    public final C8471e f4151a;

    public C8469c(C8471e okHttpClientModifier) {
        Intrinsics.checkNotNullParameter(okHttpClientModifier, "okHttpClientModifier");
        this.f4151a = okHttpClientModifier;
    }

    /* renamed from: a */
    public final OkHttpClient m3823a(WebClientConfig config) throws NoSuchAlgorithmException, KeyManagementException {
        Intrinsics.checkNotNullParameter(config, "config");
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        if (AbstractC8477k.m3840a(config)) {
            this.f4151a.m3827a(builder);
        } else {
            this.f4151a.m3828b(builder);
        }
        return builder.build();
    }
}
