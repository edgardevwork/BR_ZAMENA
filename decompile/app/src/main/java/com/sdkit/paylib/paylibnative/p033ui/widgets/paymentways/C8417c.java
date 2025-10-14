package com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways;

import com.sdkit.paylib.paylibnative.p033ui.analytics.InterfaceC8097f;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.paymentways.c */
/* loaded from: classes6.dex */
public final class C8417c implements Factory {

    /* renamed from: a */
    public final Provider f3897a;

    public C8417c(Provider provider) {
        this.f3897a = provider;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8416b get() {
        return m3655a((InterfaceC8097f) this.f3897a.get());
    }

    /* renamed from: a */
    public static C8416b m3655a(InterfaceC8097f interfaceC8097f) {
        return new C8416b(interfaceC8097f);
    }

    /* renamed from: a */
    public static C8417c m3656a(Provider provider) {
        return new C8417c(provider);
    }
}
