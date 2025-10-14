package com.sdkit.paylib.paylibnative.p033ui.screens.invoice;

import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibnative.p033ui.common.C8103b;
import com.sdkit.paylib.paylibnative.p033ui.rootcontainer.internaldi.AbstractC8258f;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.invoice.b */
/* loaded from: classes5.dex */
public final class C8295b implements Factory {

    /* renamed from: a */
    public final Provider f3072a;

    /* renamed from: b */
    public final Provider f3073b;

    /* renamed from: c */
    public final Provider f3074c;

    public C8295b(Provider provider, Provider provider2, Provider provider3) {
        this.f3072a = provider;
        this.f3073b = provider2;
        this.f3074c = provider3;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8294a get() {
        return m2833a((AbstractC8258f) this.f3072a.get(), (C8103b) this.f3073b.get(), (PaylibLoggerFactory) this.f3074c.get());
    }

    /* renamed from: a */
    public static C8294a m2833a(AbstractC8258f abstractC8258f, C8103b c8103b, PaylibLoggerFactory paylibLoggerFactory) {
        return new C8294a(abstractC8258f, c8103b, paylibLoggerFactory);
    }

    /* renamed from: a */
    public static C8295b m2834a(Provider provider, Provider provider2, Provider provider3) {
        return new C8295b(provider, provider2, provider3);
    }
}
