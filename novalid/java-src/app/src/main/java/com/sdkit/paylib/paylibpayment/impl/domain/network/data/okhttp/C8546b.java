package com.sdkit.paylib.paylibpayment.impl.domain.network.data.okhttp;

import com.sdkit.paylib.paylibnetwork.api.domain.client.WebClientFactory;
import com.sdkit.paylib.paylibpayment.api.config.PayLibPaymentFeatureFlags;
import com.sdkit.paylib.paylibpayment.impl.domain.config.InterfaceC8504a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.data.okhttp.b */
/* loaded from: classes8.dex */
public final class C8546b implements Factory {

    /* renamed from: a */
    public final Provider f4981a;

    /* renamed from: b */
    public final Provider f4982b;

    /* renamed from: c */
    public final Provider f4983c;

    /* renamed from: d */
    public final Provider f4984d;

    public C8546b(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f4981a = provider;
        this.f4982b = provider2;
        this.f4983c = provider3;
        this.f4984d = provider4;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8545a get() {
        return m4098a((PayLibPaymentFeatureFlags) this.f4981a.get(), (InterfaceC8504a) this.f4982b.get(), (WebClientFactory) this.f4983c.get(), (C8547c) this.f4984d.get());
    }

    /* renamed from: a */
    public static C8545a m4098a(PayLibPaymentFeatureFlags payLibPaymentFeatureFlags, InterfaceC8504a interfaceC8504a, WebClientFactory webClientFactory, C8547c c8547c) {
        return new C8545a(payLibPaymentFeatureFlags, interfaceC8504a, webClientFactory, c8547c);
    }

    /* renamed from: a */
    public static C8546b m4099a(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new C8546b(provider, provider2, provider3, provider4);
    }
}
