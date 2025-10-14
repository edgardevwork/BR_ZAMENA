package io.reactivex.rxjava3.internal.subscribers;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.HalfSerializer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes6.dex */
public class StrictSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
    public static final long serialVersionUID = -4945028590049415624L;
    public volatile boolean done;
    public final Subscriber<? super T> downstream;
    public final AtomicThrowable error = new AtomicThrowable();
    public final AtomicLong requested = new AtomicLong();
    public final AtomicReference<Subscription> upstream = new AtomicReference<>();
    public final AtomicBoolean once = new AtomicBoolean();

    public StrictSubscriber(Subscriber<? super T> downstream) {
        this.downstream = downstream;
    }

    @Override // org.reactivestreams.Subscription
    public void request(long n) {
        if (n <= 0) {
            cancel();
            onError(new IllegalArgumentException("§3.9 violated: positive request amount required but it was " + n));
            return;
        }
        SubscriptionHelper.deferredRequest(this.upstream, this.requested, n);
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        if (this.done) {
            return;
        }
        SubscriptionHelper.cancel(this.upstream);
    }

    @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
    public void onSubscribe(Subscription s) {
        if (this.once.compareAndSet(false, true)) {
            this.downstream.onSubscribe(this);
            SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, s);
        } else {
            s.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t) {
        HalfSerializer.onNext(this.downstream, t, this, this.error);
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable t) {
        this.done = true;
        HalfSerializer.onError(this.downstream, t, this, this.error);
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        this.done = true;
        HalfSerializer.onComplete(this.downstream, this, this.error);
    }
}
