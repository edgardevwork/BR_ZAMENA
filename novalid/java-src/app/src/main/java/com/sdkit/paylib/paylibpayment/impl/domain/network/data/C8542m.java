package com.sdkit.paylib.paylibpayment.impl.domain.network.data;

import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibpayment.api.config.PayLibPaymentFeatureFlags;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.data.m */
/* loaded from: classes8.dex */
public final class C8542m {

    /* renamed from: a */
    public final Provider f4960a;

    /* renamed from: b */
    public final Provider f4961b;

    public C8542m(Provider provider, Provider provider2) {
        this.f4960a = provider;
        this.f4961b = provider2;
    }

    /* renamed from: a */
    public C8539j m4089a() {
        return m4087a((PayLibPaymentFeatureFlags) this.f4960a.get(), (PaylibLoggerFactory) this.f4961b.get());
    }

    /* renamed from: a */
    public static C8539j m4087a(PayLibPaymentFeatureFlags payLibPaymentFeatureFlags, PaylibLoggerFactory paylibLoggerFactory) {
        return new C8539j(payLibPaymentFeatureFlags, paylibLoggerFactory);
    }

    /* renamed from: a */
    public static C8542m m4088a(Provider provider, Provider provider2) {
        return new C8542m(provider, provider2);
    }
}
