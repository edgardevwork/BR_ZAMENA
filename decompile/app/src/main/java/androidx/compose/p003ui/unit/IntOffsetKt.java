package androidx.compose.p003ui.unit;

import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;

/* compiled from: IntOffset.kt */
@Metadata(m7104d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0005\u001a*\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\r\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0001H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001f\u0010\r\u001a\u00020\u000e*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000eH\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0011\u001a\u001f\u0010\u0013\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0001H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0011\u001a\u001f\u0010\u0013\u001a\u00020\u000e*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000eH\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0011\u001a\u0017\u0010\u0016\u001a\u00020\u0001*\u00020\u000eH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0017\u0010\u0019\u001a\u00020\u000e*\u00020\u0001H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0018\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, m7105d2 = {"IntOffset", "Landroidx/compose/ui/unit/IntOffset;", "x", "", "y", "(II)J", "lerp", TtmlNode.START, "stop", "fraction", "", "lerp-81ZRxRo", "(JJF)J", "minus", "Landroidx/compose/ui/geometry/Offset;", TypedValues.CycleType.S_WAVE_OFFSET, "minus-Nv-tHpc", "(JJ)J", "minus-oCl6YwE", "plus", "plus-Nv-tHpc", "plus-oCl6YwE", "round", "round-k-4lQ0M", "(J)J", "toOffset", "toOffset--gyyYBs", "ui-unit_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nIntOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,180:1\n48#2:181\n*S KotlinDebug\n*F\n+ 1 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n39#1:181\n*E\n"})
/* loaded from: classes3.dex */
public final class IntOffsetKt {
    @Stable
    public static final long IntOffset(int i, int i2) {
        return IntOffset.m13788constructorimpl((i2 & 4294967295L) | (i << 32));
    }

    @Stable
    /* renamed from: lerp-81ZRxRo */
    public static final long m13805lerp81ZRxRo(long j, long j2, float f) {
        return IntOffset(MathHelpersKt.lerp(IntOffset.m13794getXimpl(j), IntOffset.m13794getXimpl(j2), f), MathHelpersKt.lerp(IntOffset.m13795getYimpl(j), IntOffset.m13795getYimpl(j2), f));
    }

    @Stable
    /* renamed from: toOffset--gyyYBs */
    public static final long m13811toOffsetgyyYBs(long j) {
        return OffsetKt.Offset(IntOffset.m13794getXimpl(j), IntOffset.m13795getYimpl(j));
    }

    @Stable
    /* renamed from: plus-Nv-tHpc */
    public static final long m13808plusNvtHpc(long j, long j2) {
        return OffsetKt.Offset(Offset.m11099getXimpl(j) + IntOffset.m13794getXimpl(j2), Offset.m11100getYimpl(j) + IntOffset.m13795getYimpl(j2));
    }

    @Stable
    /* renamed from: minus-Nv-tHpc */
    public static final long m13806minusNvtHpc(long j, long j2) {
        return OffsetKt.Offset(Offset.m11099getXimpl(j) - IntOffset.m13794getXimpl(j2), Offset.m11100getYimpl(j) - IntOffset.m13795getYimpl(j2));
    }

    @Stable
    /* renamed from: plus-oCl6YwE */
    public static final long m13809plusoCl6YwE(long j, long j2) {
        return OffsetKt.Offset(IntOffset.m13794getXimpl(j) + Offset.m11099getXimpl(j2), IntOffset.m13795getYimpl(j) + Offset.m11100getYimpl(j2));
    }

    @Stable
    /* renamed from: minus-oCl6YwE */
    public static final long m13807minusoCl6YwE(long j, long j2) {
        return OffsetKt.Offset(IntOffset.m13794getXimpl(j) - Offset.m11099getXimpl(j2), IntOffset.m13795getYimpl(j) - Offset.m11100getYimpl(j2));
    }

    @Stable
    /* renamed from: round-k-4lQ0M */
    public static final long m13810roundk4lQ0M(long j) {
        return IntOffset(MathKt__MathJVMKt.roundToInt(Offset.m11099getXimpl(j)), MathKt__MathJVMKt.roundToInt(Offset.m11100getYimpl(j)));
    }
}
