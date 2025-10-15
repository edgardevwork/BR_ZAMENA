package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;

/* loaded from: classes6.dex */
public final class CompletableFromUnsafeSource extends Completable {
    public final CompletableSource source;

    public CompletableFromUnsafeSource(CompletableSource source) {
        this.source = source;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public void subscribeActual(CompletableObserver observer) {
        this.source.subscribe(observer);
    }
}
