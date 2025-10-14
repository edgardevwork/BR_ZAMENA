package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.animation.ArgbEvaluatorCompat;
import com.google.android.material.progressindicator.DrawingDelegate;

/* loaded from: classes8.dex */
public final class CircularIndeterminateAnimatorDelegate extends IndeterminateAnimatorDelegate<ObjectAnimator> {
    public static final int CONSTANT_ROTATION_DEGREES = 1520;
    public static final int DURATION_TO_COLLAPSE_IN_MS = 667;
    public static final int DURATION_TO_COMPLETE_END_IN_MS = 333;
    public static final int DURATION_TO_EXPAND_IN_MS = 667;
    public static final int DURATION_TO_FADE_IN_MS = 333;
    public static final int EXTRA_DEGREES_PER_CYCLE = 250;
    public static final int TAIL_DEGREES_OFFSET = -20;
    public static final int TOTAL_CYCLES = 4;
    public static final int TOTAL_DURATION_IN_MS = 5400;
    public float animationFraction;
    public ObjectAnimator animator;
    public Animatable2Compat.AnimationCallback animatorCompleteCallback;
    public final BaseProgressIndicatorSpec baseSpec;
    public ObjectAnimator completeEndAnimator;
    public float completeEndFraction;
    public int indicatorColorIndexOffset;
    public final FastOutSlowInInterpolator interpolator;
    public static final int[] DELAY_TO_EXPAND_IN_MS = {0, 1350, 2700, 4050};
    public static final int[] DELAY_TO_COLLAPSE_IN_MS = {667, 2017, 3367, 4717};
    public static final int[] DELAY_TO_FADE_IN_MS = {1000, 2350, 3700, 5050};
    public static final Property<CircularIndeterminateAnimatorDelegate, Float> ANIMATION_FRACTION = new Property<CircularIndeterminateAnimatorDelegate, Float>(Float.class, "animationFraction") { // from class: com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate.3
        public C69383(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate) {
            return Float.valueOf(circularIndeterminateAnimatorDelegate.getAnimationFraction());
        }

        @Override // android.util.Property
        public void set(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate, Float f) {
            circularIndeterminateAnimatorDelegate.setAnimationFraction(f.floatValue());
        }
    };
    public static final Property<CircularIndeterminateAnimatorDelegate, Float> COMPLETE_END_FRACTION = new Property<CircularIndeterminateAnimatorDelegate, Float>(Float.class, "completeEndFraction") { // from class: com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate.4
        public C69394(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate) {
            return Float.valueOf(circularIndeterminateAnimatorDelegate.getCompleteEndFraction());
        }

        @Override // android.util.Property
        public void set(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate, Float f) {
            circularIndeterminateAnimatorDelegate.setCompleteEndFraction(f.floatValue());
        }
    };

    public CircularIndeterminateAnimatorDelegate(@NonNull CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(1);
        this.indicatorColorIndexOffset = 0;
        this.animatorCompleteCallback = null;
        this.baseSpec = circularProgressIndicatorSpec;
        this.interpolator = new FastOutSlowInInterpolator();
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void startAnimator() {
        maybeInitializeAnimators();
        resetPropertiesForNewStart();
        this.animator.start();
    }

    public final void maybeInitializeAnimators() {
        if (this.animator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, ANIMATION_FRACTION, 0.0f, 1.0f);
            this.animator = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(5400L);
            this.animator.setInterpolator(null);
            this.animator.setRepeatCount(-1);
            this.animator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate.1
                public C69361() {
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                    super.onAnimationRepeat(animator);
                    CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate = CircularIndeterminateAnimatorDelegate.this;
                    circularIndeterminateAnimatorDelegate.indicatorColorIndexOffset = (circularIndeterminateAnimatorDelegate.indicatorColorIndexOffset + 4) % CircularIndeterminateAnimatorDelegate.this.baseSpec.indicatorColors.length;
                }
            });
        }
        if (this.completeEndAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, COMPLETE_END_FRACTION, 0.0f, 1.0f);
            this.completeEndAnimator = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(333L);
            this.completeEndAnimator.setInterpolator(this.interpolator);
            this.completeEndAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate.2
                public C69372() {
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    CircularIndeterminateAnimatorDelegate.this.cancelAnimatorImmediately();
                    CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate = CircularIndeterminateAnimatorDelegate.this;
                    Animatable2Compat.AnimationCallback animationCallback = circularIndeterminateAnimatorDelegate.animatorCompleteCallback;
                    if (animationCallback != null) {
                        animationCallback.onAnimationEnd(circularIndeterminateAnimatorDelegate.drawable);
                    }
                }
            });
        }
    }

    /* renamed from: com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate$1 */
    /* loaded from: classes4.dex */
    public class C69361 extends AnimatorListenerAdapter {
        public C69361() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate = CircularIndeterminateAnimatorDelegate.this;
            circularIndeterminateAnimatorDelegate.indicatorColorIndexOffset = (circularIndeterminateAnimatorDelegate.indicatorColorIndexOffset + 4) % CircularIndeterminateAnimatorDelegate.this.baseSpec.indicatorColors.length;
        }
    }

    /* renamed from: com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate$2 */
    /* loaded from: classes4.dex */
    public class C69372 extends AnimatorListenerAdapter {
        public C69372() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            CircularIndeterminateAnimatorDelegate.this.cancelAnimatorImmediately();
            CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate = CircularIndeterminateAnimatorDelegate.this;
            Animatable2Compat.AnimationCallback animationCallback = circularIndeterminateAnimatorDelegate.animatorCompleteCallback;
            if (animationCallback != null) {
                animationCallback.onAnimationEnd(circularIndeterminateAnimatorDelegate.drawable);
            }
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
    public void requestCancelAnimatorAfterCurrentCycle() {
        ObjectAnimator objectAnimator = this.completeEndAnimator;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.drawable.isVisible()) {
            this.completeEndAnimator.start();
        } else {
            cancelAnimatorImmediately();
        }
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void invalidateSpecValues() {
        resetPropertiesForNewStart();
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void registerAnimatorsCompleteCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        this.animatorCompleteCallback = animationCallback;
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void unregisterAnimatorsCompleteCallback() {
        this.animatorCompleteCallback = null;
    }

    public final void updateSegmentPositions(int i) {
        DrawingDelegate.ActiveIndicator activeIndicator = this.activeIndicators.get(0);
        float f = this.animationFraction;
        activeIndicator.startFraction = (f * 1520.0f) - 20.0f;
        activeIndicator.endFraction = f * 1520.0f;
        for (int i2 = 0; i2 < 4; i2++) {
            activeIndicator.endFraction += this.interpolator.getInterpolation(getFractionInRange(i, DELAY_TO_EXPAND_IN_MS[i2], 667)) * 250.0f;
            activeIndicator.startFraction += this.interpolator.getInterpolation(getFractionInRange(i, DELAY_TO_COLLAPSE_IN_MS[i2], 667)) * 250.0f;
        }
        float f2 = activeIndicator.startFraction;
        float f3 = activeIndicator.endFraction;
        activeIndicator.startFraction = (f2 + ((f3 - f2) * this.completeEndFraction)) / 360.0f;
        activeIndicator.endFraction = f3 / 360.0f;
    }

    public final void maybeUpdateSegmentColors(int i) {
        for (int i2 = 0; i2 < 4; i2++) {
            float fractionInRange = getFractionInRange(i, DELAY_TO_FADE_IN_MS[i2], 333);
            if (fractionInRange >= 0.0f && fractionInRange <= 1.0f) {
                int i3 = i2 + this.indicatorColorIndexOffset;
                int[] iArr = this.baseSpec.indicatorColors;
                int length = i3 % iArr.length;
                int length2 = (length + 1) % iArr.length;
                int i4 = iArr[length];
                int i5 = iArr[length2];
                this.activeIndicators.get(0).color = ArgbEvaluatorCompat.getInstance().evaluate(this.interpolator.getInterpolation(fractionInRange), Integer.valueOf(i4), Integer.valueOf(i5)).intValue();
                return;
            }
        }
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    @VisibleForTesting
    public void resetPropertiesForNewStart() {
        this.indicatorColorIndexOffset = 0;
        this.activeIndicators.get(0).color = this.baseSpec.indicatorColors[0];
        this.completeEndFraction = 0.0f;
    }

    public final float getAnimationFraction() {
        return this.animationFraction;
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    @VisibleForTesting
    public void setAnimationFraction(float f) {
        this.animationFraction = f;
        int i = (int) (f * 5400.0f);
        updateSegmentPositions(i);
        maybeUpdateSegmentColors(i);
        this.drawable.invalidateSelf();
    }

    public final float getCompleteEndFraction() {
        return this.completeEndFraction;
    }

    public final void setCompleteEndFraction(float f) {
        this.completeEndFraction = f;
    }

    /* renamed from: com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate$3 */
    /* loaded from: classes4.dex */
    public class C69383 extends Property<CircularIndeterminateAnimatorDelegate, Float> {
        public C69383(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate) {
            return Float.valueOf(circularIndeterminateAnimatorDelegate.getAnimationFraction());
        }

        @Override // android.util.Property
        public void set(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate, Float f) {
            circularIndeterminateAnimatorDelegate.setAnimationFraction(f.floatValue());
        }
    }

    /* renamed from: com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate$4 */
    /* loaded from: classes4.dex */
    public class C69394 extends Property<CircularIndeterminateAnimatorDelegate, Float> {
        public C69394(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate) {
            return Float.valueOf(circularIndeterminateAnimatorDelegate.getCompleteEndFraction());
        }

        @Override // android.util.Property
        public void set(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate, Float f) {
            circularIndeterminateAnimatorDelegate.setCompleteEndFraction(f.floatValue());
        }
    }
}
