package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.Ii */
/* loaded from: classes6.dex */
public final class C8978Ii implements InterfaceC9114Oa {

    /* renamed from: a */
    public final /* synthetic */ String f6790a;

    /* renamed from: b */
    public final /* synthetic */ Throwable f6791b;

    public C8978Ii(String str, Throwable th) {
        this.f6790a = str;
        this.f6791b = th;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9114Oa
    /* renamed from: a */
    public final void mo5277a(InterfaceC9138Pa interfaceC9138Pa) {
        interfaceC9138Pa.reportError(this.f6790a, this.f6791b);
    }
}
