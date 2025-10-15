package org.apache.commons.lang3.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* loaded from: classes5.dex */
public abstract class BackgroundInitializer<T> implements ConcurrentInitializer<T> {
    public ExecutorService executor;
    public ExecutorService externalExecutor;
    public Future<T> future;

    public int getTaskCount() {
        return 1;
    }

    public abstract T initialize() throws Exception;

    public BackgroundInitializer() {
        this(null);
    }

    public BackgroundInitializer(ExecutorService executorService) {
        setExternalExecutor(executorService);
    }

    public final synchronized ExecutorService getExternalExecutor() {
        return this.externalExecutor;
    }

    public synchronized boolean isStarted() {
        return this.future != null;
    }

    public final synchronized void setExternalExecutor(ExecutorService executorService) {
        if (isStarted()) {
            throw new IllegalStateException("Cannot set ExecutorService after start()!");
        }
        this.externalExecutor = executorService;
    }

    public synchronized boolean start() {
        ExecutorService executorServiceCreateExecutor;
        try {
            if (isStarted()) {
                return false;
            }
            ExecutorService externalExecutor = getExternalExecutor();
            this.executor = externalExecutor;
            if (externalExecutor == null) {
                executorServiceCreateExecutor = createExecutor();
                this.executor = executorServiceCreateExecutor;
            } else {
                executorServiceCreateExecutor = null;
            }
            this.future = this.executor.submit(createTask(executorServiceCreateExecutor));
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // org.apache.commons.lang3.concurrent.ConcurrentInitializer
    public T get() throws ConcurrentException {
        try {
            return getFuture().get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new ConcurrentException(e);
        } catch (ExecutionException e2) {
            ConcurrentUtils.handleCause(e2);
            return null;
        }
    }

    public synchronized Future<T> getFuture() {
        Future<T> future;
        future = this.future;
        if (future == null) {
            throw new IllegalStateException("start() must be called first!");
        }
        return future;
    }

    public final synchronized ExecutorService getActiveExecutor() {
        return this.executor;
    }

    public final Callable<T> createTask(ExecutorService executorService) {
        return new InitializationTask(executorService);
    }

    public final ExecutorService createExecutor() {
        return Executors.newFixedThreadPool(getTaskCount());
    }

    /* loaded from: classes7.dex */
    public class InitializationTask implements Callable<T> {
        public final ExecutorService execFinally;

        public InitializationTask(ExecutorService executorService) {
            this.execFinally = executorService;
        }

        @Override // java.util.concurrent.Callable
        public T call() throws Exception {
            try {
                return (T) BackgroundInitializer.this.initialize();
            } finally {
                ExecutorService executorService = this.execFinally;
                if (executorService != null) {
                    executorService.shutdown();
                }
            }
        }
    }
}
