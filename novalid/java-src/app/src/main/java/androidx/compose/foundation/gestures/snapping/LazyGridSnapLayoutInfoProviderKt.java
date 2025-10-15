package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.SplineBasedDecayKt;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.grid.LazyGridItemInfo;
import androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntSize;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: LazyGridSnapLayoutInfoProvider.kt */
@Metadata(m7104d1 = {"\u0000.\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007\u001a\u0014\u0010\u000b\u001a\u00020\u0001*\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0000\u001a\u0014\u0010\u000f\u001a\u00020\u0001*\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0010"}, m7105d2 = {"singleAxisViewportSize", "", "Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "getSingleAxisViewportSize", "(Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;)I", "SnapLayoutInfoProvider", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "lazyGridState", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "positionInLayout", "Landroidx/compose/foundation/gestures/snapping/SnapPositionInLayout;", "offsetOnMainAxis", "Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "sizeOnMainAxis", "foundation_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class LazyGridSnapLayoutInfoProviderKt {
    public static /* synthetic */ SnapLayoutInfoProvider SnapLayoutInfoProvider$default(LazyGridState lazyGridState, SnapPositionInLayout snapPositionInLayout, int i, Object obj) {
        if ((i & 2) != 0) {
            snapPositionInLayout = SnapPositionInLayout.INSTANCE.getCenterToCenter();
        }
        return SnapLayoutInfoProvider(lazyGridState, snapPositionInLayout);
    }

    @ExperimentalFoundationApi
    @NotNull
    public static final SnapLayoutInfoProvider SnapLayoutInfoProvider(@NotNull final LazyGridState lazyGridState, @NotNull final SnapPositionInLayout snapPositionInLayout) {
        return new SnapLayoutInfoProvider() { // from class: androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt.SnapLayoutInfoProvider.1
            private final LazyGridLayoutInfo getLayoutInfo() {
                return lazyGridState.getLayoutInfo();
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateApproachOffset(float initialVelocity) {
                float fCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast((((float) Math.floor(Math.abs(Math.abs(DecayAnimationSpecKt.calculateTargetValue(SplineBasedDecayKt.splineBasedDecay(lazyGridState.getDensity()), 0.0f, initialVelocity))) / averageItemSize())) * averageItemSize()) - averageItemSize(), 0.0f);
                return fCoerceAtLeast == 0.0f ? fCoerceAtLeast : fCoerceAtLeast * Math.signum(initialVelocity);
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private final List<LazyGridItemInfo> singleAxisItems() {
                List<LazyGridItemInfo> visibleItemsInfo = lazyGridState.getLayoutInfo().getVisibleItemsInfo();
                LazyGridState lazyGridState2 = lazyGridState;
                ArrayList arrayList = new ArrayList(visibleItemsInfo.size());
                int size = visibleItemsInfo.size();
                for (int i = 0; i < size; i++) {
                    LazyGridItemInfo lazyGridItemInfo = visibleItemsInfo.get(i);
                    LazyGridItemInfo lazyGridItemInfo2 = lazyGridItemInfo;
                    if (lazyGridState2.getLayoutInfo().getOrientation() == Orientation.Horizontal) {
                        if (lazyGridItemInfo2.getRow() == 0) {
                            arrayList.add(lazyGridItemInfo);
                        }
                    } else if (lazyGridItemInfo2.getColumn() == 0) {
                    }
                }
                return arrayList;
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateSnappingOffset(float currentVelocity) {
                List<LazyGridItemInfo> visibleItemsInfo = getLayoutInfo().getVisibleItemsInfo();
                SnapPositionInLayout snapPositionInLayout2 = snapPositionInLayout;
                int size = visibleItemsInfo.size();
                float f = Float.NEGATIVE_INFINITY;
                float f2 = Float.POSITIVE_INFINITY;
                for (int i = 0; i < size; i++) {
                    LazyGridItemInfo lazyGridItemInfo = visibleItemsInfo.get(i);
                    float fCalculateDistanceToDesiredSnapPosition = SnapPositionInLayoutKt.calculateDistanceToDesiredSnapPosition(LazyGridSnapLayoutInfoProviderKt.getSingleAxisViewportSize(getLayoutInfo()), getLayoutInfo().getBeforeContentPadding(), getLayoutInfo().getAfterContentPadding(), LazyGridSnapLayoutInfoProviderKt.sizeOnMainAxis(lazyGridItemInfo, getLayoutInfo().getOrientation()), LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(lazyGridItemInfo, getLayoutInfo().getOrientation()), lazyGridItemInfo.getIndex(), snapPositionInLayout2);
                    if (fCalculateDistanceToDesiredSnapPosition <= 0.0f && fCalculateDistanceToDesiredSnapPosition > f) {
                        f = fCalculateDistanceToDesiredSnapPosition;
                    }
                    if (fCalculateDistanceToDesiredSnapPosition >= 0.0f && fCalculateDistanceToDesiredSnapPosition < f2) {
                        f2 = fCalculateDistanceToDesiredSnapPosition;
                    }
                }
                return SnapFlingBehaviorKt.m7998calculateFinalOffsetFhqu1e0(LazyListSnapLayoutInfoProviderKt.calculateFinalSnappingItem(lazyGridState.getDensity(), currentVelocity), f, f2);
            }

            public final float averageItemSize() {
                int iM13836getWidthimpl;
                List<LazyGridItemInfo> listSingleAxisItems = singleAxisItems();
                if (!(!listSingleAxisItems.isEmpty())) {
                    return 0.0f;
                }
                int i = 0;
                if (getLayoutInfo().getOrientation() == Orientation.Vertical) {
                    int size = listSingleAxisItems.size();
                    iM13836getWidthimpl = 0;
                    while (i < size) {
                        iM13836getWidthimpl += IntSize.m13835getHeightimpl(listSingleAxisItems.get(i).getSize());
                        i++;
                    }
                } else {
                    int size2 = listSingleAxisItems.size();
                    iM13836getWidthimpl = 0;
                    while (i < size2) {
                        iM13836getWidthimpl += IntSize.m13836getWidthimpl(listSingleAxisItems.get(i).getSize());
                        i++;
                    }
                }
                return iM13836getWidthimpl / listSingleAxisItems.size();
            }
        };
    }

    public static final int getSingleAxisViewportSize(@NotNull LazyGridLayoutInfo lazyGridLayoutInfo) {
        if (lazyGridLayoutInfo.getOrientation() == Orientation.Vertical) {
            return IntSize.m13835getHeightimpl(lazyGridLayoutInfo.mo8260getViewportSizeYbymL2g());
        }
        return IntSize.m13836getWidthimpl(lazyGridLayoutInfo.mo8260getViewportSizeYbymL2g());
    }

    public static final int sizeOnMainAxis(@NotNull LazyGridItemInfo lazyGridItemInfo, @NotNull Orientation orientation) {
        if (orientation == Orientation.Vertical) {
            return IntSize.m13835getHeightimpl(lazyGridItemInfo.getSize());
        }
        return IntSize.m13836getWidthimpl(lazyGridItemInfo.getSize());
    }

    public static final int offsetOnMainAxis(@NotNull LazyGridItemInfo lazyGridItemInfo, @NotNull Orientation orientation) {
        if (orientation == Orientation.Vertical) {
            return IntOffset.m13795getYimpl(lazyGridItemInfo.getOffset());
        }
        return IntOffset.m13794getXimpl(lazyGridItemInfo.getOffset());
    }
}
