package io.reactivex.rxjava3.internal.operators.parallel;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.QueueOverflowException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.operators.SimplePlainQueue;
import io.reactivex.rxjava3.operators.SpscArrayQueue;
import io.reactivex.rxjava3.parallel.ParallelFlowable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes8.dex */
public final class ParallelJoin<T> extends Flowable<T> {
    public final boolean delayErrors;
    public final int prefetch;
    public final ParallelFlowable<? extends T> source;

    public ParallelJoin(ParallelFlowable<? extends T> source, int prefetch, boolean delayErrors) {
        this.source = source;
        this.prefetch = prefetch;
        this.delayErrors = delayErrors;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> s) {
        JoinSubscriptionBase joinSubscription;
        if (this.delayErrors) {
            joinSubscription = new JoinSubscriptionDelayError(s, this.source.parallelism(), this.prefetch);
        } else {
            joinSubscription = new JoinSubscription(s, this.source.parallelism(), this.prefetch);
        }
        s.onSubscribe(joinSubscription);
        this.source.subscribe(joinSubscription.subscribers);
    }

    /* loaded from: classes5.dex */
    public static abstract class JoinSubscriptionBase<T> extends AtomicInteger implements Subscription {
        public static final long serialVersionUID = 3100232009247827843L;
        public volatile boolean cancelled;
        public final Subscriber<? super T> downstream;
        public final JoinInnerSubscriber<T>[] subscribers;
        public final AtomicThrowable errors = new AtomicThrowable();
        public final AtomicLong requested = new AtomicLong();
        public final AtomicInteger done = new AtomicInteger();

        public abstract void drain();

        public abstract void onComplete();

        public abstract void onError(Throwable e);

        public abstract void onNext(JoinInnerSubscriber<T> inner, T value);

        public JoinSubscriptionBase(Subscriber<? super T> actual, int n, int prefetch) {
            this.downstream = actual;
            JoinInnerSubscriber<T>[] joinInnerSubscriberArr = new JoinInnerSubscriber[n];
            for (int i = 0; i < n; i++) {
                joinInnerSubscriberArr[i] = new JoinInnerSubscriber<>(this, prefetch);
            }
            this.subscribers = joinInnerSubscriberArr;
            this.done.lazySet(n);
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n) {
            if (SubscriptionHelper.validate(n)) {
                BackpressureHelper.add(this.requested, n);
                drain();
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            cancelAll();
            if (getAndIncrement() == 0) {
                cleanup();
            }
        }

        public void cancelAll() {
            for (JoinInnerSubscriber<T> joinInnerSubscriber : this.subscribers) {
                joinInnerSubscriber.cancel();
            }
        }

        public void cleanup() {
            for (JoinInnerSubscriber<T> joinInnerSubscriber : this.subscribers) {
                joinInnerSubscriber.queue = null;
            }
        }
    }

    public static final class JoinSubscription<T> extends JoinSubscriptionBase<T> {
        public static final long serialVersionUID = 6312374661811000451L;

        public JoinSubscription(Subscriber<? super T> actual, int n, int prefetch) {
            super(actual, n, prefetch);
        }

        @Override // io.reactivex.rxjava3.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        public void onNext(JoinInnerSubscriber<T> inner, T value) {
            if (get() == 0 && compareAndSet(0, 1)) {
                if (this.requested.get() != 0) {
                    this.downstream.onNext(value);
                    if (this.requested.get() != Long.MAX_VALUE) {
                        this.requested.decrementAndGet();
                    }
                    inner.request(1L);
                } else if (!inner.getQueue().offer(value)) {
                    cancelAll();
                    QueueOverflowException queueOverflowException = new QueueOverflowException();
                    if (this.errors.compareAndSet(null, queueOverflowException)) {
                        this.downstream.onError(queueOverflowException);
                        return;
                    } else {
                        RxJavaPlugins.onError(queueOverflowException);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else if (!inner.getQueue().offer(value)) {
                cancelAll();
                onError(new QueueOverflowException());
                return;
            } else if (getAndIncrement() != 0) {
                return;
            }
            drainLoop();
        }

        @Override // io.reactivex.rxjava3.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        public void onError(Throwable e) {
            if (this.errors.compareAndSet(null, e)) {
                cancelAll();
                drain();
            } else if (e != this.errors.get()) {
                RxJavaPlugins.onError(e);
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        public void onComplete() {
            this.done.decrementAndGet();
            drain();
        }

        @Override // io.reactivex.rxjava3.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            drainLoop();
        }

        /* JADX WARN: Code restructure failed: missing block: B:120:0x005d, code lost:
        
            if (r12 == false) goto L169;
         */
        /* JADX WARN: Code restructure failed: missing block: B:121:0x005f, code lost:
        
            if (r15 == false) goto L170;
         */
        /* JADX WARN: Code restructure failed: missing block: B:122:0x0061, code lost:
        
            r3.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:123:0x0064, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:124:0x0065, code lost:
        
            if (r15 == false) goto L171;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void drainLoop() {
            boolean z;
            T tPoll;
            JoinInnerSubscriber<T>[] joinInnerSubscriberArr = this.subscribers;
            int length = joinInnerSubscriberArr.length;
            Subscriber<? super T> subscriber = this.downstream;
            int iAddAndGet = 1;
            do {
                long j = this.requested.get();
                long j2 = 0;
                while (j2 != j) {
                    if (this.cancelled) {
                        cleanup();
                        return;
                    }
                    Throwable th = this.errors.get();
                    if (th != null) {
                        cleanup();
                        subscriber.onError(th);
                        return;
                    }
                    boolean z2 = this.done.get() == 0;
                    int i = 0;
                    boolean z3 = true;
                    while (true) {
                        if (i >= joinInnerSubscriberArr.length) {
                            break;
                        }
                        JoinInnerSubscriber<T> joinInnerSubscriber = joinInnerSubscriberArr[i];
                        SimplePlainQueue<T> simplePlainQueue = joinInnerSubscriber.queue;
                        if (simplePlainQueue != null && (tPoll = simplePlainQueue.poll()) != null) {
                            subscriber.onNext(tPoll);
                            joinInnerSubscriber.requestOne();
                            j2++;
                            if (j2 == j) {
                                break;
                            } else {
                                z3 = false;
                            }
                        }
                        i++;
                    }
                }
                if (j2 == j) {
                    if (this.cancelled) {
                        cleanup();
                        return;
                    }
                    Throwable th2 = this.errors.get();
                    if (th2 != null) {
                        cleanup();
                        subscriber.onError(th2);
                        return;
                    }
                    boolean z4 = this.done.get() == 0;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            SimplePlainQueue<T> simplePlainQueue2 = joinInnerSubscriberArr[i2].queue;
                            if (simplePlainQueue2 != null && !simplePlainQueue2.isEmpty()) {
                                z = false;
                                break;
                            }
                            i2++;
                        } else {
                            z = true;
                            break;
                        }
                    }
                    if (z4 && z) {
                        subscriber.onComplete();
                        return;
                    }
                }
                if (j2 != 0) {
                    BackpressureHelper.produced(this.requested, j2);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }
    }

    public static final class JoinSubscriptionDelayError<T> extends JoinSubscriptionBase<T> {
        public static final long serialVersionUID = -5737965195918321883L;

        public JoinSubscriptionDelayError(Subscriber<? super T> actual, int n, int prefetch) {
            super(actual, n, prefetch);
        }

        @Override // io.reactivex.rxjava3.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        public void onNext(JoinInnerSubscriber<T> inner, T value) {
            if (get() == 0 && compareAndSet(0, 1)) {
                if (this.requested.get() != 0) {
                    this.downstream.onNext(value);
                    if (this.requested.get() != Long.MAX_VALUE) {
                        this.requested.decrementAndGet();
                    }
                    inner.request(1L);
                } else if (!inner.getQueue().offer(value)) {
                    inner.cancel();
                    this.errors.tryAddThrowableOrReport(new QueueOverflowException());
                    this.done.decrementAndGet();
                    drainLoop();
                    return;
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                if (!inner.getQueue().offer(value)) {
                    inner.cancel();
                    this.errors.tryAddThrowableOrReport(new QueueOverflowException());
                    this.done.decrementAndGet();
                }
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }

        @Override // io.reactivex.rxjava3.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        public void onError(Throwable e) {
            if (this.errors.tryAddThrowableOrReport(e)) {
                this.done.decrementAndGet();
                drain();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        public void onComplete() {
            this.done.decrementAndGet();
            drain();
        }

        @Override // io.reactivex.rxjava3.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            drainLoop();
        }

        /* JADX WARN: Code restructure failed: missing block: B:104:0x004b, code lost:
        
            if (r12 == false) goto L147;
         */
        /* JADX WARN: Code restructure failed: missing block: B:105:0x004d, code lost:
        
            if (r15 == false) goto L148;
         */
        /* JADX WARN: Code restructure failed: missing block: B:106:0x004f, code lost:
        
            r18.errors.tryTerminateConsumer(r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:107:0x0054, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:108:0x0055, code lost:
        
            if (r15 == false) goto L149;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void drainLoop() {
            boolean z;
            T tPoll;
            JoinInnerSubscriber<T>[] joinInnerSubscriberArr = this.subscribers;
            int length = joinInnerSubscriberArr.length;
            Subscriber<? super T> subscriber = this.downstream;
            int iAddAndGet = 1;
            do {
                long j = this.requested.get();
                long j2 = 0;
                while (j2 != j) {
                    if (this.cancelled) {
                        cleanup();
                        return;
                    }
                    boolean z2 = this.done.get() == 0;
                    int i = 0;
                    boolean z3 = true;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        JoinInnerSubscriber<T> joinInnerSubscriber = joinInnerSubscriberArr[i];
                        SimplePlainQueue<T> simplePlainQueue = joinInnerSubscriber.queue;
                        if (simplePlainQueue != null && (tPoll = simplePlainQueue.poll()) != null) {
                            subscriber.onNext(tPoll);
                            joinInnerSubscriber.requestOne();
                            j2++;
                            if (j2 == j) {
                                break;
                            } else {
                                z3 = false;
                            }
                        }
                        i++;
                    }
                }
                if (j2 == j) {
                    if (this.cancelled) {
                        cleanup();
                        return;
                    }
                    boolean z4 = this.done.get() == 0;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            SimplePlainQueue<T> simplePlainQueue2 = joinInnerSubscriberArr[i2].queue;
                            if (simplePlainQueue2 != null && !simplePlainQueue2.isEmpty()) {
                                z = false;
                                break;
                            }
                            i2++;
                        } else {
                            z = true;
                            break;
                        }
                    }
                    if (z4 && z) {
                        this.errors.tryTerminateConsumer(subscriber);
                        return;
                    }
                }
                if (j2 != 0) {
                    BackpressureHelper.produced(this.requested, j2);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }
    }

    public static final class JoinInnerSubscriber<T> extends AtomicReference<Subscription> implements FlowableSubscriber<T> {
        public static final long serialVersionUID = 8410034718427740355L;
        public final int limit;
        public final JoinSubscriptionBase<T> parent;
        public final int prefetch;
        public long produced;
        public volatile SimplePlainQueue<T> queue;

        public JoinInnerSubscriber(JoinSubscriptionBase<T> parent, int prefetch) {
            this.parent = parent;
            this.prefetch = prefetch;
            this.limit = prefetch - (prefetch >> 2);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription s) {
            SubscriptionHelper.setOnce(this, s, this.prefetch);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            this.parent.onNext(this, t);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable t) {
            this.parent.onError(t);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.parent.onComplete();
        }

        public void requestOne() {
            long j = this.produced + 1;
            if (j == this.limit) {
                this.produced = 0L;
                get().request(j);
            } else {
                this.produced = j;
            }
        }

        public void request(long n) {
            long j = this.produced + n;
            if (j >= this.limit) {
                this.produced = 0L;
                get().request(j);
            } else {
                this.produced = j;
            }
        }

        public boolean cancel() {
            return SubscriptionHelper.cancel(this);
        }

        public SimplePlainQueue<T> getQueue() {
            SimplePlainQueue<T> simplePlainQueue = this.queue;
            if (simplePlainQueue != null) {
                return simplePlainQueue;
            }
            SpscArrayQueue spscArrayQueue = new SpscArrayQueue(this.prefetch);
            this.queue = spscArrayQueue;
            return spscArrayQueue;
        }
    }
}
