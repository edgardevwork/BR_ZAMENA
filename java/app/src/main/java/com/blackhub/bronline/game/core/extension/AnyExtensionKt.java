package com.blackhub.bronline.game.core.extension;

import android.view.animation.Animation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AnyExtension.kt */

public final class AnyExtensionKt {
    public static final boolean isNotNull(@Nullable Object obj) {
        return obj != null;
    }

    public static final boolean isNull(@Nullable Object obj) {
        return obj == null;
    }

    public static final void setActionOnAnimationEnd(@NotNull Animation animation, @NotNull final Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(animation, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        animation.setAnimationListener(new Animation.AnimationListener() { // from class: com.blackhub.bronline.game.core.extension.AnyExtensionKt.setActionOnAnimationEnd.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(@Nullable Animation animation2) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(@Nullable Animation animation2) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(@Nullable Animation animation2) {
                action.invoke();
            }
        });
    }

    public static final void setActionOnAnimationStart(@NotNull Animation animation, @NotNull final Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(animation, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        animation.setAnimationListener(new Animation.AnimationListener() { // from class: com.blackhub.bronline.game.core.extension.AnyExtensionKt.setActionOnAnimationStart.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(@Nullable Animation animation2) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(@Nullable Animation animation2) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(@Nullable Animation animation2) {
                action.invoke();
            }
        });
    }

    @NotNull
    public static final String empty(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        return "";
    }
}

