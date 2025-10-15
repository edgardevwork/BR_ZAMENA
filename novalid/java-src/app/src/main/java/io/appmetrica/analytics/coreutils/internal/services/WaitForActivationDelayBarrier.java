package io.appmetrica.analytics.coreutils.internal.services;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrier;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import io.appmetrica.analytics.coreutils.impl.RunnableC8729l;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* loaded from: classes7.dex */
public class WaitForActivationDelayBarrier implements ActivationBarrier {

    /* renamed from: a */
    private long f6208a;

    /* renamed from: b */
    private final SystemTimeProvider f6209b;

    public static class ActivationBarrierHelper {

        /* renamed from: a */
        private boolean f6210a = false;

        /* renamed from: b */
        private final C8732a f6211b;

        /* renamed from: c */
        private final WaitForActivationDelayBarrier f6212c;

        public ActivationBarrierHelper(@NonNull Runnable runnable, @NonNull WaitForActivationDelayBarrier waitForActivationDelayBarrier) {
            this.f6211b = new C8732a(this, runnable);
            this.f6212c = waitForActivationDelayBarrier;
        }

        public void subscribeIfNeeded(long j, @NonNull ICommonExecutor iCommonExecutor) {
            if (this.f6210a) {
                iCommonExecutor.execute(new RunnableC8733b(this));
            } else {
                this.f6212c.subscribe(j, iCommonExecutor, this.f6211b);
            }
        }
    }

    public WaitForActivationDelayBarrier() {
        this(new SystemTimeProvider());
    }

    public void activate() {
        this.f6208a = this.f6209b.currentTimeMillis();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrier
    public void subscribe(long j, @NonNull ICommonExecutor iCommonExecutor, @NonNull ActivationBarrierCallback activationBarrierCallback) {
        iCommonExecutor.executeDelayed(new RunnableC8729l(activationBarrierCallback), Math.max(j - (this.f6209b.currentTimeMillis() - this.f6208a), 0L));
    }

    public WaitForActivationDelayBarrier(SystemTimeProvider systemTimeProvider) {
        this.f6209b = systemTimeProvider;
    }
}
