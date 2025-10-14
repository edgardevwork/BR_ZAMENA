package com.sdkit.paylib.payliblogging.impl.logging;

import com.sdkit.paylib.payliblogging.api.logging.ExternalPaylibLoggerFactory;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggingConfig;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.payliblogging.impl.logging.b */
/* loaded from: classes6.dex */
public final class C8079b implements Factory {

    /* renamed from: a */
    public final Provider f1577a;

    /* renamed from: b */
    public final Provider f1578b;

    public C8079b(Provider provider, Provider provider2) {
        this.f1577a = provider;
        this.f1578b = provider2;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8078a get() {
        return m1712a((ExternalPaylibLoggerFactory) this.f1577a.get(), (PaylibLoggingConfig) this.f1578b.get());
    }

    /* renamed from: a */
    public static C8078a m1712a(ExternalPaylibLoggerFactory externalPaylibLoggerFactory, PaylibLoggingConfig paylibLoggingConfig) {
        return new C8078a(externalPaylibLoggerFactory, paylibLoggingConfig);
    }

    /* renamed from: a */
    public static C8079b m1713a(Provider provider, Provider provider2) {
        return new C8079b(provider, provider2);
    }
}
