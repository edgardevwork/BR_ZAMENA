package com.sdkit.paylib.paylibnative.p033ui.screens.deeplinkresult;

import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibnative.p033ui.common.C8103b;
import com.sdkit.paylib.paylibnative.p033ui.rootcontainer.internaldi.AbstractC8258f;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.screens.deeplinkresult.b */
/* loaded from: classes5.dex */
public final class C8288b implements Factory {

    /* renamed from: a */
    public final Provider f2987a;

    /* renamed from: b */
    public final Provider f2988b;

    /* renamed from: c */
    public final Provider f2989c;

    public C8288b(Provider provider, Provider provider2, Provider provider3) {
        this.f2987a = provider;
        this.f2988b = provider2;
        this.f2989c = provider3;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8287a get() {
        return m2734a((AbstractC8258f) this.f2987a.get(), (C8103b) this.f2988b.get(), (PaylibLoggerFactory) this.f2989c.get());
    }

    /* renamed from: a */
    public static C8287a m2734a(AbstractC8258f abstractC8258f, C8103b c8103b, PaylibLoggerFactory paylibLoggerFactory) {
        return new C8287a(abstractC8258f, c8103b, paylibLoggerFactory);
    }

    /* renamed from: a */
    public static C8288b m2735a(Provider provider, Provider provider2, Provider provider3) {
        return new C8288b(provider, provider2, provider3);
    }
}
