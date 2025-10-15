package com.pierfrancescosoffritti.androidyoutubeplayer.core.player;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import androidx.annotation.RestrictTo;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerListener;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: YouTubePlayerBridge.kt */
@Metadata(m7104d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 $2\u00020\u0001:\u0002$%B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\nH\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nH\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0007J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\nH\u0007J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\nH\u0007J\b\u0010\u001a\u001a\u00020\u0015H\u0007J\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\nH\u0007J\u0010\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\nH\u0007J\u0010\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\nH\u0007J\u0010\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\nH\u0007J\u0010\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\nH\u0007J\b\u0010#\u001a\u00020\u0015H\u0007R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, m7105d2 = {"Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/YouTubePlayerBridge;", "", "youTubePlayerOwner", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/YouTubePlayerBridge$YouTubePlayerBridgeCallbacks;", "(Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/YouTubePlayerBridge$YouTubePlayerBridgeCallbacks;)V", "mainThreadHandler", "Landroid/os/Handler;", "parsePlaybackQuality", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/PlayerConstants$PlaybackQuality;", "quality", "", "parsePlaybackRate", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/PlayerConstants$PlaybackRate;", "rate", "parsePlayerError", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/PlayerConstants$PlayerError;", "error", "parsePlayerState", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/PlayerConstants$PlayerState;", "state", "sendApiChange", "", "sendError", "", "sendPlaybackQualityChange", "sendPlaybackRateChange", "sendReady", "sendStateChange", "sendVideoCurrentTime", "seconds", "sendVideoDuration", "sendVideoId", "videoId", "sendVideoLoadedFraction", "fraction", "sendYouTubeIFrameAPIReady", "Companion", "YouTubePlayerBridgeCallbacks", "core_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension({"SMAP\nYouTubePlayerBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YouTubePlayerBridge.kt\ncom/pierfrancescosoffritti/androidyoutubeplayer/core/player/YouTubePlayerBridge\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,203:1\n1855#2,2:204\n1855#2,2:206\n1855#2,2:208\n1855#2,2:210\n1855#2,2:212\n1855#2,2:214\n1855#2,2:216\n1855#2,2:218\n1855#2,2:220\n1855#2,2:222\n*S KotlinDebug\n*F\n+ 1 YouTubePlayerBridge.kt\ncom/pierfrancescosoffritti/androidyoutubeplayer/core/player/YouTubePlayerBridge\n*L\n60#1:204,2\n68#1:206,2\n77#1:208,2\n86#1:210,2\n95#1:212,2\n101#1:214,2\n114#1:216,2\n129#1:218,2\n143#1:220,2\n149#1:222,2\n*E\n"})
/* loaded from: classes8.dex */
public final class YouTubePlayerBridge {

    @NotNull
    public static final String ERROR_HTML_5_PLAYER = "5";

    @NotNull
    public static final String ERROR_INVALID_PARAMETER_IN_REQUEST = "2";

    @NotNull
    public static final String ERROR_VIDEO_NOT_FOUND = "100";

    @NotNull
    public static final String ERROR_VIDEO_NOT_PLAYABLE_IN_EMBEDDED_PLAYER1 = "101";

    @NotNull
    public static final String ERROR_VIDEO_NOT_PLAYABLE_IN_EMBEDDED_PLAYER2 = "150";

    @NotNull
    public static final String QUALITY_DEFAULT = "default";

    @NotNull
    public static final String QUALITY_HD1080 = "hd1080";

    @NotNull
    public static final String QUALITY_HD720 = "hd720";

    @NotNull
    public static final String QUALITY_HIGH_RES = "highres";

    @NotNull
    public static final String QUALITY_LARGE = "large";

    @NotNull
    public static final String QUALITY_MEDIUM = "medium";

    @NotNull
    public static final String QUALITY_SMALL = "small";

    @NotNull
    public static final String RATE_0_25 = "0.25";

    @NotNull
    public static final String RATE_0_5 = "0.5";

    @NotNull
    public static final String RATE_1 = "1";

    @NotNull
    public static final String RATE_1_5 = "1.5";

    @NotNull
    public static final String RATE_2 = "2";

    @NotNull
    public static final String STATE_BUFFERING = "BUFFERING";

    @NotNull
    public static final String STATE_CUED = "CUED";

    @NotNull
    public static final String STATE_ENDED = "ENDED";

    @NotNull
    public static final String STATE_PAUSED = "PAUSED";

    @NotNull
    public static final String STATE_PLAYING = "PLAYING";

    @NotNull
    public static final String STATE_UNSTARTED = "UNSTARTED";

    @NotNull
    public final Handler mainThreadHandler;

    @NotNull
    public final YouTubePlayerBridgeCallbacks youTubePlayerOwner;

    /* compiled from: YouTubePlayerBridge.kt */
    @Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, m7105d2 = {"Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/YouTubePlayerBridge$YouTubePlayerBridgeCallbacks;", "", "listeners", "", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/listeners/YouTubePlayerListener;", "getListeners", "()Ljava/util/Collection;", "getInstance", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/YouTubePlayer;", "onYouTubeIFrameAPIReady", "", "core_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public interface YouTubePlayerBridgeCallbacks {
        @NotNull
        YouTubePlayer getInstance();

        @NotNull
        Collection<YouTubePlayerListener> getListeners();

        void onYouTubeIFrameAPIReady();
    }

    public YouTubePlayerBridge(@NotNull YouTubePlayerBridgeCallbacks youTubePlayerOwner) {
        Intrinsics.checkNotNullParameter(youTubePlayerOwner, "youTubePlayerOwner");
        this.youTubePlayerOwner = youTubePlayerOwner;
        this.mainThreadHandler = new Handler(Looper.getMainLooper());
    }

    public static final void sendYouTubeIFrameAPIReady$lambda$0(YouTubePlayerBridge this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.youTubePlayerOwner.onYouTubeIFrameAPIReady();
    }

    @JavascriptInterface
    public final boolean sendYouTubeIFrameAPIReady() {
        return this.mainThreadHandler.post(new Runnable() { // from class: com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayerBridge$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                YouTubePlayerBridge.sendYouTubeIFrameAPIReady$lambda$0(this.f$0);
            }
        });
    }

    @JavascriptInterface
    public final boolean sendReady() {
        return this.mainThreadHandler.post(new Runnable() { // from class: com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayerBridge$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                YouTubePlayerBridge.sendReady$lambda$2(this.f$0);
            }
        });
    }

    public static final void sendReady$lambda$2(YouTubePlayerBridge this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator<T> it = this$0.youTubePlayerOwner.getListeners().iterator();
        while (it.hasNext()) {
            ((YouTubePlayerListener) it.next()).onReady(this$0.youTubePlayerOwner.getInstance());
        }
    }

    @JavascriptInterface
    public final void sendStateChange(@NotNull String state) {
        Intrinsics.checkNotNullParameter(state, "state");
        final PlayerConstants.PlayerState playerState = parsePlayerState(state);
        this.mainThreadHandler.post(new Runnable() { // from class: com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayerBridge$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                YouTubePlayerBridge.sendStateChange$lambda$4(this.f$0, playerState);
            }
        });
    }

    public static final void sendStateChange$lambda$4(YouTubePlayerBridge this$0, PlayerConstants.PlayerState playerState) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(playerState, "$playerState");
        Iterator<T> it = this$0.youTubePlayerOwner.getListeners().iterator();
        while (it.hasNext()) {
            ((YouTubePlayerListener) it.next()).onStateChange(this$0.youTubePlayerOwner.getInstance(), playerState);
        }
    }

    @JavascriptInterface
    public final void sendPlaybackQualityChange(@NotNull String quality) {
        Intrinsics.checkNotNullParameter(quality, "quality");
        final PlayerConstants.PlaybackQuality playbackQuality = parsePlaybackQuality(quality);
        this.mainThreadHandler.post(new Runnable() { // from class: com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayerBridge$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                YouTubePlayerBridge.sendPlaybackQualityChange$lambda$6(this.f$0, playbackQuality);
            }
        });
    }

    public static final void sendPlaybackQualityChange$lambda$6(YouTubePlayerBridge this$0, PlayerConstants.PlaybackQuality playbackQuality) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(playbackQuality, "$playbackQuality");
        Iterator<T> it = this$0.youTubePlayerOwner.getListeners().iterator();
        while (it.hasNext()) {
            ((YouTubePlayerListener) it.next()).onPlaybackQualityChange(this$0.youTubePlayerOwner.getInstance(), playbackQuality);
        }
    }

    @JavascriptInterface
    public final void sendPlaybackRateChange(@NotNull String rate) {
        Intrinsics.checkNotNullParameter(rate, "rate");
        final PlayerConstants.PlaybackRate playbackRate = parsePlaybackRate(rate);
        this.mainThreadHandler.post(new Runnable() { // from class: com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayerBridge$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                YouTubePlayerBridge.sendPlaybackRateChange$lambda$8(this.f$0, playbackRate);
            }
        });
    }

    public static final void sendPlaybackRateChange$lambda$8(YouTubePlayerBridge this$0, PlayerConstants.PlaybackRate playbackRate) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(playbackRate, "$playbackRate");
        Iterator<T> it = this$0.youTubePlayerOwner.getListeners().iterator();
        while (it.hasNext()) {
            ((YouTubePlayerListener) it.next()).onPlaybackRateChange(this$0.youTubePlayerOwner.getInstance(), playbackRate);
        }
    }

    @JavascriptInterface
    public final void sendError(@NotNull String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        final PlayerConstants.PlayerError playerError = parsePlayerError(error);
        this.mainThreadHandler.post(new Runnable() { // from class: com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayerBridge$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                YouTubePlayerBridge.sendError$lambda$10(this.f$0, playerError);
            }
        });
    }

    public static final void sendError$lambda$10(YouTubePlayerBridge this$0, PlayerConstants.PlayerError playerError) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(playerError, "$playerError");
        Iterator<T> it = this$0.youTubePlayerOwner.getListeners().iterator();
        while (it.hasNext()) {
            ((YouTubePlayerListener) it.next()).onError(this$0.youTubePlayerOwner.getInstance(), playerError);
        }
    }

    @JavascriptInterface
    public final boolean sendApiChange() {
        return this.mainThreadHandler.post(new Runnable() { // from class: com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayerBridge$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                YouTubePlayerBridge.sendApiChange$lambda$12(this.f$0);
            }
        });
    }

    public static final void sendApiChange$lambda$12(YouTubePlayerBridge this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator<T> it = this$0.youTubePlayerOwner.getListeners().iterator();
        while (it.hasNext()) {
            ((YouTubePlayerListener) it.next()).onApiChange(this$0.youTubePlayerOwner.getInstance());
        }
    }

    @JavascriptInterface
    public final void sendVideoCurrentTime(@NotNull String seconds) throws NumberFormatException {
        Intrinsics.checkNotNullParameter(seconds, "seconds");
        try {
            final float f = Float.parseFloat(seconds);
            this.mainThreadHandler.post(new Runnable() { // from class: com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayerBridge$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    YouTubePlayerBridge.sendVideoCurrentTime$lambda$14(this.f$0, f);
                }
            });
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public static final void sendVideoCurrentTime$lambda$14(YouTubePlayerBridge this$0, float f) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator<T> it = this$0.youTubePlayerOwner.getListeners().iterator();
        while (it.hasNext()) {
            ((YouTubePlayerListener) it.next()).onCurrentSecond(this$0.youTubePlayerOwner.getInstance(), f);
        }
    }

    @JavascriptInterface
    public final void sendVideoDuration(@NotNull String seconds) throws NumberFormatException {
        Intrinsics.checkNotNullParameter(seconds, "seconds");
        try {
            if (TextUtils.isEmpty(seconds)) {
                seconds = "0";
            }
            final float f = Float.parseFloat(seconds);
            this.mainThreadHandler.post(new Runnable() { // from class: com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayerBridge$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    YouTubePlayerBridge.sendVideoDuration$lambda$16(this.f$0, f);
                }
            });
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public static final void sendVideoDuration$lambda$16(YouTubePlayerBridge this$0, float f) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator<T> it = this$0.youTubePlayerOwner.getListeners().iterator();
        while (it.hasNext()) {
            ((YouTubePlayerListener) it.next()).onVideoDuration(this$0.youTubePlayerOwner.getInstance(), f);
        }
    }

    @JavascriptInterface
    public final void sendVideoLoadedFraction(@NotNull String fraction) throws NumberFormatException {
        Intrinsics.checkNotNullParameter(fraction, "fraction");
        try {
            final float f = Float.parseFloat(fraction);
            this.mainThreadHandler.post(new Runnable() { // from class: com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayerBridge$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    YouTubePlayerBridge.sendVideoLoadedFraction$lambda$18(this.f$0, f);
                }
            });
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public static final void sendVideoLoadedFraction$lambda$18(YouTubePlayerBridge this$0, float f) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator<T> it = this$0.youTubePlayerOwner.getListeners().iterator();
        while (it.hasNext()) {
            ((YouTubePlayerListener) it.next()).onVideoLoadedFraction(this$0.youTubePlayerOwner.getInstance(), f);
        }
    }

    @JavascriptInterface
    public final boolean sendVideoId(@NotNull final String videoId) {
        Intrinsics.checkNotNullParameter(videoId, "videoId");
        return this.mainThreadHandler.post(new Runnable() { // from class: com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayerBridge$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                YouTubePlayerBridge.sendVideoId$lambda$20(this.f$0, videoId);
            }
        });
    }

    public static final void sendVideoId$lambda$20(YouTubePlayerBridge this$0, String videoId) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(videoId, "$videoId");
        Iterator<T> it = this$0.youTubePlayerOwner.getListeners().iterator();
        while (it.hasNext()) {
            ((YouTubePlayerListener) it.next()).onVideoId(this$0.youTubePlayerOwner.getInstance(), videoId);
        }
    }

    public final PlayerConstants.PlayerState parsePlayerState(String state) {
        return StringsKt__StringsJVMKt.equals(state, STATE_UNSTARTED, true) ? PlayerConstants.PlayerState.UNSTARTED : StringsKt__StringsJVMKt.equals(state, STATE_ENDED, true) ? PlayerConstants.PlayerState.ENDED : StringsKt__StringsJVMKt.equals(state, STATE_PLAYING, true) ? PlayerConstants.PlayerState.PLAYING : StringsKt__StringsJVMKt.equals(state, STATE_PAUSED, true) ? PlayerConstants.PlayerState.PAUSED : StringsKt__StringsJVMKt.equals(state, STATE_BUFFERING, true) ? PlayerConstants.PlayerState.BUFFERING : StringsKt__StringsJVMKt.equals(state, STATE_CUED, true) ? PlayerConstants.PlayerState.VIDEO_CUED : PlayerConstants.PlayerState.UNKNOWN;
    }

    public final PlayerConstants.PlaybackQuality parsePlaybackQuality(String quality) {
        if (StringsKt__StringsJVMKt.equals(quality, QUALITY_SMALL, true)) {
            return PlayerConstants.PlaybackQuality.SMALL;
        }
        if (StringsKt__StringsJVMKt.equals(quality, "medium", true)) {
            return PlayerConstants.PlaybackQuality.MEDIUM;
        }
        if (StringsKt__StringsJVMKt.equals(quality, QUALITY_LARGE, true)) {
            return PlayerConstants.PlaybackQuality.LARGE;
        }
        if (StringsKt__StringsJVMKt.equals(quality, QUALITY_HD720, true)) {
            return PlayerConstants.PlaybackQuality.HD720;
        }
        if (StringsKt__StringsJVMKt.equals(quality, QUALITY_HD1080, true)) {
            return PlayerConstants.PlaybackQuality.HD1080;
        }
        if (StringsKt__StringsJVMKt.equals(quality, QUALITY_HIGH_RES, true)) {
            return PlayerConstants.PlaybackQuality.HIGH_RES;
        }
        return StringsKt__StringsJVMKt.equals(quality, "default", true) ? PlayerConstants.PlaybackQuality.DEFAULT : PlayerConstants.PlaybackQuality.UNKNOWN;
    }

    public final PlayerConstants.PlaybackRate parsePlaybackRate(String rate) {
        return StringsKt__StringsJVMKt.equals(rate, RATE_0_25, true) ? PlayerConstants.PlaybackRate.RATE_0_25 : StringsKt__StringsJVMKt.equals(rate, RATE_0_5, true) ? PlayerConstants.PlaybackRate.RATE_0_5 : StringsKt__StringsJVMKt.equals(rate, "1", true) ? PlayerConstants.PlaybackRate.RATE_1 : StringsKt__StringsJVMKt.equals(rate, RATE_1_5, true) ? PlayerConstants.PlaybackRate.RATE_1_5 : StringsKt__StringsJVMKt.equals(rate, "2", true) ? PlayerConstants.PlaybackRate.RATE_2 : PlayerConstants.PlaybackRate.UNKNOWN;
    }

    public final PlayerConstants.PlayerError parsePlayerError(String error) {
        if (StringsKt__StringsJVMKt.equals(error, "2", true)) {
            return PlayerConstants.PlayerError.INVALID_PARAMETER_IN_REQUEST;
        }
        if (StringsKt__StringsJVMKt.equals(error, ERROR_HTML_5_PLAYER, true)) {
            return PlayerConstants.PlayerError.HTML_5_PLAYER;
        }
        if (StringsKt__StringsJVMKt.equals(error, "100", true)) {
            return PlayerConstants.PlayerError.VIDEO_NOT_FOUND;
        }
        if (!StringsKt__StringsJVMKt.equals(error, ERROR_VIDEO_NOT_PLAYABLE_IN_EMBEDDED_PLAYER1, true) && !StringsKt__StringsJVMKt.equals(error, ERROR_VIDEO_NOT_PLAYABLE_IN_EMBEDDED_PLAYER2, true)) {
            return PlayerConstants.PlayerError.UNKNOWN;
        }
        return PlayerConstants.PlayerError.VIDEO_NOT_PLAYABLE_IN_EMBEDDED_PLAYER;
    }
}
