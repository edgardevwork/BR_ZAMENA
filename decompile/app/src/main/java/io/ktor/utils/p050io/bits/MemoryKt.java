package io.ktor.utils.p050io.bits;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.datasource.cache.CacheFileMetadataIndex;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.ktor.utils.p050io.core.internal.NumbersKt;
import java.nio.ByteBuffer;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: Memory.kt */
@Metadata(m7104d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\u000b\u001a\"\u0010\f\u001a\u00020\r*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0006H\u0086\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\"\u0010\f\u001a\u00020\r*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0086\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0011\u001a*\u0010\u0012\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\rH\u0086\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a*\u0010\u0012\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\rH\u0086\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0016\u001a*\u0010\u0017\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0018H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u0015\u001a*\u0010\u0017\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0018H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001a"}, m7105d2 = {"copyTo", "", "Lio/ktor/utils/io/bits/Memory;", FirebaseAnalytics.Param.DESTINATION, "", TypedValues.CycleType.S_WAVE_OFFSET, "", CacheFileMetadataIndex.COLUMN_LENGTH, "copyTo-JT6ljtQ", "(Ljava/nio/ByteBuffer;[BII)V", "", "(Ljava/nio/ByteBuffer;[BJI)V", "get", "", FirebaseAnalytics.Param.INDEX, "get-eY85DW0", "(Ljava/nio/ByteBuffer;I)B", "(Ljava/nio/ByteBuffer;J)B", "set", "value", "set-62zg_DM", "(Ljava/nio/ByteBuffer;IB)V", "(Ljava/nio/ByteBuffer;JB)V", "storeAt", "Lkotlin/UByte;", "storeAt-OEmREl0", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nMemory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Memory.kt\nio/ktor/utils/io/bits/MemoryKt\n+ 2 MemoryJvm.kt\nio/ktor/utils/io/bits/Memory\n+ 3 Numbers.kt\nio/ktor/utils/io/core/internal/NumbersKt\n*L\n1#1,148:1\n26#2:149\n31#2:150\n44#2:153\n45#2:156\n37#2,2:157\n44#2:159\n45#2:162\n37#2,2:163\n6#3,2:151\n6#3,2:154\n6#3,2:160\n*S KotlinDebug\n*F\n+ 1 Memory.kt\nio/ktor/utils/io/bits/MemoryKt\n*L\n84#1:149\n89#1:150\n94#1:153\n94#1:156\n99#1:157,2\n104#1:159\n104#1:162\n109#1:163,2\n89#1:151,2\n94#1:154,2\n104#1:160,2\n*E\n"})
/* loaded from: classes8.dex */
public final class MemoryKt {
    /* renamed from: copyTo-JT6ljtQ, reason: not valid java name */
    public static final void m15447copyToJT6ljtQ(@NotNull ByteBuffer copyTo, @NotNull byte[] destination, int i, int i2) {
        Intrinsics.checkNotNullParameter(copyTo, "$this$copyTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        MemoryJvmKt.m15442copyTo9zorpBc(copyTo, destination, i, i2, 0);
    }

    /* renamed from: copyTo-JT6ljtQ, reason: not valid java name */
    public static final void m15448copyToJT6ljtQ(@NotNull ByteBuffer copyTo, @NotNull byte[] destination, long j, int i) {
        Intrinsics.checkNotNullParameter(copyTo, "$this$copyTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        MemoryJvmKt.m15443copyTo9zorpBc(copyTo, destination, j, i, 0);
    }

    /* renamed from: get-eY85DW0, reason: not valid java name */
    public static final byte m15449geteY85DW0(@NotNull ByteBuffer get, int i) {
        Intrinsics.checkNotNullParameter(get, "$this$get");
        return get.get(i);
    }

    /* renamed from: get-eY85DW0, reason: not valid java name */
    public static final byte m15450geteY85DW0(@NotNull ByteBuffer get, long j) {
        Intrinsics.checkNotNullParameter(get, "$this$get");
        if (j < ParserMinimalBase.MAX_INT_L) {
            return get.get((int) j);
        }
        NumbersKt.failLongToIntConversion(j, FirebaseAnalytics.Param.INDEX);
        throw new KotlinNothingValueException();
    }

    /* renamed from: set-62zg_DM, reason: not valid java name */
    public static final void m15452set62zg_DM(@NotNull ByteBuffer set, long j, byte b) {
        Intrinsics.checkNotNullParameter(set, "$this$set");
        if (j < ParserMinimalBase.MAX_INT_L) {
            set.put((int) j, b);
        } else {
            NumbersKt.failLongToIntConversion(j, FirebaseAnalytics.Param.INDEX);
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: set-62zg_DM, reason: not valid java name */
    public static final void m15451set62zg_DM(@NotNull ByteBuffer set, int i, byte b) {
        Intrinsics.checkNotNullParameter(set, "$this$set");
        set.put(i, b);
    }

    /* renamed from: storeAt-OEmREl0, reason: not valid java name */
    public static final void m15454storeAtOEmREl0(@NotNull ByteBuffer storeAt, long j, byte b) {
        Intrinsics.checkNotNullParameter(storeAt, "$this$storeAt");
        if (j < ParserMinimalBase.MAX_INT_L) {
            storeAt.put((int) j, b);
        } else {
            NumbersKt.failLongToIntConversion(j, FirebaseAnalytics.Param.INDEX);
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: storeAt-OEmREl0, reason: not valid java name */
    public static final void m15453storeAtOEmREl0(@NotNull ByteBuffer storeAt, int i, byte b) {
        Intrinsics.checkNotNullParameter(storeAt, "$this$storeAt");
        storeAt.put(i, b);
    }
}
