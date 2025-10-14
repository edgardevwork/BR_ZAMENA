package io.ktor.utils.p050io.bits;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerKeys;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.ktor.utils.p050io.core.internal.NumbersKt;
import java.nio.ByteBuffer;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: PrimitiveArraysJvm.kt */
@Metadata(m7104d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0013\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010\u0017\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\u001a;\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a;\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\f\u001a;\u0010\r\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000e2\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a;\u0010\r\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000e2\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0011\u001a;\u0010\u0012\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00132\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a;\u0010\u0012\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00132\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0016\u001a;\u0010\u0017\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00182\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a;\u0010\u0017\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00182\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001b\u001a;\u0010\u001c\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001d2\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a;\u0010\u001c\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u001d2\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010 \u001a;\u0010!\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010\n\u001a;\u0010!\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010\f\u001a;\u0010%\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u000e2\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010\u0010\u001a;\u0010%\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000e2\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010\u0011\u001a;\u0010'\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00132\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010\u0015\u001a;\u0010'\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u00132\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010\u0016\u001a;\u0010)\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00182\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010\u001a\u001a;\u0010)\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u00182\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010\u001b\u001a;\u0010+\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u001d2\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010\u001f\u001a;\u0010+\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u001d2\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010 \u001a\u0015\u0010-\u001a\u00020.*\u00020.2\u0006\u0010\u0003\u001a\u00020\u0004H\u0082\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006/"}, m7105d2 = {"loadDoubleArray", "", "Lio/ktor/utils/io/bits/Memory;", TypedValues.CycleType.S_WAVE_OFFSET, "", FirebaseAnalytics.Param.DESTINATION, "", "destinationOffset", CatchStreamerKeys.COUNT_KEY, "loadDoubleArray-9zorpBc", "(Ljava/nio/ByteBuffer;I[DII)V", "", "(Ljava/nio/ByteBuffer;J[DII)V", "loadFloatArray", "", "loadFloatArray-9zorpBc", "(Ljava/nio/ByteBuffer;I[FII)V", "(Ljava/nio/ByteBuffer;J[FII)V", "loadIntArray", "", "loadIntArray-9zorpBc", "(Ljava/nio/ByteBuffer;I[III)V", "(Ljava/nio/ByteBuffer;J[III)V", "loadLongArray", "", "loadLongArray-9zorpBc", "(Ljava/nio/ByteBuffer;I[JII)V", "(Ljava/nio/ByteBuffer;J[JII)V", "loadShortArray", "", "loadShortArray-9zorpBc", "(Ljava/nio/ByteBuffer;I[SII)V", "(Ljava/nio/ByteBuffer;J[SII)V", "storeDoubleArray", "source", "sourceOffset", "storeDoubleArray-9zorpBc", "storeFloatArray", "storeFloatArray-9zorpBc", "storeIntArray", "storeIntArray-9zorpBc", "storeLongArray", "storeLongArray-9zorpBc", "storeShortArray", "storeShortArray-9zorpBc", "withOffset", "Ljava/nio/ByteBuffer;", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nPrimitiveArraysJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrimitiveArraysJvm.kt\nio/ktor/utils/io/bits/PrimitiveArraysJvmKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Numbers.kt\nio/ktor/utils/io/core/internal/NumbersKt\n*L\n1#1,289:1\n288#1:290\n288#1:294\n288#1:298\n288#1:302\n288#1:306\n288#1:310\n288#1:314\n288#1:318\n288#1:322\n288#1:326\n1#2:291\n1#2:295\n1#2:299\n1#2:303\n1#2:307\n1#2:311\n1#2:315\n1#2:319\n1#2:323\n1#2:327\n1#2:330\n6#3,2:292\n6#3,2:296\n6#3,2:300\n6#3,2:304\n6#3,2:308\n6#3,2:312\n6#3,2:316\n6#3,2:320\n6#3,2:324\n6#3,2:328\n*S KotlinDebug\n*F\n+ 1 PrimitiveArraysJvm.kt\nio/ktor/utils/io/bits/PrimitiveArraysJvmKt\n*L\n19#1:290\n47#1:294\n75#1:298\n103#1:302\n131#1:306\n159#1:310\n187#1:314\n215#1:318\n243#1:322\n271#1:326\n19#1:291\n47#1:295\n75#1:299\n103#1:303\n131#1:307\n159#1:311\n187#1:315\n215#1:319\n243#1:323\n271#1:327\n33#1:292,2\n61#1:296,2\n89#1:300,2\n117#1:304,2\n145#1:308,2\n173#1:312,2\n201#1:316,2\n229#1:320,2\n257#1:324,2\n285#1:328,2\n*E\n"})
/* loaded from: classes8.dex */
public final class PrimitiveArraysJvmKt {
    /* renamed from: loadShortArray-9zorpBc, reason: not valid java name */
    public static final void m15544loadShortArray9zorpBc(@NotNull ByteBuffer loadShortArray, long j, @NotNull short[] destination, int i, int i2) {
        Intrinsics.checkNotNullParameter(loadShortArray, "$this$loadShortArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (j < ParserMinimalBase.MAX_INT_L) {
            m15543loadShortArray9zorpBc(loadShortArray, (int) j, destination, i, i2);
        } else {
            NumbersKt.failLongToIntConversion(j, TypedValues.CycleType.S_WAVE_OFFSET);
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: loadIntArray-9zorpBc, reason: not valid java name */
    public static final void m15536loadIntArray9zorpBc(@NotNull ByteBuffer loadIntArray, long j, @NotNull int[] destination, int i, int i2) {
        Intrinsics.checkNotNullParameter(loadIntArray, "$this$loadIntArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (j < ParserMinimalBase.MAX_INT_L) {
            m15535loadIntArray9zorpBc(loadIntArray, (int) j, destination, i, i2);
        } else {
            NumbersKt.failLongToIntConversion(j, TypedValues.CycleType.S_WAVE_OFFSET);
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: loadShortArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m15545loadShortArray9zorpBc$default(ByteBuffer byteBuffer, int i, short[] sArr, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = sArr.length - i2;
        }
        m15543loadShortArray9zorpBc(byteBuffer, i, sArr, i2, i3);
    }

    /* renamed from: loadLongArray-9zorpBc, reason: not valid java name */
    public static final void m15540loadLongArray9zorpBc(@NotNull ByteBuffer loadLongArray, long j, @NotNull long[] destination, int i, int i2) {
        Intrinsics.checkNotNullParameter(loadLongArray, "$this$loadLongArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (j < ParserMinimalBase.MAX_INT_L) {
            m15539loadLongArray9zorpBc(loadLongArray, (int) j, destination, i, i2);
        } else {
            NumbersKt.failLongToIntConversion(j, TypedValues.CycleType.S_WAVE_OFFSET);
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: loadShortArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m15546loadShortArray9zorpBc$default(ByteBuffer byteBuffer, long j, short[] sArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = sArr.length - i4;
        }
        m15544loadShortArray9zorpBc(byteBuffer, j, sArr, i4, i2);
    }

    /* renamed from: loadFloatArray-9zorpBc, reason: not valid java name */
    public static final void m15532loadFloatArray9zorpBc(@NotNull ByteBuffer loadFloatArray, long j, @NotNull float[] destination, int i, int i2) {
        Intrinsics.checkNotNullParameter(loadFloatArray, "$this$loadFloatArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (j < ParserMinimalBase.MAX_INT_L) {
            m15531loadFloatArray9zorpBc(loadFloatArray, (int) j, destination, i, i2);
        } else {
            NumbersKt.failLongToIntConversion(j, TypedValues.CycleType.S_WAVE_OFFSET);
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: loadIntArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m15537loadIntArray9zorpBc$default(ByteBuffer byteBuffer, int i, int[] iArr, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = iArr.length - i2;
        }
        m15535loadIntArray9zorpBc(byteBuffer, i, iArr, i2, i3);
    }

    /* renamed from: loadDoubleArray-9zorpBc, reason: not valid java name */
    public static final void m15528loadDoubleArray9zorpBc(@NotNull ByteBuffer loadDoubleArray, long j, @NotNull double[] destination, int i, int i2) {
        Intrinsics.checkNotNullParameter(loadDoubleArray, "$this$loadDoubleArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (j < ParserMinimalBase.MAX_INT_L) {
            m15527loadDoubleArray9zorpBc(loadDoubleArray, (int) j, destination, i, i2);
        } else {
            NumbersKt.failLongToIntConversion(j, TypedValues.CycleType.S_WAVE_OFFSET);
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: loadIntArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m15538loadIntArray9zorpBc$default(ByteBuffer byteBuffer, long j, int[] iArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = iArr.length - i4;
        }
        m15536loadIntArray9zorpBc(byteBuffer, j, iArr, i4, i2);
    }

    /* renamed from: storeShortArray-9zorpBc, reason: not valid java name */
    public static final void m15564storeShortArray9zorpBc(@NotNull ByteBuffer storeShortArray, long j, @NotNull short[] source, int i, int i2) {
        Intrinsics.checkNotNullParameter(storeShortArray, "$this$storeShortArray");
        Intrinsics.checkNotNullParameter(source, "source");
        if (j < ParserMinimalBase.MAX_INT_L) {
            m15563storeShortArray9zorpBc(storeShortArray, (int) j, source, i, i2);
        } else {
            NumbersKt.failLongToIntConversion(j, TypedValues.CycleType.S_WAVE_OFFSET);
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: loadLongArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m15541loadLongArray9zorpBc$default(ByteBuffer byteBuffer, int i, long[] jArr, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = jArr.length - i2;
        }
        m15539loadLongArray9zorpBc(byteBuffer, i, jArr, i2, i3);
    }

    /* renamed from: storeIntArray-9zorpBc, reason: not valid java name */
    public static final void m15556storeIntArray9zorpBc(@NotNull ByteBuffer storeIntArray, long j, @NotNull int[] source, int i, int i2) {
        Intrinsics.checkNotNullParameter(storeIntArray, "$this$storeIntArray");
        Intrinsics.checkNotNullParameter(source, "source");
        if (j < ParserMinimalBase.MAX_INT_L) {
            m15555storeIntArray9zorpBc(storeIntArray, (int) j, source, i, i2);
        } else {
            NumbersKt.failLongToIntConversion(j, TypedValues.CycleType.S_WAVE_OFFSET);
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: loadLongArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m15542loadLongArray9zorpBc$default(ByteBuffer byteBuffer, long j, long[] jArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = jArr.length - i4;
        }
        m15540loadLongArray9zorpBc(byteBuffer, j, jArr, i4, i2);
    }

    /* renamed from: storeLongArray-9zorpBc, reason: not valid java name */
    public static final void m15560storeLongArray9zorpBc(@NotNull ByteBuffer storeLongArray, long j, @NotNull long[] source, int i, int i2) {
        Intrinsics.checkNotNullParameter(storeLongArray, "$this$storeLongArray");
        Intrinsics.checkNotNullParameter(source, "source");
        if (j < ParserMinimalBase.MAX_INT_L) {
            m15559storeLongArray9zorpBc(storeLongArray, (int) j, source, i, i2);
        } else {
            NumbersKt.failLongToIntConversion(j, TypedValues.CycleType.S_WAVE_OFFSET);
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: storeFloatArray-9zorpBc, reason: not valid java name */
    public static final void m15552storeFloatArray9zorpBc(@NotNull ByteBuffer storeFloatArray, long j, @NotNull float[] source, int i, int i2) {
        Intrinsics.checkNotNullParameter(storeFloatArray, "$this$storeFloatArray");
        Intrinsics.checkNotNullParameter(source, "source");
        if (j < ParserMinimalBase.MAX_INT_L) {
            m15551storeFloatArray9zorpBc(storeFloatArray, (int) j, source, i, i2);
        } else {
            NumbersKt.failLongToIntConversion(j, TypedValues.CycleType.S_WAVE_OFFSET);
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: loadFloatArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m15533loadFloatArray9zorpBc$default(ByteBuffer byteBuffer, int i, float[] fArr, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = fArr.length - i2;
        }
        m15531loadFloatArray9zorpBc(byteBuffer, i, fArr, i2, i3);
    }

    /* renamed from: loadFloatArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m15534loadFloatArray9zorpBc$default(ByteBuffer byteBuffer, long j, float[] fArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = fArr.length - i4;
        }
        m15532loadFloatArray9zorpBc(byteBuffer, j, fArr, i4, i2);
    }

    /* renamed from: storeDoubleArray-9zorpBc, reason: not valid java name */
    public static final void m15548storeDoubleArray9zorpBc(@NotNull ByteBuffer storeDoubleArray, long j, @NotNull double[] source, int i, int i2) {
        Intrinsics.checkNotNullParameter(storeDoubleArray, "$this$storeDoubleArray");
        Intrinsics.checkNotNullParameter(source, "source");
        if (j < ParserMinimalBase.MAX_INT_L) {
            m15547storeDoubleArray9zorpBc(storeDoubleArray, (int) j, source, i, i2);
        } else {
            NumbersKt.failLongToIntConversion(j, TypedValues.CycleType.S_WAVE_OFFSET);
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: loadDoubleArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m15529loadDoubleArray9zorpBc$default(ByteBuffer byteBuffer, int i, double[] dArr, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = dArr.length - i2;
        }
        m15527loadDoubleArray9zorpBc(byteBuffer, i, dArr, i2, i3);
    }

    public static final ByteBuffer withOffset(ByteBuffer byteBuffer, int i) {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        Intrinsics.checkNotNull(byteBufferDuplicate);
        byteBufferDuplicate.position(i);
        return byteBufferDuplicate;
    }

    /* renamed from: loadDoubleArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m15530loadDoubleArray9zorpBc$default(ByteBuffer byteBuffer, long j, double[] dArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = dArr.length - i4;
        }
        m15528loadDoubleArray9zorpBc(byteBuffer, j, dArr, i4, i2);
    }

    /* renamed from: storeDoubleArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m15549storeDoubleArray9zorpBc$default(ByteBuffer byteBuffer, int i, double[] dArr, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = dArr.length - i2;
        }
        m15547storeDoubleArray9zorpBc(byteBuffer, i, dArr, i2, i3);
    }

    /* renamed from: storeDoubleArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m15550storeDoubleArray9zorpBc$default(ByteBuffer byteBuffer, long j, double[] dArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = dArr.length - i4;
        }
        m15548storeDoubleArray9zorpBc(byteBuffer, j, dArr, i4, i2);
    }

    /* renamed from: storeFloatArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m15553storeFloatArray9zorpBc$default(ByteBuffer byteBuffer, int i, float[] fArr, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = fArr.length - i2;
        }
        m15551storeFloatArray9zorpBc(byteBuffer, i, fArr, i2, i3);
    }

    /* renamed from: storeFloatArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m15554storeFloatArray9zorpBc$default(ByteBuffer byteBuffer, long j, float[] fArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = fArr.length - i4;
        }
        m15552storeFloatArray9zorpBc(byteBuffer, j, fArr, i4, i2);
    }

    /* renamed from: storeIntArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m15557storeIntArray9zorpBc$default(ByteBuffer byteBuffer, int i, int[] iArr, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = iArr.length - i2;
        }
        m15555storeIntArray9zorpBc(byteBuffer, i, iArr, i2, i3);
    }

    /* renamed from: storeIntArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m15558storeIntArray9zorpBc$default(ByteBuffer byteBuffer, long j, int[] iArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = iArr.length - i4;
        }
        m15556storeIntArray9zorpBc(byteBuffer, j, iArr, i4, i2);
    }

    /* renamed from: storeLongArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m15561storeLongArray9zorpBc$default(ByteBuffer byteBuffer, int i, long[] jArr, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = jArr.length - i2;
        }
        m15559storeLongArray9zorpBc(byteBuffer, i, jArr, i2, i3);
    }

    /* renamed from: storeLongArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m15562storeLongArray9zorpBc$default(ByteBuffer byteBuffer, long j, long[] jArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = jArr.length - i4;
        }
        m15560storeLongArray9zorpBc(byteBuffer, j, jArr, i4, i2);
    }

    /* renamed from: storeShortArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m15565storeShortArray9zorpBc$default(ByteBuffer byteBuffer, int i, short[] sArr, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = sArr.length - i2;
        }
        m15563storeShortArray9zorpBc(byteBuffer, i, sArr, i2, i3);
    }

    /* renamed from: storeShortArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m15566storeShortArray9zorpBc$default(ByteBuffer byteBuffer, long j, short[] sArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = sArr.length - i4;
        }
        m15564storeShortArray9zorpBc(byteBuffer, j, sArr, i4, i2);
    }

    /* renamed from: loadShortArray-9zorpBc, reason: not valid java name */
    public static final void m15543loadShortArray9zorpBc(@NotNull ByteBuffer loadShortArray, int i, @NotNull short[] destination, int i2, int i3) {
        Intrinsics.checkNotNullParameter(loadShortArray, "$this$loadShortArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        ByteBuffer byteBufferDuplicate = loadShortArray.duplicate();
        Intrinsics.checkNotNull(byteBufferDuplicate);
        byteBufferDuplicate.position(i);
        byteBufferDuplicate.asShortBuffer().get(destination, i2, i3);
    }

    /* renamed from: loadIntArray-9zorpBc, reason: not valid java name */
    public static final void m15535loadIntArray9zorpBc(@NotNull ByteBuffer loadIntArray, int i, @NotNull int[] destination, int i2, int i3) {
        Intrinsics.checkNotNullParameter(loadIntArray, "$this$loadIntArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        ByteBuffer byteBufferDuplicate = loadIntArray.duplicate();
        Intrinsics.checkNotNull(byteBufferDuplicate);
        byteBufferDuplicate.position(i);
        byteBufferDuplicate.asIntBuffer().get(destination, i2, i3);
    }

    /* renamed from: loadLongArray-9zorpBc, reason: not valid java name */
    public static final void m15539loadLongArray9zorpBc(@NotNull ByteBuffer loadLongArray, int i, @NotNull long[] destination, int i2, int i3) {
        Intrinsics.checkNotNullParameter(loadLongArray, "$this$loadLongArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        ByteBuffer byteBufferDuplicate = loadLongArray.duplicate();
        Intrinsics.checkNotNull(byteBufferDuplicate);
        byteBufferDuplicate.position(i);
        byteBufferDuplicate.asLongBuffer().get(destination, i2, i3);
    }

    /* renamed from: loadFloatArray-9zorpBc, reason: not valid java name */
    public static final void m15531loadFloatArray9zorpBc(@NotNull ByteBuffer loadFloatArray, int i, @NotNull float[] destination, int i2, int i3) {
        Intrinsics.checkNotNullParameter(loadFloatArray, "$this$loadFloatArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        ByteBuffer byteBufferDuplicate = loadFloatArray.duplicate();
        Intrinsics.checkNotNull(byteBufferDuplicate);
        byteBufferDuplicate.position(i);
        byteBufferDuplicate.asFloatBuffer().get(destination, i2, i3);
    }

    /* renamed from: loadDoubleArray-9zorpBc, reason: not valid java name */
    public static final void m15527loadDoubleArray9zorpBc(@NotNull ByteBuffer loadDoubleArray, int i, @NotNull double[] destination, int i2, int i3) {
        Intrinsics.checkNotNullParameter(loadDoubleArray, "$this$loadDoubleArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        ByteBuffer byteBufferDuplicate = loadDoubleArray.duplicate();
        Intrinsics.checkNotNull(byteBufferDuplicate);
        byteBufferDuplicate.position(i);
        byteBufferDuplicate.asDoubleBuffer().get(destination, i2, i3);
    }

    /* renamed from: storeShortArray-9zorpBc, reason: not valid java name */
    public static final void m15563storeShortArray9zorpBc(@NotNull ByteBuffer storeShortArray, int i, @NotNull short[] source, int i2, int i3) {
        Intrinsics.checkNotNullParameter(storeShortArray, "$this$storeShortArray");
        Intrinsics.checkNotNullParameter(source, "source");
        ByteBuffer byteBufferDuplicate = storeShortArray.duplicate();
        Intrinsics.checkNotNull(byteBufferDuplicate);
        byteBufferDuplicate.position(i);
        byteBufferDuplicate.asShortBuffer().put(source, i2, i3);
    }

    /* renamed from: storeIntArray-9zorpBc, reason: not valid java name */
    public static final void m15555storeIntArray9zorpBc(@NotNull ByteBuffer storeIntArray, int i, @NotNull int[] source, int i2, int i3) {
        Intrinsics.checkNotNullParameter(storeIntArray, "$this$storeIntArray");
        Intrinsics.checkNotNullParameter(source, "source");
        ByteBuffer byteBufferDuplicate = storeIntArray.duplicate();
        Intrinsics.checkNotNull(byteBufferDuplicate);
        byteBufferDuplicate.position(i);
        byteBufferDuplicate.asIntBuffer().put(source, i2, i3);
    }

    /* renamed from: storeLongArray-9zorpBc, reason: not valid java name */
    public static final void m15559storeLongArray9zorpBc(@NotNull ByteBuffer storeLongArray, int i, @NotNull long[] source, int i2, int i3) {
        Intrinsics.checkNotNullParameter(storeLongArray, "$this$storeLongArray");
        Intrinsics.checkNotNullParameter(source, "source");
        ByteBuffer byteBufferDuplicate = storeLongArray.duplicate();
        Intrinsics.checkNotNull(byteBufferDuplicate);
        byteBufferDuplicate.position(i);
        byteBufferDuplicate.asLongBuffer().put(source, i2, i3);
    }

    /* renamed from: storeFloatArray-9zorpBc, reason: not valid java name */
    public static final void m15551storeFloatArray9zorpBc(@NotNull ByteBuffer storeFloatArray, int i, @NotNull float[] source, int i2, int i3) {
        Intrinsics.checkNotNullParameter(storeFloatArray, "$this$storeFloatArray");
        Intrinsics.checkNotNullParameter(source, "source");
        ByteBuffer byteBufferDuplicate = storeFloatArray.duplicate();
        Intrinsics.checkNotNull(byteBufferDuplicate);
        byteBufferDuplicate.position(i);
        byteBufferDuplicate.asFloatBuffer().put(source, i2, i3);
    }

    /* renamed from: storeDoubleArray-9zorpBc, reason: not valid java name */
    public static final void m15547storeDoubleArray9zorpBc(@NotNull ByteBuffer storeDoubleArray, int i, @NotNull double[] source, int i2, int i3) {
        Intrinsics.checkNotNullParameter(storeDoubleArray, "$this$storeDoubleArray");
        Intrinsics.checkNotNullParameter(source, "source");
        ByteBuffer byteBufferDuplicate = storeDoubleArray.duplicate();
        Intrinsics.checkNotNull(byteBufferDuplicate);
        byteBufferDuplicate.position(i);
        byteBufferDuplicate.asDoubleBuffer().put(source, i2, i3);
    }
}
