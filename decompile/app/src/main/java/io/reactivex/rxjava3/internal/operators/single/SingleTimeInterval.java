package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.schedulers.Timed;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class SingleTimeInterval<T> extends Single<Timed<T>> {
    public final Scheduler scheduler;
    public final SingleSource<T> source;
    public final boolean start;
    public final TimeUnit unit;

    public SingleTimeInterval(SingleSource<T> source, TimeUnit unit, Scheduler scheduler, boolean start) {
        this.source = source;
        this.unit = unit;
        this.scheduler = scheduler;
        this.start = start;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(@NonNull SingleObserver<? super Timed<T>> observer) {
        this.source.subscribe(new TimeIntervalSingleObserver(observer, this.unit, this.scheduler, this.start));
    }

    public static final class TimeIntervalSingleObserver<T> implements SingleObserver<T>, Disposable {
        public final SingleObserver<? super Timed<T>> downstream;
        public final Scheduler scheduler;
        public final long startTime;
        public final TimeUnit unit;
        public Disposable upstream;

        public TimeIntervalSingleObserver(SingleObserver<? super Timed<T>> downstream, TimeUnit unit, Scheduler scheduler, boolean start) {
            this.downstream = downstream;
            this.unit = unit;
            this.scheduler = scheduler;
            this.startTime = start ? scheduler.now(unit) : 0L;
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public void onSubscribe(@NonNull Disposable d) {
            if (DisposableHelper.validate(this.upstream, d)) {
                this.upstream = d;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public void onSuccess(@NonNull T t) {
            this.downstream.onSuccess(new Timed(t, this.scheduler.now(this.unit) - this.startTime, this.unit));
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public void onError(@NonNull Throwable e) {
            this.downstream.onError(e);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.upstream.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }
    }
}
