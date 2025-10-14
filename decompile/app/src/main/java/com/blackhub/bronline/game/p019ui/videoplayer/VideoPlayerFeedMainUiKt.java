package com.blackhub.bronline.game.p019ui.videoplayer;

import android.content.Context;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.gui.videoplayer.VideoConfiguration;
import com.blackhub.bronline.game.p019ui.widget.utils.VideoPlayerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VideoPlayerFeedMainUi.kt */
@Metadata(m7104d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, m7105d2 = {"VideoPlayerFeedMainUi", "", "configuration", "Lcom/blackhub/bronline/game/gui/videoplayer/VideoConfiguration;", "isSkipButtonVisible", "", "onScreenClick", "Lkotlin/Function0;", "onFinishPlayFeed", "(Lcom/blackhub/bronline/game/gui/videoplayer/VideoConfiguration;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nVideoPlayerFeedMainUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoPlayerFeedMainUi.kt\ncom/blackhub/bronline/game/ui/videoplayer/VideoPlayerFeedMainUiKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,34:1\n74#2:35\n1116#3,6:36\n1116#3,6:42\n*S KotlinDebug\n*F\n+ 1 VideoPlayerFeedMainUi.kt\ncom/blackhub/bronline/game/ui/videoplayer/VideoPlayerFeedMainUiKt\n*L\n17#1:35\n26#1:36,6\n29#1:42,6\n*E\n"})
/* loaded from: classes3.dex */
public final class VideoPlayerFeedMainUiKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void VideoPlayerFeedMainUi(@NotNull final VideoConfiguration configuration, final boolean z, @NotNull final Function0<Unit> onScreenClick, @NotNull final Function0<Unit> onFinishPlayFeed, @Nullable Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(onScreenClick, "onScreenClick");
        Intrinsics.checkNotNullParameter(onFinishPlayFeed, "onFinishPlayFeed");
        Composer composerStartRestartGroup = composer.startRestartGroup(1833458063);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1833458063, i, -1, "com.blackhub.bronline.game.ui.videoplayer.VideoPlayerFeedMainUi (VideoPlayerFeedMainUi.kt:15)");
        }
        Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        if (AnyExtensionKt.isNotNull(configuration.getVideoFile())) {
            composerStartRestartGroup.startReplaceableGroup(-1582566858);
            boolean z2 = (((i & 896) ^ 384) > 256 && composerStartRestartGroup.changed(onScreenClick)) || (i & 384) == 256;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.videoplayer.VideoPlayerFeedMainUiKt$VideoPlayerFeedMainUi$1$1
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
                        onScreenClick.invoke();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-1582566782);
            boolean z3 = (((i & 7168) ^ 3072) > 2048 && composerStartRestartGroup.changed(onFinishPlayFeed)) || (i & 3072) == 2048;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.videoplayer.VideoPlayerFeedMainUiKt$VideoPlayerFeedMainUi$2$1
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
                        onFinishPlayFeed.invoke();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            VideoPlayerKt.VideoPlayer(configuration, context, true, z, function0, (Function0) objRememberedValue2, composerStartRestartGroup, ((i << 6) & 7168) | 456, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.videoplayer.VideoPlayerFeedMainUiKt.VideoPlayerFeedMainUi.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) {
                    VideoPlayerFeedMainUiKt.VideoPlayerFeedMainUi(configuration, z, onScreenClick, onFinishPlayFeed, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
