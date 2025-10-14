package ru.rustore.sdk.reactive.single;

import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.reactive.core.Disposable;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: SingleDoOnDispose.kt */
@Metadata(m7104d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m7105d2 = {"ru/rustore/sdk/reactive/single/SingleDoOnDispose$subscribe$wrappedObserver$1", "Lru/rustore/sdk/reactive/single/SingleObserver;", "Lru/rustore/sdk/reactive/core/Disposable;", "disposed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "upstreamDisposable", "Ljava/util/concurrent/atomic/AtomicReference;", "dispose", "", "isDisposed", "", "onError", "e", "", "onSubscribe", "d", "onSuccess", "item", "(Ljava/lang/Object;)V", "sdk-public-reactive_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class SingleDoOnDispose$subscribe$wrappedObserver$1<T> implements SingleObserver<T>, Disposable {
    public final /* synthetic */ SingleObserver<T> $downstream;
    public final /* synthetic */ SingleDoOnDispose<T> this$0;
    public final AtomicBoolean disposed = new AtomicBoolean();
    public final AtomicReference<Disposable> upstreamDisposable = new AtomicReference<>(null);

    public SingleDoOnDispose$subscribe$wrappedObserver$1(SingleObserver<T> singleObserver, SingleDoOnDispose<T> singleDoOnDispose) {
        this.$downstream = singleObserver;
        this.this$0 = singleDoOnDispose;
    }

    @Override // ru.rustore.sdk.reactive.single.SingleObserver
    public void onSubscribe(Disposable d) {
        Disposable andSet;
        Intrinsics.checkNotNullParameter(d, "d");
        MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m34m(this.upstreamDisposable, null, d);
        if (getDisposed() && (andSet = this.upstreamDisposable.getAndSet(null)) != null) {
            andSet.dispose();
        }
        this.$downstream.onSubscribe(this);
    }

    @Override // ru.rustore.sdk.reactive.single.SingleObserver
    public void onError(Throwable e) {
        Intrinsics.checkNotNullParameter(e, "e");
        if (this.disposed.compareAndSet(false, true)) {
            this.$downstream.onError(e);
        }
    }

    @Override // ru.rustore.sdk.reactive.single.SingleObserver
    public void onSuccess(T item) {
        if (this.disposed.compareAndSet(false, true)) {
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
        Object objM15699constructorimpl;
        if (this.disposed.compareAndSet(false, true)) {
            SingleDoOnDispose<T> singleDoOnDispose = this.this$0;
            try {
                Result.Companion companion = Result.INSTANCE;
                singleDoOnDispose.onDispose.invoke();
                objM15699constructorimpl = Result.m15699constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM15699constructorimpl = Result.m15699constructorimpl(ResultKt.createFailure(th));
            }
            SingleObserver<T> singleObserver = this.$downstream;
            Throwable thM15702exceptionOrNullimpl = Result.m15702exceptionOrNullimpl(objM15699constructorimpl);
            if (thM15702exceptionOrNullimpl != null) {
                Disposable andSet = this.upstreamDisposable.getAndSet(null);
                if (andSet != null) {
                    andSet.dispose();
                }
                singleObserver.onError(thM15702exceptionOrNullimpl);
            }
            if (Result.m15706isSuccessimpl(objM15699constructorimpl)) {
                Disposable andSet2 = this.upstreamDisposable.getAndSet(null);
                if (andSet2 != null) {
                    andSet2.dispose();
                }
            }
        }
    }
}
