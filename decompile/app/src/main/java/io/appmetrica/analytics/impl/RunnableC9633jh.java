package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* renamed from: io.appmetrica.analytics.impl.jh */
/* loaded from: classes5.dex */
public final class RunnableC9633jh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AdRevenue f8445a;

    /* renamed from: b */
    public final /* synthetic */ C8778Ah f8446b;

    public RunnableC9633jh(C8778Ah c8778Ah, AdRevenue adRevenue) {
        this.f8446b = c8778Ah;
        this.f8445a = adRevenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8778Ah c8778Ah = this.f8446b;
        C8778Ah.m4962a(c8778Ah.f6338a, c8778Ah.f6341d, c8778Ah.f6342e).reportAdRevenue(this.f8445a);
    }
}
