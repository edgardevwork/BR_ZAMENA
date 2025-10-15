package com.gcssloop.widget;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearSmoothScroller;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.view.View;

/* loaded from: classes4.dex */
public class PagerGridSnapHelper extends SnapHelper {
    public RecyclerView mRecyclerView;

    public void attachToRecyclerView(@Nullable RecyclerView recyclerView) throws IllegalStateException {
        super.attachToRecyclerView(recyclerView);
        this.mRecyclerView = recyclerView;
    }

    @Nullable
    public int[] calculateDistanceToFinalSnap(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view) {
        int position = layoutManager.getPosition(view);
        PagerConfig.Loge("findTargetSnapPosition, pos = " + position);
        return layoutManager instanceof PagerGridLayoutManager ? ((PagerGridLayoutManager) layoutManager).getSnapOffset(position) : new int[2];
    }

    @Nullable
    public View findSnapView(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof PagerGridLayoutManager) {
            return ((PagerGridLayoutManager) layoutManager).findSnapView();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        int iFindPrePageFirstPos;
        PagerConfig.Loge("findTargetSnapPosition, velocityX = " + i + ", velocityY" + i2);
        if (layoutManager == null || !(layoutManager instanceof PagerGridLayoutManager)) {
            iFindPrePageFirstPos = -1;
        } else {
            PagerGridLayoutManager pagerGridLayoutManager = (PagerGridLayoutManager) layoutManager;
            if (pagerGridLayoutManager.canScrollHorizontally()) {
                if (i > PagerConfig.getFlingThreshold()) {
                    iFindPrePageFirstPos = pagerGridLayoutManager.findNextPageFirstPos();
                } else if (i < (-PagerConfig.getFlingThreshold())) {
                    iFindPrePageFirstPos = pagerGridLayoutManager.findPrePageFirstPos();
                }
            } else if (pagerGridLayoutManager.canScrollVertically()) {
                if (i2 > PagerConfig.getFlingThreshold()) {
                    iFindPrePageFirstPos = pagerGridLayoutManager.findNextPageFirstPos();
                } else if (i2 < (-PagerConfig.getFlingThreshold())) {
                    iFindPrePageFirstPos = pagerGridLayoutManager.findPrePageFirstPos();
                }
            }
        }
        PagerConfig.Loge("findTargetSnapPosition, target = " + iFindPrePageFirstPos);
        return iFindPrePageFirstPos;
    }

    public boolean onFling(int i, int i2) {
        RecyclerView.LayoutManager layoutManager = this.mRecyclerView.getLayoutManager();
        if (layoutManager == null || this.mRecyclerView.getAdapter() == null) {
            return false;
        }
        int flingThreshold = PagerConfig.getFlingThreshold();
        PagerConfig.Loge("minFlingVelocity = " + flingThreshold);
        return (Math.abs(i2) > flingThreshold || Math.abs(i) > flingThreshold) && snapFromFling(layoutManager, i, i2);
    }

    public final boolean snapFromFling(@NonNull RecyclerView.LayoutManager layoutManager, int i, int i2) {
        LinearSmoothScroller linearSmoothScrollerCreateSnapScroller;
        int iFindTargetSnapPosition;
        if (!(layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) || (linearSmoothScrollerCreateSnapScroller = createSnapScroller(layoutManager)) == null || (iFindTargetSnapPosition = findTargetSnapPosition(layoutManager, i, i2)) == -1) {
            return false;
        }
        linearSmoothScrollerCreateSnapScroller.setTargetPosition(iFindTargetSnapPosition);
        layoutManager.startSmoothScroll(linearSmoothScrollerCreateSnapScroller);
        return true;
    }

    public LinearSmoothScroller createSnapScroller(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) {
            return new PagerGridSmoothScroller(this.mRecyclerView);
        }
        return null;
    }

    public void setFlingThreshold(int i) {
        PagerConfig.setFlingThreshold(i);
    }
}
