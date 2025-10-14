package ru.rustore.sdk.reactive.backpressure.buffer;

import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.reactive.backpressure.buffer.BufferItemType;

/* compiled from: Buffer.kt */
@Metadata(m7104d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0007J\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007J\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\u0010\u001a\u00020\u0011J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m7105d2 = {"Lru/rustore/sdk/reactive/backpressure/buffer/Buffer;", ExifInterface.GPS_DIRECTION_TRUE, "", "monitor", "(Ljava/lang/Object;)V", "elements", "Lkotlin/collections/ArrayDeque;", "Lru/rustore/sdk/reactive/backpressure/buffer/BufferItemType;", "clear", "", "isEmpty", "", "offer", "value", "popFirstOrNull", "popLastOrNull", "size", "", "toList", "", "sdk-public-reactive_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public final class Buffer<T> {

    @NotNull
    public final ArrayDeque<BufferItemType> elements;

    @NotNull
    public final Object monitor;

    public Buffer() {
        this(null, 1, null);
    }

    public Buffer(@NotNull Object monitor) {
        Intrinsics.checkNotNullParameter(monitor, "monitor");
        this.monitor = monitor;
        this.elements = new ArrayDeque<>();
    }

    public /* synthetic */ Buffer(Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Object() : obj);
    }

    public final boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.monitor) {
            zIsEmpty = this.elements.isEmpty();
        }
        return zIsEmpty;
    }

    public final int size() {
        int size;
        synchronized (this.monitor) {
            size = this.elements.size();
        }
        return size;
    }

    public final void clear() {
        synchronized (this.monitor) {
            this.elements.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Nullable
    public final BufferItemType popLastOrNull() {
        BufferItemType bufferItemTypeRemoveLastOrNull;
        synchronized (this.monitor) {
            try {
                bufferItemTypeRemoveLastOrNull = this.elements.removeLastOrNull();
                if (!(bufferItemTypeRemoveLastOrNull instanceof BufferItemType.Error)) {
                    if (bufferItemTypeRemoveLastOrNull instanceof BufferItemType.Item) {
                        bufferItemTypeRemoveLastOrNull = (BufferItemType.Item) bufferItemTypeRemoveLastOrNull;
                    } else if (!Intrinsics.areEqual(bufferItemTypeRemoveLastOrNull, BufferItemType.Complete.INSTANCE)) {
                        if (bufferItemTypeRemoveLastOrNull != null) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bufferItemTypeRemoveLastOrNull = null;
                    }
                }
            } finally {
            }
        }
        return bufferItemTypeRemoveLastOrNull;
    }

    @Nullable
    public final BufferItemType popFirstOrNull() {
        BufferItemType bufferItemTypeRemoveFirstOrNull;
        synchronized (this.monitor) {
            try {
                bufferItemTypeRemoveFirstOrNull = this.elements.removeFirstOrNull();
                if (!(bufferItemTypeRemoveFirstOrNull instanceof BufferItemType.Error)) {
                    if (bufferItemTypeRemoveFirstOrNull instanceof BufferItemType.Item) {
                        bufferItemTypeRemoveFirstOrNull = (BufferItemType.Item) bufferItemTypeRemoveFirstOrNull;
                    } else if (!Intrinsics.areEqual(bufferItemTypeRemoveFirstOrNull, BufferItemType.Complete.INSTANCE)) {
                        if (bufferItemTypeRemoveFirstOrNull != null) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bufferItemTypeRemoveFirstOrNull = null;
                    }
                }
            } finally {
            }
        }
        return bufferItemTypeRemoveFirstOrNull;
    }

    public final void offer(@NotNull BufferItemType value) {
        Intrinsics.checkNotNullParameter(value, "value");
        synchronized (this.monitor) {
            this.elements.addLast(value);
            Unit unit = Unit.INSTANCE;
        }
    }

    @NotNull
    public final List<BufferItemType> toList() {
        List<BufferItemType> list;
        synchronized (this.monitor) {
            list = CollectionsKt___CollectionsKt.toList(this.elements);
        }
        return list;
    }
}
