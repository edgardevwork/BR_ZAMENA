package com.sdkit.paylib.paylibdomain.impl.cards;

import com.sdkit.paylib.paylibdomain.api.payment.PaymentMethodSelector;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibdomain.impl.cards.b */
/* loaded from: classes7.dex */
public final class C8036b implements Factory {

    /* renamed from: a */
    public final Provider f1110a;

    public C8036b(Provider provider) {
        this.f1110a = provider;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8035a get() {
        return m1446a((PaymentMethodSelector) this.f1110a.get());
    }

    /* renamed from: a */
    public static C8035a m1446a(PaymentMethodSelector paymentMethodSelector) {
        return new C8035a(paymentMethodSelector);
    }

    /* renamed from: a */
    public static C8036b m1447a(Provider provider) {
        return new C8036b(provider);
    }
}
