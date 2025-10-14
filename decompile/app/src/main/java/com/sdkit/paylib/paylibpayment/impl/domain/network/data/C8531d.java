package com.sdkit.paylib.paylibpayment.impl.domain.network.data;

import com.sdkit.paylib.paylibnetwork.api.domain.NetworkDetector;
import com.sdkit.paylib.paylibnetwork.api.domain.PingInternetDetector;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.data.d */
/* loaded from: classes8.dex */
public final class C8531d implements Factory {

    /* renamed from: a */
    public final Provider f4882a;

    /* renamed from: b */
    public final Provider f4883b;

    public C8531d(Provider provider, Provider provider2) {
        this.f4882a = provider;
        this.f4883b = provider2;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8530c get() {
        return m4003a((NetworkDetector) this.f4882a.get(), (PingInternetDetector) this.f4883b.get());
    }

    /* renamed from: a */
    public static C8530c m4003a(NetworkDetector networkDetector, PingInternetDetector pingInternetDetector) {
        return new C8530c(networkDetector, pingInternetDetector);
    }

    /* renamed from: a */
    public static C8531d m4004a(Provider provider, Provider provider2) {
        return new C8531d(provider, provider2);
    }
}
