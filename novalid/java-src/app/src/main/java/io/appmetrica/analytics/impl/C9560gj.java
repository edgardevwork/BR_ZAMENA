package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.gj */
/* loaded from: classes8.dex */
public final class C9560gj implements InterfaceC9114Oa {

    /* renamed from: a */
    public final /* synthetic */ String f8207a;

    /* renamed from: b */
    public final /* synthetic */ String f8208b;

    public C9560gj(String str, String str2) {
        this.f8207a = str;
        this.f8208b = str2;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9114Oa
    /* renamed from: a */
    public final void mo5277a(InterfaceC9138Pa interfaceC9138Pa) {
        interfaceC9138Pa.reportEvent(this.f8207a, this.f8208b);
    }
}
