package com.blackhub.bronline.game.p019ui.tutorial;

import androidx.annotation.DrawableRes;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.text.AnnotatedString;
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
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.media3.extractor.MpegAudioUtil;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.gui.tutorialhints.HintQuestData;
import com.blackhub.bronline.game.gui.tutorialhints.TutorialEnum;
import com.blackhub.bronline.game.gui.tutorialhints.TutorialUiState;
import com.blackhub.bronline.game.gui.tutorialhints.TutorialViewModel;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TutorialGui.kt */
@SourceDebugExtension({"SMAP\nTutorialGui.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TutorialGui.kt\ncom/blackhub/bronline/game/ui/tutorial/TutorialGuiKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,220:1\n81#2,11:221\n1116#3,6:232\n68#4,6:238\n74#4:272\n68#4,6:273\n74#4:307\n78#4:312\n78#4:317\n79#5,11:244\n79#5,11:279\n92#5:311\n92#5:316\n456#6,8:255\n464#6,3:269\n456#6,8:290\n464#6,3:304\n467#6,3:308\n467#6,3:313\n3737#7,6:263\n3737#7,6:298\n*S KotlinDebug\n*F\n+ 1 TutorialGui.kt\ncom/blackhub/bronline/game/ui/tutorial/TutorialGuiKt\n*L\n34#1:221,11\n62#1:232,6\n64#1:238,6\n64#1:272\n67#1:273,6\n67#1:307\n67#1:312\n64#1:317\n64#1:244,11\n67#1:279,11\n67#1:311\n64#1:316\n64#1:255,8\n64#1:269,3\n67#1:290,8\n67#1:304,3\n67#1:308,3\n64#1:313,3\n64#1:263,6\n67#1:298,6\n*E\n"})
/* loaded from: classes2.dex */
public final class TutorialGuiKt {
    public static final int BOX_VERTICAL_PERCENT = 24;
    public static final float HINT_WIDTH = 0.3f;

    /* compiled from: TutorialGui.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TutorialEnum.values().length];
            try {
                iArr[TutorialEnum.TASKS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void TutorialGui(@Nullable Composer composer, final int i) {
        CreationExtras defaultViewModelCreationExtras;
        Composer composerStartRestartGroup = composer.startRestartGroup(2060206388);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2060206388, i, -1, "com.blackhub.bronline.game.ui.tutorial.TutorialGui (TutorialGui.kt:31)");
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
            ViewModel viewModel = ViewModelKt.viewModel(TutorialViewModel.class, current, null, null, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            final TutorialViewModel tutorialViewModel = (TutorialViewModel) viewModel;
            TutorialUiState tutorialUiState = (TutorialUiState) FlowExtKt.collectAsStateWithLifecycle(tutorialViewModel.getUiState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 8, 7).getValue();
            if (tutorialUiState.isNewVersionVisible()) {
                TutorialGuiContent(null, tutorialUiState.getHintScreenType(), StringExtensionKt.htmlTextToAnnotatedString(tutorialUiState.getHintTitle()), StringExtensionKt.htmlTextToAnnotatedString(tutorialUiState.getHintDesc()), tutorialUiState.getHintImage(), tutorialUiState.getMainTask(), tutorialUiState.getAdditionalTasksList(), new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.tutorial.TutorialGuiKt.TutorialGui.1
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
                        tutorialViewModel.onClickTask();
                    }
                }, composerStartRestartGroup, 2359296, 1);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.tutorial.TutorialGuiKt.TutorialGui.2
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
                    TutorialGuiKt.TutorialGui(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void TutorialGuiContent(@Nullable Modifier modifier, @NotNull final TutorialEnum hintScreen, @NotNull final AnnotatedString hintTitle, @NotNull final AnnotatedString hintDesc, @DrawableRes final int i, @NotNull final HintQuestData mainTask, @NotNull final List<HintQuestData> additionalTasksList, @NotNull final Function0<Unit> onClickTask, @Nullable Composer composer, final int i2, final int i3) {
        Intrinsics.checkNotNullParameter(hintScreen, "hintScreen");
        Intrinsics.checkNotNullParameter(hintTitle, "hintTitle");
        Intrinsics.checkNotNullParameter(hintDesc, "hintDesc");
        Intrinsics.checkNotNullParameter(mainTask, "mainTask");
        Intrinsics.checkNotNullParameter(additionalTasksList, "additionalTasksList");
        Intrinsics.checkNotNullParameter(onClickTask, "onClickTask");
        Composer composerStartRestartGroup = composer.startRestartGroup(2089483077);
        final Modifier modifier2 = (i3 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2089483077, i2, -1, "com.blackhub.bronline.game.ui.tutorial.TutorialGuiContent (TutorialGui.kt:59)");
        }
        composerStartRestartGroup.startReplaceableGroup(113634429);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        MutableState mutableState = (MutableState) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        Modifier modifierM8084offsetVpY3zN4$default = OffsetKt.m8084offsetVpY3zN4$default(BoxScopeInstance.INSTANCE.align(PaddingKt.m8127paddingqDBjuR0$default(modifier2, 0.0f, 0.0f, 0.0f, ComposeExtensionKt.toVerticalPercentSwDp(24, composerStartRestartGroup, 6), 7, null), companion2.getTopEnd()), 0.0f, ComposeExtensionKt.toVerticalPercentSwDp(24, composerStartRestartGroup, 6), 1, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM8084offsetVpY3zN4$default);
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
        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
        if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        if (WhenMappings.$EnumSwitchMapping$0[hintScreen.ordinal()] == 1) {
            composerStartRestartGroup.startReplaceableGroup(-270241034);
            HintRightWithImageBlockKt.HintRightWithImageBlock(SizeKt.fillMaxWidth(companion, 0.3f), i, mutableState, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -953318968, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.tutorial.TutorialGuiKt$TutorialGuiContent$1$1$1
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
                            ComposerKt.traceEventStart(-953318968, i4, -1, "com.blackhub.bronline.game.ui.tutorial.TutorialGuiContent.<anonymous>.<anonymous>.<anonymous> (TutorialGui.kt:79)");
                        }
                        HintRightTasksBlockKt.HintRightTasksBlock(null, CollectionsKt__CollectionsJVMKt.listOf(mainTask), additionalTasksList, onClickTask, composer2, MpegAudioUtil.SAMPLES_PER_FRAME_L3_V2, 1);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), composerStartRestartGroup, ((i2 >> 9) & 112) | 3462, 0);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(-270240467);
            HintRightWithImageBlockKt.HintRightWithImageBlock(SizeKt.fillMaxWidth(companion, 0.3f), i, mutableState, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 12378257, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.tutorial.TutorialGuiKt$TutorialGuiContent$1$1$2
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
                            ComposerKt.traceEventStart(12378257, i4, -1, "com.blackhub.bronline.game.ui.tutorial.TutorialGuiContent.<anonymous>.<anonymous>.<anonymous> (TutorialGui.kt:93)");
                        }
                        TextKt.m10025TextIbK3jfQ(hintDesc, PaddingKt.m8124paddingVpY3zN4(modifier2, PrimitiveResources_androidKt.dimensionResource(R.dimen._15sdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._8sdp, composer2, 6)), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, TypographyStyle.INSTANCE.m14861montserratSemiBold9spOr7ssp67j0QOw(0L, 0, 0L, 0.0f, composer2, CpioConstants.C_ISBLK, 15), composer2, 0, 0, 131068);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), composerStartRestartGroup, ((i2 >> 9) & 112) | 3462, 0);
            composerStartRestartGroup.endReplaceableGroup();
        }
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
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier3 = modifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.tutorial.TutorialGuiKt.TutorialGuiContent.2
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
                    TutorialGuiKt.TutorialGuiContent(modifier3, hintScreen, hintTitle, hintDesc, i, mainTask, additionalTasksList, onClickTask, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Preview.Container({@Preview(device = "spec:width=336dp,height=692dp,dpi=420,isRound=false,chinSize=0dp,orientation=landscape", name = "Phone 336 x 692"), @Preview(device = "spec:width=360dp,height=572dp,dpi=420,isRound=false,chinSize=0dp,orientation=landscape", name = "Phone 360 x 572"), @Preview(device = "spec:width=360dp,height=615dp,dpi=420,isRound=false,chinSize=0dp,orientation=landscape", name = "Phone 360 x 615 Redmi 4x"), @Preview(device = "spec:width=360dp,height=640dp,dpi=420,isRound=false,chinSize=0dp,orientation=landscape", name = "Phone 360 x 640 Android small"), @Preview(device = "spec:width=360dp,height=800dp,dpi=420,isRound=false,chinSize=0dp,orientation=landscape", name = "Phone 360 x 800 Android large"), @Preview(device = "spec:width=384dp,height=783dp,dpi=420,isRound=false,chinSize=0dp,orientation=landscape", name = "Phone 384 x 783 Samsung m23"), @Preview(device = "spec:width=392dp,height=823dp,dpi=420,isRound=false,chinSize=0dp,orientation=landscape", name = "Phone 392 x 823"), @Preview(device = "spec:width=392dp,height=792dp,dpi=420,isRound=false,chinSize=0dp,orientation=landscape", name = "Phone 392 x 792 Poco x3 pro"), @Preview(device = "spec:width=390dp,height=844dp,dpi=420,isRound=false,chinSize=0dp,orientation=landscape", name = "Phone 390 x 844 IPhone 13"), @Preview(device = "spec:width=411dp,height=891dp,dpi=420,isRound=false,chinSize=0dp,orientation=landscape", name = "Phone 411 x 891"), @Preview(device = "spec:width=412dp,height=915dp,dpi=420,isRound=false,chinSize=0dp,orientation=landscape", name = "Phone 412 x 915"), @Preview(device = "spec:width=480dp,height=854dp,dpi=420,isRound=false,chinSize=0dp,orientation=landscape", name = "Phone 480 x 854"), @Preview(device = "spec:width=594dp,height=1126dp,dpi=420,isRound=false,chinSize=0dp,orientation=landscape", name = "Table 594 x 1126 Andrey"), @Preview(device = "spec:width=744dp,height=1133dp,dpi=420,isRound=false,chinSize=0dp,orientation=landscape", name = "Table 744 x 1133 Figma small"), @Preview(device = "spec:width=744dp,height=1280dp,dpi=420,isRound=false,chinSize=0dp,orientation=landscape", name = "Table 744 x 1280"), @Preview(device = "spec:width=760dp,height=1280dp,dpi=420,isRound=false,chinSize=0dp,orientation=landscape", name = "Table 760 x 1280"), @Preview(device = "spec:width=760dp,height=1333dp,dpi=420,isRound=false,chinSize=0dp,orientation=landscape", name = "Table 760 x 1333"), @Preview(device = "spec:width=768dp,height=1024dp,dpi=420,isRound=false,chinSize=0dp,orientation=landscape", name = "Table 768 x 1024"), @Preview(device = "spec:width=889dp,height=1280dp,dpi=420,isRound=false,chinSize=0dp,orientation=landscape", name = "Table 889 x 1280 Figma big"), @Preview(device = "spec:width=940dp,height=1510dp,dpi=420,isRound=false,chinSize=0dp,orientation=landscape", name = "Table 940 x 1510"), @Preview(device = "spec:width=944dp,height=1133dp,dpi=420,isRound=false,orientation=landscape", name = "Table 944 x 1133"), @Preview(device = "spec:width=960dp,height=1440dp,dpi=420,isRound=false,chinSize=0dp,orientation=landscape", name = "Table 960 x 1440 Figma Surfase PRO 8"), @Preview(device = "spec:width=1200dp,height=1600dp,dpi=420,isRound=false,chinSize=0dp,orientation=landscape", name = "Table 1200 x 1600"), @Preview(device = "spec:width=1200dp,height=2000dp,dpi=420,isRound=false,chinSize=0dp,orientation=landscape", name = "Table 1200 x 2000"), @Preview(device = "spec:width=1480dp,height=1970dp,dpi=420,isRound=false,chinSize=0dp,orientation=landscape", name = "Table 1480 x 1970")})
    @Composable
    public static final void PreviewTutorialGuiContent(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1837223789);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1837223789, i, -1, "com.blackhub.bronline.game.ui.tutorial.PreviewTutorialGuiContent (TutorialGui.kt:209)");
            }
            TutorialGuiContent(null, TutorialEnum.GUIDE, StringExtensionKt.htmlTextToAnnotatedString("Заголовок"), StringExtensionKt.htmlTextToAnnotatedString("Приветствую. Не волнуйтесь, Вы уже прошли половину экзамена. Осталось самое интересное.\n<font color=#CCFFDD>Откройте Радиальное меню</font> и заведите двигатель.Приветствую. Не волнуйтесь, Вы уже прошли половину <font color=#FFBAFA>экзамена</font>. Осталось самое интересное.\nОткройте Радиальное меню и заведите двигатель.Приветствую."), R.drawable.img_firefighter, new HintQuestData(null, 0, 0, 0L, false, 31, null), CollectionsKt__CollectionsKt.emptyList(), new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.tutorial.TutorialGuiKt.PreviewTutorialGuiContent.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 14966832, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.tutorial.TutorialGuiKt.PreviewTutorialGuiContent.2
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
                    TutorialGuiKt.PreviewTutorialGuiContent(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

