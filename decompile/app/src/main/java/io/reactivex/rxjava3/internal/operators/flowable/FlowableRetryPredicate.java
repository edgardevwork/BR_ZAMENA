package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableRetryPredicate<T> extends AbstractFlowableWithUpstream<T, T> {
    public final long count;
    public final Predicate<? super Throwable> predicate;

    public FlowableRetryPredicate(Flowable<T> source, long count, Predicate<? super Throwable> predicate) {
        super(source);
        this.predicate = predicate;
        this.count = count;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> s) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter(false);
        s.onSubscribe(subscriptionArbiter);
        new RetrySubscriber(s, this.count, this.predicate, subscriptionArbiter, this.source).subscribeNext();
    }

    public static final class RetrySubscriber<T> extends AtomicInteger implements FlowableSubscriber<T> {
        public static final long serialVersionUID = -7098360935104053232L;
        public final Subscriber<? super T> downstream;
        public final Predicate<? super Throwable> predicate;
        public long produced;
        public long remaining;

        /* renamed from: sa */
        public final SubscriptionArbiter f9727sa;
        public final Publisher<? extends T> source;

        public RetrySubscriber(Subscriber<? super T> actual, long count, Predicate<? super Throwable> predicate, SubscriptionArbiter sa, Publisher<? extends T> source) {
            this.downstream = actual;
            this.f9727sa = sa;
            this.source = source;
            this.predicate = predicate;
            this.remaining = count;
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription s) {
            this.f9727sa.setSubscription(s);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            this.produced++;
            this.downstream.onNext(t);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable t) {
            long j = this.remaining;
            if (j != Long.MAX_VALUE) {
                this.remaining = j - 1;
            }
            if (j == 0) {
                this.downstream.onError(t);
                return;
            }
            try {
                if (!this.predicate.test(t)) {
                    this.downstream.onError(t);
                } else {
                    subscribeNext();
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.downstream.onError(new CompositeException(t, th));
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.downstream.onComplete();
        }

        public void subscribeNext() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f9727sa.isCancelled()) {
                    long j = this.produced;
                    if (j != 0) {
                        this.produced = 0L;
                        this.f9727sa.produced(j);
                    }
                    this.source.subscribe(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }
    }
}
