package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Supplier;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;

/* loaded from: classes7.dex */
public final class FlowableOnBackpressureReduceWith<T, R> extends AbstractFlowableWithUpstream<T, R> {
    public final BiFunction<R, ? super T, R> reducer;
    public final Supplier<R> supplier;

    public FlowableOnBackpressureReduceWith(@NonNull Flowable<T> source, @NonNull Supplier<R> supplier, @NonNull BiFunction<R, ? super T, R> reducer) {
        super(source);
        this.reducer = reducer;
        this.supplier = supplier;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(@NonNull Subscriber<? super R> s) {
        this.source.subscribe((FlowableSubscriber) new BackpressureReduceWithSubscriber(s, this.supplier, this.reducer));
    }

    public static final class BackpressureReduceWithSubscriber<T, R> extends AbstractBackpressureThrottlingSubscriber<T, R> {
        public static final long serialVersionUID = 8255923705960622424L;
        public final BiFunction<R, ? super T, R> reducer;
        public final Supplier<R> supplier;

        public BackpressureReduceWithSubscriber(@NonNull Subscriber<? super R> downstream, @NonNull Supplier<R> supplier, @NonNull BiFunction<R, ? super T, R> reducer) {
            super(downstream);
            this.reducer = reducer;
            this.supplier = supplier;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.AbstractBackpressureThrottlingSubscriber, org.reactivestreams.Subscriber
        public void onNext(T t) {
            R andSet = this.current.get();
            if (andSet != null) {
                andSet = this.current.getAndSet(null);
            }
            try {
                if (andSet == null) {
                    AtomicReference<R> atomicReference = this.current;
                    BiFunction<R, ? super T, R> biFunction = this.reducer;
                    R r = this.supplier.get();
                    Objects.requireNonNull(r, "The supplier returned a null value");
                    Object objApply = biFunction.apply(r, t);
                    Objects.requireNonNull(objApply, "The reducer returned a null value");
                    atomicReference.lazySet(objApply);
                } else {
                    AtomicReference<R> atomicReference2 = this.current;
                    Object objApply2 = this.reducer.apply(andSet, t);
                    Objects.requireNonNull(objApply2, "The reducer returned a null value");
                    atomicReference2.lazySet(objApply2);
                }
                drain();
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.upstream.cancel();
                onError(th);
            }
        }
    }
}
