package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.Dimension;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes4.dex */
public class TabIndicatorInterpolator {

    @Dimension(unit = 0)
    public static final int MIN_INDICATOR_WIDTH = 24;

    public static RectF calculateTabViewContentBounds(@NonNull TabLayout.TabView tabView, @Dimension(unit = 0) int i) {
        int contentWidth = tabView.getContentWidth();
        int contentHeight = tabView.getContentHeight();
        int iDpToPx = (int) ViewUtils.dpToPx(tabView.getContext(), i);
        if (contentWidth < iDpToPx) {
            contentWidth = iDpToPx;
        }
        int left = (tabView.getLeft() + tabView.getRight()) / 2;
        int top = (tabView.getTop() + tabView.getBottom()) / 2;
        int i2 = contentWidth / 2;
        return new RectF(left - i2, top - (contentHeight / 2), i2 + left, top + (left / 2));
    }

    public static RectF calculateIndicatorWidthForTab(TabLayout tabLayout, @Nullable View view) {
        if (view == null) {
            return new RectF();
        }
        if (!tabLayout.isTabIndicatorFullWidth() && (view instanceof TabLayout.TabView)) {
            return calculateTabViewContentBounds((TabLayout.TabView) view, 24);
        }
        return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    public void setIndicatorBoundsForTab(TabLayout tabLayout, View view, @NonNull Drawable drawable) {
        RectF rectFCalculateIndicatorWidthForTab = calculateIndicatorWidthForTab(tabLayout, view);
        drawable.setBounds((int) rectFCalculateIndicatorWidthForTab.left, drawable.getBounds().top, (int) rectFCalculateIndicatorWidthForTab.right, drawable.getBounds().bottom);
    }

    public void updateIndicatorForOffset(TabLayout tabLayout, View view, View view2, @FloatRange(from = 0.0d, m9to = 1.0d) float f, @NonNull Drawable drawable) {
        RectF rectFCalculateIndicatorWidthForTab = calculateIndicatorWidthForTab(tabLayout, view);
        RectF rectFCalculateIndicatorWidthForTab2 = calculateIndicatorWidthForTab(tabLayout, view2);
        drawable.setBounds(AnimationUtils.lerp((int) rectFCalculateIndicatorWidthForTab.left, (int) rectFCalculateIndicatorWidthForTab2.left, f), drawable.getBounds().top, AnimationUtils.lerp((int) rectFCalculateIndicatorWidthForTab.right, (int) rectFCalculateIndicatorWidthForTab2.right, f), drawable.getBounds().bottom);
    }
}
