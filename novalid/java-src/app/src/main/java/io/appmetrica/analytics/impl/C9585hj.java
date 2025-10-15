package io.appmetrica.analytics.impl;

import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.hj */
/* loaded from: classes8.dex */
public final class C9585hj implements InterfaceC9114Oa {

    /* renamed from: a */
    public final /* synthetic */ String f8285a;

    /* renamed from: b */
    public final /* synthetic */ Map f8286b;

    public C9585hj(String str, Map map) {
        this.f8285a = str;
        this.f8286b = map;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9114Oa
    /* renamed from: a */
    public final void mo5277a(InterfaceC9138Pa interfaceC9138Pa) {
        interfaceC9138Pa.reportEvent(this.f8285a, this.f8286b);
    }
}
