package io.appmetrica.analytics.billingv6.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.billingv6.impl.f */
/* loaded from: classes5.dex */
public final class C8700f extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ C8701g f6044a;

    public C8700f(C8701g c8701g) {
        this.f6044a = c8701g;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f6044a.f6045a.endConnection();
    }
}
