package io.ktor.utils.p050io.core;

import androidx.media3.datasource.cache.CacheFileMetadataIndex;
import io.ktor.utils.p050io.bits.Memory;
import io.ktor.utils.p050io.bits.MemoryJvmKt;
import io.ktor.utils.p050io.core.internal.ChunkBuffer;
import io.ktor.utils.p050io.internal.jvm.ErrorsKt;
import io.ktor.utils.p050io.pool.ObjectPool;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.ivy.osgi.p063p2.P2CompositeParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BufferUtilsJvm.kt */
@Metadata(m7104d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005\u001a\u001c\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0007\u001a1\u0010\u000b\u001a\u00020\u0007*\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\rH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001a$\u0010\u000b\u001a\u00020\u0007*\u00020\u00012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\rH\u0086\bø\u0001\u0000\u001a\u001a\u0010\u000f\u001a\u00020\u000e*\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0007\u001a\u0014\u0010\u0010\u001a\u00020\u000e*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0003H\u0000\u001a;\u0010\u0012\u001a\u00020\u0007*\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\rH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001\u001a,\u0010\u0012\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\rH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, m7105d2 = {"ChunkBuffer", "Lio/ktor/utils/io/core/internal/ChunkBuffer;", "buffer", "Ljava/nio/ByteBuffer;", "pool", "Lio/ktor/utils/io/pool/ObjectPool;", "readAvailable", "", "Lio/ktor/utils/io/core/Buffer;", "dst", CacheFileMetadataIndex.COLUMN_LENGTH, "readDirect", "block", "Lkotlin/Function1;", "", "readFully", "resetFromContentToWrite", P2CompositeParser.ChildHandler.CHILD, "writeDirect", "size", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nBufferUtilsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferUtilsJvm.kt\nio/ktor/utils/io/core/BufferUtilsJvmKt\n+ 2 MemoryFactoryJvm.kt\nio/ktor/utils/io/bits/MemoryFactoryJvmKt\n+ 3 Buffer.kt\nio/ktor/utils/io/core/Buffer\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 BufferPrimitives.kt\nio/ktor/utils/io/core/BufferPrimitivesKt\n+ 6 Buffer.kt\nio/ktor/utils/io/core/BufferKt\n*L\n1#1,123:1\n36#2:124\n74#3:125\n69#3:149\n1#4:126\n762#5,7:127\n769#5,6:139\n777#5:147\n372#6,5:134\n377#6,2:145\n355#6:148\n372#6,7:150\n390#6,7:157\n*S KotlinDebug\n*F\n+ 1 BufferUtilsJvm.kt\nio/ktor/utils/io/core/BufferUtilsJvmKt\n*L\n12#1:124\n44#1:125\n87#1:149\n73#1:127,7\n73#1:139,6\n73#1:147\n73#1:134,5\n73#1:145,2\n86#1:148\n99#1:150,7\n115#1:157,7\n*E\n"})
/* loaded from: classes8.dex */
public final class BufferUtilsJvmKt {
    public static /* synthetic */ ChunkBuffer ChunkBuffer$default(ByteBuffer byteBuffer, ObjectPool objectPool, int i, Object obj) {
        if ((i & 2) != 0) {
            objectPool = null;
        }
        return ChunkBuffer(byteBuffer, objectPool);
    }

    @NotNull
    public static final ChunkBuffer ChunkBuffer(@NotNull ByteBuffer buffer, @Nullable ObjectPool<ChunkBuffer> objectPool) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Memory.Companion companion = Memory.INSTANCE;
        ByteBuffer byteBufferOrder = buffer.slice().order(ByteOrder.BIG_ENDIAN);
        Intrinsics.checkNotNullExpressionValue(byteBufferOrder, "buffer.slice().order(ByteOrder.BIG_ENDIAN)");
        return new ChunkBuffer(Memory.m15423constructorimpl(byteBufferOrder), null, objectPool, 0 == true ? 1 : 0);
    }

    public static final int readDirect(@NotNull ChunkBuffer chunkBuffer, @NotNull Function1<? super ByteBuffer, Unit> block) {
        Intrinsics.checkNotNullParameter(chunkBuffer, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        int readPosition = chunkBuffer.getReadPosition();
        int writePosition = chunkBuffer.getWritePosition();
        ByteBuffer byteBufferDuplicate = chunkBuffer.getMemory().duplicate();
        Intrinsics.checkNotNull(byteBufferDuplicate);
        byteBufferDuplicate.limit(writePosition);
        byteBufferDuplicate.position(readPosition);
        block.invoke(byteBufferDuplicate);
        int iPosition = byteBufferDuplicate.position() - readPosition;
        if (iPosition < 0) {
            ErrorsKt.negativeShiftError(iPosition);
            throw new KotlinNothingValueException();
        }
        if (byteBufferDuplicate.limit() != writePosition) {
            ErrorsKt.limitChangeError();
            throw new KotlinNothingValueException();
        }
        chunkBuffer.discardExact(iPosition);
        return iPosition;
    }

    public static final void resetFromContentToWrite(@NotNull ChunkBuffer chunkBuffer, @NotNull ByteBuffer child) {
        Intrinsics.checkNotNullParameter(chunkBuffer, "<this>");
        Intrinsics.checkNotNullParameter(child, "child");
        chunkBuffer.resetForWrite(child.limit());
        chunkBuffer.commitWrittenUntilIndex(child.position());
    }

    public static /* synthetic */ int readAvailable$default(Buffer buffer, ByteBuffer byteBuffer, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = byteBuffer.remaining();
        }
        return readAvailable(buffer, byteBuffer, i);
    }

    public static /* synthetic */ int writeDirect$default(Buffer buffer, int i, Function1 block, int i2, Object obj) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        ByteBuffer memory = buffer.getMemory();
        int writePosition = buffer.getWritePosition();
        int limit = buffer.getLimit() - writePosition;
        ByteBuffer byteBufferM15433slice87lwejk = Memory.m15433slice87lwejk(memory, writePosition, limit);
        block.invoke(byteBufferM15433slice87lwejk);
        if (byteBufferM15433slice87lwejk.limit() != limit) {
            throw new IllegalStateException("Buffer's limit change is not allowed".toString());
        }
        int iPosition = byteBufferM15433slice87lwejk.position();
        buffer.commitWritten(iPosition);
        return iPosition;
    }

    public static final int writeDirect(@NotNull ChunkBuffer chunkBuffer, int i, @NotNull Function1<? super ByteBuffer, Unit> block) {
        Intrinsics.checkNotNullParameter(chunkBuffer, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        int limit = chunkBuffer.getLimit() - chunkBuffer.getWritePosition();
        if (i > limit) {
            throw new IllegalArgumentException(("size " + i + " is greater than buffer's remaining capacity " + limit).toString());
        }
        ByteBuffer byteBufferDuplicate = chunkBuffer.getMemory().duplicate();
        Intrinsics.checkNotNull(byteBufferDuplicate);
        int writePosition = chunkBuffer.getWritePosition();
        byteBufferDuplicate.limit(chunkBuffer.getLimit());
        byteBufferDuplicate.position(writePosition);
        block.invoke(byteBufferDuplicate);
        int iPosition = byteBufferDuplicate.position() - writePosition;
        if (iPosition < 0 || iPosition > limit) {
            ErrorsKt.wrongBufferPositionChangeError(iPosition, i);
            throw new KotlinNothingValueException();
        }
        chunkBuffer.commitWritten(iPosition);
        return iPosition;
    }

    public static final void readFully(@NotNull Buffer buffer, @NotNull ByteBuffer dst, int i) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        ByteBuffer memory = buffer.getMemory();
        int readPosition = buffer.getReadPosition();
        if (buffer.getWritePosition() - readPosition >= i) {
            int iLimit = dst.limit();
            try {
                dst.limit(dst.position() + i);
                MemoryJvmKt.m15440copyTo62zg_DM(memory, dst, readPosition);
                dst.limit(iLimit);
                Unit unit = Unit.INSTANCE;
                buffer.discardExact(i);
                return;
            } catch (Throwable th) {
                dst.limit(iLimit);
                throw th;
            }
        }
        throw new EOFException("Not enough bytes to read a buffer content of size " + i + '.');
    }

    public static final int readAvailable(@NotNull Buffer buffer, @NotNull ByteBuffer dst, int i) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        if (buffer.getWritePosition() <= buffer.getReadPosition()) {
            return -1;
        }
        int iMin = Math.min(buffer.getWritePosition() - buffer.getReadPosition(), i);
        readFully(buffer, dst, iMin);
        return iMin;
    }

    public static final int readDirect(@NotNull Buffer buffer, @NotNull Function1<? super ByteBuffer, Unit> block) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        ByteBuffer memory = buffer.getMemory();
        int readPosition = buffer.getReadPosition();
        int writePosition = buffer.getWritePosition() - readPosition;
        ByteBuffer byteBufferM15433slice87lwejk = Memory.m15433slice87lwejk(memory, readPosition, writePosition);
        block.invoke(byteBufferM15433slice87lwejk);
        if (byteBufferM15433slice87lwejk.limit() != writePosition) {
            throw new IllegalStateException("Buffer's limit change is not allowed".toString());
        }
        int iPosition = byteBufferM15433slice87lwejk.position();
        buffer.discardExact(iPosition);
        return iPosition;
    }

    public static final int writeDirect(@NotNull Buffer buffer, int i, @NotNull Function1<? super ByteBuffer, Unit> block) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        ByteBuffer memory = buffer.getMemory();
        int writePosition = buffer.getWritePosition();
        int limit = buffer.getLimit() - writePosition;
        ByteBuffer byteBufferM15433slice87lwejk = Memory.m15433slice87lwejk(memory, writePosition, limit);
        block.invoke(byteBufferM15433slice87lwejk);
        if (byteBufferM15433slice87lwejk.limit() != limit) {
            throw new IllegalStateException("Buffer's limit change is not allowed".toString());
        }
        int iPosition = byteBufferM15433slice87lwejk.position();
        buffer.commitWritten(iPosition);
        return iPosition;
    }
}
