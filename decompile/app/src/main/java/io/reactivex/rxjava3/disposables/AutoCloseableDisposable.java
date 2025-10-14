package io.reactivex.rxjava3.disposables;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;

/* loaded from: classes6.dex */
public final class AutoCloseableDisposable extends ReferenceDisposable<AutoCloseable> {
    public static final long serialVersionUID = -6646144244598696847L;

    public AutoCloseableDisposable(AutoCloseable value) {
        super(value);
    }

    @Override // io.reactivex.rxjava3.disposables.ReferenceDisposable
    public void onDisposed(@NonNull AutoCloseable value) {
        try {
            value.close();
        } catch (Throwable th) {
            throw ExceptionHelper.wrapOrThrow(th);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        return "AutoCloseableDisposable(disposed=" + isDisposed() + ", " + get() + ")";
    }
}
