package io.ktor.utils.p050io.bits;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import io.ktor.utils.p050io.core.internal.NumbersKt;
import java.nio.ByteBuffer;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: MemoryPrimitivesJvm.kt */
@Metadata(m7104d1 = {"\u00004\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0015\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0007H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\b\u001a\"\u0010\t\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\"\u0010\t\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0007H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\r\u001a\"\u0010\u000e\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\"\u0010\u000e\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0007H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0011\u001a\"\u0010\u0012\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a\"\u0010\u0012\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0007H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0015\u001a\"\u0010\u0016\u001a\u00020\u0017*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a\"\u0010\u0016\u001a\u00020\u0017*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0007H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u001a\u001a*\u0010\u001b\u001a\u00020\u001c*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0001H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a*\u0010\u001b\u001a\u00020\u001c*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0001H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010 \u001a*\u0010!\u001a\u00020\u001c*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\nH\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#\u001a*\u0010!\u001a\u00020\u001c*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\nH\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010$\u001a*\u0010%\u001a\u00020\u001c*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'\u001a*\u0010%\u001a\u00020\u001c*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0004H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010(\u001a*\u0010)\u001a\u00020\u001c*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0007H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010+\u001a*\u0010)\u001a\u00020\u001c*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0007H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010,\u001a*\u0010-\u001a\u00020\u001c*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0017H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010/\u001a*\u0010-\u001a\u00020\u001c*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0017H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u00100\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00061"}, m7105d2 = {"loadDoubleAt", "", "Lio/ktor/utils/io/bits/Memory;", TypedValues.CycleType.S_WAVE_OFFSET, "", "loadDoubleAt-eY85DW0", "(Ljava/nio/ByteBuffer;I)D", "", "(Ljava/nio/ByteBuffer;J)D", "loadFloatAt", "", "loadFloatAt-eY85DW0", "(Ljava/nio/ByteBuffer;I)F", "(Ljava/nio/ByteBuffer;J)F", "loadIntAt", "loadIntAt-eY85DW0", "(Ljava/nio/ByteBuffer;I)I", "(Ljava/nio/ByteBuffer;J)I", "loadLongAt", "loadLongAt-eY85DW0", "(Ljava/nio/ByteBuffer;I)J", "(Ljava/nio/ByteBuffer;J)J", "loadShortAt", "", "loadShortAt-eY85DW0", "(Ljava/nio/ByteBuffer;I)S", "(Ljava/nio/ByteBuffer;J)S", "storeDoubleAt", "", "value", "storeDoubleAt-62zg_DM", "(Ljava/nio/ByteBuffer;ID)V", "(Ljava/nio/ByteBuffer;JD)V", "storeFloatAt", "storeFloatAt-62zg_DM", "(Ljava/nio/ByteBuffer;IF)V", "(Ljava/nio/ByteBuffer;JF)V", "storeIntAt", "storeIntAt-62zg_DM", "(Ljava/nio/ByteBuffer;II)V", "(Ljava/nio/ByteBuffer;JI)V", "storeLongAt", "storeLongAt-62zg_DM", "(Ljava/nio/ByteBuffer;IJ)V", "(Ljava/nio/ByteBuffer;JJ)V", "storeShortAt", "storeShortAt-62zg_DM", "(Ljava/nio/ByteBuffer;IS)V", "(Ljava/nio/ByteBuffer;JS)V", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nMemoryPrimitivesJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemoryPrimitivesJvm.kt\nio/ktor/utils/io/bits/MemoryPrimitivesJvmKt\n+ 2 Numbers.kt\nio/ktor/utils/io/core/internal/NumbersKt\n*L\n1#1,116:1\n51#1,2:129\n65#1,2:133\n79#1,2:137\n93#1,2:141\n107#1,2:145\n6#2,2:117\n6#2,2:119\n6#2,2:121\n6#2,2:123\n6#2,2:125\n6#2,2:127\n6#2,2:131\n6#2,2:135\n6#2,2:139\n6#2,2:143\n*S KotlinDebug\n*F\n+ 1 MemoryPrimitivesJvm.kt\nio/ktor/utils/io/bits/MemoryPrimitivesJvmKt\n*L\n58#1:129,2\n72#1:133,2\n86#1:137,2\n100#1:141,2\n114#1:145,2\n12#1:117,2\n20#1:119,2\n28#1:121,2\n36#1:123,2\n44#1:125,2\n58#1:127,2\n72#1:131,2\n86#1:135,2\n100#1:139,2\n114#1:143,2\n*E\n"})
/* loaded from: classes8.dex */
public final class MemoryPrimitivesJvmKt {
    /* renamed from: loadShortAt-eY85DW0, reason: not valid java name */
    public static final short m15463loadShortAteY85DW0(@NotNull ByteBuffer loadShortAt, int i) {
        Intrinsics.checkNotNullParameter(loadShortAt, "$this$loadShortAt");
        return loadShortAt.getShort(i);
    }

    /* renamed from: loadShortAt-eY85DW0, reason: not valid java name */
    public static final short m15464loadShortAteY85DW0(@NotNull ByteBuffer loadShortAt, long j) {
        Intrinsics.checkNotNullParameter(loadShortAt, "$this$loadShortAt");
        if (j < ParserMinimalBase.MAX_INT_L) {
            return loadShortAt.getShort((int) j);
        }
        NumbersKt.failLongToIntConversion(j, TypedValues.CycleType.S_WAVE_OFFSET);
        throw new KotlinNothingValueException();
    }

    /* renamed from: loadIntAt-eY85DW0, reason: not valid java name */
    public static final int m15459loadIntAteY85DW0(@NotNull ByteBuffer loadIntAt, int i) {
        Intrinsics.checkNotNullParameter(loadIntAt, "$this$loadIntAt");
        return loadIntAt.getInt(i);
    }

    /* renamed from: loadIntAt-eY85DW0, reason: not valid java name */
    public static final int m15460loadIntAteY85DW0(@NotNull ByteBuffer loadIntAt, long j) {
        Intrinsics.checkNotNullParameter(loadIntAt, "$this$loadIntAt");
        if (j < ParserMinimalBase.MAX_INT_L) {
            return loadIntAt.getInt((int) j);
        }
        NumbersKt.failLongToIntConversion(j, TypedValues.CycleType.S_WAVE_OFFSET);
        throw new KotlinNothingValueException();
    }

    /* renamed from: loadLongAt-eY85DW0, reason: not valid java name */
    public static final long m15461loadLongAteY85DW0(@NotNull ByteBuffer loadLongAt, int i) {
        Intrinsics.checkNotNullParameter(loadLongAt, "$this$loadLongAt");
        return loadLongAt.getLong(i);
    }

    /* renamed from: loadLongAt-eY85DW0, reason: not valid java name */
    public static final long m15462loadLongAteY85DW0(@NotNull ByteBuffer loadLongAt, long j) {
        Intrinsics.checkNotNullParameter(loadLongAt, "$this$loadLongAt");
        if (j < ParserMinimalBase.MAX_INT_L) {
            return loadLongAt.getLong((int) j);
        }
        NumbersKt.failLongToIntConversion(j, TypedValues.CycleType.S_WAVE_OFFSET);
        throw new KotlinNothingValueException();
    }

    /* renamed from: loadFloatAt-eY85DW0, reason: not valid java name */
    public static final float m15457loadFloatAteY85DW0(@NotNull ByteBuffer loadFloatAt, int i) {
        Intrinsics.checkNotNullParameter(loadFloatAt, "$this$loadFloatAt");
        return loadFloatAt.getFloat(i);
    }

    /* renamed from: loadFloatAt-eY85DW0, reason: not valid java name */
    public static final float m15458loadFloatAteY85DW0(@NotNull ByteBuffer loadFloatAt, long j) {
        Intrinsics.checkNotNullParameter(loadFloatAt, "$this$loadFloatAt");
        if (j < ParserMinimalBase.MAX_INT_L) {
            return loadFloatAt.getFloat((int) j);
        }
        NumbersKt.failLongToIntConversion(j, TypedValues.CycleType.S_WAVE_OFFSET);
        throw new KotlinNothingValueException();
    }

    /* renamed from: loadDoubleAt-eY85DW0, reason: not valid java name */
    public static final double m15455loadDoubleAteY85DW0(@NotNull ByteBuffer loadDoubleAt, int i) {
        Intrinsics.checkNotNullParameter(loadDoubleAt, "$this$loadDoubleAt");
        return loadDoubleAt.getDouble(i);
    }

    /* renamed from: loadDoubleAt-eY85DW0, reason: not valid java name */
    public static final double m15456loadDoubleAteY85DW0(@NotNull ByteBuffer loadDoubleAt, long j) {
        Intrinsics.checkNotNullParameter(loadDoubleAt, "$this$loadDoubleAt");
        if (j < ParserMinimalBase.MAX_INT_L) {
            return loadDoubleAt.getDouble((int) j);
        }
        NumbersKt.failLongToIntConversion(j, TypedValues.CycleType.S_WAVE_OFFSET);
        throw new KotlinNothingValueException();
    }

    /* renamed from: storeIntAt-62zg_DM, reason: not valid java name */
    public static final void m15469storeIntAt62zg_DM(@NotNull ByteBuffer storeIntAt, int i, int i2) {
        Intrinsics.checkNotNullParameter(storeIntAt, "$this$storeIntAt");
        storeIntAt.putInt(i, i2);
    }

    /* renamed from: storeShortAt-62zg_DM, reason: not valid java name */
    public static final void m15473storeShortAt62zg_DM(@NotNull ByteBuffer storeShortAt, int i, short s) {
        Intrinsics.checkNotNullParameter(storeShortAt, "$this$storeShortAt");
        storeShortAt.putShort(i, s);
    }

    /* renamed from: storeLongAt-62zg_DM, reason: not valid java name */
    public static final void m15471storeLongAt62zg_DM(@NotNull ByteBuffer storeLongAt, int i, long j) {
        Intrinsics.checkNotNullParameter(storeLongAt, "$this$storeLongAt");
        storeLongAt.putLong(i, j);
    }

    /* renamed from: storeFloatAt-62zg_DM, reason: not valid java name */
    public static final void m15467storeFloatAt62zg_DM(@NotNull ByteBuffer storeFloatAt, int i, float f) {
        Intrinsics.checkNotNullParameter(storeFloatAt, "$this$storeFloatAt");
        storeFloatAt.putFloat(i, f);
    }

    /* renamed from: storeDoubleAt-62zg_DM, reason: not valid java name */
    public static final void m15465storeDoubleAt62zg_DM(@NotNull ByteBuffer storeDoubleAt, int i, double d) {
        Intrinsics.checkNotNullParameter(storeDoubleAt, "$this$storeDoubleAt");
        storeDoubleAt.putDouble(i, d);
    }

    /* renamed from: storeIntAt-62zg_DM, reason: not valid java name */
    public static final void m15470storeIntAt62zg_DM(@NotNull ByteBuffer storeIntAt, long j, int i) {
        Intrinsics.checkNotNullParameter(storeIntAt, "$this$storeIntAt");
        if (j >= ParserMinimalBase.MAX_INT_L) {
            NumbersKt.failLongToIntConversion(j, TypedValues.CycleType.S_WAVE_OFFSET);
            throw new KotlinNothingValueException();
        }
        storeIntAt.putInt((int) j, i);
    }

    /* renamed from: storeShortAt-62zg_DM, reason: not valid java name */
    public static final void m15474storeShortAt62zg_DM(@NotNull ByteBuffer storeShortAt, long j, short s) {
        Intrinsics.checkNotNullParameter(storeShortAt, "$this$storeShortAt");
        if (j >= ParserMinimalBase.MAX_INT_L) {
            NumbersKt.failLongToIntConversion(j, TypedValues.CycleType.S_WAVE_OFFSET);
            throw new KotlinNothingValueException();
        }
        storeShortAt.putShort((int) j, s);
    }

    /* renamed from: storeLongAt-62zg_DM, reason: not valid java name */
    public static final void m15472storeLongAt62zg_DM(@NotNull ByteBuffer storeLongAt, long j, long j2) {
        Intrinsics.checkNotNullParameter(storeLongAt, "$this$storeLongAt");
        if (j >= ParserMinimalBase.MAX_INT_L) {
            NumbersKt.failLongToIntConversion(j, TypedValues.CycleType.S_WAVE_OFFSET);
            throw new KotlinNothingValueException();
        }
        storeLongAt.putLong((int) j, j2);
    }

    /* renamed from: storeFloatAt-62zg_DM, reason: not valid java name */
    public static final void m15468storeFloatAt62zg_DM(@NotNull ByteBuffer storeFloatAt, long j, float f) {
        Intrinsics.checkNotNullParameter(storeFloatAt, "$this$storeFloatAt");
        if (j >= ParserMinimalBase.MAX_INT_L) {
            NumbersKt.failLongToIntConversion(j, TypedValues.CycleType.S_WAVE_OFFSET);
            throw new KotlinNothingValueException();
        }
        storeFloatAt.putFloat((int) j, f);
    }

    /* renamed from: storeDoubleAt-62zg_DM, reason: not valid java name */
    public static final void m15466storeDoubleAt62zg_DM(@NotNull ByteBuffer storeDoubleAt, long j, double d) {
        Intrinsics.checkNotNullParameter(storeDoubleAt, "$this$storeDoubleAt");
        if (j >= ParserMinimalBase.MAX_INT_L) {
            NumbersKt.failLongToIntConversion(j, TypedValues.CycleType.S_WAVE_OFFSET);
            throw new KotlinNothingValueException();
        }
        storeDoubleAt.putDouble((int) j, d);
    }
}
