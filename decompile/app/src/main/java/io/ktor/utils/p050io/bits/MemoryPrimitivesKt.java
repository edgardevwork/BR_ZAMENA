package io.ktor.utils.p050io.bits;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import io.ktor.utils.p050io.core.internal.NumbersKt;
import java.nio.ByteBuffer;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: MemoryPrimitives.kt */
@Metadata(m7104d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\r\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0007H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\b\u001a\"\u0010\t\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\"\u0010\t\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0007H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\r\u001a\"\u0010\u000e\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\"\u0010\u000e\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0007H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0012\u001a*\u0010\u0013\u001a\u00020\u0014*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0001H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a*\u0010\u0013\u001a\u00020\u0014*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0001H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0018\u001a*\u0010\u0019\u001a\u00020\u0014*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\nH\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a*\u0010\u0019\u001a\u00020\u0014*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\nH\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001c\u001a*\u0010\u001d\u001a\u00020\u0014*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u000fH\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a*\u0010\u001d\u001a\u00020\u0014*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u000fH\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010 \u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006!"}, m7105d2 = {"loadUIntAt", "Lkotlin/UInt;", "Lio/ktor/utils/io/bits/Memory;", TypedValues.CycleType.S_WAVE_OFFSET, "", "loadUIntAt-eY85DW0", "(Ljava/nio/ByteBuffer;I)I", "", "(Ljava/nio/ByteBuffer;J)I", "loadULongAt", "Lkotlin/ULong;", "loadULongAt-eY85DW0", "(Ljava/nio/ByteBuffer;I)J", "(Ljava/nio/ByteBuffer;J)J", "loadUShortAt", "Lkotlin/UShort;", "loadUShortAt-eY85DW0", "(Ljava/nio/ByteBuffer;I)S", "(Ljava/nio/ByteBuffer;J)S", "storeUIntAt", "", "value", "storeUIntAt-c9EmHqw", "(Ljava/nio/ByteBuffer;II)V", "(Ljava/nio/ByteBuffer;JI)V", "storeULongAt", "storeULongAt-zwzI6Wg", "(Ljava/nio/ByteBuffer;IJ)V", "(Ljava/nio/ByteBuffer;JJ)V", "storeUShortAt", "storeUShortAt-4ET0KQI", "(Ljava/nio/ByteBuffer;IS)V", "(Ljava/nio/ByteBuffer;JS)V", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nMemoryPrimitives.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemoryPrimitives.kt\nio/ktor/utils/io/bits/MemoryPrimitivesKt\n+ 2 MemoryPrimitivesJvm.kt\nio/ktor/utils/io/bits/MemoryPrimitivesJvmKt\n+ 3 Numbers.kt\nio/ktor/utils/io/core/internal/NumbersKt\n*L\n1#1,164:1\n8#2:165\n12#2:166\n65#2,2:169\n72#2:171\n65#2,9:174\n16#2:183\n20#2:184\n51#2,2:187\n58#2:189\n51#2,9:192\n24#2:201\n28#2:202\n79#2,2:205\n86#2:207\n79#2,9:210\n6#3,2:167\n6#3,2:172\n6#3,2:185\n6#3,2:190\n6#3,2:203\n6#3,2:208\n*S KotlinDebug\n*F\n+ 1 MemoryPrimitives.kt\nio/ktor/utils/io/bits/MemoryPrimitivesKt\n*L\n28#1:165\n33#1:166\n38#1:169,2\n43#1:171\n43#1:174,9\n68#1:183\n73#1:184\n78#1:187,2\n83#1:189\n83#1:192,9\n108#1:201\n113#1:202\n118#1:205,2\n123#1:207\n123#1:210,9\n33#1:167,2\n43#1:172,2\n73#1:185,2\n83#1:190,2\n113#1:203,2\n123#1:208,2\n*E\n"})
/* loaded from: classes8.dex */
public final class MemoryPrimitivesKt {
    /* renamed from: loadUShortAt-eY85DW0, reason: not valid java name */
    public static final short m15479loadUShortAteY85DW0(@NotNull ByteBuffer loadUShortAt, int i) {
        Intrinsics.checkNotNullParameter(loadUShortAt, "$this$loadUShortAt");
        return UShort.m15979constructorimpl(loadUShortAt.getShort(i));
    }

    /* renamed from: loadUShortAt-eY85DW0, reason: not valid java name */
    public static final short m15480loadUShortAteY85DW0(@NotNull ByteBuffer loadUShortAt, long j) {
        Intrinsics.checkNotNullParameter(loadUShortAt, "$this$loadUShortAt");
        if (j < ParserMinimalBase.MAX_INT_L) {
            return UShort.m15979constructorimpl(loadUShortAt.getShort((int) j));
        }
        NumbersKt.failLongToIntConversion(j, TypedValues.CycleType.S_WAVE_OFFSET);
        throw new KotlinNothingValueException();
    }

    /* renamed from: storeUShortAt-4ET0KQI, reason: not valid java name */
    public static final void m15485storeUShortAt4ET0KQI(@NotNull ByteBuffer storeUShortAt, int i, short s) {
        Intrinsics.checkNotNullParameter(storeUShortAt, "$this$storeUShortAt");
        storeUShortAt.putShort(i, s);
    }

    /* renamed from: storeUShortAt-4ET0KQI, reason: not valid java name */
    public static final void m15486storeUShortAt4ET0KQI(@NotNull ByteBuffer storeUShortAt, long j, short s) {
        Intrinsics.checkNotNullParameter(storeUShortAt, "$this$storeUShortAt");
        if (j >= ParserMinimalBase.MAX_INT_L) {
            NumbersKt.failLongToIntConversion(j, TypedValues.CycleType.S_WAVE_OFFSET);
            throw new KotlinNothingValueException();
        }
        storeUShortAt.putShort((int) j, s);
    }

    /* renamed from: loadUIntAt-eY85DW0, reason: not valid java name */
    public static final int m15475loadUIntAteY85DW0(@NotNull ByteBuffer loadUIntAt, int i) {
        Intrinsics.checkNotNullParameter(loadUIntAt, "$this$loadUIntAt");
        return UInt.m15793constructorimpl(loadUIntAt.getInt(i));
    }

    /* renamed from: loadUIntAt-eY85DW0, reason: not valid java name */
    public static final int m15476loadUIntAteY85DW0(@NotNull ByteBuffer loadUIntAt, long j) {
        Intrinsics.checkNotNullParameter(loadUIntAt, "$this$loadUIntAt");
        if (j < ParserMinimalBase.MAX_INT_L) {
            return UInt.m15793constructorimpl(loadUIntAt.getInt((int) j));
        }
        NumbersKt.failLongToIntConversion(j, TypedValues.CycleType.S_WAVE_OFFSET);
        throw new KotlinNothingValueException();
    }

    /* renamed from: storeUIntAt-c9EmHqw, reason: not valid java name */
    public static final void m15481storeUIntAtc9EmHqw(@NotNull ByteBuffer storeUIntAt, int i, int i2) {
        Intrinsics.checkNotNullParameter(storeUIntAt, "$this$storeUIntAt");
        storeUIntAt.putInt(i, i2);
    }

    /* renamed from: storeUIntAt-c9EmHqw, reason: not valid java name */
    public static final void m15482storeUIntAtc9EmHqw(@NotNull ByteBuffer storeUIntAt, long j, int i) {
        Intrinsics.checkNotNullParameter(storeUIntAt, "$this$storeUIntAt");
        if (j >= ParserMinimalBase.MAX_INT_L) {
            NumbersKt.failLongToIntConversion(j, TypedValues.CycleType.S_WAVE_OFFSET);
            throw new KotlinNothingValueException();
        }
        storeUIntAt.putInt((int) j, i);
    }

    /* renamed from: loadULongAt-eY85DW0, reason: not valid java name */
    public static final long m15477loadULongAteY85DW0(@NotNull ByteBuffer loadULongAt, int i) {
        Intrinsics.checkNotNullParameter(loadULongAt, "$this$loadULongAt");
        return ULong.m15872constructorimpl(loadULongAt.getLong(i));
    }

    /* renamed from: loadULongAt-eY85DW0, reason: not valid java name */
    public static final long m15478loadULongAteY85DW0(@NotNull ByteBuffer loadULongAt, long j) {
        Intrinsics.checkNotNullParameter(loadULongAt, "$this$loadULongAt");
        if (j < ParserMinimalBase.MAX_INT_L) {
            return ULong.m15872constructorimpl(loadULongAt.getLong((int) j));
        }
        NumbersKt.failLongToIntConversion(j, TypedValues.CycleType.S_WAVE_OFFSET);
        throw new KotlinNothingValueException();
    }

    /* renamed from: storeULongAt-zwzI6Wg, reason: not valid java name */
    public static final void m15483storeULongAtzwzI6Wg(@NotNull ByteBuffer storeULongAt, int i, long j) {
        Intrinsics.checkNotNullParameter(storeULongAt, "$this$storeULongAt");
        storeULongAt.putLong(i, j);
    }

    /* renamed from: storeULongAt-zwzI6Wg, reason: not valid java name */
    public static final void m15484storeULongAtzwzI6Wg(@NotNull ByteBuffer storeULongAt, long j, long j2) {
        Intrinsics.checkNotNullParameter(storeULongAt, "$this$storeULongAt");
        if (j >= ParserMinimalBase.MAX_INT_L) {
            NumbersKt.failLongToIntConversion(j, TypedValues.CycleType.S_WAVE_OFFSET);
            throw new KotlinNothingValueException();
        }
        storeULongAt.putLong((int) j, j2);
    }
}
