package com.sdkit.paylib.paylibnative.p033ui.utils.ext;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.utils.ext.a */
/* loaded from: classes5.dex */
public abstract class AbstractC8364a {
    /* renamed from: a */
    public static final void m3436a(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        AccelerateInterpolator accelerateInterpolator = new AccelerateInterpolator();
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.SCALE_X;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 1.0f, 1.3f);
        Property property2 = View.SCALE_Y;
        animatorSet.playTogether(objectAnimatorOfFloat, ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, 1.0f, 1.3f));
        animatorSet.setInterpolator(accelerateInterpolator);
        animatorSet.setDuration(200L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 1.3f, 1.1f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, 1.3f, 1.1f));
        animatorSet2.setDuration(200L);
        animatorSet2.setInterpolator(decelerateInterpolator);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playSequentially(animatorSet, animatorSet2);
        animatorSet3.start();
    }
}
