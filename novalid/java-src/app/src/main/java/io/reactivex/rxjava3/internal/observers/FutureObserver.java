package io.reactivex.rxjava3.internal.observers;

import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.BlockingHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class FutureObserver<T> extends CountDownLatch implements Observer<T>, Future<T>, Disposable {
    public Throwable error;
    public final AtomicReference<Disposable> upstream;
    public T value;

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
    }

    public FutureObserver() {
        super(1);
        this.upstream = new AtomicReference<>();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean mayInterruptIfRunning) {
        Disposable disposable;
        DisposableHelper disposableHelper;
        do {
            disposable = this.upstream.get();
            if (disposable == this || disposable == (disposableHelper = DisposableHelper.DISPOSED)) {
                return false;
            }
        } while (!MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m34m(this.upstream, disposable, disposableHelper));
        if (disposable != null) {
            disposable.dispose();
        }
        countDown();
        return true;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return DisposableHelper.isDisposed(this.upstream.get());
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return getCount() == 0;
    }

    @Override // java.util.concurrent.Future
    public T get() throws ExecutionException, InterruptedException {
        if (getCount() != 0) {
            BlockingHelper.verifyNonBlocking();
            await();
        }
        if (isCancelled()) {
            throw new CancellationException();
        }
        Throwable th = this.error;
        if (th != null) {
            throw new ExecutionException(th);
        }
        return this.value;
    }

    @Override // java.util.concurrent.Future
    public T get(long timeout, @NonNull TimeUnit unit) throws ExecutionException, InterruptedException, TimeoutException {
        if (getCount() != 0) {
            BlockingHelper.verifyNonBlocking();
            if (!await(timeout, unit)) {
                throw new TimeoutException(ExceptionHelper.timeoutMessage(timeout, unit));
            }
        }
        if (isCancelled()) {
            throw new CancellationException();
        }
        Throwable th = this.error;
        if (th != null) {
            throw new ExecutionException(th);
        }
        return this.value;
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onSubscribe(Disposable d) {
        DisposableHelper.setOnce(this.upstream, d);
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onNext(T t) {
        if (this.value != null) {
            this.upstream.get().dispose();
            onError(new IndexOutOfBoundsException("More than one element received"));
        } else {
            this.value = t;
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onError(Throwable t) {
        Disposable disposable;
        if (this.error == null && (disposable = this.upstream.get()) != this && disposable != DisposableHelper.DISPOSED && MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m34m(this.upstream, disposable, this)) {
            this.error = t;
            countDown();
        } else {
            RxJavaPlugins.onError(t);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onComplete() {
        if (this.value == null) {
            onError(new NoSuchElementException("The source is empty"));
            return;
        }
        Disposable disposable = this.upstream.get();
        if (disposable == this || disposable == DisposableHelper.DISPOSED || !MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m34m(this.upstream, disposable, this)) {
            return;
        }
        countDown();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return isDone();
    }
}
