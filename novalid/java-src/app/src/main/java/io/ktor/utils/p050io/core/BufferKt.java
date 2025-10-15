package io.ktor.utils.p050io.core;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerKeys;
import io.ktor.utils.p050io.bits.Memory;
import java.io.EOFException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: Buffer.kt */
@Metadata(m7104d1 = {"\u00004\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a\u0018\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0000\u001a\u0018\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0000\u001a\r\u0010\t\u001a\u00020\n*\u00020\u000bH\u0086\b\u001a\r\u0010\f\u001a\u00020\n*\u00020\u000bH\u0086\b\u001a\u0014\u0010\r\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\u0010\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\u0011\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0003H\u0000\u001am\u0010\u0012\u001a\u00020\u0003*\u00020\u000b2K\u0010\u0013\u001aG\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00030\u0014H\u0086\bø\u0001\u0000ø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001a\u0014\u0010\u001b\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\u001d\u001a\u00020\u0001*\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\u001f\u001a\u00020\u0001*\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u0003H\u0000\u001am\u0010 \u001a\u00020\u0003*\u00020\u000b2K\u0010\u0013\u001aG\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00030\u0014H\u0086\bø\u0001\u0000ø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u0006!"}, m7105d2 = {"commitWrittenFailed", "", CatchStreamerKeys.COUNT_KEY, "", "writeRemaining", "discardFailed", "readRemaining", "rewindFailed", "rewindRemaining", "canRead", "", "Lio/ktor/utils/io/core/Buffer;", "canWrite", "endGapReservationFailedDueToCapacity", "", "endGap", "endGapReservationFailedDueToContent", "endGapReservationFailedDueToStartGap", "read", "block", "Lkotlin/Function3;", "Lio/ktor/utils/io/bits/Memory;", "Lkotlin/ParameterName;", "name", "memory", TtmlNode.START, "endExclusive", "restoreStartGap", "size", "startGapReservationFailed", "startGap", "startGapReservationFailedDueToLimit", "write", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nio/ktor/utils/io/core/BufferKt\n+ 2 Buffer.kt\nio/ktor/utils/io/core/Buffer\n*L\n1#1,472:1\n59#2:473\n69#2:474\n69#2:475\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nio/ktor/utils/io/core/BufferKt\n*L\n418#1:473\n426#1:474\n446#1:475\n*E\n"})
/* loaded from: classes8.dex */
public final class BufferKt {
    public static final boolean canRead(@NotNull Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        return buffer.getWritePosition() > buffer.getReadPosition();
    }

    public static final boolean canWrite(@NotNull Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        return buffer.getLimit() > buffer.getWritePosition();
    }

    public static final int read(@NotNull Buffer buffer, @NotNull Function3<? super Memory, ? super Integer, ? super Integer, Integer> block) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        int iIntValue = block.invoke(Memory.m15422boximpl(buffer.getMemory()), Integer.valueOf(buffer.getReadPosition()), Integer.valueOf(buffer.getWritePosition())).intValue();
        buffer.discardExact(iIntValue);
        return iIntValue;
    }

    public static final int write(@NotNull Buffer buffer, @NotNull Function3<? super Memory, ? super Integer, ? super Integer, Integer> block) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        int iIntValue = block.invoke(Memory.m15422boximpl(buffer.getMemory()), Integer.valueOf(buffer.getWritePosition()), Integer.valueOf(buffer.getLimit())).intValue();
        buffer.commitWritten(iIntValue);
        return iIntValue;
    }

    @NotNull
    public static final Void discardFailed(int i, int i2) {
        throw new EOFException("Unable to discard " + i + " bytes: only " + i2 + " available for reading");
    }

    @NotNull
    public static final Void commitWrittenFailed(int i, int i2) {
        throw new EOFException("Unable to discard " + i + " bytes: only " + i2 + " available for writing");
    }

    @NotNull
    public static final Void rewindFailed(int i, int i2) {
        throw new IllegalArgumentException("Unable to rewind " + i + " bytes: only " + i2 + " could be rewinded");
    }

    @NotNull
    public static final Void startGapReservationFailedDueToLimit(@NotNull Buffer buffer, int i) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (i > buffer.getCapacity()) {
            throw new IllegalArgumentException("Start gap " + i + " is bigger than the capacity " + buffer.getCapacity());
        }
        throw new IllegalStateException("Unable to reserve " + i + " start gap: there are already " + (buffer.getCapacity() - buffer.getLimit()) + " bytes reserved in the end");
    }

    @NotNull
    public static final Void startGapReservationFailed(@NotNull Buffer buffer, int i) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        throw new IllegalStateException("Unable to reserve " + i + " start gap: there are already " + (buffer.getWritePosition() - buffer.getReadPosition()) + " content bytes starting at offset " + buffer.getReadPosition());
    }

    public static final void endGapReservationFailedDueToCapacity(@NotNull Buffer buffer, int i) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        throw new IllegalArgumentException("End gap " + i + " is too big: capacity is " + buffer.getCapacity());
    }

    public static final void endGapReservationFailedDueToStartGap(@NotNull Buffer buffer, int i) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        throw new IllegalArgumentException("End gap " + i + " is too big: there are already " + buffer.getStartGap() + " bytes reserved in the beginning");
    }

    public static final void endGapReservationFailedDueToContent(@NotNull Buffer buffer, int i) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        throw new IllegalArgumentException("Unable to reserve end gap " + i + ": there are already " + (buffer.getWritePosition() - buffer.getReadPosition()) + " content bytes at offset " + buffer.getReadPosition());
    }

    public static final void restoreStartGap(@NotNull Buffer buffer, int i) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        buffer.releaseStartGap$ktor_io(buffer.getReadPosition() - i);
    }
}
