package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.k1 */
/* loaded from: classes5.dex */
public final class RunnableC9642k1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f8488a;

    /* renamed from: b */
    public final /* synthetic */ String f8489b;

    /* renamed from: c */
    public final /* synthetic */ Throwable f8490c;

    /* renamed from: d */
    public final /* synthetic */ C9692m1 f8491d;

    public RunnableC9642k1(C9692m1 c9692m1, String str, String str2, Throwable th) {
        this.f8491d = c9692m1;
        this.f8488a = str;
        this.f8489b = str2;
        this.f8490c = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9692m1.m6412a(this.f8491d).reportError(this.f8488a, this.f8489b, this.f8490c);
    }
}
