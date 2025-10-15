package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.queue.MpscLinkedQueue;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.operators.SimplePlainQueue;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.subjects.UnicastSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class ObservableWindowBoundarySelector<T, B, V> extends AbstractObservableWithUpstream<T, Observable<T>> {
    public final int bufferSize;
    public final Function<? super B, ? extends ObservableSource<V>> closingIndicator;
    public final ObservableSource<B> open;

    public ObservableWindowBoundarySelector(ObservableSource<T> source, ObservableSource<B> open, Function<? super B, ? extends ObservableSource<V>> closingIndicator, int bufferSize) {
        super(source);
        this.open = open;
        this.closingIndicator = closingIndicator;
        this.bufferSize = bufferSize;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super Observable<T>> t) {
        this.source.subscribe(new WindowBoundaryMainObserver(t, this.open, this.closingIndicator, this.bufferSize));
    }

    /* loaded from: classes5.dex */
    public static final class WindowBoundaryMainObserver<T, B, V> extends AtomicInteger implements Observer<T>, Disposable, Runnable {
        public static final long serialVersionUID = 8646217640096099753L;
        public final int bufferSize;
        public final Function<? super B, ? extends ObservableSource<V>> closingIndicator;
        public final Observer<? super Observable<T>> downstream;
        public long emitted;
        public final ObservableSource<B> open;
        public volatile boolean openDone;
        public Disposable upstream;
        public volatile boolean upstreamCanceled;
        public volatile boolean upstreamDone;
        public final SimplePlainQueue<Object> queue = new MpscLinkedQueue();
        public final CompositeDisposable resources = new CompositeDisposable();
        public final List<UnicastSubject<T>> windows = new ArrayList();
        public final AtomicLong windowCount = new AtomicLong(1);
        public final AtomicBoolean downstreamDisposed = new AtomicBoolean();
        public final AtomicThrowable error = new AtomicThrowable();
        public final WindowStartObserver<B> startObserver = new WindowStartObserver<>(this);
        public final AtomicLong requested = new AtomicLong();

        public WindowBoundaryMainObserver(Observer<? super Observable<T>> downstream, ObservableSource<B> open, Function<? super B, ? extends ObservableSource<V>> closingIndicator, int bufferSize) {
            this.downstream = downstream;
            this.open = open;
            this.closingIndicator = closingIndicator;
            this.bufferSize = bufferSize;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onSubscribe(Disposable d) {
            if (DisposableHelper.validate(this.upstream, d)) {
                this.upstream = d;
                this.downstream.onSubscribe(this);
                this.open.subscribe(this.startObserver);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onNext(T t) {
            this.queue.offer(t);
            drain();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onError(Throwable t) {
            this.startObserver.dispose();
            this.resources.dispose();
            if (this.error.tryAddThrowableOrReport(t)) {
                this.upstreamDone = true;
                drain();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onComplete() {
            this.startObserver.dispose();
            this.resources.dispose();
            this.upstreamDone = true;
            drain();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            if (this.downstreamDisposed.compareAndSet(false, true)) {
                if (this.windowCount.decrementAndGet() == 0) {
                    this.upstream.dispose();
                    this.startObserver.dispose();
                    this.resources.dispose();
                    this.error.tryTerminateAndReport();
                    this.upstreamCanceled = true;
                    drain();
                    return;
                }
                this.startObserver.dispose();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.downstreamDisposed.get();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.windowCount.decrementAndGet() == 0) {
                this.upstream.dispose();
                this.startObserver.dispose();
                this.resources.dispose();
                this.error.tryTerminateAndReport();
                this.upstreamCanceled = true;
                drain();
            }
        }

        public void open(B startValue) {
            this.queue.offer(new WindowStartItem(startValue));
            drain();
        }

        public void openError(Throwable t) {
            this.upstream.dispose();
            this.resources.dispose();
            if (this.error.tryAddThrowableOrReport(t)) {
                this.upstreamDone = true;
                drain();
            }
        }

        public void openComplete() {
            this.openDone = true;
            drain();
        }

        public void close(WindowEndObserverIntercept<T, V> what) {
            this.queue.offer(what);
            drain();
        }

        public void closeError(Throwable t) {
            this.upstream.dispose();
            this.startObserver.dispose();
            this.resources.dispose();
            if (this.error.tryAddThrowableOrReport(t)) {
                this.upstreamDone = true;
                drain();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            Observer<? super Observable<T>> observer = this.downstream;
            SimplePlainQueue<Object> simplePlainQueue = this.queue;
            List<UnicastSubject<T>> list = this.windows;
            int iAddAndGet = 1;
            while (true) {
                if (this.upstreamCanceled) {
                    simplePlainQueue.clear();
                    list.clear();
                } else {
                    boolean z = this.upstreamDone;
                    Object objPoll = simplePlainQueue.poll();
                    boolean z2 = objPoll == null;
                    if (z && (z2 || this.error.get() != null)) {
                        terminateDownstream(observer);
                        this.upstreamCanceled = true;
                    } else if (!z2) {
                        if (objPoll instanceof WindowStartItem) {
                            if (!this.downstreamDisposed.get()) {
                                try {
                                    ObservableSource<V> observableSourceApply = this.closingIndicator.apply(((WindowStartItem) objPoll).item);
                                    Objects.requireNonNull(observableSourceApply, "The closingIndicator returned a null ObservableSource");
                                    ObservableSource<V> observableSource = observableSourceApply;
                                    this.windowCount.getAndIncrement();
                                    UnicastSubject<T> unicastSubjectCreate = UnicastSubject.create(this.bufferSize, this);
                                    WindowEndObserverIntercept windowEndObserverIntercept = new WindowEndObserverIntercept(this, unicastSubjectCreate);
                                    observer.onNext(windowEndObserverIntercept);
                                    if (windowEndObserverIntercept.tryAbandon()) {
                                        unicastSubjectCreate.onComplete();
                                    } else {
                                        list.add(unicastSubjectCreate);
                                        this.resources.add(windowEndObserverIntercept);
                                        observableSource.subscribe(windowEndObserverIntercept);
                                    }
                                } catch (Throwable th) {
                                    Exceptions.throwIfFatal(th);
                                    this.upstream.dispose();
                                    this.startObserver.dispose();
                                    this.resources.dispose();
                                    Exceptions.throwIfFatal(th);
                                    this.error.tryAddThrowableOrReport(th);
                                    this.upstreamDone = true;
                                }
                            }
                        } else if (objPoll instanceof WindowEndObserverIntercept) {
                            UnicastSubject<T> unicastSubject = ((WindowEndObserverIntercept) objPoll).window;
                            list.remove(unicastSubject);
                            this.resources.delete((Disposable) objPoll);
                            unicastSubject.onComplete();
                        } else {
                            Iterator<UnicastSubject<T>> it = list.iterator();
                            while (it.hasNext()) {
                                it.next().onNext(objPoll);
                            }
                        }
                    } else if (this.openDone && list.size() == 0) {
                        this.upstream.dispose();
                        this.startObserver.dispose();
                        this.resources.dispose();
                        terminateDownstream(observer);
                        this.upstreamCanceled = true;
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        public void terminateDownstream(Observer<?> downstream) {
            Throwable thTerminate = this.error.terminate();
            if (thTerminate == null) {
                Iterator<UnicastSubject<T>> it = this.windows.iterator();
                while (it.hasNext()) {
                    it.next().onComplete();
                }
                downstream.onComplete();
                return;
            }
            if (thTerminate != ExceptionHelper.TERMINATED) {
                Iterator<UnicastSubject<T>> it2 = this.windows.iterator();
                while (it2.hasNext()) {
                    it2.next().onError(thTerminate);
                }
                downstream.onError(thTerminate);
            }
        }

        /* loaded from: classes8.dex */
        public static final class WindowStartItem<B> {
            public final B item;

            public WindowStartItem(B item) {
                this.item = item;
            }
        }

        public static final class WindowStartObserver<B> extends AtomicReference<Disposable> implements Observer<B> {
            public static final long serialVersionUID = -3326496781427702834L;
            public final WindowBoundaryMainObserver<?, B, ?> parent;

            public WindowStartObserver(WindowBoundaryMainObserver<?, B, ?> parent) {
                this.parent = parent;
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public void onSubscribe(Disposable d) {
                DisposableHelper.setOnce(this, d);
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public void onNext(B t) {
                this.parent.open(t);
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public void onError(Throwable t) {
                this.parent.openError(t);
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public void onComplete() {
                this.parent.openComplete();
            }

            public void dispose() {
                DisposableHelper.dispose(this);
            }
        }

        /* loaded from: classes8.dex */
        public static final class WindowEndObserverIntercept<T, V> extends Observable<T> implements Observer<V>, Disposable {
            public final WindowBoundaryMainObserver<T, ?, V> parent;
            public final UnicastSubject<T> window;
            public final AtomicReference<Disposable> upstream = new AtomicReference<>();
            public final AtomicBoolean once = new AtomicBoolean();

            public WindowEndObserverIntercept(WindowBoundaryMainObserver<T, ?, V> parent, UnicastSubject<T> window) {
                this.parent = parent;
                this.window = window;
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public void onSubscribe(Disposable d) {
                DisposableHelper.setOnce(this.upstream, d);
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public void onNext(V t) {
                if (DisposableHelper.dispose(this.upstream)) {
                    this.parent.close(this);
                }
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public void onError(Throwable t) {
                if (isDisposed()) {
                    RxJavaPlugins.onError(t);
                } else {
                    this.parent.closeError(t);
                }
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public void onComplete() {
                this.parent.close(this);
            }

            @Override // io.reactivex.rxjava3.disposables.Disposable
            public void dispose() {
                DisposableHelper.dispose(this.upstream);
            }

            @Override // io.reactivex.rxjava3.disposables.Disposable
            public boolean isDisposed() {
                return this.upstream.get() == DisposableHelper.DISPOSED;
            }

            @Override // io.reactivex.rxjava3.core.Observable
            public void subscribeActual(Observer<? super T> o) {
                this.window.subscribe(o);
                this.once.set(true);
            }

            public boolean tryAbandon() {
                return !this.once.get() && this.once.compareAndSet(false, true);
            }
        }
    }
}
