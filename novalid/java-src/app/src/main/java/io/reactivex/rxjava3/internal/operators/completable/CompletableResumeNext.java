package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes8.dex */
public final class CompletableResumeNext extends Completable {
    public final Function<? super Throwable, ? extends CompletableSource> errorMapper;
    public final CompletableSource source;

    public CompletableResumeNext(CompletableSource source, Function<? super Throwable, ? extends CompletableSource> errorMapper) {
        this.source = source;
        this.errorMapper = errorMapper;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public void subscribeActual(final CompletableObserver observer) {
        ResumeNextObserver resumeNextObserver = new ResumeNextObserver(observer, this.errorMapper);
        observer.onSubscribe(resumeNextObserver);
        this.source.subscribe(resumeNextObserver);
    }

    /* loaded from: classes6.dex */
    public static final class ResumeNextObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable {
        public static final long serialVersionUID = 5018523762564524046L;
        public final CompletableObserver downstream;
        public final Function<? super Throwable, ? extends CompletableSource> errorMapper;
        public boolean once;

        public ResumeNextObserver(CompletableObserver observer, Function<? super Throwable, ? extends CompletableSource> errorMapper) {
            this.downstream = observer;
            this.errorMapper = errorMapper;
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public void onSubscribe(Disposable d) {
            DisposableHelper.replace(this, d);
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public void onError(Throwable e) {
            if (this.once) {
                this.downstream.onError(e);
                return;
            }
            this.once = true;
            try {
                CompletableSource completableSourceApply = this.errorMapper.apply(e);
                Objects.requireNonNull(completableSourceApply, "The errorMapper returned a null CompletableSource");
                completableSourceApply.subscribe(this);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.downstream.onError(new CompositeException(e, th));
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this);
        }
    }
}
