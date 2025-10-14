package ru.rustore.sdk.reactive.backpressure;

import kotlin.Metadata;

/* compiled from: BackpressureStrategy.kt */
@Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m7105d2 = {"Lru/rustore/sdk/reactive/backpressure/BackpressureStrategy;", "", "BufferDropLast", "BufferDropOldest", "Lru/rustore/sdk/reactive/backpressure/BackpressureStrategy$BufferDropLast;", "Lru/rustore/sdk/reactive/backpressure/BackpressureStrategy$BufferDropOldest;", "sdk-public-reactive_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public interface BackpressureStrategy {

    /* compiled from: BackpressureStrategy.kt */
    @Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m7105d2 = {"Lru/rustore/sdk/reactive/backpressure/BackpressureStrategy$BufferDropLast;", "Lru/rustore/sdk/reactive/backpressure/BackpressureStrategy;", "bufferSize", "", "(I)V", "getBufferSize", "()I", "sdk-public-reactive_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
    /* loaded from: classes7.dex */
    public static final class BufferDropLast implements BackpressureStrategy {
        public final int bufferSize;

        public BufferDropLast(int i) {
            this.bufferSize = i;
        }

        public final int getBufferSize() {
            return this.bufferSize;
        }
    }

    /* compiled from: BackpressureStrategy.kt */
    @Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m7105d2 = {"Lru/rustore/sdk/reactive/backpressure/BackpressureStrategy$BufferDropOldest;", "Lru/rustore/sdk/reactive/backpressure/BackpressureStrategy;", "bufferSize", "", "(I)V", "getBufferSize", "()I", "sdk-public-reactive_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
    /* loaded from: classes7.dex */
    public static final class BufferDropOldest implements BackpressureStrategy {
        public final int bufferSize;

        public BufferDropOldest(int i) {
            this.bufferSize = i;
        }

        public final int getBufferSize() {
            return this.bufferSize;
        }
    }
}
