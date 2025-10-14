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
@Metadata(m7104d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJH\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001aH\u0014J\b\u0010\u001b\u001a\u00020\tH\u0014J\u001a\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\u001d\u001a\u00020\u000eH\u0014J\b\u0010\u001e\u001a\u00020\u000eH\u0014¨\u0006\u001f"}, m7105d2 = {"Lcom/blackhub/bronline/game/common/roundcornerprogressbar/RoundCornerProgressBar;", "Lcom/blackhub/bronline/game/common/roundcornerprogressbar/common/AnimatedRoundCornerProgressBar;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "drawProgress", "", "layoutProgress", "Landroid/widget/LinearLayout;", "progressDrawable", "Landroid/graphics/drawable/GradientDrawable;", "max", "", "progress", "totalWidth", "radius", "padding", "isReverse", "", "initLayout", "initStyleable", "initView", "onViewDraw", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
