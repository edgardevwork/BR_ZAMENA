package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.Oc */
/* loaded from: classes6.dex */
public final class C9116Oc extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ C9211Sc f7054a;

    /* renamed from: b */
    public final /* synthetic */ AdRevenue f7055b;

    /* renamed from: c */
    public final /* synthetic */ boolean f7056c;

    public C9116Oc(C9211Sc c9211Sc, AdRevenue adRevenue, boolean z) {
        this.f7054a = c9211Sc;
        this.f7055b = adRevenue;
        this.f7056c = z;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C9211Sc.m5556a(this.f7054a).reportAdRevenue(this.f7055b, this.f7056c);
    }
}
