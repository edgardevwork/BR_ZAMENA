package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkListener;

/* renamed from: io.appmetrica.analytics.impl.T0 */
/* loaded from: classes5.dex */
public final class RunnableC9223T0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ DeferredDeeplinkListener f7272a;

    /* renamed from: b */
    public final /* synthetic */ C9692m1 f7273b;

    public RunnableC9223T0(C9692m1 c9692m1, DeferredDeeplinkListener deferredDeeplinkListener) {
        this.f7273b = c9692m1;
        this.f7272a = deferredDeeplinkListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7273b.f8612a.getClass();
        C9791q0 c9791q0 = C9791q0.f8913e;
        c9791q0.m6687k().mo4937a(this.f7272a);
    }
}
