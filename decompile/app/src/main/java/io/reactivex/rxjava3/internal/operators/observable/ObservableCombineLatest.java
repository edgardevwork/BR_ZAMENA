package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class ObservableCombineLatest<T, R> extends Observable<R> {
    public final int bufferSize;
    public final Function<? super Object[], ? extends R> combiner;
    public final boolean delayError;
    public final ObservableSource<? extends T>[] sources;
    public final Iterable<? extends ObservableSource<? extends T>> sourcesIterable;

    public ObservableCombineLatest(ObservableSource<? extends T>[] sources, Iterable<? extends ObservableSource<? extends T>> sourcesIterable, Function<? super Object[], ? extends R> combiner, int bufferSize, boolean delayError) {
        this.sources = sources;
        this.sourcesIterable = sourcesIterable;
        this.combiner = combiner;
        this.bufferSize = bufferSize;
        this.delayError = delayError;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super R> observer) {
        int length;
        ObservableSource<? extends T>[] observableSourceArr = this.sources;
        if (observableSourceArr == null) {
            observableSourceArr = new ObservableSource[8];
            try {
                length = 0;
                for (ObservableSource<? extends T> observableSource : this.sourcesIterable) {
                    if (length == observableSourceArr.length) {
                        ObservableSource<? extends T>[] observableSourceArr2 = new ObservableSource[(length >> 2) + length];
                        System.arraycopy(observableSourceArr, 0, observableSourceArr2, 0, length);
                        observableSourceArr = observableSourceArr2;
                    }
                    int i = length + 1;
                    Objects.requireNonNull(observableSource, "The Iterator returned a null ObservableSource");
                    observableSourceArr[length] = observableSource;
                    length = i;
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                EmptyDisposable.error(th, observer);
                return;
            }
        } else {
            length = observableSourceArr.length;
        }
        int i2 = length;
        if (i2 == 0) {
            EmptyDisposable.complete(observer);
        } else {
            new LatestCoordinator(observer, this.combiner, i2, this.bufferSize, this.delayError).subscribe(observableSourceArr);
        }
    }

    /* loaded from: classes7.dex */
    public static final class LatestCoordinator<T, R> extends AtomicInteger implements Disposable {
        public static final long serialVersionUID = 8567835998786448817L;
        public int active;
        public volatile boolean cancelled;
        public final Function<? super Object[], ? extends R> combiner;
        public int complete;
        public final boolean delayError;
        public volatile boolean done;
        public final Observer<? super R> downstream;
        public final AtomicThrowable errors = new AtomicThrowable();
        public Object[] latest;
        public final CombinerObserver<T, R>[] observers;
        public final SpscLinkedArrayQueue<Object[]> queue;

        public LatestCoordinator(Observer<? super R> actual, Function<? super Object[], ? extends R> combiner, int count, int bufferSize, boolean delayError) {
            this.downstream = actual;
            this.combiner = combiner;
            this.delayError = delayError;
            this.latest = new Object[count];
            CombinerObserver<T, R>[] combinerObserverArr = new CombinerObserver[count];
            for (int i = 0; i < count; i++) {
                combinerObserverArr[i] = new CombinerObserver<>(this, i);
            }
            this.observers = combinerObserverArr;
            this.queue = new SpscLinkedArrayQueue<>(bufferSize);
        }

        public void subscribe(ObservableSource<? extends T>[] sources) {
            CombinerObserver<T, R>[] combinerObserverArr = this.observers;
            int length = combinerObserverArr.length;
            this.downstream.onSubscribe(this);
            for (int i = 0; i < length && !this.done && !this.cancelled; i++) {
                sources[i].subscribe(combinerObserverArr[i]);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            cancelSources();
            drain();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        public void cancelSources() {
            for (CombinerObserver<T, R> combinerObserver : this.observers) {
                combinerObserver.dispose();
            }
        }

        public void clear(SpscLinkedArrayQueue<?> q) {
            synchronized (this) {
                this.latest = null;
            }
            q.clear();
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            SpscLinkedArrayQueue<Object[]> spscLinkedArrayQueue = this.queue;
            Observer<? super R> observer = this.downstream;
            boolean z = this.delayError;
            int iAddAndGet = 1;
            while (!this.cancelled) {
                if (!z && this.errors.get() != null) {
                    cancelSources();
                    clear(spscLinkedArrayQueue);
                    this.errors.tryTerminateConsumer(observer);
                    return;
                }
                boolean z2 = this.done;
                Object[] objArrPoll = spscLinkedArrayQueue.poll();
                boolean z3 = objArrPoll == null;
                if (z2 && z3) {
                    clear(spscLinkedArrayQueue);
                    this.errors.tryTerminateConsumer(observer);
                    return;
                }
                if (!z3) {
                    try {
                        R rApply = this.combiner.apply(objArrPoll);
                        Objects.requireNonNull(rApply, "The combiner returned a null value");
                        observer.onNext(rApply);
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        this.errors.tryAddThrowableOrReport(th);
                        cancelSources();
                        clear(spscLinkedArrayQueue);
                        this.errors.tryTerminateConsumer(observer);
                        return;
                    }
                } else {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            clear(spscLinkedArrayQueue);
            this.errors.tryTerminateAndReport();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void innerNext(int index, T item) {
            boolean z;
            synchronized (this) {
                try {
                    Object[] objArr = this.latest;
                    if (objArr == null) {
                        return;
                    }
                    Object obj = objArr[index];
                    int i = this.active;
                    if (obj == null) {
                        i++;
                        this.active = i;
                    }
                    objArr[index] = item;
                    if (i == objArr.length) {
                        this.queue.offer(objArr.clone());
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        drain();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0027 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:7:0x000e, B:9:0x0012, B:13:0x0016, B:18:0x001f, B:21:0x0029, B:20:0x0027), top: B:29:0x000e }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void innerError(int index, Throwable ex) {
            if (this.errors.tryAddThrowableOrReport(ex)) {
                boolean z = true;
                if (this.delayError) {
                    synchronized (this) {
                        try {
                            Object[] objArr = this.latest;
                            if (objArr == null) {
                                return;
                            }
                            boolean z2 = objArr[index] == null;
                            if (!z2) {
                                int i = this.complete + 1;
                                this.complete = i;
                                if (i == objArr.length) {
                                    this.done = true;
                                }
                                z = z2;
                            }
                        } finally {
                        }
                    }
                }
                if (z) {
                    cancelSources();
                }
                drain();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x001b A[Catch: all -> 0x0007, TryCatch #0 {all -> 0x0007, blocks: (B:3:0x0001, B:5:0x0005, B:9:0x0009, B:14:0x0013, B:17:0x001d, B:16:0x001b), top: B:24:0x0001 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void innerComplete(int index) {
            synchronized (this) {
                try {
                    Object[] objArr = this.latest;
                    if (objArr == null) {
                        return;
                    }
                    boolean z = objArr[index] == null;
                    if (!z) {
                        int i = this.complete + 1;
                        this.complete = i;
                        if (i == objArr.length) {
                            this.done = true;
                        }
                    }
                    if (z) {
                        cancelSources();
                    }
                    drain();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* loaded from: classes7.dex */
    public static final class CombinerObserver<T, R> extends AtomicReference<Disposable> implements Observer<T> {
        public static final long serialVersionUID = -4823716997131257941L;
        public final int index;
        public final LatestCoordinator<T, R> parent;

        public CombinerObserver(LatestCoordinator<T, R> parent, int index) {
            this.parent = parent;
            this.index = index;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onSubscribe(Disposable d) {
            DisposableHelper.setOnce(this, d);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onNext(T t) {
            this.parent.innerNext(this.index, t);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onError(Throwable t) {
            this.parent.innerError(this.index, t);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onComplete() {
            this.parent.innerComplete(this.index);
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }
    }
}
