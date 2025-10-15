package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* renamed from: io.appmetrica.analytics.impl.Q0 */
/* loaded from: classes5.dex */
public final class RunnableC9152Q0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AdRevenue f7132a;

    /* renamed from: b */
    public final /* synthetic */ C9692m1 f7133b;

    public RunnableC9152Q0(C9692m1 c9692m1, AdRevenue adRevenue) {
        this.f7133b = c9692m1;
        this.f7132a = adRevenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9692m1.m6412a(this.f7133b).reportAdRevenue(this.f7132a);
    }
}
