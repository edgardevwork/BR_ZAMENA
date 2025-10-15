package io.ktor.utils.p050io.core.internal;

import io.ktor.utils.p050io.core.BytePacketBuilder;
import io.ktor.utils.p050io.core.ByteReadPacket;
import io.ktor.utils.p050io.core.Input;
import io.ktor.utils.p050io.core.Output;
import io.ktor.utils.p050io.core.PacketJVMKt;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Unsafe.kt */
@Metadata(m7104d1 = {"\u00006\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u001a\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0001\u001a\u0016\u0010\n\u001a\u0004\u0018\u00010\u0006*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u001a\u001e\u0010\u000b\u001a\u00020\u0006*\u00020\f2\u0006\u0010\r\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000\u001a\u0014\u0010\u000e\u001a\u00020\t*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0000\"\u0010\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m7105d2 = {"EmptyByteArray", "", "completeReadHead", "", "Lio/ktor/utils/io/core/Input;", "current", "Lio/ktor/utils/io/core/internal/ChunkBuffer;", "prepareReadFirstHead", "minSize", "", "prepareReadNextHead", "prepareWriteHead", "Lio/ktor/utils/io/core/Output;", "capacity", "unsafeAppend", "Lio/ktor/utils/io/core/ByteReadPacket;", "builder", "Lio/ktor/utils/io/core/BytePacketBuilder;", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nUnsafe.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Unsafe.kt\nio/ktor/utils/io/core/internal/UnsafeKt\n+ 2 Buffer.kt\nio/ktor/utils/io/core/BufferKt\n+ 3 Buffer.kt\nio/ktor/utils/io/core/Buffer\n*L\n1#1,64:1\n355#2:65\n59#3:66\n*S KotlinDebug\n*F\n+ 1 Unsafe.kt\nio/ktor/utils/io/core/internal/UnsafeKt\n*L\n38#1:65\n39#1:66\n*E\n"})
/* loaded from: classes5.dex */
public final class UnsafeKt {

    @JvmField
    @NotNull
    public static final byte[] EmptyByteArray = new byte[0];

    public static final int unsafeAppend(@NotNull ByteReadPacket byteReadPacket, @NotNull BytePacketBuilder builder) {
        Intrinsics.checkNotNullParameter(byteReadPacket, "<this>");
        Intrinsics.checkNotNullParameter(builder, "builder");
        int size = builder.getSize();
        ChunkBuffer chunkBufferStealAll$ktor_io = builder.stealAll$ktor_io();
        if (chunkBufferStealAll$ktor_io == null) {
            return 0;
        }
        if (size <= PacketJVMKt.getPACKET_MAX_COPY_SIZE() && chunkBufferStealAll$ktor_io.getNext() == null && byteReadPacket.tryWriteAppend$ktor_io(chunkBufferStealAll$ktor_io)) {
            builder.afterBytesStolen$ktor_io();
            return size;
        }
        byteReadPacket.append$ktor_io(chunkBufferStealAll$ktor_io);
        return size;
    }

    @PublishedApi
    @Nullable
    public static final ChunkBuffer prepareReadFirstHead(@NotNull Input input, int i) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        return input.prepareReadHead$ktor_io(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @PublishedApi
    @Nullable
    public static final ChunkBuffer prepareReadNextHead(@NotNull Input input, @NotNull ChunkBuffer current) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(current, "current");
        if (current == input) {
            if (input.canRead()) {
                return (ChunkBuffer) input;
            }
            return null;
        }
        return input.ensureNextHead$ktor_io(current);
    }

    @NotNull
    public static final ChunkBuffer prepareWriteHead(@NotNull Output output, int i, @Nullable ChunkBuffer chunkBuffer) {
        Intrinsics.checkNotNullParameter(output, "<this>");
        if (chunkBuffer != null) {
            output.afterHeadWrite();
        }
        return output.prepareWriteHead(i);
    }

    @PublishedApi
    public static final void completeReadHead(@NotNull Input input, @NotNull ChunkBuffer current) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(current, "current");
        if (current == input) {
            return;
        }
        if (current.getWritePosition() <= current.getReadPosition()) {
            input.ensureNext(current);
        } else if (current.getCapacity() - current.getLimit() < 8) {
            input.fixGapAfterRead$ktor_io(current);
        } else {
            input.setHeadPosition(current.getReadPosition());
        }
    }
}
