package ru.rustore.sdk.reactive.single;

import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.reactive.core.Dispatcher;
import ru.rustore.sdk.reactive.core.Disposable;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: SingleTimeout.kt */
@Metadata(m7104d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0002J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u0015\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0013R\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m7105d2 = {"ru/rustore/sdk/reactive/single/SingleTimeout$subscribe$wrappedObserver$1", "Lru/rustore/sdk/reactive/single/SingleObserver;", "Lru/rustore/sdk/reactive/core/Disposable;", "delayedTaskDisposable", "Ljava/util/concurrent/atomic/AtomicReference;", "disposed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "upstreamDisposable", "dispose", "", "isDisposed", "", "onError", "e", "", "onSubscribe", "d", "onSuccess", "item", "(Ljava/lang/Object;)V", "sdk-public-reactive_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes5.dex */
public final class SingleTimeout$subscribe$wrappedObserver$1<T> implements SingleObserver<T>, Disposable {
    public final /* synthetic */ SingleObserver<T> $downstream;
    public final /* synthetic */ SingleTimeout<T> this$0;
    public final AtomicBoolean disposed = new AtomicBoolean();
    public final AtomicReference<Disposable> upstreamDisposable = new AtomicReference<>(null);
    public final AtomicReference<Disposable> delayedTaskDisposable = new AtomicReference<>(null);

    public SingleTimeout$subscribe$wrappedObserver$1(SingleTimeout<T> singleTimeout, SingleObserver<T> singleObserver) {
        this.this$0 = singleTimeout;
        this.$downstream = singleObserver;
    }

    @Override // ru.rustore.sdk.reactive.single.SingleObserver
    public void onSubscribe(Disposable d) {
        Intrinsics.checkNotNullParameter(d, "d");
        MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m34m(this.upstreamDisposable, null, d);
        if (!this.disposed.get()) {
            Dispatcher dispatcher = this.this$0.dispatcher;
            long j = this.this$0.delay;
            TimeUnit timeUnit = this.this$0.timeUnit;
            final SingleTimeout<T> singleTimeout = this.this$0;
            Disposable andSet = this.delayedTaskDisposable.getAndSet(dispatcher.executeDelayed(j, timeUnit, new Function0<Unit>() { // from class: ru.rustore.sdk.reactive.single.SingleTimeout$subscribe$wrappedObserver$1$onSubscribe$delayedTask$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    Disposable disposable = (Disposable) this.this$0.upstreamDisposable.getAndSet(null);
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    this.this$0.onError(new TimeoutException("No value after timeout " + singleTimeout.delay + ' ' + singleTimeout.timeUnit));
                }
            }));
            if (andSet != null) {
                andSet.dispose();
            }
        } else {
            Disposable andSet2 = this.upstreamDisposable.getAndSet(null);
            if (andSet2 != null) {
                andSet2.dispose();
            }
            Disposable andSet3 = this.delayedTaskDisposable.getAndSet(null);
            if (andSet3 != null) {
                andSet3.dispose();
            }
        }
        this.$downstream.onSubscribe(this);
    }

    @Override // ru.rustore.sdk.reactive.single.SingleObserver
    public void onError(Throwable e) {
        Intrinsics.checkNotNullParameter(e, "e");
        if (this.disposed.compareAndSet(false, true)) {
            Disposable andSet = this.delayedTaskDisposable.getAndSet(null);
            if (andSet != null) {
                andSet.dispose();
            }
            this.$downstream.onError(e);
        }
    }

    @Override // ru.rustore.sdk.reactive.single.SingleObserver
    public void onSuccess(T item) {
        if (this.disposed.compareAndSet(false, true)) {
            Disposable andSet = this.delayedTaskDisposable.getAndSet(null);
            if (andSet != null) {
                andSet.dispose();
            }
            this.$downstream.onSuccess(item);
        }
    }

    @Override // ru.rustore.sdk.reactive.core.Disposable
    /* renamed from: isDisposed */
    public boolean getDisposed() {
        return this.disposed.get();
    }

    @Override // ru.rustore.sdk.reactive.core.Disposable
    public void dispose() {
        if (this.disposed.compareAndSet(false, true)) {
            Disposable andSet = this.upstreamDisposable.getAndSet(null);
            if (andSet != null) {
                andSet.dispose();
            }
            Disposable andSet2 = this.delayedTaskDisposable.getAndSet(null);
            if (andSet2 != null) {
                andSet2.dispose();
            }
        }
    }
}
