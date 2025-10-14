package com.sdkit.paylib.paylibsdk.client;

import com.sdkit.paylib.paylibdomain.api.p027di.PaylibDomainTools;
import com.sdkit.paylib.payliblogging.api.p029di.PaylibLoggingTools;
import com.sdkit.paylib.paylibnative.api.p031di.PaylibNativeTools;
import com.sdkit.paylib.paylibpayment.api.p037di.PaylibPaymentTools;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class PaylibSdk_Factory implements Factory<PaylibSdk> {

    /* renamed from: a */
    public final Provider f5816a;

    /* renamed from: b */
    public final Provider f5817b;

    /* renamed from: c */
    public final Provider f5818c;

    /* renamed from: d */
    public final Provider f5819d;

    public PaylibSdk_Factory(Provider<PaylibLoggingTools> provider, Provider<PaylibPaymentTools> provider2, Provider<PaylibDomainTools> provider3, Provider<PaylibNativeTools> provider4) {
        this.f5816a = provider;
        this.f5817b = provider2;
        this.f5818c = provider3;
        this.f5819d = provider4;
    }

    public static PaylibSdk_Factory create(Provider<PaylibLoggingTools> provider, Provider<PaylibPaymentTools> provider2, Provider<PaylibDomainTools> provider3, Provider<PaylibNativeTools> provider4) {
        return new PaylibSdk_Factory(provider, provider2, provider3, provider4);
    }

    public static PaylibSdk newInstance(Lazy<PaylibLoggingTools> lazy, Lazy<PaylibPaymentTools> lazy2, Lazy<PaylibDomainTools> lazy3, Lazy<PaylibNativeTools> lazy4) {
        return new PaylibSdk(lazy, lazy2, lazy3, lazy4);
    }

    @Override // javax.inject.Provider
    public PaylibSdk get() {
        return newInstance(DoubleCheck.lazy(this.f5816a), DoubleCheck.lazy(this.f5817b), DoubleCheck.lazy(this.f5818c), DoubleCheck.lazy(this.f5819d));
    }
}
