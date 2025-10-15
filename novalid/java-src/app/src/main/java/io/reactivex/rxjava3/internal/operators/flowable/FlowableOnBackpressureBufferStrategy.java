package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.BackpressureOverflowStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableOnBackpressureBufferStrategy<T> extends AbstractFlowableWithUpstream<T, T> {
    public final long bufferSize;
    public final Consumer<? super T> onDropped;
    public final Action onOverflow;
    public final BackpressureOverflowStrategy strategy;

    public FlowableOnBackpressureBufferStrategy(Flowable<T> source, long bufferSize, Action onOverflow, BackpressureOverflowStrategy strategy, Consumer<? super T> onDropped) {
        super(source);
        this.bufferSize = bufferSize;
        this.onOverflow = onOverflow;
        this.strategy = strategy;
        this.onDropped = onDropped;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> s) {
        this.source.subscribe((FlowableSubscriber) new OnBackpressureBufferStrategySubscriber(s, this.onOverflow, this.strategy, this.bufferSize, this.onDropped));
    }

    public static final class OnBackpressureBufferStrategySubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        public static final long serialVersionUID = 3240706908776709697L;
        public final long bufferSize;
        public volatile boolean cancelled;
        public volatile boolean done;
        public final Subscriber<? super T> downstream;
        public Throwable error;
        public final Consumer<? super T> onDropped;
        public final Action onOverflow;
        public final BackpressureOverflowStrategy strategy;
        public Subscription upstream;
        public final AtomicLong requested = new AtomicLong();
        public final Deque<T> deque = new ArrayDeque();

        public OnBackpressureBufferStrategySubscriber(Subscriber<? super T> actual, Action onOverflow, BackpressureOverflowStrategy strategy, long bufferSize, Consumer<? super T> onDropped) {
            this.downstream = actual;
            this.onOverflow = onOverflow;
            this.strategy = strategy;
            this.bufferSize = bufferSize;
            this.onDropped = onDropped;
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription s) {
            if (SubscriptionHelper.validate(this.upstream, s)) {
                this.upstream = s;
                this.downstream.onSubscribe(this);
                s.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            boolean z;
            boolean z2;
            boolean z3;
            Action action;
            T tPollLast;
            if (this.done) {
                return;
            }
            Deque<T> deque = this.deque;
            synchronized (deque) {
                try {
                    z = false;
                    z2 = true;
                    if (deque.size() == this.bufferSize) {
                        int i = C105491.f9722x8ef22ea[this.strategy.ordinal()];
                        if (i == 1) {
                            tPollLast = deque.pollLast();
                            deque.offer(t);
                        } else if (i != 2) {
                            z3 = false;
                        } else {
                            tPollLast = deque.poll();
                            deque.offer(t);
                        }
                        t = tPollLast;
                        z3 = false;
                        z = true;
                        z2 = false;
                    } else {
                        deque.offer(t);
                        t = null;
                        z3 = true;
                        z2 = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z && (action = this.onOverflow) != null) {
                try {
                    action.run();
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    this.upstream.cancel();
                    onError(th2);
                }
            }
            Consumer<? super T> consumer = this.onDropped;
            if (consumer != null && t != null) {
                try {
                    consumer.accept(t);
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    this.upstream.cancel();
                    onError(th3);
                }
            }
            if (z2) {
                this.upstream.cancel();
                onError(MissingBackpressureException.createDefault());
            }
            if (z3) {
                drain();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable t) {
            if (this.done) {
                RxJavaPlugins.onError(t);
                return;
            }
            this.error = t;
            this.done = true;
            drain();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.done = true;
            drain();
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
            this.cancelled = true;
            this.upstream.cancel();
            if (getAndIncrement() == 0) {
                clear(this.deque);
            }
        }

        public void clear(Deque<T> dq) {
            synchronized (dq) {
                dq.clear();
            }
        }

        public void drain() {
            boolean zIsEmpty;
            T tPoll;
            if (getAndIncrement() != 0) {
                return;
            }
            Deque<T> deque = this.deque;
            Subscriber<? super T> subscriber = this.downstream;
            int iAddAndGet = 1;
            do {
                long j = this.requested.get();
                long j2 = 0;
                while (j2 != j) {
                    if (this.cancelled) {
                        clear(deque);
                        return;
                    }
                    boolean z = this.done;
                    synchronized (deque) {
                        tPoll = deque.poll();
                    }
                    boolean z2 = tPoll == null;
                    if (z) {
                        Throwable th = this.error;
                        if (th != null) {
                            clear(deque);
                            subscriber.onError(th);
                            return;
                        } else if (z2) {
                            subscriber.onComplete();
                            return;
                        }
                    }
                    if (z2) {
                        break;
                    }
                    subscriber.onNext(tPoll);
                    j2++;
                }
                if (j2 == j) {
                    if (this.cancelled) {
                        clear(deque);
                        return;
                    }
                    boolean z3 = this.done;
                    synchronized (deque) {
                        zIsEmpty = deque.isEmpty();
                    }
                    if (z3) {
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            clear(deque);
                            subscriber.onError(th2);
                            return;
                        } else if (zIsEmpty) {
                            subscriber.onComplete();
                            return;
                        }
                    }
                }
                if (j2 != 0) {
                    BackpressureHelper.produced(this.requested, j2);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }
    }

    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.FlowableOnBackpressureBufferStrategy$1 */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C105491 {

        /* renamed from: $SwitchMap$io$reactivex$rxjava3$core$BackpressureOverflowStrategy */
        public static final /* synthetic */ int[] f9722x8ef22ea;

        static {
            int[] iArr = new int[BackpressureOverflowStrategy.values().length];
            f9722x8ef22ea = iArr;
            try {
                iArr[BackpressureOverflowStrategy.DROP_LATEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9722x8ef22ea[BackpressureOverflowStrategy.DROP_OLDEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }
}
