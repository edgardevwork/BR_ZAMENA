package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.j1 */
/* loaded from: classes5.dex */
public final class RunnableC9617j1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f8387a;

    /* renamed from: b */
    public final /* synthetic */ Throwable f8388b;

    /* renamed from: c */
    public final /* synthetic */ C9692m1 f8389c;

    public RunnableC9617j1(C9692m1 c9692m1, String str, Throwable th) {
        this.f8389c = c9692m1;
        this.f8387a = str;
        this.f8388b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9692m1.m6412a(this.f8389c).reportError(this.f8387a, this.f8388b);
    }
}
