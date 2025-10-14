package com.blackhub.bronline.game.p019ui.catchstreamer;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.PainterModifierKt;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.Placeholder;
import androidx.compose.p003ui.text.PlaceholderVerticalAlign;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.tooling.preview.Preview;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.TextUnitKt;
import androidx.compose.p003ui.window.AndroidDialog_androidKt;
import androidx.compose.p003ui.window.DialogProperties;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.compose.ConstraintLayoutKt;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.compose.HorizontalAnchorable;
import androidx.constraintlayout.compose.Measurer;
import androidx.constraintlayout.compose.ToolingUtilsKt;
import androidx.constraintlayout.compose.VerticalAnchorable;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.profileinstaller.ProfileVerifier;
import com.blackhub.bronline.game.common.resources.StringResourceCompose;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerUiState;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerViewModel;
import com.blackhub.bronline.game.p019ui.widget.block.TwoColorWithImageBlockKt;
import com.blackhub.bronline.game.p019ui.widget.button.CloseButtonWithGradientKt;
import com.blackhub.bronline.game.p019ui.widget.button.MainButtonGradientKt;
import com.blackhub.bronline.game.p019ui.widget.other.FakeDialogKt;
import com.blackhub.bronline.game.p019ui.widget.other.RectNeonCornerKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CatchStreamerBannerUi.kt */
@SourceDebugExtension({"SMAP\nCatchStreamerBannerUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CatchStreamerBannerUi.kt\ncom/blackhub/bronline/game/ui/catchstreamer/CatchStreamerBannerUiKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,690:1\n1116#2,6:691\n1116#2,6:697\n955#2,6:710\n1116#2,6:736\n1116#2,6:742\n154#3:703\n154#3:704\n73#4,4:705\n77#4,20:716\n25#5:709\n74#6:748\n81#7:749\n107#7,2:750\n*S KotlinDebug\n*F\n+ 1 CatchStreamerBannerUi.kt\ncom/blackhub/bronline/game/ui/catchstreamer/CatchStreamerBannerUiKt\n*L\n87#1:691,6\n98#1:697,6\n185#1:710,6\n647#1:736,6\n668#1:742,6\n159#1:703\n160#1:704\n185#1:705,4\n185#1:716,20\n185#1:709\n681#1:748\n87#1:749\n87#1:750,2\n*E\n"})
/* loaded from: classes2.dex */
public final class CatchStreamerBannerUiKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void CatchStreamerBannerUi(@Nullable Modifier modifier, @NotNull final CatchStreamerViewModel viewModel, @Nullable Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1269472555);
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1269472555, i, -1, "com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUi (CatchStreamerBannerUi.kt:79)");
        }
        final CatchStreamerUiState catchStreamerUiState = (CatchStreamerUiState) FlowExtKt.collectAsStateWithLifecycle(viewModel.getUiState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 8, 7).getValue();
        final MutableState mutableState = (MutableState) RememberSaveableKt.m10957rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) new Function0<MutableState<Boolean>>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt$CatchStreamerBannerUi$showRegistrationInCompetitionDialog$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final MutableState<Boolean> invoke() {
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            }
        }, composerStartRestartGroup, 3080, 6);
        final MutableState mutableState2 = (MutableState) RememberSaveableKt.m10957rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) new Function0<MutableState<Boolean>>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt$CatchStreamerBannerUi$showCongratulationsDialog$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final MutableState<Boolean> invoke() {
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            }
        }, composerStartRestartGroup, 3080, 6);
        composerStartRestartGroup.startReplaceableGroup(757104896);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        final MutableState mutableState3 = (MutableState) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        if (catchStreamerUiState.isPurchaseValid()) {
            viewModel.clearSellValid();
            mutableState2.setValue(Boolean.TRUE);
        }
        final boolean z = !((Boolean) mutableState.getValue()).booleanValue() && catchStreamerUiState.getCountBuyTickets() == 0;
        boolean z2 = catchStreamerUiState.getGames() >= 1;
        Unit unit = Unit.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(757105248);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        final int i3 = 10;
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new CatchStreamerBannerUiKt$CatchStreamerBannerUi$1$1(10, mutableState3, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 70);
        final boolean z3 = z2;
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -555007526, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt.CatchStreamerBannerUi.2
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
            public final void invoke(@Nullable Composer composer2, int i4) {
                if ((i4 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-555007526, i4, -1, "com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUi.<anonymous> (CatchStreamerBannerUi.kt:105)");
                    }
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    CatchStreamerUiState catchStreamerUiState2 = catchStreamerUiState;
                    boolean z4 = CatchStreamerBannerUiKt.CatchStreamerBannerUi$lambda$1(mutableState3) == i3;
                    MutableState<Boolean> mutableState4 = mutableState;
                    boolean z5 = z3;
                    boolean z6 = z;
                    final CatchStreamerViewModel catchStreamerViewModel = viewModel;
                    Function0<Unit> function0 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt.CatchStreamerBannerUi.2.1
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
                            catchStreamerViewModel.sendClickParticipate();
                        }
                    };
                    final CatchStreamerViewModel catchStreamerViewModel2 = viewModel;
                    Function0<Unit> function02 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt.CatchStreamerBannerUi.2.2
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
                            catchStreamerViewModel2.sendCloseScreen(2);
                        }
                    };
                    final CatchStreamerViewModel catchStreamerViewModel3 = viewModel;
                    CatchStreamerBannerUiKt.CatchStreamerBannerContent(companion2, catchStreamerUiState2, z4, mutableState4, z5, z6, function0, function02, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt.CatchStreamerBannerUi.2.3
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
                            catchStreamerViewModel3.sendClickGame();
                        }
                    }, composer2, 6, 0);
                    composer2.startReplaceableGroup(-1622917852);
                    if (mutableState.getValue().booleanValue()) {
                        final MutableState<Boolean> mutableState5 = mutableState;
                        final CatchStreamerViewModel catchStreamerViewModel4 = viewModel;
                        FakeDialogKt.m15089FakeDialog3IgeMak(null, 0L, ComposableLambdaKt.composableLambda(composer2, 981489601, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt.CatchStreamerBannerUi.2.4
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
                            public final void invoke(@Nullable Composer composer3, int i5) {
                                if ((i5 & 11) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(981489601, i5, -1, "com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUi.<anonymous>.<anonymous> (CatchStreamerBannerUi.kt:119)");
                                    }
                                    RegistrationInCompetitionDialogUiKt.RegistrationInCompetitionDialogUi(null, mutableState5, catchStreamerViewModel4, composer3, 512, 1);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }), composer2, 384, 3);
                    }
                    composer2.endReplaceableGroup();
                    if (mutableState2.getValue().booleanValue()) {
                        final MutableState<Boolean> mutableState6 = mutableState2;
                        final CatchStreamerUiState catchStreamerUiState3 = catchStreamerUiState;
                        FakeDialogKt.m15089FakeDialog3IgeMak(null, 0L, ComposableLambdaKt.composableLambda(composer2, -685888968, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt.CatchStreamerBannerUi.2.5
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
                            public final void invoke(@Nullable Composer composer3, int i5) {
                                if ((i5 & 11) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-685888968, i5, -1, "com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUi.<anonymous>.<anonymous> (CatchStreamerBannerUi.kt:128)");
                                    }
                                    CongratulationsDialogUIKt.CongratulationsDialogUI(null, mutableState6, catchStreamerUiState3, composer3, 0, 1);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }), composer2, 384, 3);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        });
        final Modifier modifier3 = modifier2;
        SurfaceKt.m9876SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, composableLambda, composerStartRestartGroup, 12582912, 127);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt.CatchStreamerBannerUi.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i4) {
                    CatchStreamerBannerUiKt.CatchStreamerBannerUi(modifier3, viewModel, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    public static final void CatchStreamerBannerUi$lambda$2(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0102  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CatchStreamerBannerContent(Modifier modifier, final CatchStreamerUiState catchStreamerUiState, boolean z, MutableState<Boolean> mutableState, boolean z2, boolean z3, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        boolean z4;
        MutableState<Boolean> mutableState2;
        int i5;
        boolean z5;
        int i6;
        boolean z6;
        int i7;
        int i8;
        int i9;
        final Modifier modifier2;
        final MutableState<Boolean> mutableStateMutableStateOf$default;
        final Function0<Unit> function04;
        final Function0<Unit> function05;
        boolean z7;
        int i10;
        Function0<Unit> function06;
        boolean z8;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        Object objRememberedValue3;
        final boolean z9;
        final boolean z10;
        final Function0<Unit> function07;
        final boolean z11;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final Composer composerStartRestartGroup = composer.startRestartGroup(-261868298);
        int i11 = i2 & 1;
        if (i11 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 112) == 0) {
                i3 |= composerStartRestartGroup.changed(catchStreamerUiState) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 896) == 0) {
                    z4 = z;
                    i3 |= composerStartRestartGroup.changed(z4) ? 256 : 128;
                }
                if ((i & 7168) == 0) {
                    if ((i2 & 8) == 0) {
                        mutableState2 = mutableState;
                        int i12 = composerStartRestartGroup.changed(mutableState2) ? 2048 : 1024;
                        i3 |= i12;
                    } else {
                        mutableState2 = mutableState;
                    }
                    i3 |= i12;
                } else {
                    mutableState2 = mutableState;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= CpioConstants.C_ISBLK;
                } else {
                    if ((57344 & i) == 0) {
                        z5 = z2;
                        i3 |= composerStartRestartGroup.changed(z5) ? 16384 : 8192;
                    }
                    i6 = i2 & 32;
                    if (i6 != 0) {
                        if ((458752 & i) == 0) {
                            z6 = z3;
                            i3 |= composerStartRestartGroup.changed(z6) ? 131072 : 65536;
                        }
                        i7 = i2 & 64;
                        if (i7 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 3670016) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function0) ? 1048576 : 524288;
                        }
                        i8 = i2 & 128;
                        if (i8 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 29360128) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function02) ? 8388608 : 4194304;
                        }
                        i9 = i2 & 256;
                        if (i9 != 0) {
                            i3 |= 100663296;
                        } else if ((i & 234881024) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function03) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                        }
                        if ((i3 & 191739611) != 38347922 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                modifier2 = i11 == 0 ? Modifier.INSTANCE : modifier;
                                if (i4 != 0) {
                                    z4 = false;
                                }
                                if ((i2 & 8) == 0) {
                                    mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                    i3 &= -7169;
                                } else {
                                    mutableStateMutableStateOf$default = mutableState2;
                                }
                                if (i5 != 0) {
                                    z5 = false;
                                }
                                if (i6 != 0) {
                                    z6 = false;
                                }
                                function04 = i7 == 0 ? new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt.CatchStreamerBannerContent.1
                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }
                                } : function0;
                                Function0<Unit> function08 = i8 == 0 ? new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt.CatchStreamerBannerContent.2
                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }
                                } : function02;
                                function05 = i9 == 0 ? new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt.CatchStreamerBannerContent.3
                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }
                                } : function03;
                                z7 = z5;
                                i10 = i3;
                                function06 = function08;
                                z8 = z6;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 8) != 0) {
                                    int i13 = i3 & (-7169);
                                    modifier2 = modifier;
                                    function04 = function0;
                                    function06 = function02;
                                    mutableStateMutableStateOf$default = mutableState2;
                                    z8 = z6;
                                    function05 = function03;
                                    boolean z12 = z5;
                                    i10 = i13;
                                    z7 = z12;
                                } else {
                                    modifier2 = modifier;
                                    function04 = function0;
                                    mutableStateMutableStateOf$default = mutableState2;
                                    z7 = z5;
                                    z8 = z6;
                                    function05 = function03;
                                    i10 = i3;
                                    function06 = function02;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-261868298, i10, -1, "com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerContent (CatchStreamerBannerUi.kt:148)");
                            }
                            final float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._8sdp, composerStartRestartGroup, 6);
                            final RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(fDimensionResource);
                            final float fDimensionResource2 = PrimitiveResources_androidKt.dimensionResource(R.dimen._154brdp, composerStartRestartGroup, 6);
                            final float fDimensionResource3 = PrimitiveResources_androidKt.dimensionResource(R.dimen._32brdp, composerStartRestartGroup, 6);
                            final float fDimensionResource4 = PrimitiveResources_androidKt.dimensionResource(R.dimen.catch_streamer_start_block_person, composerStartRestartGroup, 6);
                            final float fDimensionResource5 = PrimitiveResources_androidKt.dimensionResource(R.dimen._8sdp, composerStartRestartGroup, 6);
                            final float fDimensionResource6 = PrimitiveResources_androidKt.dimensionResource(R.dimen._14sdp, composerStartRestartGroup, 6);
                            final float fDimensionResource7 = PrimitiveResources_androidKt.dimensionResource(R.dimen._38sdp, composerStartRestartGroup, 6);
                            final float fM13666constructorimpl = C2046Dp.m13666constructorimpl(24);
                            final float fM13666constructorimpl2 = C2046Dp.m13666constructorimpl(-10);
                            StringResourceCompose stringResourceCompose = StringResourceCompose.INSTANCE;
                            final AnnotatedString catchStreamerTitle = stringResourceCompose.getCatchStreamerTitle(composerStartRestartGroup, 6);
                            final AnnotatedString catchStreamerSubtitle = stringResourceCompose.getCatchStreamerSubtitle(composerStartRestartGroup, 6);
                            final AnnotatedString catchStreamerBlockLeftText = stringResourceCompose.getCatchStreamerBlockLeftText(composerStartRestartGroup, 6);
                            final AnnotatedString catchStreamerBlockRightText = stringResourceCompose.getCatchStreamerBlockRightText(composerStartRestartGroup, 6);
                            final AnnotatedString blockCostTicketBC = stringResourceCompose.getBlockCostTicketBC(0, catchStreamerUiState.getCurrentCost(), composerStartRestartGroup, 384, 1);
                            final Map mapMapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m7112to(StringResourceCompose.CATCH_STREAMER_TICKET_TAG, new InlineTextContent(new Placeholder(TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._16brsp, composerStartRestartGroup, 6)), TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._16brsp, composerStartRestartGroup, 6)), PlaceholderVerticalAlign.INSTANCE.m13099getTextBottomJ6kI3mc(), null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1047693012, true, new Function3<String, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt$CatchStreamerBannerContent$inlineContentTicket$1
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(String str, Composer composer2, Integer num) {
                                    invoke(str, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@NotNull String it, @Nullable Composer composer2, int i14) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    if ((i14 & 81) != 16 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1047693012, i14, -1, "com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerContent.<anonymous> (CatchStreamerBannerUi.kt:176)");
                                        }
                                        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_ticket, composer2, 6), (String) null, SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            }))));
                            Modifier modifierPaint$default = PainterModifierKt.paint$default(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), PainterResources_androidKt.painterResource(R.drawable.bg_catch_streamer, composerStartRestartGroup, 6), false, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 54, null);
                            composerStartRestartGroup.startReplaceableGroup(-270267587);
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = new Measurer();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            final Measurer measurer = (Measurer) objRememberedValue;
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new ConstraintLayoutScope();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue2;
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue3 == companion.getEmpty()) {
                                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Pair<MeasurePolicy, Function0<Unit>> pairRememberConstraintLayoutMeasurePolicy = ConstraintLayoutKt.rememberConstraintLayoutMeasurePolicy(257, constraintLayoutScope, (MutableState<Boolean>) objRememberedValue3, measurer, composerStartRestartGroup, 4544);
                            MeasurePolicy measurePolicyComponent1 = pairRememberConstraintLayoutMeasurePolicy.component1();
                            final Function0<Unit> function0Component2 = pairRememberConstraintLayoutMeasurePolicy.component2();
                            final int i14 = i10;
                            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierPaint$default, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt$CatchStreamerBannerContent$$inlined$ConstraintLayout$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                    ToolingUtilsKt.setDesignInfoProvider(semantics, measurer);
                                }
                            }, 1, null);
                            final int i15 = 0;
                            final float f = 0.3f;
                            final Modifier modifier3 = modifier2;
                            final boolean z13 = z4;
                            final Function0<Unit> function09 = function06;
                            final boolean z14 = z8;
                            final MutableState<Boolean> mutableState3 = mutableStateMutableStateOf$default;
                            final boolean z15 = z7;
                            final Function0<Unit> function010 = function04;
                            final Function0<Unit> function011 = function05;
                            LayoutKt.MultiMeasureLayout(modifierSemantics$default, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894182, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt$CatchStreamerBannerContent$$inlined$ConstraintLayout$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @Composable
                                public final void invoke(@Nullable Composer composer2, int i16) {
                                    boolean z16;
                                    if (((i16 & 11) ^ 2) != 0 || !composer2.getSkipping()) {
                                        int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                                        constraintLayoutScope.reset();
                                        ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                                        final ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorCreateGuidelineFromStart = constraintLayoutScope2.createGuidelineFromStart(f);
                                        ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
                                        final ConstrainedLayoutReference constrainedLayoutReferenceComponent1 = constrainedLayoutReferencesCreateRefs.component1();
                                        ConstrainedLayoutReference constrainedLayoutReferenceComponent2 = constrainedLayoutReferencesCreateRefs.component2();
                                        ConstrainedLayoutReference constrainedLayoutReferenceComponent3 = constrainedLayoutReferencesCreateRefs.component3();
                                        final ConstrainedLayoutReference constrainedLayoutReferenceComponent4 = constrainedLayoutReferencesCreateRefs.component4();
                                        ConstrainedLayoutReference constrainedLayoutReferenceComponent5 = constrainedLayoutReferencesCreateRefs.component5();
                                        ConstrainedLayoutReference constrainedLayoutReferenceComponent6 = constrainedLayoutReferencesCreateRefs.component6();
                                        Modifier modifier4 = modifier3;
                                        composer2.startReplaceableGroup(1112667542);
                                        boolean zChanged = composer2.changed(fDimensionResource6) | composer2.changed(fDimensionResource7);
                                        Object objRememberedValue4 = composer2.rememberedValue();
                                        if (zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                            final float f2 = fDimensionResource6;
                                            final float f3 = fDimensionResource7;
                                            objRememberedValue4 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt$CatchStreamerBannerContent$4$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                                    invoke2(constrainScope);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                                    Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), f2, 0.0f, 4, null);
                                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), f3, 0.0f, 4, null);
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue4);
                                        }
                                        composer2.endReplaceableGroup();
                                        Modifier modifierConstrainAs = constraintLayoutScope2.constrainAs(modifier4, constrainedLayoutReferenceComponent1, (Function1) objRememberedValue4);
                                        composer2.startReplaceableGroup(-483455358);
                                        Arrangement arrangement = Arrangement.INSTANCE;
                                        Arrangement.Vertical top = arrangement.getTop();
                                        Alignment.Companion companion2 = Alignment.INSTANCE;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer2, 0);
                                        composer2.startReplaceableGroup(-1323940314);
                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierConstrainAs);
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
                                        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                        composer2.startReplaceableGroup(2058660585);
                                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                        AnnotatedString annotatedString = catchStreamerTitle;
                                        TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
                                        TextKt.m10025TextIbK3jfQ(annotatedString, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle.m14769artegraRegularItalic16brsp67j0QOw(0L, 0, 0L, 0.0f, composer2, CpioConstants.C_ISBLK, 15), composer2, 0, 0, 131070);
                                        TextKt.m10025TextIbK3jfQ(catchStreamerSubtitle, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle.m14769artegraRegularItalic16brsp67j0QOw(ColorResources_androidKt.colorResource(R.color.yellow, composer2, 6), 0, 0L, 0.0f, composer2, CpioConstants.C_ISBLK, 14), composer2, 0, 0, 131070);
                                        composer2.endReplaceableGroup();
                                        composer2.endNode();
                                        composer2.endReplaceableGroup();
                                        composer2.endReplaceableGroup();
                                        composer2.startReplaceableGroup(1112668013);
                                        if (z13) {
                                            Modifier modifierConstrainAs2 = constraintLayoutScope2.constrainAs(Modifier.INSTANCE, constrainedLayoutReferenceComponent2, new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt$CatchStreamerBannerContent$4$3
                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                                    invoke2(constrainScope);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                                    Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), C2046Dp.m13666constructorimpl(34), 0.0f, 4, null);
                                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                                                }
                                            });
                                            composer2.startReplaceableGroup(1112668313);
                                            boolean z17 = (i14 & 29360128) == 8388608;
                                            Object objRememberedValue5 = composer2.rememberedValue();
                                            if (z17 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                                final Function0 function012 = function09;
                                                objRememberedValue5 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt$CatchStreamerBannerContent$4$4$1
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
                                                        function012.invoke();
                                                    }
                                                };
                                                composer2.updateRememberedValue(objRememberedValue5);
                                            }
                                            composer2.endReplaceableGroup();
                                            z16 = R.color.yellow;
                                            CloseButtonWithGradientKt.m15071CloseButtonWithGradientRYX2cs4(modifierConstrainAs2, 0, 0L, (Function0) objRememberedValue5, composer2, 0, 6);
                                        } else {
                                            z16 = R.color.yellow;
                                        }
                                        composer2.endReplaceableGroup();
                                        Modifier modifier5 = modifier3;
                                        composer2.startReplaceableGroup(1112668483);
                                        boolean zChanged2 = composer2.changed(fDimensionResource4) | composer2.changed(constrainedLayoutReferenceComponent1) | composer2.changed(fDimensionResource5);
                                        Object objRememberedValue6 = composer2.rememberedValue();
                                        if (zChanged2 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                            final float f4 = fDimensionResource4;
                                            final float f5 = fDimensionResource5;
                                            objRememberedValue6 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt$CatchStreamerBannerContent$4$5$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                                    invoke2(constrainScope);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                                    Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), f4, 0.0f, 4, null);
                                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReferenceComponent1.getBottom(), f5, 0.0f, 4, null);
                                                    constrainAs.setHeight(Dimension.INSTANCE.getFillToConstraints());
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue6);
                                        }
                                        composer2.endReplaceableGroup();
                                        Modifier modifierConstrainAs3 = constraintLayoutScope2.constrainAs(modifier5, constrainedLayoutReferenceComponent3, (Function1) objRememberedValue6);
                                        Arrangement.Vertical bottom = arrangement.getBottom();
                                        Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                                        composer2.startReplaceableGroup(-483455358);
                                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(bottom, centerHorizontally, composer2, 54);
                                        composer2.startReplaceableGroup(-1323940314);
                                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierConstrainAs3);
                                        if (!(composer2.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer2.startReusableNode();
                                        if (composer2.getInserting()) {
                                            composer2.createNode(constructor2);
                                        } else {
                                            composer2.useNode();
                                        }
                                        Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer2);
                                        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                                        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                        if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        }
                                        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                        composer2.startReplaceableGroup(2058660585);
                                        TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.catch_streamer_cherny_russkiy_666, composer2, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14787montserratBold10spOr8ssp67j0QOw(0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, composer2, CpioConstants.C_ISBLK, 13), composer2, 0, 0, 65534);
                                        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.img_alisher, composer2, 6), (String) null, SizeKt.fillMaxHeight$default(modifier3, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFillHeight(), 0.0f, (ColorFilter) null, composer2, 24632, 104);
                                        composer2.endReplaceableGroup();
                                        composer2.endNode();
                                        composer2.endReplaceableGroup();
                                        composer2.endReplaceableGroup();
                                        Modifier modifier6 = modifier3;
                                        composer2.startReplaceableGroup(1112669490);
                                        boolean zChanged3 = composer2.changed(constrainedLayoutReferenceComponent4) | composer2.changed(fDimensionResource3);
                                        Object objRememberedValue7 = composer2.rememberedValue();
                                        if (zChanged3 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                            final float f6 = fM13666constructorimpl2;
                                            final float f7 = fDimensionResource3;
                                            objRememberedValue7 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt$CatchStreamerBannerContent$4$7$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                                    invoke2(constrainScope);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                                    Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReferenceComponent4.getTop(), f6, 0.0f, 4, null);
                                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReferenceComponent4.getBottom(), C2046Dp.m13666constructorimpl(f6 + f7), 0.0f, 4, null);
                                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReferenceComponent4.getStart(), f6, 0.0f, 4, null);
                                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainedLayoutReferenceComponent4.getEnd(), f6, 0.0f, 4, null);
                                                    Dimension.Companion companion4 = Dimension.INSTANCE;
                                                    constrainAs.setHeight(companion4.getFillToConstraints());
                                                    constrainAs.setWidth(companion4.getFillToConstraints());
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue7);
                                        }
                                        composer2.endReplaceableGroup();
                                        RectNeonCornerKt.m15097RectNeonCornerFuCtLKA(constraintLayoutScope2.constrainAs(modifier6, constrainedLayoutReferenceComponent5, (Function1) objRememberedValue7), Color.INSTANCE.m11375getTransparent0d7_KjU(), PrimitiveResources_androidKt.dimensionResource(R.dimen._1sdp, composer2, 6), ColorResources_androidKt.colorResource(R.color.yellow, composer2, 6), ComposeExtensionKt.m14409dpToPx8Feqmps(PrimitiveResources_androidKt.dimensionResource(R.dimen._19sdp, composer2, 6), composer2, 0), fDimensionResource, ComposeExtensionKt.m14409dpToPx8Feqmps(PrimitiveResources_androidKt.dimensionResource(R.dimen._14sdp, composer2, 6), composer2, 0), 0.3f, 0.0f, false, composer2, 12582960, 768);
                                        Modifier.Companion companion4 = Modifier.INSTANCE;
                                        composer2.startReplaceableGroup(1112670431);
                                        boolean zChanged4 = composer2.changed(verticalAnchorCreateGuidelineFromStart) | composer2.changed(constrainedLayoutReferenceComponent1);
                                        Object objRememberedValue8 = composer2.rememberedValue();
                                        if (zChanged4 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                            final float f8 = fM13666constructorimpl;
                                            objRememberedValue8 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt$CatchStreamerBannerContent$4$8$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                                    invoke2(constrainScope);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                                    Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), verticalAnchorCreateGuidelineFromStart, 0.0f, 0.0f, 6, null);
                                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), f8, 0.0f, 4, null);
                                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReferenceComponent1.getBottom(), 0.0f, 0.0f, 6, null);
                                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                                                    constrainAs.setWidth(Dimension.INSTANCE.getFillToConstraints());
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue8);
                                        }
                                        composer2.endReplaceableGroup();
                                        Modifier modifierConstrainAs4 = constraintLayoutScope2.constrainAs(companion4, constrainedLayoutReferenceComponent4, (Function1) objRememberedValue8);
                                        composer2.startReplaceableGroup(-483455358);
                                        MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer2, 0);
                                        composer2.startReplaceableGroup(-1323940314);
                                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                                        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierConstrainAs4);
                                        if (!(composer2.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer2.startReusableNode();
                                        if (composer2.getInserting()) {
                                            composer2.createNode(constructor3);
                                        } else {
                                            composer2.useNode();
                                        }
                                        Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composer2);
                                        Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyColumnMeasurePolicy3, companion3.getSetMeasurePolicy());
                                        Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                                        if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                            composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                            composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                        }
                                        function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                        composer2.startReplaceableGroup(2058660585);
                                        Modifier modifierM7782borderxT4_qwU = BorderKt.m7782borderxT4_qwU(IntrinsicKt.height(companion4, IntrinsicSize.Min), PrimitiveResources_androidKt.dimensionResource(R.dimen._1sdp, composer2, 6), ColorResources_androidKt.colorResource(R.color.yellow, composer2, 6), roundedCornerShapeM8392RoundedCornerShape0680j_4);
                                        long jColorResource = ColorResources_androidKt.colorResource(R.color.black_gray_blue_15, composer2, 6);
                                        RoundedCornerShape roundedCornerShape = roundedCornerShapeM8392RoundedCornerShape0680j_4;
                                        final Modifier modifier7 = modifier3;
                                        final float f9 = fDimensionResource3;
                                        final AnnotatedString annotatedString2 = catchStreamerBlockLeftText;
                                        final Map map = mapMapOf;
                                        final AnnotatedString annotatedString3 = blockCostTicketBC;
                                        final AnnotatedString annotatedString4 = catchStreamerBlockRightText;
                                        SurfaceKt.m9876SurfaceT9BRK9s(modifierM7782borderxT4_qwU, roundedCornerShape, jColorResource, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, -2129396520, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt$CatchStreamerBannerContent$4$9$1
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
                                            public final void invoke(@Nullable Composer composer3, int i17) {
                                                if ((i17 & 11) != 2 || !composer3.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-2129396520, i17, -1, "com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerContent.<anonymous>.<anonymous>.<anonymous> (CatchStreamerBannerUi.kt:291)");
                                                    }
                                                    Modifier modifierM8126paddingqDBjuR0 = PaddingKt.m8126paddingqDBjuR0(modifier7, C2046Dp.m13666constructorimpl(18), PrimitiveResources_androidKt.dimensionResource(R.dimen._7sdp, composer3, 6), C2046Dp.m13666constructorimpl(8), C2046Dp.m13666constructorimpl(C2046Dp.m13666constructorimpl(f9 / 2) + PrimitiveResources_androidKt.dimensionResource(R.dimen._5sdp, composer3, 6)));
                                                    Arrangement arrangement2 = Arrangement.INSTANCE;
                                                    Arrangement.HorizontalOrVertical spaceBetween = arrangement2.getSpaceBetween();
                                                    Modifier modifier8 = modifier7;
                                                    AnnotatedString annotatedString5 = annotatedString2;
                                                    Map<String, InlineTextContent> map2 = map;
                                                    AnnotatedString annotatedString6 = annotatedString3;
                                                    AnnotatedString annotatedString7 = annotatedString4;
                                                    composer3.startReplaceableGroup(693286680);
                                                    Alignment.Companion companion5 = Alignment.INSTANCE;
                                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, companion5.getTop(), composer3, 6);
                                                    composer3.startReplaceableGroup(-1323940314);
                                                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                                    CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                                                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                                                    Function0<ComposeUiNode> constructor4 = companion6.getConstructor();
                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM8126paddingqDBjuR0);
                                                    if (!(composer3.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer3.startReusableNode();
                                                    if (composer3.getInserting()) {
                                                        composer3.createNode(constructor4);
                                                    } else {
                                                        composer3.useNode();
                                                    }
                                                    Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composer3);
                                                    Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRowMeasurePolicy, companion6.getSetMeasurePolicy());
                                                    Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion6.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion6.getSetCompositeKeyHash();
                                                    if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                                        composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                                        composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                                    }
                                                    function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                                    composer3.startReplaceableGroup(2058660585);
                                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                    float f10 = 10;
                                                    Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(RowScope.weight$default(rowScopeInstance, modifier8, 1.0f, false, 2, null), 0.0f, 0.0f, C2046Dp.m13666constructorimpl(f10), 0.0f, 11, null);
                                                    Alignment.Horizontal centerHorizontally2 = companion5.getCenterHorizontally();
                                                    composer3.startReplaceableGroup(-483455358);
                                                    MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), centerHorizontally2, composer3, 48);
                                                    composer3.startReplaceableGroup(-1323940314);
                                                    int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                                    CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
                                                    Function0<ComposeUiNode> constructor5 = companion6.getConstructor();
                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
                                                    if (!(composer3.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer3.startReusableNode();
                                                    if (composer3.getInserting()) {
                                                        composer3.createNode(constructor5);
                                                    } else {
                                                        composer3.useNode();
                                                    }
                                                    Composer composerM10870constructorimpl5 = Updater.m10870constructorimpl(composer3);
                                                    Updater.m10877setimpl(composerM10870constructorimpl5, measurePolicyColumnMeasurePolicy4, companion6.getSetMeasurePolicy());
                                                    Updater.m10877setimpl(composerM10870constructorimpl5, currentCompositionLocalMap5, companion6.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion6.getSetCompositeKeyHash();
                                                    if (composerM10870constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                                        composerM10870constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                                        composerM10870constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                                    }
                                                    function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                                    composer3.startReplaceableGroup(2058660585);
                                                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                                    TypographyStyle typographyStyle2 = TypographyStyle.INSTANCE;
                                                    TextKt.m10025TextIbK3jfQ(annotatedString5, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, map2, null, typographyStyle2.m14839montserratMedium7brsp67j0QOw(0L, 0, 0L, 0.0f, composer3, CpioConstants.C_ISBLK, 15), composer3, 0, 0, 98302);
                                                    TextKt.m10025TextIbK3jfQ(annotatedString6, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, map2, null, typographyStyle2.m14808montserratBold9brsp67j0QOw(0L, 0, 0L, 0.0f, composer3, CpioConstants.C_ISBLK, 15), composer3, 0, 0, 98302);
                                                    composer3.endReplaceableGroup();
                                                    composer3.endNode();
                                                    composer3.endReplaceableGroup();
                                                    composer3.endReplaceableGroup();
                                                    float f11 = 1;
                                                    DividerKt.m9423Divider9IZ8Weo(SizeKt.m8177width3ABfNKs(SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), C2046Dp.m13666constructorimpl(f11)), C2046Dp.m13666constructorimpl(f11), Color.INSTANCE.m11377getWhite0d7_KjU(), composer3, 438, 0);
                                                    Modifier modifierM8127paddingqDBjuR0$default2 = PaddingKt.m8127paddingqDBjuR0$default(RowScope.weight$default(rowScopeInstance, modifier8, 1.0f, false, 2, null), C2046Dp.m13666constructorimpl(f10), 0.0f, 0.0f, 0.0f, 14, null);
                                                    Alignment.Horizontal centerHorizontally3 = companion5.getCenterHorizontally();
                                                    composer3.startReplaceableGroup(-483455358);
                                                    MeasurePolicy measurePolicyColumnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), centerHorizontally3, composer3, 48);
                                                    composer3.startReplaceableGroup(-1323940314);
                                                    int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                                    CompositionLocalMap currentCompositionLocalMap6 = composer3.getCurrentCompositionLocalMap();
                                                    Function0<ComposeUiNode> constructor6 = companion6.getConstructor();
                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default2);
                                                    if (!(composer3.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer3.startReusableNode();
                                                    if (composer3.getInserting()) {
                                                        composer3.createNode(constructor6);
                                                    } else {
                                                        composer3.useNode();
                                                    }
                                                    Composer composerM10870constructorimpl6 = Updater.m10870constructorimpl(composer3);
                                                    Updater.m10877setimpl(composerM10870constructorimpl6, measurePolicyColumnMeasurePolicy5, companion6.getSetMeasurePolicy());
                                                    Updater.m10877setimpl(composerM10870constructorimpl6, currentCompositionLocalMap6, companion6.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion6.getSetCompositeKeyHash();
                                                    if (composerM10870constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                                                        composerM10870constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                                                        composerM10870constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                                                    }
                                                    function3ModifierMaterializerOf6.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                                    composer3.startReplaceableGroup(2058660585);
                                                    TextKt.m10025TextIbK3jfQ(annotatedString7, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle2.m14839montserratMedium7brsp67j0QOw(0L, 0, 0L, 0.0f, composer3, CpioConstants.C_ISBLK, 15), composer3, 0, 0, 131070);
                                                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m8127paddingqDBjuR0$default(modifier8, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._18sdp, composer3, 6), 0.0f, 0.0f, 13, null), 0.0f, 1, null);
                                                    Arrangement.HorizontalOrVertical spaceEvenly = arrangement2.getSpaceEvenly();
                                                    Alignment.Vertical centerVertically = companion5.getCenterVertically();
                                                    composer3.startReplaceableGroup(693286680);
                                                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceEvenly, centerVertically, composer3, 54);
                                                    composer3.startReplaceableGroup(-1323940314);
                                                    int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                                    CompositionLocalMap currentCompositionLocalMap7 = composer3.getCurrentCompositionLocalMap();
                                                    Function0<ComposeUiNode> constructor7 = companion6.getConstructor();
                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                                                    if (!(composer3.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer3.startReusableNode();
                                                    if (composer3.getInserting()) {
                                                        composer3.createNode(constructor7);
                                                    } else {
                                                        composer3.useNode();
                                                    }
                                                    Composer composerM10870constructorimpl7 = Updater.m10870constructorimpl(composer3);
                                                    Updater.m10877setimpl(composerM10870constructorimpl7, measurePolicyRowMeasurePolicy2, companion6.getSetMeasurePolicy());
                                                    Updater.m10877setimpl(composerM10870constructorimpl7, currentCompositionLocalMap7, companion6.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = companion6.getSetCompositeKeyHash();
                                                    if (composerM10870constructorimpl7.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                                                        composerM10870constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                                                        composerM10870constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                                                    }
                                                    function3ModifierMaterializerOf7.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                                    composer3.startReplaceableGroup(2058660585);
                                                    TwoColorWithImageBlockKt.TwoColorWithImageBlock(null, StringResources_androidKt.stringResource(R.string.catch_streamer_capture_of_alishers_house, composer3, 6), R.drawable.ic_flag_with_swords, composer3, 384, 1);
                                                    TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.common_x, composer3, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle2.m14792montserratBold13spOr10ssp67j0QOw(0L, 0, 0L, 0.0f, composer3, CpioConstants.C_ISBLK, 15), composer3, 0, 0, 65534);
                                                    TwoColorWithImageBlockKt.TwoColorWithImageBlock(null, StringResources_androidKt.stringResource(R.string.catch_streamer_race_for_alisher, composer3, 6), R.drawable.img_car_racing_with_flags, composer3, 384, 1);
                                                    composer3.endReplaceableGroup();
                                                    composer3.endNode();
                                                    composer3.endReplaceableGroup();
                                                    composer3.endReplaceableGroup();
                                                    composer3.endReplaceableGroup();
                                                    composer3.endNode();
                                                    composer3.endReplaceableGroup();
                                                    composer3.endReplaceableGroup();
                                                    composer3.endReplaceableGroup();
                                                    composer3.endNode();
                                                    composer3.endReplaceableGroup();
                                                    composer3.endReplaceableGroup();
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer3.skipToGroupEnd();
                                            }
                                        }), composer2, 12582912, 120);
                                        Modifier modifierM8084offsetVpY3zN4$default = OffsetKt.m8084offsetVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), 0.0f, C2046Dp.m13666constructorimpl(-C2046Dp.m13666constructorimpl(fDimensionResource3 / 2)), 1, null);
                                        Arrangement.HorizontalOrVertical spaceAround = arrangement.getSpaceAround();
                                        composer2.startReplaceableGroup(693286680);
                                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceAround, companion2.getTop(), composer2, 6);
                                        composer2.startReplaceableGroup(-1323940314);
                                        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                        CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                                        Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM8084offsetVpY3zN4$default);
                                        if (!(composer2.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer2.startReusableNode();
                                        if (composer2.getInserting()) {
                                            composer2.createNode(constructor4);
                                        } else {
                                            composer2.useNode();
                                        }
                                        Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composer2);
                                        Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                        Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
                                        if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                            composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                            composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                        }
                                        function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                        composer2.startReplaceableGroup(2058660585);
                                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                        Modifier modifierM8156defaultMinSizeVpY3zN4 = SizeKt.m8156defaultMinSizeVpY3zN4(modifier3, fDimensionResource2, fDimensionResource3);
                                        String strStringResource = StringResources_androidKt.stringResource(R.string.common_participate, composer2, 6);
                                        boolean z18 = z14;
                                        composer2.startReplaceableGroup(2147231085);
                                        boolean z19 = ((((i14 & 7168) ^ 3072) > 2048 && composerStartRestartGroup.changed(mutableState3)) || (i14 & 3072) == 2048) | ((i14 & 3670016) == 1048576);
                                        Object objRememberedValue9 = composer2.rememberedValue();
                                        if (z19 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                            final MutableState mutableState4 = mutableState3;
                                            final Function0 function013 = function010;
                                            objRememberedValue9 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt$CatchStreamerBannerContent$4$9$2$1$1
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
                                                    mutableState4.setValue(Boolean.TRUE);
                                                    function013.invoke();
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue9);
                                        }
                                        composer2.endReplaceableGroup();
                                        MainButtonGradientKt.m15077MainButtonGradientlunQu3Y(modifierM8156defaultMinSizeVpY3zN4, null, strStringResource, null, 0.0f, 0, null, null, null, 0.0f, 0L, 0.0f, null, null, null, 0.0f, 0.0f, false, false, null, false, false, z18, null, (Function0) objRememberedValue9, composer2, 0, 0, (i14 >> 9) & 896, 12582906);
                                        Modifier modifierM8156defaultMinSizeVpY3zN42 = SizeKt.m8156defaultMinSizeVpY3zN4(modifier3, fDimensionResource2, fDimensionResource3);
                                        String strStringResource2 = StringResources_androidKt.stringResource(R.string.common_play, composer2, 6);
                                        boolean z20 = z15;
                                        composer2.startReplaceableGroup(2147231576);
                                        boolean z21 = (i14 & 234881024) == 67108864;
                                        Object objRememberedValue10 = composer2.rememberedValue();
                                        if (z21 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                            final Function0 function014 = function011;
                                            objRememberedValue10 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt$CatchStreamerBannerContent$4$9$2$2$1
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
                                                    function014.invoke();
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue10);
                                        }
                                        composer2.endReplaceableGroup();
                                        MainButtonGradientKt.m15077MainButtonGradientlunQu3Y(modifierM8156defaultMinSizeVpY3zN42, null, strStringResource2, null, 0.0f, 0, null, null, null, 0.0f, 0L, 0.0f, null, null, null, 0.0f, 0.0f, false, false, null, z20, false, false, null, (Function0) objRememberedValue10, composer2, 0, 0, (i14 >> 12) & 14, 15728634);
                                        composer2.endReplaceableGroup();
                                        composer2.endNode();
                                        composer2.endReplaceableGroup();
                                        composer2.endReplaceableGroup();
                                        composer2.endReplaceableGroup();
                                        composer2.endNode();
                                        composer2.endReplaceableGroup();
                                        composer2.endReplaceableGroup();
                                        TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.catch_streamer_note, composer2, 6), constraintLayoutScope2.constrainAs(PaddingKt.m8127paddingqDBjuR0$default(modifier3, PrimitiveResources_androidKt.dimensionResource(R.dimen._40sdp, composer2, 6), 0.0f, 0.0f, 0.0f, 14, null), constrainedLayoutReferenceComponent6, new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt$CatchStreamerBannerContent$4$10
                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                                invoke2(constrainScope);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                                Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                                            }
                                        }), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14838montserratMedium6brsp67j0QOw(0L, 0, 0L, 0.0f, composer2, CpioConstants.C_ISBLK, 15), composer2, 0, 0, 65532);
                                        if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                                            function0Component2.invoke();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            }), measurePolicyComponent1, composerStartRestartGroup, 48, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z9 = z8;
                            z10 = z4;
                            function07 = function06;
                            z11 = z7;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            function04 = function0;
                            z10 = z4;
                            mutableStateMutableStateOf$default = mutableState2;
                            z11 = z5;
                            z9 = z6;
                            function07 = function02;
                            function05 = function03;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final Modifier modifier4 = modifier2;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt.CatchStreamerBannerContent.5
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer2, int i16) {
                                    CatchStreamerBannerUiKt.CatchStreamerBannerContent(modifier4, catchStreamerUiState, z10, mutableStateMutableStateOf$default, z11, z9, function04, function07, function05, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                    z6 = z3;
                    i7 = i2 & 64;
                    if (i7 != 0) {
                    }
                    i8 = i2 & 128;
                    if (i8 != 0) {
                    }
                    i9 = i2 & 256;
                    if (i9 != 0) {
                    }
                    if ((i3 & 191739611) != 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i11 == 0) {
                            }
                            if (i4 != 0) {
                            }
                            if ((i2 & 8) == 0) {
                            }
                            if (i5 != 0) {
                            }
                            if (i6 != 0) {
                            }
                            if (i7 == 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (i9 == 0) {
                            }
                            z7 = z5;
                            i10 = i3;
                            function06 = function08;
                            z8 = z6;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            final float fDimensionResource8 = PrimitiveResources_androidKt.dimensionResource(R.dimen._8sdp, composerStartRestartGroup, 6);
                            final RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(fDimensionResource8);
                            final float fDimensionResource22 = PrimitiveResources_androidKt.dimensionResource(R.dimen._154brdp, composerStartRestartGroup, 6);
                            final float fDimensionResource32 = PrimitiveResources_androidKt.dimensionResource(R.dimen._32brdp, composerStartRestartGroup, 6);
                            final float fDimensionResource42 = PrimitiveResources_androidKt.dimensionResource(R.dimen.catch_streamer_start_block_person, composerStartRestartGroup, 6);
                            final float fDimensionResource52 = PrimitiveResources_androidKt.dimensionResource(R.dimen._8sdp, composerStartRestartGroup, 6);
                            final float fDimensionResource62 = PrimitiveResources_androidKt.dimensionResource(R.dimen._14sdp, composerStartRestartGroup, 6);
                            final float fDimensionResource72 = PrimitiveResources_androidKt.dimensionResource(R.dimen._38sdp, composerStartRestartGroup, 6);
                            final float fM13666constructorimpl3 = C2046Dp.m13666constructorimpl(24);
                            final float fM13666constructorimpl22 = C2046Dp.m13666constructorimpl(-10);
                            StringResourceCompose stringResourceCompose2 = StringResourceCompose.INSTANCE;
                            final AnnotatedString catchStreamerTitle2 = stringResourceCompose2.getCatchStreamerTitle(composerStartRestartGroup, 6);
                            final AnnotatedString catchStreamerSubtitle2 = stringResourceCompose2.getCatchStreamerSubtitle(composerStartRestartGroup, 6);
                            final AnnotatedString catchStreamerBlockLeftText2 = stringResourceCompose2.getCatchStreamerBlockLeftText(composerStartRestartGroup, 6);
                            final AnnotatedString catchStreamerBlockRightText2 = stringResourceCompose2.getCatchStreamerBlockRightText(composerStartRestartGroup, 6);
                            final AnnotatedString blockCostTicketBC2 = stringResourceCompose2.getBlockCostTicketBC(0, catchStreamerUiState.getCurrentCost(), composerStartRestartGroup, 384, 1);
                            final Map mapMapOf2 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m7112to(StringResourceCompose.CATCH_STREAMER_TICKET_TAG, new InlineTextContent(new Placeholder(TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._16brsp, composerStartRestartGroup, 6)), TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._16brsp, composerStartRestartGroup, 6)), PlaceholderVerticalAlign.INSTANCE.m13099getTextBottomJ6kI3mc(), null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1047693012, true, new Function3<String, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt$CatchStreamerBannerContent$inlineContentTicket$1
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(String str, Composer composer2, Integer num) {
                                    invoke(str, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@NotNull String it, @Nullable Composer composer2, int i142) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    if ((i142 & 81) != 16 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1047693012, i142, -1, "com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerContent.<anonymous> (CatchStreamerBannerUi.kt:176)");
                                        }
                                        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_ticket, composer2, 6), (String) null, SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            }))));
                            Modifier modifierPaint$default2 = PainterModifierKt.paint$default(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), PainterResources_androidKt.painterResource(R.drawable.bg_catch_streamer, composerStartRestartGroup, 6), false, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 54, null);
                            composerStartRestartGroup.startReplaceableGroup(-270267587);
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            final Measurer measurer2 = (Measurer) objRememberedValue;
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == companion.getEmpty()) {
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            final ConstraintLayoutScope constraintLayoutScope2 = (ConstraintLayoutScope) objRememberedValue2;
                            composerStartRestartGroup.startReplaceableGroup(-3687241);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue3 == companion.getEmpty()) {
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Pair<MeasurePolicy, Function0<Unit>> pairRememberConstraintLayoutMeasurePolicy2 = ConstraintLayoutKt.rememberConstraintLayoutMeasurePolicy(257, constraintLayoutScope2, (MutableState<Boolean>) objRememberedValue3, measurer2, composerStartRestartGroup, 4544);
                            MeasurePolicy measurePolicyComponent12 = pairRememberConstraintLayoutMeasurePolicy2.component1();
                            final Function0 function0Component22 = pairRememberConstraintLayoutMeasurePolicy2.component2();
                            final int i142 = i10;
                            Modifier modifierSemantics$default2 = SemanticsModifierKt.semantics$default(modifierPaint$default2, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt$CatchStreamerBannerContent$$inlined$ConstraintLayout$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                    ToolingUtilsKt.setDesignInfoProvider(semantics, measurer2);
                                }
                            }, 1, null);
                            final int i152 = 0;
                            final float f2 = 0.3f;
                            final Modifier modifier32 = modifier2;
                            final boolean z132 = z4;
                            final Function0 function092 = function06;
                            final boolean z142 = z8;
                            final MutableState mutableState32 = mutableStateMutableStateOf$default;
                            final boolean z152 = z7;
                            final Function0 function0102 = function04;
                            final Function0 function0112 = function05;
                            LayoutKt.MultiMeasureLayout(modifierSemantics$default2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894182, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt$CatchStreamerBannerContent$$inlined$ConstraintLayout$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @Composable
                                public final void invoke(@Nullable Composer composer2, int i16) {
                                    boolean z16;
                                    if (((i16 & 11) ^ 2) != 0 || !composer2.getSkipping()) {
                                        int helpersHashCode = constraintLayoutScope2.getHelpersHashCode();
                                        constraintLayoutScope2.reset();
                                        ConstraintLayoutScope constraintLayoutScope22 = constraintLayoutScope2;
                                        final ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorCreateGuidelineFromStart = constraintLayoutScope22.createGuidelineFromStart(f2);
                                        ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope22.createRefs();
                                        final ConstrainedLayoutReference constrainedLayoutReferenceComponent1 = constrainedLayoutReferencesCreateRefs.component1();
                                        ConstrainedLayoutReference constrainedLayoutReferenceComponent2 = constrainedLayoutReferencesCreateRefs.component2();
                                        ConstrainedLayoutReference constrainedLayoutReferenceComponent3 = constrainedLayoutReferencesCreateRefs.component3();
                                        final ConstrainedLayoutReference constrainedLayoutReferenceComponent4 = constrainedLayoutReferencesCreateRefs.component4();
                                        ConstrainedLayoutReference constrainedLayoutReferenceComponent5 = constrainedLayoutReferencesCreateRefs.component5();
                                        ConstrainedLayoutReference constrainedLayoutReferenceComponent6 = constrainedLayoutReferencesCreateRefs.component6();
                                        Modifier modifier42 = modifier32;
                                        composer2.startReplaceableGroup(1112667542);
                                        boolean zChanged = composer2.changed(fDimensionResource62) | composer2.changed(fDimensionResource72);
                                        Object objRememberedValue4 = composer2.rememberedValue();
                                        if (zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                            final float f22 = fDimensionResource62;
                                            final float f3 = fDimensionResource72;
                                            objRememberedValue4 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt$CatchStreamerBannerContent$4$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                                    invoke2(constrainScope);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                                    Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), f22, 0.0f, 4, null);
                                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), f3, 0.0f, 4, null);
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue4);
                                        }
                                        composer2.endReplaceableGroup();
                                        Modifier modifierConstrainAs = constraintLayoutScope22.constrainAs(modifier42, constrainedLayoutReferenceComponent1, (Function1) objRememberedValue4);
                                        composer2.startReplaceableGroup(-483455358);
                                        Arrangement arrangement = Arrangement.INSTANCE;
                                        Arrangement.Vertical top = arrangement.getTop();
                                        Alignment.Companion companion2 = Alignment.INSTANCE;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer2, 0);
                                        composer2.startReplaceableGroup(-1323940314);
                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierConstrainAs);
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
                                        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                        composer2.startReplaceableGroup(2058660585);
                                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                        AnnotatedString annotatedString = catchStreamerTitle2;
                                        TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
                                        TextKt.m10025TextIbK3jfQ(annotatedString, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle.m14769artegraRegularItalic16brsp67j0QOw(0L, 0, 0L, 0.0f, composer2, CpioConstants.C_ISBLK, 15), composer2, 0, 0, 131070);
                                        TextKt.m10025TextIbK3jfQ(catchStreamerSubtitle2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle.m14769artegraRegularItalic16brsp67j0QOw(ColorResources_androidKt.colorResource(R.color.yellow, composer2, 6), 0, 0L, 0.0f, composer2, CpioConstants.C_ISBLK, 14), composer2, 0, 0, 131070);
                                        composer2.endReplaceableGroup();
                                        composer2.endNode();
                                        composer2.endReplaceableGroup();
                                        composer2.endReplaceableGroup();
                                        composer2.startReplaceableGroup(1112668013);
                                        if (z132) {
                                            Modifier modifierConstrainAs2 = constraintLayoutScope22.constrainAs(Modifier.INSTANCE, constrainedLayoutReferenceComponent2, new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt$CatchStreamerBannerContent$4$3
                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                                    invoke2(constrainScope);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                                    Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), C2046Dp.m13666constructorimpl(34), 0.0f, 4, null);
                                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                                                }
                                            });
                                            composer2.startReplaceableGroup(1112668313);
                                            boolean z17 = (i142 & 29360128) == 8388608;
                                            Object objRememberedValue5 = composer2.rememberedValue();
                                            if (z17 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                                final Function0<Unit> function012 = function092;
                                                objRememberedValue5 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt$CatchStreamerBannerContent$4$4$1
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
                                                        function012.invoke();
                                                    }
                                                };
                                                composer2.updateRememberedValue(objRememberedValue5);
                                            }
                                            composer2.endReplaceableGroup();
                                            z16 = R.color.yellow;
                                            CloseButtonWithGradientKt.m15071CloseButtonWithGradientRYX2cs4(modifierConstrainAs2, 0, 0L, (Function0) objRememberedValue5, composer2, 0, 6);
                                        } else {
                                            z16 = R.color.yellow;
                                        }
                                        composer2.endReplaceableGroup();
                                        Modifier modifier5 = modifier32;
                                        composer2.startReplaceableGroup(1112668483);
                                        boolean zChanged2 = composer2.changed(fDimensionResource42) | composer2.changed(constrainedLayoutReferenceComponent1) | composer2.changed(fDimensionResource52);
                                        Object objRememberedValue6 = composer2.rememberedValue();
                                        if (zChanged2 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                            final float f4 = fDimensionResource42;
                                            final float f5 = fDimensionResource52;
                                            objRememberedValue6 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt$CatchStreamerBannerContent$4$5$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                                    invoke2(constrainScope);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                                    Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), f4, 0.0f, 4, null);
                                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReferenceComponent1.getBottom(), f5, 0.0f, 4, null);
                                                    constrainAs.setHeight(Dimension.INSTANCE.getFillToConstraints());
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue6);
                                        }
                                        composer2.endReplaceableGroup();
                                        Modifier modifierConstrainAs3 = constraintLayoutScope22.constrainAs(modifier5, constrainedLayoutReferenceComponent3, (Function1) objRememberedValue6);
                                        Arrangement.Vertical bottom = arrangement.getBottom();
                                        Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                                        composer2.startReplaceableGroup(-483455358);
                                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(bottom, centerHorizontally, composer2, 54);
                                        composer2.startReplaceableGroup(-1323940314);
                                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierConstrainAs3);
                                        if (!(composer2.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer2.startReusableNode();
                                        if (composer2.getInserting()) {
                                            composer2.createNode(constructor2);
                                        } else {
                                            composer2.useNode();
                                        }
                                        Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer2);
                                        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                                        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                        if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        }
                                        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                        composer2.startReplaceableGroup(2058660585);
                                        TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.catch_streamer_cherny_russkiy_666, composer2, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14787montserratBold10spOr8ssp67j0QOw(0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, composer2, CpioConstants.C_ISBLK, 13), composer2, 0, 0, 65534);
                                        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.img_alisher, composer2, 6), (String) null, SizeKt.fillMaxHeight$default(modifier32, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFillHeight(), 0.0f, (ColorFilter) null, composer2, 24632, 104);
                                        composer2.endReplaceableGroup();
                                        composer2.endNode();
                                        composer2.endReplaceableGroup();
                                        composer2.endReplaceableGroup();
                                        Modifier modifier6 = modifier32;
                                        composer2.startReplaceableGroup(1112669490);
                                        boolean zChanged3 = composer2.changed(constrainedLayoutReferenceComponent4) | composer2.changed(fDimensionResource32);
                                        Object objRememberedValue7 = composer2.rememberedValue();
                                        if (zChanged3 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                            final float f6 = fM13666constructorimpl22;
                                            final float f7 = fDimensionResource32;
                                            objRememberedValue7 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt$CatchStreamerBannerContent$4$7$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                                    invoke2(constrainScope);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                                    Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReferenceComponent4.getTop(), f6, 0.0f, 4, null);
                                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReferenceComponent4.getBottom(), C2046Dp.m13666constructorimpl(f6 + f7), 0.0f, 4, null);
                                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReferenceComponent4.getStart(), f6, 0.0f, 4, null);
                                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainedLayoutReferenceComponent4.getEnd(), f6, 0.0f, 4, null);
                                                    Dimension.Companion companion4 = Dimension.INSTANCE;
                                                    constrainAs.setHeight(companion4.getFillToConstraints());
                                                    constrainAs.setWidth(companion4.getFillToConstraints());
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue7);
                                        }
                                        composer2.endReplaceableGroup();
                                        RectNeonCornerKt.m15097RectNeonCornerFuCtLKA(constraintLayoutScope22.constrainAs(modifier6, constrainedLayoutReferenceComponent5, (Function1) objRememberedValue7), Color.INSTANCE.m11375getTransparent0d7_KjU(), PrimitiveResources_androidKt.dimensionResource(R.dimen._1sdp, composer2, 6), ColorResources_androidKt.colorResource(R.color.yellow, composer2, 6), ComposeExtensionKt.m14409dpToPx8Feqmps(PrimitiveResources_androidKt.dimensionResource(R.dimen._19sdp, composer2, 6), composer2, 0), fDimensionResource8, ComposeExtensionKt.m14409dpToPx8Feqmps(PrimitiveResources_androidKt.dimensionResource(R.dimen._14sdp, composer2, 6), composer2, 0), 0.3f, 0.0f, false, composer2, 12582960, 768);
                                        Modifier.Companion companion4 = Modifier.INSTANCE;
                                        composer2.startReplaceableGroup(1112670431);
                                        boolean zChanged4 = composer2.changed(verticalAnchorCreateGuidelineFromStart) | composer2.changed(constrainedLayoutReferenceComponent1);
                                        Object objRememberedValue8 = composer2.rememberedValue();
                                        if (zChanged4 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                            final float f8 = fM13666constructorimpl3;
                                            objRememberedValue8 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt$CatchStreamerBannerContent$4$8$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                                    invoke2(constrainScope);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                                    Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), verticalAnchorCreateGuidelineFromStart, 0.0f, 0.0f, 6, null);
                                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), f8, 0.0f, 4, null);
                                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReferenceComponent1.getBottom(), 0.0f, 0.0f, 6, null);
                                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                                                    constrainAs.setWidth(Dimension.INSTANCE.getFillToConstraints());
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue8);
                                        }
                                        composer2.endReplaceableGroup();
                                        Modifier modifierConstrainAs4 = constraintLayoutScope22.constrainAs(companion4, constrainedLayoutReferenceComponent4, (Function1) objRememberedValue8);
                                        composer2.startReplaceableGroup(-483455358);
                                        MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer2, 0);
                                        composer2.startReplaceableGroup(-1323940314);
                                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                                        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierConstrainAs4);
                                        if (!(composer2.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer2.startReusableNode();
                                        if (composer2.getInserting()) {
                                            composer2.createNode(constructor3);
                                        } else {
                                            composer2.useNode();
                                        }
                                        Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composer2);
                                        Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyColumnMeasurePolicy3, companion3.getSetMeasurePolicy());
                                        Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                                        if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                            composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                            composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                        }
                                        function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                        composer2.startReplaceableGroup(2058660585);
                                        Modifier modifierM7782borderxT4_qwU = BorderKt.m7782borderxT4_qwU(IntrinsicKt.height(companion4, IntrinsicSize.Min), PrimitiveResources_androidKt.dimensionResource(R.dimen._1sdp, composer2, 6), ColorResources_androidKt.colorResource(R.color.yellow, composer2, 6), roundedCornerShapeM8392RoundedCornerShape0680j_42);
                                        long jColorResource = ColorResources_androidKt.colorResource(R.color.black_gray_blue_15, composer2, 6);
                                        RoundedCornerShape roundedCornerShape = roundedCornerShapeM8392RoundedCornerShape0680j_42;
                                        final Modifier modifier7 = modifier32;
                                        final float f9 = fDimensionResource32;
                                        final AnnotatedString annotatedString2 = catchStreamerBlockLeftText2;
                                        final Map<String, InlineTextContent> map = mapMapOf2;
                                        final AnnotatedString annotatedString3 = blockCostTicketBC2;
                                        final AnnotatedString annotatedString4 = catchStreamerBlockRightText2;
                                        SurfaceKt.m9876SurfaceT9BRK9s(modifierM7782borderxT4_qwU, roundedCornerShape, jColorResource, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, -2129396520, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt$CatchStreamerBannerContent$4$9$1
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
                                            public final void invoke(@Nullable Composer composer3, int i17) {
                                                if ((i17 & 11) != 2 || !composer3.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-2129396520, i17, -1, "com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerContent.<anonymous>.<anonymous>.<anonymous> (CatchStreamerBannerUi.kt:291)");
                                                    }
                                                    Modifier modifierM8126paddingqDBjuR0 = PaddingKt.m8126paddingqDBjuR0(modifier7, C2046Dp.m13666constructorimpl(18), PrimitiveResources_androidKt.dimensionResource(R.dimen._7sdp, composer3, 6), C2046Dp.m13666constructorimpl(8), C2046Dp.m13666constructorimpl(C2046Dp.m13666constructorimpl(f9 / 2) + PrimitiveResources_androidKt.dimensionResource(R.dimen._5sdp, composer3, 6)));
                                                    Arrangement arrangement2 = Arrangement.INSTANCE;
                                                    Arrangement.HorizontalOrVertical spaceBetween = arrangement2.getSpaceBetween();
                                                    Modifier modifier8 = modifier7;
                                                    AnnotatedString annotatedString5 = annotatedString2;
                                                    Map<String, InlineTextContent> map2 = map;
                                                    AnnotatedString annotatedString6 = annotatedString3;
                                                    AnnotatedString annotatedString7 = annotatedString4;
                                                    composer3.startReplaceableGroup(693286680);
                                                    Alignment.Companion companion5 = Alignment.INSTANCE;
                                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, companion5.getTop(), composer3, 6);
                                                    composer3.startReplaceableGroup(-1323940314);
                                                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                                    CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                                                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                                                    Function0<ComposeUiNode> constructor4 = companion6.getConstructor();
                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM8126paddingqDBjuR0);
                                                    if (!(composer3.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer3.startReusableNode();
                                                    if (composer3.getInserting()) {
                                                        composer3.createNode(constructor4);
                                                    } else {
                                                        composer3.useNode();
                                                    }
                                                    Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composer3);
                                                    Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRowMeasurePolicy, companion6.getSetMeasurePolicy());
                                                    Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion6.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion6.getSetCompositeKeyHash();
                                                    if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                                        composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                                        composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                                    }
                                                    function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                                    composer3.startReplaceableGroup(2058660585);
                                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                    float f10 = 10;
                                                    Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(RowScope.weight$default(rowScopeInstance, modifier8, 1.0f, false, 2, null), 0.0f, 0.0f, C2046Dp.m13666constructorimpl(f10), 0.0f, 11, null);
                                                    Alignment.Horizontal centerHorizontally2 = companion5.getCenterHorizontally();
                                                    composer3.startReplaceableGroup(-483455358);
                                                    MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), centerHorizontally2, composer3, 48);
                                                    composer3.startReplaceableGroup(-1323940314);
                                                    int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                                    CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
                                                    Function0<ComposeUiNode> constructor5 = companion6.getConstructor();
                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
                                                    if (!(composer3.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer3.startReusableNode();
                                                    if (composer3.getInserting()) {
                                                        composer3.createNode(constructor5);
                                                    } else {
                                                        composer3.useNode();
                                                    }
                                                    Composer composerM10870constructorimpl5 = Updater.m10870constructorimpl(composer3);
                                                    Updater.m10877setimpl(composerM10870constructorimpl5, measurePolicyColumnMeasurePolicy4, companion6.getSetMeasurePolicy());
                                                    Updater.m10877setimpl(composerM10870constructorimpl5, currentCompositionLocalMap5, companion6.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion6.getSetCompositeKeyHash();
                                                    if (composerM10870constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                                        composerM10870constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                                        composerM10870constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                                    }
                                                    function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                                    composer3.startReplaceableGroup(2058660585);
                                                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                                    TypographyStyle typographyStyle2 = TypographyStyle.INSTANCE;
                                                    TextKt.m10025TextIbK3jfQ(annotatedString5, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, map2, null, typographyStyle2.m14839montserratMedium7brsp67j0QOw(0L, 0, 0L, 0.0f, composer3, CpioConstants.C_ISBLK, 15), composer3, 0, 0, 98302);
                                                    TextKt.m10025TextIbK3jfQ(annotatedString6, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, map2, null, typographyStyle2.m14808montserratBold9brsp67j0QOw(0L, 0, 0L, 0.0f, composer3, CpioConstants.C_ISBLK, 15), composer3, 0, 0, 98302);
                                                    composer3.endReplaceableGroup();
                                                    composer3.endNode();
                                                    composer3.endReplaceableGroup();
                                                    composer3.endReplaceableGroup();
                                                    float f11 = 1;
                                                    DividerKt.m9423Divider9IZ8Weo(SizeKt.m8177width3ABfNKs(SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), C2046Dp.m13666constructorimpl(f11)), C2046Dp.m13666constructorimpl(f11), Color.INSTANCE.m11377getWhite0d7_KjU(), composer3, 438, 0);
                                                    Modifier modifierM8127paddingqDBjuR0$default2 = PaddingKt.m8127paddingqDBjuR0$default(RowScope.weight$default(rowScopeInstance, modifier8, 1.0f, false, 2, null), C2046Dp.m13666constructorimpl(f10), 0.0f, 0.0f, 0.0f, 14, null);
                                                    Alignment.Horizontal centerHorizontally3 = companion5.getCenterHorizontally();
                                                    composer3.startReplaceableGroup(-483455358);
                                                    MeasurePolicy measurePolicyColumnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), centerHorizontally3, composer3, 48);
                                                    composer3.startReplaceableGroup(-1323940314);
                                                    int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                                    CompositionLocalMap currentCompositionLocalMap6 = composer3.getCurrentCompositionLocalMap();
                                                    Function0<ComposeUiNode> constructor6 = companion6.getConstructor();
                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default2);
                                                    if (!(composer3.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer3.startReusableNode();
                                                    if (composer3.getInserting()) {
                                                        composer3.createNode(constructor6);
                                                    } else {
                                                        composer3.useNode();
                                                    }
                                                    Composer composerM10870constructorimpl6 = Updater.m10870constructorimpl(composer3);
                                                    Updater.m10877setimpl(composerM10870constructorimpl6, measurePolicyColumnMeasurePolicy5, companion6.getSetMeasurePolicy());
                                                    Updater.m10877setimpl(composerM10870constructorimpl6, currentCompositionLocalMap6, companion6.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion6.getSetCompositeKeyHash();
                                                    if (composerM10870constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                                                        composerM10870constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                                                        composerM10870constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                                                    }
                                                    function3ModifierMaterializerOf6.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                                    composer3.startReplaceableGroup(2058660585);
                                                    TextKt.m10025TextIbK3jfQ(annotatedString7, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle2.m14839montserratMedium7brsp67j0QOw(0L, 0, 0L, 0.0f, composer3, CpioConstants.C_ISBLK, 15), composer3, 0, 0, 131070);
                                                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m8127paddingqDBjuR0$default(modifier8, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._18sdp, composer3, 6), 0.0f, 0.0f, 13, null), 0.0f, 1, null);
                                                    Arrangement.HorizontalOrVertical spaceEvenly = arrangement2.getSpaceEvenly();
                                                    Alignment.Vertical centerVertically = companion5.getCenterVertically();
                                                    composer3.startReplaceableGroup(693286680);
                                                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceEvenly, centerVertically, composer3, 54);
                                                    composer3.startReplaceableGroup(-1323940314);
                                                    int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                                    CompositionLocalMap currentCompositionLocalMap7 = composer3.getCurrentCompositionLocalMap();
                                                    Function0<ComposeUiNode> constructor7 = companion6.getConstructor();
                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                                                    if (!(composer3.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer3.startReusableNode();
                                                    if (composer3.getInserting()) {
                                                        composer3.createNode(constructor7);
                                                    } else {
                                                        composer3.useNode();
                                                    }
                                                    Composer composerM10870constructorimpl7 = Updater.m10870constructorimpl(composer3);
                                                    Updater.m10877setimpl(composerM10870constructorimpl7, measurePolicyRowMeasurePolicy2, companion6.getSetMeasurePolicy());
                                                    Updater.m10877setimpl(composerM10870constructorimpl7, currentCompositionLocalMap7, companion6.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = companion6.getSetCompositeKeyHash();
                                                    if (composerM10870constructorimpl7.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                                                        composerM10870constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                                                        composerM10870constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                                                    }
                                                    function3ModifierMaterializerOf7.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                                    composer3.startReplaceableGroup(2058660585);
                                                    TwoColorWithImageBlockKt.TwoColorWithImageBlock(null, StringResources_androidKt.stringResource(R.string.catch_streamer_capture_of_alishers_house, composer3, 6), R.drawable.ic_flag_with_swords, composer3, 384, 1);
                                                    TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.common_x, composer3, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle2.m14792montserratBold13spOr10ssp67j0QOw(0L, 0, 0L, 0.0f, composer3, CpioConstants.C_ISBLK, 15), composer3, 0, 0, 65534);
                                                    TwoColorWithImageBlockKt.TwoColorWithImageBlock(null, StringResources_androidKt.stringResource(R.string.catch_streamer_race_for_alisher, composer3, 6), R.drawable.img_car_racing_with_flags, composer3, 384, 1);
                                                    composer3.endReplaceableGroup();
                                                    composer3.endNode();
                                                    composer3.endReplaceableGroup();
                                                    composer3.endReplaceableGroup();
                                                    composer3.endReplaceableGroup();
                                                    composer3.endNode();
                                                    composer3.endReplaceableGroup();
                                                    composer3.endReplaceableGroup();
                                                    composer3.endReplaceableGroup();
                                                    composer3.endNode();
                                                    composer3.endReplaceableGroup();
                                                    composer3.endReplaceableGroup();
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer3.skipToGroupEnd();
                                            }
                                        }), composer2, 12582912, 120);
                                        Modifier modifierM8084offsetVpY3zN4$default = OffsetKt.m8084offsetVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier32, 0.0f, 1, null), 0.0f, C2046Dp.m13666constructorimpl(-C2046Dp.m13666constructorimpl(fDimensionResource32 / 2)), 1, null);
                                        Arrangement.HorizontalOrVertical spaceAround = arrangement.getSpaceAround();
                                        composer2.startReplaceableGroup(693286680);
                                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceAround, companion2.getTop(), composer2, 6);
                                        composer2.startReplaceableGroup(-1323940314);
                                        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                        CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                                        Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM8084offsetVpY3zN4$default);
                                        if (!(composer2.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer2.startReusableNode();
                                        if (composer2.getInserting()) {
                                            composer2.createNode(constructor4);
                                        } else {
                                            composer2.useNode();
                                        }
                                        Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composer2);
                                        Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                        Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
                                        if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                            composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                            composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                        }
                                        function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                        composer2.startReplaceableGroup(2058660585);
                                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                        Modifier modifierM8156defaultMinSizeVpY3zN4 = SizeKt.m8156defaultMinSizeVpY3zN4(modifier32, fDimensionResource22, fDimensionResource32);
                                        String strStringResource = StringResources_androidKt.stringResource(R.string.common_participate, composer2, 6);
                                        boolean z18 = z142;
                                        composer2.startReplaceableGroup(2147231085);
                                        boolean z19 = ((((i142 & 7168) ^ 3072) > 2048 && composerStartRestartGroup.changed(mutableState32)) || (i142 & 3072) == 2048) | ((i142 & 3670016) == 1048576);
                                        Object objRememberedValue9 = composer2.rememberedValue();
                                        if (z19 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                            final MutableState<Boolean> mutableState4 = mutableState32;
                                            final Function0<Unit> function013 = function0102;
                                            objRememberedValue9 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt$CatchStreamerBannerContent$4$9$2$1$1
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
                                                    mutableState4.setValue(Boolean.TRUE);
                                                    function013.invoke();
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue9);
                                        }
                                        composer2.endReplaceableGroup();
                                        MainButtonGradientKt.m15077MainButtonGradientlunQu3Y(modifierM8156defaultMinSizeVpY3zN4, null, strStringResource, null, 0.0f, 0, null, null, null, 0.0f, 0L, 0.0f, null, null, null, 0.0f, 0.0f, false, false, null, false, false, z18, null, (Function0) objRememberedValue9, composer2, 0, 0, (i142 >> 9) & 896, 12582906);
                                        Modifier modifierM8156defaultMinSizeVpY3zN42 = SizeKt.m8156defaultMinSizeVpY3zN4(modifier32, fDimensionResource22, fDimensionResource32);
                                        String strStringResource2 = StringResources_androidKt.stringResource(R.string.common_play, composer2, 6);
                                        boolean z20 = z152;
                                        composer2.startReplaceableGroup(2147231576);
                                        boolean z21 = (i142 & 234881024) == 67108864;
                                        Object objRememberedValue10 = composer2.rememberedValue();
                                        if (z21 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                            final Function0<Unit> function014 = function0112;
                                            objRememberedValue10 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt$CatchStreamerBannerContent$4$9$2$2$1
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
                                                    function014.invoke();
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue10);
                                        }
                                        composer2.endReplaceableGroup();
                                        MainButtonGradientKt.m15077MainButtonGradientlunQu3Y(modifierM8156defaultMinSizeVpY3zN42, null, strStringResource2, null, 0.0f, 0, null, null, null, 0.0f, 0L, 0.0f, null, null, null, 0.0f, 0.0f, false, false, null, z20, false, false, null, (Function0) objRememberedValue10, composer2, 0, 0, (i142 >> 12) & 14, 15728634);
                                        composer2.endReplaceableGroup();
                                        composer2.endNode();
                                        composer2.endReplaceableGroup();
                                        composer2.endReplaceableGroup();
                                        composer2.endReplaceableGroup();
                                        composer2.endNode();
                                        composer2.endReplaceableGroup();
                                        composer2.endReplaceableGroup();
                                        TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.catch_streamer_note, composer2, 6), constraintLayoutScope22.constrainAs(PaddingKt.m8127paddingqDBjuR0$default(modifier32, PrimitiveResources_androidKt.dimensionResource(R.dimen._40sdp, composer2, 6), 0.0f, 0.0f, 0.0f, 14, null), constrainedLayoutReferenceComponent6, new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt$CatchStreamerBannerContent$4$10
                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                                invoke2(constrainScope);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                                Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                                            }
                                        }), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14838montserratMedium6brsp67j0QOw(0L, 0, 0L, 0.0f, composer2, CpioConstants.C_ISBLK, 15), composer2, 0, 0, 65532);
                                        if (constraintLayoutScope2.getHelpersHashCode() != helpersHashCode) {
                                            function0Component22.invoke();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            }), measurePolicyComponent12, composerStartRestartGroup, 48, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            z9 = z8;
                            z10 = z4;
                            function07 = function06;
                            z11 = z7;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                z5 = z2;
                i6 = i2 & 32;
                if (i6 != 0) {
                }
                z6 = z3;
                i7 = i2 & 64;
                if (i7 != 0) {
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                }
                i9 = i2 & 256;
                if (i9 != 0) {
                }
                if ((i3 & 191739611) != 38347922) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z4 = z;
            if ((i & 7168) == 0) {
            }
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            z5 = z2;
            i6 = i2 & 32;
            if (i6 != 0) {
            }
            z6 = z3;
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            i8 = i2 & 128;
            if (i8 != 0) {
            }
            i9 = i2 & 256;
            if (i9 != 0) {
            }
            if ((i3 & 191739611) != 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z4 = z;
        if ((i & 7168) == 0) {
        }
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        z5 = z2;
        i6 = i2 & 32;
        if (i6 != 0) {
        }
        z6 = z3;
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        i8 = i2 & 128;
        if (i8 != 0) {
        }
        i9 = i2 & 256;
        if (i9 != 0) {
        }
        if ((i3 & 191739611) != 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(apiLevel = 28, device = "spec:id=reference_phone,shape=Normal,width=360,height=240,unit=dp,dpi=420")
    public static final void PreviewPhone(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1002392700);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1002392700, i, -1, "com.blackhub.bronline.game.ui.catchstreamer.PreviewPhone (CatchStreamerBannerUi.kt:412)");
            }
            CatchStreamerBannerContent(Modifier.INSTANCE, new CatchStreamerUiState(0, 0, 0, 0, 0, 0, 0, false, false, false, 1023, null), false, null, false, false, null, null, null, composerStartRestartGroup, 6, 508);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt.PreviewPhone.1
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
                    CatchStreamerBannerUiKt.PreviewPhone(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(apiLevel = 28, device = "spec:id=reference_phone,shape=Normal,width=480,height=320,unit=dp,dpi=420")
    public static final void PreviewPhone0(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(326260172);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(326260172, i, -1, "com.blackhub.bronline.game.ui.catchstreamer.PreviewPhone0 (CatchStreamerBannerUi.kt:424)");
            }
            CatchStreamerBannerContent(Modifier.INSTANCE, new CatchStreamerUiState(0, 0, 0, 0, 0, 0, 0, false, false, false, 1023, null), false, null, false, false, null, null, null, composerStartRestartGroup, 6, 508);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt.PreviewPhone0.1
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
                    CatchStreamerBannerUiKt.PreviewPhone0(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(apiLevel = 28, device = "spec:id=reference_phone,shape=Normal,width=600,height=270,unit=dp,dpi=420")
    public static final void PreviewPhone1(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-882982067);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-882982067, i, -1, "com.blackhub.bronline.game.ui.catchstreamer.PreviewPhone1 (CatchStreamerBannerUi.kt:437)");
            }
            CatchStreamerBannerContent(Modifier.INSTANCE, new CatchStreamerUiState(0, 0, 0, 0, 0, 0, 0, false, false, false, 1023, null), false, null, false, false, null, null, null, composerStartRestartGroup, 6, 508);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt.PreviewPhone1.1
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
                    CatchStreamerBannerUiKt.PreviewPhone1(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(apiLevel = 33, device = "spec:id=reference_phone,shape=Normal,width=640,height=360,unit=dp,dpi=420")
    public static final void PreviewPhone2(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-2092224306);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2092224306, i, -1, "com.blackhub.bronline.game.ui.catchstreamer.PreviewPhone2 (CatchStreamerBannerUi.kt:450)");
            }
            CatchStreamerBannerContent(Modifier.INSTANCE, new CatchStreamerUiState(0, 0, 0, 0, 0, 0, 0, false, false, false, 1023, null), false, null, false, false, null, null, null, composerStartRestartGroup, 6, 508);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt.PreviewPhone2.1
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
                    CatchStreamerBannerUiKt.PreviewPhone2(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(apiLevel = 28, device = "spec:id=reference_phone,shape=Normal,width=780,height=360,unit=dp,dpi=420")
    public static final void PreviewPhone3(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(993500751);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(993500751, i, -1, "com.blackhub.bronline.game.ui.catchstreamer.PreviewPhone3 (CatchStreamerBannerUi.kt:463)");
            }
            CatchStreamerBannerContent(Modifier.INSTANCE, new CatchStreamerUiState(0, 0, 0, 0, 0, 0, 0, false, false, false, 1023, null), false, null, false, false, null, null, null, composerStartRestartGroup, 6, 508);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt.PreviewPhone3.1
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
                    CatchStreamerBannerUiKt.PreviewPhone3(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(apiLevel = 28, device = "spec:id=reference_phone,shape=Normal,width=800,height=360,unit=dp,dpi=420")
    public static final void PreviewPhone4(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-215741488);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-215741488, i, -1, "com.blackhub.bronline.game.ui.catchstreamer.PreviewPhone4 (CatchStreamerBannerUi.kt:476)");
            }
            CatchStreamerBannerContent(Modifier.INSTANCE, new CatchStreamerUiState(0, 0, 0, 0, 0, 0, 0, false, false, false, 1023, null), false, null, false, false, null, null, null, composerStartRestartGroup, 6, 508);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt.PreviewPhone4.1
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
                    CatchStreamerBannerUiKt.PreviewPhone4(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(apiLevel = 28, device = "spec:id=reference_phone,shape=Normal,width=844,height=390,unit=dp,dpi=420")
    public static final void PreviewPhone5(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1424983727);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1424983727, i, -1, "com.blackhub.bronline.game.ui.catchstreamer.PreviewPhone5 (CatchStreamerBannerUi.kt:489)");
            }
            CatchStreamerBannerContent(Modifier.INSTANCE, new CatchStreamerUiState(0, 0, 0, 0, 0, 0, 0, false, false, false, 1023, null), false, null, false, false, null, null, null, composerStartRestartGroup, 6, 508);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt.PreviewPhone5.1
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
                    CatchStreamerBannerUiKt.PreviewPhone5(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(apiLevel = 28, device = "spec:id=reference_phone,shape=Normal,width=891,height=411,unit=dp,dpi=420")
    public static final void PreviewPhone6(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1660741330);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1660741330, i, -1, "com.blackhub.bronline.game.ui.catchstreamer.PreviewPhone6 (CatchStreamerBannerUi.kt:502)");
            }
            CatchStreamerBannerContent(Modifier.INSTANCE, new CatchStreamerUiState(0, 0, 0, 0, 0, 0, 0, false, false, false, 1023, null), false, null, false, false, null, null, null, composerStartRestartGroup, 6, 508);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt.PreviewPhone6.1
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
                    CatchStreamerBannerUiKt.PreviewPhone6(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(apiLevel = 28, device = "spec:id=reference_phone,shape=Normal,width=854,height=480,unit=dp,dpi=420")
    public static final void PreviewPhone7(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(451499091);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(451499091, i, -1, "com.blackhub.bronline.game.ui.catchstreamer.PreviewPhone7 (CatchStreamerBannerUi.kt:515)");
            }
            CatchStreamerBannerContent(Modifier.INSTANCE, new CatchStreamerUiState(0, 0, 0, 0, 0, 0, 0, false, false, false, 1023, null), false, null, false, false, null, null, null, composerStartRestartGroup, 6, 508);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt.PreviewPhone7.1
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
                    CatchStreamerBannerUiKt.PreviewPhone7(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(apiLevel = 28, device = "spec:id=reference_phone,shape=Normal,width=896,height=414,unit=dp,dpi=420")
    public static final void PreviewPhone8(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-757743148);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-757743148, i, -1, "com.blackhub.bronline.game.ui.catchstreamer.PreviewPhone8 (CatchStreamerBannerUi.kt:528)");
            }
            CatchStreamerBannerContent(Modifier.INSTANCE, new CatchStreamerUiState(0, 0, 0, 0, 0, 0, 0, false, false, false, 1023, null), false, null, false, false, null, null, null, composerStartRestartGroup, 6, 508);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt.PreviewPhone8.1
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
                    CatchStreamerBannerUiKt.PreviewPhone8(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(apiLevel = 28, device = "spec:id=reference_phone,shape=Normal,width=915,height=412,unit=dp,dpi=420")
    public static final void PreviewPhone9(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1966985387);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1966985387, i, -1, "com.blackhub.bronline.game.ui.catchstreamer.PreviewPhone9 (CatchStreamerBannerUi.kt:541)");
            }
            CatchStreamerBannerContent(Modifier.INSTANCE, new CatchStreamerUiState(0, 0, 0, 0, 0, 0, 0, false, false, false, 1023, null), false, null, false, false, null, null, null, composerStartRestartGroup, 6, 508);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt.PreviewPhone9.1
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
                    CatchStreamerBannerUiKt.PreviewPhone9(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(apiLevel = 28, device = "spec:id=reference_tablet,shape=Normal,width=1133,height=744,unit=dp,dpi=420")
    public static final void PreviewTable1(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1883078893);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1883078893, i, -1, "com.blackhub.bronline.game.ui.catchstreamer.PreviewTable1 (CatchStreamerBannerUi.kt:554)");
            }
            CatchStreamerBannerContent(Modifier.INSTANCE, new CatchStreamerUiState(0, 0, 0, 0, 0, 0, 0, false, false, false, 1023, null), false, null, false, false, null, null, null, composerStartRestartGroup, 6, 508);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt.PreviewTable1.1
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
                    CatchStreamerBannerUiKt.PreviewTable1(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(apiLevel = 28, device = "spec:id=reference_tablet,shape=Normal,width=1280,height=800,unit=dp,dpi=420")
    public static final void PreviewTable2(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(673836654);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(673836654, i, -1, "com.blackhub.bronline.game.ui.catchstreamer.PreviewTable2 (CatchStreamerBannerUi.kt:567)");
            }
            CatchStreamerBannerContent(Modifier.INSTANCE, new CatchStreamerUiState(0, 0, 0, 0, 0, 0, 0, false, false, false, 1023, null), false, null, false, false, null, null, null, composerStartRestartGroup, 6, 508);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt.PreviewTable2.1
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
                    CatchStreamerBannerUiKt.PreviewTable2(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(apiLevel = 28, device = "spec:id=reference_tablet,shape=Normal,width=1510,height=940,unit=dp,dpi=420")
    public static final void PreviewTable3(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-535405585);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-535405585, i, -1, "com.blackhub.bronline.game.ui.catchstreamer.PreviewTable3 (CatchStreamerBannerUi.kt:580)");
            }
            CatchStreamerBannerContent(Modifier.INSTANCE, new CatchStreamerUiState(0, 0, 0, 0, 0, 0, 0, false, false, false, 1023, null), false, null, false, false, null, null, null, composerStartRestartGroup, 6, 508);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt.PreviewTable3.1
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
                    CatchStreamerBannerUiKt.PreviewTable3(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(apiLevel = 28, device = "spec:id=reference_tablet,shape=Normal,width=1600,height=1200,unit=dp,dpi=420")
    public static final void PreviewTable4(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1744647824);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1744647824, i, -1, "com.blackhub.bronline.game.ui.catchstreamer.PreviewTable4 (CatchStreamerBannerUi.kt:593)");
            }
            CatchStreamerBannerContent(Modifier.INSTANCE, new CatchStreamerUiState(0, 0, 0, 0, 0, 0, 0, false, false, false, 1023, null), false, null, false, false, null, null, null, composerStartRestartGroup, 6, 508);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt.PreviewTable4.1
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
                    CatchStreamerBannerUiKt.PreviewTable4(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(apiLevel = 28, device = "spec:id=reference_tablet,shape=Normal,width=1970,height=1480,unit=dp,dpi=420")
    public static final void PreviewTable5(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1341077233);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1341077233, i, -1, "com.blackhub.bronline.game.ui.catchstreamer.PreviewTable5 (CatchStreamerBannerUi.kt:606)");
            }
            CatchStreamerBannerContent(Modifier.INSTANCE, new CatchStreamerUiState(0, 0, 0, 0, 0, 0, 0, false, false, false, 1023, null), false, null, false, false, null, null, null, composerStartRestartGroup, 6, 508);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt.PreviewTable5.1
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
                    CatchStreamerBannerUiKt.PreviewTable5(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(apiLevel = 28, device = "spec:id=reference_tablet,shape=Normal,width=2000,height=1200,unit=dp,dpi=420")
    public static final void PreviewTable6(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(131834994);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(131834994, i, -1, "com.blackhub.bronline.game.ui.catchstreamer.PreviewTable6 (CatchStreamerBannerUi.kt:619)");
            }
            CatchStreamerBannerContent(Modifier.INSTANCE, new CatchStreamerUiState(0, 0, 0, 0, 0, 0, 0, false, false, false, 1023, null), false, null, false, false, null, null, null, composerStartRestartGroup, 6, 508);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt.PreviewTable6.1
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
                    CatchStreamerBannerUiKt.PreviewTable6(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(apiLevel = 28, device = "spec:id=reference_tablet,shape=Normal,width=2170,height=1360,unit=dp,dpi=420")
    public static final void PreviewTable7(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1077407245);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1077407245, i, -1, "com.blackhub.bronline.game.ui.catchstreamer.PreviewTable7 (CatchStreamerBannerUi.kt:632)");
            }
            CatchStreamerBannerContent(Modifier.INSTANCE, new CatchStreamerUiState(0, 0, 0, 0, 0, 0, 0, false, false, false, 1023, null), false, null, false, false, null, null, null, composerStartRestartGroup, 6, 508);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt.PreviewTable7.1
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
                    CatchStreamerBannerUiKt.PreviewTable7(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void RegistrationInCompetitionDialog(@NotNull final MutableState<Boolean> openDialog, @NotNull final CatchStreamerViewModel viewModel, @Nullable Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(openDialog, "openDialog");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(1136341416);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1136341416, i, -1, "com.blackhub.bronline.game.ui.catchstreamer.RegistrationInCompetitionDialog (CatchStreamerBannerUi.kt:644)");
        }
        composerStartRestartGroup.startReplaceableGroup(-1477315162);
        boolean z = (((i & 14) ^ 6) > 4 && composerStartRestartGroup.changed(openDialog)) || (i & 6) == 4;
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt$RegistrationInCompetitionDialog$1$1
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
                    openDialog.setValue(Boolean.FALSE);
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        AndroidDialog_androidKt.Dialog((Function0) objRememberedValue, new DialogProperties(false, false, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2106627697, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt.RegistrationInCompetitionDialog.2
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
            public final void invoke(@Nullable Composer composer2, int i2) {
                if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2106627697, i2, -1, "com.blackhub.bronline.game.ui.catchstreamer.RegistrationInCompetitionDialog.<anonymous> (CatchStreamerBannerUi.kt:653)");
                    }
                    RegistrationInCompetitionDialogUiKt.RegistrationInCompetitionDialogUi(null, openDialog, viewModel, composer2, 512, 1);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, 432, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt.RegistrationInCompetitionDialog.3
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
                    CatchStreamerBannerUiKt.RegistrationInCompetitionDialog(openDialog, viewModel, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void CongratulationsDialog(@NotNull final MutableState<Boolean> openDialog, @NotNull final CatchStreamerUiState state, @Nullable Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(openDialog, "openDialog");
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(80329467);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(openDialog) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(state) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(80329467, i2, -1, "com.blackhub.bronline.game.ui.catchstreamer.CongratulationsDialog (CatchStreamerBannerUi.kt:665)");
            }
            composerStartRestartGroup.startReplaceableGroup(-1214381736);
            boolean z = (i2 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt$CongratulationsDialog$1$1
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
                        openDialog.setValue(Boolean.FALSE);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            AndroidDialog_androidKt.Dialog((Function0) objRememberedValue, new DialogProperties(false, false, null, false, false, 20, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 339821892, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt.CongratulationsDialog.2
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
                    if ((i3 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(339821892, i3, -1, "com.blackhub.bronline.game.ui.catchstreamer.CongratulationsDialog.<anonymous> (CatchStreamerBannerUi.kt:674)");
                    }
                    CongratulationsDialogUIKt.CongratulationsDialogUI(null, openDialog, state, composer2, 0, 1);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CatchStreamerBannerUiKt.CongratulationsDialog.3
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
                    CatchStreamerBannerUiKt.CongratulationsDialog(openDialog, state, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @Composable
    /* renamed from: checkScreen-8Feqmps, reason: not valid java name */
    public static final float m14938checkScreen8Feqmps(float f, @Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-1475376462);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1475376462, i, -1, "com.blackhub.bronline.game.ui.catchstreamer.checkScreen (CatchStreamerBannerUi.kt:679)");
        }
        ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources().getDisplayMetrics();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        int i2 = displayMetrics.heightPixels;
        int i3 = displayMetrics.widthPixels;
        if (i2 > 1100) {
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return f;
    }

    public static final int CatchStreamerBannerUi$lambda$1(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }
}

