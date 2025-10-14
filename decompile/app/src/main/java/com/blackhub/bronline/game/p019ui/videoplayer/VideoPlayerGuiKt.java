package com.blackhub.bronline.game.p019ui.videoplayer;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.blackhub.bronline.game.gui.videoplayer.VideoPlayerModalWindowKt;
import com.blackhub.bronline.game.gui.videoplayer.VideoPlayerTypeScreen;
import com.blackhub.bronline.game.gui.videoplayer.VideoPlayerUiState;
import com.blackhub.bronline.game.gui.videoplayer.VideoPlayerViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* compiled from: VideoPlayerGui.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m7105d2 = {"VideoPlayerGui", "", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nVideoPlayerGui.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoPlayerGui.kt\ncom/blackhub/bronline/game/ui/videoplayer/VideoPlayerGuiKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n*L\n1#1,41:1\n81#2,11:42\n*S KotlinDebug\n*F\n+ 1 VideoPlayerGui.kt\ncom/blackhub/bronline/game/ui/videoplayer/VideoPlayerGuiKt\n*L\n12#1:42,11\n*E\n"})
/* loaded from: classes3.dex */
public final class VideoPlayerGuiKt {

    /* compiled from: VideoPlayerGui.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoPlayerTypeScreen.values().length];
            try {
                iArr[VideoPlayerTypeScreen.PLAYER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoPlayerTypeScreen.MODAL_WINDOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void VideoPlayerGui(@Nullable Composer composer, final int i) {
        CreationExtras defaultViewModelCreationExtras;
        Composer composerStartRestartGroup = composer.startRestartGroup(595264790);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(595264790, i, -1, "com.blackhub.bronline.game.ui.videoplayer.VideoPlayerGui (VideoPlayerGui.kt:10)");
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            if (current instanceof HasDefaultViewModelProviderFactory) {
                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
            } else {
                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel = ViewModelKt.viewModel(VideoPlayerViewModel.class, current, null, null, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            final VideoPlayerViewModel videoPlayerViewModel = (VideoPlayerViewModel) viewModel;
            VideoPlayerUiState videoPlayerUiState = (VideoPlayerUiState) SnapshotStateKt.collectAsState(videoPlayerViewModel.getUiState(), null, composerStartRestartGroup, 8, 1).getValue();
            int i2 = WhenMappings.$EnumSwitchMapping$0[videoPlayerUiState.getTypeScreen().ordinal()];
            if (i2 == 1) {
                composerStartRestartGroup.startReplaceableGroup(-899335144);
                VideoPlayerFeedMainUiKt.VideoPlayerFeedMainUi(videoPlayerUiState.getConfiguration(), videoPlayerUiState.isSkipButtonVisible(), new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.videoplayer.VideoPlayerGuiKt.VideoPlayerGui.1
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
                        videoPlayerViewModel.onScreenClick();
                    }
                }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.videoplayer.VideoPlayerGuiKt.VideoPlayerGui.2
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
                        videoPlayerViewModel.onCloseScreen();
                    }
                }, composerStartRestartGroup, 8);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (i2 == 2) {
                composerStartRestartGroup.startReplaceableGroup(-899334713);
                VideoPlayerModalWindowKt.VideoPlayerModalWindow(new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.videoplayer.VideoPlayerGuiKt.VideoPlayerGui.3
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
                        videoPlayerViewModel.onClickDismissInModalWindow();
                    }
                }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.videoplayer.VideoPlayerGuiKt.VideoPlayerGui.4
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
                        videoPlayerViewModel.onClickConfirmInModalWindow();
                    }
                }, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-899334433);
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.videoplayer.VideoPlayerGuiKt.VideoPlayerGui.5
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
                    VideoPlayerGuiKt.VideoPlayerGui(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
