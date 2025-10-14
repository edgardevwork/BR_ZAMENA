package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.operators.QueueDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* loaded from: classes6.dex */
public abstract class BasicFuseableObserver<T, R> implements Observer<T>, QueueDisposable<R> {
    public boolean done;
    public final Observer<? super R> downstream;

    /* renamed from: qd */
    public QueueDisposable<T> f9697qd;
    public int sourceMode;
    public Disposable upstream;

    public void afterDownstream() {
    }

    public boolean beforeDownstream() {
        return true;
    }

    public BasicFuseableObserver(Observer<? super R> downstream) {
        this.downstream = downstream;
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onSubscribe(Disposable d) {
        if (DisposableHelper.validate(this.upstream, d)) {
            this.upstream = d;
            if (d instanceof QueueDisposable) {
                this.f9697qd = (QueueDisposable) d;
            }
            if (beforeDownstream()) {
                this.downstream.onSubscribe(this);
                afterDownstream();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onError(Throwable t) {
        if (this.done) {
            RxJavaPlugins.onError(t);
        } else {
            this.done = true;
            this.downstream.onError(t);
        }
    }

    public final void fail(Throwable t) {
        Exceptions.throwIfFatal(t);
        this.upstream.dispose();
        onError(t);
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        this.downstream.onComplete();
    }

    public final int transitiveBoundaryFusion(int mode) {
        QueueDisposable<T> queueDisposable = this.f9697qd;
        if (queueDisposable == null || (mode & 4) != 0) {
            return 0;
        }
        int iRequestFusion = queueDisposable.requestFusion(mode);
        if (iRequestFusion != 0) {
            this.sourceMode = iRequestFusion;
        }
        return iRequestFusion;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        this.upstream.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return this.upstream.isDisposed();
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public boolean isEmpty() {
        return this.f9697qd.isEmpty();
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public void clear() {
        this.f9697qd.clear();
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean offer(R e) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean offer(R v1, R v2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
