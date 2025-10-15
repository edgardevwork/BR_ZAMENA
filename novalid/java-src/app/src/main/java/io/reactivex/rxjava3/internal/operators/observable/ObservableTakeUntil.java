package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.HalfSerializer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class ObservableTakeUntil<T, U> extends AbstractObservableWithUpstream<T, T> {
    public final ObservableSource<? extends U> other;

    public ObservableTakeUntil(ObservableSource<T> source, ObservableSource<? extends U> other) {
        super(source);
        this.other = other;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> child) {
        TakeUntilMainObserver takeUntilMainObserver = new TakeUntilMainObserver(child);
        child.onSubscribe(takeUntilMainObserver);
        this.other.subscribe(takeUntilMainObserver.otherObserver);
        this.source.subscribe(takeUntilMainObserver);
    }

    /* loaded from: classes5.dex */
    public static final class TakeUntilMainObserver<T, U> extends AtomicInteger implements Observer<T>, Disposable {
        public static final long serialVersionUID = 1418547743690811973L;
        public final Observer<? super T> downstream;
        public final AtomicReference<Disposable> upstream = new AtomicReference<>();
        public final TakeUntilMainObserver<T, U>.OtherObserver otherObserver = new OtherObserver();
        public final AtomicThrowable error = new AtomicThrowable();

        public TakeUntilMainObserver(Observer<? super T> downstream) {
            this.downstream = downstream;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this.upstream);
            DisposableHelper.dispose(this.otherObserver);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.upstream.get());
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onSubscribe(Disposable d) {
            DisposableHelper.setOnce(this.upstream, d);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onNext(T t) {
            HalfSerializer.onNext(this.downstream, t, this, this.error);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onError(Throwable e) {
            DisposableHelper.dispose(this.otherObserver);
            HalfSerializer.onError(this.downstream, e, this, this.error);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onComplete() {
            DisposableHelper.dispose(this.otherObserver);
            HalfSerializer.onComplete(this.downstream, this, this.error);
        }

        public void otherError(Throwable e) {
            DisposableHelper.dispose(this.upstream);
            HalfSerializer.onError(this.downstream, e, this, this.error);
        }

        public void otherComplete() {
            DisposableHelper.dispose(this.upstream);
            HalfSerializer.onComplete(this.downstream, this, this.error);
        }

        public final class OtherObserver extends AtomicReference<Disposable> implements Observer<U> {
            public static final long serialVersionUID = -8693423678067375039L;

            public OtherObserver() {
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public void onSubscribe(Disposable d) {
                DisposableHelper.setOnce(this, d);
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public void onNext(U t) {
                DisposableHelper.dispose(this);
                TakeUntilMainObserver.this.otherComplete();
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public void onError(Throwable e) {
                TakeUntilMainObserver.this.otherError(e);
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public void onComplete() {
                TakeUntilMainObserver.this.otherComplete();
            }
        }
    }
}
