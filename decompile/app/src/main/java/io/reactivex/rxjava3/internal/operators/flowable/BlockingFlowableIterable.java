package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.QueueOverflowException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BlockingHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.operators.SpscArrayQueue;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.reactivestreams.Subscription;

/* loaded from: classes8.dex */
public final class BlockingFlowableIterable<T> implements Iterable<T> {
    public final int bufferSize;
    public final Flowable<T> source;

    public BlockingFlowableIterable(Flowable<T> source, int bufferSize) {
        this.source = source;
        this.bufferSize = bufferSize;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        BlockingFlowableIterator blockingFlowableIterator = new BlockingFlowableIterator(this.bufferSize);
        this.source.subscribe((FlowableSubscriber) blockingFlowableIterator);
        return blockingFlowableIterator;
    }

    public static final class BlockingFlowableIterator<T> extends AtomicReference<Subscription> implements FlowableSubscriber<T>, Iterator<T>, Runnable, Disposable {
        public static final long serialVersionUID = 6695226475494099826L;
        public final long batchSize;
        public final Condition condition;
        public volatile boolean done;
        public volatile Throwable error;
        public final long limit;
        public final Lock lock;
        public long produced;
        public final SpscArrayQueue<T> queue;

        public BlockingFlowableIterator(int batchSize) {
            this.queue = new SpscArrayQueue<>(batchSize);
            this.batchSize = batchSize;
            this.limit = batchSize - (batchSize >> 2);
            ReentrantLock reentrantLock = new ReentrantLock();
            this.lock = reentrantLock;
            this.condition = reentrantLock.newCondition();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (!isDisposed()) {
                boolean z = this.done;
                boolean zIsEmpty = this.queue.isEmpty();
                if (z) {
                    Throwable th = this.error;
                    if (th != null) {
                        throw ExceptionHelper.wrapOrThrow(th);
                    }
                    if (zIsEmpty) {
                        return false;
                    }
                }
                if (!zIsEmpty) {
                    return true;
                }
                BlockingHelper.verifyNonBlocking();
                this.lock.lock();
                while (!this.done && this.queue.isEmpty() && !isDisposed()) {
                    try {
                        try {
                            this.condition.await();
                        } catch (InterruptedException e) {
                            run();
                            throw ExceptionHelper.wrapOrThrow(e);
                        }
                    } finally {
                        this.lock.unlock();
                    }
                }
            }
            Throwable th2 = this.error;
            if (th2 == null) {
                return false;
            }
            throw ExceptionHelper.wrapOrThrow(th2);
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                T tPoll = this.queue.poll();
                long j = this.produced + 1;
                if (j == this.limit) {
                    this.produced = 0L;
                    get().request(j);
                } else {
                    this.produced = j;
                }
                return tPoll;
            }
            throw new NoSuchElementException();
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription s) {
            SubscriptionHelper.setOnce(this, s, this.batchSize);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (!this.queue.offer(t)) {
                SubscriptionHelper.cancel(this);
                onError(new QueueOverflowException());
            } else {
                signalConsumer();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable t) {
            this.error = t;
            this.done = true;
            signalConsumer();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.done = true;
            signalConsumer();
        }

        public void signalConsumer() {
            this.lock.lock();
            try {
                this.condition.signalAll();
            } finally {
                this.lock.unlock();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            SubscriptionHelper.cancel(this);
            signalConsumer();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("remove");
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            SubscriptionHelper.cancel(this);
            signalConsumer();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return get() == SubscriptionHelper.CANCELLED;
        }
    }
}
