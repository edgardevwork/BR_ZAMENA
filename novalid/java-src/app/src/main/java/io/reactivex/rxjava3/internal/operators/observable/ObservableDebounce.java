package io.reactivex.rxjava3.internal.operators.observable;

import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.observers.DisposableObserver;
import io.reactivex.rxjava3.observers.SerializedObserver;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes8.dex */
public final class ObservableDebounce<T, U> extends AbstractObservableWithUpstream<T, T> {
    public final Function<? super T, ? extends ObservableSource<U>> debounceSelector;

    public ObservableDebounce(ObservableSource<T> source, Function<? super T, ? extends ObservableSource<U>> debounceSelector) {
        super(source);
        this.debounceSelector = debounceSelector;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> t) {
        this.source.subscribe(new DebounceObserver(new SerializedObserver(t), this.debounceSelector));
    }

    /* loaded from: classes7.dex */
    public static final class DebounceObserver<T, U> implements Observer<T>, Disposable {
        public final Function<? super T, ? extends ObservableSource<U>> debounceSelector;
        public final AtomicReference<Disposable> debouncer = new AtomicReference<>();
        public boolean done;
        public final Observer<? super T> downstream;
        public volatile long index;
        public Disposable upstream;

        public DebounceObserver(Observer<? super T> actual, Function<? super T, ? extends ObservableSource<U>> debounceSelector) {
            this.downstream = actual;
            this.debounceSelector = debounceSelector;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onSubscribe(Disposable d) {
            if (DisposableHelper.validate(this.upstream, d)) {
                this.upstream = d;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            long j = this.index + 1;
            this.index = j;
            Disposable disposable = this.debouncer.get();
            if (disposable != null) {
                disposable.dispose();
            }
            try {
                ObservableSource<U> observableSourceApply = this.debounceSelector.apply(t);
                Objects.requireNonNull(observableSourceApply, "The ObservableSource supplied is null");
                ObservableSource<U> observableSource = observableSourceApply;
                DebounceInnerObserver debounceInnerObserver = new DebounceInnerObserver(this, j, t);
                if (MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m34m(this.debouncer, disposable, debounceInnerObserver)) {
                    observableSource.subscribe(debounceInnerObserver);
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                dispose();
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onError(Throwable t) {
            DisposableHelper.dispose(this.debouncer);
            this.downstream.onError(t);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            Disposable disposable = this.debouncer.get();
            if (disposable != DisposableHelper.DISPOSED) {
                DebounceInnerObserver debounceInnerObserver = (DebounceInnerObserver) disposable;
                if (debounceInnerObserver != null) {
                    debounceInnerObserver.emit();
                }
                DisposableHelper.dispose(this.debouncer);
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.upstream.dispose();
            DisposableHelper.dispose(this.debouncer);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        public void emit(long idx, T value) {
            if (idx == this.index) {
                this.downstream.onNext(value);
            }
        }

        /* loaded from: classes5.dex */
        public static final class DebounceInnerObserver<T, U> extends DisposableObserver<U> {
            public boolean done;
            public final long index;
            public final AtomicBoolean once = new AtomicBoolean();
            public final DebounceObserver<T, U> parent;
            public final T value;

            public DebounceInnerObserver(DebounceObserver<T, U> parent, long index, T value) {
                this.parent = parent;
                this.index = index;
                this.value = value;
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public void onNext(U t) {
                if (this.done) {
                    return;
                }
                this.done = true;
                dispose();
                emit();
            }

            public void emit() {
                if (this.once.compareAndSet(false, true)) {
                    this.parent.emit(this.index, this.value);
                }
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public void onError(Throwable t) {
                if (this.done) {
                    RxJavaPlugins.onError(t);
                } else {
                    this.done = true;
                    this.parent.onError(t);
                }
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public void onComplete() {
                if (this.done) {
                    return;
                }
                this.done = true;
                emit();
            }
        }
    }
}
