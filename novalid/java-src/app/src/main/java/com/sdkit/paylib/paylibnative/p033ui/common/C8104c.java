package com.sdkit.paylib.paylibnative.p033ui.common;

import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.common.c */
/* loaded from: classes6.dex */
public final class C8104c implements Factory {

    /* renamed from: a */
    public final Provider f1810a;

    /* renamed from: b */
    public final Provider f1811b;

    public C8104c(Provider provider, Provider provider2) {
        this.f1810a = provider;
        this.f1811b = provider2;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8103b get() {
        return m1868a((InterfaceC8131b) this.f1810a.get(), (PaylibLoggerFactory) this.f1811b.get());
    }

    /* renamed from: a */
    public static C8103b m1868a(InterfaceC8131b interfaceC8131b, PaylibLoggerFactory paylibLoggerFactory) {
        return new C8103b(interfaceC8131b, paylibLoggerFactory);
    }

    /* renamed from: a */
    public static C8104c m1869a(Provider provider, Provider provider2) {
        return new C8104c(provider, provider2);
    }
}
