package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* renamed from: io.appmetrica.analytics.impl.Zi */
/* loaded from: classes5.dex */
public final class C9385Zi implements InterfaceC9114Oa {

    /* renamed from: a */
    public final /* synthetic */ AdRevenue f7650a;

    /* renamed from: b */
    public final /* synthetic */ boolean f7651b;

    public C9385Zi(AdRevenue adRevenue, boolean z) {
        this.f7650a = adRevenue;
        this.f7651b = z;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9114Oa
    /* renamed from: a */
    public final void mo5277a(InterfaceC9138Pa interfaceC9138Pa) {
        interfaceC9138Pa.reportAdRevenue(this.f7650a, this.f7651b);
    }
}
