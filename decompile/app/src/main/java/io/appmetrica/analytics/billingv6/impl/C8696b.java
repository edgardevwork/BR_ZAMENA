package io.appmetrica.analytics.billingv6.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.billingv6.impl.b */
/* loaded from: classes5.dex */
public final class C8696b extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ C8698d f6032a;

    /* renamed from: b */
    public final /* synthetic */ C8710p f6033b;

    public C8696b(C8698d c8698d, C8710p c8710p) {
        this.f6032a = c8698d;
        this.f6033b = c8710p;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f6032a.f6040d.m4892a(this.f6033b);
    }
}
