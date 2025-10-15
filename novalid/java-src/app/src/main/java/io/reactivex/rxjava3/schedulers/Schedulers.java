package io.reactivex.rxjava3.schedulers;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.schedulers.ComputationScheduler;
import io.reactivex.rxjava3.internal.schedulers.IoScheduler;
import io.reactivex.rxjava3.internal.schedulers.NewThreadScheduler;
import io.reactivex.rxjava3.internal.schedulers.SingleScheduler;
import io.reactivex.rxjava3.internal.schedulers.TrampolineScheduler;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
public final class Schedulers {

    @NonNull
    public static final Scheduler SINGLE = RxJavaPlugins.initSingleScheduler(new SingleTask());

    @NonNull
    public static final Scheduler COMPUTATION = RxJavaPlugins.initComputationScheduler(new ComputationTask());

    /* renamed from: IO */
    @NonNull
    public static final Scheduler f9787IO = RxJavaPlugins.initIoScheduler(new IOTask());

    @NonNull
    public static final Scheduler TRAMPOLINE = TrampolineScheduler.instance();

    @NonNull
    public static final Scheduler NEW_THREAD = RxJavaPlugins.initNewThreadScheduler(new NewThreadTask());

    public static final class ComputationHolder {
        public static final Scheduler DEFAULT = new ComputationScheduler();
    }

    public static final class IoHolder {
        public static final Scheduler DEFAULT = new IoScheduler();
    }

    public static final class NewThreadHolder {
        public static final Scheduler DEFAULT = new NewThreadScheduler();
    }

    public static final class SingleHolder {
        public static final Scheduler DEFAULT = new SingleScheduler();
    }

    public Schedulers() {
        throw new IllegalStateException("No instances!");
    }

    @NonNull
    public static Scheduler computation() {
        return RxJavaPlugins.onComputationScheduler(COMPUTATION);
    }

    @NonNull
    /* renamed from: io */
    public static Scheduler m7102io() {
        return RxJavaPlugins.onIoScheduler(f9787IO);
    }

    @NonNull
    public static Scheduler trampoline() {
        return TRAMPOLINE;
    }

    @NonNull
    public static Scheduler newThread() {
        return RxJavaPlugins.onNewThreadScheduler(NEW_THREAD);
    }

    @NonNull
    public static Scheduler single() {
        return RxJavaPlugins.onSingleScheduler(SINGLE);
    }

    @NonNull
    public static Scheduler from(@NonNull Executor executor) {
        return from(executor, false, false);
    }

    @NonNull
    public static Scheduler from(@NonNull Executor executor, boolean interruptibleWorker) {
        return from(executor, interruptibleWorker, false);
    }

    @NonNull
    public static Scheduler from(@NonNull Executor executor, boolean interruptibleWorker, boolean fair) {
        return RxJavaPlugins.createExecutorScheduler(executor, interruptibleWorker, fair);
    }

    public static void shutdown() {
        computation().shutdown();
        m7102io().shutdown();
        newThread().shutdown();
        single().shutdown();
        trampoline().shutdown();
    }

    public static void start() {
        computation().start();
        m7102io().start();
        newThread().start();
        single().start();
        trampoline().start();
    }

    /* loaded from: classes6.dex */
    public static final class IOTask implements Supplier<Scheduler> {
        @Override // io.reactivex.rxjava3.functions.Supplier
        public Scheduler get() {
            return IoHolder.DEFAULT;
        }
    }

    /* loaded from: classes6.dex */
    public static final class NewThreadTask implements Supplier<Scheduler> {
        @Override // io.reactivex.rxjava3.functions.Supplier
        public Scheduler get() {
            return NewThreadHolder.DEFAULT;
        }
    }

    /* loaded from: classes6.dex */
    public static final class SingleTask implements Supplier<Scheduler> {
        @Override // io.reactivex.rxjava3.functions.Supplier
        public Scheduler get() {
            return SingleHolder.DEFAULT;
        }
    }

    /* loaded from: classes6.dex */
    public static final class ComputationTask implements Supplier<Scheduler> {
        @Override // io.reactivex.rxjava3.functions.Supplier
        public Scheduler get() {
            return ComputationHolder.DEFAULT;
        }
    }
}
