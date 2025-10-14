package io.ktor.utils.p050io.streams;

import com.bumptech.glide.load.engine.bitmap_recycle.ByteArrayAdapter;
import io.ktor.utils.p050io.pool.DefaultPool;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ByteArrays.kt */
@Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m7105d2 = {ByteArrayAdapter.TAG, "Lio/ktor/utils/io/pool/DefaultPool;", "", "getByteArrayPool", "()Lio/ktor/utils/io/pool/DefaultPool;", "ByteArrayPoolBufferSize", "", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes5.dex */
public final class ByteArraysKt {

    @NotNull
    public static final DefaultPool<byte[]> ByteArrayPool = new DefaultPool<byte[]>() { // from class: io.ktor.utils.io.streams.ByteArraysKt$ByteArrayPool$1
        @Override // io.ktor.utils.p050io.pool.DefaultPool
        @NotNull
        public final byte[] produceInstance() {
            return new byte[4096];
        }

        @Override // io.ktor.utils.p050io.pool.DefaultPool
        public final void validateInstance(@NotNull byte[] instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            if (instance.length != 4096) {
                throw new IllegalArgumentException(("Unable to recycle buffer of wrong size: " + instance.length + " != 4096").toString());
            }
            super.validateInstance((ByteArraysKt$ByteArrayPool$1) instance);
        }
    };
    public static final int ByteArrayPoolBufferSize = 4096;

    @NotNull
    public static final DefaultPool<byte[]> getByteArrayPool() {
        return ByteArrayPool;
    }
}
