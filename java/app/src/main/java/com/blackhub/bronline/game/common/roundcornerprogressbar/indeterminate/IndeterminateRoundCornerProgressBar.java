package com.blackhub.bronline.game.common.roundcornerprogressbar.indeterminate;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blackhub.bronline.game.common.roundcornerprogressbar.RoundCornerProgressBar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: IndeterminateRoundCornerProgressBar.kt */
@StabilityInferred(parameters = 1)
@Keep
/* loaded from: classes2.dex */
public class IndeterminateRoundCornerProgressBar extends RoundCornerProgressBar {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndeterminateRoundCornerProgressBar(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndeterminateRoundCornerProgressBar(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndeterminateRoundCornerProgressBar(@NotNull Context context, @NotNull AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndeterminateRoundCornerProgressBar(@NotNull Context context, @NotNull AttributeSet attrs, int i, int i2) {
        super(context, attrs, i, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    @Override // com.blackhub.bronline.game.common.roundcornerprogressbar.RoundCornerProgressBar, com.blackhub.bronline.game.common.roundcornerprogressbar.common.BaseRoundCornerProgressBar
    public void initView() {
        super.initView();
        setMax(100);
    }

    @Override // com.blackhub.bronline.game.common.roundcornerprogressbar.common.AnimatedRoundCornerProgressBar
    public void onProgressChangeAnimationUpdate(@NotNull LinearLayout layout, float current, float to) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        if (isShown()) {
            return;
        }
        super.stopProgressAnimationImmediately();
    }

    @Override // com.blackhub.bronline.game.common.roundcornerprogressbar.common.AnimatedRoundCornerProgressBar
    public void onProgressChangeAnimationEnd(@NotNull LinearLayout layout) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        if (isShown()) {
            startIndeterminateAnimation();
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NotNull View changedView, int visibility) {
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        super.onVisibilityChanged(changedView, visibility);
        if (visibility == 0) {
            startIndeterminateAnimation();
        }
    }

    private final void startIndeterminateAnimation() {
        disableAnimation();
        setProgress(0);
        enableAnimation();
        setProgress(100);
    }
}

