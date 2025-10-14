package io.reactivex.rxjava3.internal.operators.mixed;

import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* loaded from: classes5.dex */
public final class FlowableSwitchMapCompletable<T> extends Completable {
    public final boolean delayErrors;
    public final Function<? super T, ? extends CompletableSource> mapper;
    public final Flowable<T> source;

    public FlowableSwitchMapCompletable(Flowable<T> source, Function<? super T, ? extends CompletableSource> mapper, boolean delayErrors) {
        this.source = source;
        this.mapper = mapper;
        this.delayErrors = delayErrors;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public void subscribeActual(CompletableObserver observer) {
        this.source.subscribe((FlowableSubscriber) new SwitchMapCompletableObserver(observer, this.mapper, this.delayErrors));
    }

    public static final class SwitchMapCompletableObserver<T> implements FlowableSubscriber<T>, Disposable {
        public static final SwitchMapInnerObserver INNER_DISPOSED = new SwitchMapInnerObserver(null);
        public final boolean delayErrors;
        public volatile boolean done;
        public final CompletableObserver downstream;
        public final AtomicThrowable errors = new AtomicThrowable();
        public final AtomicReference<SwitchMapInnerObserver> inner = new AtomicReference<>();
        public final Function<? super T, ? extends CompletableSource> mapper;
        public Subscription upstream;

        public SwitchMapCompletableObserver(CompletableObserver downstream, Function<? super T, ? extends CompletableSource> mapper, boolean delayErrors) {
            this.downstream = downstream;
            this.mapper = mapper;
            this.delayErrors = delayErrors;
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription s) {
            if (SubscriptionHelper.validate(this.upstream, s)) {
                this.upstream = s;
                this.downstream.onSubscribe(this);
                s.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            SwitchMapInnerObserver switchMapInnerObserver;
            try {
                CompletableSource completableSourceApply = this.mapper.apply(t);
                Objects.requireNonNull(completableSourceApply, "The mapper returned a null CompletableSource");
                CompletableSource completableSource = completableSourceApply;
                SwitchMapInnerObserver switchMapInnerObserver2 = new SwitchMapInnerObserver(this);
                do {
                    switchMapInnerObserver = this.inner.get();
                    if (switchMapInnerObserver == INNER_DISPOSED) {
                        return;
                    }
                } while (!MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m34m(this.inner, switchMapInnerObserver, switchMapInnerObserver2));
                if (switchMapInnerObserver != null) {
                    switchMapInnerObserver.dispose();
                }
                completableSource.subscribe(switchMapInnerObserver2);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.upstream.cancel();
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable t) {
            if (this.errors.tryAddThrowableOrReport(t)) {
                if (this.delayErrors) {
                    onComplete();
                } else {
                    disposeInner();
                    this.errors.tryTerminateConsumer(this.downstream);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.done = true;
            if (this.inner.get() == null) {
                this.errors.tryTerminateConsumer(this.downstream);
            }
        }

        public void disposeInner() {
            AtomicReference<SwitchMapInnerObserver> atomicReference = this.inner;
            SwitchMapInnerObserver switchMapInnerObserver = INNER_DISPOSED;
            SwitchMapInnerObserver andSet = atomicReference.getAndSet(switchMapInnerObserver);
            if (andSet == null || andSet == switchMapInnerObserver) {
                return;
            }
            andSet.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.upstream.cancel();
            disposeInner();
            this.errors.tryTerminateAndReport();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.inner.get() == INNER_DISPOSED;
        }

        public void innerError(SwitchMapInnerObserver sender, Throwable error) {
            if (MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m34m(this.inner, sender, null)) {
                if (this.errors.tryAddThrowableOrReport(error)) {
                    if (this.delayErrors) {
                        if (this.done) {
                            this.errors.tryTerminateConsumer(this.downstream);
                            return;
                        }
                        return;
                    } else {
                        this.upstream.cancel();
                        disposeInner();
                        this.errors.tryTerminateConsumer(this.downstream);
                        return;
                    }
                }
                return;
            }
            RxJavaPlugins.onError(error);
        }

        public void innerComplete(SwitchMapInnerObserver sender) {
            if (MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m34m(this.inner, sender, null) && this.done) {
                this.errors.tryTerminateConsumer(this.downstream);
            }
        }

        public static final class SwitchMapInnerObserver extends AtomicReference<Disposable> implements CompletableObserver {
            public static final long serialVersionUID = -8003404460084760287L;
            public final SwitchMapCompletableObserver<?> parent;

            public SwitchMapInnerObserver(SwitchMapCompletableObserver<?> parent) {
                this.parent = parent;
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public void onSubscribe(Disposable d) {
                DisposableHelper.setOnce(this, d);
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public void onError(Throwable e) {
                this.parent.innerError(this, e);
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public void onComplete() {
                this.parent.innerComplete(this);
            }

            public void dispose() {
                DisposableHelper.dispose(this);
            }
        }
    }
}
