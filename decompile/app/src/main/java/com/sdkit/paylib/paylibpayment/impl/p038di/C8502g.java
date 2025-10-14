package com.sdkit.paylib.paylibpayment.impl.p038di;

import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibpayment.api.domain.PaylibTokenProvider;
import com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8543n;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.di.g */
/* loaded from: classes8.dex */
public final class C8502g implements Factory {

    /* renamed from: a */
    public final Provider f4824a;

    /* renamed from: b */
    public final Provider f4825b;

    public C8502g(Provider provider, Provider provider2) {
        this.f4824a = provider;
        this.f4825b = provider2;
    }

    /* renamed from: a */
    public static C8502g m3938a(Provider provider, Provider provider2) {
        return new C8502g(provider, provider2);
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8543n get() {
        return m3939a((PaylibTokenProvider) this.f4824a.get(), (PaylibLoggerFactory) this.f4825b.get());
    }

    /* renamed from: a */
    public static C8543n m3939a(PaylibTokenProvider paylibTokenProvider, PaylibLoggerFactory paylibLoggerFactory) {
        return (C8543n) Preconditions.checkNotNullFromProvides(C8498c.f4820a.m3926a(paylibTokenProvider, paylibLoggerFactory));
    }
}
