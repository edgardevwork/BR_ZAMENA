package com.sdkit.paylib.paylibdomain.impl.payment;

import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibdomain.impl.payment.b */
/* loaded from: classes6.dex */
public final class C8064b implements Factory {

    /* renamed from: a */
    public final Provider f1405a;

    public C8064b(Provider provider) {
        this.f1405a = provider;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8063a get() {
        return m1618a((PaylibLoggerFactory) this.f1405a.get());
    }

    /* renamed from: a */
    public static C8063a m1618a(PaylibLoggerFactory paylibLoggerFactory) {
        return new C8063a(paylibLoggerFactory);
    }

    /* renamed from: a */
    public static C8064b m1619a(Provider provider) {
        return new C8064b(provider);
    }
}
