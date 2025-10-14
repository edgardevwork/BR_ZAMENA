package com.blackhub.bronline.game.p019ui.craft;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.gui.craft.model.CraftForcedTutorialAttachment;
import com.blackhub.bronline.game.p019ui.widget.block.tutorial.PanelInfoBlockKt;
import com.blackhub.bronline.game.p019ui.widget.utils.ImageBitmapKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CraftForcedTutorial.kt */
@SourceDebugExtension({"SMAP\nCraftForcedTutorial.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CraftForcedTutorial.kt\ncom/blackhub/bronline/game/ui/craft/CraftForcedTutorialKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,136:1\n1116#2,6:137\n1116#2,6:143\n1116#2,6:149\n1116#2,6:155\n1116#2,6:161\n1116#2,6:167\n1116#2,6:173\n75#3:179\n108#3,2:180\n81#4:182\n81#4:183\n81#4:184\n81#4:185\n81#4:186\n*S KotlinDebug\n*F\n+ 1 CraftForcedTutorial.kt\ncom/blackhub/bronline/game/ui/craft/CraftForcedTutorialKt\n*L\n35#1:137,6\n39#1:143,6\n47#1:149,6\n56#1:155,6\n64#1:161,6\n73#1:167,6\n93#1:173,6\n35#1:179\n35#1:180,2\n39#1:182\n47#1:183\n56#1:184\n64#1:185\n73#1:186\n*E\n"})
/* loaded from: classes2.dex */
public final class CraftForcedTutorialKt {
    public static final float FILL_HEIGHT_PERCENT = 0.9f;

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void CraftForcedTutorial(@NotNull final List<CraftForcedTutorialAttachment> tutorialAttachments, @NotNull final Function0<Unit> onCloseClick, @Nullable Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(tutorialAttachments, "tutorialAttachments");
        Intrinsics.checkNotNullParameter(onCloseClick, "onCloseClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(951770232);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(951770232, i, -1, "com.blackhub.bronline.game.ui.craft.CraftForcedTutorial (CraftForcedTutorial.kt:33)");
        }
        composerStartRestartGroup.startReplaceableGroup(1465405213);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotIntStateKt.mutableIntStateOf(0);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        final MutableIntState mutableIntState = (MutableIntState) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        final PagerState pagerStateRememberPagerState = PagerStateKt.rememberPagerState(0, 0.0f, new Function0<Integer>() { // from class: com.blackhub.bronline.game.ui.craft.CraftForcedTutorialKt$CraftForcedTutorial$pagerState$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Integer invoke() {
                return Integer.valueOf(tutorialAttachments.size());
            }
        }, composerStartRestartGroup, 0, 3);
        int intValue = mutableIntState.getIntValue();
        composerStartRestartGroup.startReplaceableGroup(1465405364);
        boolean zChanged = composerStartRestartGroup.changed(intValue);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0<Integer>() { // from class: com.blackhub.bronline.game.ui.craft.CraftForcedTutorialKt$CraftForcedTutorial$colorLeftArrow$2$1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Integer invoke() {
                    return Integer.valueOf(mutableIntState.getIntValue() == 0 ? R.color.white_40 : R.color.white);
                }
            });
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        int intValue2 = mutableIntState.getIntValue();
        composerStartRestartGroup.startReplaceableGroup(1465405606);
        boolean zChanged2 = composerStartRestartGroup.changed(intValue2);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: com.blackhub.bronline.game.ui.craft.CraftForcedTutorialKt$CraftForcedTutorial$isEnabledLeftArrowClick$2$1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Boolean invoke() {
                    return Boolean.valueOf(mutableIntState.getIntValue() != 0);
                }
            });
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        composerStartRestartGroup.endReplaceableGroup();
        int intValue3 = mutableIntState.getIntValue();
        composerStartRestartGroup.startReplaceableGroup(1465405821);
        boolean zChanged3 = composerStartRestartGroup.changed(intValue3);
        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
        if (zChanged3 || objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0<Integer>() { // from class: com.blackhub.bronline.game.ui.craft.CraftForcedTutorialKt$CraftForcedTutorial$colorRightArrow$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Integer invoke() {
                    return Integer.valueOf(mutableIntState.getIntValue() == CollectionsKt__CollectionsKt.getLastIndex(tutorialAttachments) ? R.color.white_40 : R.color.white);
                }
            });
            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
        }
        composerStartRestartGroup.endReplaceableGroup();
        int intValue4 = mutableIntState.getIntValue();
        composerStartRestartGroup.startReplaceableGroup(1465406085);
        boolean zChanged4 = composerStartRestartGroup.changed(intValue4);
        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
        if (zChanged4 || objRememberedValue5 == companion.getEmpty()) {
            objRememberedValue5 = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: com.blackhub.bronline.game.ui.craft.CraftForcedTutorialKt$CraftForcedTutorial$isEnabledRightArrowClick$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Boolean invoke() {
                    return Boolean.valueOf(mutableIntState.getIntValue() != CollectionsKt__CollectionsKt.getLastIndex(tutorialAttachments));
                }
            });
            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
        }
        composerStartRestartGroup.endReplaceableGroup();
        int intValue5 = mutableIntState.getIntValue();
        composerStartRestartGroup.startReplaceableGroup(1465406316);
        boolean zChanged5 = composerStartRestartGroup.changed(intValue5);
        Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
        if (zChanged5 || objRememberedValue6 == companion.getEmpty()) {
            objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt___CollectionsKt.getOrNull(tutorialAttachments, mutableIntState.getIntValue()), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
        }
        composerStartRestartGroup.endReplaceableGroup();
        String upperCase = tutorialAttachments.get(mutableIntState.getIntValue()).getTutorialTitle().toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        TextStyle textStyleM14811montserratBoldCustomSpIzzofJo = TypographyStyle.INSTANCE.m14811montserratBoldCustomSpIzzofJo(R.dimen._14wsp, ColorResources_androidKt.colorResource(R.color.yellow, composerStartRestartGroup, 6), 0, 0L, 0.0f, null, null, composerStartRestartGroup, 12582918, 124);
        int size = tutorialAttachments.size();
        int intValue6 = mutableIntState.getIntValue();
        composerStartRestartGroup.startReplaceableGroup(1465407142);
        boolean z = (((i & 112) ^ 48) > 32 && composerStartRestartGroup.changed(onCloseClick)) || (i & 48) == 32;
        Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
        if (z || objRememberedValue7 == companion.getEmpty()) {
            objRememberedValue7 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftForcedTutorialKt$CraftForcedTutorial$1$1
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
                    onCloseClick.invoke();
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
        }
        composerStartRestartGroup.endReplaceableGroup();
        PanelInfoBlockKt.m15068PanelInfoBlockGF6hDo(0.9f, 0.9f, null, upperCase, 0L, textStyleM14811montserratBoldCustomSpIzzofJo, R.color.total_black_90, R.color.black_80, true, false, true, 0, 0, size, intValue6, R.dimen._6wdp, 0, 0, 0, 0, (Function0) objRememberedValue7, null, null, false, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1365482277, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftForcedTutorialKt.CraftForcedTutorial.2
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
                if ((i2 & 11) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1365482277, i2, -1, "com.blackhub.bronline.game.ui.craft.CraftForcedTutorial.<anonymous> (CraftForcedTutorial.kt:94)");
                }
                PagerState pagerState = pagerStateRememberPagerState;
                final List<CraftForcedTutorialAttachment> list = tutorialAttachments;
                Function1<Integer, Object> function1 = new Function1<Integer, Object>() { // from class: com.blackhub.bronline.game.ui.craft.CraftForcedTutorialKt.CraftForcedTutorial.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                        return invoke(num.intValue());
                    }

                    @NotNull
                    public final Object invoke(int i3) {
                        return list.get(i3).getTutorialTitle();
                    }
                };
                final PagerState pagerState2 = pagerStateRememberPagerState;
                final List<CraftForcedTutorialAttachment> list2 = tutorialAttachments;
                final MutableIntState mutableIntState2 = mutableIntState;
                PagerKt.m8350HorizontalPagerxYaah8o(pagerState, null, null, null, 0, 0.0f, null, null, false, false, function1, null, ComposableLambdaKt.composableLambda(composer2, 1630233784, true, new Function4<PagerScope, Integer, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftForcedTutorialKt.CraftForcedTutorial.2.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(PagerScope pagerScope, Integer num, Composer composer3, Integer num2) {
                        invoke(pagerScope, num.intValue(), composer3, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@NotNull PagerScope HorizontalPager, int i3, @Nullable Composer composer3, int i4) {
                        Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1630233784, i4, -1, "com.blackhub.bronline.game.ui.craft.CraftForcedTutorial.<anonymous>.<anonymous> (CraftForcedTutorial.kt:98)");
                        }
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        Modifier modifierFillMaxHeight = SizeKt.fillMaxHeight(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.9f);
                        Alignment bottomCenter = Alignment.INSTANCE.getBottomCenter();
                        PagerState pagerState3 = pagerState2;
                        List<CraftForcedTutorialAttachment> list3 = list2;
                        MutableIntState mutableIntState3 = mutableIntState2;
                        composer3.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(bottomCenter, false, composer3, 6);
                        composer3.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxHeight);
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer3);
                        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        composer3.startReplaceableGroup(1873552389);
                        if (pagerState3.getCurrentPage() == i3) {
                            CraftForcedTutorialKt.CraftForcedTutorial$lambda$2(mutableIntState3, i3);
                            ImageBitmapKt.m15118ImageBitmapAy9G7rc(list3.get(i3).getTutorialImg(), SizeKt.fillMaxHeight(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.9f), null, null, 0.0f, null, 0, composer3, 56, 124);
                        }
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composer2, 0, 384, 3070);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), composerStartRestartGroup, 920125494, 196614, ProfileVerifier.CompilationStatus.f342xf2722a21, 32446484);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftForcedTutorialKt.CraftForcedTutorial.3
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
                    CraftForcedTutorialKt.CraftForcedTutorial(tutorialAttachments, onCloseClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void PreviewCraftForcedTutorial(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1936097142);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1936097142, i, -1, "com.blackhub.bronline.game.ui.craft.PreviewCraftForcedTutorial (CraftForcedTutorial.kt:120)");
            }
            CraftForcedTutorial(CollectionsKt__CollectionsKt.listOf((Object[]) new CraftForcedTutorialAttachment[]{new CraftForcedTutorialAttachment("empty str", null, 2, null), new CraftForcedTutorialAttachment("empty str", null, 2, null), new CraftForcedTutorialAttachment("empty str", null, 2, null)}), new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftForcedTutorialKt.PreviewCraftForcedTutorial.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftForcedTutorialKt.PreviewCraftForcedTutorial.2
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
                    CraftForcedTutorialKt.PreviewCraftForcedTutorial(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void CraftForcedTutorial$lambda$2(MutableIntState mutableIntState, int i) {
        mutableIntState.setIntValue(i);
    }
}

