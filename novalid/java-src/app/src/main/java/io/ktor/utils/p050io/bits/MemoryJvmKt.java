package io.ktor.utils.p050io.bits;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.datasource.cache.CacheFileMetadataIndex;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerKeys;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.ktor.utils.p050io.core.internal.NumbersKt;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: MemoryJvm.kt */
@Metadata(m7104d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0010\u0005\n\u0002\b\b\u001a'\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a'\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\n\u001a7\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a7\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u0010\u001a'\u0010\u0000\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\b\u001a/\u0010\u0012\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a/\u0010\u0012\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0015ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0018\u001a\r\u0010\u0019\u001a\u00020\u0004*\u00020\u0004H\u0082\b\u001a\r\u0010\u001a\u001a\u00020\u0004*\u00020\u0004H\u0082\b\u001a\u001c\u0010\u001b\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0000\u001a\r\u0010\u001c\u001a\u00020\u0004*\u00020\u0004H\u0082\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001d"}, m7105d2 = {"copyTo", "", "Lio/ktor/utils/io/bits/Memory;", FirebaseAnalytics.Param.DESTINATION, "Ljava/nio/ByteBuffer;", TypedValues.CycleType.S_WAVE_OFFSET, "", "copyTo-62zg_DM", "(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;I)V", "", "(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;J)V", "", CacheFileMetadataIndex.COLUMN_LENGTH, "destinationOffset", "copyTo-9zorpBc", "(Ljava/nio/ByteBuffer;[BIII)V", "(Ljava/nio/ByteBuffer;[BJII)V", "copyTo-SG11BkQ", "fill", CatchStreamerKeys.COUNT_KEY, "value", "", "fill-JT6ljtQ", "(Ljava/nio/ByteBuffer;IIB)V", "(Ljava/nio/ByteBuffer;JJB)V", "myDuplicate", "mySlice", "sliceSafe", "suppressNullCheck", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nMemoryJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemoryJvm.kt\nio/ktor/utils/io/bits/MemoryJvmKt\n+ 2 Numbers.kt\nio/ktor/utils/io/core/internal/NumbersKt\n+ 3 PrimiteArrays.kt\nio/ktor/utils/io/bits/PrimiteArraysKt\n+ 4 MemoryFactoryJvm.kt\nio/ktor/utils/io/bits/MemoryFactoryJvmKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,230:1\n208#1:244\n208#1:245\n200#1:246\n208#1:248\n204#1,5:249\n6#2,2:231\n6#2,2:233\n6#2,2:254\n282#3:235\n283#3,3:240\n17#4,4:236\n1#5:243\n1#5:247\n*S KotlinDebug\n*F\n+ 1 MemoryJvm.kt\nio/ktor/utils/io/bits/MemoryJvmKt\n*L\n200#1:244\n204#1:245\n212#1:246\n212#1:248\n212#1:249,5\n141#1:231,2\n183#1:233,2\n219#1:254,2\n191#1:235\n191#1:240,3\n191#1:236,4\n212#1:247\n*E\n"})
/* loaded from: classes8.dex */
public final class MemoryJvmKt {
    public static final ByteBuffer suppressNullCheck(ByteBuffer byteBuffer) {
        return byteBuffer;
    }

    /* renamed from: copyTo-9zorpBc */
    public static final void m15442copyTo9zorpBc(@NotNull ByteBuffer copyTo, @NotNull byte[] destination, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(copyTo, "$this$copyTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (copyTo.hasArray() && !copyTo.isReadOnly()) {
            System.arraycopy(copyTo.array(), copyTo.arrayOffset() + i, destination, i3, i2);
        } else {
            copyTo.duplicate().get(destination, i3, i2);
        }
    }

    /* renamed from: copyTo-9zorpBc */
    public static final void m15443copyTo9zorpBc(@NotNull ByteBuffer copyTo, @NotNull byte[] destination, long j, int i, int i2) {
        Intrinsics.checkNotNullParameter(copyTo, "$this$copyTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (j < ParserMinimalBase.MAX_INT_L) {
            m15442copyTo9zorpBc(copyTo, destination, (int) j, i, i2);
        } else {
            NumbersKt.failLongToIntConversion(j, TypedValues.CycleType.S_WAVE_OFFSET);
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: copyTo-62zg_DM */
    public static final void m15440copyTo62zg_DM(@NotNull ByteBuffer copyTo, @NotNull ByteBuffer destination, int i) {
        Intrinsics.checkNotNullParameter(copyTo, "$this$copyTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        int iRemaining = destination.remaining();
        if (copyTo.hasArray() && !copyTo.isReadOnly() && destination.hasArray() && !destination.isReadOnly()) {
            int iPosition = destination.position();
            System.arraycopy(copyTo.array(), copyTo.arrayOffset() + i, destination.array(), destination.arrayOffset() + iPosition, iRemaining);
            destination.position(iPosition + iRemaining);
        } else {
            ByteBuffer byteBufferDuplicate = copyTo.duplicate();
            byteBufferDuplicate.limit(iRemaining + i);
            byteBufferDuplicate.position(i);
            destination.put(byteBufferDuplicate);
        }
    }

    /* renamed from: copyTo-62zg_DM */
    public static final void m15441copyTo62zg_DM(@NotNull ByteBuffer copyTo, @NotNull ByteBuffer destination, long j) {
        Intrinsics.checkNotNullParameter(copyTo, "$this$copyTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (j < ParserMinimalBase.MAX_INT_L) {
            m15440copyTo62zg_DM(copyTo, destination, (int) j);
        } else {
            NumbersKt.failLongToIntConversion(j, TypedValues.CycleType.S_WAVE_OFFSET);
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: copyTo-SG11BkQ */
    public static final void m15444copyToSG11BkQ(@NotNull ByteBuffer copyTo, @NotNull ByteBuffer destination, int i) {
        Intrinsics.checkNotNullParameter(copyTo, "$this$copyTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (copyTo.hasArray() && !copyTo.isReadOnly()) {
            byte[] bArrArray = copyTo.array();
            Intrinsics.checkNotNullExpressionValue(bArrArray, "array()");
            int iArrayOffset = copyTo.arrayOffset() + copyTo.position();
            int iRemaining = copyTo.remaining();
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArrArray, iArrayOffset, iRemaining).slice().order(ByteOrder.BIG_ENDIAN);
            Intrinsics.checkNotNullExpressionValue(byteBufferOrder, "wrap(this, offset, lengt…der(ByteOrder.BIG_ENDIAN)");
            Memory.m15424copyToJT6ljtQ(Memory.m15423constructorimpl(byteBufferOrder), destination, 0, iRemaining, i);
            copyTo.position(copyTo.limit());
            return;
        }
        sliceSafe(destination, i, copyTo.remaining()).put(copyTo);
    }

    public static final ByteBuffer myDuplicate(ByteBuffer byteBuffer) {
        ByteBuffer myDuplicate$lambda$1 = byteBuffer.duplicate();
        Intrinsics.checkNotNullExpressionValue(myDuplicate$lambda$1, "myDuplicate$lambda$1");
        return myDuplicate$lambda$1;
    }

    public static final ByteBuffer mySlice(ByteBuffer byteBuffer) {
        ByteBuffer mySlice$lambda$2 = byteBuffer.slice();
        Intrinsics.checkNotNullExpressionValue(mySlice$lambda$2, "mySlice$lambda$2");
        return mySlice$lambda$2;
    }

    /* renamed from: fill-JT6ljtQ */
    public static final void m15446fillJT6ljtQ(@NotNull ByteBuffer fill, long j, long j2, byte b) {
        Intrinsics.checkNotNullParameter(fill, "$this$fill");
        if (j >= ParserMinimalBase.MAX_INT_L) {
            NumbersKt.failLongToIntConversion(j, TypedValues.CycleType.S_WAVE_OFFSET);
            throw new KotlinNothingValueException();
        }
        int i = (int) j;
        if (j2 < ParserMinimalBase.MAX_INT_L) {
            m15445fillJT6ljtQ(fill, i, (int) j2, b);
        } else {
            NumbersKt.failLongToIntConversion(j2, CatchStreamerKeys.COUNT_KEY);
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: fill-JT6ljtQ */
    public static final void m15445fillJT6ljtQ(@NotNull ByteBuffer fill, int i, int i2, byte b) {
        Intrinsics.checkNotNullParameter(fill, "$this$fill");
        int i3 = i2 + i;
        while (i < i3) {
            fill.put(i, b);
            i++;
        }
    }

    @NotNull
    public static final ByteBuffer sliceSafe(@NotNull ByteBuffer byteBuffer, int i, int i2) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        ByteBuffer myDuplicate$lambda$1 = byteBuffer.duplicate();
        Intrinsics.checkNotNullExpressionValue(myDuplicate$lambda$1, "myDuplicate$lambda$1");
        myDuplicate$lambda$1.position(i);
        myDuplicate$lambda$1.limit(i + i2);
        ByteBuffer mySlice$lambda$2 = myDuplicate$lambda$1.slice();
        Intrinsics.checkNotNullExpressionValue(mySlice$lambda$2, "mySlice$lambda$2");
        return mySlice$lambda$2;
    }
}
