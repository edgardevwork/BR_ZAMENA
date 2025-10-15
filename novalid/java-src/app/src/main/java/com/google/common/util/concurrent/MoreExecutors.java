package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.base.Throwables;
import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.ForwardingListenableFuture;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
/* loaded from: classes6.dex */
public final class MoreExecutors {
    @J2ktIncompatible
    @GwtIncompatible
    public static ExecutorService getExitingExecutorService(ThreadPoolExecutor executor, long terminationTimeout, TimeUnit timeUnit) {
        return new Application().getExitingExecutorService(executor, terminationTimeout, timeUnit);
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static ExecutorService getExitingExecutorService(ThreadPoolExecutor executor) {
        return new Application().getExitingExecutorService(executor);
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static ScheduledExecutorService getExitingScheduledExecutorService(ScheduledThreadPoolExecutor executor, long terminationTimeout, TimeUnit timeUnit) {
        return new Application().getExitingScheduledExecutorService(executor, terminationTimeout, timeUnit);
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static ScheduledExecutorService getExitingScheduledExecutorService(ScheduledThreadPoolExecutor executor) {
        return new Application().getExitingScheduledExecutorService(executor);
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static void addDelayedShutdownHook(ExecutorService service, long terminationTimeout, TimeUnit timeUnit) {
        new Application().addDelayedShutdownHook(service, terminationTimeout, timeUnit);
    }

    @GwtIncompatible
    @VisibleForTesting
    @J2ktIncompatible
    public static class Application {
        public final ExecutorService getExitingExecutorService(ThreadPoolExecutor executor, long terminationTimeout, TimeUnit timeUnit) {
            MoreExecutors.useDaemonThreadFactory(executor);
            ExecutorService executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(executor);
            addDelayedShutdownHook(executor, terminationTimeout, timeUnit);
            return executorServiceUnconfigurableExecutorService;
        }

        public final ExecutorService getExitingExecutorService(ThreadPoolExecutor executor) {
            return getExitingExecutorService(executor, 120L, TimeUnit.SECONDS);
        }

        public final ScheduledExecutorService getExitingScheduledExecutorService(ScheduledThreadPoolExecutor executor, long terminationTimeout, TimeUnit timeUnit) {
            MoreExecutors.useDaemonThreadFactory(executor);
            ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(executor);
            addDelayedShutdownHook(executor, terminationTimeout, timeUnit);
            return scheduledExecutorServiceUnconfigurableScheduledExecutorService;
        }

        public final ScheduledExecutorService getExitingScheduledExecutorService(ScheduledThreadPoolExecutor executor) {
            return getExitingScheduledExecutorService(executor, 120L, TimeUnit.SECONDS);
        }

        public final void addDelayedShutdownHook(final ExecutorService service, final long terminationTimeout, final TimeUnit timeUnit) {
            Preconditions.checkNotNull(service);
            Preconditions.checkNotNull(timeUnit);
            addShutdownHook(MoreExecutors.newThread("DelayedShutdownHook-for-" + service, new Runnable(this) { // from class: com.google.common.util.concurrent.MoreExecutors.Application.1
                public final /* synthetic */ ExecutorService val$service;
                public final /* synthetic */ long val$terminationTimeout;
                public final /* synthetic */ TimeUnit val$timeUnit;

                public RunnableC75991(Application this, final ExecutorService service2, final long terminationTimeout2, final TimeUnit timeUnit2) {
                    val$service = service2;
                    val$terminationTimeout = terminationTimeout2;
                    val$timeUnit = timeUnit2;
                }

                @Override // java.lang.Runnable
                public void run() throws InterruptedException {
                    try {
                        val$service.shutdown();
                        val$service.awaitTermination(val$terminationTimeout, val$timeUnit);
                    } catch (InterruptedException unused) {
                    }
                }
            }));
        }

        /* renamed from: com.google.common.util.concurrent.MoreExecutors$Application$1 */
        public class RunnableC75991 implements Runnable {
            public final /* synthetic */ ExecutorService val$service;
            public final /* synthetic */ long val$terminationTimeout;
            public final /* synthetic */ TimeUnit val$timeUnit;

            public RunnableC75991(Application this, final ExecutorService service2, final long terminationTimeout2, final TimeUnit timeUnit2) {
                val$service = service2;
                val$terminationTimeout = terminationTimeout2;
                val$timeUnit = timeUnit2;
            }

            @Override // java.lang.Runnable
            public void run() throws InterruptedException {
                try {
                    val$service.shutdown();
                    val$service.awaitTermination(val$terminationTimeout, val$timeUnit);
                } catch (InterruptedException unused) {
                }
            }
        }

        @VisibleForTesting
        public void addShutdownHook(Thread hook) {
            Runtime.getRuntime().addShutdownHook(hook);
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static void useDaemonThreadFactory(ThreadPoolExecutor executor) {
        executor.setThreadFactory(new ThreadFactoryBuilder().setDaemon(true).setThreadFactory(executor.getThreadFactory()).build());
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static final class DirectExecutorService extends AbstractListeningExecutorService {
        public final Object lock;

        @GuardedBy("lock")
        public int runningTasks;

        @GuardedBy("lock")
        public boolean shutdown;

        public DirectExecutorService() {
            this.lock = new Object();
            this.runningTasks = 0;
            this.shutdown = false;
        }

        public /* synthetic */ DirectExecutorService(RunnableC75941 runnableC75941) {
            this();
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable command) {
            startTask();
            try {
                command.run();
            } finally {
                endTask();
            }
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isShutdown() {
            boolean z;
            synchronized (this.lock) {
                z = this.shutdown;
            }
            return z;
        }

        @Override // java.util.concurrent.ExecutorService
        public void shutdown() {
            synchronized (this.lock) {
                try {
                    this.shutdown = true;
                    if (this.runningTasks == 0) {
                        this.lock.notifyAll();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.concurrent.ExecutorService
        public List<Runnable> shutdownNow() {
            shutdown();
            return Collections.emptyList();
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isTerminated() {
            boolean z;
            synchronized (this.lock) {
                try {
                    z = this.shutdown && this.runningTasks == 0;
                } finally {
                }
            }
            return z;
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
            long nanos = unit.toNanos(timeout);
            synchronized (this.lock) {
                while (true) {
                    try {
                        if (this.shutdown && this.runningTasks == 0) {
                            return true;
                        }
                        if (nanos <= 0) {
                            return false;
                        }
                        long jNanoTime = System.nanoTime();
                        TimeUnit.NANOSECONDS.timedWait(this.lock, nanos);
                        nanos -= System.nanoTime() - jNanoTime;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public final void startTask() {
            synchronized (this.lock) {
                try {
                    if (this.shutdown) {
                        throw new RejectedExecutionException("Executor already shutdown");
                    }
                    this.runningTasks++;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void endTask() {
            synchronized (this.lock) {
                try {
                    int i = this.runningTasks - 1;
                    this.runningTasks = i;
                    if (i == 0) {
                        this.lock.notifyAll();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static ListeningExecutorService newDirectExecutorService() {
        return new DirectExecutorService();
    }

    public static Executor directExecutor() {
        return DirectExecutor.INSTANCE;
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static Executor newSequentialExecutor(Executor delegate) {
        return new SequentialExecutor(delegate);
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static ListeningExecutorService listeningDecorator(ExecutorService delegate) {
        ListeningExecutorService listeningDecorator;
        if (delegate instanceof ListeningExecutorService) {
            return (ListeningExecutorService) delegate;
        }
        if (delegate instanceof ScheduledExecutorService) {
            listeningDecorator = new ScheduledListeningDecorator((ScheduledExecutorService) delegate);
        } else {
            listeningDecorator = new ListeningDecorator(delegate);
        }
        return listeningDecorator;
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static ListeningScheduledExecutorService listeningDecorator(ScheduledExecutorService delegate) {
        if (delegate instanceof ListeningScheduledExecutorService) {
            return (ListeningScheduledExecutorService) delegate;
        }
        return new ScheduledListeningDecorator(delegate);
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static class ListeningDecorator extends AbstractListeningExecutorService {
        public final ExecutorService delegate;

        public ListeningDecorator(ExecutorService delegate) {
            this.delegate = (ExecutorService) Preconditions.checkNotNull(delegate);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
            return this.delegate.awaitTermination(timeout, unit);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isShutdown() {
            return this.delegate.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isTerminated() {
            return this.delegate.isTerminated();
        }

        @Override // java.util.concurrent.ExecutorService
        public final void shutdown() {
            this.delegate.shutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final List<Runnable> shutdownNow() {
            return this.delegate.shutdownNow();
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable command) {
            this.delegate.execute(command);
        }

        public final String toString() {
            return super.toString() + "[" + this.delegate + "]";
        }
    }

    @GwtIncompatible
    @J2ktIncompatible
    /* loaded from: classes7.dex */
    public static final class ScheduledListeningDecorator extends ListeningDecorator implements ListeningScheduledExecutorService {
        public final ScheduledExecutorService delegate;

        public ScheduledListeningDecorator(ScheduledExecutorService delegate) {
            super(delegate);
            this.delegate = (ScheduledExecutorService) Preconditions.checkNotNull(delegate);
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public ListenableScheduledFuture<?> schedule(Runnable command, long delay, TimeUnit unit) {
            TrustedListenableFutureTask trustedListenableFutureTaskCreate = TrustedListenableFutureTask.create(command, null);
            return new ListenableScheduledTask(trustedListenableFutureTaskCreate, this.delegate.schedule(trustedListenableFutureTaskCreate, delay, unit));
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public <V> ListenableScheduledFuture<V> schedule(Callable<V> callable, long delay, TimeUnit unit) {
            TrustedListenableFutureTask trustedListenableFutureTaskCreate = TrustedListenableFutureTask.create(callable);
            return new ListenableScheduledTask(trustedListenableFutureTaskCreate, this.delegate.schedule(trustedListenableFutureTaskCreate, delay, unit));
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public ListenableScheduledFuture<?> scheduleAtFixedRate(Runnable command, long initialDelay, long period, TimeUnit unit) {
            NeverSuccessfulListenableFutureTask neverSuccessfulListenableFutureTask = new NeverSuccessfulListenableFutureTask(command);
            return new ListenableScheduledTask(neverSuccessfulListenableFutureTask, this.delegate.scheduleAtFixedRate(neverSuccessfulListenableFutureTask, initialDelay, period, unit));
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public ListenableScheduledFuture<?> scheduleWithFixedDelay(Runnable command, long initialDelay, long delay, TimeUnit unit) {
            NeverSuccessfulListenableFutureTask neverSuccessfulListenableFutureTask = new NeverSuccessfulListenableFutureTask(command);
            return new ListenableScheduledTask(neverSuccessfulListenableFutureTask, this.delegate.scheduleWithFixedDelay(neverSuccessfulListenableFutureTask, initialDelay, delay, unit));
        }

        /* loaded from: classes8.dex */
        public static final class ListenableScheduledTask<V> extends ForwardingListenableFuture.SimpleForwardingListenableFuture<V> implements ListenableScheduledFuture<V> {
            public final ScheduledFuture<?> scheduledDelegate;

            public ListenableScheduledTask(ListenableFuture<V> listenableDelegate, ScheduledFuture<?> scheduledDelegate) {
                super(listenableDelegate);
                this.scheduledDelegate = scheduledDelegate;
            }

            @Override // com.google.common.util.concurrent.ForwardingFuture, java.util.concurrent.Future
            public boolean cancel(boolean mayInterruptIfRunning) {
                boolean zCancel = super.cancel(mayInterruptIfRunning);
                if (zCancel) {
                    this.scheduledDelegate.cancel(mayInterruptIfRunning);
                }
                return zCancel;
            }

            @Override // java.util.concurrent.Delayed
            public long getDelay(TimeUnit unit) {
                return this.scheduledDelegate.getDelay(unit);
            }

            @Override // java.lang.Comparable
            public int compareTo(Delayed other) {
                return this.scheduledDelegate.compareTo(other);
            }
        }

        @GwtIncompatible
        @J2ktIncompatible
        public static final class NeverSuccessfulListenableFutureTask extends AbstractFuture.TrustedFuture<Void> implements Runnable {
            public final Runnable delegate;

            public NeverSuccessfulListenableFutureTask(Runnable delegate) {
                this.delegate = (Runnable) Preconditions.checkNotNull(delegate);
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.delegate.run();
                } catch (Error | RuntimeException e) {
                    setException(e);
                    throw e;
                }
            }

            @Override // com.google.common.util.concurrent.AbstractFuture
            public String pendingToString() {
                return "task=[" + this.delegate + "]";
            }
        }
    }

    @GwtIncompatible
    @J2ktIncompatible
    @ParametricNullness
    public static <T> T invokeAnyImpl(ListeningExecutorService listeningExecutorService, Collection<? extends Callable<T>> collection, boolean z, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long jNanoTime;
        long jNanoTime2;
        Preconditions.checkNotNull(listeningExecutorService);
        Preconditions.checkNotNull(timeUnit);
        int size = collection.size();
        Preconditions.checkArgument(size > 0);
        ArrayList arrayListNewArrayListWithCapacity = Lists.newArrayListWithCapacity(size);
        LinkedBlockingQueue linkedBlockingQueueNewLinkedBlockingQueue = Queues.newLinkedBlockingQueue();
        long nanos = timeUnit.toNanos(j);
        if (z) {
            try {
                jNanoTime = System.nanoTime();
            } catch (Throwable th) {
                Iterator it = arrayListNewArrayListWithCapacity.iterator();
                while (it.hasNext()) {
                    ((Future) it.next()).cancel(true);
                }
                throw th;
            }
        } else {
            jNanoTime = 0;
        }
        Iterator<? extends Callable<T>> it2 = collection.iterator();
        arrayListNewArrayListWithCapacity.add(submitAndAddQueueListener(listeningExecutorService, it2.next(), linkedBlockingQueueNewLinkedBlockingQueue));
        int i = size - 1;
        int i2 = 1;
        ExecutionException executionException = null;
        while (true) {
            Future future = (Future) linkedBlockingQueueNewLinkedBlockingQueue.poll();
            if (future != null) {
                jNanoTime2 = jNanoTime;
            } else {
                if (i > 0) {
                    i--;
                    arrayListNewArrayListWithCapacity.add(submitAndAddQueueListener(listeningExecutorService, it2.next(), linkedBlockingQueueNewLinkedBlockingQueue));
                    i2++;
                } else {
                    if (i2 == 0) {
                        if (executionException == null) {
                            throw new ExecutionException((Throwable) null);
                        }
                        throw executionException;
                    }
                    if (z) {
                        future = (Future) linkedBlockingQueueNewLinkedBlockingQueue.poll(nanos, TimeUnit.NANOSECONDS);
                        if (future == null) {
                            throw new TimeoutException();
                        }
                        jNanoTime2 = System.nanoTime();
                        nanos -= jNanoTime2 - jNanoTime;
                    } else {
                        future = (Future) linkedBlockingQueueNewLinkedBlockingQueue.take();
                    }
                }
                jNanoTime2 = jNanoTime;
            }
            long j2 = nanos;
            int i3 = i;
            if (future != null) {
                i2--;
                try {
                    T t = (T) future.get();
                    Iterator it3 = arrayListNewArrayListWithCapacity.iterator();
                    while (it3.hasNext()) {
                        ((Future) it3.next()).cancel(true);
                    }
                    return t;
                } catch (RuntimeException e) {
                    executionException = new ExecutionException(e);
                } catch (ExecutionException e2) {
                    executionException = e2;
                }
            }
            i = i3;
            nanos = j2;
            jNanoTime = jNanoTime2;
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static <T> ListenableFuture<T> submitAndAddQueueListener(ListeningExecutorService executorService, Callable<T> task, final BlockingQueue<Future<T>> queue) {
        ListenableFuture<T> listenableFutureSubmit = executorService.submit((Callable) task);
        listenableFutureSubmit.addListener(new Runnable() { // from class: com.google.common.util.concurrent.MoreExecutors.1
            public final /* synthetic */ ListenableFuture val$future;
            public final /* synthetic */ BlockingQueue val$queue;

            public RunnableC75941(final BlockingQueue queue2, ListenableFuture listenableFutureSubmit2) {
                val$queue = queue2;
                val$future = listenableFutureSubmit2;
            }

            @Override // java.lang.Runnable
            public void run() {
                val$queue.add(val$future);
            }
        }, directExecutor());
        return listenableFutureSubmit2;
    }

    /* renamed from: com.google.common.util.concurrent.MoreExecutors$1 */
    public class RunnableC75941 implements Runnable {
        public final /* synthetic */ ListenableFuture val$future;
        public final /* synthetic */ BlockingQueue val$queue;

        public RunnableC75941(final BlockingQueue queue2, ListenableFuture listenableFutureSubmit2) {
            val$queue = queue2;
            val$future = listenableFutureSubmit2;
        }

        @Override // java.lang.Runnable
        public void run() {
            val$queue.add(val$future);
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static ThreadFactory platformThreadFactory() {
        if (!isAppEngineWithApiClasses()) {
            return Executors.defaultThreadFactory();
        }
        try {
            return (ThreadFactory) Class.forName("com.google.appengine.api.ThreadManager").getMethod("currentRequestThreadFactory", null).invoke(null, null);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", e3);
        } catch (InvocationTargetException e4) {
            throw Throwables.propagate(e4.getCause());
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static boolean isAppEngineWithApiClasses() throws ClassNotFoundException {
        if (System.getProperty("com.google.appengine.runtime.environment") == null) {
            return false;
        }
        try {
            Class.forName("com.google.appengine.api.utils.SystemProperty");
            return Class.forName("com.google.apphosting.api.ApiProxy").getMethod("getCurrentEnvironment", null).invoke(null, null) != null;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return false;
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static Thread newThread(String name, Runnable runnable) {
        Preconditions.checkNotNull(name);
        Preconditions.checkNotNull(runnable);
        Thread threadNewThread = platformThreadFactory().newThread(runnable);
        Objects.requireNonNull(threadNewThread);
        try {
            threadNewThread.setName(name);
        } catch (SecurityException unused) {
        }
        return threadNewThread;
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static Executor renamingDecorator(final Executor executor, final Supplier<String> nameSupplier) {
        Preconditions.checkNotNull(executor);
        Preconditions.checkNotNull(nameSupplier);
        return new Executor() { // from class: com.google.common.util.concurrent.MoreExecutors.2
            public final /* synthetic */ Executor val$executor;
            public final /* synthetic */ Supplier val$nameSupplier;

            public ExecutorC75952(final Executor executor2, final Supplier nameSupplier2) {
                val$executor = executor2;
                val$nameSupplier = nameSupplier2;
            }

            @Override // java.util.concurrent.Executor
            public void execute(Runnable command) {
                val$executor.execute(Callables.threadRenaming(command, (Supplier<String>) val$nameSupplier));
            }
        };
    }

    /* renamed from: com.google.common.util.concurrent.MoreExecutors$2 */
    public class ExecutorC75952 implements Executor {
        public final /* synthetic */ Executor val$executor;
        public final /* synthetic */ Supplier val$nameSupplier;

        public ExecutorC75952(final Executor executor2, final Supplier nameSupplier2) {
            val$executor = executor2;
            val$nameSupplier = nameSupplier2;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable command) {
            val$executor.execute(Callables.threadRenaming(command, (Supplier<String>) val$nameSupplier));
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static ExecutorService renamingDecorator(final ExecutorService service, final Supplier<String> nameSupplier) {
        Preconditions.checkNotNull(service);
        Preconditions.checkNotNull(nameSupplier);
        return new WrappingExecutorService(service) { // from class: com.google.common.util.concurrent.MoreExecutors.3
            public final /* synthetic */ Supplier val$nameSupplier;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C75963(final ExecutorService service2, final Supplier nameSupplier2) {
                super(service2);
                val$nameSupplier = nameSupplier2;
            }

            @Override // com.google.common.util.concurrent.WrappingExecutorService
            public <T> Callable<T> wrapTask(Callable<T> callable) {
                return Callables.threadRenaming(callable, (Supplier<String>) val$nameSupplier);
            }

            @Override // com.google.common.util.concurrent.WrappingExecutorService
            public Runnable wrapTask(Runnable command) {
                return Callables.threadRenaming(command, (Supplier<String>) val$nameSupplier);
            }
        };
    }

    /* renamed from: com.google.common.util.concurrent.MoreExecutors$3 */
    /* loaded from: classes7.dex */
    public class C75963 extends WrappingExecutorService {
        public final /* synthetic */ Supplier val$nameSupplier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C75963(final ExecutorService service2, final Supplier nameSupplier2) {
            super(service2);
            val$nameSupplier = nameSupplier2;
        }

        @Override // com.google.common.util.concurrent.WrappingExecutorService
        public <T> Callable<T> wrapTask(Callable<T> callable) {
            return Callables.threadRenaming(callable, (Supplier<String>) val$nameSupplier);
        }

        @Override // com.google.common.util.concurrent.WrappingExecutorService
        public Runnable wrapTask(Runnable command) {
            return Callables.threadRenaming(command, (Supplier<String>) val$nameSupplier);
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static ScheduledExecutorService renamingDecorator(final ScheduledExecutorService service, final Supplier<String> nameSupplier) {
        Preconditions.checkNotNull(service);
        Preconditions.checkNotNull(nameSupplier);
        return new WrappingScheduledExecutorService(service) { // from class: com.google.common.util.concurrent.MoreExecutors.4
            public final /* synthetic */ Supplier val$nameSupplier;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C75974(final ScheduledExecutorService service2, final Supplier nameSupplier2) {
                super(service2);
                val$nameSupplier = nameSupplier2;
            }

            @Override // com.google.common.util.concurrent.WrappingExecutorService
            public <T> Callable<T> wrapTask(Callable<T> callable) {
                return Callables.threadRenaming(callable, (Supplier<String>) val$nameSupplier);
            }

            @Override // com.google.common.util.concurrent.WrappingExecutorService
            public Runnable wrapTask(Runnable command) {
                return Callables.threadRenaming(command, (Supplier<String>) val$nameSupplier);
            }
        };
    }

    /* renamed from: com.google.common.util.concurrent.MoreExecutors$4 */
    public class C75974 extends WrappingScheduledExecutorService {
        public final /* synthetic */ Supplier val$nameSupplier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C75974(final ScheduledExecutorService service2, final Supplier nameSupplier2) {
            super(service2);
            val$nameSupplier = nameSupplier2;
        }

        @Override // com.google.common.util.concurrent.WrappingExecutorService
        public <T> Callable<T> wrapTask(Callable<T> callable) {
            return Callables.threadRenaming(callable, (Supplier<String>) val$nameSupplier);
        }

        @Override // com.google.common.util.concurrent.WrappingExecutorService
        public Runnable wrapTask(Runnable command) {
            return Callables.threadRenaming(command, (Supplier<String>) val$nameSupplier);
        }
    }

    @CanIgnoreReturnValue
    @J2ktIncompatible
    @GwtIncompatible
    public static boolean shutdownAndAwaitTermination(ExecutorService service, long timeout, TimeUnit unit) throws InterruptedException {
        long nanos = unit.toNanos(timeout) / 2;
        service.shutdown();
        try {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (!service.awaitTermination(nanos, timeUnit)) {
                service.shutdownNow();
                service.awaitTermination(nanos, timeUnit);
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            service.shutdownNow();
        }
        return service.isTerminated();
    }

    public static Executor rejectionPropagatingExecutor(final Executor delegate, final AbstractFuture<?> future) {
        Preconditions.checkNotNull(delegate);
        Preconditions.checkNotNull(future);
        return delegate == directExecutor() ? delegate : new Executor() { // from class: com.google.common.util.concurrent.MoreExecutors.5
            public final /* synthetic */ Executor val$delegate;
            public final /* synthetic */ AbstractFuture val$future;

            public ExecutorC75985(final Executor delegate2, final AbstractFuture future2) {
                val$delegate = delegate2;
                val$future = future2;
            }

            @Override // java.util.concurrent.Executor
            public void execute(Runnable command) {
                try {
                    val$delegate.execute(command);
                } catch (RejectedExecutionException e) {
                    val$future.setException(e);
                }
            }
        };
    }

    /* renamed from: com.google.common.util.concurrent.MoreExecutors$5 */
    public class ExecutorC75985 implements Executor {
        public final /* synthetic */ Executor val$delegate;
        public final /* synthetic */ AbstractFuture val$future;

        public ExecutorC75985(final Executor delegate2, final AbstractFuture future2) {
            val$delegate = delegate2;
            val$future = future2;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable command) {
            try {
                val$delegate.execute(command);
            } catch (RejectedExecutionException e) {
                val$future.setException(e);
            }
        }
    }
}
