package androidx.compose.foundation.layout;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.node.LayoutModifierNode;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.ConstraintsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: Padding.kt */
@Metadata(m7104d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J&\u0010\t\u001a\u00020\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, m7105d2 = {"Landroidx/compose/foundation/layout/PaddingValuesModifier;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Landroidx/compose/foundation/layout/PaddingValues;)V", "getPaddingValues", "()Landroidx/compose/foundation/layout/PaddingValues;", "setPaddingValues", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "foundation-layout_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValuesModifier\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,467:1\n154#2:468\n154#2:469\n154#2:470\n154#2:471\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValuesModifier\n*L\n443#1:468\n444#1:469\n445#1:470\n446#1:471\n*E\n"})
/* loaded from: classes3.dex */
public final class PaddingValuesModifier extends Modifier.Node implements LayoutModifierNode {

    @NotNull
    public PaddingValues paddingValues;

    @NotNull
    public final PaddingValues getPaddingValues() {
        return this.paddingValues;
    }

    public final void setPaddingValues(@NotNull PaddingValues paddingValues) {
        this.paddingValues = paddingValues;
    }

    public PaddingValuesModifier(@NotNull PaddingValues paddingValues) {
        this.paddingValues = paddingValues;
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo7650measure3p2s80s(@NotNull final MeasureScope measureScope, @NotNull Measurable measurable, long j) {
        float f = 0;
        if (C2046Dp.m13665compareTo0680j_4(this.paddingValues.mo8074calculateLeftPaddingu2uoSUM(measureScope.getLayoutDirection()), C2046Dp.m13666constructorimpl(f)) < 0 || C2046Dp.m13665compareTo0680j_4(this.paddingValues.getTop(), C2046Dp.m13666constructorimpl(f)) < 0 || C2046Dp.m13665compareTo0680j_4(this.paddingValues.mo8075calculateRightPaddingu2uoSUM(measureScope.getLayoutDirection()), C2046Dp.m13666constructorimpl(f)) < 0 || C2046Dp.m13665compareTo0680j_4(this.paddingValues.getBottom(), C2046Dp.m13666constructorimpl(f)) < 0) {
            throw new IllegalArgumentException("Padding must be non-negative".toString());
        }
        int iMo7868roundToPx0680j_4 = measureScope.mo7868roundToPx0680j_4(this.paddingValues.mo8074calculateLeftPaddingu2uoSUM(measureScope.getLayoutDirection())) + measureScope.mo7868roundToPx0680j_4(this.paddingValues.mo8075calculateRightPaddingu2uoSUM(measureScope.getLayoutDirection()));
        int iMo7868roundToPx0680j_42 = measureScope.mo7868roundToPx0680j_4(this.paddingValues.getTop()) + measureScope.mo7868roundToPx0680j_4(this.paddingValues.getBottom());
        final Placeable placeableMo12610measureBRTryo0 = measurable.mo12610measureBRTryo0(ConstraintsKt.m13638offsetNN6EwU(j, -iMo7868roundToPx0680j_4, -iMo7868roundToPx0680j_42));
        return MeasureScope.layout$default(measureScope, ConstraintsKt.m13636constrainWidthK40F9xA(j, placeableMo12610measureBRTryo0.getWidth() + iMo7868roundToPx0680j_4), ConstraintsKt.m13635constrainHeightK40F9xA(j, placeableMo12610measureBRTryo0.getHeight() + iMo7868roundToPx0680j_42), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.PaddingValuesModifier$measure$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                Placeable.PlacementScope.place$default(placementScope, placeableMo12610measureBRTryo0, measureScope.mo7868roundToPx0680j_4(this.getPaddingValues().mo8074calculateLeftPaddingu2uoSUM(measureScope.getLayoutDirection())), measureScope.mo7868roundToPx0680j_4(this.getPaddingValues().getTop()), 0.0f, 4, null);
            }
        }, 4, null);
    }
}
