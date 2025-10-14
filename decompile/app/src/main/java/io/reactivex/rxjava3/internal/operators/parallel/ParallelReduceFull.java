package io.reactivex.rxjava3.internal.operators.parallel;

import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.parallel.ParallelFlowable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes8.dex */
public final class ParallelReduceFull<T> extends Flowable<T> {
    public final BiFunction<T, T, T> reducer;
    public final ParallelFlowable<? extends T> source;

    public ParallelReduceFull(ParallelFlowable<? extends T> source, BiFunction<T, T, T> reducer) {
        this.source = source;
        this.reducer = reducer;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> s) {
        ParallelReduceFullMainSubscriber parallelReduceFullMainSubscriber = new ParallelReduceFullMainSubscriber(s, this.source.parallelism(), this.reducer);
        s.onSubscribe(parallelReduceFullMainSubscriber);
        this.source.subscribe(parallelReduceFullMainSubscriber.subscribers);
    }

    /* loaded from: classes5.dex */
    public static final class ParallelReduceFullMainSubscriber<T> extends DeferredScalarSubscription<T> {
        public static final long serialVersionUID = -5370107872170712765L;
        public final AtomicReference<SlotPair<T>> current;
        public final AtomicThrowable error;
        public final BiFunction<T, T, T> reducer;
        public final AtomicInteger remaining;
        public final ParallelReduceFullInnerSubscriber<T>[] subscribers;

        public ParallelReduceFullMainSubscriber(Subscriber<? super T> subscriber, int n, BiFunction<T, T, T> reducer) {
            super(subscriber);
            this.current = new AtomicReference<>();
            this.remaining = new AtomicInteger();
            this.error = new AtomicThrowable();
            ParallelReduceFullInnerSubscriber<T>[] parallelReduceFullInnerSubscriberArr = new ParallelReduceFullInnerSubscriber[n];
            for (int i = 0; i < n; i++) {
                parallelReduceFullInnerSubscriberArr[i] = new ParallelReduceFullInnerSubscriber<>(this, reducer);
            }
            this.subscribers = parallelReduceFullInnerSubscriberArr;
            this.reducer = reducer;
            this.remaining.lazySet(n);
        }

        public SlotPair<T> addValue(T value) {
            SlotPair<T> slotPair;
            int iTryAcquireSlot;
            while (true) {
                slotPair = this.current.get();
                if (slotPair == null) {
                    slotPair = new SlotPair<>();
                    if (!MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m34m(this.current, null, slotPair)) {
                        continue;
                    }
                }
                iTryAcquireSlot = slotPair.tryAcquireSlot();
                if (iTryAcquireSlot >= 0) {
                    break;
                }
                MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m34m(this.current, slotPair, null);
            }
            if (iTryAcquireSlot == 0) {
                slotPair.first = value;
            } else {
                slotPair.second = value;
            }
            if (!slotPair.releaseSlot()) {
                return null;
            }
            MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m34m(this.current, slotPair, null);
            return slotPair;
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public void cancel() {
            for (ParallelReduceFullInnerSubscriber<T> parallelReduceFullInnerSubscriber : this.subscribers) {
                parallelReduceFullInnerSubscriber.cancel();
            }
        }

        public void innerError(Throwable ex) {
            if (this.error.compareAndSet(null, ex)) {
                cancel();
                this.downstream.onError(ex);
            } else if (ex != this.error.get()) {
                RxJavaPlugins.onError(ex);
            }
        }

        public void innerComplete(T value) {
            if (value != null) {
                while (true) {
                    SlotPair<T> slotPairAddValue = addValue(value);
                    if (slotPairAddValue == null) {
                        break;
                    }
                    try {
                        value = this.reducer.apply(slotPairAddValue.first, slotPairAddValue.second);
                        Objects.requireNonNull(value, "The reducer returned a null value");
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        innerError(th);
                        return;
                    }
                }
            }
            if (this.remaining.decrementAndGet() == 0) {
                SlotPair<T> slotPair = this.current.get();
                this.current.lazySet(null);
                if (slotPair != null) {
                    complete(slotPair.first);
                } else {
                    this.downstream.onComplete();
                }
            }
        }
    }

    public static final class ParallelReduceFullInnerSubscriber<T> extends AtomicReference<Subscription> implements FlowableSubscriber<T> {
        public static final long serialVersionUID = -7954444275102466525L;
        public boolean done;
        public final ParallelReduceFullMainSubscriber<T> parent;
        public final BiFunction<T, T, T> reducer;
        public T value;

        public ParallelReduceFullInnerSubscriber(ParallelReduceFullMainSubscriber<T> parent, BiFunction<T, T, T> reducer) {
            this.parent = parent;
            this.reducer = reducer;
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription s) {
            SubscriptionHelper.setOnce(this, s, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            T t2 = this.value;
            if (t2 == null) {
                this.value = t;
                return;
            }
            try {
                T tApply = this.reducer.apply(t2, t);
                Objects.requireNonNull(tApply, "The reducer returned a null value");
                this.value = tApply;
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                get().cancel();
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable t) {
            if (this.done) {
                RxJavaPlugins.onError(t);
            } else {
                this.done = true;
                this.parent.innerError(t);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.parent.innerComplete(this.value);
        }

        public void cancel() {
            SubscriptionHelper.cancel(this);
        }
    }

    public static final class SlotPair<T> extends AtomicInteger {
        public static final long serialVersionUID = 473971317683868662L;
        public T first;
        public final AtomicInteger releaseIndex = new AtomicInteger();
        public T second;

        public int tryAcquireSlot() {
            int i;
            do {
                i = get();
                if (i >= 2) {
                    return -1;
                }
            } while (!compareAndSet(i, i + 1));
            return i;
        }

        public boolean releaseSlot() {
            return this.releaseIndex.incrementAndGet() == 2;
        }
    }
}
