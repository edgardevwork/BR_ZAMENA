package androidx.compose.p003ui.unit;

import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.Constraints;
import kotlin.Metadata;
import kotlin.ranges.RangesKt___RangesKt;

/* compiled from: Constraints.kt */
@Metadata(m7104d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\u001a5\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0007\u001a\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0002\u001a\u001c\u0010\u000b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001e\u0010\u000b\u001a\u00020\u000f*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000e\u001a\u001e\u0010\u0012\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001e\u0010\u0016\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0015\u001a\u001e\u0010\u0019\u001a\u00020\u001a*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a*\u0010\u001d\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010!\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, m7105d2 = {Constraints.TAG, "Landroidx/compose/ui/unit/Constraints;", "minWidth", "", "maxWidth", "minHeight", "maxHeight", "(IIII)J", "addMaxWithMinimum", "max", "value", "constrain", "otherConstraints", "constrain-N9IONVI", "(JJ)J", "Landroidx/compose/ui/unit/IntSize;", "size", "constrain-4WqzIAM", "constrainHeight", "height", "constrainHeight-K40F9xA", "(JI)I", "constrainWidth", "width", "constrainWidth-K40F9xA", "isSatisfiedBy", "", "isSatisfiedBy-4WqzIAM", "(JJ)Z", TypedValues.CycleType.S_WAVE_OFFSET, "horizontal", "vertical", "offset-NN6Ew-U", "(JII)J", "ui-unit_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class ConstraintsKt {
    public static /* synthetic */ long Constraints$default(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return Constraints(i, i2, i3, i4);
    }

    @Stable
    public static final long Constraints(int i, int i2, int i3, int i4) {
        if (i2 < i) {
            throw new IllegalArgumentException(("maxWidth(" + i2 + ") must be >= than minWidth(" + i + ')').toString());
        }
        if (i4 < i3) {
            throw new IllegalArgumentException(("maxHeight(" + i4 + ") must be >= than minHeight(" + i3 + ')').toString());
        }
        if (i < 0 || i3 < 0) {
            throw new IllegalArgumentException(("minWidth(" + i + ") and minHeight(" + i3 + ") must be >= 0").toString());
        }
        return Constraints.INSTANCE.m13629createConstraintsZbe2FdA$ui_unit_release(i, i2, i3, i4);
    }

    /* renamed from: constrain-N9IONVI */
    public static final long m13634constrainN9IONVI(long j, long j2) {
        return Constraints(RangesKt___RangesKt.coerceIn(Constraints.m13624getMinWidthimpl(j2), Constraints.m13624getMinWidthimpl(j), Constraints.m13622getMaxWidthimpl(j)), RangesKt___RangesKt.coerceIn(Constraints.m13622getMaxWidthimpl(j2), Constraints.m13624getMinWidthimpl(j), Constraints.m13622getMaxWidthimpl(j)), RangesKt___RangesKt.coerceIn(Constraints.m13623getMinHeightimpl(j2), Constraints.m13623getMinHeightimpl(j), Constraints.m13621getMaxHeightimpl(j)), RangesKt___RangesKt.coerceIn(Constraints.m13621getMaxHeightimpl(j2), Constraints.m13623getMinHeightimpl(j), Constraints.m13621getMaxHeightimpl(j)));
    }

    @Stable
    /* renamed from: constrain-4WqzIAM */
    public static final long m13633constrain4WqzIAM(long j, long j2) {
        return IntSizeKt.IntSize(RangesKt___RangesKt.coerceIn(IntSize.m13836getWidthimpl(j2), Constraints.m13624getMinWidthimpl(j), Constraints.m13622getMaxWidthimpl(j)), RangesKt___RangesKt.coerceIn(IntSize.m13835getHeightimpl(j2), Constraints.m13623getMinHeightimpl(j), Constraints.m13621getMaxHeightimpl(j)));
    }

    @Stable
    /* renamed from: constrainWidth-K40F9xA */
    public static final int m13636constrainWidthK40F9xA(long j, int i) {
        return RangesKt___RangesKt.coerceIn(i, Constraints.m13624getMinWidthimpl(j), Constraints.m13622getMaxWidthimpl(j));
    }

    @Stable
    /* renamed from: constrainHeight-K40F9xA */
    public static final int m13635constrainHeightK40F9xA(long j, int i) {
        return RangesKt___RangesKt.coerceIn(i, Constraints.m13623getMinHeightimpl(j), Constraints.m13621getMaxHeightimpl(j));
    }

    @Stable
    /* renamed from: isSatisfiedBy-4WqzIAM */
    public static final boolean m13637isSatisfiedBy4WqzIAM(long j, long j2) {
        int iM13624getMinWidthimpl = Constraints.m13624getMinWidthimpl(j);
        int iM13622getMaxWidthimpl = Constraints.m13622getMaxWidthimpl(j);
        int iM13836getWidthimpl = IntSize.m13836getWidthimpl(j2);
        if (iM13624getMinWidthimpl <= iM13836getWidthimpl && iM13836getWidthimpl <= iM13622getMaxWidthimpl) {
            int iM13623getMinHeightimpl = Constraints.m13623getMinHeightimpl(j);
            int iM13621getMaxHeightimpl = Constraints.m13621getMaxHeightimpl(j);
            int iM13835getHeightimpl = IntSize.m13835getHeightimpl(j2);
            if (iM13623getMinHeightimpl <= iM13835getHeightimpl && iM13835getHeightimpl <= iM13621getMaxHeightimpl) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: offset-NN6Ew-U$default */
    public static /* synthetic */ long m13639offsetNN6EwU$default(long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return m13638offsetNN6EwU(j, i, i2);
    }

    @Stable
    /* renamed from: offset-NN6Ew-U */
    public static final long m13638offsetNN6EwU(long j, int i, int i2) {
        return Constraints(RangesKt___RangesKt.coerceAtLeast(Constraints.m13624getMinWidthimpl(j) + i, 0), addMaxWithMinimum(Constraints.m13622getMaxWidthimpl(j), i), RangesKt___RangesKt.coerceAtLeast(Constraints.m13623getMinHeightimpl(j) + i2, 0), addMaxWithMinimum(Constraints.m13621getMaxHeightimpl(j), i2));
    }

    private static final int addMaxWithMinimum(int i, int i2) {
        return i == Integer.MAX_VALUE ? i : RangesKt___RangesKt.coerceAtLeast(i + i2, 0);
    }
}
