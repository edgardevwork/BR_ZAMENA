package ru.rustore.sdk.reactive.backpressure.processor;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.reactive.backpressure.buffer.Buffer;
import ru.rustore.sdk.reactive.backpressure.buffer.BufferItemType;
import ru.rustore.sdk.reactive.core.Dispatcher;
import ru.rustore.sdk.reactive.observable.ObservableObserver;

/* compiled from: BufferDropLastEmitProcessor.kt */
@Metadata(m7104d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B'\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ$\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016¨\u0006\u0010"}, m7105d2 = {"Lru/rustore/sdk/reactive/backpressure/processor/BufferDropLastEmitProcessor;", ExifInterface.GPS_DIRECTION_TRUE, "Lru/rustore/sdk/reactive/backpressure/processor/BufferEmitProcessor;", "downStream", "Lru/rustore/sdk/reactive/observable/ObservableObserver;", "bufferSize", "", "dispatcher", "Lru/rustore/sdk/reactive/core/Dispatcher;", "(Lru/rustore/sdk/reactive/observable/ObservableObserver;ILru/rustore/sdk/reactive/core/Dispatcher;)V", "onOverflow", "", "buffer", "Lru/rustore/sdk/reactive/backpressure/buffer/Buffer;", "item", "Lru/rustore/sdk/reactive/backpressure/buffer/BufferItemType$Item;", "sdk-public-reactive_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class BufferDropLastEmitProcessor<T> extends BufferEmitProcessor<T> {
    @Override // ru.rustore.sdk.reactive.backpressure.processor.BufferEmitProcessor
    public void onOverflow(@NotNull Buffer<T> buffer, @NotNull BufferItemType.Item<T> item) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(item, "item");
    }

    public /* synthetic */ BufferDropLastEmitProcessor(ObservableObserver observableObserver, int i, Dispatcher dispatcher, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(observableObserver, i, (i2 & 4) != 0 ? null : dispatcher);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferDropLastEmitProcessor(@NotNull ObservableObserver<T> downStream, int i, @Nullable Dispatcher dispatcher) {
        super(downStream, i, dispatcher);
        Intrinsics.checkNotNullParameter(downStream, "downStream");
    }
}
