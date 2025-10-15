package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.observers.BasicFuseableObserver;
import java.util.Objects;
import java.util.Optional;

/* loaded from: classes6.dex */
public final class ObservableMapOptional<T, R> extends Observable<R> {
    public final Function<? super T, Optional<? extends R>> mapper;
    public final Observable<T> source;

    public ObservableMapOptional(Observable<T> source, Function<? super T, Optional<? extends R>> mapper) {
        this.source = source;
        this.mapper = mapper;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super R> observer) {
        this.source.subscribe(new MapOptionalObserver(observer, this.mapper));
    }

    /* loaded from: classes7.dex */
    public static final class MapOptionalObserver<T, R> extends BasicFuseableObserver<T, R> {
        public final Function<? super T, Optional<? extends R>> mapper;

        public MapOptionalObserver(Observer<? super R> downstream, Function<? super T, Optional<? extends R>> mapper) {
            super(downstream);
            this.mapper = mapper;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            if (this.sourceMode != 0) {
                this.downstream.onNext(null);
                return;
            }
            try {
                Optional<? extends R> optionalApply = this.mapper.apply(t);
                Objects.requireNonNull(optionalApply, "The mapper returned a null Optional");
                Optional<? extends R> optional = optionalApply;
                if (optional.isPresent()) {
                    this.downstream.onNext(optional.get());
                }
            } catch (Throwable th) {
                fail(th);
            }
        }

        @Override // io.reactivex.rxjava3.operators.QueueFuseable
        public int requestFusion(int mode) {
            return transitiveBoundaryFusion(mode);
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public R poll() throws Throwable {
            Optional<? extends R> optional;
            do {
                T tPoll = this.f9697qd.poll();
                if (tPoll == null) {
                    return null;
                }
                Optional<? extends R> optionalApply = this.mapper.apply(tPoll);
                Objects.requireNonNull(optionalApply, "The mapper returned a null Optional");
                optional = optionalApply;
            } while (!optional.isPresent());
            return optional.get();
        }
    }
}
