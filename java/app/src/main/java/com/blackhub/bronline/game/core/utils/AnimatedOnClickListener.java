package com.blackhub.bronline.game.core.utils;

import android.content.res.Resources;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.bless.client.R;
import com.caverock.androidsvg.SVG;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AnimatedOnClickListener.kt */
@StabilityInferred(parameters = 1)

public abstract class AnimatedOnClickListener implements View.OnClickListener {
    public static final int $stable = 0;

    public abstract void onAnimateClick(@Nullable View view);

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull final View clickedView) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(clickedView, "clickedView");
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(clickedView.getContext(), R.anim.button_click);
        Intrinsics.checkNotNull(animationLoadAnimation);
        AnyExtensionKt.setActionOnAnimationStart(animationLoadAnimation, new Function0<Unit>() { // from class: com.blackhub.bronline.game.core.utils.AnimatedOnClickListener.onClick.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                AnimatedOnClickListener.this.onAnimateClick(clickedView);
            }
        });
        clickedView.startAnimation(animationLoadAnimation);
    }
}

