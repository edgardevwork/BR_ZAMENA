package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: io.appmetrica.analytics.impl.dd */
/* loaded from: classes6.dex */
public final class ThreadFactoryC9479dd implements ThreadFactory {

    /* renamed from: a */
    public static final AtomicInteger f7951a = new AtomicInteger(0);

    /* renamed from: a */
    public static int m6025a() {
        return f7951a.incrementAndGet();
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new InterruptionSafeThread(runnable, ((String) null) + "-" + f7951a.incrementAndGet());
    }
}
