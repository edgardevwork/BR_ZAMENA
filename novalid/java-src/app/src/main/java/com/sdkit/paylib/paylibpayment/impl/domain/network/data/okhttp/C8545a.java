package com.sdkit.paylib.paylibpayment.impl.domain.network.data.okhttp;

import com.sdkit.paylib.paylibnetwork.api.domain.client.WebClient;
import com.sdkit.paylib.paylibnetwork.api.domain.client.WebClientFactory;
import com.sdkit.paylib.paylibpayment.api.config.PayLibPaymentFeatureFlags;
import com.sdkit.paylib.paylibpayment.impl.domain.config.InterfaceC8504a;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.data.okhttp.a */
/* loaded from: classes8.dex */
public final class C8545a {

    /* renamed from: a */
    public final PayLibPaymentFeatureFlags f4977a;

    /* renamed from: b */
    public final InterfaceC8504a f4978b;

    /* renamed from: c */
    public final WebClientFactory f4979c;

    /* renamed from: d */
    public final C8547c f4980d;

    public C8545a(PayLibPaymentFeatureFlags featureFlags, InterfaceC8504a internalConfig, WebClientFactory webClientFactory, C8547c webClientConfigFactory) {
        Intrinsics.checkNotNullParameter(featureFlags, "featureFlags");
        Intrinsics.checkNotNullParameter(internalConfig, "internalConfig");
        Intrinsics.checkNotNullParameter(webClientFactory, "webClientFactory");
        Intrinsics.checkNotNullParameter(webClientConfigFactory, "webClientConfigFactory");
        this.f4977a = featureFlags;
        this.f4978b = internalConfig;
        this.f4979c = webClientFactory;
        this.f4980d = webClientConfigFactory;
    }

    /* renamed from: a */
    public final WebClient m4097a() {
        return this.f4979c.create(this.f4980d.m4101a(!(this.f4978b.mo3942a() && this.f4977a.isSslPinningEnabled())));
    }
}
