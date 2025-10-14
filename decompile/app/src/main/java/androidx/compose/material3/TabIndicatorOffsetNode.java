package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.node.LayoutModifierNode;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TabRow.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ&\u0010\u001f\u001a\u00020 *\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016ø\u0001\u0000¢\u0006\u0004\b&\u0010'R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0011X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R&\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, m7105d2 = {"Landroidx/compose/material3/TabIndicatorOffsetNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutModifierNode;", "tabPositionsState", "Landroidx/compose/runtime/State;", "", "Landroidx/compose/material3/TabPosition;", "selectedTabIndex", "", "followContentSize", "", "(Landroidx/compose/runtime/State;IZ)V", "getFollowContentSize", "()Z", "setFollowContentSize", "(Z)V", "initialOffset", "Landroidx/compose/ui/unit/Dp;", "initialWidth", "offsetAnimatable", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector1D;", "getSelectedTabIndex", "()I", "setSelectedTabIndex", "(I)V", "getTabPositionsState", "()Landroidx/compose/runtime/State;", "setTabPositionsState", "(Landroidx/compose/runtime/State;)V", "widthAnimatable", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class TabIndicatorOffsetNode extends Modifier.Node implements LayoutModifierNode {
    public static final int $stable = 8;
    private boolean followContentSize;

    @Nullable
    private C2046Dp initialOffset;

    @Nullable
    private C2046Dp initialWidth;

    @Nullable
    private Animatable<C2046Dp, AnimationVector1D> offsetAnimatable;
    private int selectedTabIndex;

    @NotNull
    private State<? extends List<TabPosition>> tabPositionsState;

    @Nullable
    private Animatable<C2046Dp, AnimationVector1D> widthAnimatable;

    @NotNull
    public final State<List<TabPosition>> getTabPositionsState() {
        return this.tabPositionsState;
    }

    public final void setTabPositionsState(@NotNull State<? extends List<TabPosition>> state) {
        this.tabPositionsState = state;
    }

    public final int getSelectedTabIndex() {
        return this.selectedTabIndex;
    }

    public final void setSelectedTabIndex(int i) {
        this.selectedTabIndex = i;
    }

    public final boolean getFollowContentSize() {
        return this.followContentSize;
    }

    public final void setFollowContentSize(boolean z) {
        this.followContentSize = z;
    }

    public TabIndicatorOffsetNode(@NotNull State<? extends List<TabPosition>> state, int i, boolean z) {
        this.tabPositionsState = state;
        this.selectedTabIndex = i;
        this.followContentSize = z;
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo7650measure3p2s80s(@NotNull final MeasureScope measureScope, @NotNull Measurable measurable, final long j) {
        Measurable measurable2;
        long jM13613copyZbe2FdA$default;
        if (this.tabPositionsState.getValue().isEmpty()) {
            return MeasureScope.layout$default(measureScope, 0, 0, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TabIndicatorOffsetNode$measure$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.INSTANCE;
                }
            }, 4, null);
        }
        float contentWidth = this.tabPositionsState.getValue().get(this.selectedTabIndex).getContentWidth();
        if (this.followContentSize) {
            if (this.initialWidth != null) {
                Animatable<C2046Dp, AnimationVector1D> animatable = this.widthAnimatable;
                if (animatable == null) {
                    C2046Dp c2046Dp = this.initialWidth;
                    Intrinsics.checkNotNull(c2046Dp);
                    animatable = new Animatable<>(c2046Dp, VectorConvertersKt.getVectorConverter(C2046Dp.INSTANCE), null, null, 12, null);
                    this.widthAnimatable = animatable;
                }
                if (!C2046Dp.m13671equalsimpl0(contentWidth, animatable.getTargetValue().m13680unboximpl())) {
                    BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new TabIndicatorOffsetNode$measure$2(animatable, contentWidth, null), 3, null);
                }
            } else {
                this.initialWidth = C2046Dp.m13664boximpl(contentWidth);
            }
        }
        float left = this.tabPositionsState.getValue().get(this.selectedTabIndex).getLeft();
        if (this.initialOffset != null) {
            Animatable<C2046Dp, AnimationVector1D> animatable2 = this.offsetAnimatable;
            if (animatable2 == null) {
                C2046Dp c2046Dp2 = this.initialOffset;
                Intrinsics.checkNotNull(c2046Dp2);
                animatable2 = new Animatable<>(c2046Dp2, VectorConvertersKt.getVectorConverter(C2046Dp.INSTANCE), null, null, 12, null);
                this.offsetAnimatable = animatable2;
            }
            if (!C2046Dp.m13671equalsimpl0(left, animatable2.getTargetValue().m13680unboximpl())) {
                BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new TabIndicatorOffsetNode$measure$3(animatable2, left, null), 3, null);
            }
        } else {
            this.initialOffset = C2046Dp.m13664boximpl(left);
        }
        Animatable<C2046Dp, AnimationVector1D> animatable3 = this.offsetAnimatable;
        if (animatable3 != null) {
            left = animatable3.getValue().m13680unboximpl();
        }
        final float f = left;
        if (this.followContentSize) {
            Animatable<C2046Dp, AnimationVector1D> animatable4 = this.widthAnimatable;
            if (animatable4 != null) {
                contentWidth = animatable4.getValue().m13680unboximpl();
            }
            jM13613copyZbe2FdA$default = Constraints.m13613copyZbe2FdA$default(j, measureScope.mo7868roundToPx0680j_4(contentWidth), measureScope.mo7868roundToPx0680j_4(contentWidth), 0, 0, 12, null);
            measurable2 = measurable;
        } else {
            measurable2 = measurable;
            jM13613copyZbe2FdA$default = j;
        }
        final Placeable placeableMo12610measureBRTryo0 = measurable2.mo12610measureBRTryo0(jM13613copyZbe2FdA$default);
        return MeasureScope.layout$default(measureScope, placeableMo12610measureBRTryo0.getWidth(), Constraints.m13621getMaxHeightimpl(j), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TabIndicatorOffsetNode$measure$4
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
                Placeable.PlacementScope.place$default(placementScope, placeableMo12610measureBRTryo0, measureScope.mo7868roundToPx0680j_4(f), Constraints.m13621getMaxHeightimpl(j) - placeableMo12610measureBRTryo0.getHeight(), 0.0f, 4, null);
            }
        }, 4, null);
    }
}
