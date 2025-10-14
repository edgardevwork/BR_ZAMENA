package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkParametersListener;

/* renamed from: io.appmetrica.analytics.impl.S0 */
/* loaded from: classes5.dex */
public final class RunnableC9199S0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ DeferredDeeplinkParametersListener f7227a;

    /* renamed from: b */
    public final /* synthetic */ C9692m1 f7228b;

    public RunnableC9199S0(C9692m1 c9692m1, DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.f7228b = c9692m1;
        this.f7227a = deferredDeeplinkParametersListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7228b.f8612a.getClass();
        C9791q0 c9791q0 = C9791q0.f8913e;
        c9791q0.m6687k().mo4938a(this.f7227a);
    }
}
