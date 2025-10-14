package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.exceptions.QueueOverflowException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.operators.QueueSubscription;
import io.reactivex.rxjava3.operators.SimpleQueue;
import io.reactivex.rxjava3.operators.SpscArrayQueue;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* loaded from: classes6.dex */
public final class CompletableConcat extends Completable {
    public final int prefetch;
    public final Publisher<? extends CompletableSource> sources;

    public CompletableConcat(Publisher<? extends CompletableSource> sources, int prefetch) {
        this.sources = sources;
        this.prefetch = prefetch;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public void subscribeActual(CompletableObserver observer) {
        this.sources.subscribe(new CompletableConcatSubscriber(observer, this.prefetch));
    }

    public static final class CompletableConcatSubscriber extends AtomicInteger implements FlowableSubscriber<CompletableSource>, Disposable {
        public static final long serialVersionUID = 9032184911934499404L;
        public volatile boolean active;
        public int consumed;
        public volatile boolean done;
        public final CompletableObserver downstream;
        public final int limit;
        public final int prefetch;
        public SimpleQueue<CompletableSource> queue;
        public int sourceFused;
        public Subscription upstream;
        public final ConcatInnerObserver inner = new ConcatInnerObserver(this);
        public final AtomicBoolean once = new AtomicBoolean();

        public CompletableConcatSubscriber(CompletableObserver actual, int prefetch) {
            this.downstream = actual;
            this.prefetch = prefetch;
            this.limit = prefetch - (prefetch >> 2);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription s) {
            if (SubscriptionHelper.validate(this.upstream, s)) {
                this.upstream = s;
                int i = this.prefetch;
                long j = i == Integer.MAX_VALUE ? Long.MAX_VALUE : i;
                if (s instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) s;
                    int iRequestFusion = queueSubscription.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.sourceFused = iRequestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        drain();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.sourceFused = iRequestFusion;
                        this.queue = queueSubscription;
                        this.downstream.onSubscribe(this);
                        s.request(j);
                        return;
                    }
                }
                if (this.prefetch == Integer.MAX_VALUE) {
                    this.queue = new SpscLinkedArrayQueue(Flowable.bufferSize());
                } else {
                    this.queue = new SpscArrayQueue(this.prefetch);
                }
                this.downstream.onSubscribe(this);
                s.request(j);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(CompletableSource t) {
            if (this.sourceFused == 0 && !this.queue.offer(t)) {
                onError(new QueueOverflowException());
            } else {
                drain();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable t) {
            if (this.once.compareAndSet(false, true)) {
                DisposableHelper.dispose(this.inner);
                this.downstream.onError(t);
            } else {
                RxJavaPlugins.onError(t);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.upstream.cancel();
            DisposableHelper.dispose(this.inner);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.inner.get());
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            while (!isDisposed()) {
                if (!this.active) {
                    boolean z = this.done;
                    try {
                        CompletableSource completableSourcePoll = this.queue.poll();
                        boolean z2 = completableSourcePoll == null;
                        if (z && z2) {
                            this.downstream.onComplete();
                            return;
                        } else if (!z2) {
                            this.active = true;
                            completableSourcePoll.subscribe(this.inner);
                            request();
                        }
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        innerError(th);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }

        public void request() {
            if (this.sourceFused != 1) {
                int i = this.consumed + 1;
                if (i == this.limit) {
                    this.consumed = 0;
                    this.upstream.request(i);
                } else {
                    this.consumed = i;
                }
            }
        }

        public void innerError(Throwable e) {
            if (this.once.compareAndSet(false, true)) {
                this.upstream.cancel();
                this.downstream.onError(e);
            } else {
                RxJavaPlugins.onError(e);
            }
        }

        public void innerComplete() {
            this.active = false;
            drain();
        }

        public static final class ConcatInnerObserver extends AtomicReference<Disposable> implements CompletableObserver {
            public static final long serialVersionUID = -5454794857847146511L;
            public final CompletableConcatSubscriber parent;

            public ConcatInnerObserver(CompletableConcatSubscriber parent) {
                this.parent = parent;
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public void onSubscribe(Disposable d) {
                DisposableHelper.replace(this, d);
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public void onError(Throwable e) {
                this.parent.innerError(e);
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public void onComplete() {
                this.parent.innerComplete();
            }
        }
    }
}
