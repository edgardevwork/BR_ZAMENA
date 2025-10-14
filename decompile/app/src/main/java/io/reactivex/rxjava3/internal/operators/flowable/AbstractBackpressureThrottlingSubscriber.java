package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes8.dex */
public abstract class AbstractBackpressureThrottlingSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
    public static final long serialVersionUID = -5050301752721603566L;
    public volatile boolean cancelled;
    public volatile boolean done;
    public final Subscriber<? super R> downstream;
    public Throwable error;
    public Subscription upstream;
    public final AtomicLong requested = new AtomicLong();
    public final AtomicReference<R> current = new AtomicReference<>();

    @Override // org.reactivestreams.Subscriber
    public abstract void onNext(T t);

    public AbstractBackpressureThrottlingSubscriber(Subscriber<? super R> downstream) {
        this.downstream = downstream;
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
        this.upstream.cancel();
        if (getAndIncrement() == 0) {
            this.current.lazySet(null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        if (r7 != r1.get()) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        r9 = r13.done;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        if (r2.get() != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        if (checkTerminated(r9, r10, r0, r2) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        if (r7 == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        io.reactivex.rxjava3.internal.util.BackpressureHelper.produced(r1, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0057, code lost:
    
        r4 = addAndGet(-r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        Subscriber<? super R> subscriber = this.downstream;
        AtomicLong atomicLong = this.requested;
        AtomicReference<R> atomicReference = this.current;
        int iAddAndGet = 1;
        do {
            long j = 0;
            while (true) {
                boolean z = false;
                if (j == atomicLong.get()) {
                    break;
                }
                boolean z2 = this.done;
                R andSet = atomicReference.getAndSet(null);
                boolean z3 = andSet == null;
                if (checkTerminated(z2, z3, subscriber, atomicReference)) {
                    return;
                }
                if (z3) {
                    break;
                }
                subscriber.onNext(andSet);
                j++;
            }
        } while (iAddAndGet != 0);
    }

    public boolean checkTerminated(boolean d, boolean empty, Subscriber<?> a2, AtomicReference<R> q) {
        if (this.cancelled) {
            q.lazySet(null);
            return true;
        }
        if (!d) {
            return false;
        }
        Throwable th = this.error;
        if (th != null) {
            q.lazySet(null);
            a2.onError(th);
            return true;
        }
        if (!empty) {
            return false;
        }
        a2.onComplete();
        return true;
    }
}
