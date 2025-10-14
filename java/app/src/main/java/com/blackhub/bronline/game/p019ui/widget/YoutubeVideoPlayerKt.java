package com.blackhub.bronline.game.p019ui.widget;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p003ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.p019ui.widget.YoutubeVideoPlayerKt;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options.IFramePlayerOptions;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* compiled from: YoutubeVideoPlayer.kt */
@SourceDebugExtension({"SMAP\nYoutubeVideoPlayer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YoutubeVideoPlayer.kt\ncom/blackhub/bronline/game/ui/widget/YoutubeVideoPlayerKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,119:1\n74#2:120\n74#2:121\n*S KotlinDebug\n*F\n+ 1 YoutubeVideoPlayer.kt\ncom/blackhub/bronline/game/ui/widget/YoutubeVideoPlayerKt\n*L\n29#1:120\n30#1:121\n*E\n"})
/* loaded from: classes3.dex */
public final class YoutubeVideoPlayerKt {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.blackhub.bronline.game.ui.widget.YoutubeVideoPlayerKt$YoutubeVideoPlayer$playerStateListener$1] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void YoutubeVideoPlayer(@Nullable Modifier modifier, @Nullable final String str, @Nullable Function1<? super Boolean, Unit> function1, @Nullable Function1<? super Boolean, Unit> function12, @Nullable Function0<Unit> function0, @Nullable Composer composer, final int i, final int i2) throws JSONException {
        Modifier modifier2;
        int i3;
        int i4;
        Function1<? super Boolean, Unit> function13;
        int i5;
        Function1<? super Boolean, Unit> function14;
        int i6;
        Function0<Unit> function02;
        Modifier modifier3;
        final Function1<? super Boolean, Unit> function15;
        final Function1<? super Boolean, Unit> function16;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(973810092);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 112) == 0) {
                i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 896) == 0) {
                    function13 = function1;
                    i3 |= composerStartRestartGroup.changedInstance(function13) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 7168) == 0) {
                        function14 = function12;
                        i3 |= composerStartRestartGroup.changedInstance(function14) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 != 0) {
                        if ((57344 & i) == 0) {
                            function02 = function0;
                            i3 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
                        }
                        if ((46811 & i3) != 9362 || !composerStartRestartGroup.getSkipping()) {
                            modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                            function15 = i4 == 0 ? new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.YoutubeVideoPlayerKt.YoutubeVideoPlayer.1
                                public final void invoke(boolean z) {
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                    invoke(bool.booleanValue());
                                    return Unit.INSTANCE;
                                }
                            } : function13;
                            Function1<? super Boolean, Unit> function17 = i5 == 0 ? new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.YoutubeVideoPlayerKt.YoutubeVideoPlayer.2
                                public final void invoke(boolean z) {
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                    invoke(bool.booleanValue());
                                    return Unit.INSTANCE;
                                }
                            } : function14;
                            Function0<Unit> function03 = i6 == 0 ? new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.YoutubeVideoPlayerKt.YoutubeVideoPlayer.3
                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }
                            } : function02;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(973810092, i3, -1, "com.blackhub.bronline.game.ui.widget.YoutubeVideoPlayer (YoutubeVideoPlayer.kt:27)");
                            }
                            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                            final String strSplitLinkForYouTubeVideoId = StringExtensionKt.splitLinkForYouTubeVideoId(str);
                            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                            final YouTubePlayerView youTubePlayerView = new YouTubePlayerView(context);
                            final Function1<? super Boolean, Unit> function18 = function17;
                            final Function1<? super Boolean, Unit> function19 = function15;
                            final Function0<Unit> function04 = function03;
                            final ?? r0 = new AbstractYouTubePlayerListener() { // from class: com.blackhub.bronline.game.ui.widget.YoutubeVideoPlayerKt$YoutubeVideoPlayer$playerStateListener$1

                                /* compiled from: YoutubeVideoPlayer.kt */
                                @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
                                /* loaded from: classes3.dex */
                                public /* synthetic */ class WhenMappings {
                                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                    static {
                                        int[] iArr = new int[PlayerConstants.PlayerState.values().length];
                                        try {
                                            iArr[PlayerConstants.PlayerState.BUFFERING.ordinal()] = 1;
                                        } catch (NoSuchFieldError unused) {
                                        }
                                        try {
                                            iArr[PlayerConstants.PlayerState.PLAYING.ordinal()] = 2;
                                        } catch (NoSuchFieldError unused2) {
                                        }
                                        try {
                                            iArr[PlayerConstants.PlayerState.ENDED.ordinal()] = 3;
                                        } catch (NoSuchFieldError unused3) {
                                        }
                                        $EnumSwitchMapping$0 = iArr;
                                    }
                                }

                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener, com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerListener
                                public void onReady(@NotNull YouTubePlayer youTubePlayer) {
                                    Intrinsics.checkNotNullParameter(youTubePlayer, "youTubePlayer");
                                    super.onReady(youTubePlayer);
                                    objectRef.element = youTubePlayer;
                                    youTubePlayer.loadVideo(strSplitLinkForYouTubeVideoId, 0.0f);
                                }

                                @Override // com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener, com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerListener
                                public void onStateChange(@NotNull YouTubePlayer youTubePlayer, @NotNull PlayerConstants.PlayerState state) {
                                    Intrinsics.checkNotNullParameter(youTubePlayer, "youTubePlayer");
                                    Intrinsics.checkNotNullParameter(state, "state");
                                    super.onStateChange(youTubePlayer, state);
                                    int i8 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                                    if (i8 == 1) {
                                        function18.invoke(Boolean.TRUE);
                                        function19.invoke(Boolean.FALSE);
                                        return;
                                    }
                                    if (i8 == 2) {
                                        function18.invoke(Boolean.FALSE);
                                        function19.invoke(Boolean.TRUE);
                                    } else {
                                        if (i8 != 3) {
                                            return;
                                        }
                                        Function1<Boolean, Unit> function110 = function19;
                                        Boolean bool = Boolean.FALSE;
                                        function110.invoke(bool);
                                        function18.invoke(bool);
                                        function04.invoke();
                                    }
                                }

                                @Override // com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener, com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerListener
                                public void onError(@NotNull YouTubePlayer youTubePlayer, @NotNull PlayerConstants.PlayerError error) {
                                    Intrinsics.checkNotNullParameter(youTubePlayer, "youTubePlayer");
                                    Intrinsics.checkNotNullParameter(error, "error");
                                    super.onError(youTubePlayer, error);
                                    FirebaseCrashlytics.getInstance().log("YoutubeVideoPlayer onError");
                                }
                            };
                            final IFramePlayerOptions.Builder builder = new IFramePlayerOptions.Builder();
                            builder.controls(0);
                            builder.fullscreen(0);
                            builder.autoplay(1);
                            builder.rel(0);
                            AndroidView_androidKt.AndroidView(new Function1<Context, YouTubePlayerView>() { // from class: com.blackhub.bronline.game.ui.widget.YoutubeVideoPlayerKt.YoutubeVideoPlayer.4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                @NotNull
                                public final YouTubePlayerView invoke(@NotNull Context it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    YouTubePlayerView youTubePlayerView2 = youTubePlayerView;
                                    YoutubeVideoPlayerKt$YoutubeVideoPlayer$playerStateListener$1 youtubeVideoPlayerKt$YoutubeVideoPlayer$playerStateListener$1 = r0;
                                    IFramePlayerOptions.Builder builder2 = builder;
                                    youTubePlayerView2.setEnableAutomaticInitialization(false);
                                    youTubePlayerView2.initialize(youtubeVideoPlayerKt$YoutubeVideoPlayer$playerStateListener$1, builder2.build());
                                    return youTubePlayerView2;
                                }
                            }, BackgroundKt.m7771backgroundbw27NRU$default(modifier3, Color.INSTANCE.m11369getDarkGray0d7_KjU(), null, 2, null), null, composerStartRestartGroup, 0, 4);
                            EffectsKt.DisposableEffect(Unit.INSTANCE, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.blackhub.bronline.game.ui.widget.YoutubeVideoPlayerKt.YoutubeVideoPlayer.5
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                @NotNull
                                public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final YouTubePlayerView youTubePlayerView2 = youTubePlayerView;
                                    final YoutubeVideoPlayerKt$YoutubeVideoPlayer$playerStateListener$1 youtubeVideoPlayerKt$YoutubeVideoPlayer$playerStateListener$1 = r0;
                                    final Ref.ObjectRef<YouTubePlayer> objectRef2 = objectRef;
                                    return new DisposableEffectResult() { // from class: com.blackhub.bronline.game.ui.widget.YoutubeVideoPlayerKt$YoutubeVideoPlayer$5$invoke$$inlined$onDispose$1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            youTubePlayerView2.removeYouTubePlayerListener(youtubeVideoPlayerKt$YoutubeVideoPlayer$playerStateListener$1);
                                            youTubePlayerView2.release();
                                            objectRef2.element = null;
                                        }
                                    };
                                }
                            }, composerStartRestartGroup, 6);
                            EffectsKt.DisposableEffect(lifecycleOwner, new C62246(lifecycleOwner, objectRef), composerStartRestartGroup, 8);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function16 = function17;
                            function02 = function03;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            function15 = function13;
                            function16 = function14;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final Modifier modifier4 = modifier3;
                            final Function0<Unit> function05 = function02;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.YoutubeVideoPlayerKt.YoutubeVideoPlayer.7
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) throws JSONException {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer2, int i8) throws JSONException {
                                    YoutubeVideoPlayerKt.YoutubeVideoPlayer(modifier4, str, function15, function16, function05, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= CpioConstants.C_ISBLK;
                    function02 = function0;
                    if ((46811 & i3) != 9362) {
                        if (i7 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                        final String strSplitLinkForYouTubeVideoId2 = StringExtensionKt.splitLinkForYouTubeVideoId(str);
                        final Ref.ObjectRef<YouTubePlayer> objectRef2 = new Ref.ObjectRef();
                        final YouTubePlayerView youTubePlayerView2 = new YouTubePlayerView(context2);
                        final Function1<? super Boolean, Unit> function182 = function17;
                        final Function1<? super Boolean, Unit> function192 = function15;
                        final Function0<Unit> function042 = function03;
                        final YoutubeVideoPlayerKt$YoutubeVideoPlayer$playerStateListener$1 r02 = new AbstractYouTubePlayerListener() { // from class: com.blackhub.bronline.game.ui.widget.YoutubeVideoPlayerKt$YoutubeVideoPlayer$playerStateListener$1

                            /* compiled from: YoutubeVideoPlayer.kt */
                            @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
                            /* loaded from: classes3.dex */
                            public /* synthetic */ class WhenMappings {
                                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                static {
                                    int[] iArr = new int[PlayerConstants.PlayerState.values().length];
                                    try {
                                        iArr[PlayerConstants.PlayerState.BUFFERING.ordinal()] = 1;
                                    } catch (NoSuchFieldError unused) {
                                    }
                                    try {
                                        iArr[PlayerConstants.PlayerState.PLAYING.ordinal()] = 2;
                                    } catch (NoSuchFieldError unused2) {
                                    }
                                    try {
                                        iArr[PlayerConstants.PlayerState.ENDED.ordinal()] = 3;
                                    } catch (NoSuchFieldError unused3) {
                                    }
                                    $EnumSwitchMapping$0 = iArr;
                                }
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener, com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerListener
                            public void onReady(@NotNull YouTubePlayer youTubePlayer) {
                                Intrinsics.checkNotNullParameter(youTubePlayer, "youTubePlayer");
                                super.onReady(youTubePlayer);
                                objectRef2.element = youTubePlayer;
                                youTubePlayer.loadVideo(strSplitLinkForYouTubeVideoId2, 0.0f);
                            }

                            @Override // com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener, com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerListener
                            public void onStateChange(@NotNull YouTubePlayer youTubePlayer, @NotNull PlayerConstants.PlayerState state) {
                                Intrinsics.checkNotNullParameter(youTubePlayer, "youTubePlayer");
                                Intrinsics.checkNotNullParameter(state, "state");
                                super.onStateChange(youTubePlayer, state);
                                int i8 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                                if (i8 == 1) {
                                    function182.invoke(Boolean.TRUE);
                                    function192.invoke(Boolean.FALSE);
                                    return;
                                }
                                if (i8 == 2) {
                                    function182.invoke(Boolean.FALSE);
                                    function192.invoke(Boolean.TRUE);
                                } else {
                                    if (i8 != 3) {
                                        return;
                                    }
                                    Function1<Boolean, Unit> function110 = function192;
                                    Boolean bool = Boolean.FALSE;
                                    function110.invoke(bool);
                                    function182.invoke(bool);
                                    function042.invoke();
                                }
                            }

                            @Override // com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener, com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerListener
                            public void onError(@NotNull YouTubePlayer youTubePlayer, @NotNull PlayerConstants.PlayerError error) {
                                Intrinsics.checkNotNullParameter(youTubePlayer, "youTubePlayer");
                                Intrinsics.checkNotNullParameter(error, "error");
                                super.onError(youTubePlayer, error);
                                FirebaseCrashlytics.getInstance().log("YoutubeVideoPlayer onError");
                            }
                        };
                        final IFramePlayerOptions.Builder builder2 = new IFramePlayerOptions.Builder();
                        builder2.controls(0);
                        builder2.fullscreen(0);
                        builder2.autoplay(1);
                        builder2.rel(0);
                        AndroidView_androidKt.AndroidView(new Function1<Context, YouTubePlayerView>() { // from class: com.blackhub.bronline.game.ui.widget.YoutubeVideoPlayerKt.YoutubeVideoPlayer.4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            @NotNull
                            public final YouTubePlayerView invoke(@NotNull Context it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                YouTubePlayerView youTubePlayerView22 = youTubePlayerView2;
                                YoutubeVideoPlayerKt$YoutubeVideoPlayer$playerStateListener$1 youtubeVideoPlayerKt$YoutubeVideoPlayer$playerStateListener$1 = r02;
                                IFramePlayerOptions.Builder builder22 = builder2;
                                youTubePlayerView22.setEnableAutomaticInitialization(false);
                                youTubePlayerView22.initialize(youtubeVideoPlayerKt$YoutubeVideoPlayer$playerStateListener$1, builder22.build());
                                return youTubePlayerView22;
                            }
                        }, BackgroundKt.m7771backgroundbw27NRU$default(modifier3, Color.INSTANCE.m11369getDarkGray0d7_KjU(), null, 2, null), null, composerStartRestartGroup, 0, 4);
                        EffectsKt.DisposableEffect(Unit.INSTANCE, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.blackhub.bronline.game.ui.widget.YoutubeVideoPlayerKt.YoutubeVideoPlayer.5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            @NotNull
                            public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final YouTubePlayerView youTubePlayerView22 = youTubePlayerView2;
                                final YoutubeVideoPlayerKt$YoutubeVideoPlayer$playerStateListener$1 youtubeVideoPlayerKt$YoutubeVideoPlayer$playerStateListener$1 = r02;
                                final Ref.ObjectRef objectRef22 = objectRef2;
                                return new DisposableEffectResult() { // from class: com.blackhub.bronline.game.ui.widget.YoutubeVideoPlayerKt$YoutubeVideoPlayer$5$invoke$$inlined$onDispose$1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        youTubePlayerView22.removeYouTubePlayerListener(youtubeVideoPlayerKt$YoutubeVideoPlayer$playerStateListener$1);
                                        youTubePlayerView22.release();
                                        objectRef22.element = null;
                                    }
                                };
                            }
                        }, composerStartRestartGroup, 6);
                        EffectsKt.DisposableEffect(lifecycleOwner2, new C62246(lifecycleOwner2, objectRef2), composerStartRestartGroup, 8);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        function16 = function17;
                        function02 = function03;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function14 = function12;
                i6 = i2 & 16;
                if (i6 != 0) {
                }
                function02 = function0;
                if ((46811 & i3) != 9362) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            function13 = function1;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function14 = function12;
            i6 = i2 & 16;
            if (i6 != 0) {
            }
            function02 = function0;
            if ((46811 & i3) != 9362) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function13 = function1;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function14 = function12;
        i6 = i2 & 16;
        if (i6 != 0) {
        }
        function02 = function0;
        if ((46811 & i3) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* compiled from: YoutubeVideoPlayer.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m7105d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nYoutubeVideoPlayer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YoutubeVideoPlayer.kt\ncom/blackhub/bronline/game/ui/widget/YoutubeVideoPlayerKt$YoutubeVideoPlayer$6\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,119:1\n64#2,5:120\n*S KotlinDebug\n*F\n+ 1 YoutubeVideoPlayer.kt\ncom/blackhub/bronline/game/ui/widget/YoutubeVideoPlayerKt$YoutubeVideoPlayer$6\n*L\n115#1:120,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.ui.widget.YoutubeVideoPlayerKt$YoutubeVideoPlayer$6 */
    /* loaded from: classes7.dex */
    public static final class C62246 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
        public final /* synthetic */ LifecycleOwner $mLifeCycleOwner;
        public final /* synthetic */ Ref.ObjectRef<YouTubePlayer> $player;

        /* compiled from: YoutubeVideoPlayer.kt */
        @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.ui.widget.YoutubeVideoPlayerKt$YoutubeVideoPlayer$6$WhenMappings */
        /* loaded from: classes3.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Lifecycle.Event.values().length];
                try {
                    iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C62246(LifecycleOwner lifecycleOwner, Ref.ObjectRef<YouTubePlayer> objectRef) {
            super(1);
            this.$mLifeCycleOwner = lifecycleOwner;
            this.$player = objectRef;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            final Lifecycle lifecycle = this.$mLifeCycleOwner.getLifecycle();
            final Ref.ObjectRef<YouTubePlayer> objectRef = this.$player;
            final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.blackhub.bronline.game.ui.widget.YoutubeVideoPlayerKt$YoutubeVideoPlayer$6$$ExternalSyntheticLambda0
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    YoutubeVideoPlayerKt.C62246.invoke$lambda$0(objectRef, lifecycleOwner, event);
                }
            };
            lifecycle.addObserver(lifecycleEventObserver);
            return new DisposableEffectResult() { // from class: com.blackhub.bronline.game.ui.widget.YoutubeVideoPlayerKt$YoutubeVideoPlayer$6$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    lifecycle.removeObserver(lifecycleEventObserver);
                }
            };
        }

        public static final void invoke$lambda$0(Ref.ObjectRef player, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            YouTubePlayer youTubePlayer;
            Intrinsics.checkNotNullParameter(player, "$player");
            Intrinsics.checkNotNullParameter(lifecycleOwner, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(event, "event");
            int i = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
            if (i != 1) {
                if (i == 2 && (youTubePlayer = (YouTubePlayer) player.element) != null) {
                    youTubePlayer.pause();
                    return;
                }
                return;
            }
            YouTubePlayer youTubePlayer2 = (YouTubePlayer) player.element;
            if (youTubePlayer2 != null) {
                youTubePlayer2.play();
            }
        }
    }
}

