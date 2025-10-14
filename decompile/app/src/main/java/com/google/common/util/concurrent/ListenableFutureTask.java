package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes7.dex */
public class ListenableFutureTask<V> extends FutureTask<V> implements ListenableFuture<V> {
    public final ExecutionList executionList;

    public static <V> ListenableFutureTask<V> create(Callable<V> callable) {
        return new ListenableFutureTask<>(callable);
    }

    public static <V> ListenableFutureTask<V> create(Runnable runnable, @ParametricNullness V result) {
        return new ListenableFutureTask<>(runnable, result);
    }

    public ListenableFutureTask(Callable<V> callable) {
        super(callable);
        this.executionList = new ExecutionList();
    }

    public ListenableFutureTask(Runnable runnable, @ParametricNullness V result) {
        super(runnable, result);
        this.executionList = new ExecutionList();
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable listener, Executor exec) {
        this.executionList.add(listener, exec);
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    @CanIgnoreReturnValue
    @ParametricNullness
    public V get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (nanos <= OverflowAvoidingLockSupport.MAX_NANOSECONDS_THRESHOLD) {
            return (V) super.get(j, timeUnit);
        }
        return (V) super.get(Math.min(nanos, OverflowAvoidingLockSupport.MAX_NANOSECONDS_THRESHOLD), TimeUnit.NANOSECONDS);
    }

    @Override // java.util.concurrent.FutureTask
    public void done() {
        this.executionList.execute();
    }
}
