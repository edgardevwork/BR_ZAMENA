package com.sdkit.paylib.paylibnative.p033ui.analytics;

import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.InterfaceC8238l;
import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.InterfaceC8412a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.analytics.d */
/* loaded from: classes6.dex */
public final class C8095d implements Factory {

    /* renamed from: a */
    public final Provider f1742a;

    /* renamed from: b */
    public final Provider f1743b;

    public C8095d(Provider provider, Provider provider2) {
        this.f1742a = provider;
        this.f1743b = provider2;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8094c get() {
        return m1786a((InterfaceC8238l) this.f1742a.get(), (InterfaceC8412a) this.f1743b.get());
    }

    /* renamed from: a */
    public static C8094c m1786a(InterfaceC8238l interfaceC8238l, InterfaceC8412a interfaceC8412a) {
        return new C8094c(interfaceC8238l, interfaceC8412a);
    }

    /* renamed from: a */
    public static C8095d m1787a(Provider provider, Provider provider2) {
        return new C8095d(provider, provider2);
    }
}
