package com.blackhub.bronline.game.common.roundcornerprogressbar.indeterminate;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blackhub.bronline.game.common.roundcornerprogressbar.CenteredRoundCornerProgressBar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: IndeterminateCenteredRoundCornerProgressBar.kt */
@StabilityInferred(parameters = 1)
@Keep
@Metadata(m7104d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0014J \u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0014J\u0018\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\tH\u0014J\b\u0010\u001a\u001a\u00020\u000eH\u0002¨\u0006\u001b"}, m7105d2 = {"Lcom/blackhub/bronline/game/common/roundcornerprogressbar/indeterminate/IndeterminateCenteredRoundCornerProgressBar;", "Lcom/blackhub/bronline/game/common/roundcornerprogressbar/CenteredRoundCornerProgressBar;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "initView", "", "onProgressChangeAnimationEnd", TtmlNode.TAG_LAYOUT, "Landroid/widget/LinearLayout;", "onProgressChangeAnimationUpdate", "current", "", "to", "onVisibilityChanged", "changedView", "Landroid/view/View;", "visibility", "startIndeterminateAnimation", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public class IndeterminateCenteredRoundCornerProgressBar extends CenteredRoundCornerProgressBar {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndeterminateCenteredRoundCornerProgressBar(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndeterminateCenteredRoundCornerProgressBar(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndeterminateCenteredRoundCornerProgressBar(@NotNull Context context, @NotNull AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndeterminateCenteredRoundCornerProgressBar(@NotNull Context context, @NotNull AttributeSet attrs, int i, int i2) {
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
