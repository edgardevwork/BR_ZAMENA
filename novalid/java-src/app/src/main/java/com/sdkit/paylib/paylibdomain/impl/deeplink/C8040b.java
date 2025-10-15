package com.sdkit.paylib.paylibdomain.impl.deeplink;

import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibdomain.impl.deeplink.b */
/* loaded from: classes7.dex */
public final class C8040b implements Factory {

    /* renamed from: a */
    public final Provider f1144a;

    public C8040b(Provider provider) {
        this.f1144a = provider;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8039a get() {
        return m1469a((PaylibLoggerFactory) this.f1144a.get());
    }

    /* renamed from: a */
    public static C8039a m1469a(PaylibLoggerFactory paylibLoggerFactory) {
        return new C8039a(paylibLoggerFactory);
    }

    /* renamed from: a */
    public static C8040b m1470a(Provider provider) {
        return new C8040b(provider);
    }
}
