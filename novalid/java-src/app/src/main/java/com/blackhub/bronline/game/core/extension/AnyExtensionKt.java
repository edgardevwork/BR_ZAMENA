package com.blackhub.bronline.game.core.extension;

import android.view.animation.Animation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AnyExtension.kt */
@Metadata(m7104d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0003\u001a\u00020\u0004*\u0004\u0018\u00010\u0002\u001a\f\u0010\u0005\u001a\u00020\u0004*\u0004\u0018\u00010\u0002\u001a\u0018\u0010\u0006\u001a\u00020\u0007*\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n\u001a\u0018\u0010\u000b\u001a\u00020\u0007*\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n¨\u0006\f"}, m7105d2 = {"empty", "", "", "isNotNull", "", "isNull", "setActionOnAnimationEnd", "", "Landroid/view/animation/Animation;", "action", "Lkotlin/Function0;", "setActionOnAnimationStart", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
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
