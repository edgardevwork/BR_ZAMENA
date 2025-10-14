package androidx.compose.p003ui.geometry;

import androidx.compose.p003ui.util.MathHelpersKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: RoundRect.kt */
@Metadata(m7104d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0019\u001a \u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001cø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a@\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001c2\b\b\u0002\u0010 \u001a\u00020\u001c2\b\b\u0002\u0010!\u001a\u00020\u001c2\b\b\u0002\u0010\"\u001a\u00020\u001cø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\u001e\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u0012\u001a8\u0010\u0019\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a6\u0010\u0019\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u0012\u001a\u001e\u0010-\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u00022\u0006\u00100\u001a\u00020\u0012\u001a\u001c\u00101\u001a\u00020\u0002*\u00020\u00022\u0006\u00102\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b3\u00104\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0015\u0010\t\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\u000b\"\u0015\u0010\f\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000b\"\u0015\u0010\r\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b\"\u0015\u0010\u000e\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000b\"\u0015\u0010\u000f\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000b\"\u0015\u0010\u0010\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000b\"\u0015\u0010\u0011\u001a\u00020\u0012*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"\u0015\u0010\u0015\u001a\u00020\u0012*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014\"\u0015\u0010\u0017\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00065"}, m7105d2 = {"boundingRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/geometry/RoundRect;", "getBoundingRect", "(Landroidx/compose/ui/geometry/RoundRect;)Landroidx/compose/ui/geometry/Rect;", TtmlNode.CENTER, "Landroidx/compose/ui/geometry/Offset;", "getCenter", "(Landroidx/compose/ui/geometry/RoundRect;)J", "isCircle", "", "(Landroidx/compose/ui/geometry/RoundRect;)Z", "isEllipse", "isEmpty", "isFinite", "isRect", "isSimple", "maxDimension", "", "getMaxDimension", "(Landroidx/compose/ui/geometry/RoundRect;)F", "minDimension", "getMinDimension", "safeInnerRect", "getSafeInnerRect", "RoundRect", "rect", "cornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "RoundRect-sniSvfs", "(Landroidx/compose/ui/geometry/Rect;J)Landroidx/compose/ui/geometry/RoundRect;", "topLeft", "topRight", "bottomRight", "bottomLeft", "RoundRect-ZAM2FJo", "(Landroidx/compose/ui/geometry/Rect;JJJJ)Landroidx/compose/ui/geometry/RoundRect;", "radiusX", "radiusY", TtmlNode.LEFT, "top", TtmlNode.RIGHT, "bottom", "RoundRect-gG7oq9Y", "(FFFFJ)Landroidx/compose/ui/geometry/RoundRect;", "lerp", TtmlNode.START, "stop", "fraction", "translate", TypedValues.CycleType.S_WAVE_OFFSET, "translate-Uv8p0NA", "(Landroidx/compose/ui/geometry/RoundRect;J)Landroidx/compose/ui/geometry/RoundRect;", "ui-geometry_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class RoundRectKt {
    @NotNull
    public static final RoundRect RoundRect(float f, float f2, float f3, float f4, float f5, float f6) {
        long jCornerRadius = CornerRadiusKt.CornerRadius(f5, f6);
        return new RoundRect(f, f2, f3, f4, jCornerRadius, jCornerRadius, jCornerRadius, jCornerRadius, null);
    }

    @NotNull
    /* renamed from: RoundRect-gG7oq9Y */
    public static final RoundRect m11153RoundRectgG7oq9Y(float f, float f2, float f3, float f4, long j) {
        return RoundRect(f, f2, f3, f4, CornerRadius.m11074getXimpl(j), CornerRadius.m11075getYimpl(j));
    }

    @NotNull
    public static final RoundRect RoundRect(@NotNull Rect rect, float f, float f2) {
        return RoundRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), f, f2);
    }

    @NotNull
    /* renamed from: RoundRect-sniSvfs */
    public static final RoundRect m11154RoundRectsniSvfs(@NotNull Rect rect, long j) {
        return RoundRect(rect, CornerRadius.m11074getXimpl(j), CornerRadius.m11075getYimpl(j));
    }

    @NotNull
    /* renamed from: RoundRect-ZAM2FJo */
    public static final RoundRect m11151RoundRectZAM2FJo(@NotNull Rect rect, long j, long j2, long j3, long j4) {
        return new RoundRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), j, j2, j3, j4, null);
    }

    @NotNull
    /* renamed from: translate-Uv8p0NA */
    public static final RoundRect m11155translateUv8p0NA(@NotNull RoundRect roundRect, long j) {
        return new RoundRect(Offset.m11099getXimpl(j) + roundRect.getLeft(), Offset.m11100getYimpl(j) + roundRect.getTop(), Offset.m11099getXimpl(j) + roundRect.getRight(), Offset.m11100getYimpl(j) + roundRect.getBottom(), roundRect.m11149getTopLeftCornerRadiuskKHJgLs(), roundRect.m11150getTopRightCornerRadiuskKHJgLs(), roundRect.m11148getBottomRightCornerRadiuskKHJgLs(), roundRect.m11147getBottomLeftCornerRadiuskKHJgLs(), null);
    }

    @NotNull
    public static final Rect getBoundingRect(@NotNull RoundRect roundRect) {
        return new Rect(roundRect.getLeft(), roundRect.getTop(), roundRect.getRight(), roundRect.getBottom());
    }

    @NotNull
    public static final Rect getSafeInnerRect(@NotNull RoundRect roundRect) {
        return new Rect(roundRect.getLeft() + (Math.max(CornerRadius.m11074getXimpl(roundRect.m11147getBottomLeftCornerRadiuskKHJgLs()), CornerRadius.m11074getXimpl(roundRect.m11149getTopLeftCornerRadiuskKHJgLs())) * 0.29289323f), roundRect.getTop() + (Math.max(CornerRadius.m11075getYimpl(roundRect.m11149getTopLeftCornerRadiuskKHJgLs()), CornerRadius.m11075getYimpl(roundRect.m11150getTopRightCornerRadiuskKHJgLs())) * 0.29289323f), roundRect.getRight() - (Math.max(CornerRadius.m11074getXimpl(roundRect.m11150getTopRightCornerRadiuskKHJgLs()), CornerRadius.m11074getXimpl(roundRect.m11148getBottomRightCornerRadiuskKHJgLs())) * 0.29289323f), roundRect.getBottom() - (Math.max(CornerRadius.m11075getYimpl(roundRect.m11148getBottomRightCornerRadiuskKHJgLs()), CornerRadius.m11075getYimpl(roundRect.m11147getBottomLeftCornerRadiuskKHJgLs())) * 0.29289323f));
    }

    public static final boolean isEmpty(@NotNull RoundRect roundRect) {
        return roundRect.getLeft() >= roundRect.getRight() || roundRect.getTop() >= roundRect.getBottom();
    }

    public static final boolean isFinite(@NotNull RoundRect roundRect) {
        float left = roundRect.getLeft();
        if (!Float.isInfinite(left) && !Float.isNaN(left)) {
            float top = roundRect.getTop();
            if (!Float.isInfinite(top) && !Float.isNaN(top)) {
                float right = roundRect.getRight();
                if (!Float.isInfinite(right) && !Float.isNaN(right)) {
                    float bottom = roundRect.getBottom();
                    if (!Float.isInfinite(bottom) && !Float.isNaN(bottom)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean isRect(@NotNull RoundRect roundRect) {
        return (CornerRadius.m11074getXimpl(roundRect.m11149getTopLeftCornerRadiuskKHJgLs()) == 0.0f || CornerRadius.m11075getYimpl(roundRect.m11149getTopLeftCornerRadiuskKHJgLs()) == 0.0f) && (CornerRadius.m11074getXimpl(roundRect.m11150getTopRightCornerRadiuskKHJgLs()) == 0.0f || CornerRadius.m11075getYimpl(roundRect.m11150getTopRightCornerRadiuskKHJgLs()) == 0.0f) && ((CornerRadius.m11074getXimpl(roundRect.m11147getBottomLeftCornerRadiuskKHJgLs()) == 0.0f || CornerRadius.m11075getYimpl(roundRect.m11147getBottomLeftCornerRadiuskKHJgLs()) == 0.0f) && (CornerRadius.m11074getXimpl(roundRect.m11148getBottomRightCornerRadiuskKHJgLs()) == 0.0f || CornerRadius.m11075getYimpl(roundRect.m11148getBottomRightCornerRadiuskKHJgLs()) == 0.0f));
    }

    public static final boolean isEllipse(@NotNull RoundRect roundRect) {
        return CornerRadius.m11074getXimpl(roundRect.m11149getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m11074getXimpl(roundRect.m11150getTopRightCornerRadiuskKHJgLs()) && CornerRadius.m11075getYimpl(roundRect.m11149getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m11075getYimpl(roundRect.m11150getTopRightCornerRadiuskKHJgLs()) && CornerRadius.m11074getXimpl(roundRect.m11150getTopRightCornerRadiuskKHJgLs()) == CornerRadius.m11074getXimpl(roundRect.m11148getBottomRightCornerRadiuskKHJgLs()) && CornerRadius.m11075getYimpl(roundRect.m11150getTopRightCornerRadiuskKHJgLs()) == CornerRadius.m11075getYimpl(roundRect.m11148getBottomRightCornerRadiuskKHJgLs()) && CornerRadius.m11074getXimpl(roundRect.m11148getBottomRightCornerRadiuskKHJgLs()) == CornerRadius.m11074getXimpl(roundRect.m11147getBottomLeftCornerRadiuskKHJgLs()) && CornerRadius.m11075getYimpl(roundRect.m11148getBottomRightCornerRadiuskKHJgLs()) == CornerRadius.m11075getYimpl(roundRect.m11147getBottomLeftCornerRadiuskKHJgLs()) && ((double) roundRect.getWidth()) <= ((double) CornerRadius.m11074getXimpl(roundRect.m11149getTopLeftCornerRadiuskKHJgLs())) * 2.0d && ((double) roundRect.getHeight()) <= ((double) CornerRadius.m11075getYimpl(roundRect.m11149getTopLeftCornerRadiuskKHJgLs())) * 2.0d;
    }

    public static final boolean isCircle(@NotNull RoundRect roundRect) {
        return roundRect.getWidth() == roundRect.getHeight() && isEllipse(roundRect);
    }

    public static final float getMinDimension(@NotNull RoundRect roundRect) {
        return Math.min(Math.abs(roundRect.getWidth()), Math.abs(roundRect.getHeight()));
    }

    public static final float getMaxDimension(@NotNull RoundRect roundRect) {
        return Math.max(Math.abs(roundRect.getWidth()), Math.abs(roundRect.getHeight()));
    }

    public static final long getCenter(@NotNull RoundRect roundRect) {
        return OffsetKt.Offset(roundRect.getLeft() + (roundRect.getWidth() / 2.0f), roundRect.getTop() + (roundRect.getHeight() / 2.0f));
    }

    public static final boolean isSimple(@NotNull RoundRect roundRect) {
        return CornerRadius.m11074getXimpl(roundRect.m11149getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m11075getYimpl(roundRect.m11149getTopLeftCornerRadiuskKHJgLs()) && CornerRadius.m11074getXimpl(roundRect.m11149getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m11074getXimpl(roundRect.m11150getTopRightCornerRadiuskKHJgLs()) && CornerRadius.m11074getXimpl(roundRect.m11149getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m11075getYimpl(roundRect.m11150getTopRightCornerRadiuskKHJgLs()) && CornerRadius.m11074getXimpl(roundRect.m11149getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m11074getXimpl(roundRect.m11148getBottomRightCornerRadiuskKHJgLs()) && CornerRadius.m11074getXimpl(roundRect.m11149getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m11075getYimpl(roundRect.m11148getBottomRightCornerRadiuskKHJgLs()) && CornerRadius.m11074getXimpl(roundRect.m11149getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m11074getXimpl(roundRect.m11147getBottomLeftCornerRadiuskKHJgLs()) && CornerRadius.m11074getXimpl(roundRect.m11149getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m11075getYimpl(roundRect.m11147getBottomLeftCornerRadiuskKHJgLs());
    }

    @NotNull
    public static final RoundRect lerp(@NotNull RoundRect roundRect, @NotNull RoundRect roundRect2, float f) {
        return new RoundRect(MathHelpersKt.lerp(roundRect.getLeft(), roundRect2.getLeft(), f), MathHelpersKt.lerp(roundRect.getTop(), roundRect2.getTop(), f), MathHelpersKt.lerp(roundRect.getRight(), roundRect2.getRight(), f), MathHelpersKt.lerp(roundRect.getBottom(), roundRect2.getBottom(), f), CornerRadiusKt.m11085lerp3Ry4LBc(roundRect.m11149getTopLeftCornerRadiuskKHJgLs(), roundRect2.m11149getTopLeftCornerRadiuskKHJgLs(), f), CornerRadiusKt.m11085lerp3Ry4LBc(roundRect.m11150getTopRightCornerRadiuskKHJgLs(), roundRect2.m11150getTopRightCornerRadiuskKHJgLs(), f), CornerRadiusKt.m11085lerp3Ry4LBc(roundRect.m11148getBottomRightCornerRadiuskKHJgLs(), roundRect2.m11148getBottomRightCornerRadiuskKHJgLs(), f), CornerRadiusKt.m11085lerp3Ry4LBc(roundRect.m11147getBottomLeftCornerRadiuskKHJgLs(), roundRect2.m11147getBottomLeftCornerRadiuskKHJgLs(), f), null);
    }
}
