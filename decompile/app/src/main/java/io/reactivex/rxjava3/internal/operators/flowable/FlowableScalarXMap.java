package io.reactivex.rxjava3.internal.operators.flowable;

import _COROUTINE.ArtificialStackFrames;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.ScalarSubscription;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* loaded from: classes8.dex */
public final class FlowableScalarXMap {
    public FlowableScalarXMap() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, R> boolean tryScalarXMapSubscribe(Publisher<T> publisher, Subscriber<? super R> subscriber, Function<? super T, ? extends Publisher<? extends R>> function) {
        if (!(publisher instanceof Supplier)) {
            return false;
        }
        try {
            ArtificialStackFrames artificialStackFrames = (Object) ((Supplier) publisher).get();
            if (artificialStackFrames == null) {
                EmptySubscription.complete(subscriber);
                return true;
            }
            try {
                Publisher<? extends R> publisherApply = function.apply(artificialStackFrames);
                Objects.requireNonNull(publisherApply, "The mapper returned a null Publisher");
                Publisher<? extends R> publisher2 = publisherApply;
                if (publisher2 instanceof Supplier) {
                    try {
                        Object obj = ((Supplier) publisher2).get();
                        if (obj == null) {
                            EmptySubscription.complete(subscriber);
                            return true;
                        }
                        subscriber.onSubscribe(new ScalarSubscription(subscriber, obj));
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        EmptySubscription.error(th, subscriber);
                        return true;
                    }
                } else {
                    publisher2.subscribe(subscriber);
                }
                return true;
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                EmptySubscription.error(th2, subscriber);
                return true;
            }
        } catch (Throwable th3) {
            Exceptions.throwIfFatal(th3);
            EmptySubscription.error(th3, subscriber);
            return true;
        }
    }

    public static <T, U> Flowable<U> scalarXMap(final T value, final Function<? super T, ? extends Publisher<? extends U>> mapper) {
        return RxJavaPlugins.onAssembly(new ScalarXMapFlowable(value, mapper));
    }

    /* loaded from: classes7.dex */
    public static final class ScalarXMapFlowable<T, R> extends Flowable<R> {
        public final Function<? super T, ? extends Publisher<? extends R>> mapper;
        public final T value;

        public ScalarXMapFlowable(T value, Function<? super T, ? extends Publisher<? extends R>> mapper) {
            this.value = value;
            this.mapper = mapper;
        }

        @Override // io.reactivex.rxjava3.core.Flowable
        public void subscribeActual(Subscriber<? super R> subscriber) {
            try {
                Publisher<? extends R> publisherApply = this.mapper.apply(this.value);
                Objects.requireNonNull(publisherApply, "The mapper returned a null Publisher");
                Publisher<? extends R> publisher = publisherApply;
                if (publisher instanceof Supplier) {
                    try {
                        Object obj = ((Supplier) publisher).get();
                        if (obj == null) {
                            EmptySubscription.complete(subscriber);
                            return;
                        } else {
                            subscriber.onSubscribe(new ScalarSubscription(subscriber, obj));
                            return;
                        }
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        EmptySubscription.error(th, subscriber);
                        return;
                    }
                }
                publisher.subscribe(subscriber);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                EmptySubscription.error(th2, subscriber);
            }
        }
    }
}
