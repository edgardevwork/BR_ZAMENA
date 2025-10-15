package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.L0 */
/* loaded from: classes8.dex */
public final class RunnableC9032L0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ boolean f6916a;

    /* renamed from: b */
    public final /* synthetic */ C9692m1 f6917b;

    public RunnableC9032L0(C9692m1 c9692m1, boolean z) {
        this.f6917b = c9692m1;
        this.f6916a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9816r0 c9816r0 = this.f6917b.f8612a;
        boolean z = this.f6916a;
        c9816r0.getClass();
        C9791q0.m6663g().setDataSendingEnabled(z);
    }
}
