package io.ktor.utils.p050io.core;

import io.ktor.utils.p050io.bits.Memory;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: BufferAppend.kt */
@Metadata(m7104d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¨\u0006\t"}, m7105d2 = {"writeBufferAppend", "", "Lio/ktor/utils/io/core/Buffer;", "other", "maxSize", "writeBufferAppendUnreserve", "", "writeSize", "writeBufferPrepend", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nBufferAppend.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferAppend.kt\nio/ktor/utils/io/core/BufferAppendKt\n+ 2 Buffer.kt\nio/ktor/utils/io/core/Buffer\n+ 3 Buffer.kt\nio/ktor/utils/io/core/BufferKt\n*L\n1#1,59:1\n69#2:60\n74#2:61\n69#2:76\n74#2:77\n59#2:78\n390#3,5:62\n372#3,7:67\n395#3,2:74\n*S KotlinDebug\n*F\n+ 1 BufferAppend.kt\nio/ktor/utils/io/core/BufferAppendKt\n*L\n10#1:60\n12#1:61\n32#1:76\n49#1:77\n49#1:78\n16#1:62,5\n17#1:67,7\n16#1:74,2\n*E\n"})
/* loaded from: classes8.dex */
public final class BufferAppendKt {
    public static final int writeBufferAppend(@NotNull Buffer buffer, @NotNull Buffer other, int i) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(other.getWritePosition() - other.getReadPosition(), i);
        if (buffer.getLimit() - buffer.getWritePosition() <= iMin) {
            writeBufferAppendUnreserve(buffer, iMin);
        }
        ByteBuffer memory = buffer.getMemory();
        int writePosition = buffer.getWritePosition();
        buffer.getLimit();
        ByteBuffer memory2 = other.getMemory();
        int readPosition = other.getReadPosition();
        other.getWritePosition();
        Memory.m15424copyToJT6ljtQ(memory2, memory, readPosition, iMin, writePosition);
        other.discardExact(iMin);
        buffer.commitWritten(iMin);
        return iMin;
    }

    public static final int writeBufferPrepend(@NotNull Buffer buffer, @NotNull Buffer other) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int writePosition = other.getWritePosition() - other.getReadPosition();
        int readPosition = buffer.getReadPosition();
        if (readPosition < writePosition) {
            throw new IllegalArgumentException("Not enough space in the beginning to prepend bytes");
        }
        int i = readPosition - writePosition;
        Memory.m15424copyToJT6ljtQ(other.getMemory(), buffer.getMemory(), other.getReadPosition(), writePosition, i);
        other.discardExact(writePosition);
        buffer.releaseStartGap$ktor_io(i);
        return writePosition;
    }

    public static final void writeBufferAppendUnreserve(Buffer buffer, int i) {
        if ((buffer.getLimit() - buffer.getWritePosition()) + (buffer.getCapacity() - buffer.getLimit()) < i) {
            throw new IllegalArgumentException("Can't append buffer: not enough free space at the end");
        }
        if ((buffer.getWritePosition() + i) - buffer.getLimit() > 0) {
            buffer.releaseEndGap$ktor_io();
        }
    }
}
