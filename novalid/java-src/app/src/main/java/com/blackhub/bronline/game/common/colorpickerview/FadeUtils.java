package com.blackhub.bronline.game.common.colorpickerview;

import android.content.res.Resources;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.annotation.RestrictTo;
import com.bless.client.R;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class FadeUtils {
    public static void fadeIn(View view) throws Resources.NotFoundException {
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(view.getContext(), R.anim.fade_in_colorpickerview_skydoves);
        animationLoadAnimation.setFillAfter(true);
        view.startAnimation(animationLoadAnimation);
    }

    public static void fadeOut(View view) throws Resources.NotFoundException {
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(view.getContext(), R.anim.fade_out_colorpickerview_skydoves);
        animationLoadAnimation.setFillAfter(true);
        view.startAnimation(animationLoadAnimation);
    }
}
