package com.sdkit.paylib.paylibdomain.impl.deeplink;

import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibdomain.impl.deeplink.f */
/* loaded from: classes7.dex */
public final class C8044f implements Factory {

    /* renamed from: a */
    public final Provider f1162a;

    /* renamed from: b */
    public final Provider f1163b;

    public C8044f(Provider provider, Provider provider2) {
        this.f1162a = provider;
        this.f1163b = provider2;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8043e get() {
        return m1486a((C8039a) this.f1162a.get(), (PaylibLoggerFactory) this.f1163b.get());
    }

    /* renamed from: a */
    public static C8043e m1486a(C8039a c8039a, PaylibLoggerFactory paylibLoggerFactory) {
        return new C8043e(c8039a, paylibLoggerFactory);
    }

    /* renamed from: a */
    public static C8044f m1487a(Provider provider, Provider provider2) {
        return new C8044f(provider, provider2);
    }
}
