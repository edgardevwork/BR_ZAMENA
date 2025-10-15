package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;

/* renamed from: io.appmetrica.analytics.impl.ih */
/* loaded from: classes5.dex */
public final class RunnableC9608ih implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Revenue f8366a;

    /* renamed from: b */
    public final /* synthetic */ C8778Ah f8367b;

    public RunnableC9608ih(C8778Ah c8778Ah, Revenue revenue) {
        this.f8367b = c8778Ah;
        this.f8366a = revenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8778Ah c8778Ah = this.f8367b;
        C8778Ah.m4962a(c8778Ah.f6338a, c8778Ah.f6341d, c8778Ah.f6342e).reportRevenue(this.f8366a);
    }
}
