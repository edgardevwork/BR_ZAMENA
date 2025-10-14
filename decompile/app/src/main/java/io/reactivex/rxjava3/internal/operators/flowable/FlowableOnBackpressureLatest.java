package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Consumer;
import org.reactivestreams.Subscriber;

/* loaded from: classes7.dex */
public final class FlowableOnBackpressureLatest<T> extends AbstractFlowableWithUpstream<T, T> {
    public final Consumer<? super T> onDropped;

    public FlowableOnBackpressureLatest(Flowable<T> source, Consumer<? super T> onDropped) {
        super(source);
        this.onDropped = onDropped;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> s) {
        this.source.subscribe((FlowableSubscriber) new BackpressureLatestSubscriber(s, this.onDropped));
    }

    public static final class BackpressureLatestSubscriber<T> extends AbstractBackpressureThrottlingSubscriber<T, T> {
        public static final long serialVersionUID = 163080509307634843L;
        public final Consumer<? super T> onDropped;

        public BackpressureLatestSubscriber(Subscriber<? super T> downstream, Consumer<? super T> onDropped) {
            super(downstream);
            this.onDropped = onDropped;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.AbstractBackpressureThrottlingSubscriber, org.reactivestreams.Subscriber
        public void onNext(T t) {
            Object andSet = this.current.getAndSet(t);
            Consumer<? super T> consumer = this.onDropped;
            if (consumer != null && andSet != null) {
                try {
                    consumer.accept(andSet);
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    this.upstream.cancel();
                    this.downstream.onError(th);
                }
            }
            drain();
        }
    }
}
