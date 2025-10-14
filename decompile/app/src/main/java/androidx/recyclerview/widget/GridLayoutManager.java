package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.annotation.NonNull;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public static final boolean DEBUG = false;
    public static final int DEFAULT_SPAN_COUNT = -1;
    public static final String TAG = "GridLayoutManager";
    public int[] mCachedBorders;
    public final Rect mDecorInsets;
    public boolean mPendingSpanCountChange;
    public final SparseIntArray mPreLayoutSpanIndexCache;
    public final SparseIntArray mPreLayoutSpanSizeCache;
    public View[] mSet;
    public int mSpanCount;
    public SpanSizeLookup mSpanSizeLookup;
    public boolean mUsingSpansToEstimateScrollBarDimensions;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mPendingSpanCountChange = false;
        this.mSpanCount = -1;
        this.mPreLayoutSpanSizeCache = new SparseIntArray();
        this.mPreLayoutSpanIndexCache = new SparseIntArray();
        this.mSpanSizeLookup = new DefaultSpanSizeLookup();
        this.mDecorInsets = new Rect();
        setSpanCount(RecyclerView.LayoutManager.getProperties(context, attributeSet, i, i2).spanCount);
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        this.mPendingSpanCountChange = false;
        this.mSpanCount = -1;
        this.mPreLayoutSpanSizeCache = new SparseIntArray();
        this.mPreLayoutSpanIndexCache = new SparseIntArray();
        this.mSpanSizeLookup = new DefaultSpanSizeLookup();
        this.mDecorInsets = new Rect();
        setSpanCount(i);
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        this.mPendingSpanCountChange = false;
        this.mSpanCount = -1;
        this.mPreLayoutSpanSizeCache = new SparseIntArray();
        this.mPreLayoutSpanIndexCache = new SparseIntArray();
        this.mSpanSizeLookup = new DefaultSpanSizeLookup();
        this.mDecorInsets = new Rect();
        setSpanCount(i);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void setStackFromEnd(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.setStackFromEnd(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getRowCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.mOrientation == 0) {
            return this.mSpanCount;
        }
        if (state.getItemCount() < 1) {
            return 0;
        }
        return getSpanGroupIndex(recycler, state, state.getItemCount() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getColumnCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.mOrientation == 1) {
            return this.mSpanCount;
        }
        if (state.getItemCount() < 1) {
            return 0;
        }
        return getSpanGroupIndex(recycler, state, state.getItemCount() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.Recycler recycler, RecyclerView.State state, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, accessibilityNodeInfoCompat);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int spanGroupIndex = getSpanGroupIndex(recycler, state, layoutParams2.getViewLayoutPosition());
        if (this.mOrientation == 0) {
            accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(layoutParams2.getSpanIndex(), layoutParams2.getSpanSize(), spanGroupIndex, 1, false, false));
        } else {
            accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(spanGroupIndex, 1, layoutParams2.getSpanIndex(), layoutParams2.getSpanSize(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityNodeInfo(@NonNull RecyclerView.Recycler recycler, @NonNull RecyclerView.State state, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(recycler, state, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setClassName(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (state.isPreLayout()) {
            cachePreLayoutSpanMapping();
        }
        super.onLayoutChildren(recycler, state);
        clearPreLayoutSpanMappingCache();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.mPendingSpanCountChange = false;
    }

    public final void clearPreLayoutSpanMappingCache() {
        this.mPreLayoutSpanSizeCache.clear();
        this.mPreLayoutSpanIndexCache.clear();
    }

    public final void cachePreLayoutSpanMapping() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i).getLayoutParams();
            int viewLayoutPosition = layoutParams.getViewLayoutPosition();
            this.mPreLayoutSpanSizeCache.put(viewLayoutPosition, layoutParams.getSpanSize());
            this.mPreLayoutSpanIndexCache.put(viewLayoutPosition, layoutParams.getSpanIndex());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
        this.mSpanSizeLookup.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsChanged(RecyclerView recyclerView) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
        this.mSpanSizeLookup.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
        this.mSpanSizeLookup.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
        this.mSpanSizeLookup.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
        this.mSpanSizeLookup.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        if (this.mOrientation == 0) {
            return new LayoutParams(-2, -1);
        }
        return new LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void setSpanSizeLookup(SpanSizeLookup spanSizeLookup) {
        this.mSpanSizeLookup = spanSizeLookup;
    }

    public SpanSizeLookup getSpanSizeLookup() {
        return this.mSpanSizeLookup;
    }

    public final void updateMeasurements() {
        int height;
        int paddingTop;
        if (getOrientation() == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        calculateItemBorders(height - paddingTop);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void setMeasuredDimension(Rect rect, int i, int i2) {
        int iChooseSize;
        int iChooseSize2;
        if (this.mCachedBorders == null) {
            super.setMeasuredDimension(rect, i, i2);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.mOrientation == 1) {
            iChooseSize2 = RecyclerView.LayoutManager.chooseSize(i2, rect.height() + paddingTop, getMinimumHeight());
            int[] iArr = this.mCachedBorders;
            iChooseSize = RecyclerView.LayoutManager.chooseSize(i, iArr[iArr.length - 1] + paddingLeft, getMinimumWidth());
        } else {
            iChooseSize = RecyclerView.LayoutManager.chooseSize(i, rect.width() + paddingLeft, getMinimumWidth());
            int[] iArr2 = this.mCachedBorders;
            iChooseSize2 = RecyclerView.LayoutManager.chooseSize(i2, iArr2[iArr2.length - 1] + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    public final void calculateItemBorders(int i) {
        this.mCachedBorders = calculateItemBorders(this.mCachedBorders, this.mSpanCount, i);
    }

    public static int[] calculateItemBorders(int[] iArr, int i, int i2) {
        int i3;
        if (iArr == null || iArr.length != i + 1 || iArr[iArr.length - 1] != i2) {
            iArr = new int[i + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    public int getSpaceForSpanRange(int i, int i2) {
        if (this.mOrientation == 1 && isLayoutRTL()) {
            int[] iArr = this.mCachedBorders;
            int i3 = this.mSpanCount;
            return iArr[i3 - i] - iArr[(i3 - i) - i2];
        }
        int[] iArr2 = this.mCachedBorders;
        return iArr2[i2 + i] - iArr2[i];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void onAnchorReady(RecyclerView.Recycler recycler, RecyclerView.State state, LinearLayoutManager.AnchorInfo anchorInfo, int i) {
        super.onAnchorReady(recycler, state, anchorInfo, i);
        updateMeasurements();
        if (state.getItemCount() > 0 && !state.isPreLayout()) {
            ensureAnchorIsInCorrectSpan(recycler, state, anchorInfo, i);
        }
        ensureViewSet();
    }

    public final void ensureViewSet() {
        View[] viewArr = this.mSet;
        if (viewArr == null || viewArr.length != this.mSpanCount) {
            this.mSet = new View[this.mSpanCount];
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        updateMeasurements();
        ensureViewSet();
        return super.scrollHorizontallyBy(i, recycler, state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        updateMeasurements();
        ensureViewSet();
        return super.scrollVerticallyBy(i, recycler, state);
    }

    public final void ensureAnchorIsInCorrectSpan(RecyclerView.Recycler recycler, RecyclerView.State state, LinearLayoutManager.AnchorInfo anchorInfo, int i) {
        boolean z = i == 1;
        int spanIndex = getSpanIndex(recycler, state, anchorInfo.mPosition);
        if (z) {
            while (spanIndex > 0) {
                int i2 = anchorInfo.mPosition;
                if (i2 <= 0) {
                    return;
                }
                int i3 = i2 - 1;
                anchorInfo.mPosition = i3;
                spanIndex = getSpanIndex(recycler, state, i3);
            }
            return;
        }
        int itemCount = state.getItemCount() - 1;
        int i4 = anchorInfo.mPosition;
        while (i4 < itemCount) {
            int i5 = i4 + 1;
            int spanIndex2 = getSpanIndex(recycler, state, i5);
            if (spanIndex2 <= spanIndex) {
                break;
            }
            i4 = i5;
            spanIndex = spanIndex2;
        }
        anchorInfo.mPosition = i4;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public View findReferenceChild(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z, boolean z2) {
        int i;
        int childCount;
        int childCount2 = getChildCount();
        int i2 = 1;
        if (z2) {
            childCount = getChildCount() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = childCount2;
            childCount = 0;
        }
        int itemCount = state.getItemCount();
        ensureLayoutState();
        int startAfterPadding = this.mOrientationHelper.getStartAfterPadding();
        int endAfterPadding = this.mOrientationHelper.getEndAfterPadding();
        View view = null;
        View view2 = null;
        while (childCount != i) {
            View childAt = getChildAt(childCount);
            int position = getPosition(childAt);
            if (position >= 0 && position < itemCount && getSpanIndex(recycler, state, position) == 0) {
                if (((RecyclerView.LayoutParams) childAt.getLayoutParams()).isItemRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.mOrientationHelper.getDecoratedStart(childAt) < endAfterPadding && this.mOrientationHelper.getDecoratedEnd(childAt) >= startAfterPadding) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            childCount += i2;
        }
        return view != null ? view : view2;
    }

    public final int getSpanGroupIndex(RecyclerView.Recycler recycler, RecyclerView.State state, int i) {
        if (!state.isPreLayout()) {
            return this.mSpanSizeLookup.getCachedSpanGroupIndex(i, this.mSpanCount);
        }
        int iConvertPreLayoutPositionToPostLayout = recycler.convertPreLayoutPositionToPostLayout(i);
        if (iConvertPreLayoutPositionToPostLayout == -1) {
            Log.w(TAG, "Cannot find span size for pre layout position. " + i);
            return 0;
        }
        return this.mSpanSizeLookup.getCachedSpanGroupIndex(iConvertPreLayoutPositionToPostLayout, this.mSpanCount);
    }

    public final int getSpanIndex(RecyclerView.Recycler recycler, RecyclerView.State state, int i) {
        if (!state.isPreLayout()) {
            return this.mSpanSizeLookup.getCachedSpanIndex(i, this.mSpanCount);
        }
        int i2 = this.mPreLayoutSpanIndexCache.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iConvertPreLayoutPositionToPostLayout = recycler.convertPreLayoutPositionToPostLayout(i);
        if (iConvertPreLayoutPositionToPostLayout == -1) {
            Log.w(TAG, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 0;
        }
        return this.mSpanSizeLookup.getCachedSpanIndex(iConvertPreLayoutPositionToPostLayout, this.mSpanCount);
    }

    public final int getSpanSize(RecyclerView.Recycler recycler, RecyclerView.State state, int i) {
        if (!state.isPreLayout()) {
            return this.mSpanSizeLookup.getSpanSize(i);
        }
        int i2 = this.mPreLayoutSpanSizeCache.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iConvertPreLayoutPositionToPostLayout = recycler.convertPreLayoutPositionToPostLayout(i);
        if (iConvertPreLayoutPositionToPostLayout == -1) {
            Log.w(TAG, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 1;
        }
        return this.mSpanSizeLookup.getSpanSize(iConvertPreLayoutPositionToPostLayout);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void collectPrefetchPositionsForLayoutState(RecyclerView.State state, LinearLayoutManager.LayoutState layoutState, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        int spanSize = this.mSpanCount;
        for (int i = 0; i < this.mSpanCount && layoutState.hasMore(state) && spanSize > 0; i++) {
            int i2 = layoutState.mCurrentPosition;
            layoutPrefetchRegistry.addPosition(i2, Math.max(0, layoutState.mScrollingOffset));
            spanSize -= this.mSpanSizeLookup.getSpanSize(i2);
            layoutState.mCurrentPosition += layoutState.mItemDirection;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void layoutChunk(RecyclerView.Recycler recycler, RecyclerView.State state, LinearLayoutManager.LayoutState layoutState, LinearLayoutManager.LayoutChunkResult layoutChunkResult) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int decoratedMeasurementInOther;
        int decoratedMeasurementInOther2;
        int decoratedMeasurementInOther3;
        int i8;
        int childMeasureSpec;
        int childMeasureSpec2;
        View next;
        int modeInOther = this.mOrientationHelper.getModeInOther();
        boolean z = modeInOther != 1073741824;
        int i9 = getChildCount() > 0 ? this.mCachedBorders[this.mSpanCount] : 0;
        if (z) {
            updateMeasurements();
        }
        boolean z2 = layoutState.mItemDirection == 1;
        int spanIndex = this.mSpanCount;
        if (!z2) {
            spanIndex = getSpanIndex(recycler, state, layoutState.mCurrentPosition) + getSpanSize(recycler, state, layoutState.mCurrentPosition);
        }
        int i10 = 0;
        while (i10 < this.mSpanCount && layoutState.hasMore(state) && spanIndex > 0) {
            int i11 = layoutState.mCurrentPosition;
            int spanSize = getSpanSize(recycler, state, i11);
            if (spanSize > this.mSpanCount) {
                throw new IllegalArgumentException("Item at position " + i11 + " requires " + spanSize + " spans but GridLayoutManager has only " + this.mSpanCount + " spans.");
            }
            spanIndex -= spanSize;
            if (spanIndex < 0 || (next = layoutState.next(recycler)) == null) {
                break;
            }
            this.mSet[i10] = next;
            i10++;
        }
        if (i10 == 0) {
            layoutChunkResult.mFinished = true;
            return;
        }
        assignSpans(recycler, state, i10, z2);
        float f = 0.0f;
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            View view = this.mSet[i13];
            if (layoutState.mScrapList == null) {
                if (z2) {
                    addView(view);
                } else {
                    addView(view, 0);
                }
            } else if (z2) {
                addDisappearingView(view);
            } else {
                addDisappearingView(view, 0);
            }
            calculateItemDecorationsForChild(view, this.mDecorInsets);
            measureChild(view, modeInOther, false);
            int decoratedMeasurement = this.mOrientationHelper.getDecoratedMeasurement(view);
            if (decoratedMeasurement > i12) {
                i12 = decoratedMeasurement;
            }
            float decoratedMeasurementInOther4 = (this.mOrientationHelper.getDecoratedMeasurementInOther(view) * 1.0f) / ((LayoutParams) view.getLayoutParams()).mSpanSize;
            if (decoratedMeasurementInOther4 > f) {
                f = decoratedMeasurementInOther4;
            }
        }
        if (z) {
            guessMeasurement(f, i9);
            i12 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                View view2 = this.mSet[i14];
                measureChild(view2, 1073741824, true);
                int decoratedMeasurement2 = this.mOrientationHelper.getDecoratedMeasurement(view2);
                if (decoratedMeasurement2 > i12) {
                    i12 = decoratedMeasurement2;
                }
            }
        }
        for (int i15 = 0; i15 < i10; i15++) {
            View view3 = this.mSet[i15];
            if (this.mOrientationHelper.getDecoratedMeasurement(view3) != i12) {
                LayoutParams layoutParams = (LayoutParams) view3.getLayoutParams();
                Rect rect = layoutParams.mDecorInsets;
                int i16 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                int i17 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                int spaceForSpanRange = getSpaceForSpanRange(layoutParams.mSpanIndex, layoutParams.mSpanSize);
                if (this.mOrientation == 1) {
                    childMeasureSpec2 = RecyclerView.LayoutManager.getChildMeasureSpec(spaceForSpanRange, 1073741824, i17, ((ViewGroup.MarginLayoutParams) layoutParams).width, false);
                    childMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12 - i16, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12 - i17, 1073741824);
                    childMeasureSpec = RecyclerView.LayoutManager.getChildMeasureSpec(spaceForSpanRange, 1073741824, i16, ((ViewGroup.MarginLayoutParams) layoutParams).height, false);
                    childMeasureSpec2 = iMakeMeasureSpec;
                }
                measureChildWithDecorationsAndMargin(view3, childMeasureSpec2, childMeasureSpec, true);
            }
        }
        layoutChunkResult.mConsumed = i12;
        if (this.mOrientation == 1) {
            if (layoutState.mLayoutDirection == -1) {
                i6 = layoutState.mOffset;
                i8 = i6 - i12;
            } else {
                i8 = layoutState.mOffset;
                i6 = i8 + i12;
            }
            i4 = i8;
            i5 = 0;
            i3 = 0;
        } else {
            if (layoutState.mLayoutDirection == -1) {
                i2 = layoutState.mOffset;
                i = i2 - i12;
            } else {
                i = layoutState.mOffset;
                i2 = i + i12;
            }
            i3 = i;
            i4 = 0;
            i5 = i2;
            i6 = 0;
        }
        int i18 = 0;
        while (i18 < i10) {
            View view4 = this.mSet[i18];
            LayoutParams layoutParams2 = (LayoutParams) view4.getLayoutParams();
            if (this.mOrientation == 1) {
                if (isLayoutRTL()) {
                    int paddingLeft = getPaddingLeft() + this.mCachedBorders[this.mSpanCount - layoutParams2.mSpanIndex];
                    decoratedMeasurementInOther3 = i6;
                    decoratedMeasurementInOther = paddingLeft;
                    decoratedMeasurementInOther2 = paddingLeft - this.mOrientationHelper.getDecoratedMeasurementInOther(view4);
                } else {
                    int paddingLeft2 = getPaddingLeft() + this.mCachedBorders[layoutParams2.mSpanIndex];
                    decoratedMeasurementInOther3 = i6;
                    decoratedMeasurementInOther2 = paddingLeft2;
                    decoratedMeasurementInOther = this.mOrientationHelper.getDecoratedMeasurementInOther(view4) + paddingLeft2;
                }
                i7 = i4;
            } else {
                int paddingTop = getPaddingTop() + this.mCachedBorders[layoutParams2.mSpanIndex];
                i7 = paddingTop;
                decoratedMeasurementInOther = i5;
                decoratedMeasurementInOther2 = i3;
                decoratedMeasurementInOther3 = this.mOrientationHelper.getDecoratedMeasurementInOther(view4) + paddingTop;
            }
            layoutDecoratedWithMargins(view4, decoratedMeasurementInOther2, i7, decoratedMeasurementInOther, decoratedMeasurementInOther3);
            if (layoutParams2.isItemRemoved() || layoutParams2.isItemChanged()) {
                layoutChunkResult.mIgnoreConsumed = true;
            }
            layoutChunkResult.mFocusable |= view4.hasFocusable();
            i18++;
            i6 = decoratedMeasurementInOther3;
            i5 = decoratedMeasurementInOther;
            i3 = decoratedMeasurementInOther2;
            i4 = i7;
        }
        Arrays.fill(this.mSet, (Object) null);
    }

    public final void measureChild(View view, int i, boolean z) {
        int childMeasureSpec;
        int childMeasureSpec2;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.mDecorInsets;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        int spaceForSpanRange = getSpaceForSpanRange(layoutParams.mSpanIndex, layoutParams.mSpanSize);
        if (this.mOrientation == 1) {
            childMeasureSpec2 = RecyclerView.LayoutManager.getChildMeasureSpec(spaceForSpanRange, i, i3, ((ViewGroup.MarginLayoutParams) layoutParams).width, false);
            childMeasureSpec = RecyclerView.LayoutManager.getChildMeasureSpec(this.mOrientationHelper.getTotalSpace(), getHeightMode(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height, true);
        } else {
            int childMeasureSpec3 = RecyclerView.LayoutManager.getChildMeasureSpec(spaceForSpanRange, i, i2, ((ViewGroup.MarginLayoutParams) layoutParams).height, false);
            int childMeasureSpec4 = RecyclerView.LayoutManager.getChildMeasureSpec(this.mOrientationHelper.getTotalSpace(), getWidthMode(), i3, ((ViewGroup.MarginLayoutParams) layoutParams).width, true);
            childMeasureSpec = childMeasureSpec3;
            childMeasureSpec2 = childMeasureSpec4;
        }
        measureChildWithDecorationsAndMargin(view, childMeasureSpec2, childMeasureSpec, z);
    }

    public final void guessMeasurement(float f, int i) {
        calculateItemBorders(Math.max(Math.round(f * this.mSpanCount), i));
    }

    public final void measureChildWithDecorationsAndMargin(View view, int i, int i2, boolean z) {
        boolean zShouldMeasureChild;
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (z) {
            zShouldMeasureChild = shouldReMeasureChild(view, i, i2, layoutParams);
        } else {
            zShouldMeasureChild = shouldMeasureChild(view, i, i2, layoutParams);
        }
        if (zShouldMeasureChild) {
            view.measure(i, i2);
        }
    }

    public final void assignSpans(RecyclerView.Recycler recycler, RecyclerView.State state, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (z) {
            i4 = 1;
            i3 = i;
            i2 = 0;
        } else {
            i2 = i - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i3) {
            View view = this.mSet[i2];
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int spanSize = getSpanSize(recycler, state, getPosition(view));
            layoutParams.mSpanSize = spanSize;
            layoutParams.mSpanIndex = i5;
            i5 += spanSize;
            i2 += i4;
        }
    }

    public int getSpanCount() {
        return this.mSpanCount;
    }

    public void setSpanCount(int i) {
        if (i == this.mSpanCount) {
            return;
        }
        this.mPendingSpanCountChange = true;
        if (i < 1) {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
        }
        this.mSpanCount = i;
        this.mSpanSizeLookup.invalidateSpanIndexCache();
        requestLayout();
    }

    /* loaded from: classes2.dex */
    public static abstract class SpanSizeLookup {
        public final SparseIntArray mSpanIndexCache = new SparseIntArray();
        public final SparseIntArray mSpanGroupIndexCache = new SparseIntArray();
        public boolean mCacheSpanIndices = false;
        public boolean mCacheSpanGroupIndices = false;

        public abstract int getSpanSize(int i);

        public void setSpanIndexCacheEnabled(boolean z) {
            if (!z) {
                this.mSpanGroupIndexCache.clear();
            }
            this.mCacheSpanIndices = z;
        }

        public void setSpanGroupIndexCacheEnabled(boolean z) {
            if (!z) {
                this.mSpanGroupIndexCache.clear();
            }
            this.mCacheSpanGroupIndices = z;
        }

        public void invalidateSpanIndexCache() {
            this.mSpanIndexCache.clear();
        }

        public void invalidateSpanGroupIndexCache() {
            this.mSpanGroupIndexCache.clear();
        }

        public boolean isSpanIndexCacheEnabled() {
            return this.mCacheSpanIndices;
        }

        public boolean isSpanGroupIndexCacheEnabled() {
            return this.mCacheSpanGroupIndices;
        }

        public int getCachedSpanIndex(int i, int i2) {
            if (!this.mCacheSpanIndices) {
                return getSpanIndex(i, i2);
            }
            int i3 = this.mSpanIndexCache.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int spanIndex = getSpanIndex(i, i2);
            this.mSpanIndexCache.put(i, spanIndex);
            return spanIndex;
        }

        public int getCachedSpanGroupIndex(int i, int i2) {
            if (!this.mCacheSpanGroupIndices) {
                return getSpanGroupIndex(i, i2);
            }
            int i3 = this.mSpanGroupIndexCache.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int spanGroupIndex = getSpanGroupIndex(i, i2);
            this.mSpanGroupIndexCache.put(i, spanGroupIndex);
            return spanGroupIndex;
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0033  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x002b -> B:39:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x002d -> B:39:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x002f -> B:39:0x0030). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int getSpanIndex(int i, int i2) {
            int iFindFirstKeyLessThan;
            int spanSize;
            int spanSize2 = getSpanSize(i);
            if (spanSize2 == i2) {
                return 0;
            }
            if (!this.mCacheSpanIndices || (iFindFirstKeyLessThan = findFirstKeyLessThan(this.mSpanIndexCache, i)) < 0) {
                iFindFirstKeyLessThan = 0;
                spanSize = 0;
                if (iFindFirstKeyLessThan >= i) {
                    int spanSize3 = getSpanSize(iFindFirstKeyLessThan);
                    spanSize += spanSize3;
                    if (spanSize == i2) {
                        spanSize = 0;
                    } else if (spanSize > i2) {
                        spanSize = spanSize3;
                    }
                    iFindFirstKeyLessThan++;
                    if (iFindFirstKeyLessThan >= i) {
                        if (spanSize2 + spanSize <= i2) {
                            return spanSize;
                        }
                        return 0;
                    }
                }
            } else {
                spanSize = this.mSpanIndexCache.get(iFindFirstKeyLessThan) + getSpanSize(iFindFirstKeyLessThan);
                iFindFirstKeyLessThan++;
                if (iFindFirstKeyLessThan >= i) {
                }
            }
        }

        public static int findFirstKeyLessThan(SparseIntArray sparseIntArray, int i) {
            int size = sparseIntArray.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (sparseIntArray.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i4);
        }

        public int getSpanGroupIndex(int i, int i2) {
            int i3;
            int i4;
            int cachedSpanIndex;
            int iFindFirstKeyLessThan;
            if (!this.mCacheSpanGroupIndices || (iFindFirstKeyLessThan = findFirstKeyLessThan(this.mSpanGroupIndexCache, i)) == -1) {
                i3 = 0;
                i4 = 0;
                cachedSpanIndex = 0;
            } else {
                i3 = this.mSpanGroupIndexCache.get(iFindFirstKeyLessThan);
                i4 = iFindFirstKeyLessThan + 1;
                cachedSpanIndex = getCachedSpanIndex(iFindFirstKeyLessThan, i2) + getSpanSize(iFindFirstKeyLessThan);
                if (cachedSpanIndex == i2) {
                    i3++;
                    cachedSpanIndex = 0;
                }
            }
            int spanSize = getSpanSize(i);
            while (i4 < i) {
                int spanSize2 = getSpanSize(i4);
                cachedSpanIndex += spanSize2;
                if (cachedSpanIndex == i2) {
                    i3++;
                    cachedSpanIndex = 0;
                } else if (cachedSpanIndex > i2) {
                    i3++;
                    cachedSpanIndex = spanSize2;
                }
                i4++;
            }
            return cachedSpanIndex + spanSize > i2 ? i3 + 1 : i3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x00d1, code lost:
    
        if (r13 == (r2 > r15)) goto L136;
     */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x010f  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View onFocusSearchFailed(View view, int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        int childCount;
        int i2;
        int childCount2;
        View view2;
        View view3;
        int i3;
        int i4;
        int i5;
        int i6;
        RecyclerView.Recycler recycler2 = recycler;
        RecyclerView.State state2 = state;
        View viewFindContainingItemView = findContainingItemView(view);
        View view4 = null;
        if (viewFindContainingItemView == null) {
            return null;
        }
        LayoutParams layoutParams = (LayoutParams) viewFindContainingItemView.getLayoutParams();
        int i7 = layoutParams.mSpanIndex;
        int i8 = layoutParams.mSpanSize + i7;
        if (super.onFocusSearchFailed(view, i, recycler, state) == null) {
            return null;
        }
        if ((convertFocusDirectionToLayoutDirection(i) == 1) != this.mShouldReverseLayout) {
            childCount2 = getChildCount() - 1;
            childCount = -1;
            i2 = -1;
        } else {
            childCount = getChildCount();
            i2 = 1;
            childCount2 = 0;
        }
        boolean z = this.mOrientation == 1 && isLayoutRTL();
        int spanGroupIndex = getSpanGroupIndex(recycler2, state2, childCount2);
        int i9 = -1;
        int i10 = -1;
        int iMin = 0;
        int iMin2 = 0;
        int i11 = childCount2;
        View view5 = null;
        while (i11 != childCount) {
            int spanGroupIndex2 = getSpanGroupIndex(recycler2, state2, i11);
            View childAt = getChildAt(i11);
            if (childAt == viewFindContainingItemView) {
                break;
            }
            if (!childAt.hasFocusable() || spanGroupIndex2 == spanGroupIndex) {
                LayoutParams layoutParams2 = (LayoutParams) childAt.getLayoutParams();
                int i12 = layoutParams2.mSpanIndex;
                view2 = viewFindContainingItemView;
                int i13 = layoutParams2.mSpanSize + i12;
                if (childAt.hasFocusable() && i12 == i7 && i13 == i8) {
                    return childAt;
                }
                if (!(childAt.hasFocusable() && view4 == null) && (childAt.hasFocusable() || view5 != null)) {
                    view3 = view5;
                    int iMin3 = Math.min(i13, i8) - Math.max(i12, i7);
                    if (!childAt.hasFocusable()) {
                        if (view4 == null) {
                            i3 = iMin;
                            i4 = childCount;
                            if (isViewPartiallyVisible(childAt, false, true)) {
                                i5 = iMin2;
                                if (iMin3 > i5) {
                                    i6 = i10;
                                } else if (iMin3 == i5) {
                                    i6 = i10;
                                    if (z == (i12 > i6)) {
                                    }
                                    i11 += i2;
                                    recycler2 = recycler;
                                    state2 = state;
                                    viewFindContainingItemView = view2;
                                    childCount = i4;
                                } else {
                                    i6 = i10;
                                }
                                if (!childAt.hasFocusable()) {
                                    i9 = layoutParams2.mSpanIndex;
                                    i10 = i6;
                                    iMin2 = i5;
                                    view5 = view3;
                                    view4 = childAt;
                                    iMin = Math.min(i13, i8) - Math.max(i12, i7);
                                } else {
                                    int i14 = layoutParams2.mSpanIndex;
                                    iMin2 = Math.min(i13, i8) - Math.max(i12, i7);
                                    i10 = i14;
                                    iMin = i3;
                                    view5 = childAt;
                                }
                                i11 += i2;
                                recycler2 = recycler;
                                state2 = state;
                                viewFindContainingItemView = view2;
                                childCount = i4;
                            }
                            i10 = i6;
                            iMin2 = i5;
                            iMin = i3;
                            view5 = view3;
                            i11 += i2;
                            recycler2 = recycler;
                            state2 = state;
                            viewFindContainingItemView = view2;
                            childCount = i4;
                        }
                        i6 = i10;
                        i5 = iMin2;
                        i10 = i6;
                        iMin2 = i5;
                        iMin = i3;
                        view5 = view3;
                        i11 += i2;
                        recycler2 = recycler;
                        state2 = state;
                        viewFindContainingItemView = view2;
                        childCount = i4;
                    } else if (iMin3 <= iMin) {
                        if (iMin3 == iMin) {
                        }
                    }
                } else {
                    view3 = view5;
                }
                i3 = iMin;
                i4 = childCount;
                i6 = i10;
                i5 = iMin2;
                if (!childAt.hasFocusable()) {
                }
                i11 += i2;
                recycler2 = recycler;
                state2 = state;
                viewFindContainingItemView = view2;
                childCount = i4;
            } else {
                if (view4 != null) {
                    break;
                }
                view2 = viewFindContainingItemView;
                view3 = view5;
            }
            i3 = iMin;
            i4 = childCount;
            i6 = i10;
            i5 = iMin2;
            i10 = i6;
            iMin2 = i5;
            iMin = i3;
            view5 = view3;
            i11 += i2;
            recycler2 = recycler;
            state2 = state;
            viewFindContainingItemView = view2;
            childCount = i4;
        }
        return view4 != null ? view4 : view5;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.mPendingSpanCountChange;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(RecyclerView.State state) {
        if (this.mUsingSpansToEstimateScrollBarDimensions) {
            return computeScrollRangeWithSpanInfo(state);
        }
        return super.computeHorizontalScrollRange(state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.State state) {
        if (this.mUsingSpansToEstimateScrollBarDimensions) {
            return computeScrollRangeWithSpanInfo(state);
        }
        return super.computeVerticalScrollRange(state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        if (this.mUsingSpansToEstimateScrollBarDimensions) {
            return computeScrollOffsetWithSpanInfo(state);
        }
        return super.computeHorizontalScrollOffset(state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        if (this.mUsingSpansToEstimateScrollBarDimensions) {
            return computeScrollOffsetWithSpanInfo(state);
        }
        return super.computeVerticalScrollOffset(state);
    }

    public void setUsingSpansToEstimateScrollbarDimensions(boolean z) {
        this.mUsingSpansToEstimateScrollBarDimensions = z;
    }

    public boolean isUsingSpansToEstimateScrollbarDimensions() {
        return this.mUsingSpansToEstimateScrollBarDimensions;
    }

    public final int computeScrollRangeWithSpanInfo(RecyclerView.State state) {
        if (getChildCount() != 0 && state.getItemCount() != 0) {
            ensureLayoutState();
            View viewFindFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!isSmoothScrollbarEnabled(), true);
            View viewFindFirstVisibleChildClosestToEnd = findFirstVisibleChildClosestToEnd(!isSmoothScrollbarEnabled(), true);
            if (viewFindFirstVisibleChildClosestToStart != null && viewFindFirstVisibleChildClosestToEnd != null) {
                if (!isSmoothScrollbarEnabled()) {
                    return this.mSpanSizeLookup.getCachedSpanGroupIndex(state.getItemCount() - 1, this.mSpanCount) + 1;
                }
                int decoratedEnd = this.mOrientationHelper.getDecoratedEnd(viewFindFirstVisibleChildClosestToEnd) - this.mOrientationHelper.getDecoratedStart(viewFindFirstVisibleChildClosestToStart);
                int cachedSpanGroupIndex = this.mSpanSizeLookup.getCachedSpanGroupIndex(getPosition(viewFindFirstVisibleChildClosestToStart), this.mSpanCount);
                return (int) ((decoratedEnd / ((this.mSpanSizeLookup.getCachedSpanGroupIndex(getPosition(viewFindFirstVisibleChildClosestToEnd), this.mSpanCount) - cachedSpanGroupIndex) + 1)) * (this.mSpanSizeLookup.getCachedSpanGroupIndex(state.getItemCount() - 1, this.mSpanCount) + 1));
            }
        }
        return 0;
    }

    public final int computeScrollOffsetWithSpanInfo(RecyclerView.State state) {
        int iMax;
        if (getChildCount() != 0 && state.getItemCount() != 0) {
            ensureLayoutState();
            boolean zIsSmoothScrollbarEnabled = isSmoothScrollbarEnabled();
            View viewFindFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!zIsSmoothScrollbarEnabled, true);
            View viewFindFirstVisibleChildClosestToEnd = findFirstVisibleChildClosestToEnd(!zIsSmoothScrollbarEnabled, true);
            if (viewFindFirstVisibleChildClosestToStart != null && viewFindFirstVisibleChildClosestToEnd != null) {
                int cachedSpanGroupIndex = this.mSpanSizeLookup.getCachedSpanGroupIndex(getPosition(viewFindFirstVisibleChildClosestToStart), this.mSpanCount);
                int cachedSpanGroupIndex2 = this.mSpanSizeLookup.getCachedSpanGroupIndex(getPosition(viewFindFirstVisibleChildClosestToEnd), this.mSpanCount);
                int iMin = Math.min(cachedSpanGroupIndex, cachedSpanGroupIndex2);
                int iMax2 = Math.max(cachedSpanGroupIndex, cachedSpanGroupIndex2);
                int cachedSpanGroupIndex3 = this.mSpanSizeLookup.getCachedSpanGroupIndex(state.getItemCount() - 1, this.mSpanCount) + 1;
                if (this.mShouldReverseLayout) {
                    iMax = Math.max(0, (cachedSpanGroupIndex3 - iMax2) - 1);
                } else {
                    iMax = Math.max(0, iMin);
                }
                if (!zIsSmoothScrollbarEnabled) {
                    return iMax;
                }
                return Math.round((iMax * (Math.abs(this.mOrientationHelper.getDecoratedEnd(viewFindFirstVisibleChildClosestToEnd) - this.mOrientationHelper.getDecoratedStart(viewFindFirstVisibleChildClosestToStart)) / ((this.mSpanSizeLookup.getCachedSpanGroupIndex(getPosition(viewFindFirstVisibleChildClosestToEnd), this.mSpanCount) - this.mSpanSizeLookup.getCachedSpanGroupIndex(getPosition(viewFindFirstVisibleChildClosestToStart), this.mSpanCount)) + 1))) + (this.mOrientationHelper.getStartAfterPadding() - this.mOrientationHelper.getDecoratedStart(viewFindFirstVisibleChildClosestToStart)));
            }
        }
        return 0;
    }

    /* loaded from: classes2.dex */
    public static final class DefaultSpanSizeLookup extends SpanSizeLookup {
        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i) {
            return 1;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanIndex(int i, int i2) {
            return i % i2;
        }
    }

    /* loaded from: classes2.dex */
    public static class LayoutParams extends RecyclerView.LayoutParams {
        public static final int INVALID_SPAN_ID = -1;
        public int mSpanIndex;
        public int mSpanSize;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.mSpanIndex = -1;
            this.mSpanSize = 0;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.mSpanIndex = -1;
            this.mSpanSize = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.mSpanIndex = -1;
            this.mSpanSize = 0;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.mSpanIndex = -1;
            this.mSpanSize = 0;
        }

        public LayoutParams(RecyclerView.LayoutParams layoutParams) {
            super(layoutParams);
            this.mSpanIndex = -1;
            this.mSpanSize = 0;
        }

        public int getSpanIndex() {
            return this.mSpanIndex;
        }

        public int getSpanSize() {
            return this.mSpanSize;
        }
    }
}
