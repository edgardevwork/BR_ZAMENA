package com.sdkit.paylib.paylibdomain.impl.deeplink;

import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibdomain.impl.deeplink.d */
/* loaded from: classes7.dex */
public final class C8042d implements Factory {

    /* renamed from: a */
    public final Provider f1150a;

    /* renamed from: b */
    public final Provider f1151b;

    public C8042d(Provider provider, Provider provider2) {
        this.f1150a = provider;
        this.f1151b = provider2;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8041c get() {
        return m1475a((C8039a) this.f1150a.get(), (PaylibLoggerFactory) this.f1151b.get());
    }

    /* renamed from: a */
    public static C8041c m1475a(C8039a c8039a, PaylibLoggerFactory paylibLoggerFactory) {
        return new C8041c(c8039a, paylibLoggerFactory);
    }

    /* renamed from: a */
    public static C8042d m1476a(Provider provider, Provider provider2) {
        return new C8042d(provider, provider2);
    }
}
