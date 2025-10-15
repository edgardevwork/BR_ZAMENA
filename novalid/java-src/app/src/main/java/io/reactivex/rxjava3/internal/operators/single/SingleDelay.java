package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class SingleDelay<T> extends Single<T> {
    public final boolean delayError;
    public final Scheduler scheduler;
    public final SingleSource<? extends T> source;
    public final long time;
    public final TimeUnit unit;

    public SingleDelay(SingleSource<? extends T> source, long time, TimeUnit unit, Scheduler scheduler, boolean delayError) {
        this.source = source;
        this.time = time;
        this.unit = unit;
        this.scheduler = scheduler;
        this.delayError = delayError;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(final SingleObserver<? super T> observer) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        observer.onSubscribe(sequentialDisposable);
        this.source.subscribe(new Delay(sequentialDisposable, observer));
    }

    /* loaded from: classes5.dex */
    public final class Delay implements SingleObserver<T> {
        public final SingleObserver<? super T> downstream;

        /* renamed from: sd */
        public final SequentialDisposable f9758sd;

        public Delay(SequentialDisposable sd, SingleObserver<? super T> observer) {
            this.f9758sd = sd;
            this.downstream = observer;
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public void onSubscribe(Disposable d) {
            this.f9758sd.replace(d);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public void onSuccess(final T value) {
            SequentialDisposable sequentialDisposable = this.f9758sd;
            Scheduler scheduler = SingleDelay.this.scheduler;
            OnSuccess onSuccess = new OnSuccess(value);
            SingleDelay singleDelay = SingleDelay.this;
            sequentialDisposable.replace(scheduler.scheduleDirect(onSuccess, singleDelay.time, singleDelay.unit));
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public void onError(final Throwable e) {
            SequentialDisposable sequentialDisposable = this.f9758sd;
            Scheduler scheduler = SingleDelay.this.scheduler;
            OnError onError = new OnError(e);
            SingleDelay singleDelay = SingleDelay.this;
            sequentialDisposable.replace(scheduler.scheduleDirect(onError, singleDelay.delayError ? singleDelay.time : 0L, singleDelay.unit));
        }

        /* loaded from: classes8.dex */
        public final class OnSuccess implements Runnable {
            public final T value;

            public OnSuccess(T value) {
                this.value = value;
            }

            @Override // java.lang.Runnable
            public void run() {
                Delay.this.downstream.onSuccess(this.value);
            }
        }

        /* loaded from: classes8.dex */
        public final class OnError implements Runnable {

            /* renamed from: e */
            public final Throwable f9759e;

            public OnError(Throwable e) {
                this.f9759e = e;
            }

            @Override // java.lang.Runnable
            public void run() {
                Delay.this.downstream.onError(this.f9759e);
            }
        }
    }
}
