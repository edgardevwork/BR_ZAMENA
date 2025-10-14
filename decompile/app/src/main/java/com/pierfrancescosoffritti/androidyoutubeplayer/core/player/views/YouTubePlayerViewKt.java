package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views;

import android.widget.FrameLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: YouTubePlayerView.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0014\u0010\u0002\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"AUTO_INIT_ERROR", "", "matchParent", "Landroid/widget/FrameLayout$LayoutParams;", "getMatchParent", "()Landroid/widget/FrameLayout$LayoutParams;", "core_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public final class YouTubePlayerViewKt {

    @NotNull
    public static final String AUTO_INIT_ERROR = "YouTubePlayerView: If you want to initialize this view manually, you need to set 'enableAutomaticInitialization' to false.";

    public static final FrameLayout.LayoutParams getMatchParent() {
        return new FrameLayout.LayoutParams(-1, -1);
    }
}
