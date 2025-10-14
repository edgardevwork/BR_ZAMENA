package com.blackhub.bronline.game.p019ui.craft.uiblock;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextStyle;
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
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import com.blackhub.bronline.game.common.resources.StringResourceCompose;
import com.blackhub.bronline.game.gui.craft.model.CraftElement;
import com.blackhub.bronline.game.gui.craft.model.CraftItemTextBlock;
import com.blackhub.bronline.game.p019ui.widget.block.ImageAndStatusBlockKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
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

/* compiled from: CraftPreviewBlock.kt */
@SourceDebugExtension({"SMAP\nCraftPreviewBlock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CraftPreviewBlock.kt\ncom/blackhub/bronline/game/ui/craft/uiblock/CraftPreviewBlockKt\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,109:1\n87#2,6:110\n93#2:144\n97#2:229\n79#3,11:116\n79#3,11:151\n79#3,11:186\n92#3:218\n92#3:223\n92#3:228\n456#4,8:127\n464#4,3:141\n456#4,8:162\n464#4,3:176\n456#4,8:197\n464#4,3:211\n467#4,3:215\n467#4,3:220\n467#4,3:225\n3737#5,6:135\n3737#5,6:170\n3737#5,6:205\n74#6,6:145\n80#6:179\n74#6,6:180\n80#6:214\n84#6:219\n84#6:224\n*S KotlinDebug\n*F\n+ 1 CraftPreviewBlock.kt\ncom/blackhub/bronline/game/ui/craft/uiblock/CraftPreviewBlockKt\n*L\n36#1:110,6\n36#1:144\n36#1:229\n36#1:116,11\n46#1:151,11\n56#1:186,11\n56#1:218\n46#1:223\n36#1:228\n36#1:127,8\n36#1:141,3\n46#1:162,8\n46#1:176,3\n56#1:197,8\n56#1:211,3\n56#1:215,3\n46#1:220,3\n36#1:225,3\n36#1:135,6\n46#1:170,6\n56#1:205,6\n46#1:145,6\n46#1:179\n56#1:180,6\n56#1:214\n56#1:219\n46#1:224\n*E\n"})
/* loaded from: classes2.dex */
public final class CraftPreviewBlockKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void CraftPreviewBlock(@Nullable Modifier modifier, @NotNull final CraftElement selectedElement, final boolean z, final boolean z2, @NotNull final Function0<Unit> onVipClick, @Nullable Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(selectedElement, "selectedElement");
        Intrinsics.checkNotNullParameter(onVipClick, "onVipClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-776131014);
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-776131014, i, -1, "com.blackhub.bronline.game.ui.craft.uiblock.CraftPreviewBlock (CraftPreviewBlock.kt:32)");
        }
        ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
        composerStartRestartGroup.startReplaceableGroup(693286680);
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Horizontal start = arrangement.getStart();
        Alignment.Companion companion = Alignment.INSTANCE;
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion.getTop(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier2);
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
        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        int i3 = i << 3;
        ImageAndStatusBlockKt.ImageAndStatusBlock(R.dimen._148wdp, selectedElement, true, z, z2, onVipClick, composerStartRestartGroup, (i3 & 7168) | 454 | (57344 & i3) | (i3 & 458752), 0);
        Modifier.Companion companion3 = Modifier.INSTANCE;
        Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(PaddingKt.m8127paddingqDBjuR0$default(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._11wdp, composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._148wdp, composerStartRestartGroup, 6));
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM8158height3ABfNKs);
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
        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
        if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
        TextKt.m10024Text4IGK_g(selectedElement.getTextBlock().getName(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._20wsp, 0L, 0, 0L, 0.0f, null, composerStartRestartGroup, 1572870, 62), composerStartRestartGroup, 0, 0, 65534);
        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(PaddingKt.m8127paddingqDBjuR0$default(companion3, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._4wdp, composerStartRestartGroup, 6), 0.0f, 0.0f, 13, null), 0.0f, 1, null), scrollStateRememberScrollState, false, null, false, 14, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierVerticalScroll$default);
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
        Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
        if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
        }
        function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        TextStyle textStyleM14862montserratSemiBoldCustomSpcv9FZhg = typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._12wsp, 0L, 0, 0L, 0.0f, null, composerStartRestartGroup, 1572870, 62);
        StringResourceCompose stringResourceCompose = StringResourceCompose.INSTANCE;
        TextKt.m10025TextIbK3jfQ(stringResourceCompose.craftTimerForCrafting(selectedElement.getTextBlock().getTimeOfPreparation(), composerStartRestartGroup, 48), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, textStyleM14862montserratSemiBoldCustomSpcv9FZhg, composerStartRestartGroup, 0, 0, 131070);
        TextKt.m10025TextIbK3jfQ(stringResourceCompose.craftChanceIsWithVIPPlatinum(z, selectedElement.getTextBlock().chanceOfCraft(z), composerStartRestartGroup, ((i >> 6) & 14) | 384), PaddingKt.m8127paddingqDBjuR0$default(companion3, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composerStartRestartGroup, 6), 0.0f, 0.0f, 13, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._12wsp, 0L, 0, 0L, 0.0f, null, composerStartRestartGroup, 1572870, 62), composerStartRestartGroup, 0, 0, 131068);
        TextKt.m10025TextIbK3jfQ(stringResourceCompose.craftElementWeight(selectedElement.getTextBlock().getWeightStrValue(), composerStartRestartGroup, 48), PaddingKt.m8127paddingqDBjuR0$default(companion3, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composerStartRestartGroup, 6), 0.0f, 0.0f, 13, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._12wsp, 0L, 0, 0L, 0.0f, null, composerStartRestartGroup, 1572870, 62), composerStartRestartGroup, 0, 0, 131068);
        TextKt.m10024Text4IGK_g(selectedElement.getTextBlock().getDescription(), PaddingKt.m8127paddingqDBjuR0$default(companion3, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._12wdp, composerStartRestartGroup, 6), 0.0f, 0.0f, 13, null), ColorResources_androidKt.colorResource(R.color.white_40, composerStartRestartGroup, 6), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._10wsp, 0L, 0, 0L, 0.0f, null, composerStartRestartGroup, 1572870, 62), composerStartRestartGroup, 0, 0, 65528);
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
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier3 = modifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftPreviewBlockKt.CraftPreviewBlock.2
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
                    CraftPreviewBlockKt.CraftPreviewBlock(modifier3, selectedElement, z, z2, onVipClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(name = "CraftPreviewBlock")
    public static final void PreviewCraftPreviewBlock(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1697965697);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1697965697, i, -1, "com.blackhub.bronline.game.ui.craft.uiblock.PreviewCraftPreviewBlock (CraftPreviewBlock.kt:91)");
            }
            CraftPreviewBlock(SizeKt.m8177width3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._500wdp, composerStartRestartGroup, 6)), new CraftElement(0, 0, null, 0, 0, 0, null, null, null, 0, new CraftItemTextBlock("Крутая маска", "99 ч 39 мин 44 сек", 25, 35, 9.99f, "description"), null, 0, null, 0, 0, 64511, null), true, true, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftPreviewBlockKt.PreviewCraftPreviewBlock.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 28096, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftPreviewBlockKt.PreviewCraftPreviewBlock.2
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
                    CraftPreviewBlockKt.PreviewCraftPreviewBlock(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

