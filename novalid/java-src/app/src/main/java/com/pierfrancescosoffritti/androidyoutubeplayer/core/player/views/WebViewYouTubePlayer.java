package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.pierfrancescosoffritti.androidyoutubeplayer.C8007R;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayerBridge;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.FullscreenListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options.IFramePlayerOptions;
import java.io.InputStream;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WebViewYouTubePlayer.kt */
@Metadata(m7104d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u000e\u0010!\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0017J\b\u0010\"\u001a\u00020\u001dH\u0016J\b\u0010#\u001a\u00020\u001cH\u0016J\u0010\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020&H\u0003J+\u0010'\u001a\u00020\u001d2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b2\b\u0010%\u001a\u0004\u0018\u00010&H\u0000¢\u0006\u0002\b)J\u0010\u0010*\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u000bH\u0014J\b\u0010,\u001a\u00020\u001dH\u0016J\u000e\u0010-\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0017R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bX\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u00020\u001c8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006."}, m7105d2 = {"Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/views/WebViewYouTubePlayer;", "Landroid/webkit/WebView;", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/YouTubePlayerBridge$YouTubePlayerBridgeCallbacks;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/listeners/FullscreenListener;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/listeners/FullscreenListener;Landroid/util/AttributeSet;I)V", "_youTubePlayer", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/views/YouTubePlayerImpl;", "isBackgroundPlaybackEnabled", "", "isBackgroundPlaybackEnabled$core_release", "()Z", "setBackgroundPlaybackEnabled$core_release", "(Z)V", "listeners", "", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/listeners/YouTubePlayerListener;", "getListeners", "()Ljava/util/Collection;", "youTubePlayerInitListener", "Lkotlin/Function1;", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/YouTubePlayer;", "", "youtubePlayer", "getYoutubePlayer$core_release", "()Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/YouTubePlayer;", "addListener", "destroy", "getInstance", "initWebView", "playerOptions", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/options/IFramePlayerOptions;", "initialize", "initListener", "initialize$core_release", "onWindowVisibilityChanged", "visibility", "onYouTubeIFrameAPIReady", "removeListener", "core_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public final class WebViewYouTubePlayer extends WebView implements YouTubePlayerBridge.YouTubePlayerBridgeCallbacks {

    @NotNull
    public final YouTubePlayerImpl _youTubePlayer;
    public boolean isBackgroundPlaybackEnabled;

    @NotNull
    public final FullscreenListener listener;
    public Function1<? super YouTubePlayer, Unit> youTubePlayerInitListener;

    public /* synthetic */ WebViewYouTubePlayer(Context context, FullscreenListener fullscreenListener, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, fullscreenListener, (i2 & 4) != 0 ? null : attributeSet, (i2 & 8) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewYouTubePlayer(@NotNull Context context, @NotNull FullscreenListener listener, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
        this._youTubePlayer = new YouTubePlayerImpl(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebViewYouTubePlayer(@NotNull Context context) {
        this(context, FakeWebViewYouTubeListener.INSTANCE, null, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @NotNull
    public final YouTubePlayer getYoutubePlayer$core_release() {
        return this._youTubePlayer;
    }

    /* renamed from: isBackgroundPlaybackEnabled$core_release, reason: from getter */
    public final boolean getIsBackgroundPlaybackEnabled() {
        return this.isBackgroundPlaybackEnabled;
    }

    public final void setBackgroundPlaybackEnabled$core_release(boolean z) {
        this.isBackgroundPlaybackEnabled = z;
    }

    public final void initialize$core_release(@NotNull Function1<? super YouTubePlayer, Unit> initListener, @Nullable IFramePlayerOptions playerOptions) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(initListener, "initListener");
        this.youTubePlayerInitListener = initListener;
        if (playerOptions == null) {
            playerOptions = IFramePlayerOptions.INSTANCE.getDefault();
        }
        initWebView(playerOptions);
    }

    @Override // com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayerBridge.YouTubePlayerBridgeCallbacks
    @NotNull
    public Collection<YouTubePlayerListener> getListeners() {
        return CollectionsKt___CollectionsKt.toSet(this._youTubePlayer.getListeners());
    }

    @Override // com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayerBridge.YouTubePlayerBridgeCallbacks
    @NotNull
    public YouTubePlayer getInstance() {
        return this._youTubePlayer;
    }

    @Override // com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayerBridge.YouTubePlayerBridgeCallbacks
    public void onYouTubeIFrameAPIReady() {
        Function1<? super YouTubePlayer, Unit> function1 = this.youTubePlayerInitListener;
        if (function1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("youTubePlayerInitListener");
            function1 = null;
        }
        function1.invoke(this._youTubePlayer);
    }

    public final boolean addListener(@NotNull YouTubePlayerListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        return this._youTubePlayer.getListeners().add(listener);
    }

    public final boolean removeListener(@NotNull YouTubePlayerListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        return this._youTubePlayer.getListeners().remove(listener);
    }

    @Override // android.webkit.WebView
    public void destroy() {
        this._youTubePlayer.release();
        super.destroy();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public final void initWebView(IFramePlayerOptions playerOptions) throws Resources.NotFoundException {
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setCacheMode(-1);
        addJavascriptInterface(new YouTubePlayerBridge(this), "YouTubePlayerBridge");
        InputStream inputStreamOpenRawResource = getResources().openRawResource(C8007R.raw.ayp_youtube_player);
        Intrinsics.checkNotNullExpressionValue(inputStreamOpenRawResource, "resources.openRawResourc…R.raw.ayp_youtube_player)");
        loadDataWithBaseURL(playerOptions.getOrigin$core_release(), StringsKt__StringsJVMKt.replace$default(WebViewYouTubePlayerKt.readHTMLFromUTF8File(inputStreamOpenRawResource), "<<injectedPlayerVars>>", playerOptions.toString(), false, 4, (Object) null), "text/html", "utf-8", null);
        setWebChromeClient(new WebChromeClient() { // from class: com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.WebViewYouTubePlayer.initWebView.2
            @Override // android.webkit.WebChromeClient
            public void onShowCustomView(@NotNull View view, @NotNull final WebChromeClient.CustomViewCallback callback) {
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(callback, "callback");
                super.onShowCustomView(view, callback);
                WebViewYouTubePlayer.this.listener.onEnterFullscreen(view, new Function0<Unit>() { // from class: com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.WebViewYouTubePlayer$initWebView$2$onShowCustomView$1
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
                        callback.onCustomViewHidden();
                    }
                });
            }

            @Override // android.webkit.WebChromeClient
            public void onHideCustomView() {
                super.onHideCustomView();
                WebViewYouTubePlayer.this.listener.onExitFullscreen();
            }

            @Override // android.webkit.WebChromeClient
            @Nullable
            public Bitmap getDefaultVideoPoster() {
                Bitmap defaultVideoPoster = super.getDefaultVideoPoster();
                return defaultVideoPoster == null ? Bitmap.createBitmap(1, 1, Bitmap.Config.RGB_565) : defaultVideoPoster;
            }
        });
    }

    @Override // android.webkit.WebView, android.view.View
    public void onWindowVisibilityChanged(int visibility) {
        if (this.isBackgroundPlaybackEnabled && (visibility == 8 || visibility == 4)) {
            return;
        }
        super.onWindowVisibilityChanged(visibility);
    }
}
