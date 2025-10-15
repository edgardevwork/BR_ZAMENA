package com.sdkit.paylib.paylibnative.p033ui.core.common;

import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibplatform.api.coroutines.CoroutineDispatchers;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.core.common.c */
/* loaded from: classes6.dex */
public final class C8138c implements Factory {

    /* renamed from: a */
    public final Provider f1977a;

    /* renamed from: b */
    public final Provider f1978b;

    public C8138c(Provider provider, Provider provider2) {
        this.f1977a = provider;
        this.f1978b = provider2;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8137b get() {
        return m2028a((CoroutineDispatchers) this.f1977a.get(), (PaylibLoggerFactory) this.f1978b.get());
    }

    /* renamed from: a */
    public static C8137b m2028a(CoroutineDispatchers coroutineDispatchers, PaylibLoggerFactory paylibLoggerFactory) {
        return new C8137b(coroutineDispatchers, paylibLoggerFactory);
    }

    /* renamed from: a */
    public static C8138c m2029a(Provider provider, Provider provider2) {
        return new C8138c(provider, provider2);
    }
}
