package com.google.common.util.concurrent;

import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.util.concurrent.Futures;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotMock;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Closeable;
import java.io.IOException;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
@DoNotMock("Use ClosingFuture.from(Futures.immediate*Future)")
@J2ktIncompatible
/* loaded from: classes5.dex */
public final class ClosingFuture<V> {
    public static final Logger logger = Logger.getLogger(ClosingFuture.class.getName());
    public final CloseableList closeables;
    public final FluentFuture<V> future;
    public final AtomicReference<State> state;

    public interface AsyncClosingCallable<V> {
        ClosingFuture<V> call(DeferredCloser closer) throws Exception;
    }

    public interface AsyncClosingFunction<T, U> {
        ClosingFuture<U> apply(DeferredCloser closer, @ParametricNullness T input) throws Exception;
    }

    public interface ClosingCallable<V> {
        @ParametricNullness
        V call(DeferredCloser closer) throws Exception;
    }

    public interface ClosingFunction<T, U> {
        @ParametricNullness
        U apply(DeferredCloser closer, @ParametricNullness T input) throws Exception;
    }

    public enum State {
        OPEN,
        SUBSUMED,
        WILL_CLOSE,
        CLOSING,
        CLOSED,
        WILL_CREATE_VALUE_AND_CLOSER
    }

    public interface ValueAndCloserConsumer<V> {
        void accept(ValueAndCloser<V> valueAndCloser);
    }

    public static /* synthetic */ FluentFuture access$000(ClosingFuture closingFuture) {
        return closingFuture.future;
    }

    public static final class DeferredCloser {

        @RetainedWith
        public final CloseableList list;

        public DeferredCloser(CloseableList list) {
            this.list = list;
        }

        @CanIgnoreReturnValue
        @ParametricNullness
        public <C extends Closeable> C eventuallyClose(@ParametricNullness C closeable, Executor closingExecutor) {
            Preconditions.checkNotNull(closingExecutor);
            if (closeable != null) {
                this.list.add(closeable, closingExecutor);
            }
            return closeable;
        }
    }

    public static final class ValueAndCloser<V> {
        public final ClosingFuture<? extends V> closingFuture;

        public ValueAndCloser(ClosingFuture<? extends V> closingFuture) {
            this.closingFuture = (ClosingFuture) Preconditions.checkNotNull(closingFuture);
        }

        @ParametricNullness
        public V get() throws ExecutionException {
            return (V) Futures.getDone(this.closingFuture.future);
        }

        public void closeAsync() {
            this.closingFuture.close();
        }
    }

    public static <V> ClosingFuture<V> submit(ClosingCallable<V> callable, Executor executor) {
        return new ClosingFuture<>(callable, executor);
    }

    public static <V> ClosingFuture<V> submitAsync(AsyncClosingCallable<V> callable, Executor executor) {
        return new ClosingFuture<>(callable, executor);
    }

    public static <V> ClosingFuture<V> from(ListenableFuture<V> future) {
        return new ClosingFuture<>(future);
    }

    @Deprecated
    public static <C extends Closeable> ClosingFuture<C> eventuallyClosing(ListenableFuture<C> future, final Executor closingExecutor) {
        Preconditions.checkNotNull(closingExecutor);
        ClosingFuture<C> closingFuture = new ClosingFuture<>(Futures.nonCancellationPropagating(future));
        Futures.addCallback(future, new FutureCallback<Closeable>() { // from class: com.google.common.util.concurrent.ClosingFuture.1
            @Override // com.google.common.util.concurrent.FutureCallback
            public void onFailure(Throwable t) {
            }

            @Override // com.google.common.util.concurrent.FutureCallback
            public void onSuccess(@CheckForNull Closeable result) {
                ClosingFuture.this.closeables.closer.eventuallyClose(result, closingExecutor);
            }
        }, MoreExecutors.directExecutor());
        return closingFuture;
    }

    public static Combiner whenAllComplete(Iterable<? extends ClosingFuture<?>> futures) {
        return new Combiner(false, futures);
    }

    public static Combiner whenAllComplete(ClosingFuture<?> future1, ClosingFuture<?>... moreFutures) {
        return whenAllComplete(Lists.asList(future1, moreFutures));
    }

    public static Combiner whenAllSucceed(Iterable<? extends ClosingFuture<?>> futures) {
        return new Combiner(true, futures);
    }

    public static <V1, V2> Combiner2<V1, V2> whenAllSucceed(ClosingFuture<V1> future1, ClosingFuture<V2> future2) {
        return new Combiner2<>(future2);
    }

    public static <V1, V2, V3> Combiner3<V1, V2, V3> whenAllSucceed(ClosingFuture<V1> future1, ClosingFuture<V2> future2, ClosingFuture<V3> future3) {
        return new Combiner3<>(future2, future3);
    }

    public static <V1, V2, V3, V4> Combiner4<V1, V2, V3, V4> whenAllSucceed(ClosingFuture<V1> future1, ClosingFuture<V2> future2, ClosingFuture<V3> future3, ClosingFuture<V4> future4) {
        return new Combiner4<>(future2, future3, future4);
    }

    public static <V1, V2, V3, V4, V5> Combiner5<V1, V2, V3, V4, V5> whenAllSucceed(ClosingFuture<V1> future1, ClosingFuture<V2> future2, ClosingFuture<V3> future3, ClosingFuture<V4> future4, ClosingFuture<V5> future5) {
        return new Combiner5<>(future2, future3, future4, future5);
    }

    public static Combiner whenAllSucceed(ClosingFuture<?> future1, ClosingFuture<?> future2, ClosingFuture<?> future3, ClosingFuture<?> future4, ClosingFuture<?> future5, ClosingFuture<?> future6, ClosingFuture<?>... moreFutures) {
        return whenAllSucceed(FluentIterable.m1157of(future1, future2, future3, future4, future5, future6).append(moreFutures));
    }

    public ClosingFuture(ListenableFuture<V> future) {
        this.state = new AtomicReference<>(State.OPEN);
        this.closeables = new CloseableList();
        this.future = FluentFuture.from(future);
    }

    public ClosingFuture(final ClosingCallable<V> callable, Executor executor) {
        this.state = new AtomicReference<>(State.OPEN);
        this.closeables = new CloseableList();
        Preconditions.checkNotNull(callable);
        TrustedListenableFutureTask trustedListenableFutureTaskCreate = TrustedListenableFutureTask.create(new Callable<V>() { // from class: com.google.common.util.concurrent.ClosingFuture.2
            @Override // java.util.concurrent.Callable
            @ParametricNullness
            public V call() throws Exception {
                return (V) callable.call(ClosingFuture.this.closeables.closer);
            }

            public String toString() {
                return callable.toString();
            }
        });
        executor.execute(trustedListenableFutureTaskCreate);
        this.future = trustedListenableFutureTaskCreate;
    }

    public ClosingFuture(final AsyncClosingCallable<V> callable, Executor executor) {
        this.state = new AtomicReference<>(State.OPEN);
        this.closeables = new CloseableList();
        Preconditions.checkNotNull(callable);
        TrustedListenableFutureTask trustedListenableFutureTaskCreate = TrustedListenableFutureTask.create(new AsyncCallable<V>() { // from class: com.google.common.util.concurrent.ClosingFuture.3
            @Override // com.google.common.util.concurrent.AsyncCallable
            public ListenableFuture<V> call() throws Exception {
                CloseableList closeableList = new CloseableList();
                try {
                    ClosingFuture<V> closingFutureCall = callable.call(closeableList.closer);
                    closingFutureCall.becomeSubsumedInto(ClosingFuture.this.closeables);
                    return closingFutureCall.future;
                } finally {
                    ClosingFuture.this.closeables.add(closeableList, MoreExecutors.directExecutor());
                }
            }

            public String toString() {
                return callable.toString();
            }
        });
        executor.execute(trustedListenableFutureTaskCreate);
        this.future = trustedListenableFutureTaskCreate;
    }

    public ListenableFuture<?> statusFuture() {
        return Futures.nonCancellationPropagating(this.future.transform(Functions.constant(null), MoreExecutors.directExecutor()));
    }

    public <U> ClosingFuture<U> transform(final ClosingFunction<? super V, U> function, Executor executor) {
        Preconditions.checkNotNull(function);
        return derive(this.future.transformAsync(new AsyncFunction<V, U>() { // from class: com.google.common.util.concurrent.ClosingFuture.4
            @Override // com.google.common.util.concurrent.AsyncFunction
            public ListenableFuture<U> apply(V input) throws Exception {
                return ClosingFuture.this.closeables.applyClosingFunction(function, input);
            }

            public String toString() {
                return function.toString();
            }
        }, executor));
    }

    public <U> ClosingFuture<U> transformAsync(final AsyncClosingFunction<? super V, U> function, Executor executor) {
        Preconditions.checkNotNull(function);
        return derive(this.future.transformAsync(new AsyncFunction<V, U>() { // from class: com.google.common.util.concurrent.ClosingFuture.5
            @Override // com.google.common.util.concurrent.AsyncFunction
            public ListenableFuture<U> apply(V input) throws Exception {
                return ClosingFuture.this.closeables.applyAsyncClosingFunction(function, input);
            }

            public String toString() {
                return function.toString();
            }
        }, executor));
    }

    public static <V, U> AsyncClosingFunction<V, U> withoutCloser(final AsyncFunction<V, U> function) {
        Preconditions.checkNotNull(function);
        return new AsyncClosingFunction<V, U>() { // from class: com.google.common.util.concurrent.ClosingFuture.6
            @Override // com.google.common.util.concurrent.ClosingFuture.AsyncClosingFunction
            public ClosingFuture<U> apply(DeferredCloser closer, V input) throws Exception {
                return ClosingFuture.from(function.apply(input));
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <X extends Throwable> ClosingFuture<V> catching(Class<X> exceptionType, ClosingFunction<? super X, ? extends V> fallback, Executor executor) {
        return catchingMoreGeneric(exceptionType, fallback, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <X extends Throwable, W extends V> ClosingFuture<V> catchingMoreGeneric(Class<X> cls, final ClosingFunction<? super X, W> closingFunction, Executor executor) {
        Preconditions.checkNotNull(closingFunction);
        return (ClosingFuture<V>) derive(this.future.catchingAsync(cls, new AsyncFunction<X, W>() { // from class: com.google.common.util.concurrent.ClosingFuture.7
            /* JADX WARN: Incorrect types in method signature: (TX;)Lcom/google/common/util/concurrent/ListenableFuture<TW;>; */
            @Override // com.google.common.util.concurrent.AsyncFunction
            public ListenableFuture apply(Throwable exception) throws Exception {
                return ClosingFuture.this.closeables.applyClosingFunction(closingFunction, exception);
            }

            public String toString() {
                return closingFunction.toString();
            }
        }, executor));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <X extends Throwable> ClosingFuture<V> catchingAsync(Class<X> exceptionType, AsyncClosingFunction<? super X, ? extends V> fallback, Executor executor) {
        return catchingAsyncMoreGeneric(exceptionType, fallback, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <X extends Throwable, W extends V> ClosingFuture<V> catchingAsyncMoreGeneric(Class<X> cls, final AsyncClosingFunction<? super X, W> asyncClosingFunction, Executor executor) {
        Preconditions.checkNotNull(asyncClosingFunction);
        return (ClosingFuture<V>) derive(this.future.catchingAsync(cls, new AsyncFunction<X, W>() { // from class: com.google.common.util.concurrent.ClosingFuture.8
            /* JADX WARN: Incorrect types in method signature: (TX;)Lcom/google/common/util/concurrent/ListenableFuture<TW;>; */
            @Override // com.google.common.util.concurrent.AsyncFunction
            public ListenableFuture apply(Throwable exception) throws Exception {
                return ClosingFuture.this.closeables.applyAsyncClosingFunction(asyncClosingFunction, exception);
            }

            public String toString() {
                return asyncClosingFunction.toString();
            }
        }, executor));
    }

    public FluentFuture<V> finishToFuture() {
        if (compareAndUpdateState(State.OPEN, State.WILL_CLOSE)) {
            logger.log(Level.FINER, "will close {0}", this);
            this.future.addListener(new Runnable() { // from class: com.google.common.util.concurrent.ClosingFuture.9
                @Override // java.lang.Runnable
                public void run() {
                    ClosingFuture closingFuture = ClosingFuture.this;
                    State state = State.WILL_CLOSE;
                    State state2 = State.CLOSING;
                    closingFuture.checkAndUpdateState(state, state2);
                    ClosingFuture.this.close();
                    ClosingFuture.this.checkAndUpdateState(state2, State.CLOSED);
                }
            }, MoreExecutors.directExecutor());
        } else {
            switch (C756511.$SwitchMap$com$google$common$util$concurrent$ClosingFuture$State[this.state.get().ordinal()]) {
                case 1:
                    throw new IllegalStateException("Cannot call finishToFuture() after deriving another step");
                case 2:
                    throw new IllegalStateException("Cannot call finishToFuture() after calling finishToValueAndCloser()");
                case 3:
                case 4:
                case 5:
                    throw new IllegalStateException("Cannot call finishToFuture() twice");
                case 6:
                    throw new AssertionError();
            }
        }
        return this.future;
    }

    /* renamed from: com.google.common.util.concurrent.ClosingFuture$11 */
    public static /* synthetic */ class C756511 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$common$util$concurrent$ClosingFuture$State;

        static {
            int[] iArr = new int[State.values().length];
            $SwitchMap$com$google$common$util$concurrent$ClosingFuture$State = iArr;
            try {
                iArr[State.SUBSUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$common$util$concurrent$ClosingFuture$State[State.WILL_CREATE_VALUE_AND_CLOSER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$common$util$concurrent$ClosingFuture$State[State.WILL_CLOSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$common$util$concurrent$ClosingFuture$State[State.CLOSING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$common$util$concurrent$ClosingFuture$State[State.CLOSED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$common$util$concurrent$ClosingFuture$State[State.OPEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public void finishToValueAndCloser(final ValueAndCloserConsumer<? super V> consumer, Executor executor) {
        Preconditions.checkNotNull(consumer);
        if (!compareAndUpdateState(State.OPEN, State.WILL_CREATE_VALUE_AND_CLOSER)) {
            int i = C756511.$SwitchMap$com$google$common$util$concurrent$ClosingFuture$State[this.state.get().ordinal()];
            if (i == 1) {
                throw new IllegalStateException("Cannot call finishToValueAndCloser() after deriving another step");
            }
            if (i == 2) {
                throw new IllegalStateException("Cannot call finishToValueAndCloser() twice");
            }
            if (i == 3 || i == 4 || i == 5) {
                throw new IllegalStateException("Cannot call finishToValueAndCloser() after calling finishToFuture()");
            }
            throw new AssertionError(this.state);
        }
        this.future.addListener(new Runnable() { // from class: com.google.common.util.concurrent.ClosingFuture.10
            @Override // java.lang.Runnable
            public void run() {
                ClosingFuture.provideValueAndCloser(consumer, ClosingFuture.this);
            }
        }, executor);
    }

    public static <C, V extends C> void provideValueAndCloser(ValueAndCloserConsumer<C> consumer, ClosingFuture<V> closingFuture) {
        consumer.accept(new ValueAndCloser<>(closingFuture));
    }

    @CanIgnoreReturnValue
    public boolean cancel(boolean mayInterruptIfRunning) {
        logger.log(Level.FINER, "cancelling {0}", this);
        boolean zCancel = this.future.cancel(mayInterruptIfRunning);
        if (zCancel) {
            close();
        }
        return zCancel;
    }

    public final void close() {
        logger.log(Level.FINER, "closing {0}", this);
        this.closeables.close();
    }

    public final <U> ClosingFuture<U> derive(FluentFuture<U> future) {
        ClosingFuture<U> closingFuture = new ClosingFuture<>(future);
        becomeSubsumedInto(closingFuture.closeables);
        return closingFuture;
    }

    public final void becomeSubsumedInto(CloseableList otherCloseables) {
        checkAndUpdateState(State.OPEN, State.SUBSUMED);
        otherCloseables.add(this.closeables, MoreExecutors.directExecutor());
    }

    public static final class Peeker {
        public volatile boolean beingCalled;
        public final ImmutableList<ClosingFuture<?>> futures;

        public Peeker(ImmutableList<ClosingFuture<?>> futures) {
            this.futures = (ImmutableList) Preconditions.checkNotNull(futures);
        }

        @ParametricNullness
        public final <D> D getDone(ClosingFuture<D> closingFuture) throws ExecutionException {
            Preconditions.checkState(this.beingCalled);
            Preconditions.checkArgument(this.futures.contains(closingFuture));
            return (D) Futures.getDone(closingFuture.future);
        }

        @ParametricNullness
        public final <V> V call(Combiner.CombiningCallable<V> combiner, CloseableList closeables) throws Exception {
            this.beingCalled = true;
            CloseableList closeableList = new CloseableList();
            try {
                return combiner.call(closeableList.closer, this);
            } finally {
                closeables.add(closeableList, MoreExecutors.directExecutor());
                this.beingCalled = false;
            }
        }

        public final <V> FluentFuture<V> callAsync(Combiner.AsyncCombiningCallable<V> combiner, CloseableList closeables) throws Exception {
            this.beingCalled = true;
            CloseableList closeableList = new CloseableList();
            try {
                ClosingFuture<V> closingFutureCall = combiner.call(closeableList.closer, this);
                closingFutureCall.becomeSubsumedInto(closeables);
                return closingFutureCall.future;
            } finally {
                closeables.add(closeableList, MoreExecutors.directExecutor());
                this.beingCalled = false;
            }
        }
    }

    @DoNotMock("Use ClosingFuture.whenAllSucceed() or .whenAllComplete() instead.")
    public static class Combiner {
        public final boolean allMustSucceed;
        public final CloseableList closeables;
        public final ImmutableList<ClosingFuture<?>> inputs;

        public interface AsyncCombiningCallable<V> {
            ClosingFuture<V> call(DeferredCloser closer, Peeker peeker) throws Exception;
        }

        public interface CombiningCallable<V> {
            @ParametricNullness
            V call(DeferredCloser closer, Peeker peeker) throws Exception;
        }

        public Combiner(boolean allMustSucceed, Iterable<? extends ClosingFuture<?>> inputs) {
            this.closeables = new CloseableList();
            this.allMustSucceed = allMustSucceed;
            this.inputs = ImmutableList.copyOf(inputs);
            Iterator<? extends ClosingFuture<?>> it = inputs.iterator();
            while (it.hasNext()) {
                it.next().becomeSubsumedInto(this.closeables);
            }
        }

        public <V> ClosingFuture<V> call(final CombiningCallable<V> combiningCallable, Executor executor) {
            ClosingFuture<V> closingFuture = new ClosingFuture<>(futureCombiner().call(new Callable<V>() { // from class: com.google.common.util.concurrent.ClosingFuture.Combiner.1
                @Override // java.util.concurrent.Callable
                @ParametricNullness
                public V call() throws Exception {
                    return (V) new Peeker(Combiner.this.inputs).call(combiningCallable, Combiner.this.closeables);
                }

                public String toString() {
                    return combiningCallable.toString();
                }
            }, executor));
            closingFuture.closeables.add(this.closeables, MoreExecutors.directExecutor());
            return closingFuture;
        }

        public <V> ClosingFuture<V> callAsync(final AsyncCombiningCallable<V> asyncCombiningCallable, Executor executor) {
            ClosingFuture<V> closingFuture = new ClosingFuture<>(futureCombiner().callAsync(new AsyncCallable<V>() { // from class: com.google.common.util.concurrent.ClosingFuture.Combiner.2
                @Override // com.google.common.util.concurrent.AsyncCallable
                public ListenableFuture<V> call() throws Exception {
                    return new Peeker(Combiner.this.inputs).callAsync(asyncCombiningCallable, Combiner.this.closeables);
                }

                public String toString() {
                    return asyncCombiningCallable.toString();
                }
            }, executor));
            closingFuture.closeables.add(this.closeables, MoreExecutors.directExecutor());
            return closingFuture;
        }

        public final Futures.FutureCombiner<Object> futureCombiner() {
            if (this.allMustSucceed) {
                return Futures.whenAllSucceed(inputFutures());
            }
            return Futures.whenAllComplete(inputFutures());
        }

        public final ImmutableList<FluentFuture<?>> inputFutures() {
            return FluentIterable.from(this.inputs).transform(new Function() { // from class: com.google.common.util.concurrent.ClosingFuture$Combiner$$ExternalSyntheticLambda0
                @Override // com.google.common.base.Function
                public final Object apply(Object obj) {
                    return ClosingFuture.access$000((ClosingFuture) obj);
                }
            }).toList();
        }
    }

    /* loaded from: classes7.dex */
    public static final class Combiner2<V1, V2> extends Combiner {
        public final ClosingFuture<V1> future1;
        public final ClosingFuture<V2> future2;

        /* loaded from: classes5.dex */
        public interface AsyncClosingFunction2<V1, V2, U> {
            ClosingFuture<U> apply(DeferredCloser closer, @ParametricNullness V1 value1, @ParametricNullness V2 value2) throws Exception;
        }

        /* loaded from: classes5.dex */
        public interface ClosingFunction2<V1, V2, U> {
            @ParametricNullness
            U apply(DeferredCloser closer, @ParametricNullness V1 value1, @ParametricNullness V2 value2) throws Exception;
        }

        public Combiner2(ClosingFuture<V1> future1, ClosingFuture<V2> future2) {
            super(true, ImmutableList.m1173of((ClosingFuture<V2>) future1, future2));
            this.future1 = future1;
            this.future2 = future2;
        }

        public <U> ClosingFuture<U> call(final ClosingFunction2<V1, V2, U> function, Executor executor) {
            return call(new Combiner.CombiningCallable<U>() { // from class: com.google.common.util.concurrent.ClosingFuture.Combiner2.1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.common.util.concurrent.ClosingFuture.Combiner.CombiningCallable
                @ParametricNullness
                public U call(DeferredCloser deferredCloser, Peeker peeker) throws Exception {
                    return (U) function.apply(deferredCloser, peeker.getDone(Combiner2.this.future1), peeker.getDone(Combiner2.this.future2));
                }

                public String toString() {
                    return function.toString();
                }
            }, executor);
        }

        public <U> ClosingFuture<U> callAsync(final AsyncClosingFunction2<V1, V2, U> function, Executor executor) {
            return callAsync(new Combiner.AsyncCombiningCallable<U>() { // from class: com.google.common.util.concurrent.ClosingFuture.Combiner2.2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.common.util.concurrent.ClosingFuture.Combiner.AsyncCombiningCallable
                public ClosingFuture<U> call(DeferredCloser closer, Peeker peeker) throws Exception {
                    return function.apply(closer, peeker.getDone(Combiner2.this.future1), peeker.getDone(Combiner2.this.future2));
                }

                public String toString() {
                    return function.toString();
                }
            }, executor);
        }
    }

    /* loaded from: classes7.dex */
    public static final class Combiner3<V1, V2, V3> extends Combiner {
        public final ClosingFuture<V1> future1;
        public final ClosingFuture<V2> future2;
        public final ClosingFuture<V3> future3;

        /* loaded from: classes5.dex */
        public interface AsyncClosingFunction3<V1, V2, V3, U> {
            ClosingFuture<U> apply(DeferredCloser closer, @ParametricNullness V1 value1, @ParametricNullness V2 value2, @ParametricNullness V3 value3) throws Exception;
        }

        /* loaded from: classes5.dex */
        public interface ClosingFunction3<V1, V2, V3, U> {
            @ParametricNullness
            U apply(DeferredCloser closer, @ParametricNullness V1 value1, @ParametricNullness V2 value2, @ParametricNullness V3 value3) throws Exception;
        }

        public Combiner3(ClosingFuture<V1> future1, ClosingFuture<V2> future2, ClosingFuture<V3> future3) {
            super(true, ImmutableList.m1174of((ClosingFuture<V3>) future1, (ClosingFuture<V3>) future2, future3));
            this.future1 = future1;
            this.future2 = future2;
            this.future3 = future3;
        }

        public <U> ClosingFuture<U> call(final ClosingFunction3<V1, V2, V3, U> function, Executor executor) {
            return call(new Combiner.CombiningCallable<U>() { // from class: com.google.common.util.concurrent.ClosingFuture.Combiner3.1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.common.util.concurrent.ClosingFuture.Combiner.CombiningCallable
                @ParametricNullness
                public U call(DeferredCloser deferredCloser, Peeker peeker) throws Exception {
                    return (U) function.apply(deferredCloser, peeker.getDone(Combiner3.this.future1), peeker.getDone(Combiner3.this.future2), peeker.getDone(Combiner3.this.future3));
                }

                public String toString() {
                    return function.toString();
                }
            }, executor);
        }

        public <U> ClosingFuture<U> callAsync(final AsyncClosingFunction3<V1, V2, V3, U> function, Executor executor) {
            return callAsync(new Combiner.AsyncCombiningCallable<U>() { // from class: com.google.common.util.concurrent.ClosingFuture.Combiner3.2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.common.util.concurrent.ClosingFuture.Combiner.AsyncCombiningCallable
                public ClosingFuture<U> call(DeferredCloser closer, Peeker peeker) throws Exception {
                    return function.apply(closer, peeker.getDone(Combiner3.this.future1), peeker.getDone(Combiner3.this.future2), peeker.getDone(Combiner3.this.future3));
                }

                public String toString() {
                    return function.toString();
                }
            }, executor);
        }
    }

    /* loaded from: classes7.dex */
    public static final class Combiner4<V1, V2, V3, V4> extends Combiner {
        public final ClosingFuture<V1> future1;
        public final ClosingFuture<V2> future2;
        public final ClosingFuture<V3> future3;
        public final ClosingFuture<V4> future4;

        /* loaded from: classes5.dex */
        public interface AsyncClosingFunction4<V1, V2, V3, V4, U> {
            ClosingFuture<U> apply(DeferredCloser closer, @ParametricNullness V1 value1, @ParametricNullness V2 value2, @ParametricNullness V3 value3, @ParametricNullness V4 value4) throws Exception;
        }

        /* loaded from: classes5.dex */
        public interface ClosingFunction4<V1, V2, V3, V4, U> {
            @ParametricNullness
            U apply(DeferredCloser closer, @ParametricNullness V1 value1, @ParametricNullness V2 value2, @ParametricNullness V3 value3, @ParametricNullness V4 value4) throws Exception;
        }

        public Combiner4(ClosingFuture<V1> future1, ClosingFuture<V2> future2, ClosingFuture<V3> future3, ClosingFuture<V4> future4) {
            super(true, ImmutableList.m1175of((ClosingFuture<V4>) future1, (ClosingFuture<V4>) future2, (ClosingFuture<V4>) future3, future4));
            this.future1 = future1;
            this.future2 = future2;
            this.future3 = future3;
            this.future4 = future4;
        }

        public <U> ClosingFuture<U> call(final ClosingFunction4<V1, V2, V3, V4, U> function, Executor executor) {
            return call(new Combiner.CombiningCallable<U>() { // from class: com.google.common.util.concurrent.ClosingFuture.Combiner4.1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.common.util.concurrent.ClosingFuture.Combiner.CombiningCallable
                @ParametricNullness
                public U call(DeferredCloser deferredCloser, Peeker peeker) throws Exception {
                    return (U) function.apply(deferredCloser, peeker.getDone(Combiner4.this.future1), peeker.getDone(Combiner4.this.future2), peeker.getDone(Combiner4.this.future3), peeker.getDone(Combiner4.this.future4));
                }

                public String toString() {
                    return function.toString();
                }
            }, executor);
        }

        public <U> ClosingFuture<U> callAsync(final AsyncClosingFunction4<V1, V2, V3, V4, U> function, Executor executor) {
            return callAsync(new Combiner.AsyncCombiningCallable<U>() { // from class: com.google.common.util.concurrent.ClosingFuture.Combiner4.2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.common.util.concurrent.ClosingFuture.Combiner.AsyncCombiningCallable
                public ClosingFuture<U> call(DeferredCloser closer, Peeker peeker) throws Exception {
                    return function.apply(closer, peeker.getDone(Combiner4.this.future1), peeker.getDone(Combiner4.this.future2), peeker.getDone(Combiner4.this.future3), peeker.getDone(Combiner4.this.future4));
                }

                public String toString() {
                    return function.toString();
                }
            }, executor);
        }
    }

    /* loaded from: classes7.dex */
    public static final class Combiner5<V1, V2, V3, V4, V5> extends Combiner {
        public final ClosingFuture<V1> future1;
        public final ClosingFuture<V2> future2;
        public final ClosingFuture<V3> future3;
        public final ClosingFuture<V4> future4;
        public final ClosingFuture<V5> future5;

        /* loaded from: classes5.dex */
        public interface AsyncClosingFunction5<V1, V2, V3, V4, V5, U> {
            ClosingFuture<U> apply(DeferredCloser closer, @ParametricNullness V1 value1, @ParametricNullness V2 value2, @ParametricNullness V3 value3, @ParametricNullness V4 value4, @ParametricNullness V5 value5) throws Exception;
        }

        /* loaded from: classes5.dex */
        public interface ClosingFunction5<V1, V2, V3, V4, V5, U> {
            @ParametricNullness
            U apply(DeferredCloser closer, @ParametricNullness V1 value1, @ParametricNullness V2 value2, @ParametricNullness V3 value3, @ParametricNullness V4 value4, @ParametricNullness V5 value5) throws Exception;
        }

        public Combiner5(ClosingFuture<V1> future1, ClosingFuture<V2> future2, ClosingFuture<V3> future3, ClosingFuture<V4> future4, ClosingFuture<V5> future5) {
            super(true, ImmutableList.m1176of((ClosingFuture<V5>) future1, (ClosingFuture<V5>) future2, (ClosingFuture<V5>) future3, (ClosingFuture<V5>) future4, future5));
            this.future1 = future1;
            this.future2 = future2;
            this.future3 = future3;
            this.future4 = future4;
            this.future5 = future5;
        }

        public <U> ClosingFuture<U> call(final ClosingFunction5<V1, V2, V3, V4, V5, U> function, Executor executor) {
            return call(new Combiner.CombiningCallable<U>() { // from class: com.google.common.util.concurrent.ClosingFuture.Combiner5.1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.common.util.concurrent.ClosingFuture.Combiner.CombiningCallable
                @ParametricNullness
                public U call(DeferredCloser deferredCloser, Peeker peeker) throws Exception {
                    return (U) function.apply(deferredCloser, peeker.getDone(Combiner5.this.future1), peeker.getDone(Combiner5.this.future2), peeker.getDone(Combiner5.this.future3), peeker.getDone(Combiner5.this.future4), peeker.getDone(Combiner5.this.future5));
                }

                public String toString() {
                    return function.toString();
                }
            }, executor);
        }

        public <U> ClosingFuture<U> callAsync(final AsyncClosingFunction5<V1, V2, V3, V4, V5, U> function, Executor executor) {
            return callAsync(new Combiner.AsyncCombiningCallable<U>() { // from class: com.google.common.util.concurrent.ClosingFuture.Combiner5.2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.common.util.concurrent.ClosingFuture.Combiner.AsyncCombiningCallable
                public ClosingFuture<U> call(DeferredCloser closer, Peeker peeker) throws Exception {
                    return function.apply(closer, peeker.getDone(Combiner5.this.future1), peeker.getDone(Combiner5.this.future2), peeker.getDone(Combiner5.this.future3), peeker.getDone(Combiner5.this.future4), peeker.getDone(Combiner5.this.future5));
                }

                public String toString() {
                    return function.toString();
                }
            }, executor);
        }
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("state", this.state.get()).addValue(this.future).toString();
    }

    public void finalize() {
        if (this.state.get().equals(State.OPEN)) {
            logger.log(Level.SEVERE, "Uh oh! An open ClosingFuture has leaked and will close: {0}", this);
            finishToFuture();
        }
    }

    public static void closeQuietly(@CheckForNull final Closeable closeable, Executor executor) {
        if (closeable == null) {
            return;
        }
        try {
            executor.execute(new Runnable() { // from class: com.google.common.util.concurrent.ClosingFuture$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() throws IOException {
                    ClosingFuture.lambda$closeQuietly$0(closeable);
                }
            });
        } catch (RejectedExecutionException e) {
            Logger logger2 = logger;
            Level level = Level.WARNING;
            if (logger2.isLoggable(level)) {
                logger2.log(level, String.format("while submitting close to %s; will close inline", executor), (Throwable) e);
            }
            closeQuietly(closeable, MoreExecutors.directExecutor());
        }
    }

    public static /* synthetic */ void lambda$closeQuietly$0(Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (IOException | RuntimeException e) {
            logger.log(Level.WARNING, "thrown by close()", e);
        }
    }

    public final void checkAndUpdateState(State oldState, State newState) {
        Preconditions.checkState(compareAndUpdateState(oldState, newState), "Expected state to be %s, but it was %s", oldState, newState);
    }

    public final boolean compareAndUpdateState(State oldState, State newState) {
        return MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m34m(this.state, oldState, newState);
    }

    public static final class CloseableList extends IdentityHashMap<Closeable, Executor> implements Closeable {
        public volatile boolean closed;
        public final DeferredCloser closer;

        @CheckForNull
        public volatile CountDownLatch whenClosed;

        public CloseableList() {
            this.closer = new DeferredCloser(this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <V, U> ListenableFuture<U> applyClosingFunction(ClosingFunction<? super V, U> transformation, @ParametricNullness V input) throws Exception {
            CloseableList closeableList = new CloseableList();
            try {
                return Futures.immediateFuture(transformation.apply(closeableList.closer, input));
            } finally {
                add(closeableList, MoreExecutors.directExecutor());
            }
        }

        public <V, U> FluentFuture<U> applyAsyncClosingFunction(AsyncClosingFunction<V, U> transformation, @ParametricNullness V input) throws Exception {
            CloseableList closeableList = new CloseableList();
            try {
                ClosingFuture<U> closingFutureApply = transformation.apply(closeableList.closer, input);
                closingFutureApply.becomeSubsumedInto(closeableList);
                return closingFutureApply.future;
            } finally {
                add(closeableList, MoreExecutors.directExecutor());
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.closed) {
                        return;
                    }
                    this.closed = true;
                    for (Map.Entry<Closeable, Executor> entry : entrySet()) {
                        ClosingFuture.closeQuietly(entry.getKey(), entry.getValue());
                    }
                    clear();
                    if (this.whenClosed != null) {
                        this.whenClosed.countDown();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void add(@CheckForNull Closeable closeable, Executor executor) {
            Preconditions.checkNotNull(executor);
            if (closeable == null) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.closed) {
                        ClosingFuture.closeQuietly(closeable, executor);
                    } else {
                        put(closeable, executor);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public CountDownLatch whenClosedCountDown() {
            if (this.closed) {
                return new CountDownLatch(0);
            }
            synchronized (this) {
                try {
                    if (this.closed) {
                        return new CountDownLatch(0);
                    }
                    Preconditions.checkState(this.whenClosed == null);
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    this.whenClosed = countDownLatch;
                    return countDownLatch;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @VisibleForTesting
    public CountDownLatch whenClosedCountDown() {
        return this.closeables.whenClosedCountDown();
    }
}
