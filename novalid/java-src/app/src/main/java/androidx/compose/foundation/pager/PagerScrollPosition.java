package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.gui.fractions.Const;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PagerScrollPosition.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0003J\u0006\u0010\"\u001a\u00020\u0003J\u0016\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0003J\u0016\u0010'\u001a\u00020 2\u0006\u0010&\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u0005J\u0018\u0010)\u001a\u00020 2\u0006\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u0005H\u0002J\u000e\u0010,\u001a\u00020 2\u0006\u0010-\u001a\u00020\u0005J\u000e\u0010.\u001a\u00020 2\u0006\u0010/\u001a\u000200R+\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00038F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR+\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00058F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u00061"}, m7105d2 = {"Landroidx/compose/foundation/pager/PagerScrollPosition;", "", "currentPage", "", "currentPageOffsetFraction", "", "state", "Landroidx/compose/foundation/pager/PagerState;", "(IFLandroidx/compose/foundation/pager/PagerState;)V", "<set-?>", "getCurrentPage", "()I", "setCurrentPage", "(I)V", "currentPage$delegate", "Landroidx/compose/runtime/MutableIntState;", "getCurrentPageOffsetFraction", "()F", "setCurrentPageOffsetFraction", "(F)V", "currentPageOffsetFraction$delegate", "Landroidx/compose/runtime/MutableFloatState;", "hadFirstNotEmptyLayout", "", "lastKnownCurrentPageKey", "nearestRangeState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "getNearestRangeState", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "getState", "()Landroidx/compose/foundation/pager/PagerState;", "applyScrollDelta", "", "delta", "currentScrollOffset", "matchPageWithKey", "itemProvider", "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", FirebaseAnalytics.Param.INDEX, "requestPosition", "scrollOffsetFraction", "update", Const.PAGE_KEY, "pageOffsetFraction", "updateCurrentPageOffsetFraction", "offsetFraction", "updateFromMeasureResult", "measureResult", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nPagerScrollPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerScrollPosition.kt\nandroidx/compose/foundation/pager/PagerScrollPosition\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 4 PagerScrollPosition.kt\nandroidx/compose/foundation/pager/PagerScrollPositionKt\n*L\n1#1,151:1\n75#2:152\n108#2,2:153\n76#3:155\n109#3,2:156\n147#4,4:158\n*S KotlinDebug\n*F\n+ 1 PagerScrollPosition.kt\nandroidx/compose/foundation/pager/PagerScrollPosition\n*L\n40#1:152\n40#1:153,2\n43#1:155\n43#1:156,2\n124#1:158,4\n*E\n"})
/* loaded from: classes2.dex */
public final class PagerScrollPosition {
    public static final int $stable = 8;

    /* renamed from: currentPage$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableIntState currentPage;

    /* renamed from: currentPageOffsetFraction$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableFloatState currentPageOffsetFraction;
    private boolean hadFirstNotEmptyLayout;

    @Nullable
    private Object lastKnownCurrentPageKey;

    @NotNull
    private final LazyLayoutNearestRangeState nearestRangeState;

    @NotNull
    private final PagerState state;

    public PagerScrollPosition(int i, float f, @NotNull PagerState pagerState) {
        this.state = pagerState;
        this.currentPage = SnapshotIntStateKt.mutableIntStateOf(i);
        this.currentPageOffsetFraction = PrimitiveSnapshotStateKt.mutableFloatStateOf(f);
        this.nearestRangeState = new LazyLayoutNearestRangeState(i, 30, 100);
    }

    public /* synthetic */ PagerScrollPosition(int i, float f, PagerState pagerState, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0.0f : f, pagerState);
    }

    @NotNull
    public final PagerState getState() {
        return this.state;
    }

    private final void setCurrentPage(int i) {
        this.currentPage.setIntValue(i);
    }

    public final int getCurrentPage() {
        return this.currentPage.getIntValue();
    }

    private final void setCurrentPageOffsetFraction(float f) {
        this.currentPageOffsetFraction.setFloatValue(f);
    }

    public final float getCurrentPageOffsetFraction() {
        return this.currentPageOffsetFraction.getFloatValue();
    }

    @NotNull
    public final LazyLayoutNearestRangeState getNearestRangeState() {
        return this.nearestRangeState;
    }

    public final void updateFromMeasureResult(@NotNull PagerMeasureResult measureResult) {
        MeasuredPage currentPage = measureResult.getCurrentPage();
        this.lastKnownCurrentPageKey = currentPage != null ? currentPage.getKey() : null;
        if (this.hadFirstNotEmptyLayout || (!measureResult.getVisiblePagesInfo().isEmpty())) {
            this.hadFirstNotEmptyLayout = true;
            MeasuredPage currentPage2 = measureResult.getCurrentPage();
            update(currentPage2 != null ? currentPage2.getIndex() : 0, measureResult.getCurrentPageOffsetFraction());
        }
    }

    public final void requestPosition(int i, float scrollOffsetFraction) {
        update(i, scrollOffsetFraction);
        this.lastKnownCurrentPageKey = null;
    }

    public final int matchPageWithKey(@NotNull PagerLazyLayoutItemProvider itemProvider, int i) {
        int iFindIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(itemProvider, this.lastKnownCurrentPageKey, i);
        if (i != iFindIndexByKey) {
            setCurrentPage(iFindIndexByKey);
            this.nearestRangeState.update(i);
        }
        return iFindIndexByKey;
    }

    private final void update(int i, float pageOffsetFraction) {
        setCurrentPage(i);
        this.nearestRangeState.update(i);
        if (Math.abs(pageOffsetFraction) == 0.0f) {
            pageOffsetFraction = 0.0f;
        }
        setCurrentPageOffsetFraction(pageOffsetFraction);
    }

    public final void updateCurrentPageOffsetFraction(float offsetFraction) {
        setCurrentPageOffsetFraction(offsetFraction);
    }

    public final int currentScrollOffset() {
        return MathKt__MathJVMKt.roundToInt((getCurrentPage() + getCurrentPageOffsetFraction()) * this.state.getPageSizeWithSpacing$foundation_release());
    }

    public final void applyScrollDelta(int delta) {
        setCurrentPageOffsetFraction(getCurrentPageOffsetFraction() + (this.state.getPageSizeWithSpacing$foundation_release() == 0 ? 0.0f : delta / this.state.getPageSizeWithSpacing$foundation_release()));
    }
}
