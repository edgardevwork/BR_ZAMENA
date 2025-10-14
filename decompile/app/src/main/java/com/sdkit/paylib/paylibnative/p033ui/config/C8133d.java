package com.sdkit.paylib.paylibnative.p033ui.config;

import com.sdkit.paylib.paylibnative.api.config.PaylibNativeFeatureFlags;
import com.sdkit.paylib.paylibnative.api.presentation.PaylibNativeConfigProvider;
import com.sdkit.paylib.paylibpayment.api.config.InternalConfigProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.config.d */
/* loaded from: classes6.dex */
public final class C8133d implements Factory {

    /* renamed from: a */
    public final Provider f1951a;

    /* renamed from: b */
    public final Provider f1952b;

    /* renamed from: c */
    public final Provider f1953c;

    public C8133d(Provider provider, Provider provider2, Provider provider3) {
        this.f1951a = provider;
        this.f1952b = provider2;
        this.f1953c = provider3;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8132c get() {
        return m2015a((PaylibNativeFeatureFlags) this.f1951a.get(), (InternalConfigProvider) this.f1952b.get(), (PaylibNativeConfigProvider) this.f1953c.get());
    }

    /* renamed from: a */
    public static C8132c m2015a(PaylibNativeFeatureFlags paylibNativeFeatureFlags, InternalConfigProvider internalConfigProvider, PaylibNativeConfigProvider paylibNativeConfigProvider) {
        return new C8132c(paylibNativeFeatureFlags, internalConfigProvider, paylibNativeConfigProvider);
    }

    /* renamed from: a */
    public static C8133d m2016a(Provider provider, Provider provider2, Provider provider3) {
        return new C8133d(provider, provider2, provider3);
    }
}
