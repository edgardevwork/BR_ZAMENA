package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.Ji */
/* loaded from: classes6.dex */
public final class C9002Ji implements InterfaceC9114Oa {

    /* renamed from: a */
    public final /* synthetic */ String f6827a;

    /* renamed from: b */
    public final /* synthetic */ String f6828b;

    /* renamed from: c */
    public final /* synthetic */ Throwable f6829c;

    public C9002Ji(String str, String str2, Throwable th) {
        this.f6827a = str;
        this.f6828b = str2;
        this.f6829c = th;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9114Oa
    /* renamed from: a */
    public final void mo5277a(InterfaceC9138Pa interfaceC9138Pa) {
        interfaceC9138Pa.reportError(this.f6827a, this.f6828b, this.f6829c);
    }
}
