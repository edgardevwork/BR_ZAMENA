package com.sdkit.paylib.paylibnative.p033ui.common.error;

import com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.common.error.c */
/* loaded from: classes6.dex */
public final class C8109c implements Factory {

    /* renamed from: a */
    public final Provider f1871a;

    public C8109c(Provider provider) {
        this.f1871a = provider;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8107a get() {
        return m1926a((InternalPaylibRouter) this.f1871a.get());
    }

    /* renamed from: a */
    public static C8107a m1926a(InternalPaylibRouter internalPaylibRouter) {
        return new C8107a(internalPaylibRouter);
    }

    /* renamed from: a */
    public static C8109c m1927a(Provider provider) {
        return new C8109c(provider);
    }
}
