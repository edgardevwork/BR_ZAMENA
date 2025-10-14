package io.reactivex.rxjava3.internal.operators.observable;

import _COROUTINE.ArtificialStackFrames;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import io.reactivex.rxjava3.observers.SerializedObserver;
import io.reactivex.rxjava3.operators.QueueDisposable;
import io.reactivex.rxjava3.operators.SimpleQueue;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes8.dex */
public final class ObservableConcatMapScheduler<T, U> extends AbstractObservableWithUpstream<T, U> {
    public final int bufferSize;
    public final ErrorMode delayErrors;
    public final Function<? super T, ? extends ObservableSource<? extends U>> mapper;
    public final Scheduler scheduler;

    public ObservableConcatMapScheduler(ObservableSource<T> source, Function<? super T, ? extends ObservableSource<? extends U>> mapper, int bufferSize, ErrorMode delayErrors, Scheduler scheduler) {
        super(source);
        this.mapper = mapper;
        this.delayErrors = delayErrors;
        this.bufferSize = Math.max(8, bufferSize);
        this.scheduler = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super U> observer) {
        if (this.delayErrors == ErrorMode.IMMEDIATE) {
            this.source.subscribe(new ConcatMapObserver(new SerializedObserver(observer), this.mapper, this.bufferSize, this.scheduler.createWorker()));
        } else {
            this.source.subscribe(new ConcatMapDelayErrorObserver(observer, this.mapper, this.bufferSize, this.delayErrors == ErrorMode.END, this.scheduler.createWorker()));
        }
    }

    /* loaded from: classes7.dex */
    public static final class ConcatMapObserver<T, U> extends AtomicInteger implements Observer<T>, Disposable, Runnable {
        public static final long serialVersionUID = 8828587559905699186L;
        public volatile boolean active;
        public final int bufferSize;
        public volatile boolean disposed;
        public volatile boolean done;
        public final Observer<? super U> downstream;
        public int fusionMode;
        public final InnerObserver<U> inner;
        public final Function<? super T, ? extends ObservableSource<? extends U>> mapper;
        public SimpleQueue<T> queue;
        public Disposable upstream;
        public final Scheduler.Worker worker;

        public ConcatMapObserver(Observer<? super U> actual, Function<? super T, ? extends ObservableSource<? extends U>> mapper, int bufferSize, Scheduler.Worker worker) {
            this.downstream = actual;
            this.mapper = mapper;
            this.bufferSize = bufferSize;
            this.inner = new InnerObserver<>(actual, this);
            this.worker = worker;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onSubscribe(Disposable d) {
            if (DisposableHelper.validate(this.upstream, d)) {
                this.upstream = d;
                if (d instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) d;
                    int iRequestFusion = queueDisposable.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.fusionMode = iRequestFusion;
                        this.queue = queueDisposable;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        drain();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.fusionMode = iRequestFusion;
                        this.queue = queueDisposable;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                }
                this.queue = new SpscLinkedArrayQueue(this.bufferSize);
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            if (this.fusionMode == 0) {
                this.queue.offer(t);
            }
            drain();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onError(Throwable t) {
            if (this.done) {
                RxJavaPlugins.onError(t);
                return;
            }
            this.done = true;
            dispose();
            this.downstream.onError(t);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            drain();
        }

        public void innerComplete() {
            this.active = false;
            drain();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.disposed;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.disposed = true;
            this.inner.dispose();
            this.upstream.dispose();
            this.worker.dispose();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            this.worker.schedule(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!this.disposed) {
                if (!this.active) {
                    boolean z = this.done;
                    try {
                        T tPoll = this.queue.poll();
                        boolean z2 = tPoll == null;
                        if (z && z2) {
                            this.disposed = true;
                            this.downstream.onComplete();
                            this.worker.dispose();
                            return;
                        } else if (!z2) {
                            try {
                                ObservableSource<? extends U> observableSourceApply = this.mapper.apply(tPoll);
                                Objects.requireNonNull(observableSourceApply, "The mapper returned a null ObservableSource");
                                ObservableSource<? extends U> observableSource = observableSourceApply;
                                this.active = true;
                                observableSource.subscribe(this.inner);
                            } catch (Throwable th) {
                                Exceptions.throwIfFatal(th);
                                dispose();
                                this.queue.clear();
                                this.downstream.onError(th);
                                this.worker.dispose();
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        dispose();
                        this.queue.clear();
                        this.downstream.onError(th2);
                        this.worker.dispose();
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.queue.clear();
        }

        public static final class InnerObserver<U> extends AtomicReference<Disposable> implements Observer<U> {
            public static final long serialVersionUID = -7449079488798789337L;
            public final Observer<? super U> downstream;
            public final ConcatMapObserver<?, ?> parent;

            public InnerObserver(Observer<? super U> actual, ConcatMapObserver<?, ?> parent) {
                this.downstream = actual;
                this.parent = parent;
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public void onSubscribe(Disposable d) {
                DisposableHelper.replace(this, d);
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public void onNext(U t) {
                this.downstream.onNext(t);
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public void onError(Throwable t) {
                this.parent.dispose();
                this.downstream.onError(t);
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public void onComplete() {
                this.parent.innerComplete();
            }

            public void dispose() {
                DisposableHelper.dispose(this);
            }
        }
    }

    /* loaded from: classes7.dex */
    public static final class ConcatMapDelayErrorObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable, Runnable {
        public static final long serialVersionUID = -6951100001833242599L;
        public volatile boolean active;
        public final int bufferSize;
        public volatile boolean cancelled;
        public volatile boolean done;
        public final Observer<? super R> downstream;
        public final AtomicThrowable errors = new AtomicThrowable();
        public final Function<? super T, ? extends ObservableSource<? extends R>> mapper;
        public final DelayErrorInnerObserver<R> observer;
        public SimpleQueue<T> queue;
        public int sourceMode;
        public final boolean tillTheEnd;
        public Disposable upstream;
        public final Scheduler.Worker worker;

        public ConcatMapDelayErrorObserver(Observer<? super R> actual, Function<? super T, ? extends ObservableSource<? extends R>> mapper, int bufferSize, boolean tillTheEnd, Scheduler.Worker worker) {
            this.downstream = actual;
            this.mapper = mapper;
            this.bufferSize = bufferSize;
            this.tillTheEnd = tillTheEnd;
            this.observer = new DelayErrorInnerObserver<>(actual, this);
            this.worker = worker;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onSubscribe(Disposable d) {
            if (DisposableHelper.validate(this.upstream, d)) {
                this.upstream = d;
                if (d instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) d;
                    int iRequestFusion = queueDisposable.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.sourceMode = iRequestFusion;
                        this.queue = queueDisposable;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        drain();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.sourceMode = iRequestFusion;
                        this.queue = queueDisposable;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                }
                this.queue = new SpscLinkedArrayQueue(this.bufferSize);
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onNext(T value) {
            if (this.sourceMode == 0) {
                this.queue.offer(value);
            }
            drain();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onError(Throwable e) {
            if (this.errors.tryAddThrowableOrReport(e)) {
                this.done = true;
                drain();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.cancelled = true;
            this.upstream.dispose();
            this.observer.dispose();
            this.worker.dispose();
            this.errors.tryTerminateAndReport();
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            this.worker.schedule(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            Observer<? super R> observer = this.downstream;
            SimpleQueue<T> simpleQueue = this.queue;
            AtomicThrowable atomicThrowable = this.errors;
            while (true) {
                if (!this.active) {
                    if (this.cancelled) {
                        simpleQueue.clear();
                        return;
                    }
                    if (!this.tillTheEnd && atomicThrowable.get() != null) {
                        simpleQueue.clear();
                        this.cancelled = true;
                        atomicThrowable.tryTerminateConsumer(observer);
                        this.worker.dispose();
                        return;
                    }
                    boolean z = this.done;
                    try {
                        T tPoll = simpleQueue.poll();
                        boolean z2 = tPoll == null;
                        if (z && z2) {
                            this.cancelled = true;
                            atomicThrowable.tryTerminateConsumer(observer);
                            this.worker.dispose();
                            return;
                        }
                        if (!z2) {
                            try {
                                ObservableSource<? extends R> observableSourceApply = this.mapper.apply(tPoll);
                                Objects.requireNonNull(observableSourceApply, "The mapper returned a null ObservableSource");
                                ObservableSource<? extends R> observableSource = observableSourceApply;
                                if (observableSource instanceof Supplier) {
                                    try {
                                        ArtificialStackFrames artificialStackFrames = (Object) ((Supplier) observableSource).get();
                                        if (artificialStackFrames != null && !this.cancelled) {
                                            observer.onNext(artificialStackFrames);
                                        }
                                    } catch (Throwable th) {
                                        Exceptions.throwIfFatal(th);
                                        atomicThrowable.tryAddThrowableOrReport(th);
                                    }
                                } else {
                                    this.active = true;
                                    observableSource.subscribe(this.observer);
                                }
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                this.cancelled = true;
                                this.upstream.dispose();
                                simpleQueue.clear();
                                atomicThrowable.tryAddThrowableOrReport(th2);
                                atomicThrowable.tryTerminateConsumer(observer);
                                this.worker.dispose();
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        Exceptions.throwIfFatal(th3);
                        this.cancelled = true;
                        this.upstream.dispose();
                        atomicThrowable.tryAddThrowableOrReport(th3);
                        atomicThrowable.tryTerminateConsumer(observer);
                        this.worker.dispose();
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }

        public static final class DelayErrorInnerObserver<R> extends AtomicReference<Disposable> implements Observer<R> {
            public static final long serialVersionUID = 2620149119579502636L;
            public final Observer<? super R> downstream;
            public final ConcatMapDelayErrorObserver<?, R> parent;

            public DelayErrorInnerObserver(Observer<? super R> actual, ConcatMapDelayErrorObserver<?, R> parent) {
                this.downstream = actual;
                this.parent = parent;
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public void onSubscribe(Disposable d) {
                DisposableHelper.replace(this, d);
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public void onNext(R value) {
                this.downstream.onNext(value);
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public void onError(Throwable e) {
                ConcatMapDelayErrorObserver<?, R> concatMapDelayErrorObserver = this.parent;
                if (concatMapDelayErrorObserver.errors.tryAddThrowableOrReport(e)) {
                    if (!concatMapDelayErrorObserver.tillTheEnd) {
                        concatMapDelayErrorObserver.upstream.dispose();
                    }
                    concatMapDelayErrorObserver.active = false;
                    concatMapDelayErrorObserver.drain();
                }
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public void onComplete() {
                ConcatMapDelayErrorObserver<?, R> concatMapDelayErrorObserver = this.parent;
                concatMapDelayErrorObserver.active = false;
                concatMapDelayErrorObserver.drain();
            }

            public void dispose() {
                DisposableHelper.dispose(this);
            }
        }
    }
}
