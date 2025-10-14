package ru.rustore.sdk.reactive.single;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.reactive.core.SimpleDisposable;

/* compiled from: SingleFrom.kt */
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m7105d2 = {"Lru/rustore/sdk/reactive/single/SingleFrom;", ExifInterface.GPS_DIRECTION_TRUE, "Lru/rustore/sdk/reactive/single/Single;", "source", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "subscribe", "", "downstream", "Lru/rustore/sdk/reactive/single/SingleObserver;", "sdk-public-reactive_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes5.dex */
public final class SingleFrom<T> extends Single<T> {

    @NotNull
    public final Function0<T> source;

    /* JADX WARN: Multi-variable type inference failed */
    public SingleFrom(@NotNull Function0<? extends T> source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.source = source;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.rustore.sdk.reactive.single.Single
    public void subscribe(@NotNull SingleObserver<T> downstream) {
        Object objM15699constructorimpl;
        Intrinsics.checkNotNullParameter(downstream, "downstream");
        SimpleDisposable simpleDisposable = new SimpleDisposable();
        downstream.onSubscribe(simpleDisposable);
        if (simpleDisposable.getDisposed()) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM15699constructorimpl = Result.m15699constructorimpl(this.source.invoke());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM15699constructorimpl = Result.m15699constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m15706isSuccessimpl(objM15699constructorimpl) && !simpleDisposable.getDisposed()) {
            downstream.onSuccess(objM15699constructorimpl);
        }
        Throwable thM15702exceptionOrNullimpl = Result.m15702exceptionOrNullimpl(objM15699constructorimpl);
        if (thM15702exceptionOrNullimpl == null || simpleDisposable.getDisposed()) {
            return;
        }
        downstream.onError(thM15702exceptionOrNullimpl);
    }
}
