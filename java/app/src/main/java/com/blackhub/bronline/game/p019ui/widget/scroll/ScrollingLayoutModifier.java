package com.blackhub.bronline.game.p019ui.widget.scroll;

import androidx.compose.p003ui.layout.IntrinsicMeasurable;
import androidx.compose.p003ui.layout.IntrinsicMeasureScope;
import androidx.compose.p003ui.layout.LayoutModifier;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Scroll.kt */
/* loaded from: classes6.dex */
public final /* data */ class ScrollingLayoutModifier implements LayoutModifier {
    public final boolean isReversed;
    public final boolean isVertical;

    @NotNull
    public final CarouselScrollState scrollerState;

    public static /* synthetic */ ScrollingLayoutModifier copy$default(ScrollingLayoutModifier scrollingLayoutModifier, CarouselScrollState carouselScrollState, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            carouselScrollState = scrollingLayoutModifier.scrollerState;
        }
        if ((i & 2) != 0) {
            z = scrollingLayoutModifier.isReversed;
        }
        if ((i & 4) != 0) {
            z2 = scrollingLayoutModifier.isVertical;
        }
        return scrollingLayoutModifier.copy(carouselScrollState, z, z2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CarouselScrollState getScrollerState() {
        return this.scrollerState;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsReversed() {
        return this.isReversed;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }

    @NotNull
    public final ScrollingLayoutModifier copy(@NotNull CarouselScrollState scrollerState, boolean isReversed, boolean isVertical) {
        Intrinsics.checkNotNullParameter(scrollerState, "scrollerState");
        return new ScrollingLayoutModifier(scrollerState, isReversed, isVertical);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScrollingLayoutModifier)) {
            return false;
        }
        ScrollingLayoutModifier scrollingLayoutModifier = (ScrollingLayoutModifier) other;
        return Intrinsics.areEqual(this.scrollerState, scrollingLayoutModifier.scrollerState) && this.isReversed == scrollingLayoutModifier.isReversed && this.isVertical == scrollingLayoutModifier.isVertical;
    }

    public int hashCode() {
        return (((this.scrollerState.hashCode() * 31) + Boolean.hashCode(this.isReversed)) * 31) + Boolean.hashCode(this.isVertical);
    }

    @NotNull
    public String toString() {
        return "ScrollingLayoutModifier(scrollerState=" + this.scrollerState + ", isReversed=" + this.isReversed + ", isVertical=" + this.isVertical + ")";
    }

    public ScrollingLayoutModifier(@NotNull CarouselScrollState scrollerState, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(scrollerState, "scrollerState");
        this.scrollerState = scrollerState;
        this.isReversed = z;
        this.isVertical = z2;
    }

    @NotNull
    public final CarouselScrollState getScrollerState() {
        return this.scrollerState;
    }

    public final boolean isReversed() {
        return this.isReversed;
    }

    public final boolean isVertical() {
        return this.isVertical;
    }

    @Override // androidx.compose.p003ui.layout.LayoutModifier
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo7625measure3p2s80s(@NotNull MeasureScope measure, @NotNull Measurable measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        ScrollKt.m15106assertNotNestingScrollableContainersK40F9xA(j, this.isVertical);
        final Placeable placeableMo12610measureBRTryo0 = measurable.mo12610measureBRTryo0(Constraints.m13613copyZbe2FdA$default(j, 0, this.isVertical ? Constraints.m13622getMaxWidthimpl(j) : Integer.MAX_VALUE, 0, this.isVertical ? Integer.MAX_VALUE : Constraints.m13621getMaxHeightimpl(j), 5, null));
        int iCoerceAtMost = RangesKt___RangesKt.coerceAtMost(placeableMo12610measureBRTryo0.getWidth(), Constraints.m13622getMaxWidthimpl(j));
        int iCoerceAtMost2 = RangesKt___RangesKt.coerceAtMost(placeableMo12610measureBRTryo0.getHeight(), Constraints.m13621getMaxHeightimpl(j));
        final int height = placeableMo12610measureBRTryo0.getHeight() - iCoerceAtMost2;
        int width = placeableMo12610measureBRTryo0.getWidth() - iCoerceAtMost;
        boolean z = this.isVertical;
        if (!z) {
            height = width;
        }
        final int height2 = z ? placeableMo12610measureBRTryo0.getHeight() : placeableMo12610measureBRTryo0.getWidth();
        return MeasureScope.layout$default(measure, iCoerceAtMost, iCoerceAtMost2, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.ScrollingLayoutModifier$measure$1
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
            public final void invoke2(@NotNull Placeable.PlacementScope layout) {
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                this.this$0.getScrollerState().setMaxValue$app_siteRelease(height);
                this.this$0.getScrollerState().setScrollableLength$app_siteRelease(height2);
                int iCoerceIn = RangesKt___RangesKt.coerceIn(this.this$0.getScrollerState().getValue(), 0, height);
                int i = this.this$0.isReversed() ? iCoerceIn - height : -iCoerceIn;
                Placeable.PlacementScope.placeRelativeWithLayer$default(layout, placeableMo12610measureBRTryo0, this.this$0.isVertical() ? 0 : i, this.this$0.isVertical() ? i : 0, 0.0f, null, 12, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.p003ui.layout.LayoutModifier
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return measurable.minIntrinsicWidth(i);
    }

    @Override // androidx.compose.p003ui.layout.LayoutModifier
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return measurable.minIntrinsicHeight(i);
    }

    @Override // androidx.compose.p003ui.layout.LayoutModifier
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return measurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.p003ui.layout.LayoutModifier
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return measurable.maxIntrinsicHeight(i);
    }
}

