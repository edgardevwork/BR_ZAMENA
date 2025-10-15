package io.appmetrica.analytics.billingv6.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.billingv6.impl.n */
/* loaded from: classes5.dex */
public final class C8708n extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ C8710p f6067a;

    /* renamed from: b */
    public final /* synthetic */ C8705k f6068b;

    public C8708n(C8710p c8710p, C8705k c8705k) {
        this.f6067a = c8710p;
        this.f6068b = c8705k;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f6067a.f6076e.m4892a(this.f6068b);
    }
}
