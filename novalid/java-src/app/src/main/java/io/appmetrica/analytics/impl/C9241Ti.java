package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* renamed from: io.appmetrica.analytics.impl.Ti */
/* loaded from: classes5.dex */
public final class C9241Ti implements InterfaceC9114Oa {

    /* renamed from: a */
    public final /* synthetic */ AdRevenue f7296a;

    public C9241Ti(AdRevenue adRevenue) {
        this.f7296a = adRevenue;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9114Oa
    /* renamed from: a */
    public final void mo5277a(InterfaceC9138Pa interfaceC9138Pa) {
        interfaceC9138Pa.reportAdRevenue(this.f7296a);
    }
}
