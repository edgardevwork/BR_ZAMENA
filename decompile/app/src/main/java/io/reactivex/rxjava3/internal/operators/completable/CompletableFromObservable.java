package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

/* loaded from: classes6.dex */
public final class CompletableFromObservable<T> extends Completable {
    public final ObservableSource<T> observable;

    public CompletableFromObservable(ObservableSource<T> observable) {
        this.observable = observable;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public void subscribeActual(final CompletableObserver observer) {
        this.observable.subscribe(new CompletableFromObservableObserver(observer));
    }

    public static final class CompletableFromObservableObserver<T> implements Observer<T> {

        /* renamed from: co */
        public final CompletableObserver f9709co;

        @Override // io.reactivex.rxjava3.core.Observer
        public void onNext(T value) {
        }

        public CompletableFromObservableObserver(CompletableObserver co) {
            this.f9709co = co;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onSubscribe(Disposable d) {
            this.f9709co.onSubscribe(d);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onError(Throwable e) {
            this.f9709co.onError(e);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onComplete() {
            this.f9709co.onComplete();
        }
    }
}
