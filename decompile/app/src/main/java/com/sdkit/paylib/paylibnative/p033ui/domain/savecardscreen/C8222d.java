package com.sdkit.paylib.paylibnative.p033ui.domain.savecardscreen;

import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.domain.savecardscreen.d */
/* loaded from: classes6.dex */
public final class C8222d implements Factory {

    /* renamed from: a */
    public final Provider f2395a;

    public C8222d(Provider provider) {
        this.f2395a = provider;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8221c get() {
        return m2241a((PaylibLoggerFactory) this.f2395a.get());
    }

    /* renamed from: a */
    public static C8221c m2241a(PaylibLoggerFactory paylibLoggerFactory) {
        return new C8221c(paylibLoggerFactory);
    }

    /* renamed from: a */
    public static C8222d m2242a(Provider provider) {
        return new C8222d(provider);
    }
}
