package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.operators.ConditionalSubscriber;
import io.reactivex.rxjava3.subscribers.SerializedSubscriber;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableWithLatestFrom<T, U, R> extends AbstractFlowableWithUpstream<T, R> {
    public final BiFunction<? super T, ? super U, ? extends R> combiner;
    public final Publisher<? extends U> other;

    public FlowableWithLatestFrom(Flowable<T> source, BiFunction<? super T, ? super U, ? extends R> combiner, Publisher<? extends U> other) {
        super(source);
        this.combiner = combiner;
        this.other = other;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super R> s) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(s);
        WithLatestFromSubscriber withLatestFromSubscriber = new WithLatestFromSubscriber(serializedSubscriber, this.combiner);
        serializedSubscriber.onSubscribe(withLatestFromSubscriber);
        this.other.subscribe(new FlowableWithLatestSubscriber(withLatestFromSubscriber));
        this.source.subscribe((FlowableSubscriber) withLatestFromSubscriber);
    }

    public static final class WithLatestFromSubscriber<T, U, R> extends AtomicReference<U> implements ConditionalSubscriber<T>, Subscription {
        public static final long serialVersionUID = -312246233408980075L;
        public final BiFunction<? super T, ? super U, ? extends R> combiner;
        public final Subscriber<? super R> downstream;
        public final AtomicReference<Subscription> upstream = new AtomicReference<>();
        public final AtomicLong requested = new AtomicLong();
        public final AtomicReference<Subscription> other = new AtomicReference<>();

        public WithLatestFromSubscriber(Subscriber<? super R> actual, BiFunction<? super T, ? super U, ? extends R> combiner) {
            this.downstream = actual;
            this.combiner = combiner;
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription s) {
            SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, s);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (tryOnNext(t)) {
                return;
            }
            this.upstream.get().request(1L);
        }

        @Override // io.reactivex.rxjava3.operators.ConditionalSubscriber
        public boolean tryOnNext(T t) {
            U u = get();
            if (u != null) {
                try {
                    R rApply = this.combiner.apply(t, u);
                    Objects.requireNonNull(rApply, "The combiner returned a null value");
                    this.downstream.onNext(rApply);
                    return true;
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    cancel();
                    this.downstream.onError(th);
                }
            }
            return false;
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable t) {
            SubscriptionHelper.cancel(this.other);
            this.downstream.onError(t);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            SubscriptionHelper.cancel(this.other);
            this.downstream.onComplete();
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n) {
            SubscriptionHelper.deferredRequest(this.upstream, this.requested, n);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            SubscriptionHelper.cancel(this.upstream);
            SubscriptionHelper.cancel(this.other);
        }

        public boolean setOther(Subscription o) {
            return SubscriptionHelper.setOnce(this.other, o);
        }

        public void otherError(Throwable e) {
            SubscriptionHelper.cancel(this.upstream);
            this.downstream.onError(e);
        }
    }

    public final class FlowableWithLatestSubscriber implements FlowableSubscriber<U> {
        public final WithLatestFromSubscriber<T, U, R> wlf;

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        public FlowableWithLatestSubscriber(WithLatestFromSubscriber<T, U, R> wlf) {
            this.wlf = wlf;
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription s) {
            if (this.wlf.setOther(s)) {
                s.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(U t) {
            this.wlf.lazySet(t);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable t) {
            this.wlf.otherError(t);
        }
    }
}
