package com.airbnb.lottie.compose;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.node.LayoutModifierNode;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.unit.IntSizeKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: LottieAnimationSizeNode.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J&\u0010\r\u001a\u00020\u000e*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, m7105d2 = {"Lcom/airbnb/lottie/compose/LottieAnimationSizeNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutModifierNode;", "width", "", "height", "(II)V", "getHeight", "()I", "setHeight", "(I)V", "getWidth", "setWidth", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "lottie-compose_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class LottieAnimationSizeNode extends Modifier.Node implements LayoutModifierNode {
    public static final int $stable = 8;
    public int height;
    public int width;

    public final int getWidth() {
        return this.width;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    public final int getHeight() {
        return this.height;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public LottieAnimationSizeNode(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo7650measure3p2s80s(@NotNull MeasureScope measure, @NotNull Measurable measurable, long j) {
        long jConstraints;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long jM13633constrain4WqzIAM = ConstraintsKt.m13633constrain4WqzIAM(j, IntSizeKt.IntSize(this.width, this.height));
        if (Constraints.m13621getMaxHeightimpl(j) == Integer.MAX_VALUE && Constraints.m13622getMaxWidthimpl(j) != Integer.MAX_VALUE) {
            jConstraints = ConstraintsKt.Constraints(IntSize.m13836getWidthimpl(jM13633constrain4WqzIAM), IntSize.m13836getWidthimpl(jM13633constrain4WqzIAM), (IntSize.m13836getWidthimpl(jM13633constrain4WqzIAM) * this.height) / this.width, (IntSize.m13836getWidthimpl(jM13633constrain4WqzIAM) * this.height) / this.width);
        } else if (Constraints.m13622getMaxWidthimpl(j) == Integer.MAX_VALUE && Constraints.m13621getMaxHeightimpl(j) != Integer.MAX_VALUE) {
            jConstraints = ConstraintsKt.Constraints((IntSize.m13835getHeightimpl(jM13633constrain4WqzIAM) * this.width) / this.height, (IntSize.m13835getHeightimpl(jM13633constrain4WqzIAM) * this.width) / this.height, IntSize.m13835getHeightimpl(jM13633constrain4WqzIAM), IntSize.m13835getHeightimpl(jM13633constrain4WqzIAM));
        } else {
            jConstraints = ConstraintsKt.Constraints(IntSize.m13836getWidthimpl(jM13633constrain4WqzIAM), IntSize.m13836getWidthimpl(jM13633constrain4WqzIAM), IntSize.m13835getHeightimpl(jM13633constrain4WqzIAM), IntSize.m13835getHeightimpl(jM13633constrain4WqzIAM));
        }
        final Placeable placeableMo12610measureBRTryo0 = measurable.mo12610measureBRTryo0(jConstraints);
        return MeasureScope.layout$default(measure, placeableMo12610measureBRTryo0.getWidth(), placeableMo12610measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.airbnb.lottie.compose.LottieAnimationSizeNode$measure$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Placeable.PlacementScope layout) {
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                Placeable.PlacementScope.placeRelative$default(layout, placeableMo12610measureBRTryo0, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }
}
