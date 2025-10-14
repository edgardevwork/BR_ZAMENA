package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.g1 */
/* loaded from: classes5.dex */
public final class RunnableC9542g1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f8160a;

    /* renamed from: b */
    public final /* synthetic */ C9692m1 f8161b;

    public RunnableC9542g1(C9692m1 c9692m1, String str) {
        this.f8161b = c9692m1;
        this.f8160a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9692m1.m6412a(this.f8161b).reportEvent(this.f8160a);
    }
}
