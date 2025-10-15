package io.ktor.util;

import io.ktor.utils.p050io.core.internal.ChunkBuffer;
import io.ktor.utils.p050io.internal.jvm.ErrorsKt;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: BufferViewJvm.kt */
@Metadata(m7104d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0007"}, m7105d2 = {"read", "", "Ljava/nio/channels/ReadableByteChannel;", "buffer", "Lio/ktor/utils/io/core/internal/ChunkBuffer;", "write", "Ljava/nio/channels/WritableByteChannel;", "ktor-utils"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nBufferViewJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferViewJvm.kt\nio/ktor/util/BufferViewJvmKt\n+ 2 Buffer.kt\nio/ktor/utils/io/core/Buffer\n+ 3 BufferUtilsJvm.kt\nio/ktor/utils/io/core/BufferUtilsJvmKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,43:1\n74#2:44\n74#2:46\n44#3:45\n45#3:47\n46#3,14:49\n21#3,14:63\n1#4:48\n*S KotlinDebug\n*F\n+ 1 BufferViewJvm.kt\nio/ktor/util/BufferViewJvmKt\n*L\n18#1:44\n21#1:46\n21#1:45\n21#1:47\n21#1:49,14\n37#1:63,14\n21#1:48\n*E\n"})
/* loaded from: classes7.dex */
public final class BufferViewJvmKt {
    public static final int read(@NotNull ReadableByteChannel readableByteChannel, @NotNull ChunkBuffer buffer) throws IOException {
        Intrinsics.checkNotNullParameter(readableByteChannel, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (buffer.getLimit() - buffer.getWritePosition() == 0) {
            return 0;
        }
        int limit = buffer.getLimit() - buffer.getWritePosition();
        if (1 > limit) {
            throw new IllegalArgumentException(("size 1 is greater than buffer's remaining capacity " + limit).toString());
        }
        ByteBuffer byteBufferDuplicate = buffer.getMemory().duplicate();
        Intrinsics.checkNotNull(byteBufferDuplicate);
        int writePosition = buffer.getWritePosition();
        byteBufferDuplicate.limit(buffer.getLimit());
        byteBufferDuplicate.position(writePosition);
        int i = readableByteChannel.read(byteBufferDuplicate);
        int iPosition = byteBufferDuplicate.position() - writePosition;
        if (iPosition < 0 || iPosition > limit) {
            ErrorsKt.wrongBufferPositionChangeError(iPosition, 1);
            throw new KotlinNothingValueException();
        }
        buffer.commitWritten(iPosition);
        return i;
    }

    @InternalAPI
    public static final int write(@NotNull WritableByteChannel writableByteChannel, @NotNull ChunkBuffer buffer) throws IOException {
        Intrinsics.checkNotNullParameter(writableByteChannel, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int readPosition = buffer.getReadPosition();
        int writePosition = buffer.getWritePosition();
        ByteBuffer byteBufferDuplicate = buffer.getMemory().duplicate();
        Intrinsics.checkNotNull(byteBufferDuplicate);
        byteBufferDuplicate.limit(writePosition);
        byteBufferDuplicate.position(readPosition);
        int iWrite = writableByteChannel.write(byteBufferDuplicate);
        int iPosition = byteBufferDuplicate.position() - readPosition;
        if (iPosition < 0) {
            ErrorsKt.negativeShiftError(iPosition);
            throw new KotlinNothingValueException();
        }
        if (byteBufferDuplicate.limit() != writePosition) {
            ErrorsKt.limitChangeError();
            throw new KotlinNothingValueException();
        }
        buffer.discardExact(iPosition);
        return iWrite;
    }
}
