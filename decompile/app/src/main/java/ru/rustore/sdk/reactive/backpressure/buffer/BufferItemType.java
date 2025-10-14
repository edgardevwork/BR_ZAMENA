package ru.rustore.sdk.reactive.backpressure.buffer;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: BufferItemType.kt */
@Metadata(m7104d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, m7105d2 = {"Lru/rustore/sdk/reactive/backpressure/buffer/BufferItemType;", "", "()V", "Complete", "Error", "Item", "Lru/rustore/sdk/reactive/backpressure/buffer/BufferItemType$Complete;", "Lru/rustore/sdk/reactive/backpressure/buffer/BufferItemType$Error;", "Lru/rustore/sdk/reactive/backpressure/buffer/BufferItemType$Item;", "sdk-public-reactive_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public abstract class BufferItemType {
    public /* synthetic */ BufferItemType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public BufferItemType() {
    }

    /* compiled from: BufferItemType.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m7105d2 = {"Lru/rustore/sdk/reactive/backpressure/buffer/BufferItemType$Complete;", "Lru/rustore/sdk/reactive/backpressure/buffer/BufferItemType;", "()V", "sdk-public-reactive_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
    /* loaded from: classes7.dex */
    public static final class Complete extends BufferItemType {

        @NotNull
        public static final Complete INSTANCE = new Complete();

        public Complete() {
            super(null);
        }
    }

    /* compiled from: BufferItemType.kt */
    @Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m7105d2 = {"Lru/rustore/sdk/reactive/backpressure/buffer/BufferItemType$Error;", "Lru/rustore/sdk/reactive/backpressure/buffer/BufferItemType;", "e", "", "(Ljava/lang/Throwable;)V", "getE", "()Ljava/lang/Throwable;", "sdk-public-reactive_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
    /* loaded from: classes7.dex */
    public static final class Error extends BufferItemType {

        @NotNull
        public final Throwable e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull Throwable e) {
            super(null);
            Intrinsics.checkNotNullParameter(e, "e");
            this.e = e;
        }

        @NotNull
        public final Throwable getE() {
            return this.e;
        }
    }

    /* compiled from: BufferItemType.kt */
    @Metadata(m7104d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m7105d2 = {"Lru/rustore/sdk/reactive/backpressure/buffer/BufferItemType$Item;", ExifInterface.GPS_DIRECTION_TRUE, "Lru/rustore/sdk/reactive/backpressure/buffer/BufferItemType;", "item", "(Ljava/lang/Object;)V", "getItem", "()Ljava/lang/Object;", "Ljava/lang/Object;", "sdk-public-reactive_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
    /* loaded from: classes7.dex */
    public static final class Item<T> extends BufferItemType {
        public final T item;

        public Item(T t) {
            super(null);
            this.item = t;
        }

        public final T getItem() {
            return this.item;
        }
    }
}
