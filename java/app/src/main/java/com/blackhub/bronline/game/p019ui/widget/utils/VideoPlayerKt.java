package com.blackhub.bronline.game.p019ui.widget.utils;

import android.content.Context;
import android.net.Uri;
import android.widget.FrameLayout;
import androidx.annotation.OptIn;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Player;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import androidx.media3.p008ui.PlayerView;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.core.utils.lifecycleobserver.AppLifecycleObserver;
import com.blackhub.bronline.game.gui.videoplayer.VideoConfiguration;
import com.blackhub.bronline.game.p019ui.widget.button.SkipButtonKt;
import com.blackhub.bronline.game.p019ui.widget.other.FakeDialogKt;
import com.blackhub.bronline.launcher.App;
import com.bless.client.R;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VideoPlayer.kt */
@SourceDebugExtension({"SMAP\nVideoPlayer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoPlayer.kt\ncom/blackhub/bronline/game/ui/widget/utils/VideoPlayerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,158:1\n1116#2,6:159\n74#3:165\n*S KotlinDebug\n*F\n+ 1 VideoPlayer.kt\ncom/blackhub/bronline/game/ui/widget/utils/VideoPlayerKt\n*L\n52#1:159,6\n82#1:165\n*E\n"})
/* loaded from: classes3.dex */
public final class VideoPlayerKt {
    public static final float ARROWS_ALPHA = 0.8f;

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @OptIn(markerClass = {UnstableApi.class})
    @Composable
    public static final void VideoPlayer(@NotNull final VideoConfiguration videoConfiguration, @NotNull final Context context, boolean z, final boolean z2, @NotNull final Function0<Unit> onScreenClick, @NotNull final Function0<Unit> onFinishPlay, @Nullable Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(videoConfiguration, "videoConfiguration");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onScreenClick, "onScreenClick");
        Intrinsics.checkNotNullParameter(onFinishPlay, "onFinishPlay");
        Composer composerStartRestartGroup = composer.startRestartGroup(57346669);
        final boolean z3 = (i2 & 4) != 0 ? true : z;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(57346669, i, -1, "com.blackhub.bronline.game.ui.widget.utils.VideoPlayer (VideoPlayer.kt:50)");
        }
        composerStartRestartGroup.startReplaceableGroup(1569621972);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            ExoPlayer exoPlayerBuild = new ExoPlayer.Builder(context).build();
            DefaultDataSource.Factory factory = new DefaultDataSource.Factory(context);
            try {
                MediaItem mediaItemFromUri = MediaItem.fromUri(Uri.fromFile(videoConfiguration.getVideoFile()));
                Intrinsics.checkNotNullExpressionValue(mediaItemFromUri, "fromUri(...)");
                ProgressiveMediaSource progressiveMediaSourceCreateMediaSource = new ProgressiveMediaSource.Factory(factory).createMediaSource(mediaItemFromUri);
                Intrinsics.checkNotNullExpressionValue(progressiveMediaSourceCreateMediaSource, "createMediaSource(...)");
                exoPlayerBuild.setMediaSource(progressiveMediaSourceCreateMediaSource);
                exoPlayerBuild.prepare();
            } catch (Exception e) {
                UtilsKt.crashlyticsRecordNewException("Failed to create player: " + e);
            }
            exoPlayerBuild.addListener(new Player.Listener() { // from class: com.blackhub.bronline.game.ui.widget.utils.VideoPlayerKt$VideoPlayer$exoPlayer$1$1$1
                @Override // androidx.media3.common.Player.Listener
                public void onPlayerStateChanged(boolean playWhenReady, int playbackState) {
                    if (playbackState == 4) {
                        onFinishPlay.invoke();
                    }
                }
            });
            composerStartRestartGroup.updateRememberedValue(exoPlayerBuild);
            objRememberedValue = exoPlayerBuild;
        }
        final ExoPlayer exoPlayer = (ExoPlayer) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        Intrinsics.checkNotNull(exoPlayer);
        exoPlayer.setPlayWhenReady(z3);
        Context applicationContext = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type com.blackhub.bronline.launcher.App");
        final App app = (App) applicationContext;
        EffectsKt.DisposableEffect(Unit.INSTANCE, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.blackhub.bronline.game.ui.widget.utils.VideoPlayerKt.VideoPlayer.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v1, types: [com.blackhub.bronline.game.core.utils.lifecycleobserver.AppLifecycleObserver, com.blackhub.bronline.game.ui.widget.utils.VideoPlayerKt$VideoPlayer$1$observer$1] */
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                final boolean z4 = z3;
                final ExoPlayer exoPlayer2 = exoPlayer;
                final ?? r5 = new AppLifecycleObserver() { // from class: com.blackhub.bronline.game.ui.widget.utils.VideoPlayerKt$VideoPlayer$1$observer$1
                    @Override // com.blackhub.bronline.game.core.utils.lifecycleobserver.AppLifecycleObserver
                    public void onAppForegrounded() {
                        if (z4) {
                            exoPlayer2.setPlayWhenReady(true);
                        }
                    }

                    @Override // com.blackhub.bronline.game.core.utils.lifecycleobserver.AppLifecycleObserver
                    public void onAppBackgrounded() {
                        exoPlayer2.setPlayWhenReady(false);
                    }
                };
                app.addAppLifecycleObserver(r5);
                final ExoPlayer exoPlayer3 = exoPlayer;
                final App app2 = app;
                final VideoConfiguration videoConfiguration2 = videoConfiguration;
                return new DisposableEffectResult() { // from class: com.blackhub.bronline.game.ui.widget.utils.VideoPlayerKt$VideoPlayer$1$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        exoPlayer3.stop();
                        exoPlayer3.release();
                        app2.deleteAppLifecycleObserver(r5);
                        File videoFile = videoConfiguration2.getVideoFile();
                        if (videoFile != null) {
                            videoFile.delete();
                        }
                    }
                };
            }
        }, composerStartRestartGroup, 6);
        FakeDialogKt.m15089FakeDialog3IgeMak(null, 0L, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1514626913, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.utils.VideoPlayerKt.VideoPlayer.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@Nullable Composer composer2, int i3) {
                if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1514626913, i3, -1, "com.blackhub.bronline.game.ui.widget.utils.VideoPlayer.<anonymous> (VideoPlayer.kt:106)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM7771backgroundbw27NRU$default = BackgroundKt.m7771backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), ColorResources_androidKt.colorResource(R.color.total_black, composer2, 6), null, 2, null);
                    VideoConfiguration videoConfiguration2 = videoConfiguration;
                    final Context context2 = context;
                    final ExoPlayer exoPlayer2 = exoPlayer;
                    final Function0<Unit> function0 = onScreenClick;
                    final boolean z4 = z2;
                    final Function0<Unit> function02 = onFinishPlay;
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM7771backgroundbw27NRU$default);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    AndroidView_androidKt.AndroidView(new Function1<Context, PlayerView>() { // from class: com.blackhub.bronline.game.ui.widget.utils.VideoPlayerKt$VideoPlayer$2$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        public final PlayerView invoke(@NotNull Context it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            PlayerView playerView = new PlayerView(context2);
                            ExoPlayer exoPlayer3 = exoPlayer2;
                            playerView.hideController();
                            playerView.setUseController(false);
                            playerView.setResizeMode(0);
                            playerView.setPlayer(exoPlayer3);
                            playerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                            return playerView;
                        }
                    }, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), null, composer2, 48, 4);
                    ComposeExtensionKt.IfTrue(Boolean.valueOf(videoConfiguration2.isSkippable()), ComposableLambdaKt.composableLambda(composer2, 1620691267, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.utils.VideoPlayerKt$VideoPlayer$2$1$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer3, int i4) {
                            if ((i4 & 11) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1620691267, i4, -1, "com.blackhub.bronline.game.ui.widget.utils.VideoPlayer.<anonymous>.<anonymous>.<anonymous> (VideoPlayer.kt:128)");
                                }
                                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                composer3.startReplaceableGroup(-1912362543);
                                boolean zChanged = composer3.changed(function0);
                                final Function0<Unit> function03 = function0;
                                Object objRememberedValue2 = composer3.rememberedValue();
                                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.utils.VideoPlayerKt$VideoPlayer$2$1$2$1$1
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
                                            function03.invoke();
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue2);
                                }
                                composer3.endReplaceableGroup();
                                BoxKt.Box(ComposeExtensionKt.noRippleClickable$default(modifierFillMaxSize$default, false, (Function0) objRememberedValue2, 1, null), composer3, 0);
                                Boolean boolValueOf = Boolean.valueOf(z4);
                                final Function0<Unit> function04 = function02;
                                ComposeExtensionKt.IfTrue(boolValueOf, ComposableLambdaKt.composableLambda(composer3, -722183829, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.utils.VideoPlayerKt$VideoPlayer$2$1$2.2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer4, int i5) {
                                        if ((i5 & 11) != 2 || !composer4.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-722183829, i5, -1, "com.blackhub.bronline.game.ui.widget.utils.VideoPlayer.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VideoPlayer.kt:137)");
                                            }
                                            Modifier.Companion companion3 = Modifier.INSTANCE;
                                            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
                                            Alignment topEnd = Alignment.INSTANCE.getTopEnd();
                                            final Function0<Unit> function05 = function04;
                                            composer4.startReplaceableGroup(733328855);
                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(topEnd, false, composer4, 6);
                                            composer4.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                            CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default2);
                                            if (!(composer4.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor2);
                                            } else {
                                                composer4.useNode();
                                            }
                                            Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer4);
                                            Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                            }
                                            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                            composer4.startReplaceableGroup(2058660585);
                                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                            Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(companion3, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composer4, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._50wdp, composer4, 6), 0.0f, 9, null);
                                            composer4.startReplaceableGroup(-1109026949);
                                            boolean zChanged2 = composer4.changed(function05);
                                            Object objRememberedValue3 = composer4.rememberedValue();
                                            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue3 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.utils.VideoPlayerKt$VideoPlayer$2$1$2$2$1$1$1
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
                                                        function05.invoke();
                                                    }
                                                };
                                                composer4.updateRememberedValue(objRememberedValue3);
                                            }
                                            composer4.endReplaceableGroup();
                                            SkipButtonKt.SkipButton(modifierM8127paddingqDBjuR0$default, R.color.white_80, 0.8f, (Function0) objRememberedValue3, composer4, 432, 0);
                                            composer4.endReplaceableGroup();
                                            composer4.endNode();
                                            composer4.endReplaceableGroup();
                                            composer4.endReplaceableGroup();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                }), composer3, 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, 48);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, 384, 3);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final boolean z4 = z3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.utils.VideoPlayerKt.VideoPlayer.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i3) {
                    VideoPlayerKt.VideoPlayer(videoConfiguration, context, z4, z2, onScreenClick, onFinishPlay, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }
}

