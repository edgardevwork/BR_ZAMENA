package io.appmetrica.analytics.coreutils.internal.services;

import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;

/* renamed from: io.appmetrica.analytics.coreutils.internal.services.b */
/* loaded from: classes7.dex */
public final class RunnableC8733b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ WaitForActivationDelayBarrier.ActivationBarrierHelper f6215a;

    public RunnableC8733b(WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper) {
        this.f6215a = activationBarrierHelper;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8732a c8732a = this.f6215a.f6211b;
        c8732a.f6214b.f6210a = true;
        c8732a.f6213a.run();
    }
}
