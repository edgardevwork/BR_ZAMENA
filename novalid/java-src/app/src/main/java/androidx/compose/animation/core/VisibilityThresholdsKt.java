package androidx.compose.animation.core;

import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.geometry.SizeKt;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.DpKt;
import androidx.compose.p003ui.unit.DpOffset;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntOffsetKt;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.unit.IntSizeKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: VisibilityThresholds.kt */
@Metadata(m7104d1 = {"\u0000l\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"(\u0010\u0005\u001a\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0007\u0012\u0004\u0012\u00020\u00010\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\"\u0015\u0010\n\u001a\u00020\u000b*\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u0015\u0010\n\u001a\u00020\u0004*\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0010\"\u0015\u0010\n\u001a\u00020\u0011*\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0013\"\u0015\u0010\n\u001a\u00020\u0014*\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0016\"\u0015\u0010\n\u001a\u00020\u0017*\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0019\"\u0015\u0010\n\u001a\u00020\u001a*\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u001c\"\u0015\u0010\n\u001a\u00020\u001d*\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u001f\"\u0015\u0010\n\u001a\u00020 *\u00020!8F¢\u0006\u0006\u001a\u0004\b\r\u0010\"¨\u0006#"}, m7105d2 = {"DpVisibilityThreshold", "", "PxVisibilityThreshold", "rectVisibilityThreshold", "Landroidx/compose/ui/geometry/Rect;", "visibilityThresholdMap", "", "Landroidx/compose/animation/core/TwoWayConverter;", "getVisibilityThresholdMap", "()Ljava/util/Map;", "VisibilityThreshold", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/geometry/Offset$Companion;", "getVisibilityThreshold", "(Landroidx/compose/ui/geometry/Offset$Companion;)J", "Landroidx/compose/ui/geometry/Rect$Companion;", "(Landroidx/compose/ui/geometry/Rect$Companion;)Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/geometry/Size$Companion;", "(Landroidx/compose/ui/geometry/Size$Companion;)J", "Landroidx/compose/ui/unit/Dp;", "Landroidx/compose/ui/unit/Dp$Companion;", "(Landroidx/compose/ui/unit/Dp$Companion;)F", "Landroidx/compose/ui/unit/DpOffset;", "Landroidx/compose/ui/unit/DpOffset$Companion;", "(Landroidx/compose/ui/unit/DpOffset$Companion;)J", "Landroidx/compose/ui/unit/IntOffset;", "Landroidx/compose/ui/unit/IntOffset$Companion;", "(Landroidx/compose/ui/unit/IntOffset$Companion;)J", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/unit/IntSize$Companion;", "(Landroidx/compose/ui/unit/IntSize$Companion;)J", "", "Lkotlin/Int$Companion;", "(Lkotlin/jvm/internal/IntCompanionObject;)I", "animation-core_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nVisibilityThresholds.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VisibilityThresholds.kt\nandroidx/compose/animation/core/VisibilityThresholdsKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,115:1\n174#2:116\n*S KotlinDebug\n*F\n+ 1 VisibilityThresholds.kt\nandroidx/compose/animation/core/VisibilityThresholdsKt\n*L\n68#1:116\n*E\n"})
/* loaded from: classes.dex */
public final class VisibilityThresholdsKt {
    private static final float DpVisibilityThreshold = 0.1f;
    private static final float PxVisibilityThreshold = 0.5f;

    @NotNull
    private static final Rect rectVisibilityThreshold;

    @NotNull
    private static final Map<TwoWayConverter<?, ?>, Float> visibilityThresholdMap;

    public static final int getVisibilityThreshold(@NotNull IntCompanionObject intCompanionObject) {
        return 1;
    }

    static {
        Float fValueOf = Float.valueOf(0.5f);
        rectVisibilityThreshold = new Rect(0.5f, 0.5f, 0.5f, 0.5f);
        TwoWayConverter<Integer, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE);
        Float fValueOf2 = Float.valueOf(1.0f);
        Pair pairM7112to = TuplesKt.m7112to(vectorConverter, fValueOf2);
        Pair pairM7112to2 = TuplesKt.m7112to(VectorConvertersKt.getVectorConverter(IntSize.INSTANCE), fValueOf2);
        Pair pairM7112to3 = TuplesKt.m7112to(VectorConvertersKt.getVectorConverter(IntOffset.INSTANCE), fValueOf2);
        Pair pairM7112to4 = TuplesKt.m7112to(VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), Float.valueOf(0.01f));
        Pair pairM7112to5 = TuplesKt.m7112to(VectorConvertersKt.getVectorConverter(Rect.INSTANCE), fValueOf);
        Pair pairM7112to6 = TuplesKt.m7112to(VectorConvertersKt.getVectorConverter(Size.INSTANCE), fValueOf);
        Pair pairM7112to7 = TuplesKt.m7112to(VectorConvertersKt.getVectorConverter(Offset.INSTANCE), fValueOf);
        TwoWayConverter<C2046Dp, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(C2046Dp.INSTANCE);
        Float fValueOf3 = Float.valueOf(0.1f);
        visibilityThresholdMap = MapsKt__MapsKt.mapOf(pairM7112to, pairM7112to2, pairM7112to3, pairM7112to4, pairM7112to5, pairM7112to6, pairM7112to7, TuplesKt.m7112to(vectorConverter2, fValueOf3), TuplesKt.m7112to(VectorConvertersKt.getVectorConverter(DpOffset.INSTANCE), fValueOf3));
    }

    public static final long getVisibilityThreshold(@NotNull IntOffset.Companion companion) {
        return IntOffsetKt.IntOffset(1, 1);
    }

    public static final long getVisibilityThreshold(@NotNull Offset.Companion companion) {
        return OffsetKt.Offset(0.5f, 0.5f);
    }

    public static final long getVisibilityThreshold(@NotNull DpOffset.Companion companion) {
        C2046Dp.Companion companion2 = C2046Dp.INSTANCE;
        return DpKt.m13687DpOffsetYgX7TsA(getVisibilityThreshold(companion2), getVisibilityThreshold(companion2));
    }

    public static final long getVisibilityThreshold(@NotNull Size.Companion companion) {
        return SizeKt.Size(0.5f, 0.5f);
    }

    public static final long getVisibilityThreshold(@NotNull IntSize.Companion companion) {
        return IntSizeKt.IntSize(1, 1);
    }

    @NotNull
    public static final Rect getVisibilityThreshold(@NotNull Rect.Companion companion) {
        return rectVisibilityThreshold;
    }

    @NotNull
    public static final Map<TwoWayConverter<?, ?>, Float> getVisibilityThresholdMap() {
        return visibilityThresholdMap;
    }

    public static final float getVisibilityThreshold(@NotNull C2046Dp.Companion companion) {
        return C2046Dp.m13666constructorimpl(0.1f);
    }
}
