package com.sdkit.paylib.paylibdomain.impl.products;

import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibpayment.api.network.products.ProductsNetworkClient;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibdomain.impl.products.b */
/* loaded from: classes6.dex */
public final class C8066b implements Factory {

    /* renamed from: a */
    public final Provider f1413a;

    /* renamed from: b */
    public final Provider f1414b;

    public C8066b(Provider provider, Provider provider2) {
        this.f1413a = provider;
        this.f1414b = provider2;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8065a get() {
        return m1623a((ProductsNetworkClient) this.f1413a.get(), (PaylibLoggerFactory) this.f1414b.get());
    }

    /* renamed from: a */
    public static C8065a m1623a(ProductsNetworkClient productsNetworkClient, PaylibLoggerFactory paylibLoggerFactory) {
        return new C8065a(productsNetworkClient, paylibLoggerFactory);
    }

    /* renamed from: a */
    public static C8066b m1624a(Provider provider, Provider provider2) {
        return new C8066b(provider, provider2);
    }
}
