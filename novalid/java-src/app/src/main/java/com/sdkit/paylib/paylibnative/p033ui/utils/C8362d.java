package com.sdkit.paylib.paylibnative.p033ui.utils;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.TransitionValues;
import androidx.transition.Visibility;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.utils.d */
/* loaded from: classes6.dex */
public final class C8362d extends Visibility {

    /* renamed from: com.sdkit.paylib.paylibnative.ui.utils.d$a */
    /* loaded from: classes5.dex */
    public static final class a implements Animator.AnimatorListener {

        /* renamed from: a */
        public final /* synthetic */ View f3665a;

        /* renamed from: b */
        public final /* synthetic */ boolean f3666b;

        public a(View view, boolean z) {
            this.f3665a = view;
            this.f3666b = z;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            this.f3665a.setTranslationY(0.0f);
            this.f3665a.setAlpha(this.f3666b ? 1.0f : 0.0f);
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
    public final Animator m3432a(final View view, final boolean z) {
        final float translationY = view.getTranslationY();
        ValueAnimator getVisibilityAnimator$lambda$2 = ValueAnimator.ofFloat(-1.0f, 0.0f);
        getVisibilityAnimator$lambda$2.setDuration(300L);
        getVisibilityAnimator$lambda$2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sdkit.paylib.paylibnative.ui.utils.d$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C8362d.m3431a(view, translationY, z, valueAnimator);
            }
        });
        Intrinsics.checkNotNullExpressionValue(getVisibilityAnimator$lambda$2, "getVisibilityAnimator$lambda$2");
        getVisibilityAnimator$lambda$2.addListener(new a(view, z));
        return getVisibilityAnimator$lambda$2;
    }

    @Override // androidx.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (view != null) {
            return m3432a(view, true);
        }
        return null;
    }

    @Override // androidx.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (view != null) {
            return m3432a(view, false);
        }
        return null;
    }

    /* renamed from: a */
    public static final void m3431a(View this_getVisibilityAnimator, float f, boolean z, ValueAnimator animator) {
        Intrinsics.checkNotNullParameter(this_getVisibilityAnimator, "$this_getVisibilityAnimator");
        Intrinsics.checkNotNullParameter(animator, "animator");
        Object animatedValue = animator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float fFloatValue = ((Float) animatedValue).floatValue();
        this_getVisibilityAnimator.setTranslationY((10.0f * fFloatValue * (z ? -1.0f : 1.0f)) + f);
        this_getVisibilityAnimator.setAlpha(z ? fFloatValue + 1.0f : fFloatValue * (-1.0f));
    }
}
