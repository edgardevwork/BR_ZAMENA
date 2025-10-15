package com.gcssloop.widget;

import android.support.annotation.NonNull;
import android.support.v7.widget.LinearSmoothScroller;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.View;

/* loaded from: classes4.dex */
public class PagerGridSmoothScroller extends LinearSmoothScroller {
    public RecyclerView mRecyclerView;

    public PagerGridSmoothScroller(@NonNull RecyclerView recyclerView) {
        super(recyclerView.getContext());
        this.mRecyclerView = recyclerView;
    }

    public void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
        RecyclerView.LayoutManager layoutManager = this.mRecyclerView.getLayoutManager();
        if (layoutManager != null && (layoutManager instanceof PagerGridLayoutManager)) {
            int[] snapOffset = ((PagerGridLayoutManager) layoutManager).getSnapOffset(this.mRecyclerView.getChildAdapterPosition(view));
            int i = snapOffset[0];
            int i2 = snapOffset[1];
            PagerConfig.Logi("dx = " + i);
            PagerConfig.Logi("dy = " + i2);
            int iCalculateTimeForScrolling = calculateTimeForScrolling(Math.max(Math.abs(i), Math.abs(i2)));
            if (iCalculateTimeForScrolling > 0) {
                action.update(i, i2, iCalculateTimeForScrolling, this.mDecelerateInterpolator);
            }
        }
    }

    public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        return PagerConfig.getMillisecondsPreInch() / displayMetrics.densityDpi;
    }
}
