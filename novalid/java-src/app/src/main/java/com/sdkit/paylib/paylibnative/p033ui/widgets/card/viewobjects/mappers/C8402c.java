package com.sdkit.paylib.paylibnative.p033ui.widgets.card.viewobjects.mappers;

import com.sdkit.paylib.paylibnative.p033ui.widgets.card.domain.InterfaceC8388a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.card.viewobjects.mappers.c */
/* loaded from: classes6.dex */
public final class C8402c implements Factory {

    /* renamed from: a */
    public final Provider f3828a;

    public C8402c(Provider provider) {
        this.f3828a = provider;
    }

    @Override // javax.inject.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8401b get() {
        return m3598a((InterfaceC8388a) this.f3828a.get());
    }

    /* renamed from: a */
    public static C8401b m3598a(InterfaceC8388a interfaceC8388a) {
        return new C8401b(interfaceC8388a);
    }

    /* renamed from: a */
    public static C8402c m3599a(Provider provider) {
        return new C8402c(provider);
    }
}
