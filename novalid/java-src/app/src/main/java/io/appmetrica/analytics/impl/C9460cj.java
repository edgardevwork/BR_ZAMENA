package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.cj */
/* loaded from: classes8.dex */
public final class C9460cj implements InterfaceC9114Oa {

    /* renamed from: a */
    public final /* synthetic */ String f7859a;

    /* renamed from: b */
    public final /* synthetic */ String f7860b;

    public C9460cj(String str, String str2) {
        this.f7859a = str;
        this.f7860b = str2;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9114Oa
    /* renamed from: a */
    public final void mo5277a(InterfaceC9138Pa interfaceC9138Pa) {
        interfaceC9138Pa.putAppEnvironmentValue(this.f7859a, this.f7860b);
    }
}
