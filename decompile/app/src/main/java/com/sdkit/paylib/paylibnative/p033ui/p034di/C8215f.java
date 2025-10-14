package com.sdkit.paylib.paylibnative.p033ui.p034di;

import com.sdkit.paylib.paylibnative.api.presentation.PaylibHostRouter;
import com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8134e;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.di.f */
/* loaded from: classes6.dex */
public final class C8215f implements Factory {

    /* renamed from: a */
    public final Provider f2382a;

    public C8215f(Provider provider) {
        this.f2382a = provider;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public PaylibHostRouter get() {
        return m2228a((InterfaceC8134e) this.f2382a.get());
    }

    /* renamed from: a */
    public static PaylibHostRouter m2228a(InterfaceC8134e interfaceC8134e) {
        return C8214e.f2381a.m2226a(interfaceC8134e);
    }

    /* renamed from: a */
    public static C8215f m2229a(Provider provider) {
        return new C8215f(provider);
    }
}
