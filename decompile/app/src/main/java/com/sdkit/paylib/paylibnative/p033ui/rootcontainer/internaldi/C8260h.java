package com.sdkit.paylib.paylibnative.p033ui.rootcontainer.internaldi;

import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import dagger.internal.Factory;
import java.util.Map;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.internaldi.h */
/* loaded from: classes5.dex */
public final class C8260h implements Factory {

    /* renamed from: a */
    public final Provider f2715a;

    /* renamed from: b */
    public final Provider f2716b;

    public C8260h(Provider provider, Provider provider2) {
        this.f2715a = provider;
        this.f2716b = provider2;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8259g get() {
        return m2482a((Map) this.f2715a.get(), (PaylibLoggerFactory) this.f2716b.get());
    }

    /* renamed from: a */
    public static C8259g m2482a(Map map, PaylibLoggerFactory paylibLoggerFactory) {
        return new C8259g(map, paylibLoggerFactory);
    }

    /* renamed from: a */
    public static C8260h m2483a(Provider provider, Provider provider2) {
        return new C8260h(provider, provider2);
    }
}
