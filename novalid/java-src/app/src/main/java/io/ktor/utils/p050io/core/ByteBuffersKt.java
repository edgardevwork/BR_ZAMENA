package io.ktor.utils.p050io.core;

import io.ktor.utils.p050io.bits.Memory;
import io.ktor.utils.p050io.core.internal.ChunkBuffer;
import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.Deprecated;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: ByteBuffers.kt */
@Metadata(m7104d1 = {"\u0000:\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u001d\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004H\u0082\u0010\u001a\u0012\u0010\t\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\n\u001a\u00020\u0007\u001a9\u0010\u000b\u001a\u00020\f*\u00020\u00052\u0006\u0010\r\u001a\u00020\u00042\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u000fH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001\u001a9\u0010\u000b\u001a\u00020\f*\u00020\u00102\u0006\u0010\r\u001a\u00020\u00042\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u000fH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001\u001a\u0012\u0010\u0011\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\n\u001a\u00020\u0007\u001a9\u0010\u0012\u001a\u00020\u0004*\u00020\u00132\u0006\u0010\r\u001a\u00020\u00042\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u000fH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001\u001a9\u0010\u0014\u001a\u00020\f*\u00020\u00132\u0006\u0010\r\u001a\u00020\u00042\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u000fH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0015"}, m7105d2 = {"hasArray", "", "Lio/ktor/utils/io/core/Buffer;", "readAsMuchAsPossible", "", "Lio/ktor/utils/io/core/ByteReadPacket;", "bb", "Ljava/nio/ByteBuffer;", "copied", "readAvailable", "dst", "readDirect", "", "size", "block", "Lkotlin/Function1;", "Lio/ktor/utils/io/core/Input;", "readFully", "writeByteBufferDirect", "Lio/ktor/utils/io/core/BytePacketBuilder;", "writeDirect", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nByteBuffers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteBuffers.kt\nio/ktor/utils/io/core/ByteBuffersKt\n+ 2 Buffer.kt\nio/ktor/utils/io/core/Buffer\n+ 3 Output.kt\nio/ktor/utils/io/core/Output\n+ 4 BufferUtilsJvm.kt\nio/ktor/utils/io/core/BufferUtilsJvmKt\n+ 5 Buffer.kt\nio/ktor/utils/io/core/BufferKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 PacketDirect.kt\nio/ktor/utils/io/core/PacketDirectKt\n*L\n1#1,117:1\n80#1,5:119\n85#1:127\n69#2:118\n371#3,3:124\n374#3,5:145\n371#3,3:150\n374#3:170\n376#3,3:172\n111#4,5:128\n116#4,3:138\n120#4:142\n111#4,5:153\n116#4,3:163\n120#4:167\n95#4,5:183\n100#4,3:193\n104#4:197\n95#4,5:219\n100#4,3:229\n104#4:233\n390#5,5:133\n395#5,2:143\n390#5,5:158\n395#5,2:168\n372#5,5:188\n377#5,2:198\n372#5,5:224\n377#5,2:234\n1#6:141\n1#6:166\n1#6:171\n1#6:196\n1#6:232\n1#6:247\n9#7,8:175\n18#7,11:200\n9#7,8:211\n18#7,11:236\n*S KotlinDebug\n*F\n+ 1 ByteBuffers.kt\nio/ktor/utils/io/core/ByteBuffersKt\n*L\n63#1:119,5\n63#1:127\n31#1:118\n63#1:124,3\n63#1:145,5\n84#1:150,3\n84#1:170\n84#1:172,3\n63#1:128,5\n63#1:138,3\n63#1:142\n85#1:153,5\n85#1:163,3\n85#1:167\n96#1:183,5\n96#1:193,3\n96#1:197\n109#1:219,5\n109#1:229,3\n109#1:233\n63#1:133,5\n63#1:143,2\n85#1:158,5\n85#1:168,2\n96#1:188,5\n96#1:198,2\n109#1:224,5\n109#1:234,2\n63#1:141\n85#1:166\n84#1:171\n96#1:196\n109#1:232\n95#1:175,8\n95#1:200,11\n108#1:211,8\n108#1:236,11\n*E\n"})
/* loaded from: classes8.dex */
public final class ByteBuffersKt {
    public static final int readAvailable(@NotNull ByteReadPacket byteReadPacket, @NotNull ByteBuffer dst) {
        Intrinsics.checkNotNullParameter(byteReadPacket, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        return readAsMuchAsPossible(byteReadPacket, dst, 0);
    }

    public static final int readFully(@NotNull ByteReadPacket byteReadPacket, @NotNull ByteBuffer dst) {
        Intrinsics.checkNotNullParameter(byteReadPacket, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        int asMuchAsPossible = readAsMuchAsPossible(byteReadPacket, dst, 0);
        if (!dst.hasRemaining()) {
            return asMuchAsPossible;
        }
        throw new EOFException("Not enough data in packet to fill buffer: " + dst.remaining() + " more bytes required");
    }

    public static final int readAsMuchAsPossible(ByteReadPacket byteReadPacket, ByteBuffer byteBuffer, int i) throws EOFException {
        ChunkBuffer chunkBufferPrepareRead;
        while (byteBuffer.hasRemaining() && (chunkBufferPrepareRead = byteReadPacket.prepareRead(1)) != null) {
            int iRemaining = byteBuffer.remaining();
            int writePosition = chunkBufferPrepareRead.getWritePosition() - chunkBufferPrepareRead.getReadPosition();
            if (iRemaining >= writePosition) {
                BufferUtilsJvmKt.readFully(chunkBufferPrepareRead, byteBuffer, writePosition);
                byteReadPacket.releaseHead$ktor_io(chunkBufferPrepareRead);
                i += writePosition;
            } else {
                BufferUtilsJvmKt.readFully(chunkBufferPrepareRead, byteBuffer, iRemaining);
                byteReadPacket.setHeadPosition(chunkBufferPrepareRead.getReadPosition());
                return i + iRemaining;
            }
        }
        return i;
    }

    public static final boolean hasArray(@NotNull Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        ByteBuffer memory = buffer.getMemory();
        return memory.hasArray() && !memory.isReadOnly();
    }

    public static final void writeDirect(@NotNull BytePacketBuilder bytePacketBuilder, int i, @NotNull Function1<? super ByteBuffer, Unit> block) {
        Intrinsics.checkNotNullParameter(bytePacketBuilder, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        ChunkBuffer chunkBufferPrepareWriteHead = bytePacketBuilder.prepareWriteHead(i);
        try {
            ByteBuffer memory = chunkBufferPrepareWriteHead.getMemory();
            int writePosition = chunkBufferPrepareWriteHead.getWritePosition();
            int limit = chunkBufferPrepareWriteHead.getLimit() - writePosition;
            ByteBuffer byteBufferM15433slice87lwejk = Memory.m15433slice87lwejk(memory, writePosition, limit);
            block.invoke(byteBufferM15433slice87lwejk);
            if (byteBufferM15433slice87lwejk.limit() != limit) {
                throw new IllegalStateException("Buffer's limit change is not allowed".toString());
            }
            int iPosition = byteBufferM15433slice87lwejk.position();
            chunkBufferPrepareWriteHead.commitWritten(iPosition);
            if (iPosition < 0) {
                throw new IllegalStateException("The returned value shouldn't be negative".toString());
            }
            InlineMarker.finallyStart(1);
            bytePacketBuilder.afterHeadWrite();
            InlineMarker.finallyEnd(1);
        } catch (Throwable th) {
            InlineMarker.finallyStart(1);
            bytePacketBuilder.afterHeadWrite();
            InlineMarker.finallyEnd(1);
            throw th;
        }
    }

    public static final int writeByteBufferDirect(@NotNull BytePacketBuilder bytePacketBuilder, int i, @NotNull Function1<? super ByteBuffer, Unit> block) {
        Intrinsics.checkNotNullParameter(bytePacketBuilder, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        ChunkBuffer chunkBufferPrepareWriteHead = bytePacketBuilder.prepareWriteHead(i);
        try {
            ByteBuffer memory = chunkBufferPrepareWriteHead.getMemory();
            int writePosition = chunkBufferPrepareWriteHead.getWritePosition();
            int limit = chunkBufferPrepareWriteHead.getLimit() - writePosition;
            ByteBuffer byteBufferM15433slice87lwejk = Memory.m15433slice87lwejk(memory, writePosition, limit);
            block.invoke(byteBufferM15433slice87lwejk);
            if (byteBufferM15433slice87lwejk.limit() != limit) {
                throw new IllegalStateException("Buffer's limit change is not allowed".toString());
            }
            int iPosition = byteBufferM15433slice87lwejk.position();
            chunkBufferPrepareWriteHead.commitWritten(iPosition);
            if (iPosition < 0) {
                throw new IllegalStateException("The returned value shouldn't be negative".toString());
            }
            InlineMarker.finallyStart(1);
            bytePacketBuilder.afterHeadWrite();
            InlineMarker.finallyEnd(1);
            return iPosition;
        } catch (Throwable th) {
            InlineMarker.finallyStart(1);
            bytePacketBuilder.afterHeadWrite();
            InlineMarker.finallyEnd(1);
            throw th;
        }
    }

    public static final void readDirect(@NotNull ByteReadPacket byteReadPacket, int i, @NotNull Function1<? super ByteBuffer, Unit> block) throws EOFException {
        Intrinsics.checkNotNullParameter(byteReadPacket, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        ChunkBuffer chunkBufferPrepareRead = byteReadPacket.prepareRead(i);
        if (chunkBufferPrepareRead == null) {
            StringsKt.prematureEndOfStream(i);
            throw new KotlinNothingValueException();
        }
        int readPosition = chunkBufferPrepareRead.getReadPosition();
        try {
            ByteBuffer memory = chunkBufferPrepareRead.getMemory();
            int readPosition2 = chunkBufferPrepareRead.getReadPosition();
            int writePosition = chunkBufferPrepareRead.getWritePosition() - readPosition2;
            ByteBuffer byteBufferM15433slice87lwejk = Memory.m15433slice87lwejk(memory, readPosition2, writePosition);
            block.invoke(byteBufferM15433slice87lwejk);
            if (byteBufferM15433slice87lwejk.limit() != writePosition) {
                throw new IllegalStateException("Buffer's limit change is not allowed".toString());
            }
            chunkBufferPrepareRead.discardExact(byteBufferM15433slice87lwejk.position());
            InlineMarker.finallyStart(1);
            int readPosition3 = chunkBufferPrepareRead.getReadPosition();
            if (readPosition3 < readPosition) {
                throw new IllegalStateException("Buffer's position shouldn't be rewinded");
            }
            if (readPosition3 == chunkBufferPrepareRead.getWritePosition()) {
                byteReadPacket.ensureNext(chunkBufferPrepareRead);
            } else {
                byteReadPacket.setHeadPosition(readPosition3);
            }
            InlineMarker.finallyEnd(1);
        } catch (Throwable th) {
            InlineMarker.finallyStart(1);
            int readPosition4 = chunkBufferPrepareRead.getReadPosition();
            if (readPosition4 < readPosition) {
                throw new IllegalStateException("Buffer's position shouldn't be rewinded");
            }
            if (readPosition4 == chunkBufferPrepareRead.getWritePosition()) {
                byteReadPacket.ensureNext(chunkBufferPrepareRead);
            } else {
                byteReadPacket.setHeadPosition(readPosition4);
            }
            InlineMarker.finallyEnd(1);
            throw th;
        }
    }

    @Deprecated(message = "Use read {} instead.")
    public static final void readDirect(@NotNull Input input, int i, @NotNull Function1<? super ByteBuffer, Unit> block) throws EOFException {
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        ChunkBuffer chunkBufferPrepareRead = input.prepareRead(i);
        if (chunkBufferPrepareRead == null) {
            StringsKt.prematureEndOfStream(i);
            throw new KotlinNothingValueException();
        }
        int readPosition = chunkBufferPrepareRead.getReadPosition();
        try {
            ByteBuffer memory = chunkBufferPrepareRead.getMemory();
            int readPosition2 = chunkBufferPrepareRead.getReadPosition();
            int writePosition = chunkBufferPrepareRead.getWritePosition() - readPosition2;
            ByteBuffer byteBufferM15433slice87lwejk = Memory.m15433slice87lwejk(memory, readPosition2, writePosition);
            block.invoke(byteBufferM15433slice87lwejk);
            if (byteBufferM15433slice87lwejk.limit() != writePosition) {
                throw new IllegalStateException("Buffer's limit change is not allowed".toString());
            }
            chunkBufferPrepareRead.discardExact(byteBufferM15433slice87lwejk.position());
            InlineMarker.finallyStart(1);
            int readPosition3 = chunkBufferPrepareRead.getReadPosition();
            if (readPosition3 < readPosition) {
                throw new IllegalStateException("Buffer's position shouldn't be rewinded");
            }
            if (readPosition3 == chunkBufferPrepareRead.getWritePosition()) {
                input.ensureNext(chunkBufferPrepareRead);
            } else {
                input.setHeadPosition(readPosition3);
            }
            InlineMarker.finallyEnd(1);
        } catch (Throwable th) {
            InlineMarker.finallyStart(1);
            int readPosition4 = chunkBufferPrepareRead.getReadPosition();
            if (readPosition4 < readPosition) {
                throw new IllegalStateException("Buffer's position shouldn't be rewinded");
            }
            if (readPosition4 == chunkBufferPrepareRead.getWritePosition()) {
                input.ensureNext(chunkBufferPrepareRead);
            } else {
                input.setHeadPosition(readPosition4);
            }
            InlineMarker.finallyEnd(1);
            throw th;
        }
    }
}
