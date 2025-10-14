package io.appmetrica.analytics.billingv6.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.billingv6.impl.i */
/* loaded from: classes5.dex */
public final class C8703i extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ C8705k f6051a;

    /* renamed from: b */
    public final /* synthetic */ C8712r f6052b;

    public C8703i(C8705k c8705k, C8712r c8712r) {
        this.f6051a = c8705k;
        this.f6052b = c8712r;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f6051a.f6060f.m4892a(this.f6052b);
    }
}
