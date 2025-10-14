package com.blackhub.bronline.game.common.roundcornerprogressbar;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.roundcornerprogressbar.common.AnimatedRoundCornerProgressBar;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RoundCornerProgressBar.kt */
@StabilityInferred(parameters = 1)
@Keep
/* loaded from: classes3.dex */
public class RoundCornerProgressBar extends AnimatedRoundCornerProgressBar {
    public static final int $stable = 0;

    @Override // com.blackhub.bronline.game.common.roundcornerprogressbar.common.BaseRoundCornerProgressBar
    public int initLayout() {
        return R.layout.widget_round_corner_progress_bar;
    }

    @Override // com.blackhub.bronline.game.common.roundcornerprogressbar.common.BaseRoundCornerProgressBar
    public void initStyleable(@NotNull Context context, @Nullable AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.blackhub.bronline.game.common.roundcornerprogressbar.common.BaseRoundCornerProgressBar
    public void initView() {
    }

    @Override // com.blackhub.bronline.game.common.roundcornerprogressbar.common.BaseRoundCornerProgressBar
    public void onViewDraw() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundCornerProgressBar(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundCornerProgressBar(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundCornerProgressBar(@NotNull Context context, @NotNull AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundCornerProgressBar(@NotNull Context context, @NotNull AttributeSet attrs, int i, int i2) {
        super(context, attrs, i, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    @Override // com.blackhub.bronline.game.common.roundcornerprogressbar.common.BaseRoundCornerProgressBar
    public void drawProgress(@NotNull LinearLayout layoutProgress, @NotNull GradientDrawable progressDrawable, float max, float progress, float totalWidth, int radius, int padding, boolean isReverse) {
        Intrinsics.checkNotNullParameter(layoutProgress, "layoutProgress");
        Intrinsics.checkNotNullParameter(progressDrawable, "progressDrawable");
        float f = radius - (padding / 2.0f);
        progressDrawable.setCornerRadii(new float[]{f, f, f, f, f, f, f, f});
        layoutProgress.setBackground(progressDrawable);
        int i = (int) ((totalWidth - (padding * 2)) / (max / progress));
        ViewGroup.LayoutParams layoutParams = layoutProgress.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.width = i;
        int i2 = i / 2;
        if (padding + i2 < radius) {
            int iCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(radius - padding, 0) - i2;
            marginLayoutParams.topMargin = iCoerceAtLeast;
            marginLayoutParams.bottomMargin = iCoerceAtLeast;
        } else {
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.bottomMargin = 0;
        }
        layoutProgress.setLayoutParams(marginLayoutParams);
    }
}

