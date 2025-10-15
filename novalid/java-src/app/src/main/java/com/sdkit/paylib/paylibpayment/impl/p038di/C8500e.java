package com.sdkit.paylib.paylibpayment.impl.p038di;

import com.sdkit.paylib.paylibpayment.impl.dependencies.InterfaceC8493a;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.di.e */
/* loaded from: classes8.dex */
public final class C8500e implements Factory {

    /* renamed from: a */
    public final Provider f4822a;

    public C8500e(Provider provider) {
        this.f4822a = provider;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC8493a get() {
        return m3931a((PaylibPaymentDependencies) this.f4822a.get());
    }

    /* renamed from: a */
    public static InterfaceC8493a m3931a(PaylibPaymentDependencies paylibPaymentDependencies) {
        return (InterfaceC8493a) Preconditions.checkNotNullFromProvides(C8498c.f4820a.m3924a(paylibPaymentDependencies));
    }

    /* renamed from: a */
    public static C8500e m3932a(Provider provider) {
        return new C8500e(provider);
    }
}
