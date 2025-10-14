package com.google.android.material.animation;

import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public interface AnimatableView {

    public interface Listener {
        void onAnimationEnd();
    }

    void startAnimation(@NonNull Listener listener);

    void stopAnimation();
}
