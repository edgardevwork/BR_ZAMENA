package androidx.compose.p003ui.layout;

import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.node.NodeCoordinator;
import androidx.compose.p003ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt___ComparisonsJvmKt;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: LayoutCoordinates.kt */
@Metadata(m7104d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0002*\u00020\u0002\u001a\u000f\u0010\u0006\u001a\u00020\u0007*\u00020\u0002¢\u0006\u0002\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0007*\u00020\u0002¢\u0006\u0002\u0010\b\u001a\u000f\u0010\n\u001a\u00020\u0007*\u00020\u0002¢\u0006\u0002\u0010\b¨\u0006\u000b"}, m7105d2 = {"boundsInParent", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "boundsInRoot", "boundsInWindow", "findRootCoordinates", "positionInParent", "Landroidx/compose/ui/geometry/Offset;", "(Landroidx/compose/ui/layout/LayoutCoordinates;)J", "positionInRoot", "positionInWindow", "ui_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class LayoutCoordinatesKt {
    public static final long positionInRoot(@NotNull LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.mo12619localToRootMKHz9U(Offset.INSTANCE.m11115getZeroF1C5BW0());
    }

    public static final long positionInWindow(@NotNull LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.mo12620localToWindowMKHz9U(Offset.INSTANCE.m11115getZeroF1C5BW0());
    }

    @NotNull
    public static final Rect boundsInRoot(@NotNull LayoutCoordinates layoutCoordinates) {
        return LayoutCoordinates.localBoundingBoxOf$default(findRootCoordinates(layoutCoordinates), layoutCoordinates, false, 2, null);
    }

    @NotNull
    public static final Rect boundsInWindow(@NotNull LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinatesFindRootCoordinates = findRootCoordinates(layoutCoordinates);
        Rect rectBoundsInRoot = boundsInRoot(layoutCoordinates);
        float fM13836getWidthimpl = IntSize.m13836getWidthimpl(layoutCoordinatesFindRootCoordinates.mo12617getSizeYbymL2g());
        float fM13835getHeightimpl = IntSize.m13835getHeightimpl(layoutCoordinatesFindRootCoordinates.mo12617getSizeYbymL2g());
        float fCoerceIn = RangesKt___RangesKt.coerceIn(rectBoundsInRoot.getLeft(), 0.0f, fM13836getWidthimpl);
        float fCoerceIn2 = RangesKt___RangesKt.coerceIn(rectBoundsInRoot.getTop(), 0.0f, fM13835getHeightimpl);
        float fCoerceIn3 = RangesKt___RangesKt.coerceIn(rectBoundsInRoot.getRight(), 0.0f, fM13836getWidthimpl);
        float fCoerceIn4 = RangesKt___RangesKt.coerceIn(rectBoundsInRoot.getBottom(), 0.0f, fM13835getHeightimpl);
        if (fCoerceIn == fCoerceIn3 || fCoerceIn2 == fCoerceIn4) {
            return Rect.INSTANCE.getZero();
        }
        long jMo12620localToWindowMKHz9U = layoutCoordinatesFindRootCoordinates.mo12620localToWindowMKHz9U(OffsetKt.Offset(fCoerceIn, fCoerceIn2));
        long jMo12620localToWindowMKHz9U2 = layoutCoordinatesFindRootCoordinates.mo12620localToWindowMKHz9U(OffsetKt.Offset(fCoerceIn3, fCoerceIn2));
        long jMo12620localToWindowMKHz9U3 = layoutCoordinatesFindRootCoordinates.mo12620localToWindowMKHz9U(OffsetKt.Offset(fCoerceIn3, fCoerceIn4));
        long jMo12620localToWindowMKHz9U4 = layoutCoordinatesFindRootCoordinates.mo12620localToWindowMKHz9U(OffsetKt.Offset(fCoerceIn, fCoerceIn4));
        return new Rect(ComparisonsKt___ComparisonsJvmKt.minOf(Offset.m11099getXimpl(jMo12620localToWindowMKHz9U), Offset.m11099getXimpl(jMo12620localToWindowMKHz9U2), Offset.m11099getXimpl(jMo12620localToWindowMKHz9U4), Offset.m11099getXimpl(jMo12620localToWindowMKHz9U3)), ComparisonsKt___ComparisonsJvmKt.minOf(Offset.m11100getYimpl(jMo12620localToWindowMKHz9U), Offset.m11100getYimpl(jMo12620localToWindowMKHz9U2), Offset.m11100getYimpl(jMo12620localToWindowMKHz9U4), Offset.m11100getYimpl(jMo12620localToWindowMKHz9U3)), ComparisonsKt___ComparisonsJvmKt.maxOf(Offset.m11099getXimpl(jMo12620localToWindowMKHz9U), Offset.m11099getXimpl(jMo12620localToWindowMKHz9U2), Offset.m11099getXimpl(jMo12620localToWindowMKHz9U4), Offset.m11099getXimpl(jMo12620localToWindowMKHz9U3)), ComparisonsKt___ComparisonsJvmKt.maxOf(Offset.m11100getYimpl(jMo12620localToWindowMKHz9U), Offset.m11100getYimpl(jMo12620localToWindowMKHz9U2), Offset.m11100getYimpl(jMo12620localToWindowMKHz9U4), Offset.m11100getYimpl(jMo12620localToWindowMKHz9U3)));
    }

    public static final long positionInParent(@NotNull LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        return parentLayoutCoordinates != null ? parentLayoutCoordinates.mo12618localPositionOfR5De75A(layoutCoordinates, Offset.INSTANCE.m11115getZeroF1C5BW0()) : Offset.INSTANCE.m11115getZeroF1C5BW0();
    }

    @NotNull
    public static final Rect boundsInParent(@NotNull LayoutCoordinates layoutCoordinates) {
        Rect rectLocalBoundingBoxOf$default;
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        return (parentLayoutCoordinates == null || (rectLocalBoundingBoxOf$default = LayoutCoordinates.localBoundingBoxOf$default(parentLayoutCoordinates, layoutCoordinates, false, 2, null)) == null) ? new Rect(0.0f, 0.0f, IntSize.m13836getWidthimpl(layoutCoordinates.mo12617getSizeYbymL2g()), IntSize.m13835getHeightimpl(layoutCoordinates.mo12617getSizeYbymL2g())) : rectLocalBoundingBoxOf$default;
    }

    @NotNull
    public static final LayoutCoordinates findRootCoordinates(@NotNull LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinates2;
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        while (true) {
            LayoutCoordinates layoutCoordinates3 = parentLayoutCoordinates;
            layoutCoordinates2 = layoutCoordinates;
            layoutCoordinates = layoutCoordinates3;
            if (layoutCoordinates == null) {
                break;
            }
            parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        }
        NodeCoordinator nodeCoordinator = layoutCoordinates2 instanceof NodeCoordinator ? (NodeCoordinator) layoutCoordinates2 : null;
        if (nodeCoordinator == null) {
            return layoutCoordinates2;
        }
        NodeCoordinator wrappedBy = nodeCoordinator.getWrappedBy();
        while (true) {
            NodeCoordinator nodeCoordinator2 = wrappedBy;
            NodeCoordinator nodeCoordinator3 = nodeCoordinator;
            nodeCoordinator = nodeCoordinator2;
            if (nodeCoordinator == null) {
                return nodeCoordinator3;
            }
            wrappedBy = nodeCoordinator.getWrappedBy();
        }
    }
}
