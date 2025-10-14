package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;

/* renamed from: io.appmetrica.analytics.impl.Pi */
/* loaded from: classes6.dex */
public final class C9146Pi implements InterfaceC9114Oa {

    /* renamed from: a */
    public final /* synthetic */ Revenue f7121a;

    public C9146Pi(Revenue revenue) {
        this.f7121a = revenue;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9114Oa
    /* renamed from: a */
    public final void mo5277a(InterfaceC9138Pa interfaceC9138Pa) {
        interfaceC9138Pa.reportRevenue(this.f7121a);
    }
}
