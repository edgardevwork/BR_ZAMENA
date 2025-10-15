package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;

/* loaded from: classes8.dex */
public final class ObservableMapNotification<T, R> extends AbstractObservableWithUpstream<T, ObservableSource<? extends R>> {
    public final Supplier<? extends ObservableSource<? extends R>> onCompleteSupplier;
    public final Function<? super Throwable, ? extends ObservableSource<? extends R>> onErrorMapper;
    public final Function<? super T, ? extends ObservableSource<? extends R>> onNextMapper;

    public ObservableMapNotification(ObservableSource<T> source, Function<? super T, ? extends ObservableSource<? extends R>> onNextMapper, Function<? super Throwable, ? extends ObservableSource<? extends R>> onErrorMapper, Supplier<? extends ObservableSource<? extends R>> onCompleteSupplier) {
        super(source);
        this.onNextMapper = onNextMapper;
        this.onErrorMapper = onErrorMapper;
        this.onCompleteSupplier = onCompleteSupplier;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super ObservableSource<? extends R>> t) {
        this.source.subscribe(new MapNotificationObserver(t, this.onNextMapper, this.onErrorMapper, this.onCompleteSupplier));
    }

    /* loaded from: classes7.dex */
    public static final class MapNotificationObserver<T, R> implements Observer<T>, Disposable {
        public final Observer<? super ObservableSource<? extends R>> downstream;
        public final Supplier<? extends ObservableSource<? extends R>> onCompleteSupplier;
        public final Function<? super Throwable, ? extends ObservableSource<? extends R>> onErrorMapper;
        public final Function<? super T, ? extends ObservableSource<? extends R>> onNextMapper;
        public Disposable upstream;

        public MapNotificationObserver(Observer<? super ObservableSource<? extends R>> actual, Function<? super T, ? extends ObservableSource<? extends R>> onNextMapper, Function<? super Throwable, ? extends ObservableSource<? extends R>> onErrorMapper, Supplier<? extends ObservableSource<? extends R>> onCompleteSupplier) {
            this.downstream = actual;
            this.onNextMapper = onNextMapper;
            this.onErrorMapper = onErrorMapper;
            this.onCompleteSupplier = onCompleteSupplier;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onSubscribe(Disposable d) {
            if (DisposableHelper.validate(this.upstream, d)) {
                this.upstream = d;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.upstream.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onNext(T t) {
            try {
                ObservableSource<? extends R> observableSourceApply = this.onNextMapper.apply(t);
                Objects.requireNonNull(observableSourceApply, "The onNext ObservableSource returned is null");
                this.downstream.onNext(observableSourceApply);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onError(Throwable t) {
            try {
                ObservableSource<? extends R> observableSourceApply = this.onErrorMapper.apply(t);
                Objects.requireNonNull(observableSourceApply, "The onError ObservableSource returned is null");
                this.downstream.onNext(observableSourceApply);
                this.downstream.onComplete();
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.downstream.onError(new CompositeException(t, th));
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onComplete() {
            try {
                ObservableSource<? extends R> observableSource = this.onCompleteSupplier.get();
                Objects.requireNonNull(observableSource, "The onComplete ObservableSource returned is null");
                this.downstream.onNext(observableSource);
                this.downstream.onComplete();
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.downstream.onError(th);
            }
        }
    }
}
