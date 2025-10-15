package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.operators.SimplePlainQueue;
import io.reactivex.rxjava3.operators.SpscArrayQueue;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public final class FlowableOnBackpressureBuffer<T> extends AbstractFlowableWithUpstream<T, T> {
    public final int bufferSize;
    public final boolean delayError;
    public final Consumer<? super T> onDropped;
    public final Action onOverflow;
    public final boolean unbounded;

    public FlowableOnBackpressureBuffer(Flowable<T> source, int bufferSize, boolean unbounded, boolean delayError, Action onOverflow, Consumer<? super T> onDropped) {
        super(source);
        this.bufferSize = bufferSize;
        this.unbounded = unbounded;
        this.delayError = delayError;
        this.onOverflow = onOverflow;
        this.onDropped = onDropped;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> s) {
        this.source.subscribe((FlowableSubscriber) new BackpressureBufferSubscriber(s, this.bufferSize, this.unbounded, this.delayError, this.onOverflow, this.onDropped));
    }

    public static final class BackpressureBufferSubscriber<T> extends BasicIntQueueSubscription<T> implements FlowableSubscriber<T> {
        public static final long serialVersionUID = -2514538129242366402L;
        public volatile boolean cancelled;
        public final boolean delayError;
        public volatile boolean done;
        public final Subscriber<? super T> downstream;
        public Throwable error;
        public final Consumer<? super T> onDropped;
        public final Action onOverflow;
        public boolean outputFused;
        public final SimplePlainQueue<T> queue;
        public final AtomicLong requested = new AtomicLong();
        public Subscription upstream;

        public BackpressureBufferSubscriber(Subscriber<? super T> actual, int bufferSize, boolean unbounded, boolean delayError, Action onOverflow, Consumer<? super T> onDropped) {
            SimplePlainQueue<T> spscArrayQueue;
            this.downstream = actual;
            this.onOverflow = onOverflow;
            this.delayError = delayError;
            this.onDropped = onDropped;
            if (unbounded) {
                spscArrayQueue = new SpscLinkedArrayQueue<>(bufferSize);
            } else {
                spscArrayQueue = new SpscArrayQueue<>(bufferSize);
            }
            this.queue = spscArrayQueue;
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
            if (!this.queue.offer(t)) {
                this.upstream.cancel();
                MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Buffer is full");
                try {
                    this.onOverflow.run();
                    this.onDropped.accept(t);
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    missingBackpressureException.initCause(th);
                }
                onError(missingBackpressureException);
                return;
            }
            if (this.outputFused) {
                this.downstream.onNext(null);
            } else {
                drain();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable t) {
            this.error = t;
            this.done = true;
            if (this.outputFused) {
                this.downstream.onError(t);
            } else {
                drain();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.done = true;
            if (this.outputFused) {
                this.downstream.onComplete();
            } else {
                drain();
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n) {
            if (this.outputFused || !SubscriptionHelper.validate(n)) {
                return;
            }
            BackpressureHelper.add(this.requested, n);
            drain();
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.cancel();
            if (this.outputFused || getAndIncrement() != 0) {
                return;
            }
            this.queue.clear();
        }

        public void drain() {
            if (getAndIncrement() == 0) {
                SimplePlainQueue<T> simplePlainQueue = this.queue;
                Subscriber<? super T> subscriber = this.downstream;
                int iAddAndGet = 1;
                while (!checkTerminated(this.done, simplePlainQueue.isEmpty(), subscriber)) {
                    long j = this.requested.get();
                    long j2 = 0;
                    while (j2 != j) {
                        boolean z = this.done;
                        T tPoll = simplePlainQueue.poll();
                        boolean z2 = tPoll == null;
                        if (checkTerminated(z, z2, subscriber)) {
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        subscriber.onNext(tPoll);
                        j2++;
                    }
                    if (j2 == j && checkTerminated(this.done, simplePlainQueue.isEmpty(), subscriber)) {
                        return;
                    }
                    if (j2 != 0 && j != Long.MAX_VALUE) {
                        this.requested.addAndGet(-j2);
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        public boolean checkTerminated(boolean d, boolean empty, Subscriber<? super T> a2) {
            if (this.cancelled) {
                this.queue.clear();
                return true;
            }
            if (!d) {
                return false;
            }
            if (this.delayError) {
                if (!empty) {
                    return false;
                }
                Throwable th = this.error;
                if (th != null) {
                    a2.onError(th);
                } else {
                    a2.onComplete();
                }
                return true;
            }
            Throwable th2 = this.error;
            if (th2 != null) {
                this.queue.clear();
                a2.onError(th2);
                return true;
            }
            if (!empty) {
                return false;
            }
            a2.onComplete();
            return true;
        }

        @Override // io.reactivex.rxjava3.operators.QueueFuseable
        public int requestFusion(int mode) {
            if ((mode & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        @Nullable
        public T poll() {
            return this.queue.poll();
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public void clear() {
            this.queue.clear();
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public boolean isEmpty() {
            return this.queue.isEmpty();
        }
    }
}
