package com.pierfrancescosoffritti.androidyoutubeplayer.core.player;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options.IFramePlayerOptions;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: YouTubePlayer.kt */
@Metadata(m7104d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\r\u001a\u00020\u0007H&J\b\u0010\u000e\u001a\u00020\u0007H&J\b\u0010\u000f\u001a\u00020\u0007H&J\b\u0010\u0010\u001a\u00020\u0007H&J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0007H&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u000bH&J\u0010\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0003H&J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001cH&J\u0010\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0003H&J\u0010\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0013H&J\b\u0010!\u001a\u00020\u0007H&J\b\u0010\"\u001a\u00020\u0007H&¨\u0006#"}, m7105d2 = {"Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/YouTubePlayer;", "", "addListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/listeners/YouTubePlayerListener;", "cueVideo", "", "videoId", "", "startSeconds", "", "loadVideo", IFramePlayerOptions.Builder.MUTE, "nextVideo", "pause", "play", "playVideoAt", FirebaseAnalytics.Param.INDEX, "", "previousVideo", "removeListener", "seekTo", "time", "setLoop", "loop", "setPlaybackRate", "playbackRate", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/PlayerConstants$PlaybackRate;", "setShuffle", "shuffle", "setVolume", "volumePercent", "toggleFullscreen", "unMute", "core_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public interface YouTubePlayer {
    boolean addListener(@NotNull YouTubePlayerListener listener);

    void cueVideo(@NotNull String videoId, float startSeconds);

    void loadVideo(@NotNull String videoId, float startSeconds);

    void mute();

    void nextVideo();

    void pause();

    void play();

    void playVideoAt(int index);

    void previousVideo();

    boolean removeListener(@NotNull YouTubePlayerListener listener);

    void seekTo(float time);

    void setLoop(boolean loop);

    void setPlaybackRate(@NotNull PlayerConstants.PlaybackRate playbackRate);

    void setShuffle(boolean shuffle);

    void setVolume(int volumePercent);

    void toggleFullscreen();

    void unMute();
}
