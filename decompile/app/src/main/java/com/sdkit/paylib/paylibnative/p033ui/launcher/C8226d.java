package com.sdkit.paylib.paylibnative.p033ui.launcher;

import com.sdkit.paylib.paylibdomain.api.deeplink.PaylibDeeplinkParser;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.C8241o;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.FinishCodeReceiver;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.InterfaceC8238l;
import com.sdkit.paylib.paylibnative.p033ui.p034di.C8212c;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.d */
/* loaded from: classes6.dex */
public final class C8226d implements Factory {

    /* renamed from: a */
    public final Provider f2426a;

    /* renamed from: b */
    public final Provider f2427b;

    /* renamed from: c */
    public final Provider f2428c;

    /* renamed from: d */
    public final Provider f2429d;

    /* renamed from: e */
    public final Provider f2430e;

    /* renamed from: f */
    public final Provider f2431f;

    /* renamed from: g */
    public final Provider f2432g;

    public C8226d(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.f2426a = provider;
        this.f2427b = provider2;
        this.f2428c = provider3;
        this.f2429d = provider4;
        this.f2430e = provider5;
        this.f2431f = provider6;
        this.f2432g = provider7;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8225c get() {
        return m2264a((InternalLauncher) this.f2426a.get(), (C8241o) this.f2427b.get(), (FinishCodeReceiver) this.f2428c.get(), (InterfaceC8238l) this.f2429d.get(), (C8212c) this.f2430e.get(), (PaylibLoggerFactory) this.f2431f.get(), (PaylibDeeplinkParser) this.f2432g.get());
    }

    /* renamed from: a */
    public static C8225c m2264a(InternalLauncher internalLauncher, C8241o c8241o, FinishCodeReceiver finishCodeReceiver, InterfaceC8238l interfaceC8238l, C8212c c8212c, PaylibLoggerFactory paylibLoggerFactory, PaylibDeeplinkParser paylibDeeplinkParser) {
        return new C8225c(internalLauncher, c8241o, finishCodeReceiver, interfaceC8238l, c8212c, paylibLoggerFactory, paylibDeeplinkParser);
    }

    /* renamed from: a */
    public static C8226d m2265a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        return new C8226d(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }
}
