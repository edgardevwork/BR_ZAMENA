package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views;

import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstantsKt;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options.IFramePlayerOptions;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.lang3.text.ExtendedMessageFormat;
import org.jetbrains.annotations.NotNull;

/* compiled from: WebViewYouTubePlayer.kt */
@Metadata(m7104d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007H\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0010H\u0016J\b\u0010\u0017\u001a\u00020\u0010H\u0016J\b\u0010\u0018\u001a\u00020\u0010H\u0016J\b\u0010\u0019\u001a\u00020\u0010H\u0016J\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0010H\u0016J\u0006\u0010\u001e\u001a\u00020\u0010J\u0010\u0010\u001f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007H\u0016J\u0010\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u0014H\u0016J\u0010\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\rH\u0016J\u0010\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010'\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\rH\u0016J\u0010\u0010)\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\u001cH\u0016J\b\u0010+\u001a\u00020\u0010H\u0016J\b\u0010,\u001a\u00020\u0010H\u0016J-\u0010-\u001a\u00020\u0010*\u00020\u00032\u0006\u0010.\u001a\u00020\u00122\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020100\"\u000201H\u0002¢\u0006\u0002\u00102R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00063"}, m7105d2 = {"Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/views/YouTubePlayerImpl;", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/YouTubePlayer;", "webView", "Landroid/webkit/WebView;", "(Landroid/webkit/WebView;)V", "listeners", "", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/listeners/YouTubePlayerListener;", "getListeners", "()Ljava/util/Set;", "mainThread", "Landroid/os/Handler;", "addListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "cueVideo", "", "videoId", "", "startSeconds", "", "loadVideo", IFramePlayerOptions.Builder.MUTE, "nextVideo", "pause", "play", "playVideoAt", FirebaseAnalytics.Param.INDEX, "", "previousVideo", "release", "removeListener", "seekTo", "time", "setLoop", "loop", "setPlaybackRate", "playbackRate", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/PlayerConstants$PlaybackRate;", "setShuffle", "shuffle", "setVolume", "volumePercent", "toggleFullscreen", "unMute", "invoke", "function", "args", "", "", "(Landroid/webkit/WebView;Ljava/lang/String;[Ljava/lang/Object;)V", "core_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nWebViewYouTubePlayer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebViewYouTubePlayer.kt\ncom/pierfrancescosoffritti/androidyoutubeplayer/core/player/views/YouTubePlayerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,168:1\n1#2:169\n11335#3:170\n11670#3,3:171\n*S KotlinDebug\n*F\n+ 1 WebViewYouTubePlayer.kt\ncom/pierfrancescosoffritti/androidyoutubeplayer/core/player/views/YouTubePlayerImpl\n*L\n59#1:170\n59#1:171,3\n*E\n"})
/* loaded from: classes6.dex */
public final class YouTubePlayerImpl implements YouTubePlayer {

    @NotNull
    public final Set<YouTubePlayerListener> listeners;

    @NotNull
    public final Handler mainThread;

    @NotNull
    public final WebView webView;

    public YouTubePlayerImpl(@NotNull WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.webView = webView;
        this.mainThread = new Handler(Looper.getMainLooper());
        this.listeners = new LinkedHashSet();
    }

    @NotNull
    public final Set<YouTubePlayerListener> getListeners() {
        return this.listeners;
    }

    @Override // com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
    public void loadVideo(@NotNull String videoId, float startSeconds) {
        Intrinsics.checkNotNullParameter(videoId, "videoId");
        invoke(this.webView, "loadVideo", videoId, Float.valueOf(startSeconds));
    }

    @Override // com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
    public void cueVideo(@NotNull String videoId, float startSeconds) {
        Intrinsics.checkNotNullParameter(videoId, "videoId");
        invoke(this.webView, "cueVideo", videoId, Float.valueOf(startSeconds));
    }

    @Override // com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
    public void play() {
        invoke(this.webView, "playVideo", new Object[0]);
    }

    @Override // com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
    public void pause() {
        invoke(this.webView, "pauseVideo", new Object[0]);
    }

    @Override // com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
    public void nextVideo() {
        invoke(this.webView, "nextVideo", new Object[0]);
    }

    @Override // com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
    public void previousVideo() {
        invoke(this.webView, "previousVideo", new Object[0]);
    }

    @Override // com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
    public void playVideoAt(int index) {
        invoke(this.webView, "playVideoAt", Integer.valueOf(index));
    }

    @Override // com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
    public void setLoop(boolean loop) {
        invoke(this.webView, "setLoop", Boolean.valueOf(loop));
    }

    @Override // com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
    public void setShuffle(boolean shuffle) {
        invoke(this.webView, "setShuffle", Boolean.valueOf(shuffle));
    }

    @Override // com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
    public void mute() {
        invoke(this.webView, IFramePlayerOptions.Builder.MUTE, new Object[0]);
    }

    @Override // com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
    public void unMute() {
        invoke(this.webView, "unMute", new Object[0]);
    }

    @Override // com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
    public void setVolume(int volumePercent) {
        if (volumePercent < 0 || volumePercent >= 101) {
            throw new IllegalArgumentException("Volume must be between 0 and 100".toString());
        }
        invoke(this.webView, "setVolume", Integer.valueOf(volumePercent));
    }

    @Override // com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
    public void seekTo(float time) {
        invoke(this.webView, "seekTo", Float.valueOf(time));
    }

    @Override // com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
    public void setPlaybackRate(@NotNull PlayerConstants.PlaybackRate playbackRate) {
        Intrinsics.checkNotNullParameter(playbackRate, "playbackRate");
        invoke(this.webView, "setPlaybackRate", Float.valueOf(PlayerConstantsKt.toFloat(playbackRate)));
    }

    @Override // com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
    public void toggleFullscreen() {
        invoke(this.webView, "toggleFullscreen", new Object[0]);
    }

    @Override // com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
    public boolean addListener(@NotNull YouTubePlayerListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        return this.listeners.add(listener);
    }

    @Override // com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
    public boolean removeListener(@NotNull YouTubePlayerListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        return this.listeners.remove(listener);
    }

    public final void release() {
        this.listeners.clear();
        this.mainThread.removeCallbacksAndMessages(null);
    }

    public static final void invoke$lambda$2(WebView this_invoke, String function, List stringArgs) {
        Intrinsics.checkNotNullParameter(this_invoke, "$this_invoke");
        Intrinsics.checkNotNullParameter(function, "$function");
        Intrinsics.checkNotNullParameter(stringArgs, "$stringArgs");
        this_invoke.loadUrl("javascript:" + function + '(' + CollectionsKt___CollectionsKt.joinToString$default(stringArgs, ",", null, null, 0, null, null, 62, null) + ')');
    }

    public final void invoke(final WebView webView, final String str, Object... objArr) {
        String string;
        final ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            if (obj instanceof String) {
                StringBuilder sb = new StringBuilder();
                sb.append(ExtendedMessageFormat.QUOTE);
                sb.append(obj);
                sb.append(ExtendedMessageFormat.QUOTE);
                string = sb.toString();
            } else {
                string = obj.toString();
            }
            arrayList.add(string);
        }
        this.mainThread.post(new Runnable() { // from class: com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerImpl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                YouTubePlayerImpl.invoke$lambda$2(webView, str, arrayList);
            }
        });
    }
}
