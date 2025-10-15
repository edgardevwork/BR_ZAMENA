package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils;

import androidx.lifecycle.Lifecycle;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: YouTubePlayerUtils.kt */
@Metadata(m7104d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000¨\u0006\u000b"}, m7105d2 = {"loadOrCueVideo", "", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/YouTubePlayer;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "videoId", "", "startSeconds", "", "canLoad", "", "core_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@JvmName(name = "YouTubePlayerUtils")
/* loaded from: classes8.dex */
public final class YouTubePlayerUtils {
    public static final void loadOrCueVideo(@NotNull YouTubePlayer youTubePlayer, @NotNull Lifecycle lifecycle, @NotNull String videoId, float f) {
        Intrinsics.checkNotNullParameter(youTubePlayer, "<this>");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(videoId, "videoId");
        loadOrCueVideo(youTubePlayer, lifecycle.getCurrentState() == Lifecycle.State.RESUMED, videoId, f);
    }

    public static final /* synthetic */ void loadOrCueVideo(YouTubePlayer youTubePlayer, boolean z, String videoId, float f) {
        Intrinsics.checkNotNullParameter(youTubePlayer, "<this>");
        Intrinsics.checkNotNullParameter(videoId, "videoId");
        if (z) {
            youTubePlayer.loadVideo(videoId, f);
        } else {
            youTubePlayer.cueVideo(videoId, f);
        }
    }
}
