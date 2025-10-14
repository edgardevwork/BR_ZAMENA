package com.sdkit.paylib.paylibpayment.impl.p038di;

import com.sdkit.paylib.paylibpayment.impl.dependencies.InterfaceC8493a;
import com.sdkit.paylib.paylibpayment.impl.domain.config.InterfaceC8504a;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.di.d */
/* loaded from: classes6.dex */
public final class C8499d implements Factory {

    /* renamed from: a */
    public final Provider f4821a;

    public C8499d(Provider provider) {
        this.f4821a = provider;
    }

    /* renamed from: a */
    public static C8499d m3928a(Provider provider) {
        return new C8499d(provider);
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC8504a get() {
        return m3929a((InterfaceC8493a) this.f4821a.get());
    }

    /* renamed from: a */
    public static InterfaceC8504a m3929a(InterfaceC8493a interfaceC8493a) {
        return (InterfaceC8504a) Preconditions.checkNotNullFromProvides(C8498c.f4820a.m3925a(interfaceC8493a));
    }
}
