package com.sdkit.paylib.paylibdomain.impl.applications;

import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibpayment.api.network.applications.ApplicationsNetworkClient;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibdomain.impl.applications.b */
/* loaded from: classes7.dex */
public final class C8034b implements Factory {

    /* renamed from: a */
    public final Provider f1105a;

    /* renamed from: b */
    public final Provider f1106b;

    public C8034b(Provider provider, Provider provider2) {
        this.f1105a = provider;
        this.f1106b = provider2;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8033a get() {
        return m1441a((ApplicationsNetworkClient) this.f1105a.get(), (PaylibLoggerFactory) this.f1106b.get());
    }

    /* renamed from: a */
    public static C8033a m1441a(ApplicationsNetworkClient applicationsNetworkClient, PaylibLoggerFactory paylibLoggerFactory) {
        return new C8033a(applicationsNetworkClient, paylibLoggerFactory);
    }

    /* renamed from: a */
    public static C8034b m1442a(Provider provider, Provider provider2) {
        return new C8034b(provider, provider2);
    }
}
