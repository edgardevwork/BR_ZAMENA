package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.R1 */
/* loaded from: classes5.dex */
public final class RunnableC9176R1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC9954wd f7181a;

    /* renamed from: b */
    public final /* synthetic */ C8768A7 f7182b;

    public RunnableC9176R1(C9224T1 c9224t1, C8768A7 c8768a7) {
        this.f7181a = c9224t1;
        this.f7182b = c8768a7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7181a.consume(this.f7182b);
    }
}
