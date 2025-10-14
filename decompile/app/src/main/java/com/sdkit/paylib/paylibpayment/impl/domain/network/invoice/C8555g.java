package com.sdkit.paylib.paylibpayment.impl.domain.network.invoice;

import com.sdkit.paylib.paylibpayment.impl.domain.config.InterfaceC8504a;
import com.sdkit.paylib.paylibpayment.impl.domain.network.json.InterfaceC8556a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.invoice.g */
/* loaded from: classes8.dex */
public final class C8555g implements Factory {

    /* renamed from: a */
    public final Provider f5022a;

    /* renamed from: b */
    public final Provider f5023b;

    public C8555g(Provider provider, Provider provider2) {
        this.f5022a = provider;
        this.f5023b = provider2;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8554f get() {
        return m4141a((InterfaceC8504a) this.f5022a.get(), (InterfaceC8556a) this.f5023b.get());
    }

    /* renamed from: a */
    public static C8554f m4141a(InterfaceC8504a interfaceC8504a, InterfaceC8556a interfaceC8556a) {
        return new C8554f(interfaceC8504a, interfaceC8556a);
    }

    /* renamed from: a */
    public static C8555g m4142a(Provider provider, Provider provider2) {
        return new C8555g(provider, provider2);
    }
}
