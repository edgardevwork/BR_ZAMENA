package com.sdkit.paylib.paylibdomain.impl.cards;

import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibpayment.api.network.cards.CardsNetworkClient;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibdomain.impl.cards.d */
/* loaded from: classes7.dex */
public final class C8038d implements Factory {

    /* renamed from: a */
    public final Provider f1138a;

    /* renamed from: b */
    public final Provider f1139b;

    public C8038d(Provider provider, Provider provider2) {
        this.f1138a = provider;
        this.f1139b = provider2;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8037c get() {
        return m1458a((CardsNetworkClient) this.f1138a.get(), (PaylibLoggerFactory) this.f1139b.get());
    }

    /* renamed from: a */
    public static C8037c m1458a(CardsNetworkClient cardsNetworkClient, PaylibLoggerFactory paylibLoggerFactory) {
        return new C8037c(cardsNetworkClient, paylibLoggerFactory);
    }

    /* renamed from: a */
    public static C8038d m1459a(Provider provider, Provider provider2) {
        return new C8038d(provider, provider2);
    }
}
