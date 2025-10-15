package com.sdkit.paylib.paylibnetwork.impl.domain.client;

import com.sdkit.paylib.paylibnetwork.api.domain.client.WebClientConfig;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnetwork.impl.domain.client.i */
/* loaded from: classes6.dex */
public final class C8475i {

    /* renamed from: a */
    public final Provider f4166a;

    public C8475i(Provider provider) {
        this.f4166a = provider;
    }

    /* renamed from: a */
    public C8473g m3837a(WebClientConfig webClientConfig) {
        return m3835a((C8469c) this.f4166a.get(), webClientConfig);
    }

    /* renamed from: a */
    public static C8473g m3835a(C8469c c8469c, WebClientConfig webClientConfig) {
        return new C8473g(c8469c, webClientConfig);
    }

    /* renamed from: a */
    public static C8475i m3836a(Provider provider) {
        return new C8475i(provider);
    }
}
