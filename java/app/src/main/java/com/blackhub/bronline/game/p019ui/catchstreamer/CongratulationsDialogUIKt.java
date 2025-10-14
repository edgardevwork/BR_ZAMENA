package com.blackhub.bronline.game.p019ui.catchstreamer;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.RotateKt;
import androidx.compose.p003ui.draw.ScaleKt;
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
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.tooling.preview.Preview;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.blackhub.bronline.game.common.resources.StringResourceCompose;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerUiState;
import com.blackhub.bronline.game.p019ui.widget.block.VerticalRedBlackBlockKt;
import com.blackhub.bronline.game.p019ui.widget.other.CorrugatedOvalKt;
import com.blackhub.bronline.game.p019ui.widget.other.RectShadowKt;
import com.blackhub.bronline.game.theme.ThemeKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CongratulationsDialogUI.kt */
@SourceDebugExtension({"SMAP\nCongratulationsDialogUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CongratulationsDialogUI.kt\ncom/blackhub/bronline/game/ui/catchstreamer/CongratulationsDialogUIKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,150:1\n74#2:151\n69#3,5:152\n74#3:185\n69#3,5:192\n74#3:225\n69#3,5:257\n74#3:290\n78#3:295\n78#3:305\n78#3:310\n79#4,11:157\n79#4,11:197\n79#4,11:228\n79#4,11:262\n92#4:294\n92#4:299\n92#4:304\n92#4:309\n456#5,8:168\n464#5,3:182\n456#5,8:208\n464#5,3:222\n456#5,8:239\n464#5,3:253\n456#5,8:273\n464#5,3:287\n467#5,3:291\n467#5,3:296\n467#5,3:301\n467#5,3:306\n3737#6,6:176\n3737#6,6:216\n3737#6,6:247\n3737#6,6:281\n1116#7,6:186\n78#8,2:226\n80#8:256\n84#8:300\n*S KotlinDebug\n*F\n+ 1 CongratulationsDialogUI.kt\ncom/blackhub/bronline/game/ui/catchstreamer/CongratulationsDialogUIKt\n*L\n43#1:151\n55#1:152,5\n55#1:185\n73#1:192,5\n73#1:225\n92#1:257,5\n92#1:290\n92#1:295\n73#1:305\n55#1:310\n55#1:157,11\n73#1:197,11\n81#1:228,11\n92#1:262,11\n92#1:294\n81#1:299\n73#1:304\n55#1:309\n55#1:168,8\n55#1:182,3\n73#1:208,8\n73#1:222,3\n81#1:239,8\n81#1:253,3\n92#1:273,8\n92#1:287,3\n92#1:291,3\n81#1:296,3\n73#1:301,3\n55#1:306,3\n55#1:176,6\n73#1:216,6\n81#1:247,6\n92#1:281,6\n61#1:186,6\n81#1:226,2\n81#1:256\n81#1:300\n*E\n"})

public final class CongratulationsDialogUIKt {

    /* compiled from: CongratulationsDialogUI.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.catchstreamer.CongratulationsDialogUIKt$CongratulationsDialogUI$2 */
    /* loaded from: classes.dex */
    public static final class C52932 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ MutableState<Boolean> $openDialog;
        public final /* synthetic */ CatchStreamerUiState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C52932(MutableState<Boolean> mutableState, CatchStreamerUiState catchStreamerUiState, int i, int i2) {
            super(2);
            mutableState = mutableState;
            catchStreamerUiState = catchStreamerUiState;
            i = i;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            CongratulationsDialogUIKt.CongratulationsDialogUI(modifier, mutableState, catchStreamerUiState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* compiled from: CongratulationsDialogUI.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.catchstreamer.CongratulationsDialogUIKt$PreviewCongratulationsDialogUI$1 */
    /* loaded from: classes.dex */
    public static final class C52941 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C52941(int i) {
            super(2);
            i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            CongratulationsDialogUIKt.PreviewCongratulationsDialogUI(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    /* compiled from: CongratulationsDialogUI.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.catchstreamer.CongratulationsDialogUIKt$PreviewCongratulationsDialogUITable$1 */
    /* loaded from: classes.dex */
    public static final class C52951 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C52951(int i) {
            super(2);
            i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            CongratulationsDialogUIKt.PreviewCongratulationsDialogUITable(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void CongratulationsDialogUI(@Nullable Modifier modifier, @NotNull final MutableState<Boolean> openDialog, @NotNull CatchStreamerUiState state, @Nullable Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        Intrinsics.checkNotNullParameter(openDialog, "openDialog");
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(2005884905);
        int i4 = i2 & 1;
        if (i4 != 0) {
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
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(openDialog) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(state) ? 256 : 128;
        }
        if ((i3 & 731) != 146 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2005884905, i3, -1, "com.blackhub.bronline.game.ui.catchstreamer.CongratulationsDialogUI (CongratulationsDialogUI.kt:41)");
            }
            View view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
            AnnotatedString catchStreamerCurrentBuyTickets = StringResourceCompose.INSTANCE.getCatchStreamerCurrentBuyTickets(state.getCountBuyTickets(), composerStartRestartGroup, 48);
            UsefulKt.hideSystemUI(view);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment center = companion.getCenter();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-1815293752);
            boolean z = (i3 & 112) == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CongratulationsDialogUIKt$CongratulationsDialogUI$1$1$1
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
            Function0 function0 = (Function0) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            final float f = 0.4f;
            Modifier modifier5 = modifier4;
            VerticalRedBlackBlockKt.VerticalRedBlackBlock(null, "Поздравляем!", function0, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -318820086, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CongratulationsDialogUIKt$CongratulationsDialogUI$1$2
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
                public final void invoke(@Nullable Composer composer2, int i5) {
                    if ((i5 & 11) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-318820086, i5, -1, "com.blackhub.bronline.game.ui.catchstreamer.CongratulationsDialogUI.<anonymous>.<anonymous> (CongratulationsDialogUI.kt:62)");
                        }
                        RectShadowKt.m15098RectShadowOfrYxbw(PaddingKt.m8124paddingVpY3zN4(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._45sdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._25sdp, composer2, 6)), ColorResources_androidKt.colorResource(R.color.red, composer2, 6), 0.0f, 0.0f, 0.0f, f, 0.0f, composer2, ProfileVerifier.CompilationStatus.f342xf2722a21, 92);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), composerStartRestartGroup, 3120, 1);
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(companion3, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._18sdp, composerStartRestartGroup, 6), 0.0f, 0.0f, 13, null);
            Alignment center2 = companion.getCenter();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composerStartRestartGroup);
            Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            CorrugatedOvalKt.CorrugatedOval(SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), composerStartRestartGroup, 6, 0);
            Modifier modifierM8127paddingqDBjuR0$default2 = PaddingKt.m8127paddingqDBjuR0$default(SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._12sdp, composerStartRestartGroup, 6), 0.0f, 0.0f, 13, null);
            Arrangement.HorizontalOrVertical center3 = Arrangement.INSTANCE.getCenter();
            Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center3, centerHorizontally, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composerStartRestartGroup);
            Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
            if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
            TextAlign.Companion companion4 = TextAlign.INSTANCE;
            modifier3 = modifier5;
            TextKt.m10025TextIbK3jfQ(catchStreamerCurrentBuyTickets, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle.m14857montserratSemiBold20spOr15ssp67j0QOw(0L, companion4.m13558getCentere0LSkKk(), 0L, 0.0f, composerStartRestartGroup, CpioConstants.C_ISBLK, 13), composerStartRestartGroup, 0, 0, 131070);
            Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._108sdp, composerStartRestartGroup, 6));
            Alignment center4 = companion.getCenter();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(center4, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor4 = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM8172size3ABfNKs);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composerStartRestartGroup);
            Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRememberBoxMeasurePolicy3, companion2.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion2.getSetCompositeKeyHash();
            if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_ticket, composerStartRestartGroup, 6), (String) null, ScaleKt.scale(SizeKt.fillMaxSize$default(RotateKt.rotate(companion3, 290.0f), 0.0f, 1, null), 0.8f), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.catch_streamer_find_out_result, composerStartRestartGroup, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 2, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14850montserratSemiBold12spOr9ssp67j0QOw(0L, companion4.m13558getCentere0LSkKk(), 0L, 0.0f, composerStartRestartGroup, CpioConstants.C_ISBLK, 13), composerStartRestartGroup, 0, CpioConstants.C_ISBLK, 49150);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CongratulationsDialogUIKt.CongratulationsDialogUI.2
                public final /* synthetic */ int $$changed;
                public final /* synthetic */ int $$default;
                public final /* synthetic */ MutableState<Boolean> $openDialog;
                public final /* synthetic */ CatchStreamerUiState $state;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C52932(final MutableState<Boolean> openDialog2, CatchStreamerUiState state2, int i5, int i22) {
                    super(2);
                    mutableState = openDialog2;
                    catchStreamerUiState = state2;
                    i = i5;
                    i = i22;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i5) {
                    CongratulationsDialogUIKt.CongratulationsDialogUI(modifier, mutableState, catchStreamerUiState, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @SuppressLint({"UnrememberedMutableState"})
    @Composable
    @Preview(heightDp = 390, name = "Congratulations", showBackground = true, widthDp = 844)
    public static final void PreviewCongratulationsDialogUI(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1643196034);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1643196034, i, -1, "com.blackhub.bronline.game.ui.catchstreamer.PreviewCongratulationsDialogUI (CongratulationsDialogUI.kt:124)");
            }
            ThemeKt.BRTheme(false, false, ComposableSingletons$CongratulationsDialogUIKt.INSTANCE.m14943getLambda1$app_siteRelease(), composerStartRestartGroup, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CongratulationsDialogUIKt.PreviewCongratulationsDialogUI.1
                public final /* synthetic */ int $$changed;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C52941(int i2) {
                    super(2);
                    i = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) {
                    CongratulationsDialogUIKt.PreviewCongratulationsDialogUI(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @SuppressLint({"UnrememberedMutableState"})
    @Composable
    @Preview(apiLevel = 28, heightDp = 744, name = "Congratulations Table", showBackground = true, widthDp = 1133)
    public static final void PreviewCongratulationsDialogUITable(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1079158366);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1079158366, i, -1, "com.blackhub.bronline.game.ui.catchstreamer.PreviewCongratulationsDialogUITable (CongratulationsDialogUI.kt:142)");
            }
            ThemeKt.BRTheme(false, false, ComposableSingletons$CongratulationsDialogUIKt.INSTANCE.m14944getLambda2$app_siteRelease(), composerStartRestartGroup, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.CongratulationsDialogUIKt.PreviewCongratulationsDialogUITable.1
                public final /* synthetic */ int $$changed;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C52951(int i2) {
                    super(2);
                    i = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) {
                    CongratulationsDialogUIKt.PreviewCongratulationsDialogUITable(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

