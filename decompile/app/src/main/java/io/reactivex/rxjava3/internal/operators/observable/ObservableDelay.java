package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.observers.SerializedObserver;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class ObservableDelay<T> extends AbstractObservableWithUpstream<T, T> {
    public final long delay;
    public final boolean delayError;
    public final Scheduler scheduler;
    public final TimeUnit unit;

    public ObservableDelay(ObservableSource<T> source, long delay, TimeUnit unit, Scheduler scheduler, boolean delayError) {
        super(source);
        this.delay = delay;
        this.unit = unit;
        this.scheduler = scheduler;
        this.delayError = delayError;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> t) {
        this.source.subscribe(new DelayObserver(this.delayError ? t : new SerializedObserver(t), this.delay, this.unit, this.scheduler.createWorker(), this.delayError));
    }

    /* loaded from: classes7.dex */
    public static final class DelayObserver<T> implements Observer<T>, Disposable {
        public final long delay;
        public final boolean delayError;
        public final Observer<? super T> downstream;
        public final TimeUnit unit;
        public Disposable upstream;

        /* renamed from: w */
        public final Scheduler.Worker f9743w;

        public DelayObserver(Observer<? super T> actual, long delay, TimeUnit unit, Scheduler.Worker w, boolean delayError) {
            this.downstream = actual;
            this.delay = delay;
            this.unit = unit;
            this.f9743w = w;
            this.delayError = delayError;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onSubscribe(Disposable d) {
            if (DisposableHelper.validate(this.upstream, d)) {
                this.upstream = d;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onNext(final T t) {
            this.f9743w.schedule(new OnNext(t), this.delay, this.unit);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onError(final Throwable t) {
            this.f9743w.schedule(new OnError(t), this.delayError ? this.delay : 0L, this.unit);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onComplete() {
            this.f9743w.schedule(new OnComplete(), this.delay, this.unit);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.upstream.dispose();
            this.f9743w.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f9743w.isDisposed();
        }

        /* loaded from: classes8.dex */
        public final class OnNext implements Runnable {

            /* renamed from: t */
            public final T f9744t;

            public OnNext(T t) {
                this.f9744t = t;
            }

            @Override // java.lang.Runnable
            public void run() {
                DelayObserver.this.downstream.onNext(this.f9744t);
            }
        }

        /* loaded from: classes8.dex */
        public final class OnError implements Runnable {
            public final Throwable throwable;

            public OnError(Throwable throwable) {
                this.throwable = throwable;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    DelayObserver.this.downstream.onError(this.throwable);
                } finally {
                    DelayObserver.this.f9743w.dispose();
                }
            }
        }

        /* loaded from: classes8.dex */
        public final class OnComplete implements Runnable {
            public OnComplete() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    DelayObserver.this.downstream.onComplete();
                } finally {
                    DelayObserver.this.f9743w.dispose();
                }
            }
        }
    }
}
