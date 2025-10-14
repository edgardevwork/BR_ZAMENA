package androidx.compose.foundation.pager;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p003ui.unit.IntSize;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: PagerLayoutInfo.kt */
@Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m7105d2 = {"mainAxisViewportSize", "", "Landroidx/compose/foundation/pager/PagerLayoutInfo;", "getMainAxisViewportSize$annotations", "(Landroidx/compose/foundation/pager/PagerLayoutInfo;)V", "getMainAxisViewportSize", "(Landroidx/compose/foundation/pager/PagerLayoutInfo;)I", "foundation_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class PagerLayoutInfoKt {
    @ExperimentalFoundationApi
    public static /* synthetic */ void getMainAxisViewportSize$annotations(PagerLayoutInfo pagerLayoutInfo) {
    }

    public static final int getMainAxisViewportSize(@NotNull PagerLayoutInfo pagerLayoutInfo) {
        return pagerLayoutInfo.getOrientation() == Orientation.Vertical ? IntSize.m13835getHeightimpl(pagerLayoutInfo.mo8352getViewportSizeYbymL2g()) : IntSize.m13836getWidthimpl(pagerLayoutInfo.mo8352getViewportSizeYbymL2g());
    }
}
