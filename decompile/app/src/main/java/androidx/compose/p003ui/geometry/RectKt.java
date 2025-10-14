package androidx.compose.p003ui.geometry;

import androidx.compose.p003ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Rect.kt */
@Metadata(m7104d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0006\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a \u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\rH\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, m7105d2 = {"Rect", "Landroidx/compose/ui/geometry/Rect;", "topLeft", "Landroidx/compose/ui/geometry/Offset;", "bottomRight", "Rect-0a9Yr6o", "(JJ)Landroidx/compose/ui/geometry/Rect;", TypedValues.CycleType.S_WAVE_OFFSET, "size", "Landroidx/compose/ui/geometry/Size;", "Rect-tz77jQw", TtmlNode.CENTER, "radius", "", "Rect-3MmeM6k", "(JF)Landroidx/compose/ui/geometry/Rect;", "lerp", TtmlNode.START, "stop", "fraction", "ui-geometry_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class RectKt {
    @Stable
    @NotNull
    /* renamed from: Rect-tz77jQw, reason: not valid java name */
    public static final Rect m11139Recttz77jQw(long j, long j2) {
        return new Rect(Offset.m11099getXimpl(j), Offset.m11100getYimpl(j), Offset.m11099getXimpl(j) + Size.m11168getWidthimpl(j2), Offset.m11100getYimpl(j) + Size.m11165getHeightimpl(j2));
    }

    @Stable
    @NotNull
    /* renamed from: Rect-0a9Yr6o, reason: not valid java name */
    public static final Rect m11137Rect0a9Yr6o(long j, long j2) {
        return new Rect(Offset.m11099getXimpl(j), Offset.m11100getYimpl(j), Offset.m11099getXimpl(j2), Offset.m11100getYimpl(j2));
    }

    @Stable
    @NotNull
    /* renamed from: Rect-3MmeM6k, reason: not valid java name */
    public static final Rect m11138Rect3MmeM6k(long j, float f) {
        return new Rect(Offset.m11099getXimpl(j) - f, Offset.m11100getYimpl(j) - f, Offset.m11099getXimpl(j) + f, Offset.m11100getYimpl(j) + f);
    }

    @Stable
    @NotNull
    public static final Rect lerp(@NotNull Rect rect, @NotNull Rect rect2, float f) {
        return new Rect(MathHelpersKt.lerp(rect.getLeft(), rect2.getLeft(), f), MathHelpersKt.lerp(rect.getTop(), rect2.getTop(), f), MathHelpersKt.lerp(rect.getRight(), rect2.getRight(), f), MathHelpersKt.lerp(rect.getBottom(), rect2.getBottom(), f));
    }
}
