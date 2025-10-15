package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;

/* renamed from: io.appmetrica.analytics.impl.Qi */
/* loaded from: classes6.dex */
public final class C9170Qi implements InterfaceC9114Oa {

    /* renamed from: a */
    public final /* synthetic */ ECommerceEvent f7169a;

    public C9170Qi(ECommerceEvent eCommerceEvent) {
        this.f7169a = eCommerceEvent;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9114Oa
    /* renamed from: a */
    public final void mo5277a(InterfaceC9138Pa interfaceC9138Pa) {
        interfaceC9138Pa.reportECommerce(this.f7169a);
    }
}
