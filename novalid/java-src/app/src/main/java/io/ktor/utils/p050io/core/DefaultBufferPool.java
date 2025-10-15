package io.ktor.utils.p050io.core;

import io.ktor.utils.p050io.bits.Allocator;
import io.ktor.utils.p050io.bits.DefaultAllocator;
import io.ktor.utils.p050io.core.internal.ChunkBuffer;
import io.ktor.utils.p050io.pool.DefaultPool;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: BufferFactory.kt */
@Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0014J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0002H\u0014J\b\u0010\r\u001a\u00020\u0002H\u0014J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0002H\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m7105d2 = {"Lio/ktor/utils/io/core/DefaultBufferPool;", "Lio/ktor/utils/io/pool/DefaultPool;", "Lio/ktor/utils/io/core/internal/ChunkBuffer;", "bufferSize", "", "capacity", "allocator", "Lio/ktor/utils/io/bits/Allocator;", "(IILio/ktor/utils/io/bits/Allocator;)V", "clearInstance", "instance", "disposeInstance", "", "produceInstance", "validateInstance", "ktor-io"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nBufferFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferFactory.kt\nio/ktor/utils/io/core/DefaultBufferPool\n+ 2 MemoryJvm.kt\nio/ktor/utils/io/bits/Memory\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n15#2:94\n15#2:95\n1#3:96\n*S KotlinDebug\n*F\n+ 1 BufferFactory.kt\nio/ktor/utils/io/core/DefaultBufferPool\n*L\n75#1:94\n76#1:95\n*E\n"})
/* loaded from: classes6.dex */
public final class DefaultBufferPool extends DefaultPool<ChunkBuffer> {

    @NotNull
    public final Allocator allocator;
    public final int bufferSize;

    public DefaultBufferPool() {
        this(0, 0, null, 7, null);
    }

    public /* synthetic */ DefaultBufferPool(int i, int i2, Allocator allocator, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 4096 : i, (i3 & 2) != 0 ? 1000 : i2, (i3 & 4) != 0 ? DefaultAllocator.INSTANCE : allocator);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultBufferPool(int i, int i2, @NotNull Allocator allocator) {
        super(i2);
        Intrinsics.checkNotNullParameter(allocator, "allocator");
        this.bufferSize = i;
        this.allocator = allocator;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.ktor.utils.p050io.pool.DefaultPool
    @NotNull
    public ChunkBuffer produceInstance() {
        return new ChunkBuffer(this.allocator.mo15416allocgFvZug(this.bufferSize), null, this, 0 == true ? 1 : 0);
    }

    @Override // io.ktor.utils.p050io.pool.DefaultPool
    public void disposeInstance(@NotNull ChunkBuffer instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.allocator.mo15418free3GNKZMM(instance.getMemory());
        super.disposeInstance((DefaultBufferPool) instance);
        instance.unlink$ktor_io();
    }

    @Override // io.ktor.utils.p050io.pool.DefaultPool
    public void validateInstance(@NotNull ChunkBuffer instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        super.validateInstance((DefaultBufferPool) instance);
        if (instance.getMemory().limit() != this.bufferSize) {
            StringBuilder sb = new StringBuilder();
            sb.append("Buffer size mismatch. Expected: ");
            sb.append(this.bufferSize);
            sb.append(", actual: ");
            sb.append(instance.getMemory().limit());
            throw new IllegalStateException(sb.toString().toString());
        }
        if (instance == ChunkBuffer.INSTANCE.getEmpty()) {
            throw new IllegalStateException("ChunkBuffer.Empty couldn't be recycled".toString());
        }
        if (instance == Buffer.INSTANCE.getEmpty()) {
            throw new IllegalStateException("Empty instance couldn't be recycled".toString());
        }
        if (instance.getRefCount() != 0) {
            throw new IllegalStateException("Unable to clear buffer: it is still in use.".toString());
        }
        if (instance.getNext() != null) {
            throw new IllegalStateException("Recycled instance shouldn't be a part of a chain.".toString());
        }
        if (instance.getOrigin() != null) {
            throw new IllegalStateException("Recycled instance shouldn't be a view or another buffer.".toString());
        }
    }

    @Override // io.ktor.utils.p050io.pool.DefaultPool
    @NotNull
    public ChunkBuffer clearInstance(@NotNull ChunkBuffer instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        ChunkBuffer chunkBuffer = (ChunkBuffer) super.clearInstance((DefaultBufferPool) instance);
        chunkBuffer.unpark$ktor_io();
        chunkBuffer.reset();
        return chunkBuffer;
    }
}
