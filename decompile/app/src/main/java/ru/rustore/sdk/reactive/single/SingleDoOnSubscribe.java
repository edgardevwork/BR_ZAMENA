package ru.rustore.sdk.reactive.single;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.reactive.core.Disposable;

/* compiled from: SingleDoOnSubscribe.kt */
@Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B'\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m7105d2 = {"Lru/rustore/sdk/reactive/single/SingleDoOnSubscribe;", ExifInterface.GPS_DIRECTION_TRUE, "Lru/rustore/sdk/reactive/single/Single;", "upstream", "onSubscribe", "Lkotlin/Function1;", "Lru/rustore/sdk/reactive/core/Disposable;", "", "(Lru/rustore/sdk/reactive/single/Single;Lkotlin/jvm/functions/Function1;)V", "subscribe", "downstream", "Lru/rustore/sdk/reactive/single/SingleObserver;", "sdk-public-reactive_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes5.dex */
public final class SingleDoOnSubscribe<T> extends Single<T> {

    @NotNull
    public final Function1<Disposable, Unit> onSubscribe;

    @NotNull
    public final Single<T> upstream;

    /* JADX WARN: Multi-variable type inference failed */
    public SingleDoOnSubscribe(@NotNull Single<T> upstream, @NotNull Function1<? super Disposable, Unit> onSubscribe) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        Intrinsics.checkNotNullParameter(onSubscribe, "onSubscribe");
        this.upstream = upstream;
        this.onSubscribe = onSubscribe;
    }

    @Override // ru.rustore.sdk.reactive.single.Single
    public void subscribe(@NotNull final SingleObserver<T> downstream) {
        Intrinsics.checkNotNullParameter(downstream, "downstream");
        this.upstream.subscribe(new SingleObserver<T>(this) { // from class: ru.rustore.sdk.reactive.single.SingleDoOnSubscribe$subscribe$wrappedObserver$1
            public final /* synthetic */ SingleDoOnSubscribe<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // ru.rustore.sdk.reactive.single.SingleObserver
            public void onSubscribe(Disposable d) {
                Object objM15699constructorimpl;
                Intrinsics.checkNotNullParameter(d, "d");
                SingleDoOnSubscribe<T> singleDoOnSubscribe = this.this$0;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    singleDoOnSubscribe.onSubscribe.invoke(d);
                    objM15699constructorimpl = Result.m15699constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM15699constructorimpl = Result.m15699constructorimpl(ResultKt.createFailure(th));
                }
                SingleObserver<T> singleObserver = downstream;
                Throwable thM15702exceptionOrNullimpl = Result.m15702exceptionOrNullimpl(objM15699constructorimpl);
                if (thM15702exceptionOrNullimpl != null) {
                    d.dispose();
                    singleObserver.onSubscribe(d);
                    singleObserver.onError(thM15702exceptionOrNullimpl);
                }
                SingleObserver<T> singleObserver2 = downstream;
                if (Result.m15706isSuccessimpl(objM15699constructorimpl)) {
                    singleObserver2.onSubscribe(d);
                }
            }

            @Override // ru.rustore.sdk.reactive.single.SingleObserver
            public void onError(Throwable e) {
                Intrinsics.checkNotNullParameter(e, "e");
                downstream.onError(e);
            }

            @Override // ru.rustore.sdk.reactive.single.SingleObserver
            public void onSuccess(T item) {
                downstream.onSuccess(item);
            }
        });
    }
}
