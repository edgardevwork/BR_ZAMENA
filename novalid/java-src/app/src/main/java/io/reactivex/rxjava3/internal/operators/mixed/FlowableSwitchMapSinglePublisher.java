package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.mixed.FlowableSwitchMapSingle;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* loaded from: classes5.dex */
public final class FlowableSwitchMapSinglePublisher<T, R> extends Flowable<R> {
    public final boolean delayErrors;
    public final Function<? super T, ? extends SingleSource<? extends R>> mapper;
    public final Publisher<T> source;

    public FlowableSwitchMapSinglePublisher(Publisher<T> source, Function<? super T, ? extends SingleSource<? extends R>> mapper, boolean delayErrors) {
        this.source = source;
        this.mapper = mapper;
        this.delayErrors = delayErrors;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super R> s) {
        this.source.subscribe(new FlowableSwitchMapSingle.SwitchMapSingleSubscriber(s, this.mapper, this.delayErrors));
    }
}
