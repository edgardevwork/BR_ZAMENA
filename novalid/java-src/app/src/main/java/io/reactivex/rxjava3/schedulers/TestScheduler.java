package io.reactivex.rxjava3.schedulers;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class TestScheduler extends Scheduler {
    public long counter;
    public final Queue<TimedRunnable> queue;
    public volatile long time;
    public final boolean useOnScheduleHook;

    public TestScheduler() {
        this(false);
    }

    public TestScheduler(boolean useOnScheduleHook) {
        this.queue = new PriorityBlockingQueue(11);
        this.useOnScheduleHook = useOnScheduleHook;
    }

    public TestScheduler(long delayTime, TimeUnit unit) {
        this(delayTime, unit, false);
    }

    public TestScheduler(long delayTime, TimeUnit unit, boolean useOnScheduleHook) {
        this.queue = new PriorityBlockingQueue(11);
        this.time = unit.toNanos(delayTime);
        this.useOnScheduleHook = useOnScheduleHook;
    }

    /* loaded from: classes7.dex */
    public static final class TimedRunnable implements Comparable<TimedRunnable> {
        public final long count;
        public final Runnable run;
        public final TestWorker scheduler;
        public final long time;

        public TimedRunnable(TestWorker scheduler, long time, Runnable run, long count) {
            this.time = time;
            this.run = run;
            this.scheduler = scheduler;
            this.count = count;
        }

        public String toString() {
            return String.format("TimedRunnable(time = %d, run = %s)", Long.valueOf(this.time), this.run.toString());
        }

        @Override // java.lang.Comparable
        public int compareTo(TimedRunnable o) {
            long j = this.time;
            long j2 = o.time;
            if (j == j2) {
                return Long.compare(this.count, o.count);
            }
            return Long.compare(j, j2);
        }
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    public long now(@NonNull TimeUnit unit) {
        return unit.convert(this.time, TimeUnit.NANOSECONDS);
    }

    public void advanceTimeBy(long delayTime, TimeUnit unit) {
        advanceTimeTo(this.time + unit.toNanos(delayTime), TimeUnit.NANOSECONDS);
    }

    public void advanceTimeTo(long delayTime, TimeUnit unit) {
        triggerActions(unit.toNanos(delayTime));
    }

    public void triggerActions() {
        triggerActions(this.time);
    }

    public final void triggerActions(long targetTimeInNanoseconds) {
        while (true) {
            TimedRunnable timedRunnablePeek = this.queue.peek();
            if (timedRunnablePeek == null) {
                break;
            }
            long j = timedRunnablePeek.time;
            if (j > targetTimeInNanoseconds) {
                break;
            }
            if (j == 0) {
                j = this.time;
            }
            this.time = j;
            this.queue.remove(timedRunnablePeek);
            if (!timedRunnablePeek.scheduler.disposed) {
                timedRunnablePeek.run.run();
            }
        }
        this.time = targetTimeInNanoseconds;
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    @NonNull
    public Scheduler.Worker createWorker() {
        return new TestWorker();
    }

    public final class TestWorker extends Scheduler.Worker {
        public volatile boolean disposed;

        public TestWorker() {
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.disposed = true;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.disposed;
        }

        @Override // io.reactivex.rxjava3.core.Scheduler.Worker
        @NonNull
        public Disposable schedule(@NonNull Runnable run, long delayTime, @NonNull TimeUnit unit) {
            if (this.disposed) {
                return EmptyDisposable.INSTANCE;
            }
            if (TestScheduler.this.useOnScheduleHook) {
                run = RxJavaPlugins.onSchedule(run);
            }
            long nanos = TestScheduler.this.time + unit.toNanos(delayTime);
            TestScheduler testScheduler = TestScheduler.this;
            long j = testScheduler.counter;
            testScheduler.counter = 1 + j;
            TimedRunnable timedRunnable = new TimedRunnable(this, nanos, run, j);
            TestScheduler.this.queue.add(timedRunnable);
            return new QueueRemove(timedRunnable);
        }

        @Override // io.reactivex.rxjava3.core.Scheduler.Worker
        @NonNull
        public Disposable schedule(@NonNull Runnable run) {
            if (this.disposed) {
                return EmptyDisposable.INSTANCE;
            }
            if (TestScheduler.this.useOnScheduleHook) {
                run = RxJavaPlugins.onSchedule(run);
            }
            TestScheduler testScheduler = TestScheduler.this;
            long j = testScheduler.counter;
            testScheduler.counter = 1 + j;
            TimedRunnable timedRunnable = new TimedRunnable(this, 0L, run, j);
            TestScheduler.this.queue.add(timedRunnable);
            return new QueueRemove(timedRunnable);
        }

        @Override // io.reactivex.rxjava3.core.Scheduler.Worker
        public long now(@NonNull TimeUnit unit) {
            return TestScheduler.this.now(unit);
        }

        public final class QueueRemove extends AtomicReference<TimedRunnable> implements Disposable {
            public static final long serialVersionUID = -7874968252110604360L;

            public QueueRemove(TimedRunnable timedAction) {
                lazySet(timedAction);
            }

            @Override // io.reactivex.rxjava3.disposables.Disposable
            public void dispose() {
                TimedRunnable andSet = getAndSet(null);
                if (andSet != null) {
                    TestScheduler.this.queue.remove(andSet);
                }
            }

            @Override // io.reactivex.rxjava3.disposables.Disposable
            public boolean isDisposed() {
                return get() == null;
            }
        }
    }
}
