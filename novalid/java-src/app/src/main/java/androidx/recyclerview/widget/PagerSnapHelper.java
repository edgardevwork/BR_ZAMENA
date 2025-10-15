package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class PagerSnapHelper extends SnapHelper {
    public static final int MAX_SCROLL_ON_FLING_DURATION = 100;

    @Nullable
    public OrientationHelper mHorizontalHelper;

    @Nullable
    public OrientationHelper mVerticalHelper;

    @Override // androidx.recyclerview.widget.SnapHelper
    @Nullable
    public int[] calculateDistanceToFinalSnap(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view) {
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
            iArr[0] = distanceToCenter(view, getHorizontalHelper(layoutManager));
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.canScrollVertically()) {
            iArr[1] = distanceToCenter(view, getVerticalHelper(layoutManager));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @Nullable
    @SuppressLint({"UnknownNullness"})
    public View findSnapView(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.canScrollVertically()) {
            return findCenterView(layoutManager, getVerticalHelper(layoutManager));
        }
        if (layoutManager.canScrollHorizontally()) {
            return findCenterView(layoutManager, getHorizontalHelper(layoutManager));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @SuppressLint({"UnknownNullness"})
    public int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        OrientationHelper orientationHelper;
        int itemCount = layoutManager.getItemCount();
        if (itemCount == 0 || (orientationHelper = getOrientationHelper(layoutManager)) == null) {
            return -1;
        }
        int childCount = layoutManager.getChildCount();
        View view = null;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = layoutManager.getChildAt(i5);
            if (childAt != null) {
                int iDistanceToCenter = distanceToCenter(childAt, orientationHelper);
                if (iDistanceToCenter <= 0 && iDistanceToCenter > i4) {
                    view2 = childAt;
                    i4 = iDistanceToCenter;
                }
                if (iDistanceToCenter >= 0 && iDistanceToCenter < i3) {
                    view = childAt;
                    i3 = iDistanceToCenter;
                }
            }
        }
        boolean zIsForwardFling = isForwardFling(layoutManager, i, i2);
        if (zIsForwardFling && view != null) {
            return layoutManager.getPosition(view);
        }
        if (!zIsForwardFling && view2 != null) {
            return layoutManager.getPosition(view2);
        }
        if (zIsForwardFling) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int position = layoutManager.getPosition(view) + (isReverseLayout(layoutManager) == zIsForwardFling ? -1 : 1);
        if (position < 0 || position >= itemCount) {
            return -1;
        }
        return position;
    }

    public final boolean isForwardFling(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        return layoutManager.canScrollHorizontally() ? i > 0 : i2 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isReverseLayout(RecyclerView.LayoutManager layoutManager) {
        PointF pointFComputeScrollVectorForPosition;
        int itemCount = layoutManager.getItemCount();
        if (!(layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) || (pointFComputeScrollVectorForPosition = ((RecyclerView.SmoothScroller.ScrollVectorProvider) layoutManager).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return false;
        }
        return pointFComputeScrollVectorForPosition.x < 0.0f || pointFComputeScrollVectorForPosition.y < 0.0f;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @Nullable
    public RecyclerView.SmoothScroller createScroller(@NonNull RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) {
            return new LinearSmoothScroller(this.mRecyclerView.getContext()) { // from class: androidx.recyclerview.widget.PagerSnapHelper.1
                public C31391(Context context) {
                    super(context);
                }

                @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
                public void onTargetFound(@NonNull View view, @NonNull RecyclerView.State state, @NonNull RecyclerView.SmoothScroller.Action action) {
                    PagerSnapHelper pagerSnapHelper = PagerSnapHelper.this;
                    int[] iArrCalculateDistanceToFinalSnap = pagerSnapHelper.calculateDistanceToFinalSnap(pagerSnapHelper.mRecyclerView.getLayoutManager(), view);
                    int i = iArrCalculateDistanceToFinalSnap[0];
                    int i2 = iArrCalculateDistanceToFinalSnap[1];
                    int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
                    if (iCalculateTimeForDeceleration > 0) {
                        action.update(i, i2, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
                    }
                }

                @Override // androidx.recyclerview.widget.LinearSmoothScroller
                public float calculateSpeedPerPixel(@NonNull DisplayMetrics displayMetrics) {
                    return 100.0f / displayMetrics.densityDpi;
                }

                @Override // androidx.recyclerview.widget.LinearSmoothScroller
                public int calculateTimeForScrolling(int i) {
                    return Math.min(100, super.calculateTimeForScrolling(i));
                }
            };
        }
        return null;
    }

    /* renamed from: androidx.recyclerview.widget.PagerSnapHelper$1 */
    public class C31391 extends LinearSmoothScroller {
        public C31391(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
        public void onTargetFound(@NonNull View view, @NonNull RecyclerView.State state, @NonNull RecyclerView.SmoothScroller.Action action) {
            PagerSnapHelper pagerSnapHelper = PagerSnapHelper.this;
            int[] iArrCalculateDistanceToFinalSnap = pagerSnapHelper.calculateDistanceToFinalSnap(pagerSnapHelper.mRecyclerView.getLayoutManager(), view);
            int i = iArrCalculateDistanceToFinalSnap[0];
            int i2 = iArrCalculateDistanceToFinalSnap[1];
            int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
            if (iCalculateTimeForDeceleration > 0) {
                action.update(i, i2, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
            }
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public float calculateSpeedPerPixel(@NonNull DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int calculateTimeForScrolling(int i) {
            return Math.min(100, super.calculateTimeForScrolling(i));
        }
    }

    private int distanceToCenter(@NonNull View view, OrientationHelper orientationHelper) {
        return (orientationHelper.getDecoratedStart(view) + (orientationHelper.getDecoratedMeasurement(view) / 2)) - (orientationHelper.getStartAfterPadding() + (orientationHelper.getTotalSpace() / 2));
    }

    @Nullable
    private View findCenterView(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper) {
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int startAfterPadding = orientationHelper.getStartAfterPadding() + (orientationHelper.getTotalSpace() / 2);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = layoutManager.getChildAt(i2);
            int iAbs = Math.abs((orientationHelper.getDecoratedStart(childAt) + (orientationHelper.getDecoratedMeasurement(childAt) / 2)) - startAfterPadding);
            if (iAbs < i) {
                view = childAt;
                i = iAbs;
            }
        }
        return view;
    }

    @Nullable
    public final OrientationHelper getOrientationHelper(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.canScrollVertically()) {
            return getVerticalHelper(layoutManager);
        }
        if (layoutManager.canScrollHorizontally()) {
            return getHorizontalHelper(layoutManager);
        }
        return null;
    }

    @NonNull
    private OrientationHelper getVerticalHelper(@NonNull RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.mVerticalHelper;
        if (orientationHelper == null || orientationHelper.mLayoutManager != layoutManager) {
            this.mVerticalHelper = OrientationHelper.createVerticalHelper(layoutManager);
        }
        return this.mVerticalHelper;
    }

    @NonNull
    private OrientationHelper getHorizontalHelper(@NonNull RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.mHorizontalHelper;
        if (orientationHelper == null || orientationHelper.mLayoutManager != layoutManager) {
            this.mHorizontalHelper = OrientationHelper.createHorizontalHelper(layoutManager);
        }
        return this.mHorizontalHelper;
    }
}
