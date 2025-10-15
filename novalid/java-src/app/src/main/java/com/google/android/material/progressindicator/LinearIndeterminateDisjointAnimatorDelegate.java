package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.math.MathUtils;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import androidx.vectordrawable.graphics.drawable.AnimationUtilsCompat;
import com.google.android.material.C6765R;
import com.google.android.material.progressindicator.DrawingDelegate;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class LinearIndeterminateDisjointAnimatorDelegate extends IndeterminateAnimatorDelegate<ObjectAnimator> {
    public static final int TOTAL_DURATION_IN_MS = 1800;
    public float animationFraction;
    public ObjectAnimator animator;
    public Animatable2Compat.AnimationCallback animatorCompleteCallback;
    public final BaseProgressIndicatorSpec baseSpec;
    public ObjectAnimator completeEndAnimator;
    public boolean dirtyColors;
    public int indicatorColorIndex;
    public final Interpolator[] interpolatorArray;
    public static final int[] DURATION_TO_MOVE_SEGMENT_ENDS = {533, 567, 850, 750};
    public static final int[] DELAY_TO_MOVE_SEGMENT_ENDS = {1267, 1000, 333, 0};
    public static final Property<LinearIndeterminateDisjointAnimatorDelegate, Float> ANIMATION_FRACTION = new Property<LinearIndeterminateDisjointAnimatorDelegate, Float>(Float.class, "animationFraction") { // from class: com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.3
        public C69483(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate) {
            return Float.valueOf(linearIndeterminateDisjointAnimatorDelegate.getAnimationFraction());
        }

        @Override // android.util.Property
        public void set(LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate, Float f) {
            linearIndeterminateDisjointAnimatorDelegate.setAnimationFraction(f.floatValue());
        }
    };

    public LinearIndeterminateDisjointAnimatorDelegate(@NonNull Context context, @NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(2);
        this.indicatorColorIndex = 0;
        this.animatorCompleteCallback = null;
        this.baseSpec = linearProgressIndicatorSpec;
        this.interpolatorArray = new Interpolator[]{AnimationUtilsCompat.loadInterpolator(context, C6765R.anim.linear_indeterminate_line1_head_interpolator), AnimationUtilsCompat.loadInterpolator(context, C6765R.anim.linear_indeterminate_line1_tail_interpolator), AnimationUtilsCompat.loadInterpolator(context, C6765R.anim.linear_indeterminate_line2_head_interpolator), AnimationUtilsCompat.loadInterpolator(context, C6765R.anim.linear_indeterminate_line2_tail_interpolator)};
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
            objectAnimatorOfFloat.setDuration(1800L);
            this.animator.setInterpolator(null);
            this.animator.setRepeatCount(-1);
            this.animator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.1
                public C69461() {
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                    super.onAnimationRepeat(animator);
                    LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate = LinearIndeterminateDisjointAnimatorDelegate.this;
                    linearIndeterminateDisjointAnimatorDelegate.indicatorColorIndex = (linearIndeterminateDisjointAnimatorDelegate.indicatorColorIndex + 1) % LinearIndeterminateDisjointAnimatorDelegate.this.baseSpec.indicatorColors.length;
                    LinearIndeterminateDisjointAnimatorDelegate.this.dirtyColors = true;
                }
            });
        }
        if (this.completeEndAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, ANIMATION_FRACTION, 1.0f);
            this.completeEndAnimator = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(1800L);
            this.completeEndAnimator.setInterpolator(null);
            this.completeEndAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.2
                public C69472() {
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    LinearIndeterminateDisjointAnimatorDelegate.this.cancelAnimatorImmediately();
                    LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate = LinearIndeterminateDisjointAnimatorDelegate.this;
                    Animatable2Compat.AnimationCallback animationCallback = linearIndeterminateDisjointAnimatorDelegate.animatorCompleteCallback;
                    if (animationCallback != null) {
                        animationCallback.onAnimationEnd(linearIndeterminateDisjointAnimatorDelegate.drawable);
                    }
                }
            });
        }
    }

    /* renamed from: com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate$1 */
    /* loaded from: classes4.dex */
    public class C69461 extends AnimatorListenerAdapter {
        public C69461() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate = LinearIndeterminateDisjointAnimatorDelegate.this;
            linearIndeterminateDisjointAnimatorDelegate.indicatorColorIndex = (linearIndeterminateDisjointAnimatorDelegate.indicatorColorIndex + 1) % LinearIndeterminateDisjointAnimatorDelegate.this.baseSpec.indicatorColors.length;
            LinearIndeterminateDisjointAnimatorDelegate.this.dirtyColors = true;
        }
    }

    /* renamed from: com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate$2 */
    /* loaded from: classes4.dex */
    public class C69472 extends AnimatorListenerAdapter {
        public C69472() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            LinearIndeterminateDisjointAnimatorDelegate.this.cancelAnimatorImmediately();
            LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate = LinearIndeterminateDisjointAnimatorDelegate.this;
            Animatable2Compat.AnimationCallback animationCallback = linearIndeterminateDisjointAnimatorDelegate.animatorCompleteCallback;
            if (animationCallback != null) {
                animationCallback.onAnimationEnd(linearIndeterminateDisjointAnimatorDelegate.drawable);
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
        cancelAnimatorImmediately();
        if (this.drawable.isVisible()) {
            this.completeEndAnimator.setFloatValues(this.animationFraction, 1.0f);
            this.completeEndAnimator.setDuration((long) ((1.0f - this.animationFraction) * 1800.0f));
            this.completeEndAnimator.start();
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

    private void updateSegmentPositions(int i) {
        for (int i2 = 0; i2 < this.activeIndicators.size(); i2++) {
            DrawingDelegate.ActiveIndicator activeIndicator = this.activeIndicators.get(i2);
            int[] iArr = DELAY_TO_MOVE_SEGMENT_ENDS;
            int i3 = i2 * 2;
            int i4 = iArr[i3];
            int[] iArr2 = DURATION_TO_MOVE_SEGMENT_ENDS;
            activeIndicator.startFraction = MathUtils.clamp(this.interpolatorArray[i3].getInterpolation(getFractionInRange(i, i4, iArr2[i3])), 0.0f, 1.0f);
            int i5 = i3 + 1;
            activeIndicator.endFraction = MathUtils.clamp(this.interpolatorArray[i5].getInterpolation(getFractionInRange(i, iArr[i5], iArr2[i5])), 0.0f, 1.0f);
        }
    }

    private void maybeUpdateSegmentColors() {
        if (this.dirtyColors) {
            Iterator<DrawingDelegate.ActiveIndicator> it = this.activeIndicators.iterator();
            while (it.hasNext()) {
                it.next().color = this.baseSpec.indicatorColors[this.indicatorColorIndex];
            }
            this.dirtyColors = false;
        }
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    @VisibleForTesting
    public void resetPropertiesForNewStart() {
        this.indicatorColorIndex = 0;
        Iterator<DrawingDelegate.ActiveIndicator> it = this.activeIndicators.iterator();
        while (it.hasNext()) {
            it.next().color = this.baseSpec.indicatorColors[0];
        }
    }

    public float getAnimationFraction() {
        return this.animationFraction;
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    @VisibleForTesting
    public void setAnimationFraction(float f) {
        this.animationFraction = f;
        updateSegmentPositions((int) (f * 1800.0f));
        maybeUpdateSegmentColors();
        this.drawable.invalidateSelf();
    }

    /* renamed from: com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate$3 */
    /* loaded from: classes4.dex */
    public class C69483 extends Property<LinearIndeterminateDisjointAnimatorDelegate, Float> {
        public C69483(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate) {
            return Float.valueOf(linearIndeterminateDisjointAnimatorDelegate.getAnimationFraction());
        }

        @Override // android.util.Property
        public void set(LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate, Float f) {
            linearIndeterminateDisjointAnimatorDelegate.setAnimationFraction(f.floatValue());
        }
    }
}
