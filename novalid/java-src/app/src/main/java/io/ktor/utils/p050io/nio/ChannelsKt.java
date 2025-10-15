package io.ktor.utils.p050io.nio;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.ktor.utils.p050io.bits.Memory;
import io.ktor.utils.p050io.bits.MemoryJvmKt;
import io.ktor.utils.p050io.core.Buffer;
import io.ktor.utils.p050io.core.BuffersKt;
import io.ktor.utils.p050io.core.BytePacketBuilder;
import io.ktor.utils.p050io.core.ByteReadPacket;
import io.ktor.utils.p050io.core.StringsKt;
import io.ktor.utils.p050io.core.internal.ChunkBuffer;
import io.ktor.utils.p050io.internal.jvm.ErrorsKt;
import io.ktor.utils.p050io.pool.ObjectPool;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import kotlin.Deprecated;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Channels.kt */
@Metadata(m7104d1 = {"\u0000H\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a3\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0007\u001a\u0012\u0010\u000b\u001a\u00020\f*\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e\u001a\u0012\u0010\u000f\u001a\u00020\f*\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e\u001a\u0012\u0010\u0010\u001a\u00020\f*\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e\u001a\u001c\u0010\u0011\u001a\u00020\f*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0002\u001a3\u0010\u0014\u001a\u00020\u0001*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0014\u0010\u0014\u001a\u00020\u0001*\u00020\u00152\u0006\u0010\t\u001a\u00020\nH\u0007\u001a%\u0010\u001a\u001a\u0004\u0018\u00010\f*\u00020\u00152\u0017\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001c¢\u0006\u0002\b\u001f\u001a\u0012\u0010\u001a\u001a\u00020 *\u00020\u00152\u0006\u0010!\u001a\u00020\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\""}, m7105d2 = {"read", "", "Ljava/nio/channels/ReadableByteChannel;", FirebaseAnalytics.Param.DESTINATION, "Lio/ktor/utils/io/bits/Memory;", "destinationOffset", "maxLength", "read-UAd2zVI", "(Ljava/nio/channels/ReadableByteChannel;Ljava/nio/ByteBuffer;II)I", "buffer", "Lio/ktor/utils/io/core/Buffer;", "readPacketAtLeast", "Lio/ktor/utils/io/core/ByteReadPacket;", "n", "", "readPacketAtMost", "readPacketExact", "readPacketImpl", "min", "max", "write", "Ljava/nio/channels/WritableByteChannel;", "source", "sourceOffset", "write-UAd2zVI", "(Ljava/nio/channels/WritableByteChannel;Ljava/nio/ByteBuffer;II)I", "writePacket", "builder", "Lkotlin/Function1;", "Lio/ktor/utils/io/core/BytePacketBuilder;", "", "Lkotlin/ExtensionFunctionType;", "", "p", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.kt\nio/ktor/utils/io/nio/ChannelsKt\n+ 2 Builder.kt\nio/ktor/utils/io/core/BuilderKt\n+ 3 PacketDirect.kt\nio/ktor/utils/io/core/PacketDirectKt\n+ 4 BufferUtilsJvm.kt\nio/ktor/utils/io/core/BufferUtilsJvmKt\n+ 5 Buffer.kt\nio/ktor/utils/io/core/BufferKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 Packet.kt\nio/ktor/utils/io/core/PacketKt\n+ 8 Buffer.kt\nio/ktor/utils/io/core/Buffer\n+ 9 MemoryJvm.kt\nio/ktor/utils/io/bits/Memory\n*L\n1#1,165:1\n12#2,11:166\n8#3,9:177\n18#3,11:203\n95#4,5:186\n100#4,3:196\n104#4:200\n44#4:217\n45#4:219\n46#4,14:221\n372#5,5:191\n377#5,2:201\n390#5,7:236\n372#5,7:244\n1#6:199\n1#6:215\n1#6:220\n39#7:214\n74#8:216\n74#8:218\n74#8:235\n21#9:243\n21#9:251\n*S KotlinDebug\n*F\n+ 1 Channels.kt\nio/ktor/utils/io/nio/ChannelsKt\n*L\n15#1:166,11\n35#1:177,9\n35#1:203,11\n36#1:186,5\n36#1:196,3\n36#1:200\n95#1:217\n95#1:219\n95#1:221,14\n36#1:191,5\n36#1:201,2\n124#1:236,7\n149#1:244,7\n36#1:199\n95#1:220\n41#1:214\n85#1:216\n95#1:218\n122#1:235\n137#1:243\n160#1:251\n*E\n"})
/* loaded from: classes5.dex */
public final class ChannelsKt {
    @NotNull
    public static final ByteReadPacket readPacketExact(@NotNull ReadableByteChannel readableByteChannel, long j) {
        Intrinsics.checkNotNullParameter(readableByteChannel, "<this>");
        return readPacketImpl(readableByteChannel, j, j);
    }

    @NotNull
    public static final ByteReadPacket readPacketAtLeast(@NotNull ReadableByteChannel readableByteChannel, long j) {
        Intrinsics.checkNotNullParameter(readableByteChannel, "<this>");
        return readPacketImpl(readableByteChannel, j, Long.MAX_VALUE);
    }

    @NotNull
    public static final ByteReadPacket readPacketAtMost(@NotNull ReadableByteChannel readableByteChannel, long j) {
        Intrinsics.checkNotNullParameter(readableByteChannel, "<this>");
        return readPacketImpl(readableByteChannel, 1L, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        return new io.ktor.utils.p050io.core.ByteReadPacket(r9, r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ByteReadPacket readPacketImpl(ReadableByteChannel readableByteChannel, long j, long j2) {
        int iPosition;
        long j3 = 0;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException(("min shouldn't be negative: " + j).toString());
        }
        if (j > j2) {
            throw new IllegalArgumentException(("min shouldn't be greater than max: " + j + " > " + j2).toString());
        }
        if (j2 == 0) {
            return ByteReadPacket.INSTANCE.getEmpty();
        }
        ChunkBuffer.Companion companion = ChunkBuffer.INSTANCE;
        ObjectPool<ChunkBuffer> pool = companion.getPool();
        ChunkBuffer empty = companion.getEmpty();
        ChunkBuffer chunkBuffer = empty;
        ChunkBuffer chunkBuffer2 = chunkBuffer;
        while (true) {
            if (j3 >= j && (j3 != j || i != 0)) {
                break;
            }
            try {
                int iCoerceAtMost = (int) RangesKt___RangesKt.coerceAtMost(j2 - j3, ParserMinimalBase.MAX_INT_L);
                int limit = chunkBuffer2.getLimit() - chunkBuffer2.getWritePosition();
                ChunkBuffer chunkBuffer3 = (limit > 200 || limit >= iCoerceAtMost) ? chunkBuffer2 : null;
                if (chunkBuffer3 == null) {
                    ChunkBuffer chunkBufferBorrow = pool.borrow();
                    ChunkBuffer chunkBuffer4 = chunkBufferBorrow;
                    if (chunkBuffer == empty) {
                        chunkBuffer = chunkBuffer4;
                        chunkBuffer2 = chunkBuffer;
                    }
                    chunkBuffer3 = chunkBufferBorrow;
                }
                if (chunkBuffer2 != chunkBuffer3) {
                    chunkBuffer2.setNext(chunkBuffer3);
                    chunkBuffer2 = chunkBuffer3;
                }
                int limit2 = chunkBuffer3.getLimit() - chunkBuffer3.getWritePosition();
                if (1 > limit2) {
                    throw new IllegalArgumentException(("size 1 is greater than buffer's remaining capacity " + limit2).toString());
                }
                ByteBuffer byteBufferDuplicate = chunkBuffer3.getMemory().duplicate();
                Intrinsics.checkNotNull(byteBufferDuplicate);
                int writePosition = chunkBuffer3.getWritePosition();
                int i2 = i;
                byteBufferDuplicate.limit(chunkBuffer3.getLimit());
                byteBufferDuplicate.position(writePosition);
                int iLimit = byteBufferDuplicate.limit();
                ChunkBuffer chunkBuffer5 = empty;
                if (byteBufferDuplicate.remaining() > iCoerceAtMost) {
                    byteBufferDuplicate.limit(byteBufferDuplicate.position() + iCoerceAtMost);
                }
                int i3 = readableByteChannel.read(byteBufferDuplicate);
                if (i3 == -1) {
                    throw new EOFException("Premature end of stream: was read " + j3 + " bytes of " + j);
                }
                byteBufferDuplicate.limit(iLimit);
                j3 += i3;
                iPosition = byteBufferDuplicate.position() - writePosition;
                if (iPosition < 0 || iPosition > limit2) {
                    break;
                }
                chunkBuffer3.commitWritten(iPosition);
                i = i2;
                empty = chunkBuffer5;
            } catch (Throwable th) {
                BuffersKt.releaseAll(chunkBuffer, pool);
                throw th;
            }
        }
        ErrorsKt.wrongBufferPositionChangeError(iPosition, 1);
        throw new KotlinNothingValueException();
    }

    /* renamed from: read-UAd2zVI, reason: not valid java name */
    public static final int m15690readUAd2zVI(@NotNull ReadableByteChannel read, @NotNull ByteBuffer destination, int i, int i2) {
        Intrinsics.checkNotNullParameter(read, "$this$read");
        Intrinsics.checkNotNullParameter(destination, "destination");
        return read.read(MemoryJvmKt.sliceSafe(destination, i, i2));
    }

    /* renamed from: write-UAd2zVI, reason: not valid java name */
    public static final int m15692writeUAd2zVI(@NotNull WritableByteChannel write, @NotNull ByteBuffer source, int i, int i2) {
        Intrinsics.checkNotNullParameter(write, "$this$write");
        Intrinsics.checkNotNullParameter(source, "source");
        return write.write(MemoryJvmKt.sliceSafe(source, i, i2));
    }

    @Nullable
    public static final ByteReadPacket writePacket(@NotNull WritableByteChannel writableByteChannel, @NotNull Function1<? super BytePacketBuilder, Unit> builder) {
        Intrinsics.checkNotNullParameter(writableByteChannel, "<this>");
        Intrinsics.checkNotNullParameter(builder, "builder");
        BytePacketBuilder bytePacketBuilder = new BytePacketBuilder(null, 1, null);
        try {
            builder.invoke(bytePacketBuilder);
            ByteReadPacket byteReadPacketBuild = bytePacketBuilder.build();
            try {
                if (writePacket(writableByteChannel, byteReadPacketBuild)) {
                    return null;
                }
                return byteReadPacketBuild;
            } catch (Throwable th) {
                byteReadPacketBuild.release();
                throw th;
            }
        } catch (Throwable th2) {
            bytePacketBuilder.release();
            throw th2;
        }
    }

    public static final boolean writePacket(@NotNull WritableByteChannel writableByteChannel, @NotNull ByteReadPacket p) {
        int iWrite;
        Intrinsics.checkNotNullParameter(writableByteChannel, "<this>");
        Intrinsics.checkNotNullParameter(p, "p");
        do {
            try {
                ChunkBuffer chunkBufferPrepareRead = p.prepareRead(1);
                if (chunkBufferPrepareRead == null) {
                    StringsKt.prematureEndOfStream(1);
                    throw new KotlinNothingValueException();
                }
                int readPosition = chunkBufferPrepareRead.getReadPosition();
                try {
                    ByteBuffer memory = chunkBufferPrepareRead.getMemory();
                    int readPosition2 = chunkBufferPrepareRead.getReadPosition();
                    int writePosition = chunkBufferPrepareRead.getWritePosition() - readPosition2;
                    ByteBuffer byteBufferM15433slice87lwejk = Memory.m15433slice87lwejk(memory, readPosition2, writePosition);
                    iWrite = writableByteChannel.write(byteBufferM15433slice87lwejk);
                    if (byteBufferM15433slice87lwejk.limit() != writePosition) {
                        throw new IllegalStateException("Buffer's limit change is not allowed".toString());
                    }
                    chunkBufferPrepareRead.discardExact(byteBufferM15433slice87lwejk.position());
                    int readPosition3 = chunkBufferPrepareRead.getReadPosition();
                    if (readPosition3 < readPosition) {
                        throw new IllegalStateException("Buffer's position shouldn't be rewinded");
                    }
                    if (readPosition3 == chunkBufferPrepareRead.getWritePosition()) {
                        p.ensureNext(chunkBufferPrepareRead);
                    } else {
                        p.setHeadPosition(readPosition3);
                    }
                    if (p.getEndOfInput()) {
                        return true;
                    }
                } catch (Throwable th) {
                    int readPosition4 = chunkBufferPrepareRead.getReadPosition();
                    if (readPosition4 < readPosition) {
                        throw new IllegalStateException("Buffer's position shouldn't be rewinded");
                    }
                    if (readPosition4 == chunkBufferPrepareRead.getWritePosition()) {
                        p.ensureNext(chunkBufferPrepareRead);
                    } else {
                        p.setHeadPosition(readPosition4);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                p.release();
                throw th2;
            }
        } while (iWrite != 0);
        return false;
    }

    @Deprecated(message = "Use read(Memory) instead.")
    public static final int read(@NotNull ReadableByteChannel readableByteChannel, @NotNull Buffer buffer) throws IOException {
        Intrinsics.checkNotNullParameter(readableByteChannel, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (buffer.getLimit() - buffer.getWritePosition() == 0) {
            return 0;
        }
        ByteBuffer memory = buffer.getMemory();
        int writePosition = buffer.getWritePosition();
        int i = readableByteChannel.read(MemoryJvmKt.sliceSafe(memory, writePosition, buffer.getLimit() - writePosition));
        if (i == -1) {
            return -1;
        }
        buffer.commitWritten(i);
        return i;
    }

    /* renamed from: read-UAd2zVI$default, reason: not valid java name */
    public static /* synthetic */ int m15691readUAd2zVI$default(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = byteBuffer.limit() - i;
        }
        return m15690readUAd2zVI(readableByteChannel, byteBuffer, i, i2);
    }

    @Deprecated(message = "Use write(Memory) instead.")
    public static final int write(@NotNull WritableByteChannel writableByteChannel, @NotNull Buffer buffer) throws IOException {
        Intrinsics.checkNotNullParameter(writableByteChannel, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        ByteBuffer memory = buffer.getMemory();
        int readPosition = buffer.getReadPosition();
        int iWrite = writableByteChannel.write(MemoryJvmKt.sliceSafe(memory, readPosition, buffer.getWritePosition() - readPosition));
        buffer.discardExact(iWrite);
        return iWrite;
    }

    /* renamed from: write-UAd2zVI$default, reason: not valid java name */
    public static /* synthetic */ int m15693writeUAd2zVI$default(WritableByteChannel writableByteChannel, ByteBuffer byteBuffer, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = byteBuffer.limit() - i;
        }
        return m15692writeUAd2zVI(writableByteChannel, byteBuffer, i, i2);
    }
}
