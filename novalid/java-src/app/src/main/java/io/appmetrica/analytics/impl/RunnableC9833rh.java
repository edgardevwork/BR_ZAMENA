package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* renamed from: io.appmetrica.analytics.impl.rh */
/* loaded from: classes7.dex */
public final class RunnableC9833rh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AdRevenue f9014a;

    /* renamed from: b */
    public final /* synthetic */ boolean f9015b;

    /* renamed from: c */
    public final /* synthetic */ C8778Ah f9016c;

    public RunnableC9833rh(C8778Ah c8778Ah, AdRevenue adRevenue, boolean z) {
        this.f9016c = c8778Ah;
        this.f9014a = adRevenue;
        this.f9015b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8778Ah c8778Ah = this.f9016c;
        C8778Ah.m4962a(c8778Ah.f6338a, c8778Ah.f6341d, c8778Ah.f6342e).reportAdRevenue(this.f9014a, this.f9015b);
    }
}
