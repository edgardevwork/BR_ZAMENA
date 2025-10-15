package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.Ki */
/* loaded from: classes6.dex */
public final class C9026Ki implements InterfaceC9114Oa {

    /* renamed from: a */
    public final /* synthetic */ Throwable f6912a;

    public C9026Ki(Throwable th) {
        this.f6912a = th;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9114Oa
    /* renamed from: a */
    public final void mo5277a(InterfaceC9138Pa interfaceC9138Pa) {
        interfaceC9138Pa.reportUnhandledException(this.f6912a);
    }
}
