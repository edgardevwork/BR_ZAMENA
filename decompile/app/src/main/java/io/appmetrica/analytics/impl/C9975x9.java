package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.x9 */
/* loaded from: classes6.dex */
public final class C9975x9 implements IHandlerExecutor {

    /* renamed from: a */
    public final Looper f9300a;

    /* renamed from: b */
    public final Handler f9301b;

    /* renamed from: c */
    public final HandlerThreadC9353Ya f9302c;

    public C9975x9(@NonNull String str) {
        this(m6959a(str));
    }

    /* renamed from: a */
    public static HandlerThreadC9353Ya m6959a(String str) {
        HandlerThreadC9353Ya handlerThreadC9353Ya = new HandlerThreadC9353Ya(str + "-" + ThreadFactoryC9479dd.f7951a.incrementAndGet());
        handlerThreadC9353Ya.start();
        return handlerThreadC9353Ya;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor, java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        this.f9301b.post(runnable);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void executeDelayed(@NonNull Runnable runnable, long j) {
        this.f9301b.postDelayed(runnable, TimeUnit.MILLISECONDS.toMillis(j));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor
    @NonNull
    public final Handler getHandler() {
        return this.f9301b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor
    @NonNull
    public final Looper getLooper() {
        return this.f9300a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final boolean isRunning() {
        boolean z;
        HandlerThreadC9353Ya handlerThreadC9353Ya = this.f9302c;
        synchronized (handlerThreadC9353Ya) {
            z = handlerThreadC9353Ya.f7576a;
        }
        return z;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void remove(@NonNull Runnable runnable) {
        this.f9301b.removeCallbacks(runnable);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void removeAll() {
        this.f9301b.removeCallbacksAndMessages(null);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final void stopRunning() {
        HandlerThreadC9353Ya handlerThreadC9353Ya = this.f9302c;
        synchronized (handlerThreadC9353Ya) {
            handlerThreadC9353Ya.f7576a = false;
            handlerThreadC9353Ya.interrupt();
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final <T> Future<T> submit(Callable<T> callable) {
        FutureTask futureTask = new FutureTask(callable);
        this.f9301b.post(futureTask);
        return futureTask;
    }

    public C9975x9(HandlerThreadC9353Ya handlerThreadC9353Ya) {
        this(handlerThreadC9353Ya, handlerThreadC9353Ya.getLooper(), new Handler(handlerThreadC9353Ya.getLooper()));
    }

    @VisibleForTesting
    public C9975x9(@NonNull HandlerThreadC9353Ya handlerThreadC9353Ya, @NonNull Looper looper, @NonNull Handler handler) {
        this.f9302c = handlerThreadC9353Ya;
        this.f9300a = looper;
        this.f9301b = handler;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void executeDelayed(@NonNull Runnable runnable, long j, @NonNull TimeUnit timeUnit) {
        this.f9301b.postDelayed(runnable, timeUnit.toMillis(j));
    }
}
