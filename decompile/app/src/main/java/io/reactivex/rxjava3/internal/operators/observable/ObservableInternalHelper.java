package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Emitter;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.BiConsumer;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.observables.ConnectableObservable;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class ObservableInternalHelper {
    public ObservableInternalHelper() {
        throw new IllegalStateException("No instances!");
    }

    /* loaded from: classes7.dex */
    public static final class SimpleGenerator<T, S> implements BiFunction<S, Emitter<T>, S> {
        public final Consumer<Emitter<T>> consumer;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.functions.BiFunction
        public /* bridge */ /* synthetic */ Object apply(Object t1, Object t2) throws Throwable {
            return apply((SimpleGenerator<T, S>) t1, (Emitter) t2);
        }

        public SimpleGenerator(Consumer<Emitter<T>> consumer) {
            this.consumer = consumer;
        }

        public S apply(S t1, Emitter<T> t2) throws Throwable {
            this.consumer.accept(t2);
            return t1;
        }
    }

    public static <T, S> BiFunction<S, Emitter<T>, S> simpleGenerator(Consumer<Emitter<T>> consumer) {
        return new SimpleGenerator(consumer);
    }

    /* loaded from: classes7.dex */
    public static final class SimpleBiGenerator<T, S> implements BiFunction<S, Emitter<T>, S> {
        public final BiConsumer<S, Emitter<T>> consumer;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.functions.BiFunction
        public /* bridge */ /* synthetic */ Object apply(Object t1, Object t2) throws Throwable {
            return apply((SimpleBiGenerator<T, S>) t1, (Emitter) t2);
        }

        public SimpleBiGenerator(BiConsumer<S, Emitter<T>> consumer) {
            this.consumer = consumer;
        }

        public S apply(S t1, Emitter<T> t2) throws Throwable {
            this.consumer.accept(t1, t2);
            return t1;
        }
    }

    public static <T, S> BiFunction<S, Emitter<T>, S> simpleBiGenerator(BiConsumer<S, Emitter<T>> consumer) {
        return new SimpleBiGenerator(consumer);
    }

    /* loaded from: classes7.dex */
    public static final class ItemDelayFunction<T, U> implements Function<T, ObservableSource<T>> {
        public final Function<? super T, ? extends ObservableSource<U>> itemDelay;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.functions.Function
        public /* bridge */ /* synthetic */ Object apply(final Object v) throws Throwable {
            return apply((ItemDelayFunction<T, U>) v);
        }

        public ItemDelayFunction(Function<? super T, ? extends ObservableSource<U>> itemDelay) {
            this.itemDelay = itemDelay;
        }

        @Override // io.reactivex.rxjava3.functions.Function
        public ObservableSource<T> apply(final T v) throws Throwable {
            ObservableSource<U> observableSourceApply = this.itemDelay.apply(v);
            Objects.requireNonNull(observableSourceApply, "The itemDelay returned a null ObservableSource");
            return new ObservableTake(observableSourceApply, 1L).map(Functions.justFunction(v)).defaultIfEmpty(v);
        }
    }

    public static <T, U> Function<T, ObservableSource<T>> itemDelay(final Function<? super T, ? extends ObservableSource<U>> itemDelay) {
        return new ItemDelayFunction(itemDelay);
    }

    /* loaded from: classes7.dex */
    public static final class ObserverOnNext<T> implements Consumer<T> {
        public final Observer<T> observer;

        public ObserverOnNext(Observer<T> observer) {
            this.observer = observer;
        }

        @Override // io.reactivex.rxjava3.functions.Consumer
        public void accept(T v) {
            this.observer.onNext(v);
        }
    }

    /* loaded from: classes7.dex */
    public static final class ObserverOnError<T> implements Consumer<Throwable> {
        public final Observer<T> observer;

        public ObserverOnError(Observer<T> observer) {
            this.observer = observer;
        }

        @Override // io.reactivex.rxjava3.functions.Consumer
        public void accept(Throwable v) {
            this.observer.onError(v);
        }
    }

    /* loaded from: classes7.dex */
    public static final class ObserverOnComplete<T> implements Action {
        public final Observer<T> observer;

        public ObserverOnComplete(Observer<T> observer) {
            this.observer = observer;
        }

        @Override // io.reactivex.rxjava3.functions.Action
        public void run() {
            this.observer.onComplete();
        }
    }

    public static <T> Consumer<T> observerOnNext(Observer<T> observer) {
        return new ObserverOnNext(observer);
    }

    public static <T> Consumer<Throwable> observerOnError(Observer<T> observer) {
        return new ObserverOnError(observer);
    }

    public static <T> Action observerOnComplete(Observer<T> observer) {
        return new ObserverOnComplete(observer);
    }

    /* loaded from: classes7.dex */
    public static final class FlatMapWithCombinerInner<U, R, T> implements Function<U, R> {
        public final BiFunction<? super T, ? super U, ? extends R> combiner;

        /* renamed from: t */
        public final T f9748t;

        public FlatMapWithCombinerInner(BiFunction<? super T, ? super U, ? extends R> combiner, T t) {
            this.combiner = combiner;
            this.f9748t = t;
        }

        @Override // io.reactivex.rxjava3.functions.Function
        public R apply(U u) throws Throwable {
            return this.combiner.apply(this.f9748t, u);
        }
    }

    /* loaded from: classes7.dex */
    public static final class FlatMapWithCombinerOuter<T, R, U> implements Function<T, ObservableSource<R>> {
        public final BiFunction<? super T, ? super U, ? extends R> combiner;
        public final Function<? super T, ? extends ObservableSource<? extends U>> mapper;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.functions.Function
        public /* bridge */ /* synthetic */ Object apply(final Object t) throws Throwable {
            return apply((FlatMapWithCombinerOuter<T, R, U>) t);
        }

        public FlatMapWithCombinerOuter(BiFunction<? super T, ? super U, ? extends R> combiner, Function<? super T, ? extends ObservableSource<? extends U>> mapper) {
            this.combiner = combiner;
            this.mapper = mapper;
        }

        @Override // io.reactivex.rxjava3.functions.Function
        public ObservableSource<R> apply(final T t) throws Throwable {
            ObservableSource<? extends U> observableSourceApply = this.mapper.apply(t);
            Objects.requireNonNull(observableSourceApply, "The mapper returned a null ObservableSource");
            return new ObservableMap(observableSourceApply, new FlatMapWithCombinerInner(this.combiner, t));
        }
    }

    public static <T, U, R> Function<T, ObservableSource<R>> flatMapWithCombiner(final Function<? super T, ? extends ObservableSource<? extends U>> mapper, final BiFunction<? super T, ? super U, ? extends R> combiner) {
        return new FlatMapWithCombinerOuter(combiner, mapper);
    }

    /* loaded from: classes7.dex */
    public static final class FlatMapIntoIterable<T, U> implements Function<T, ObservableSource<U>> {
        public final Function<? super T, ? extends Iterable<? extends U>> mapper;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.functions.Function
        public /* bridge */ /* synthetic */ Object apply(Object t) throws Throwable {
            return apply((FlatMapIntoIterable<T, U>) t);
        }

        public FlatMapIntoIterable(Function<? super T, ? extends Iterable<? extends U>> mapper) {
            this.mapper = mapper;
        }

        @Override // io.reactivex.rxjava3.functions.Function
        public ObservableSource<U> apply(T t) throws Throwable {
            Iterable<? extends U> iterableApply = this.mapper.apply(t);
            Objects.requireNonNull(iterableApply, "The mapper returned a null Iterable");
            return new ObservableFromIterable(iterableApply);
        }
    }

    public static <T, U> Function<T, ObservableSource<U>> flatMapIntoIterable(final Function<? super T, ? extends Iterable<? extends U>> mapper) {
        return new FlatMapIntoIterable(mapper);
    }

    /* loaded from: classes7.dex */
    public enum MapToInt implements Function<Object, Object> {
        INSTANCE;

        @Override // io.reactivex.rxjava3.functions.Function
        public Object apply(Object t) {
            return 0;
        }
    }

    public static <T> Supplier<ConnectableObservable<T>> replaySupplier(final Observable<T> parent) {
        return new ReplaySupplier(parent);
    }

    public static <T> Supplier<ConnectableObservable<T>> replaySupplier(final Observable<T> parent, final int bufferSize, boolean eagerTruncate) {
        return new BufferedReplaySupplier(parent, bufferSize, eagerTruncate);
    }

    public static <T> Supplier<ConnectableObservable<T>> replaySupplier(final Observable<T> parent, final int bufferSize, final long time, final TimeUnit unit, final Scheduler scheduler, boolean eagerTruncate) {
        return new BufferedTimedReplaySupplier(parent, bufferSize, time, unit, scheduler, eagerTruncate);
    }

    public static <T> Supplier<ConnectableObservable<T>> replaySupplier(final Observable<T> parent, final long time, final TimeUnit unit, final Scheduler scheduler, boolean eagerTruncate) {
        return new TimedReplayCallable(parent, time, unit, scheduler, eagerTruncate);
    }

    /* loaded from: classes7.dex */
    public static final class ReplaySupplier<T> implements Supplier<ConnectableObservable<T>> {
        public final Observable<T> parent;

        public ReplaySupplier(Observable<T> parent) {
            this.parent = parent;
        }

        @Override // io.reactivex.rxjava3.functions.Supplier
        public ConnectableObservable<T> get() {
            return this.parent.replay();
        }
    }

    /* loaded from: classes7.dex */
    public static final class BufferedReplaySupplier<T> implements Supplier<ConnectableObservable<T>> {
        public final int bufferSize;
        public final boolean eagerTruncate;
        public final Observable<T> parent;

        public BufferedReplaySupplier(Observable<T> parent, int bufferSize, boolean eagerTruncate) {
            this.parent = parent;
            this.bufferSize = bufferSize;
            this.eagerTruncate = eagerTruncate;
        }

        @Override // io.reactivex.rxjava3.functions.Supplier
        public ConnectableObservable<T> get() {
            return this.parent.replay(this.bufferSize, this.eagerTruncate);
        }
    }

    /* loaded from: classes7.dex */
    public static final class BufferedTimedReplaySupplier<T> implements Supplier<ConnectableObservable<T>> {
        public final int bufferSize;
        public final boolean eagerTruncate;
        public final Observable<T> parent;
        public final Scheduler scheduler;
        public final long time;
        public final TimeUnit unit;

        public BufferedTimedReplaySupplier(Observable<T> parent, int bufferSize, long time, TimeUnit unit, Scheduler scheduler, boolean eagerTruncate) {
            this.parent = parent;
            this.bufferSize = bufferSize;
            this.time = time;
            this.unit = unit;
            this.scheduler = scheduler;
            this.eagerTruncate = eagerTruncate;
        }

        @Override // io.reactivex.rxjava3.functions.Supplier
        public ConnectableObservable<T> get() {
            return this.parent.replay(this.bufferSize, this.time, this.unit, this.scheduler, this.eagerTruncate);
        }
    }

    /* loaded from: classes7.dex */
    public static final class TimedReplayCallable<T> implements Supplier<ConnectableObservable<T>> {
        public final boolean eagerTruncate;
        public final Observable<T> parent;
        public final Scheduler scheduler;
        public final long time;
        public final TimeUnit unit;

        public TimedReplayCallable(Observable<T> parent, long time, TimeUnit unit, Scheduler scheduler, boolean eagerTruncate) {
            this.parent = parent;
            this.time = time;
            this.unit = unit;
            this.scheduler = scheduler;
            this.eagerTruncate = eagerTruncate;
        }

        @Override // io.reactivex.rxjava3.functions.Supplier
        public ConnectableObservable<T> get() {
            return this.parent.replay(this.time, this.unit, this.scheduler, this.eagerTruncate);
        }
    }
}
