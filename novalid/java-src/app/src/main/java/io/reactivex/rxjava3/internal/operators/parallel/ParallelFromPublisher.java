package io.reactivex.rxjava3.internal.operators.parallel;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.exceptions.QueueOverflowException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.operators.QueueSubscription;
import io.reactivex.rxjava3.operators.SimpleQueue;
import io.reactivex.rxjava3.operators.SpscArrayQueue;
import io.reactivex.rxjava3.parallel.ParallelFlowable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongArray;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class ParallelFromPublisher<T> extends ParallelFlowable<T> {
    public final int parallelism;
    public final int prefetch;
    public final Publisher<? extends T> source;

    public ParallelFromPublisher(Publisher<? extends T> source, int parallelism, int prefetch) {
        this.source = source;
        this.parallelism = parallelism;
        this.prefetch = prefetch;
    }

    @Override // io.reactivex.rxjava3.parallel.ParallelFlowable
    public int parallelism() {
        return this.parallelism;
    }

    @Override // io.reactivex.rxjava3.parallel.ParallelFlowable
    public void subscribe(Subscriber<? super T>[] subscribers) {
        Subscriber<?>[] subscriberArrOnSubscribe = RxJavaPlugins.onSubscribe(this, subscribers);
        if (validate(subscriberArrOnSubscribe)) {
            this.source.subscribe(new ParallelDispatcher(subscriberArrOnSubscribe, this.prefetch));
        }
    }

    /* loaded from: classes8.dex */
    public static final class ParallelDispatcher<T> extends AtomicInteger implements FlowableSubscriber<T> {
        public static final long serialVersionUID = -4470634016609963609L;
        public volatile boolean cancelled;
        public volatile boolean done;
        public final long[] emissions;
        public Throwable error;
        public int index;
        public final int limit;
        public final int prefetch;
        public int produced;
        public SimpleQueue<T> queue;
        public final AtomicLongArray requests;
        public int sourceMode;
        public final AtomicInteger subscriberCount = new AtomicInteger();
        public final Subscriber<? super T>[] subscribers;
        public Subscription upstream;

        public ParallelDispatcher(Subscriber<? super T>[] subscribers, int prefetch) {
            this.subscribers = subscribers;
            this.prefetch = prefetch;
            this.limit = prefetch - (prefetch >> 2);
            int length = subscribers.length;
            int i = length + length;
            AtomicLongArray atomicLongArray = new AtomicLongArray(i + 1);
            this.requests = atomicLongArray;
            atomicLongArray.lazySet(i, length);
            this.emissions = new long[length];
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription s) {
            if (SubscriptionHelper.validate(this.upstream, s)) {
                this.upstream = s;
                if (s instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) s;
                    int iRequestFusion = queueSubscription.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.sourceMode = iRequestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        setupSubscribers();
                        drain();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.sourceMode = iRequestFusion;
                        this.queue = queueSubscription;
                        setupSubscribers();
                        s.request(this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                setupSubscribers();
                s.request(this.prefetch);
            }
        }

        public void setupSubscribers() {
            Subscriber<? super T>[] subscriberArr = this.subscribers;
            int length = subscriberArr.length;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                this.subscriberCount.lazySet(i2);
                subscriberArr[i].onSubscribe(new RailSubscription(i, length));
                i = i2;
            }
        }

        /* loaded from: classes5.dex */
        public final class RailSubscription implements Subscription {

            /* renamed from: j */
            public final int f9756j;

            /* renamed from: m */
            public final int f9757m;

            public RailSubscription(int j, int m) {
                this.f9756j = j;
                this.f9757m = m;
            }

            @Override // org.reactivestreams.Subscription
            public void request(long n) {
                long j;
                if (SubscriptionHelper.validate(n)) {
                    AtomicLongArray atomicLongArray = ParallelDispatcher.this.requests;
                    do {
                        j = atomicLongArray.get(this.f9756j);
                        if (j == Long.MAX_VALUE) {
                            return;
                        }
                    } while (!atomicLongArray.compareAndSet(this.f9756j, j, BackpressureHelper.addCap(j, n)));
                    if (ParallelDispatcher.this.subscriberCount.get() == this.f9757m) {
                        ParallelDispatcher.this.drain();
                    }
                }
            }

            @Override // org.reactivestreams.Subscription
            public void cancel() {
                if (ParallelDispatcher.this.requests.compareAndSet(this.f9756j + this.f9757m, 0L, 1L)) {
                    ParallelDispatcher parallelDispatcher = ParallelDispatcher.this;
                    int i = this.f9757m;
                    parallelDispatcher.cancel(i + i);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.sourceMode == 0 && !this.queue.offer(t)) {
                this.upstream.cancel();
                onError(new QueueOverflowException());
            } else {
                drain();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable t) {
            this.error = t;
            this.done = true;
            drain();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.done = true;
            drain();
        }

        public void cancel(int m) {
            if (this.requests.decrementAndGet(m) == 0) {
                this.cancelled = true;
                this.upstream.cancel();
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        public void drainAsync() {
            Throwable th;
            SimpleQueue<T> simpleQueue = this.queue;
            Subscriber<? super T>[] subscriberArr = this.subscribers;
            AtomicLongArray atomicLongArray = this.requests;
            long[] jArr = this.emissions;
            int length = jArr.length;
            int i = this.index;
            int i2 = this.produced;
            int iAddAndGet = 1;
            while (true) {
                int i3 = 0;
                int i4 = 0;
                while (!this.cancelled) {
                    boolean z = this.done;
                    if (z && (th = this.error) != null) {
                        simpleQueue.clear();
                        int length2 = subscriberArr.length;
                        while (i3 < length2) {
                            subscriberArr[i3].onError(th);
                            i3++;
                        }
                        return;
                    }
                    boolean zIsEmpty = simpleQueue.isEmpty();
                    if (z && zIsEmpty) {
                        int length3 = subscriberArr.length;
                        while (i3 < length3) {
                            subscriberArr[i3].onComplete();
                            i3++;
                        }
                        return;
                    }
                    if (!zIsEmpty) {
                        long j = atomicLongArray.get(i);
                        long j2 = jArr[i];
                        if (j == j2 || atomicLongArray.get(length + i) != 0) {
                            i4++;
                        } else {
                            try {
                                T tPoll = simpleQueue.poll();
                                if (tPoll != null) {
                                    subscriberArr[i].onNext(tPoll);
                                    jArr[i] = j2 + 1;
                                    i2++;
                                    if (i2 == this.limit) {
                                        this.upstream.request(i2);
                                        i2 = 0;
                                    }
                                    i4 = 0;
                                }
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                this.upstream.cancel();
                                int length4 = subscriberArr.length;
                                while (i3 < length4) {
                                    subscriberArr[i3].onError(th2);
                                    i3++;
                                }
                                return;
                            }
                        }
                        i++;
                        if (i == length) {
                            i = 0;
                        }
                        if (i4 == length) {
                        }
                    }
                    int i5 = get();
                    if (i5 == iAddAndGet) {
                        this.index = i;
                        this.produced = i2;
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else {
                        iAddAndGet = i5;
                    }
                }
                simpleQueue.clear();
                return;
            }
        }

        public void drainSync() {
            SimpleQueue<T> simpleQueue = this.queue;
            Subscriber<? super T>[] subscriberArr = this.subscribers;
            AtomicLongArray atomicLongArray = this.requests;
            long[] jArr = this.emissions;
            int length = jArr.length;
            int i = this.index;
            int iAddAndGet = 1;
            while (true) {
                int i2 = 0;
                int i3 = 0;
                while (!this.cancelled) {
                    if (simpleQueue.isEmpty()) {
                        int length2 = subscriberArr.length;
                        while (i2 < length2) {
                            subscriberArr[i2].onComplete();
                            i2++;
                        }
                        return;
                    }
                    long j = atomicLongArray.get(i);
                    long j2 = jArr[i];
                    if (j == j2 || atomicLongArray.get(length + i) != 0) {
                        i3++;
                    } else {
                        try {
                            T tPoll = simpleQueue.poll();
                            if (tPoll == null) {
                                int length3 = subscriberArr.length;
                                while (i2 < length3) {
                                    subscriberArr[i2].onComplete();
                                    i2++;
                                }
                                return;
                            }
                            subscriberArr[i].onNext(tPoll);
                            jArr[i] = j2 + 1;
                            i3 = 0;
                        } catch (Throwable th) {
                            Exceptions.throwIfFatal(th);
                            this.upstream.cancel();
                            int length4 = subscriberArr.length;
                            while (i2 < length4) {
                                subscriberArr[i2].onError(th);
                                i2++;
                            }
                            return;
                        }
                    }
                    i++;
                    if (i == length) {
                        i = 0;
                    }
                    if (i3 == length) {
                        int i4 = get();
                        if (i4 == iAddAndGet) {
                            this.index = i;
                            iAddAndGet = addAndGet(-iAddAndGet);
                            if (iAddAndGet == 0) {
                                return;
                            }
                        } else {
                            iAddAndGet = i4;
                        }
                    }
                }
                simpleQueue.clear();
                return;
            }
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.sourceMode == 1) {
                drainSync();
            } else {
                drainAsync();
            }
        }
    }
}
