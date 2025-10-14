package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes8.dex */
public final class MaybeFlatMapBiSelector<T, U, R> extends AbstractMaybeWithUpstream<T, R> {
    public final Function<? super T, ? extends MaybeSource<? extends U>> mapper;
    public final BiFunction<? super T, ? super U, ? extends R> resultSelector;

    public MaybeFlatMapBiSelector(MaybeSource<T> source, Function<? super T, ? extends MaybeSource<? extends U>> mapper, BiFunction<? super T, ? super U, ? extends R> resultSelector) {
        super(source);
        this.mapper = mapper;
        this.resultSelector = resultSelector;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super R> observer) {
        this.source.subscribe(new FlatMapBiMainObserver(observer, this.mapper, this.resultSelector));
    }

    /* loaded from: classes5.dex */
    public static final class FlatMapBiMainObserver<T, U, R> implements MaybeObserver<T>, Disposable {
        public final InnerObserver<T, U, R> inner;
        public final Function<? super T, ? extends MaybeSource<? extends U>> mapper;

        public FlatMapBiMainObserver(MaybeObserver<? super R> actual, Function<? super T, ? extends MaybeSource<? extends U>> mapper, BiFunction<? super T, ? super U, ? extends R> resultSelector) {
            this.inner = new InnerObserver<>(actual, resultSelector);
            this.mapper = mapper;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this.inner);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.inner.get());
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public void onSubscribe(Disposable d) {
            if (DisposableHelper.setOnce(this.inner, d)) {
                this.inner.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public void onSuccess(T t) {
            try {
                MaybeSource<? extends U> maybeSourceApply = this.mapper.apply(t);
                Objects.requireNonNull(maybeSourceApply, "The mapper returned a null MaybeSource");
                MaybeSource<? extends U> maybeSource = maybeSourceApply;
                if (DisposableHelper.replace(this.inner, null)) {
                    InnerObserver<T, U, R> innerObserver = this.inner;
                    innerObserver.value = t;
                    maybeSource.subscribe(innerObserver);
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.inner.downstream.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public void onError(Throwable e) {
            this.inner.downstream.onError(e);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
        public void onComplete() {
            this.inner.downstream.onComplete();
        }

        public static final class InnerObserver<T, U, R> extends AtomicReference<Disposable> implements MaybeObserver<U> {
            public static final long serialVersionUID = -2897979525538174559L;
            public final MaybeObserver<? super R> downstream;
            public final BiFunction<? super T, ? super U, ? extends R> resultSelector;
            public T value;

            public InnerObserver(MaybeObserver<? super R> actual, BiFunction<? super T, ? super U, ? extends R> resultSelector) {
                this.downstream = actual;
                this.resultSelector = resultSelector;
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
            public void onSubscribe(Disposable d) {
                DisposableHelper.setOnce(this, d);
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
            public void onSuccess(U value) {
                T t = this.value;
                this.value = null;
                try {
                    R rApply = this.resultSelector.apply(t, value);
                    Objects.requireNonNull(rApply, "The resultSelector returned a null value");
                    this.downstream.onSuccess(rApply);
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    this.downstream.onError(th);
                }
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
            public void onError(Throwable e) {
                this.downstream.onError(e);
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
            public void onComplete() {
                this.downstream.onComplete();
            }
        }
    }
}
