package androidx.compose.foundation.layout;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.IntrinsicMeasurable;
import androidx.compose.p003ui.layout.IntrinsicMeasureScope;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.node.LayoutModifierNode;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: AspectRatio.kt */
@Metadata(m7104d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\u0010\u001a\u00020\u0011*\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0015\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0016H\u0016J\u001c\u0010\u001b\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0016H\u0016J&\u0010\u001d\u001a\u00020\u001e*\u00020\u001f2\u0006\u0010\u0018\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0012H\u0016ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u001c\u0010$\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0016H\u0016J\u001c\u0010%\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0016H\u0016J \u0010&\u001a\u00020\u0011*\u00020\u00122\b\b\u0002\u0010'\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b(\u0010)J \u0010*\u001a\u00020\u0011*\u00020\u00122\b\b\u0002\u0010'\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b+\u0010)J \u0010,\u001a\u00020\u0011*\u00020\u00122\b\b\u0002\u0010'\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b-\u0010)J \u0010.\u001a\u00020\u0011*\u00020\u00122\b\b\u0002\u0010'\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b/\u0010)R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00060"}, m7105d2 = {"Landroidx/compose/foundation/layout/AspectRatioNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "aspectRatio", "", "matchHeightConstraintsFirst", "", "(FZ)V", "getAspectRatio", "()F", "setAspectRatio", "(F)V", "getMatchHeightConstraintsFirst", "()Z", "setMatchHeightConstraintsFirst", "(Z)V", "findSize", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/unit/Constraints;", "findSize-ToXhtMw", "(J)J", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "tryMaxHeight", "enforceConstraints", "tryMaxHeight-JN-0ABg", "(JZ)J", "tryMaxWidth", "tryMaxWidth-JN-0ABg", "tryMinHeight", "tryMinHeight-JN-0ABg", "tryMinWidth", "tryMinWidth-JN-0ABg", "foundation-layout_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nAspectRatio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AspectRatio.kt\nandroidx/compose/foundation/layout/AspectRatioNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,236:1\n1#2:237\n*E\n"})
/* loaded from: classes3.dex */
public final class AspectRatioNode extends Modifier.Node implements LayoutModifierNode {
    public float aspectRatio;
    public boolean matchHeightConstraintsFirst;

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    public final void setAspectRatio(float f) {
        this.aspectRatio = f;
    }

    public final boolean getMatchHeightConstraintsFirst() {
        return this.matchHeightConstraintsFirst;
    }

    public final void setMatchHeightConstraintsFirst(boolean z) {
        this.matchHeightConstraintsFirst = z;
    }

    public AspectRatioNode(float f, boolean z) {
        this.aspectRatio = f;
        this.matchHeightConstraintsFirst = z;
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo7650measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j) {
        long jM8053findSizeToXhtMw = m8053findSizeToXhtMw(j);
        if (!IntSize.m13834equalsimpl0(jM8053findSizeToXhtMw, IntSize.INSTANCE.m13841getZeroYbymL2g())) {
            j = Constraints.INSTANCE.m13630fixedJhjzzOo(IntSize.m13836getWidthimpl(jM8053findSizeToXhtMw), IntSize.m13835getHeightimpl(jM8053findSizeToXhtMw));
        }
        final Placeable placeableMo12610measureBRTryo0 = measurable.mo12610measureBRTryo0(j);
        return MeasureScope.layout$default(measureScope, placeableMo12610measureBRTryo0.getWidth(), placeableMo12610measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.AspectRatioNode$measure$1
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
        if (i != Integer.MAX_VALUE) {
            return MathKt__MathJVMKt.roundToInt(i * this.aspectRatio);
        }
        return intrinsicMeasurable.minIntrinsicWidth(i);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (i != Integer.MAX_VALUE) {
            return MathKt__MathJVMKt.roundToInt(i * this.aspectRatio);
        }
        return intrinsicMeasurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (i != Integer.MAX_VALUE) {
            return MathKt__MathJVMKt.roundToInt(i / this.aspectRatio);
        }
        return intrinsicMeasurable.minIntrinsicHeight(i);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (i != Integer.MAX_VALUE) {
            return MathKt__MathJVMKt.roundToInt(i / this.aspectRatio);
        }
        return intrinsicMeasurable.maxIntrinsicHeight(i);
    }

    /* renamed from: findSize-ToXhtMw, reason: not valid java name */
    public final long m8053findSizeToXhtMw(long j) {
        if (!this.matchHeightConstraintsFirst) {
            long jM8050tryMaxWidthJN0ABg$default = m8050tryMaxWidthJN0ABg$default(this, j, false, 1, null);
            IntSize.Companion companion = IntSize.INSTANCE;
            if (!IntSize.m13834equalsimpl0(jM8050tryMaxWidthJN0ABg$default, companion.m13841getZeroYbymL2g())) {
                return jM8050tryMaxWidthJN0ABg$default;
            }
            long jM8049tryMaxHeightJN0ABg$default = m8049tryMaxHeightJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m13834equalsimpl0(jM8049tryMaxHeightJN0ABg$default, companion.m13841getZeroYbymL2g())) {
                return jM8049tryMaxHeightJN0ABg$default;
            }
            long jM8052tryMinWidthJN0ABg$default = m8052tryMinWidthJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m13834equalsimpl0(jM8052tryMinWidthJN0ABg$default, companion.m13841getZeroYbymL2g())) {
                return jM8052tryMinWidthJN0ABg$default;
            }
            long jM8051tryMinHeightJN0ABg$default = m8051tryMinHeightJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m13834equalsimpl0(jM8051tryMinHeightJN0ABg$default, companion.m13841getZeroYbymL2g())) {
                return jM8051tryMinHeightJN0ABg$default;
            }
            long jM8055tryMaxWidthJN0ABg = m8055tryMaxWidthJN0ABg(j, false);
            if (!IntSize.m13834equalsimpl0(jM8055tryMaxWidthJN0ABg, companion.m13841getZeroYbymL2g())) {
                return jM8055tryMaxWidthJN0ABg;
            }
            long jM8054tryMaxHeightJN0ABg = m8054tryMaxHeightJN0ABg(j, false);
            if (!IntSize.m13834equalsimpl0(jM8054tryMaxHeightJN0ABg, companion.m13841getZeroYbymL2g())) {
                return jM8054tryMaxHeightJN0ABg;
            }
            long jM8057tryMinWidthJN0ABg = m8057tryMinWidthJN0ABg(j, false);
            if (!IntSize.m13834equalsimpl0(jM8057tryMinWidthJN0ABg, companion.m13841getZeroYbymL2g())) {
                return jM8057tryMinWidthJN0ABg;
            }
            long jM8056tryMinHeightJN0ABg = m8056tryMinHeightJN0ABg(j, false);
            if (!IntSize.m13834equalsimpl0(jM8056tryMinHeightJN0ABg, companion.m13841getZeroYbymL2g())) {
                return jM8056tryMinHeightJN0ABg;
            }
        } else {
            long jM8049tryMaxHeightJN0ABg$default2 = m8049tryMaxHeightJN0ABg$default(this, j, false, 1, null);
            IntSize.Companion companion2 = IntSize.INSTANCE;
            if (!IntSize.m13834equalsimpl0(jM8049tryMaxHeightJN0ABg$default2, companion2.m13841getZeroYbymL2g())) {
                return jM8049tryMaxHeightJN0ABg$default2;
            }
            long jM8050tryMaxWidthJN0ABg$default2 = m8050tryMaxWidthJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m13834equalsimpl0(jM8050tryMaxWidthJN0ABg$default2, companion2.m13841getZeroYbymL2g())) {
                return jM8050tryMaxWidthJN0ABg$default2;
            }
            long jM8051tryMinHeightJN0ABg$default2 = m8051tryMinHeightJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m13834equalsimpl0(jM8051tryMinHeightJN0ABg$default2, companion2.m13841getZeroYbymL2g())) {
                return jM8051tryMinHeightJN0ABg$default2;
            }
            long jM8052tryMinWidthJN0ABg$default2 = m8052tryMinWidthJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m13834equalsimpl0(jM8052tryMinWidthJN0ABg$default2, companion2.m13841getZeroYbymL2g())) {
                return jM8052tryMinWidthJN0ABg$default2;
            }
            long jM8054tryMaxHeightJN0ABg2 = m8054tryMaxHeightJN0ABg(j, false);
            if (!IntSize.m13834equalsimpl0(jM8054tryMaxHeightJN0ABg2, companion2.m13841getZeroYbymL2g())) {
                return jM8054tryMaxHeightJN0ABg2;
            }
            long jM8055tryMaxWidthJN0ABg2 = m8055tryMaxWidthJN0ABg(j, false);
            if (!IntSize.m13834equalsimpl0(jM8055tryMaxWidthJN0ABg2, companion2.m13841getZeroYbymL2g())) {
                return jM8055tryMaxWidthJN0ABg2;
            }
            long jM8056tryMinHeightJN0ABg2 = m8056tryMinHeightJN0ABg(j, false);
            if (!IntSize.m13834equalsimpl0(jM8056tryMinHeightJN0ABg2, companion2.m13841getZeroYbymL2g())) {
                return jM8056tryMinHeightJN0ABg2;
            }
            long jM8057tryMinWidthJN0ABg2 = m8057tryMinWidthJN0ABg(j, false);
            if (!IntSize.m13834equalsimpl0(jM8057tryMinWidthJN0ABg2, companion2.m13841getZeroYbymL2g())) {
                return jM8057tryMinWidthJN0ABg2;
            }
        }
        return IntSize.INSTANCE.m13841getZeroYbymL2g();
    }

    /* renamed from: tryMaxWidth-JN-0ABg$default, reason: not valid java name */
    public static /* synthetic */ long m8050tryMaxWidthJN0ABg$default(AspectRatioNode aspectRatioNode, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioNode.m8055tryMaxWidthJN0ABg(j, z);
    }

    /* renamed from: tryMaxWidth-JN-0ABg, reason: not valid java name */
    public final long m8055tryMaxWidthJN0ABg(long j, boolean z) {
        int iRoundToInt;
        int iM13622getMaxWidthimpl = Constraints.m13622getMaxWidthimpl(j);
        if (iM13622getMaxWidthimpl != Integer.MAX_VALUE && (iRoundToInt = MathKt__MathJVMKt.roundToInt(iM13622getMaxWidthimpl / this.aspectRatio)) > 0) {
            long jIntSize = IntSizeKt.IntSize(iM13622getMaxWidthimpl, iRoundToInt);
            if (!z || ConstraintsKt.m13637isSatisfiedBy4WqzIAM(j, jIntSize)) {
                return jIntSize;
            }
        }
        return IntSize.INSTANCE.m13841getZeroYbymL2g();
    }

    /* renamed from: tryMaxHeight-JN-0ABg$default, reason: not valid java name */
    public static /* synthetic */ long m8049tryMaxHeightJN0ABg$default(AspectRatioNode aspectRatioNode, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioNode.m8054tryMaxHeightJN0ABg(j, z);
    }

    /* renamed from: tryMaxHeight-JN-0ABg, reason: not valid java name */
    public final long m8054tryMaxHeightJN0ABg(long j, boolean z) {
        int iRoundToInt;
        int iM13621getMaxHeightimpl = Constraints.m13621getMaxHeightimpl(j);
        if (iM13621getMaxHeightimpl != Integer.MAX_VALUE && (iRoundToInt = MathKt__MathJVMKt.roundToInt(iM13621getMaxHeightimpl * this.aspectRatio)) > 0) {
            long jIntSize = IntSizeKt.IntSize(iRoundToInt, iM13621getMaxHeightimpl);
            if (!z || ConstraintsKt.m13637isSatisfiedBy4WqzIAM(j, jIntSize)) {
                return jIntSize;
            }
        }
        return IntSize.INSTANCE.m13841getZeroYbymL2g();
    }

    /* renamed from: tryMinWidth-JN-0ABg$default, reason: not valid java name */
    public static /* synthetic */ long m8052tryMinWidthJN0ABg$default(AspectRatioNode aspectRatioNode, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioNode.m8057tryMinWidthJN0ABg(j, z);
    }

    /* renamed from: tryMinWidth-JN-0ABg, reason: not valid java name */
    public final long m8057tryMinWidthJN0ABg(long j, boolean z) {
        int iM13624getMinWidthimpl = Constraints.m13624getMinWidthimpl(j);
        int iRoundToInt = MathKt__MathJVMKt.roundToInt(iM13624getMinWidthimpl / this.aspectRatio);
        if (iRoundToInt > 0) {
            long jIntSize = IntSizeKt.IntSize(iM13624getMinWidthimpl, iRoundToInt);
            if (!z || ConstraintsKt.m13637isSatisfiedBy4WqzIAM(j, jIntSize)) {
                return jIntSize;
            }
        }
        return IntSize.INSTANCE.m13841getZeroYbymL2g();
    }

    /* renamed from: tryMinHeight-JN-0ABg$default, reason: not valid java name */
    public static /* synthetic */ long m8051tryMinHeightJN0ABg$default(AspectRatioNode aspectRatioNode, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioNode.m8056tryMinHeightJN0ABg(j, z);
    }

    /* renamed from: tryMinHeight-JN-0ABg, reason: not valid java name */
    public final long m8056tryMinHeightJN0ABg(long j, boolean z) {
        int iM13623getMinHeightimpl = Constraints.m13623getMinHeightimpl(j);
        int iRoundToInt = MathKt__MathJVMKt.roundToInt(iM13623getMinHeightimpl * this.aspectRatio);
        if (iRoundToInt > 0) {
            long jIntSize = IntSizeKt.IntSize(iRoundToInt, iM13623getMinHeightimpl);
            if (!z || ConstraintsKt.m13637isSatisfiedBy4WqzIAM(j, jIntSize)) {
                return jIntSize;
            }
        }
        return IntSize.INSTANCE.m13841getZeroYbymL2g();
    }
}
