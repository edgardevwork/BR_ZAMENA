package androidx.compose.foundation.text2.input.internal;

import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.layout.LayoutCoordinates;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: TextLayoutState.kt */
@Metadata(m7104d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001e\u0010\u0006\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001e\u0010\u000b\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, m7105d2 = {"coerceIn", "Landroidx/compose/ui/geometry/Offset;", "rect", "Landroidx/compose/ui/geometry/Rect;", "coerceIn-3MmeM6k", "(JLandroidx/compose/ui/geometry/Rect;)J", "fromDecorationToTextLayout", "Landroidx/compose/foundation/text2/input/internal/TextLayoutState;", TypedValues.CycleType.S_WAVE_OFFSET, "fromDecorationToTextLayout-Uv8p0NA", "(Landroidx/compose/foundation/text2/input/internal/TextLayoutState;J)J", "fromTextLayoutToCore", "fromTextLayoutToCore-Uv8p0NA", "foundation_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nTextLayoutState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayoutState.kt\nandroidx/compose/foundation/text2/input/internal/TextLayoutStateKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,233:1\n1#2:234\n*E\n"})
/* loaded from: classes3.dex */
public final class TextLayoutStateKt {
    /* renamed from: coerceIn-3MmeM6k, reason: not valid java name */
    public static final long m8707coerceIn3MmeM6k(long j, @NotNull Rect rect) {
        float right;
        float bottom;
        if (Offset.m11099getXimpl(j) < rect.getLeft()) {
            right = rect.getLeft();
        } else {
            right = Offset.m11099getXimpl(j) > rect.getRight() ? rect.getRight() : Offset.m11099getXimpl(j);
        }
        if (Offset.m11100getYimpl(j) < rect.getTop()) {
            bottom = rect.getTop();
        } else {
            bottom = Offset.m11100getYimpl(j) > rect.getBottom() ? rect.getBottom() : Offset.m11100getYimpl(j);
        }
        return OffsetKt.Offset(right, bottom);
    }

    /* renamed from: fromTextLayoutToCore-Uv8p0NA, reason: not valid java name */
    public static final long m8709fromTextLayoutToCoreUv8p0NA(@NotNull TextLayoutState textLayoutState, long j) {
        LayoutCoordinates textLayoutNodeCoordinates = textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates == null) {
            return j;
        }
        Offset offsetM11088boximpl = null;
        if (!textLayoutNodeCoordinates.isAttached()) {
            textLayoutNodeCoordinates = null;
        }
        if (textLayoutNodeCoordinates == null) {
            return j;
        }
        LayoutCoordinates coreNodeCoordinates = textLayoutState.getCoreNodeCoordinates();
        if (coreNodeCoordinates != null) {
            if (!coreNodeCoordinates.isAttached()) {
                coreNodeCoordinates = null;
            }
            if (coreNodeCoordinates != null) {
                offsetM11088boximpl = Offset.m11088boximpl(coreNodeCoordinates.mo12618localPositionOfR5De75A(textLayoutNodeCoordinates, j));
            }
        }
        return offsetM11088boximpl != null ? offsetM11088boximpl.getPackedValue() : j;
    }

    /* renamed from: fromDecorationToTextLayout-Uv8p0NA, reason: not valid java name */
    public static final long m8708fromDecorationToTextLayoutUv8p0NA(@NotNull TextLayoutState textLayoutState, long j) {
        Offset offsetM11088boximpl;
        LayoutCoordinates textLayoutNodeCoordinates = textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates == null) {
            return j;
        }
        LayoutCoordinates decoratorNodeCoordinates = textLayoutState.getDecoratorNodeCoordinates();
        if (decoratorNodeCoordinates != null) {
            offsetM11088boximpl = Offset.m11088boximpl((textLayoutNodeCoordinates.isAttached() && decoratorNodeCoordinates.isAttached()) ? textLayoutNodeCoordinates.mo12618localPositionOfR5De75A(decoratorNodeCoordinates, j) : j);
        } else {
            offsetM11088boximpl = null;
        }
        return offsetM11088boximpl != null ? offsetM11088boximpl.getPackedValue() : j;
    }
}
