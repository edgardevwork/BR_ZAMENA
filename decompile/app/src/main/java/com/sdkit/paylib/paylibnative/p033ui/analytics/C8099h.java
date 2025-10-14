package com.sdkit.paylib.paylibnative.p033ui.analytics;

import com.sdkit.paylib.paylibnative.api.analytics.CustomPaylibAnalytics;
import com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.InterfaceC8238l;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.analytics.h */
/* loaded from: classes6.dex */
public final class C8099h implements Factory {

    /* renamed from: a */
    public final Provider f1750a;

    /* renamed from: b */
    public final Provider f1751b;

    /* renamed from: c */
    public final Provider f1752c;

    public C8099h(Provider provider, Provider provider2, Provider provider3) {
        this.f1750a = provider;
        this.f1751b = provider2;
        this.f1752c = provider3;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8098g get() {
        return m1832a((CustomPaylibAnalytics) this.f1750a.get(), (InterfaceC8131b) this.f1751b.get(), (InterfaceC8238l) this.f1752c.get());
    }

    /* renamed from: a */
    public static C8098g m1832a(CustomPaylibAnalytics customPaylibAnalytics, InterfaceC8131b interfaceC8131b, InterfaceC8238l interfaceC8238l) {
        return new C8098g(customPaylibAnalytics, interfaceC8131b, interfaceC8238l);
    }

    /* renamed from: a */
    public static C8099h m1833a(Provider provider, Provider provider2, Provider provider3) {
        return new C8099h(provider, provider2, provider3);
    }
}
