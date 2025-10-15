package io.ktor.utils.p050io.internal;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ReadWriteBufferState.kt */
@Metadata(m7104d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u000e\u0010\b\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000¨\u0006\n"}, m7105d2 = {"EmptyByteBuffer", "Ljava/nio/ByteBuffer;", "getEmptyByteBuffer", "()Ljava/nio/ByteBuffer;", "EmptyCapacity", "Lio/ktor/utils/io/internal/RingBufferCapacity;", "getEmptyCapacity", "()Lio/ktor/utils/io/internal/RingBufferCapacity;", "RESERVED_SIZE", "", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes5.dex */
public final class ReadWriteBufferStateKt {

    @NotNull
    public static final ByteBuffer EmptyByteBuffer;

    @NotNull
    public static final RingBufferCapacity EmptyCapacity;
    public static final int RESERVED_SIZE = 8;

    static {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(0);
        Intrinsics.checkNotNullExpressionValue(byteBufferAllocate, "allocate(0)");
        EmptyByteBuffer = byteBufferAllocate;
        EmptyCapacity = new RingBufferCapacity(0);
    }

    @NotNull
    public static final ByteBuffer getEmptyByteBuffer() {
        return EmptyByteBuffer;
    }

    @NotNull
    public static final RingBufferCapacity getEmptyCapacity() {
        return EmptyCapacity;
    }
}
