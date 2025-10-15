package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.l1 */
/* loaded from: classes5.dex */
public final class RunnableC9667l1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Throwable f8538a;

    /* renamed from: b */
    public final /* synthetic */ C9692m1 f8539b;

    public RunnableC9667l1(C9692m1 c9692m1, Throwable th) {
        this.f8539b = c9692m1;
        this.f8538a = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9692m1.m6412a(this.f8539b).reportUnhandledException(this.f8538a);
    }
}
