package ru.rustore.sdk.reactive.observable;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ObservableDoOnDispose.kt */
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B!\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m7105d2 = {"Lru/rustore/sdk/reactive/observable/ObservableDoOnDispose;", ExifInterface.GPS_DIRECTION_TRUE, "Lru/rustore/sdk/reactive/observable/Observable;", "upstream", "onDispose", "Lkotlin/Function0;", "", "(Lru/rustore/sdk/reactive/observable/Observable;Lkotlin/jvm/functions/Function0;)V", "subscribe", "downstream", "Lru/rustore/sdk/reactive/observable/ObservableObserver;", "sdk-public-reactive_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class ObservableDoOnDispose<T> extends Observable<T> {

    @NotNull
    public final Function0<Unit> onDispose;

    @NotNull
    public final Observable<T> upstream;

    public ObservableDoOnDispose(@NotNull Observable<T> upstream, @NotNull Function0<Unit> onDispose) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        Intrinsics.checkNotNullParameter(onDispose, "onDispose");
        this.upstream = upstream;
        this.onDispose = onDispose;
    }

    @Override // ru.rustore.sdk.reactive.observable.Observable
    public void subscribe(@NotNull ObservableObserver<T> downstream) {
        Intrinsics.checkNotNullParameter(downstream, "downstream");
        this.upstream.subscribe(new ObservableDoOnDispose$subscribe$wrappedObserver$1(downstream, this));
    }
}
