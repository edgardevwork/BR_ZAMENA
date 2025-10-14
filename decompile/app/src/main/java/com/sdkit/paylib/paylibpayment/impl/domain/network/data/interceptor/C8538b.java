package com.sdkit.paylib.paylibpayment.impl.domain.network.data.interceptor;

import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.data.interceptor.b */
/* loaded from: classes8.dex */
public final class C8538b implements Factory {

    /* renamed from: a */
    public final Provider f4947a;

    public C8538b(Provider provider) {
        this.f4947a = provider;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8537a get() {
        return m4067a((PaylibLoggerFactory) this.f4947a.get());
    }

    /* renamed from: a */
    public static C8537a m4067a(PaylibLoggerFactory paylibLoggerFactory) {
        return new C8537a(paylibLoggerFactory);
    }

    /* renamed from: a */
    public static C8538b m4068a(Provider provider) {
        return new C8538b(provider);
    }
}
