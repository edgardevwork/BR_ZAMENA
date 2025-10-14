package io.appmetrica.analytics.coreutils.internal.services;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;

/* renamed from: io.appmetrica.analytics.coreutils.internal.services.a */
/* loaded from: classes7.dex */
public final class C8732a implements ActivationBarrierCallback {

    /* renamed from: a */
    public final /* synthetic */ Runnable f6213a;

    /* renamed from: b */
    public final /* synthetic */ WaitForActivationDelayBarrier.ActivationBarrierHelper f6214b;

    public C8732a(WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper, Runnable runnable) {
        this.f6214b = activationBarrierHelper;
        this.f6213a = runnable;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
    public final void onWaitFinished() {
        this.f6214b.f6210a = true;
        this.f6213a.run();
    }
}
