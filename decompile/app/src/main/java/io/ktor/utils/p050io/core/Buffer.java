package io.ktor.utils.p050io.core;

import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerKeys;
import io.ktor.utils.p050io.DeprecationKt;
import io.ktor.utils.p050io.core.internal.ChunkBuffer;
import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.Deprecated;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt__CharJVMKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: Buffer.kt */
@Metadata(m7104d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0005\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0017\u0018\u0000 <2\u00020\u0001:\u0001<B\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0006J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0006H\u0001J\u0010\u0010!\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u0006J\u0015\u0010\"\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u0006H\u0000¢\u0006\u0002\b#J\b\u0010$\u001a\u00020\u0000H\u0016J\u0010\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u0000H\u0014J\u0006\u0010'\u001a\u00020(J\r\u0010)\u001a\u00020\u001cH\u0000¢\u0006\u0002\b*J\r\u0010+\u001a\u00020\u001cH\u0000¢\u0006\u0002\b,J\u0015\u0010-\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020\u0006H\u0000¢\u0006\u0002\b/J\u000e\u00100\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\u0006J\u000e\u00101\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u0006J\b\u00102\u001a\u00020\u001cH\u0016J\u0006\u00103\u001a\u00020\u001cJ\u0006\u00104\u001a\u00020\u001cJ\u000e\u00104\u001a\u00020\u001c2\u0006\u0010\f\u001a\u00020\u0006J\u0010\u00105\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u0006J\b\u00106\u001a\u000207H\u0016J\u0006\u00108\u001a\u00020\u0006J\u0006\u00109\u001a\u00020\u0006J\u000e\u0010:\u001a\u00020\u001c2\u0006\u0010;\u001a\u00020(R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00020\u00068Æ\u0002¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u001e\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\bR\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\bR\u0012\u0010\u0013\u001a\u00020\u00068Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0014\u0010\bR\u001e\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\bR\u001e\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\bR\u0012\u0010\u0019\u001a\u00020\u00068Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001a\u0010\b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006="}, m7105d2 = {"Lio/ktor/utils/io/core/Buffer;", "", "memory", "Lio/ktor/utils/io/bits/Memory;", "(Ljava/nio/ByteBuffer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "capacity", "", "getCapacity", "()I", "endGap", "getEndGap", "<set-?>", "limit", "getLimit", "getMemory-SK3TCg8", "()Ljava/nio/ByteBuffer;", "Ljava/nio/ByteBuffer;", "readPosition", "getReadPosition", "readRemaining", "getReadRemaining", "startGap", "getStartGap", "writePosition", "getWritePosition", "writeRemaining", "getWriteRemaining", "commitWritten", "", CatchStreamerKeys.COUNT_KEY, "commitWrittenUntilIndex", "", "position", "discardExact", "discardUntilIndex", "discardUntilIndex$ktor_io", "duplicate", "duplicateTo", "copy", "readByte", "", "releaseEndGap", "releaseEndGap$ktor_io", "releaseGaps", "releaseGaps$ktor_io", "releaseStartGap", "newReadPosition", "releaseStartGap$ktor_io", "reserveEndGap", "reserveStartGap", "reset", "resetForRead", "resetForWrite", "rewind", "toString", "", "tryPeekByte", "tryReadByte", "writeByte", "value", "Companion", "ktor-io"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@Deprecated(message = DeprecationKt.IO_DEPRECATION_MESSAGE)
@SourceDebugExtension({"SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nio/ktor/utils/io/core/Buffer\n+ 2 MemoryJvm.kt\nio/ktor/utils/io/bits/Memory\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Memory.kt\nio/ktor/utils/io/bits/MemoryKt\n*L\n1#1,472:1\n69#1:475\n69#1:476\n74#1:477\n74#1:478\n74#1:479\n69#1:480\n69#1,6:491\n59#1:497\n21#2:473\n21#2:474\n26#2:483\n26#2:485\n26#2:487\n37#2,2:489\n1#3:481\n84#4:482\n84#4:484\n84#4:486\n99#4:488\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nio/ktor/utils/io/core/Buffer\n*L\n86#1:475\n81#1:476\n94#1:477\n106#1:478\n113#1:479\n122#1:480\n333#1:491,6\n333#1:497\n53#1:473\n64#1:474\n277#1:483\n291#1:485\n307#1:487\n319#1:489,2\n277#1:482\n291#1:484\n307#1:486\n319#1:488\n*E\n"})
/* loaded from: classes8.dex */
public class Buffer {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int ReservedSize = 8;
    public final int capacity;
    public int limit;

    @NotNull
    public final ByteBuffer memory;
    public int readPosition;
    public int startGap;
    public int writePosition;

    public /* synthetic */ Buffer(ByteBuffer byteBuffer, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteBuffer);
    }

    public Buffer(ByteBuffer memory) {
        Intrinsics.checkNotNullParameter(memory, "memory");
        this.memory = memory;
        this.limit = memory.limit();
        this.capacity = memory.limit();
    }

    @NotNull
    /* renamed from: getMemory-SK3TCg8, reason: from getter */
    public final ByteBuffer getMemory() {
        return this.memory;
    }

    public final int getReadPosition() {
        return this.readPosition;
    }

    public final int getWritePosition() {
        return this.writePosition;
    }

    public final int getStartGap() {
        return this.startGap;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final int getEndGap() {
        return getCapacity() - getLimit();
    }

    public final int getCapacity() {
        return this.capacity;
    }

    public final int getReadRemaining() {
        return getWritePosition() - getReadPosition();
    }

    public final int getWriteRemaining() {
        return getLimit() - getWritePosition();
    }

    public final void discardExact(int i) {
        if (i == 0) {
            return;
        }
        int i2 = this.readPosition + i;
        if (i < 0 || i2 > this.writePosition) {
            BufferKt.discardFailed(i, getWritePosition() - getReadPosition());
            throw new KotlinNothingValueException();
        }
        this.readPosition = i2;
    }

    public final void commitWritten(int i) {
        int i2 = this.writePosition + i;
        if (i < 0 || i2 > this.limit) {
            BufferKt.commitWrittenFailed(i, getLimit() - getWritePosition());
            throw new KotlinNothingValueException();
        }
        this.writePosition = i2;
    }

    @PublishedApi
    public final boolean commitWrittenUntilIndex(int position) {
        int i = this.limit;
        int i2 = this.writePosition;
        if (position < i2) {
            BufferKt.commitWrittenFailed(position - i2, getLimit() - getWritePosition());
            throw new KotlinNothingValueException();
        }
        if (position < i) {
            this.writePosition = position;
            return true;
        }
        if (position == i) {
            this.writePosition = position;
            return false;
        }
        BufferKt.commitWrittenFailed(position - i2, getLimit() - getWritePosition());
        throw new KotlinNothingValueException();
    }

    public final void discardUntilIndex$ktor_io(int position) {
        if (position < 0 || position > this.writePosition) {
            BufferKt.discardFailed(position - this.readPosition, getWritePosition() - getReadPosition());
            throw new KotlinNothingValueException();
        }
        if (this.readPosition != position) {
            this.readPosition = position;
        }
    }

    public static /* synthetic */ void rewind$default(Buffer buffer, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rewind");
        }
        if ((i2 & 1) != 0) {
            i = buffer.readPosition - buffer.startGap;
        }
        buffer.rewind(i);
    }

    public final void rewind(int i) {
        int i2 = this.readPosition;
        int i3 = i2 - i;
        int i4 = this.startGap;
        if (i3 < i4) {
            BufferKt.rewindFailed(i, i2 - i4);
            throw new KotlinNothingValueException();
        }
        this.readPosition = i3;
    }

    public final void reserveStartGap(int startGap) {
        if (startGap < 0) {
            throw new IllegalArgumentException(("startGap shouldn't be negative: " + startGap).toString());
        }
        int i = this.readPosition;
        if (i >= startGap) {
            this.startGap = startGap;
            return;
        }
        if (i == this.writePosition) {
            if (startGap > this.limit) {
                BufferKt.startGapReservationFailedDueToLimit(this, startGap);
                throw new KotlinNothingValueException();
            }
            this.writePosition = startGap;
            this.readPosition = startGap;
            this.startGap = startGap;
            return;
        }
        BufferKt.startGapReservationFailed(this, startGap);
        throw new KotlinNothingValueException();
    }

    public final void reserveEndGap(int endGap) {
        if (endGap < 0) {
            throw new IllegalArgumentException(("endGap shouldn't be negative: " + endGap).toString());
        }
        int i = this.capacity - endGap;
        if (i >= this.writePosition) {
            this.limit = i;
            return;
        }
        if (i < 0) {
            BufferKt.endGapReservationFailedDueToCapacity(this, endGap);
        }
        if (i < this.startGap) {
            BufferKt.endGapReservationFailedDueToStartGap(this, endGap);
        }
        if (this.readPosition == this.writePosition) {
            this.limit = i;
            this.readPosition = i;
            this.writePosition = i;
            return;
        }
        BufferKt.endGapReservationFailedDueToContent(this, endGap);
    }

    public final void resetForRead() {
        this.startGap = 0;
        this.readPosition = 0;
        this.writePosition = this.capacity;
    }

    public final void resetForWrite() {
        resetForWrite(this.capacity - this.startGap);
    }

    public final void resetForWrite(int limit) {
        int i = this.startGap;
        this.readPosition = i;
        this.writePosition = i;
        this.limit = limit;
    }

    public final void releaseGaps$ktor_io() {
        releaseStartGap$ktor_io(0);
        releaseEndGap$ktor_io();
    }

    public final void releaseEndGap$ktor_io() {
        this.limit = this.capacity;
    }

    public final void releaseStartGap$ktor_io(int newReadPosition) {
        if (newReadPosition < 0) {
            throw new IllegalArgumentException(("newReadPosition shouldn't be negative: " + newReadPosition).toString());
        }
        if (newReadPosition > this.readPosition) {
            throw new IllegalArgumentException(("newReadPosition shouldn't be ahead of the read position: " + newReadPosition + " > " + this.readPosition).toString());
        }
        this.readPosition = newReadPosition;
        if (this.startGap > newReadPosition) {
            this.startGap = newReadPosition;
        }
    }

    public void duplicateTo(@NotNull Buffer copy) {
        Intrinsics.checkNotNullParameter(copy, "copy");
        copy.limit = this.limit;
        copy.startGap = this.startGap;
        copy.readPosition = this.readPosition;
        copy.writePosition = this.writePosition;
    }

    @NotNull
    public Buffer duplicate() {
        Buffer buffer = new Buffer(this.memory, null);
        buffer.duplicateTo(buffer);
        return buffer;
    }

    public final int tryPeekByte() {
        int i = this.readPosition;
        if (i == this.writePosition) {
            return -1;
        }
        return this.memory.get(i) & 255;
    }

    public final int tryReadByte() {
        int i = this.readPosition;
        if (i == this.writePosition) {
            return -1;
        }
        this.readPosition = i + 1;
        return this.memory.get(i) & 255;
    }

    public final byte readByte() throws EOFException {
        int i = this.readPosition;
        if (i == this.writePosition) {
            throw new EOFException("No readable bytes available.");
        }
        this.readPosition = i + 1;
        return this.memory.get(i);
    }

    public final void writeByte(byte value) throws InsufficientSpaceException {
        int i = this.writePosition;
        if (i == this.limit) {
            throw new InsufficientSpaceException("No free space in the buffer to write a byte");
        }
        this.memory.put(i, value);
        this.writePosition = i + 1;
    }

    public void reset() {
        releaseGaps$ktor_io();
        resetForWrite();
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Buffer[0x");
        String string = Integer.toString(hashCode(), CharsKt__CharJVMKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(string, "toString(this, checkRadix(radix))");
        sb.append(string);
        sb.append("](");
        sb.append(getWritePosition() - getReadPosition());
        sb.append(" used, ");
        sb.append(getLimit() - getWritePosition());
        sb.append(" free, ");
        sb.append(this.startGap + (getCapacity() - getLimit()));
        sb.append(" reserved of ");
        sb.append(this.capacity);
        sb.append(')');
        return sb.toString();
    }

    /* compiled from: Buffer.kt */
    @Metadata(m7104d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m7105d2 = {"Lio/ktor/utils/io/core/Buffer$Companion;", "", "()V", "Empty", "Lio/ktor/utils/io/core/Buffer;", "getEmpty", "()Lio/ktor/utils/io/core/Buffer;", "ReservedSize", "", "ktor-io"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final Buffer getEmpty() {
            return ChunkBuffer.INSTANCE.getEmpty();
        }
    }

    public static /* synthetic */ void discardExact$default(Buffer buffer, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: discardExact");
        }
        if ((i2 & 1) != 0) {
            i = buffer.getWritePosition() - buffer.getReadPosition();
        }
        buffer.discardExact(i);
    }
}
