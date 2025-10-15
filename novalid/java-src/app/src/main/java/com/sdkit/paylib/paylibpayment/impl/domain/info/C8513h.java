package com.sdkit.paylib.paylibpayment.impl.domain.info;

import com.sdkit.paylib.paylibpayment.api.config.PayLibPaymentFeatureFlags;
import com.sdkit.paylib.paylibpayment.api.domain.PaylibClientInfoProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.info.h */
/* loaded from: classes8.dex */
public final class C8513h implements Factory {

    /* renamed from: a */
    public final Provider f4837a;

    /* renamed from: b */
    public final Provider f4838b;

    /* renamed from: c */
    public final Provider f4839c;

    /* renamed from: d */
    public final Provider f4840d;

    public C8513h(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f4837a = provider;
        this.f4838b = provider2;
        this.f4839c = provider3;
        this.f4840d = provider4;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8512g get() {
        return m3954a((InterfaceC8506a) this.f4837a.get(), (C8509d) this.f4838b.get(), (PaylibClientInfoProvider) this.f4839c.get(), (PayLibPaymentFeatureFlags) this.f4840d.get());
    }

    /* renamed from: a */
    public static C8512g m3954a(InterfaceC8506a interfaceC8506a, C8509d c8509d, PaylibClientInfoProvider paylibClientInfoProvider, PayLibPaymentFeatureFlags payLibPaymentFeatureFlags) {
        return new C8512g(interfaceC8506a, c8509d, paylibClientInfoProvider, payLibPaymentFeatureFlags);
    }

    /* renamed from: a */
    public static C8513h m3955a(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new C8513h(provider, provider2, provider3, provider4);
    }
}
