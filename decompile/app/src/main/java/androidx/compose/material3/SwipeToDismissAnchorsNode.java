package androidx.compose.material3;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.node.LayoutModifierNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: SwipeToDismissBox.kt */
@Metadata(m7104d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J&\u0010\u0016\u001a\u00020\u0017*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eR\u000e\u0010\t\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, m7105d2 = {"Landroidx/compose/material3/SwipeToDismissAnchorsNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutModifierNode;", "state", "Landroidx/compose/material3/SwipeToDismissBoxState;", "enableDismissFromStartToEnd", "", "enableDismissFromEndToStart", "(Landroidx/compose/material3/SwipeToDismissBoxState;ZZ)V", "didLookahead", "getEnableDismissFromEndToStart", "()Z", "setEnableDismissFromEndToStart", "(Z)V", "getEnableDismissFromStartToEnd", "setEnableDismissFromStartToEnd", "getState", "()Landroidx/compose/material3/SwipeToDismissBoxState;", "setState", "(Landroidx/compose/material3/SwipeToDismissBoxState;)V", "onDetach", "", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class SwipeToDismissAnchorsNode extends Modifier.Node implements LayoutModifierNode {
    public boolean didLookahead;
    public boolean enableDismissFromEndToStart;
    public boolean enableDismissFromStartToEnd;

    @NotNull
    public SwipeToDismissBoxState state;

    @NotNull
    public final SwipeToDismissBoxState getState() {
        return this.state;
    }

    public final void setState(@NotNull SwipeToDismissBoxState swipeToDismissBoxState) {
        this.state = swipeToDismissBoxState;
    }

    public final boolean getEnableDismissFromStartToEnd() {
        return this.enableDismissFromStartToEnd;
    }

    public final void setEnableDismissFromStartToEnd(boolean z) {
        this.enableDismissFromStartToEnd = z;
    }

    public final boolean getEnableDismissFromEndToStart() {
        return this.enableDismissFromEndToStart;
    }

    public final void setEnableDismissFromEndToStart(boolean z) {
        this.enableDismissFromEndToStart = z;
    }

    public SwipeToDismissAnchorsNode(@NotNull SwipeToDismissBoxState swipeToDismissBoxState, boolean z, boolean z2) {
        this.state = swipeToDismissBoxState;
        this.enableDismissFromStartToEnd = z;
        this.enableDismissFromEndToStart = z2;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.didLookahead = false;
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo7650measure3p2s80s(@NotNull final MeasureScope measureScope, @NotNull Measurable measurable, long j) {
        final Placeable placeableMo12610measureBRTryo0 = measurable.mo12610measureBRTryo0(j);
        if (measureScope.isLookingAhead() || !this.didLookahead) {
            final float width = placeableMo12610measureBRTryo0.getWidth();
            AnchoredDraggableState.updateAnchors$default(this.state.getAnchoredDraggableState$material3_release(), AnchoredDraggableKt.DraggableAnchors(new Function1<DraggableAnchorsConfig<SwipeToDismissBoxValue>, Unit>() { // from class: androidx.compose.material3.SwipeToDismissAnchorsNode$measure$newAnchors$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<SwipeToDismissBoxValue> draggableAnchorsConfig) {
                    invoke2(draggableAnchorsConfig);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull DraggableAnchorsConfig<SwipeToDismissBoxValue> draggableAnchorsConfig) {
                    draggableAnchorsConfig.m96at(SwipeToDismissBoxValue.Settled, 0.0f);
                    if (this.this$0.getEnableDismissFromStartToEnd()) {
                        draggableAnchorsConfig.m96at(SwipeToDismissBoxValue.StartToEnd, width);
                    }
                    if (this.this$0.getEnableDismissFromEndToStart()) {
                        draggableAnchorsConfig.m96at(SwipeToDismissBoxValue.EndToStart, -width);
                    }
                }
            }), null, 2, null);
        }
        this.didLookahead = measureScope.isLookingAhead() || this.didLookahead;
        return MeasureScope.layout$default(measureScope, placeableMo12610measureBRTryo0.getWidth(), placeableMo12610measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.SwipeToDismissAnchorsNode$measure$1
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
                float fRequireOffset;
                if (measureScope.isLookingAhead()) {
                    fRequireOffset = this.getState().getAnchoredDraggableState$material3_release().getAnchors().positionOf(this.getState().getTargetValue());
                } else {
                    fRequireOffset = this.getState().requireOffset();
                }
                Placeable.PlacementScope.place$default(placementScope, placeableMo12610measureBRTryo0, MathKt__MathJVMKt.roundToInt(fRequireOffset), 0, 0.0f, 4, null);
            }
        }, 4, null);
    }
}
