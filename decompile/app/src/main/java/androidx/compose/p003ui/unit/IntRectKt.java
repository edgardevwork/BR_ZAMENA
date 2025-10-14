package androidx.compose.p003ui.unit;

import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: IntRect.kt */
@Metadata(m7104d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0006\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a \u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0014H\u0007\u001a\f\u0010\u0015\u001a\u00020\u0001*\u00020\u0016H\u0007\u001a\f\u0010\u0017\u001a\u00020\u0016*\u00020\u0001H\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, m7105d2 = {"IntRect", "Landroidx/compose/ui/unit/IntRect;", "topLeft", "Landroidx/compose/ui/unit/IntOffset;", "bottomRight", "IntRect-E1MhUcY", "(JJ)Landroidx/compose/ui/unit/IntRect;", TypedValues.CycleType.S_WAVE_OFFSET, "size", "Landroidx/compose/ui/unit/IntSize;", "IntRect-VbeCjmY", TtmlNode.CENTER, "radius", "", "IntRect-ar5cAso", "(JI)Landroidx/compose/ui/unit/IntRect;", "lerp", TtmlNode.START, "stop", "fraction", "", "roundToIntRect", "Landroidx/compose/ui/geometry/Rect;", "toRect", "ui-unit_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class IntRectKt {
    @Stable
    @NotNull
    /* renamed from: IntRect-VbeCjmY, reason: not valid java name */
    public static final IntRect m13826IntRectVbeCjmY(long j, long j2) {
        return new IntRect(IntOffset.m13794getXimpl(j), IntOffset.m13795getYimpl(j), IntOffset.m13794getXimpl(j) + IntSize.m13836getWidthimpl(j2), IntOffset.m13795getYimpl(j) + IntSize.m13835getHeightimpl(j2));
    }

    @Stable
    @NotNull
    /* renamed from: IntRect-E1MhUcY, reason: not valid java name */
    public static final IntRect m13825IntRectE1MhUcY(long j, long j2) {
        return new IntRect(IntOffset.m13794getXimpl(j), IntOffset.m13795getYimpl(j), IntOffset.m13794getXimpl(j2), IntOffset.m13795getYimpl(j2));
    }

    @Stable
    @NotNull
    /* renamed from: IntRect-ar5cAso, reason: not valid java name */
    public static final IntRect m13827IntRectar5cAso(long j, int i) {
        return new IntRect(IntOffset.m13794getXimpl(j) - i, IntOffset.m13795getYimpl(j) - i, IntOffset.m13794getXimpl(j) + i, IntOffset.m13795getYimpl(j) + i);
    }

    @Stable
    @NotNull
    public static final IntRect lerp(@NotNull IntRect intRect, @NotNull IntRect intRect2, float f) {
        return new IntRect(MathHelpersKt.lerp(intRect.getLeft(), intRect2.getLeft(), f), MathHelpersKt.lerp(intRect.getTop(), intRect2.getTop(), f), MathHelpersKt.lerp(intRect.getRight(), intRect2.getRight(), f), MathHelpersKt.lerp(intRect.getBottom(), intRect2.getBottom(), f));
    }

    @Stable
    @NotNull
    public static final Rect toRect(@NotNull IntRect intRect) {
        return new Rect(intRect.getLeft(), intRect.getTop(), intRect.getRight(), intRect.getBottom());
    }

    @Stable
    @NotNull
    public static final IntRect roundToIntRect(@NotNull Rect rect) {
        return new IntRect(MathKt__MathJVMKt.roundToInt(rect.getLeft()), MathKt__MathJVMKt.roundToInt(rect.getTop()), MathKt__MathJVMKt.roundToInt(rect.getRight()), MathKt__MathJVMKt.roundToInt(rect.getBottom()));
    }
}
