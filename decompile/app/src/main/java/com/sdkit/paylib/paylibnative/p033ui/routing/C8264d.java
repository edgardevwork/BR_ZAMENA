package com.sdkit.paylib.paylibnative.p033ui.routing;

import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibnative.api.presentation.PaylibHostRouter;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.InterfaceC8238l;
import com.sdkit.paylib.paylibnative.p033ui.rootcontainer.C8252f;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.routing.d */
/* loaded from: classes5.dex */
public final class C8264d implements Factory {

    /* renamed from: a */
    public final Provider f2776a;

    /* renamed from: b */
    public final Provider f2777b;

    /* renamed from: c */
    public final Provider f2778c;

    /* renamed from: d */
    public final Provider f2779d;

    /* renamed from: e */
    public final Provider f2780e;

    public C8264d(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f2776a = provider;
        this.f2777b = provider2;
        this.f2778c = provider3;
        this.f2779d = provider4;
        this.f2780e = provider5;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8263c get() {
        return m2545a((C8252f) this.f2776a.get(), (PaylibHostRouter) this.f2777b.get(), (InterfaceC8238l) this.f2778c.get(), this.f2779d, (PaylibLoggerFactory) this.f2780e.get());
    }

    /* renamed from: a */
    public static C8263c m2545a(C8252f c8252f, PaylibHostRouter paylibHostRouter, InterfaceC8238l interfaceC8238l, Provider provider, PaylibLoggerFactory paylibLoggerFactory) {
        return new C8263c(c8252f, paylibHostRouter, interfaceC8238l, provider, paylibLoggerFactory);
    }

    /* renamed from: a */
    public static C8264d m2546a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new C8264d(provider, provider2, provider3, provider4, provider5);
    }
}
