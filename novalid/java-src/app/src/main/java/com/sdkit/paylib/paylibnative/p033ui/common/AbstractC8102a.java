package com.sdkit.paylib.paylibnative.p033ui.common;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.common.a */
/* loaded from: classes8.dex */
public abstract class AbstractC8102a {

    /* renamed from: com.sdkit.paylib.paylibnative.ui.common.a$a */
    public static final class a implements Animator.AnimatorListener {

        /* renamed from: a */
        public final /* synthetic */ Function0 f1800a;

        public a(Function0 function0) {
            this.f1800a = function0;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            this.f1800a.invoke();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.common.a$b */
    public static final class b implements Animator.AnimatorListener {

        /* renamed from: a */
        public final /* synthetic */ Function1 f1801a;

        /* renamed from: b */
        public final /* synthetic */ int f1802b;

        public b(Function1 function1, int i) {
            this.f1801a = function1;
            this.f1802b = i;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            this.f1801a.invoke(Integer.valueOf(this.f1802b));
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }
    }

    /* renamed from: a */
    public static final Animator m1858a(float f, float f2, final Function1 function1) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setFloatValues(f, f2);
        valueAnimator.setEvaluator(new FloatEvaluator());
        valueAnimator.setDuration(250L);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sdkit.paylib.paylibnative.ui.common.a$$ExternalSyntheticLambda1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                AbstractC8102a.m1863a(function1, valueAnimator2);
            }
        });
        return valueAnimator;
    }

    /* renamed from: b */
    public static final void m1864b(Function1 updateTarget, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(updateTarget, "$updateTarget");
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        updateTarget.invoke((Integer) animatedValue);
    }

    /* renamed from: a */
    public static final Animator m1859a(int i, int i2, long j, final Function1 updateTarget) {
        Intrinsics.checkNotNullParameter(updateTarget, "updateTarget");
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(i, i2);
        valueAnimator.setEvaluator(new ArgbEvaluator());
        valueAnimator.setDuration(j);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sdkit.paylib.paylibnative.ui.common.a$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                AbstractC8102a.m1864b(updateTarget, valueAnimator2);
            }
        });
        valueAnimator.addListener(new b(updateTarget, i2));
        return valueAnimator;
    }

    /* renamed from: a */
    public static /* synthetic */ Animator m1860a(int i, int i2, long j, Function1 function1, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            j = 500;
        }
        return m1859a(i, i2, j, function1);
    }

    /* renamed from: a */
    public static final void m1861a(int i, int i2, Function1 updateTarget) {
        Intrinsics.checkNotNullParameter(updateTarget, "updateTarget");
        m1860a(i, i2, 0L, updateTarget, 4, null).start();
    }

    /* renamed from: a */
    public static final void m1862a(Function0 onFadeOutEnd, Function1 updateTargetAlpha) {
        Intrinsics.checkNotNullParameter(onFadeOutEnd, "onFadeOutEnd");
        Intrinsics.checkNotNullParameter(updateTargetAlpha, "updateTargetAlpha");
        AnimatorSet animatorSet = new AnimatorSet();
        Animator animatorM1858a = m1858a(1.0f, 0.0f, updateTargetAlpha);
        animatorM1858a.addListener(new a(onFadeOutEnd));
        animatorSet.playSequentially(animatorM1858a, m1858a(0.0f, 1.0f, updateTargetAlpha));
        animatorSet.start();
    }

    /* renamed from: a */
    public static final void m1863a(Function1 updateTargetAlpha, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(updateTargetAlpha, "$updateTargetAlpha");
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        updateTargetAlpha.invoke((Float) animatedValue);
    }
}
