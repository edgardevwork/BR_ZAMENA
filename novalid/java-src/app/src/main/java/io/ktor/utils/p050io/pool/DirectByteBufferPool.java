package io.ktor.utils.p050io.pool;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ByteBufferPools.kt */
@Metadata(m7104d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0014J\b\u0010\u000b\u001a\u00020\u0002H\u0014J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0002H\u0014R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m7105d2 = {"Lio/ktor/utils/io/pool/DirectByteBufferPool;", "Lio/ktor/utils/io/pool/DefaultPool;", "Ljava/nio/ByteBuffer;", "capacity", "", "bufferSize", "(II)V", "getBufferSize", "()I", "clearInstance", "instance", "produceInstance", "validateInstance", "", "ktor-io"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public final class DirectByteBufferPool extends DefaultPool<ByteBuffer> {
    public final int bufferSize;

    /* JADX WARN: Illegal instructions before constructor call */
    public DirectByteBufferPool() {
        int i = 0;
        this(i, i, 3, null);
    }

    public /* synthetic */ DirectByteBufferPool(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 2000 : i, (i3 & 2) != 0 ? 4096 : i2);
    }

    public final int getBufferSize() {
        return this.bufferSize;
    }

    public DirectByteBufferPool(int i, int i2) {
        super(i);
        this.bufferSize = i2;
    }

    @Override // io.ktor.utils.p050io.pool.DefaultPool
    @NotNull
    public ByteBuffer produceInstance() {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(this.bufferSize);
        Intrinsics.checkNotNull(byteBufferAllocateDirect);
        return byteBufferAllocateDirect;
    }

    @Override // io.ktor.utils.p050io.pool.DefaultPool
    @NotNull
    public ByteBuffer clearInstance(@NotNull ByteBuffer instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        instance.clear();
        instance.order(ByteOrder.BIG_ENDIAN);
        return instance;
    }

    @Override // io.ktor.utils.p050io.pool.DefaultPool
    public void validateInstance(@NotNull ByteBuffer instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (instance.capacity() != this.bufferSize) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!instance.isDirect()) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }
}
