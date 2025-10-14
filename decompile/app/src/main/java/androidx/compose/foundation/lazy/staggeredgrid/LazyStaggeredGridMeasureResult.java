package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p003ui.layout.AlignmentLine;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: LazyStaggeredGridMeasureResult.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u000e\u0012\u0006\u0010\u0018\u001a\u00020\u000e¢\u0006\u0002\u0010\u0019J\t\u0010C\u001a\u00020DH\u0096\u0001J\u000e\u0010E\u001a\u00020\n2\u0006\u0010F\u001a\u00020\u000eR\u0014\u0010\u0017\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000e0\u001dX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010\u0016\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0011\u0010\"\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010$\"\u0004\b&\u0010'R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010-R\u0012\u0010/\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b0\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010$R\u0014\u0010\u0018\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001bR\u0011\u0010\b\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0014\u00104\u001a\u000205X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b8\u0010$R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\u001bR\u0014\u0010\u0015\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\u001bR\u001c\u0010\u0012\u001a\u00020\u0013X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010=\u001a\u0004\b;\u0010<R\u0014\u0010\u0014\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010\u001bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0012\u0010A\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\bB\u0010\u001b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006G"}, m7105d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "Landroidx/compose/ui/layout/MeasureResult;", "firstVisibleItemIndices", "", "firstVisibleItemScrollOffsets", "consumedScroll", "", "measureResult", "canScrollForward", "", "isVertical", "remeasureNeeded", "totalItemsCount", "", "visibleItemsInfo", "", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "viewportSize", "Landroidx/compose/ui/unit/IntSize;", "viewportStartOffset", "viewportEndOffset", "beforeContentPadding", "afterContentPadding", "mainAxisItemSpacing", "([I[IFLandroidx/compose/ui/layout/MeasureResult;ZZZILjava/util/List;JIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAfterContentPadding", "()I", "alignmentLines", "", "Landroidx/compose/ui/layout/AlignmentLine;", "getAlignmentLines", "()Ljava/util/Map;", "getBeforeContentPadding", "canScrollBackward", "getCanScrollBackward", "()Z", "getCanScrollForward", "setCanScrollForward", "(Z)V", "getConsumedScroll", "()F", "setConsumedScroll", "(F)V", "getFirstVisibleItemIndices", "()[I", "getFirstVisibleItemScrollOffsets", "height", "getHeight", "getMainAxisItemSpacing", "getMeasureResult", "()Landroidx/compose/ui/layout/MeasureResult;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "getRemeasureNeeded", "getTotalItemsCount", "getViewportEndOffset", "getViewportSize-YbymL2g", "()J", "J", "getViewportStartOffset", "getVisibleItemsInfo", "()Ljava/util/List;", "width", "getWidth", "placeChildren", "", "tryToApplyScrollWithoutRemeasure", "delta", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasureResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasureResult.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,249:1\n33#2,6:250\n33#2,6:256\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasureResult.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult\n*L\n181#1:250,6\n214#1:256,6\n*E\n"})
/* loaded from: classes2.dex */
public final class LazyStaggeredGridMeasureResult implements LazyStaggeredGridLayoutInfo, MeasureResult {
    public static final int $stable = 8;
    private final int afterContentPadding;
    private final int beforeContentPadding;
    private boolean canScrollForward;
    private float consumedScroll;

    @NotNull
    private final int[] firstVisibleItemIndices;

    @NotNull
    private final int[] firstVisibleItemScrollOffsets;
    private final boolean isVertical;
    private final int mainAxisItemSpacing;

    @NotNull
    private final MeasureResult measureResult;

    @NotNull
    private final Orientation orientation;
    private final boolean remeasureNeeded;
    private final int totalItemsCount;
    private final int viewportEndOffset;
    private final long viewportSize;
    private final int viewportStartOffset;

    @NotNull
    private final List<LazyStaggeredGridMeasuredItem> visibleItemsInfo;

    public /* synthetic */ LazyStaggeredGridMeasureResult(int[] iArr, int[] iArr2, float f, MeasureResult measureResult, boolean z, boolean z2, boolean z3, int i, List list, long j, int i2, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(iArr, iArr2, f, measureResult, z, z2, z3, i, list, j, i2, i3, i4, i5, i6);
    }

    @Override // androidx.compose.p003ui.layout.MeasureResult
    @NotNull
    public Map<AlignmentLine, Integer> getAlignmentLines() {
        return this.measureResult.getAlignmentLines();
    }

    @Override // androidx.compose.p003ui.layout.MeasureResult
    /* renamed from: getHeight */
    public int get$height() {
        return this.measureResult.get$height();
    }

    @Override // androidx.compose.p003ui.layout.MeasureResult
    /* renamed from: getWidth */
    public int get$width() {
        return this.measureResult.get$width();
    }

    @Override // androidx.compose.p003ui.layout.MeasureResult
    public void placeChildren() {
        this.measureResult.placeChildren();
    }

    private LazyStaggeredGridMeasureResult(int[] iArr, int[] iArr2, float f, MeasureResult measureResult, boolean z, boolean z2, boolean z3, int i, List<LazyStaggeredGridMeasuredItem> list, long j, int i2, int i3, int i4, int i5, int i6) {
        this.firstVisibleItemIndices = iArr;
        this.firstVisibleItemScrollOffsets = iArr2;
        this.consumedScroll = f;
        this.measureResult = measureResult;
        this.canScrollForward = z;
        this.isVertical = z2;
        this.remeasureNeeded = z3;
        this.totalItemsCount = i;
        this.visibleItemsInfo = list;
        this.viewportSize = j;
        this.viewportStartOffset = i2;
        this.viewportEndOffset = i3;
        this.beforeContentPadding = i4;
        this.afterContentPadding = i5;
        this.mainAxisItemSpacing = i6;
        this.orientation = z2 ? Orientation.Vertical : Orientation.Horizontal;
    }

    @NotNull
    public final int[] getFirstVisibleItemIndices() {
        return this.firstVisibleItemIndices;
    }

    @NotNull
    public final int[] getFirstVisibleItemScrollOffsets() {
        return this.firstVisibleItemScrollOffsets;
    }

    public final float getConsumedScroll() {
        return this.consumedScroll;
    }

    public final void setConsumedScroll(float f) {
        this.consumedScroll = f;
    }

    @NotNull
    public final MeasureResult getMeasureResult() {
        return this.measureResult;
    }

    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    public final void setCanScrollForward(boolean z) {
        this.canScrollForward = z;
    }

    /* renamed from: isVertical, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }

    public final boolean getRemeasureNeeded() {
        return this.remeasureNeeded;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getTotalItemsCount() {
        return this.totalItemsCount;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    @NotNull
    public List<LazyStaggeredGridMeasuredItem> getVisibleItemsInfo() {
        return this.visibleItemsInfo;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    /* renamed from: getViewportSize-YbymL2g, reason: from getter */
    public long getViewportSize() {
        return this.viewportSize;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getBeforeContentPadding() {
        return this.beforeContentPadding;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getMainAxisItemSpacing() {
        return this.mainAxisItemSpacing;
    }

    public final boolean getCanScrollBackward() {
        return this.firstVisibleItemIndices[0] != 0 || this.firstVisibleItemScrollOffsets[0] > 0;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    @NotNull
    public Orientation getOrientation() {
        return this.orientation;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0074, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a9, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean tryToApplyScrollWithoutRemeasure(int delta) {
        if (this.remeasureNeeded || getVisibleItemsInfo().isEmpty() || this.firstVisibleItemIndices.length == 0 || this.firstVisibleItemScrollOffsets.length == 0) {
            return false;
        }
        List<LazyStaggeredGridMeasuredItem> visibleItemsInfo = getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                int length = this.firstVisibleItemScrollOffsets.length;
                for (int i2 = 0; i2 < length; i2++) {
                    int[] iArr = this.firstVisibleItemScrollOffsets;
                    iArr[i2] = iArr[i2] - delta;
                }
                List<LazyStaggeredGridMeasuredItem> visibleItemsInfo2 = getVisibleItemsInfo();
                int size2 = visibleItemsInfo2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    visibleItemsInfo2.get(i3).applyScrollDelta(delta);
                }
                this.consumedScroll = delta;
                if (!this.canScrollForward && delta > 0) {
                    this.canScrollForward = true;
                }
                return true;
            }
            LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem = visibleItemsInfo.get(i);
            if (lazyStaggeredGridMeasuredItem.getNonScrollableItem()) {
                break;
            }
            if ((lazyStaggeredGridMeasuredItem.getMainAxisOffset() <= 0) != (lazyStaggeredGridMeasuredItem.getMainAxisOffset() + delta <= 0)) {
                break;
            }
            if (lazyStaggeredGridMeasuredItem.getMainAxisOffset() <= getViewportStartOffset()) {
                if (delta < 0) {
                    if ((lazyStaggeredGridMeasuredItem.getMainAxisOffset() + lazyStaggeredGridMeasuredItem.getSizeWithSpacings()) - getViewportStartOffset() <= (-delta)) {
                        break;
                    }
                } else if (getViewportStartOffset() - lazyStaggeredGridMeasuredItem.getMainAxisOffset() <= delta) {
                    break;
                }
            }
            if (lazyStaggeredGridMeasuredItem.getMainAxisOffset() + lazyStaggeredGridMeasuredItem.getSizeWithSpacings() >= getViewportEndOffset()) {
                if (delta < 0) {
                    if ((lazyStaggeredGridMeasuredItem.getMainAxisOffset() + lazyStaggeredGridMeasuredItem.getSizeWithSpacings()) - getViewportEndOffset() <= (-delta)) {
                        break;
                    }
                } else if (getViewportEndOffset() - lazyStaggeredGridMeasuredItem.getMainAxisOffset() <= delta) {
                    break;
                }
            }
            i++;
        }
        return false;
    }
}
