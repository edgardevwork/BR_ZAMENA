package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.ArrayCompositeDisposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.observers.SerializedObserver;

/* loaded from: classes8.dex */
public final class ObservableSkipUntil<T, U> extends AbstractObservableWithUpstream<T, T> {
    public final ObservableSource<U> other;

    public ObservableSkipUntil(ObservableSource<T> source, ObservableSource<U> other) {
        super(source);
        this.other = other;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> child) {
        SerializedObserver serializedObserver = new SerializedObserver(child);
        ArrayCompositeDisposable arrayCompositeDisposable = new ArrayCompositeDisposable(2);
        serializedObserver.onSubscribe(arrayCompositeDisposable);
        SkipUntilObserver skipUntilObserver = new SkipUntilObserver(serializedObserver, arrayCompositeDisposable);
        this.other.subscribe(new SkipUntil(arrayCompositeDisposable, skipUntilObserver, serializedObserver));
        this.source.subscribe(skipUntilObserver);
    }

    /* loaded from: classes5.dex */
    public static final class SkipUntilObserver<T> implements Observer<T> {
        public final Observer<? super T> downstream;
        public final ArrayCompositeDisposable frc;
        public volatile boolean notSkipping;
        public boolean notSkippingLocal;
        public Disposable upstream;

        public SkipUntilObserver(Observer<? super T> actual, ArrayCompositeDisposable frc) {
            this.downstream = actual;
            this.frc = frc;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onSubscribe(Disposable d) {
            if (DisposableHelper.validate(this.upstream, d)) {
                this.upstream = d;
                this.frc.setResource(0, d);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onNext(T t) {
            if (this.notSkippingLocal) {
                this.downstream.onNext(t);
            } else if (this.notSkipping) {
                this.notSkippingLocal = true;
                this.downstream.onNext(t);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onError(Throwable t) {
            this.frc.dispose();
            this.downstream.onError(t);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onComplete() {
            this.frc.dispose();
            this.downstream.onComplete();
        }
    }

    /* loaded from: classes5.dex */
    public final class SkipUntil implements Observer<U> {
        public final ArrayCompositeDisposable frc;
        public final SerializedObserver<T> serial;
        public final SkipUntilObserver<T> sus;
        public Disposable upstream;

        public SkipUntil(ArrayCompositeDisposable frc, SkipUntilObserver<T> sus, SerializedObserver<T> serial) {
            this.frc = frc;
            this.sus = sus;
            this.serial = serial;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onSubscribe(Disposable d) {
            if (DisposableHelper.validate(this.upstream, d)) {
                this.upstream = d;
                this.frc.setResource(1, d);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onNext(U t) {
            this.upstream.dispose();
            this.sus.notSkipping = true;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onError(Throwable t) {
            this.frc.dispose();
            this.serial.onError(t);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onComplete() {
            this.sus.notSkipping = true;
        }
    }
}
