package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import io.reactivex.rxjava3.operators.SimpleQueue;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class FlowableConcatMapCompletable<T> extends Completable {
    public final ErrorMode errorMode;
    public final Function<? super T, ? extends CompletableSource> mapper;
    public final int prefetch;
    public final Flowable<T> source;

    public FlowableConcatMapCompletable(Flowable<T> source, Function<? super T, ? extends CompletableSource> mapper, ErrorMode errorMode, int prefetch) {
        this.source = source;
        this.mapper = mapper;
        this.errorMode = errorMode;
        this.prefetch = prefetch;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public void subscribeActual(CompletableObserver observer) {
        this.source.subscribe((FlowableSubscriber) new ConcatMapCompletableObserver(observer, this.mapper, this.errorMode, this.prefetch));
    }

    /* loaded from: classes8.dex */
    public static final class ConcatMapCompletableObserver<T> extends ConcatMapXMainSubscriber<T> implements Disposable {
        public static final long serialVersionUID = 3610901111000061034L;
        public volatile boolean active;
        public int consumed;
        public final CompletableObserver downstream;
        public final ConcatMapInnerObserver inner;
        public final Function<? super T, ? extends CompletableSource> mapper;

        public ConcatMapCompletableObserver(CompletableObserver downstream, Function<? super T, ? extends CompletableSource> mapper, ErrorMode errorMode, int prefetch) {
            super(prefetch, errorMode);
            this.downstream = downstream;
            this.mapper = mapper;
            this.inner = new ConcatMapInnerObserver(this);
        }

        @Override // io.reactivex.rxjava3.internal.operators.mixed.ConcatMapXMainSubscriber
        public void onSubscribeDownstream() {
            this.downstream.onSubscribe(this);
        }

        @Override // io.reactivex.rxjava3.internal.operators.mixed.ConcatMapXMainSubscriber
        public void disposeInner() {
            this.inner.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            stop();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        public void innerError(Throwable ex) {
            if (this.errors.tryAddThrowableOrReport(ex)) {
                if (this.errorMode == ErrorMode.IMMEDIATE) {
                    this.upstream.cancel();
                    this.errors.tryTerminateConsumer(this.downstream);
                    if (getAndIncrement() == 0) {
                        this.queue.clear();
                        return;
                    }
                    return;
                }
                this.active = false;
                drain();
            }
        }

        public void innerComplete() {
            this.active = false;
            drain();
        }

        @Override // io.reactivex.rxjava3.internal.operators.mixed.ConcatMapXMainSubscriber
        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            ErrorMode errorMode = this.errorMode;
            SimpleQueue<T> simpleQueue = this.queue;
            AtomicThrowable atomicThrowable = this.errors;
            boolean z = this.syncFused;
            while (!this.cancelled) {
                if (atomicThrowable.get() != null && (errorMode == ErrorMode.IMMEDIATE || (errorMode == ErrorMode.BOUNDARY && !this.active))) {
                    simpleQueue.clear();
                    atomicThrowable.tryTerminateConsumer(this.downstream);
                    return;
                }
                if (!this.active) {
                    boolean z2 = this.done;
                    try {
                        T tPoll = simpleQueue.poll();
                        boolean z3 = tPoll == null;
                        if (z2 && z3) {
                            atomicThrowable.tryTerminateConsumer(this.downstream);
                            return;
                        }
                        if (!z3) {
                            int i = this.prefetch;
                            int i2 = i - (i >> 1);
                            if (!z) {
                                int i3 = this.consumed + 1;
                                if (i3 == i2) {
                                    this.consumed = 0;
                                    this.upstream.request(i2);
                                } else {
                                    this.consumed = i3;
                                }
                            }
                            try {
                                CompletableSource completableSourceApply = this.mapper.apply(tPoll);
                                Objects.requireNonNull(completableSourceApply, "The mapper returned a null CompletableSource");
                                CompletableSource completableSource = completableSourceApply;
                                this.active = true;
                                completableSource.subscribe(this.inner);
                            } catch (Throwable th) {
                                Exceptions.throwIfFatal(th);
                                simpleQueue.clear();
                                this.upstream.cancel();
                                atomicThrowable.tryAddThrowableOrReport(th);
                                atomicThrowable.tryTerminateConsumer(this.downstream);
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        this.upstream.cancel();
                        atomicThrowable.tryAddThrowableOrReport(th2);
                        atomicThrowable.tryTerminateConsumer(this.downstream);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            simpleQueue.clear();
        }

        /* loaded from: classes5.dex */
        public static final class ConcatMapInnerObserver extends AtomicReference<Disposable> implements CompletableObserver {
            public static final long serialVersionUID = 5638352172918776687L;
            public final ConcatMapCompletableObserver<?> parent;

            public ConcatMapInnerObserver(ConcatMapCompletableObserver<?> parent) {
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

            public void dispose() {
                DisposableHelper.dispose(this);
            }
        }
    }
}
