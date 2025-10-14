package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.animation.AnimationUtils;

/* loaded from: classes7.dex */
public class FadeTabIndicatorInterpolator extends TabIndicatorInterpolator {
    public static final float FADE_THRESHOLD = 0.5f;

    @Override // com.google.android.material.tabs.TabIndicatorInterpolator
    public void updateIndicatorForOffset(TabLayout tabLayout, View view, View view2, float f, @NonNull Drawable drawable) {
        float fLerp;
        if (f >= 0.5f) {
            view = view2;
        }
        RectF rectFCalculateIndicatorWidthForTab = TabIndicatorInterpolator.calculateIndicatorWidthForTab(tabLayout, view);
        if (f < 0.5f) {
            fLerp = AnimationUtils.lerp(1.0f, 0.0f, 0.0f, 0.5f, f);
        } else {
            fLerp = AnimationUtils.lerp(0.0f, 1.0f, 0.5f, 1.0f, f);
        }
        drawable.setBounds((int) rectFCalculateIndicatorWidthForTab.left, drawable.getBounds().top, (int) rectFCalculateIndicatorWidthForTab.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (fLerp * 255.0f));
    }
}
