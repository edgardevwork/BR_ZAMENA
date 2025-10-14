package com.blackhub.bronline.game.common.gravitysnaphelper;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.text.TextUtilsCompat;
import androidx.core.view.GravityCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;


public class GravitySnapHelper extends LinearSnapHelper {
    public static final int FLING_DISTANCE_DISABLE = -1;
    public static final float FLING_SIZE_FRACTION_DISABLE = -1.0f;
    public int gravity;
    public OrientationHelper horizontalHelper;
    public boolean isRtl;
    public boolean isScrolling;
    public SnapListener listener;
    public int maxFlingDistance;
    public float maxFlingSizeFraction;
    public int nextSnapPosition;
    public RecyclerView recyclerView;
    public final RecyclerView.OnScrollListener scrollListener;
    public float scrollMsPerInch;
    public boolean snapLastItem;
    public boolean snapToPadding;
    public OrientationHelper verticalHelper;

    /* loaded from: classes.dex */
    public interface SnapListener {
        void onSnap(int position);
    }

    public GravitySnapHelper(int gravity) {
        this(gravity, false, null);
    }

    public GravitySnapHelper(int gravity, @NonNull SnapListener snapListener) {
        this(gravity, false, snapListener);
    }

    public GravitySnapHelper(int gravity, boolean enableSnapLastItem) {
        this(gravity, enableSnapLastItem, null);
    }

    public GravitySnapHelper(int gravity, boolean enableSnapLastItem, @Nullable SnapListener snapListener) {
        this.isScrolling = false;
        this.snapToPadding = false;
        this.scrollMsPerInch = 100.0f;
        this.maxFlingDistance = -1;
        this.maxFlingSizeFraction = -1.0f;
        this.scrollListener = new RecyclerView.OnScrollListener() { // from class: com.blackhub.bronline.game.common.gravitysnaphelper.GravitySnapHelper.1
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                GravitySnapHelper.this.onScrollStateChanged(newState);
            }
        };
        if (gravity != 8388611 && gravity != 8388613 && gravity != 80 && gravity != 48 && gravity != 17) {
            throw new IllegalArgumentException("Invalid gravity value. Use START | END | BOTTOM | TOP | CENTER constants");
        }
        this.snapLastItem = enableSnapLastItem;
        this.gravity = gravity;
        this.listener = snapListener;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public void attachToRecyclerView(@Nullable RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 != null) {
            recyclerView2.removeOnScrollListener(this.scrollListener);
        }
        if (recyclerView != null) {
            recyclerView.setOnFlingListener(null);
            int i = this.gravity;
            if (i == 8388611 || i == 8388613) {
                this.isRtl = TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
            }
            recyclerView.addOnScrollListener(this.scrollListener);
            this.recyclerView = recyclerView;
        } else {
            this.recyclerView = null;
        }
        super.attachToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.LinearSnapHelper, androidx.recyclerview.widget.SnapHelper
    @Nullable
    public View findSnapView(@NonNull RecyclerView.LayoutManager lm) {
        return findSnapView(lm, true);
    }

    @Nullable
    public View findSnapView(@NonNull RecyclerView.LayoutManager lm, boolean checkEdgeOfList) {
        View viewFindView;
        int i = this.gravity;
        if (i != 17) {
            if (i == 48) {
                viewFindView = findView(lm, getVerticalHelper(lm), GravityCompat.START, checkEdgeOfList);
            } else if (i == 80) {
                viewFindView = findView(lm, getVerticalHelper(lm), 8388613, checkEdgeOfList);
            } else if (i == 8388611) {
                viewFindView = findView(lm, getHorizontalHelper(lm), GravityCompat.START, checkEdgeOfList);
            } else {
                viewFindView = i != 8388613 ? null : findView(lm, getHorizontalHelper(lm), 8388613, checkEdgeOfList);
            }
        } else if (lm.canScrollHorizontally()) {
            viewFindView = findView(lm, getHorizontalHelper(lm), 17, checkEdgeOfList);
        } else {
            viewFindView = findView(lm, getVerticalHelper(lm), 17, checkEdgeOfList);
        }
        if (viewFindView != null) {
            this.nextSnapPosition = this.recyclerView.getChildAdapterPosition(viewFindView);
        } else {
            this.nextSnapPosition = -1;
        }
        return viewFindView;
    }

    @Override // androidx.recyclerview.widget.LinearSnapHelper, androidx.recyclerview.widget.SnapHelper
    @NonNull
    public int[] calculateDistanceToFinalSnap(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View targetView) {
        if (this.gravity == 17) {
            return super.calculateDistanceToFinalSnap(layoutManager, targetView);
        }
        int[] iArr = new int[2];
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            if (linearLayoutManager.canScrollHorizontally()) {
                boolean z = this.isRtl;
                if ((z && this.gravity == 8388613) || (!z && this.gravity == 8388611)) {
                    iArr[0] = getDistanceToStart(targetView, getHorizontalHelper(linearLayoutManager));
                } else {
                    iArr[0] = getDistanceToEnd(targetView, getHorizontalHelper(linearLayoutManager));
                }
            } else if (linearLayoutManager.canScrollVertically()) {
                if (this.gravity == 48) {
                    iArr[1] = getDistanceToStart(targetView, getVerticalHelper(linearLayoutManager));
                } else {
                    iArr[1] = getDistanceToEnd(targetView, getVerticalHelper(linearLayoutManager));
                }
            }
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @NonNull
    public int[] calculateScrollDistance(int velocityX, int velocityY) {
        if (this.recyclerView == null || ((this.verticalHelper == null && this.horizontalHelper == null) || (this.maxFlingDistance == -1 && this.maxFlingSizeFraction == -1.0f))) {
            return super.calculateScrollDistance(velocityX, velocityY);
        }
        Scroller scroller = new Scroller(this.recyclerView.getContext(), new DecelerateInterpolator());
        int flingDistance = getFlingDistance();
        int i = -flingDistance;
        scroller.fling(0, 0, velocityX, velocityY, i, flingDistance, i, flingDistance);
        return new int[]{scroller.getFinalX(), scroller.getFinalY()};
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @Nullable
    public RecyclerView.SmoothScroller createScroller(@NonNull RecyclerView.LayoutManager layoutManager) {
        RecyclerView recyclerView;
        if (!(layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) || (recyclerView = this.recyclerView) == null) {
            return null;
        }
        return new LinearSmoothScroller(recyclerView.getContext()) { // from class: com.blackhub.bronline.game.common.gravitysnaphelper.GravitySnapHelper.2
            @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
            public void onTargetFound(View targetView, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
                if (GravitySnapHelper.this.recyclerView == null || GravitySnapHelper.this.recyclerView.getLayoutManager() == null) {
                    return;
                }
                GravitySnapHelper gravitySnapHelper = GravitySnapHelper.this;
                int[] iArrCalculateDistanceToFinalSnap = gravitySnapHelper.calculateDistanceToFinalSnap(gravitySnapHelper.recyclerView.getLayoutManager(), targetView);
                int i = iArrCalculateDistanceToFinalSnap[0];
                int i2 = iArrCalculateDistanceToFinalSnap[1];
                int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
                if (iCalculateTimeForDeceleration > 0) {
                    action.update(i, i2, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
                }
            }

            @Override // androidx.recyclerview.widget.LinearSmoothScroller
            public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                return GravitySnapHelper.this.scrollMsPerInch / displayMetrics.densityDpi;
            }
        };
    }

    public void setSnapListener(@Nullable SnapListener listener) {
        this.listener = listener;
    }

    public void setGravity(int newGravity, Boolean smooth) {
        if (this.gravity != newGravity) {
            this.gravity = newGravity;
            updateSnap(smooth, Boolean.FALSE);
        }
    }

    public void updateSnap(Boolean smooth, Boolean checkEdgeOfList) {
        RecyclerView.LayoutManager layoutManager;
        View viewFindSnapView;
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView == null || recyclerView.getLayoutManager() == null || (viewFindSnapView = findSnapView((layoutManager = this.recyclerView.getLayoutManager()), checkEdgeOfList.booleanValue())) == null) {
            return;
        }
        int[] iArrCalculateDistanceToFinalSnap = calculateDistanceToFinalSnap(layoutManager, viewFindSnapView);
        if (smooth.booleanValue()) {
            this.recyclerView.smoothScrollBy(iArrCalculateDistanceToFinalSnap[0], iArrCalculateDistanceToFinalSnap[1]);
        } else {
            this.recyclerView.scrollBy(iArrCalculateDistanceToFinalSnap[0], iArrCalculateDistanceToFinalSnap[1]);
        }
    }

    public boolean scrollToPosition(int position) {
        if (position == -1) {
            return false;
        }
        return scrollTo(position, false);
    }

    public boolean smoothScrollToPosition(int position) {
        if (position == -1) {
            return false;
        }
        return scrollTo(position, true);
    }

    public int getGravity() {
        return this.gravity;
    }

    public void setGravity(int newGravity) {
        setGravity(newGravity, Boolean.TRUE);
    }

    public boolean getSnapLastItem() {
        return this.snapLastItem;
    }

    public void setSnapLastItem(boolean snap) {
        this.snapLastItem = snap;
    }

    public int getMaxFlingDistance() {
        return this.maxFlingDistance;
    }

    public void setMaxFlingDistance(@Px int distance) {
        this.maxFlingDistance = distance;
        this.maxFlingSizeFraction = -1.0f;
    }

    public float getMaxFlingSizeFraction() {
        return this.maxFlingSizeFraction;
    }

    public void setMaxFlingSizeFraction(float fraction) {
        this.maxFlingDistance = -1;
        this.maxFlingSizeFraction = fraction;
    }

    public float getScrollMsPerInch() {
        return this.scrollMsPerInch;
    }

    public void setScrollMsPerInch(float ms) {
        this.scrollMsPerInch = ms;
    }

    public boolean getSnapToPadding() {
        return this.snapToPadding;
    }

    public void setSnapToPadding(boolean snapToPadding) {
        this.snapToPadding = snapToPadding;
    }

    public int getCurrentSnappedPosition() {
        View viewFindSnapView;
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView == null || recyclerView.getLayoutManager() == null || (viewFindSnapView = findSnapView(this.recyclerView.getLayoutManager())) == null) {
            return -1;
        }
        return this.recyclerView.getChildAdapterPosition(viewFindSnapView);
    }

    public final int getFlingDistance() {
        float width;
        float f;
        if (this.maxFlingSizeFraction != -1.0f) {
            if (this.verticalHelper != null) {
                width = this.recyclerView.getHeight();
                f = this.maxFlingSizeFraction;
            } else {
                if (this.horizontalHelper == null) {
                    return Integer.MAX_VALUE;
                }
                width = this.recyclerView.getWidth();
                f = this.maxFlingSizeFraction;
            }
            return (int) (width * f);
        }
        int i = this.maxFlingDistance;
        if (i != -1) {
            return i;
        }
        return Integer.MAX_VALUE;
    }

    public final boolean scrollTo(int position, boolean smooth) {
        if (this.recyclerView.getLayoutManager() != null) {
            if (smooth) {
                RecyclerView.SmoothScroller smoothScrollerCreateScroller = createScroller(this.recyclerView.getLayoutManager());
                if (smoothScrollerCreateScroller != null) {
                    smoothScrollerCreateScroller.setTargetPosition(position);
                    this.recyclerView.getLayoutManager().startSmoothScroll(smoothScrollerCreateScroller);
                    return true;
                }
            } else {
                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = this.recyclerView.findViewHolderForAdapterPosition(position);
                if (viewHolderFindViewHolderForAdapterPosition != null) {
                    int[] iArrCalculateDistanceToFinalSnap = calculateDistanceToFinalSnap(this.recyclerView.getLayoutManager(), viewHolderFindViewHolderForAdapterPosition.itemView);
                    this.recyclerView.scrollBy(iArrCalculateDistanceToFinalSnap[0], iArrCalculateDistanceToFinalSnap[1]);
                    return true;
                }
            }
        }
        return false;
    }

    public final int getDistanceToStart(View targetView, @NonNull OrientationHelper helper) {
        int decoratedStart;
        int startAfterPadding;
        if (!this.snapToPadding) {
            decoratedStart = helper.getDecoratedStart(targetView);
            if (decoratedStart < helper.getStartAfterPadding() / 2) {
                return decoratedStart;
            }
            startAfterPadding = helper.getStartAfterPadding();
        } else {
            decoratedStart = helper.getDecoratedStart(targetView);
            startAfterPadding = helper.getStartAfterPadding();
        }
        return decoratedStart - startAfterPadding;
    }

    public final int getDistanceToEnd(View targetView, @NonNull OrientationHelper helper) {
        int decoratedEnd;
        int endAfterPadding;
        if (!this.snapToPadding) {
            int decoratedEnd2 = helper.getDecoratedEnd(targetView);
            if (decoratedEnd2 >= helper.getEnd() - ((helper.getEnd() - helper.getEndAfterPadding()) / 2)) {
                decoratedEnd = helper.getDecoratedEnd(targetView);
                endAfterPadding = helper.getEnd();
            } else {
                return decoratedEnd2 - helper.getEndAfterPadding();
            }
        } else {
            decoratedEnd = helper.getDecoratedEnd(targetView);
            endAfterPadding = helper.getEndAfterPadding();
        }
        return decoratedEnd - endAfterPadding;
    }

    @Nullable
    public final View findView(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull OrientationHelper helper, int gravity, boolean checkEdgeOfList) {
        int end;
        int iAbs;
        View view = null;
        if (layoutManager.getChildCount() != 0 && (layoutManager instanceof LinearLayoutManager)) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            if (checkEdgeOfList && isAtEdgeOfList(linearLayoutManager) && !this.snapLastItem) {
                return null;
            }
            if (layoutManager.getClipToPadding()) {
                end = helper.getStartAfterPadding() + (helper.getTotalSpace() / 2);
            } else {
                end = helper.getEnd() / 2;
            }
            boolean z = true;
            boolean z2 = (gravity == 8388611 && !this.isRtl) || (gravity == 8388613 && this.isRtl);
            if ((gravity != 8388611 || !this.isRtl) && (gravity != 8388613 || this.isRtl)) {
                z = false;
            }
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < linearLayoutManager.getChildCount(); i2++) {
                View childAt = linearLayoutManager.getChildAt(i2);
                if (z2) {
                    if (!this.snapToPadding) {
                        iAbs = Math.abs(helper.getDecoratedStart(childAt));
                    } else {
                        iAbs = Math.abs(helper.getStartAfterPadding() - helper.getDecoratedStart(childAt));
                    }
                } else if (z) {
                    if (!this.snapToPadding) {
                        iAbs = Math.abs(helper.getDecoratedEnd(childAt) - helper.getEnd());
                    } else {
                        iAbs = Math.abs(helper.getEndAfterPadding() - helper.getDecoratedEnd(childAt));
                    }
                } else {
                    iAbs = Math.abs((helper.getDecoratedStart(childAt) + (helper.getDecoratedMeasurement(childAt) / 2)) - end);
                }
                if (iAbs < i) {
                    view = childAt;
                    i = iAbs;
                }
            }
        }
        return view;
    }

    public final boolean isAtEdgeOfList(LinearLayoutManager lm) {
        return ((lm.getReverseLayout() || this.gravity != 8388611) && !(lm.getReverseLayout() && this.gravity == 8388613) && ((lm.getReverseLayout() || this.gravity != 48) && !(lm.getReverseLayout() && this.gravity == 80))) ? this.gravity == 17 ? lm.findFirstCompletelyVisibleItemPosition() == 0 || lm.findLastCompletelyVisibleItemPosition() == lm.getItemCount() - 1 : lm.findFirstCompletelyVisibleItemPosition() == 0 : lm.findLastCompletelyVisibleItemPosition() == lm.getItemCount() - 1;
    }

    public final void onScrollStateChanged(int newState) {
        SnapListener snapListener;
        if (newState == 0 && (snapListener = this.listener) != null && this.isScrolling) {
            int i = this.nextSnapPosition;
            if (i != -1) {
                snapListener.onSnap(i);
            } else {
                dispatchSnapChangeWhenPositionIsUnknown();
            }
        }
        this.isScrolling = newState != 0;
    }

    public final void dispatchSnapChangeWhenPositionIsUnknown() {
        View viewFindSnapView;
        int childAdapterPosition;
        RecyclerView.LayoutManager layoutManager = this.recyclerView.getLayoutManager();
        if (layoutManager == null || (viewFindSnapView = findSnapView(layoutManager, false)) == null || (childAdapterPosition = this.recyclerView.getChildAdapterPosition(viewFindSnapView)) == -1) {
            return;
        }
        this.listener.onSnap(childAdapterPosition);
    }

    public final OrientationHelper getVerticalHelper(RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.verticalHelper;
        if (orientationHelper == null || orientationHelper.getLayoutManager() != layoutManager) {
            this.verticalHelper = OrientationHelper.createVerticalHelper(layoutManager);
        }
        return this.verticalHelper;
    }

    public final OrientationHelper getHorizontalHelper(RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.horizontalHelper;
        if (orientationHelper == null || orientationHelper.getLayoutManager() != layoutManager) {
            this.horizontalHelper = OrientationHelper.createHorizontalHelper(layoutManager);
        }
        return this.horizontalHelper;
    }
}
