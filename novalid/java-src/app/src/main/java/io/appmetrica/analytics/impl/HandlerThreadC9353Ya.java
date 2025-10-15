package io.appmetrica.analytics.impl;

import android.os.HandlerThread;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread;

/* renamed from: io.appmetrica.analytics.impl.Ya */
/* loaded from: classes5.dex */
public final class HandlerThreadC9353Ya extends HandlerThread implements IInterruptionSafeThread {

    /* renamed from: a */
    public volatile boolean f7576a;

    public HandlerThreadC9353Ya(@NonNull String str) {
        super(str);
        this.f7576a = true;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final synchronized boolean isRunning() {
        return this.f7576a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final synchronized void stopRunning() {
        this.f7576a = false;
        interrupt();
    }
}
