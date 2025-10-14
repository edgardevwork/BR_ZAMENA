package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.progressindicator.DrawingDelegate;

/* loaded from: classes8.dex */
public final class LinearIndeterminateContiguousAnimatorDelegate extends IndeterminateAnimatorDelegate<ObjectAnimator> {
    public static final Property<LinearIndeterminateContiguousAnimatorDelegate, Float> ANIMATION_FRACTION = new Property<LinearIndeterminateContiguousAnimatorDelegate, Float>(Float.class, "animationFraction") { // from class: com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate.2
        public C69452(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(LinearIndeterminateContiguousAnimatorDelegate linearIndeterminateContiguousAnimatorDelegate) {
            return Float.valueOf(linearIndeterminateContiguousAnimatorDelegate.getAnimationFraction());
        }

        @Override // android.util.Property
        public void set(LinearIndeterminateContiguousAnimatorDelegate linearIndeterminateContiguousAnimatorDelegate, Float f) {
            linearIndeterminateContiguousAnimatorDelegate.setAnimationFraction(f.floatValue());
        }
    };
    public static final int DURATION_PER_CYCLE_IN_MS = 333;
    public static final int TOTAL_DURATION_IN_MS = 667;
    public float animationFraction;
    public ObjectAnimator animator;
    public final BaseProgressIndicatorSpec baseSpec;
    public boolean dirtyColors;
    public FastOutSlowInInterpolator interpolator;
    public int newIndicatorColorIndex;

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void registerAnimatorsCompleteCallback(@Nullable Animatable2Compat.AnimationCallback animationCallback) {
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void requestCancelAnimatorAfterCurrentCycle() {
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void unregisterAnimatorsCompleteCallback() {
    }

    public LinearIndeterminateContiguousAnimatorDelegate(@NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(3);
        this.newIndicatorColorIndex = 1;
        this.baseSpec = linearProgressIndicatorSpec;
        this.interpolator = new FastOutSlowInInterpolator();
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void startAnimator() {
        maybeInitializeAnimators();
        resetPropertiesForNewStart();
        this.animator.start();
    }

    private void maybeInitializeAnimators() {
        if (this.animator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, ANIMATION_FRACTION, 0.0f, 1.0f);
            this.animator = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(333L);
            this.animator.setInterpolator(null);
            this.animator.setRepeatCount(-1);
            this.animator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate.1
                public C69441() {
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                    super.onAnimationRepeat(animator);
                    LinearIndeterminateContiguousAnimatorDelegate linearIndeterminateContiguousAnimatorDelegate = LinearIndeterminateContiguousAnimatorDelegate.this;
                    linearIndeterminateContiguousAnimatorDelegate.newIndicatorColorIndex = (linearIndeterminateContiguousAnimatorDelegate.newIndicatorColorIndex + 1) % LinearIndeterminateContiguousAnimatorDelegate.this.baseSpec.indicatorColors.length;
                    LinearIndeterminateContiguousAnimatorDelegate.this.dirtyColors = true;
                }
            });
        }
    }

    /* renamed from: com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate$1 */
    /* loaded from: classes4.dex */
    public class C69441 extends AnimatorListenerAdapter {
        public C69441() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            LinearIndeterminateContiguousAnimatorDelegate linearIndeterminateContiguousAnimatorDelegate = LinearIndeterminateContiguousAnimatorDelegate.this;
            linearIndeterminateContiguousAnimatorDelegate.newIndicatorColorIndex = (linearIndeterminateContiguousAnimatorDelegate.newIndicatorColorIndex + 1) % LinearIndeterminateContiguousAnimatorDelegate.this.baseSpec.indicatorColors.length;
            LinearIndeterminateContiguousAnimatorDelegate.this.dirtyColors = true;
        }
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void cancelAnimatorImmediately() {
        ObjectAnimator objectAnimator = this.animator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void invalidateSpecValues() {
        resetPropertiesForNewStart();
    }

    private void updateSegmentPositions(int i) {
        this.activeIndicators.get(0).startFraction = 0.0f;
        float fractionInRange = getFractionInRange(i, 0, 667);
        DrawingDelegate.ActiveIndicator activeIndicator = this.activeIndicators.get(0);
        DrawingDelegate.ActiveIndicator activeIndicator2 = this.activeIndicators.get(1);
        float interpolation = this.interpolator.getInterpolation(fractionInRange);
        activeIndicator2.startFraction = interpolation;
        activeIndicator.endFraction = interpolation;
        DrawingDelegate.ActiveIndicator activeIndicator3 = this.activeIndicators.get(1);
        DrawingDelegate.ActiveIndicator activeIndicator4 = this.activeIndicators.get(2);
        float interpolation2 = this.interpolator.getInterpolation(fractionInRange + 0.49925038f);
        activeIndicator4.startFraction = interpolation2;
        activeIndicator3.endFraction = interpolation2;
        this.activeIndicators.get(2).endFraction = 1.0f;
    }

    public final void maybeUpdateSegmentColors() {
        if (!this.dirtyColors || this.activeIndicators.get(1).endFraction >= 1.0f) {
            return;
        }
        this.activeIndicators.get(2).color = this.activeIndicators.get(1).color;
        this.activeIndicators.get(1).color = this.activeIndicators.get(0).color;
        this.activeIndicators.get(0).color = this.baseSpec.indicatorColors[this.newIndicatorColorIndex];
        this.dirtyColors = false;
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    @VisibleForTesting
    public void resetPropertiesForNewStart() {
        this.dirtyColors = true;
        this.newIndicatorColorIndex = 1;
        for (DrawingDelegate.ActiveIndicator activeIndicator : this.activeIndicators) {
            BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.baseSpec;
            activeIndicator.color = baseProgressIndicatorSpec.indicatorColors[0];
            activeIndicator.gapSize = baseProgressIndicatorSpec.indicatorTrackGapSize / 2;
        }
    }

    public float getAnimationFraction() {
        return this.animationFraction;
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    @VisibleForTesting
    public void setAnimationFraction(float f) {
        this.animationFraction = f;
        updateSegmentPositions((int) (f * 333.0f));
        maybeUpdateSegmentColors();
        this.drawable.invalidateSelf();
    }

    /* renamed from: com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate$2 */
    /* loaded from: classes4.dex */
    public class C69452 extends Property<LinearIndeterminateContiguousAnimatorDelegate, Float> {
        public C69452(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(LinearIndeterminateContiguousAnimatorDelegate linearIndeterminateContiguousAnimatorDelegate) {
            return Float.valueOf(linearIndeterminateContiguousAnimatorDelegate.getAnimationFraction());
        }

        @Override // android.util.Property
        public void set(LinearIndeterminateContiguousAnimatorDelegate linearIndeterminateContiguousAnimatorDelegate, Float f) {
            linearIndeterminateContiguousAnimatorDelegate.setAnimationFraction(f.floatValue());
        }
    }
}
