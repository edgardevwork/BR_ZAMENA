package androidx.compose.foundation.layout;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.IntrinsicMeasurable;
import androidx.compose.p003ui.layout.IntrinsicMeasureScope;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.node.LayoutModifierNode;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: Size.kt */
@Metadata(m7104d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\u001c\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u001c\u0010\u0014\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u000fH\u0016J&\u0010\u0016\u001a\u00020\u0017*\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001c\u0010\u001e\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u001c\u0010\u001f\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u000fH\u0016R\"\u0010\u0005\u001a\u00020\u0004X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u00020\u0004X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, m7105d2 = {"Landroidx/compose/foundation/layout/UnspecifiedConstraintsNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "minWidth", "Landroidx/compose/ui/unit/Dp;", "minHeight", "(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getMinHeight-D9Ej5fM", "()F", "setMinHeight-0680j_4", "(F)V", "F", "getMinWidth-D9Ej5fM", "setMinWidth-0680j_4", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "foundation-layout_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class UnspecifiedConstraintsNode extends Modifier.Node implements LayoutModifierNode {
    public float minHeight;
    public float minWidth;

    public /* synthetic */ UnspecifiedConstraintsNode(float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2);
    }

    public /* synthetic */ UnspecifiedConstraintsNode(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C2046Dp.INSTANCE.m13686getUnspecifiedD9Ej5fM() : f, (i & 2) != 0 ? C2046Dp.INSTANCE.m13686getUnspecifiedD9Ej5fM() : f2, null);
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name and from getter */
    public final float getMinWidth() {
        return this.minWidth;
    }

    /* renamed from: setMinWidth-0680j_4, reason: not valid java name */
    public final void m8194setMinWidth0680j_4(float f) {
        this.minWidth = f;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name and from getter */
    public final float getMinHeight() {
        return this.minHeight;
    }

    /* renamed from: setMinHeight-0680j_4, reason: not valid java name */
    public final void m8193setMinHeight0680j_4(float f) {
        this.minHeight = f;
    }

    public UnspecifiedConstraintsNode(float f, float f2) {
        this.minWidth = f;
        this.minHeight = f2;
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo7650measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j) {
        int iM13624getMinWidthimpl;
        int iM13623getMinHeightimpl;
        float f = this.minWidth;
        C2046Dp.Companion companion = C2046Dp.INSTANCE;
        if (!C2046Dp.m13671equalsimpl0(f, companion.m13686getUnspecifiedD9Ej5fM()) && Constraints.m13624getMinWidthimpl(j) == 0) {
            iM13624getMinWidthimpl = RangesKt___RangesKt.coerceAtLeast(RangesKt___RangesKt.coerceAtMost(measureScope.mo7868roundToPx0680j_4(this.minWidth), Constraints.m13622getMaxWidthimpl(j)), 0);
        } else {
            iM13624getMinWidthimpl = Constraints.m13624getMinWidthimpl(j);
        }
        int iM13622getMaxWidthimpl = Constraints.m13622getMaxWidthimpl(j);
        if (!C2046Dp.m13671equalsimpl0(this.minHeight, companion.m13686getUnspecifiedD9Ej5fM()) && Constraints.m13623getMinHeightimpl(j) == 0) {
            iM13623getMinHeightimpl = RangesKt___RangesKt.coerceAtLeast(RangesKt___RangesKt.coerceAtMost(measureScope.mo7868roundToPx0680j_4(this.minHeight), Constraints.m13621getMaxHeightimpl(j)), 0);
        } else {
            iM13623getMinHeightimpl = Constraints.m13623getMinHeightimpl(j);
        }
        final Placeable placeableMo12610measureBRTryo0 = measurable.mo12610measureBRTryo0(ConstraintsKt.Constraints(iM13624getMinWidthimpl, iM13622getMaxWidthimpl, iM13623getMinHeightimpl, Constraints.m13621getMaxHeightimpl(j)));
        return MeasureScope.layout$default(measureScope, placeableMo12610measureBRTryo0.getWidth(), placeableMo12610measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.UnspecifiedConstraintsNode$measure$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo12610measureBRTryo0, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        return RangesKt___RangesKt.coerceAtLeast(intrinsicMeasurable.minIntrinsicWidth(i), !C2046Dp.m13671equalsimpl0(this.minWidth, C2046Dp.INSTANCE.m13686getUnspecifiedD9Ej5fM()) ? intrinsicMeasureScope.mo7868roundToPx0680j_4(this.minWidth) : 0);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        return RangesKt___RangesKt.coerceAtLeast(intrinsicMeasurable.maxIntrinsicWidth(i), !C2046Dp.m13671equalsimpl0(this.minWidth, C2046Dp.INSTANCE.m13686getUnspecifiedD9Ej5fM()) ? intrinsicMeasureScope.mo7868roundToPx0680j_4(this.minWidth) : 0);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        return RangesKt___RangesKt.coerceAtLeast(intrinsicMeasurable.minIntrinsicHeight(i), !C2046Dp.m13671equalsimpl0(this.minHeight, C2046Dp.INSTANCE.m13686getUnspecifiedD9Ej5fM()) ? intrinsicMeasureScope.mo7868roundToPx0680j_4(this.minHeight) : 0);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        return RangesKt___RangesKt.coerceAtLeast(intrinsicMeasurable.maxIntrinsicHeight(i), !C2046Dp.m13671equalsimpl0(this.minHeight, C2046Dp.INSTANCE.m13686getUnspecifiedD9Ej5fM()) ? intrinsicMeasureScope.mo7868roundToPx0680j_4(this.minHeight) : 0);
    }
}
