package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.Yi */
/* loaded from: classes5.dex */
public final class C9361Yi implements InterfaceC9114Oa {

    /* renamed from: a */
    public final /* synthetic */ String f7598a;

    /* renamed from: b */
    public final /* synthetic */ byte[] f7599b;

    public C9361Yi(String str, byte[] bArr) {
        this.f7598a = str;
        this.f7599b = bArr;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9114Oa
    /* renamed from: a */
    public final void mo5277a(InterfaceC9138Pa interfaceC9138Pa) {
        interfaceC9138Pa.setSessionExtra(this.f7598a, this.f7599b);
    }
}
