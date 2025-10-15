package io.reactivex.rxjava3.core;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.disposables.Disposable;

/* loaded from: classes7.dex */
public interface Observer<T> {
    void onComplete();

    void onError(@NonNull Throwable e);

    void onNext(@NonNull T t);

    void onSubscribe(@NonNull Disposable d);
}
