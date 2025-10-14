package io.appmetrica.analytics.coreutils.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;

/* renamed from: io.appmetrica.analytics.coreutils.impl.l */
/* loaded from: classes7.dex */
public final class RunnableC8729l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ActivationBarrierCallback f6163a;

    public RunnableC8729l(ActivationBarrierCallback activationBarrierCallback) {
        this.f6163a = activationBarrierCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6163a.onWaitFinished();
    }
}
