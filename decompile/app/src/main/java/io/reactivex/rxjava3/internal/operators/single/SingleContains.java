package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiPredicate;

/* loaded from: classes8.dex */
public final class SingleContains<T> extends Single<Boolean> {
    public final BiPredicate<Object, Object> comparer;
    public final SingleSource<T> source;
    public final Object value;

    public SingleContains(SingleSource<T> source, Object value, BiPredicate<Object, Object> comparer) {
        this.source = source;
        this.value = value;
        this.comparer = comparer;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(final SingleObserver<? super Boolean> observer) {
        this.source.subscribe(new ContainsSingleObserver(observer));
    }

    /* loaded from: classes5.dex */
    public final class ContainsSingleObserver implements SingleObserver<T> {
        public final SingleObserver<? super Boolean> downstream;

        public ContainsSingleObserver(SingleObserver<? super Boolean> observer) {
            this.downstream = observer;
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public void onSubscribe(Disposable d) {
            this.downstream.onSubscribe(d);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public void onSuccess(T v) {
            try {
                SingleContains singleContains = SingleContains.this;
                this.downstream.onSuccess(Boolean.valueOf(singleContains.comparer.test(v, singleContains.value)));
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public void onError(Throwable e) {
            this.downstream.onError(e);
        }
    }
}
