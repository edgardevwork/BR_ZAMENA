package com.blackhub.bronline.game.common.dotrvindicator;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import androidx.annotation.AnimatorRes;
import androidx.annotation.DrawableRes;
import com.blackhub.bronline.C3489R;
import com.bless.client.R;

/* loaded from: classes.dex */
public class DotViewIndicator extends LinearLayout {
    public static final int DEFAULT_INDICATOR_WIDTH = 5;
    public int currentPosition;
    public boolean isAnimationEnable;
    public int itemCount;
    public Animator mAnimatorIn;
    public Animator mAnimatorOut;
    public int mAnimatorResId;
    public int mAnimatorReverseResId;
    public Animator mImmediateAnimatorIn;
    public Animator mImmediateAnimatorOut;
    public int mIndicatorBackgroundResId;
    public int mIndicatorHeight;
    public int mIndicatorMargin;
    public int mIndicatorUnselectedBackgroundResId;
    public int mIndicatorWidth;
    public int mLastPosition;

    public DotViewIndicator(Context context) throws Resources.NotFoundException {
        super(context);
        this.mLastPosition = -1;
        this.mIndicatorMargin = -1;
        this.mIndicatorWidth = -1;
        this.mIndicatorHeight = -1;
        this.mAnimatorResId = R.animator.scale_with_alpha;
        this.mAnimatorReverseResId = 0;
        this.mIndicatorBackgroundResId = R.drawable.bg_oval_white;
        this.mIndicatorUnselectedBackgroundResId = R.drawable.bg_oval_white;
        this.isAnimationEnable = true;
        init(context, null);
    }

    public DotViewIndicator(Context context, AttributeSet attrs) throws Resources.NotFoundException {
        super(context, attrs);
        this.mLastPosition = -1;
        this.mIndicatorMargin = -1;
        this.mIndicatorWidth = -1;
        this.mIndicatorHeight = -1;
        this.mAnimatorResId = R.animator.scale_with_alpha;
        this.mAnimatorReverseResId = 0;
        this.mIndicatorBackgroundResId = R.drawable.bg_oval_white;
        this.mIndicatorUnselectedBackgroundResId = R.drawable.bg_oval_white;
        this.isAnimationEnable = true;
        init(context, attrs);
    }

    public DotViewIndicator(Context context, AttributeSet attrs, int defStyleAttr) throws Resources.NotFoundException {
        super(context, attrs, defStyleAttr);
        this.mLastPosition = -1;
        this.mIndicatorMargin = -1;
        this.mIndicatorWidth = -1;
        this.mIndicatorHeight = -1;
        this.mAnimatorResId = R.animator.scale_with_alpha;
        this.mAnimatorReverseResId = 0;
        this.mIndicatorBackgroundResId = R.drawable.bg_oval_white;
        this.mIndicatorUnselectedBackgroundResId = R.drawable.bg_oval_white;
        this.isAnimationEnable = true;
        init(context, attrs);
    }

    public DotViewIndicator(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) throws Resources.NotFoundException {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.mLastPosition = -1;
        this.mIndicatorMargin = -1;
        this.mIndicatorWidth = -1;
        this.mIndicatorHeight = -1;
        this.mAnimatorResId = R.animator.scale_with_alpha;
        this.mAnimatorReverseResId = 0;
        this.mIndicatorBackgroundResId = R.drawable.bg_oval_white;
        this.mIndicatorUnselectedBackgroundResId = R.drawable.bg_oval_white;
        this.isAnimationEnable = true;
        init(context, attrs);
    }

    public final void init(Context context, AttributeSet attrs) throws Resources.NotFoundException {
        handleTypedArray(context, attrs);
        checkIndicatorConfig(context);
    }

    public final void handleTypedArray(Context context, AttributeSet attrs) {
        if (attrs == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C3489R.styleable.DotViewIndicator);
        this.mIndicatorWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, -1);
        this.mIndicatorHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, -1);
        this.mIndicatorMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -1);
        this.mAnimatorResId = typedArrayObtainStyledAttributes.getResourceId(1, R.animator.scale_with_alpha);
        this.mAnimatorReverseResId = typedArrayObtainStyledAttributes.getResourceId(2, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, R.drawable.bg_oval_white);
        this.mIndicatorBackgroundResId = resourceId;
        this.mIndicatorUnselectedBackgroundResId = typedArrayObtainStyledAttributes.getResourceId(6, resourceId);
        this.isAnimationEnable = typedArrayObtainStyledAttributes.getBoolean(0, true);
        setOrientation(typedArrayObtainStyledAttributes.getInt(10, -1) != 1 ? 0 : 1);
        int i = typedArrayObtainStyledAttributes.getInt(7, -1);
        if (i < 0) {
            i = 17;
        }
        setGravity(i);
        typedArrayObtainStyledAttributes.recycle();
    }

    public void configureIndicator(int indicatorWidth, int indicatorHeight, int indicatorMargin) throws Resources.NotFoundException {
        configureIndicator(indicatorWidth, indicatorHeight, indicatorMargin, R.animator.scale_with_alpha, 0, R.drawable.bg_oval_white, R.drawable.bg_oval_white);
    }

    public void configureIndicator(int indicatorWidth, int indicatorHeight, int indicatorMargin, @AnimatorRes int animatorId, @AnimatorRes int animatorReverseId, @DrawableRes int indicatorBackgroundId, @DrawableRes int indicatorUnselectedBackgroundId) throws Resources.NotFoundException {
        this.mIndicatorWidth = indicatorWidth;
        this.mIndicatorHeight = indicatorHeight;
        this.mIndicatorMargin = indicatorMargin;
        this.mAnimatorResId = animatorId;
        this.mAnimatorReverseResId = animatorReverseId;
        this.mIndicatorBackgroundResId = indicatorBackgroundId;
        this.mIndicatorUnselectedBackgroundResId = indicatorUnselectedBackgroundId;
        checkIndicatorConfig(getContext());
    }

    public final void checkIndicatorConfig(Context context) throws Resources.NotFoundException {
        int iDip2px = this.mIndicatorWidth;
        if (iDip2px < 0) {
            iDip2px = dip2px(5.0f);
        }
        this.mIndicatorWidth = iDip2px;
        int iDip2px2 = this.mIndicatorHeight;
        if (iDip2px2 < 0) {
            iDip2px2 = dip2px(5.0f);
        }
        this.mIndicatorHeight = iDip2px2;
        int iDip2px3 = this.mIndicatorMargin;
        if (iDip2px3 < 0) {
            iDip2px3 = dip2px(5.0f);
        }
        this.mIndicatorMargin = iDip2px3;
        int i = this.mAnimatorResId;
        if (i == 0) {
            i = R.animator.scale_with_alpha;
        }
        this.mAnimatorResId = i;
        this.mAnimatorOut = createAnimatorOut(context);
        Animator animatorCreateAnimatorOut = createAnimatorOut(context);
        this.mImmediateAnimatorOut = animatorCreateAnimatorOut;
        animatorCreateAnimatorOut.setDuration(0L);
        this.mAnimatorIn = createAnimatorIn(context);
        Animator animatorCreateAnimatorIn = createAnimatorIn(context);
        this.mImmediateAnimatorIn = animatorCreateAnimatorIn;
        animatorCreateAnimatorIn.setDuration(0L);
        int i2 = this.mIndicatorBackgroundResId;
        if (i2 == 0) {
            i2 = R.drawable.bg_oval_white;
        }
        this.mIndicatorBackgroundResId = i2;
        int i3 = this.mIndicatorUnselectedBackgroundResId;
        if (i3 != 0) {
            i2 = i3;
        }
        this.mIndicatorUnselectedBackgroundResId = i2;
    }

    public final Animator createAnimatorOut(Context context) {
        return AnimatorInflater.loadAnimator(context, this.mAnimatorResId);
    }

    public final Animator createAnimatorIn(Context context) throws Resources.NotFoundException {
        int i = this.mAnimatorReverseResId;
        if (i == 0) {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, this.mAnimatorResId);
            animatorLoadAnimator.setInterpolator(new ReverseInterpolator());
            return animatorLoadAnimator;
        }
        return AnimatorInflater.loadAnimator(context, i);
    }

    public void updateCircleIndicator() {
        int itemCount = getItemCount();
        if (itemCount == getChildCount()) {
            return;
        }
        if (this.mLastPosition < itemCount) {
            this.mLastPosition = getCurrentPosition();
        } else {
            this.mLastPosition = -1;
        }
        if (this.mLastPosition == -1 && itemCount > 0) {
            this.mLastPosition = 0;
        }
        createIndicators();
    }

    public void onCurrentLocationChange() {
        View childAt;
        if (this.isAnimationEnable) {
            if (this.mAnimatorIn.isRunning()) {
                this.mAnimatorIn.end();
                this.mAnimatorIn.cancel();
            }
            if (this.mAnimatorOut.isRunning()) {
                this.mAnimatorOut.end();
                this.mAnimatorOut.cancel();
            }
        }
        int i = this.mLastPosition;
        if (i >= 0 && (childAt = getChildAt(i)) != null) {
            childAt.setBackgroundResource(this.mIndicatorUnselectedBackgroundResId);
            if (this.isAnimationEnable) {
                this.mAnimatorIn.setTarget(childAt);
                this.mAnimatorIn.start();
            }
        }
        int currentPosition = getCurrentPosition();
        View childAt2 = getChildAt(currentPosition);
        if (childAt2 != null) {
            childAt2.setBackgroundResource(this.mIndicatorBackgroundResId);
            if (this.isAnimationEnable) {
                this.mAnimatorOut.setTarget(childAt2);
                this.mAnimatorOut.start();
            }
        }
        this.mLastPosition = currentPosition;
    }

    public int getItemCount() {
        return this.itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
        updateCircleIndicator();
    }

    public int getCurrentPosition() {
        return this.currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
        onCurrentLocationChange();
    }

    public final void createIndicators() {
        removeAllViews();
        int itemCount = getItemCount();
        if (itemCount <= 0) {
            return;
        }
        int currentPosition = getCurrentPosition();
        int orientation = getOrientation();
        if (currentPosition < 0) {
            currentPosition = 0;
        }
        for (int i = 0; i < itemCount; i++) {
            if (currentPosition == i) {
                addIndicator(orientation, this.mIndicatorBackgroundResId, this.mImmediateAnimatorOut);
            } else {
                addIndicator(orientation, this.mIndicatorUnselectedBackgroundResId, this.mImmediateAnimatorIn);
            }
        }
    }

    public final void addIndicator(int orientation, @DrawableRes int backgroundDrawableId, Animator animator) {
        if (this.isAnimationEnable && animator.isRunning()) {
            animator.end();
            animator.cancel();
        }
        View view = new View(getContext());
        view.setBackgroundResource(backgroundDrawableId);
        addView(view, this.mIndicatorWidth, this.mIndicatorHeight);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        if (orientation == 0) {
            int i = this.mIndicatorMargin;
            layoutParams.leftMargin = i;
            layoutParams.rightMargin = i;
        } else {
            int i2 = this.mIndicatorMargin;
            layoutParams.topMargin = i2;
            layoutParams.bottomMargin = i2;
        }
        view.setLayoutParams(layoutParams);
        if (this.isAnimationEnable) {
            animator.setTarget(view);
            animator.start();
        }
    }

    public int dip2px(float dpValue) {
        return (int) ((dpValue * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static class ReverseInterpolator implements Interpolator {
        public ReverseInterpolator() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float value) {
            return Math.abs(1.0f - value);
        }
    }
}
