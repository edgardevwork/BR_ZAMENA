package ru.rustore.sdk.reactive.observable;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.reactive.backpressure.BackpressureStrategy;
import ru.rustore.sdk.reactive.backpressure.processor.BufferEmitProcessor;
import ru.rustore.sdk.reactive.backpressure.processor.BufferEmitProcessorFactoryKt;

/* compiled from: ObservableCreate.kt */
@Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m7105d2 = {"Lru/rustore/sdk/reactive/observable/ObservableCreate;", ExifInterface.GPS_DIRECTION_TRUE, "Lru/rustore/sdk/reactive/observable/Observable;", "backpressureStrategy", "Lru/rustore/sdk/reactive/backpressure/BackpressureStrategy;", "source", "Lkotlin/Function1;", "Lru/rustore/sdk/reactive/observable/ObservableEmitter;", "", "(Lru/rustore/sdk/reactive/backpressure/BackpressureStrategy;Lkotlin/jvm/functions/Function1;)V", "subscribe", "downstream", "Lru/rustore/sdk/reactive/observable/ObservableObserver;", "sdk-public-reactive_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class ObservableCreate<T> extends Observable<T> {

    @NotNull
    public final BackpressureStrategy backpressureStrategy;

    @NotNull
    public final Function1<ObservableEmitter<T>, Unit> source;

    /* JADX WARN: Multi-variable type inference failed */
    public ObservableCreate(@NotNull BackpressureStrategy backpressureStrategy, @NotNull Function1<? super ObservableEmitter<T>, Unit> source) {
        Intrinsics.checkNotNullParameter(backpressureStrategy, "backpressureStrategy");
        Intrinsics.checkNotNullParameter(source, "source");
        this.backpressureStrategy = backpressureStrategy;
        this.source = source;
    }

    @Override // ru.rustore.sdk.reactive.observable.Observable
    public void subscribe(@NotNull ObservableObserver<T> downstream) {
        Intrinsics.checkNotNullParameter(downstream, "downstream");
        BufferEmitProcessor bufferEmitProcessorCreateBufferEmitProcessor$default = BufferEmitProcessorFactoryKt.createBufferEmitProcessor$default(this.backpressureStrategy, downstream, null, 2, null);
        downstream.onSubscribe(bufferEmitProcessorCreateBufferEmitProcessor$default);
        this.source.invoke(new ObservableEmitter<>(bufferEmitProcessorCreateBufferEmitProcessor$default));
    }
}
