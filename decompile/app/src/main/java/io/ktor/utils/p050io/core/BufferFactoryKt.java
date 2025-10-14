package io.ktor.utils.p050io.core;

import io.ktor.utils.p050io.bits.DefaultAllocator;
import io.ktor.utils.p050io.core.internal.ChunkBuffer;
import io.ktor.utils.p050io.pool.ObjectPool;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: BufferFactory.kt */
@Metadata(m7104d1 = {"\u0000&\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a>\u0010\t\u001a\u0002H\n\"\u0004\b\u0000\u0010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002H\n0\u000e¢\u0006\u0002\b\u000fH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a8\u0010\t\u001a\u0002H\n\"\u0004\b\u0000\u0010\n2\u0006\u0010\u0011\u001a\u00020\u00012\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002H\n0\u000e¢\u0006\u0002\b\u000fH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001a>\u0010\u0013\u001a\u0002H\n\"\u0004\b\u0000\u0010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\n0\u000e¢\u0006\u0002\b\u000fH\u0080\bø\u0001\u0000¢\u0006\u0002\u0010\u0010\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\" \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0080\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, m7105d2 = {"DEFAULT_BUFFER_SIZE", "", "DefaultChunkedBufferPool", "Lio/ktor/utils/io/pool/ObjectPool;", "Lio/ktor/utils/io/core/internal/ChunkBuffer;", "getDefaultChunkedBufferPool$annotations", "()V", "getDefaultChunkedBufferPool", "()Lio/ktor/utils/io/pool/ObjectPool;", "withBuffer", "R", "pool", "Lio/ktor/utils/io/core/Buffer;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Lio/ktor/utils/io/pool/ObjectPool;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "size", "(ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "withChunkBuffer", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public final class BufferFactoryKt {
    public static final int DEFAULT_BUFFER_SIZE = 4096;

    @NotNull
    public static final ObjectPool<ChunkBuffer> DefaultChunkedBufferPool = new DefaultBufferPool(0, 0, null, 7, null);

    public static /* synthetic */ void getDefaultChunkedBufferPool$annotations() {
    }

    public static final <R> R withBuffer(int i, @NotNull Function1<? super Buffer, ? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return block.invoke(new Buffer(DefaultAllocator.INSTANCE.mo15416allocgFvZug(i), null));
    }

    public static final <R> R withBuffer(@NotNull ObjectPool<Buffer> pool, @NotNull Function1<? super Buffer, ? extends R> block) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        Intrinsics.checkNotNullParameter(block, "block");
        Buffer bufferBorrow = pool.borrow();
        try {
            return block.invoke(bufferBorrow);
        } finally {
            InlineMarker.finallyStart(1);
            pool.recycle(bufferBorrow);
            InlineMarker.finallyEnd(1);
        }
    }

    public static final <R> R withChunkBuffer(@NotNull ObjectPool<ChunkBuffer> pool, @NotNull Function1<? super ChunkBuffer, ? extends R> block) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        Intrinsics.checkNotNullParameter(block, "block");
        ChunkBuffer chunkBufferBorrow = pool.borrow();
        try {
            return block.invoke(chunkBufferBorrow);
        } finally {
            InlineMarker.finallyStart(1);
            chunkBufferBorrow.release(pool);
            InlineMarker.finallyEnd(1);
        }
    }

    @NotNull
    public static final ObjectPool<ChunkBuffer> getDefaultChunkedBufferPool() {
        return DefaultChunkedBufferPool;
    }
}
