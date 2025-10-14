package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.zf */
/* loaded from: classes8.dex */
public final class RunnableC10031zf implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC9023Kf f9400a;

    /* renamed from: b */
    public final /* synthetic */ Throwable f9401b;

    public RunnableC10031zf(InterfaceC9023Kf interfaceC9023Kf, Throwable th) {
        this.f9400a = interfaceC9023Kf;
        this.f9401b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9400a.mo5333a(this.f9401b);
    }
}
