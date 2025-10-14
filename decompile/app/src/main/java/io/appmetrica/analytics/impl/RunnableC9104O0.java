package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;

/* renamed from: io.appmetrica.analytics.impl.O0 */
/* loaded from: classes5.dex */
public final class RunnableC9104O0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Revenue f7044a;

    /* renamed from: b */
    public final /* synthetic */ C9692m1 f7045b;

    public RunnableC9104O0(C9692m1 c9692m1, Revenue revenue) {
        this.f7045b = c9692m1;
        this.f7044a = revenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9692m1.m6412a(this.f7045b).reportRevenue(this.f7044a);
    }
}
