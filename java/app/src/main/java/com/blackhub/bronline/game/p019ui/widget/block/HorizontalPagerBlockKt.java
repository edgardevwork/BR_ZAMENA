package com.blackhub.bronline.game.p019ui.widget.block;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PageSize;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.ClipKt;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.tooling.preview.Preview;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.blackhub.bronline.game.gui.fractions.Const;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HorizontalPagerBlock.kt */
@SourceDebugExtension({"SMAP\nHorizontalPagerBlock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HorizontalPagerBlock.kt\ncom/blackhub/bronline/game/ui/widget/block/HorizontalPagerBlockKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,96:1\n74#2,6:97\n80#2:131\n84#2:175\n79#3,11:103\n79#3,11:137\n92#3:169\n92#3:174\n456#4,8:114\n464#4,3:128\n456#4,8:148\n464#4,3:162\n467#4,3:166\n467#4,3:171\n3737#5,6:122\n3737#5,6:156\n88#6,5:132\n93#6:165\n97#6:170\n*S KotlinDebug\n*F\n+ 1 HorizontalPagerBlock.kt\ncom/blackhub/bronline/game/ui/widget/block/HorizontalPagerBlockKt\n*L\n39#1:97,6\n39#1:131\n39#1:175\n39#1:103,11\n51#1:137,11\n51#1:169\n39#1:174\n39#1:114,8\n39#1:128,3\n51#1:148,8\n51#1:162,3\n51#1:166,3\n39#1:171,3\n39#1:122,6\n51#1:156,6\n51#1:132,5\n51#1:165\n51#1:170\n*E\n"})
/* loaded from: classes3.dex */
public final class HorizontalPagerBlockKt {
    public static final float HEIGHT_FOR_INDICATOR = 0.5f;

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void HorizontalPagerBlock(@NotNull final PagerState pagerState, int i, @NotNull final Function3<? super Integer, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, final int i2) {
        Composer composer2;
        final int i3;
        int i4;
        Intrinsics.checkNotNullParameter(pagerState, "pagerState");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2055008519);
        int i5 = (i2 & 14) == 0 ? (composerStartRestartGroup.changed(pagerState) ? 4 : 2) | i2 : i2;
        if ((i2 & 112) == 0) {
            i5 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(content) ? 256 : 128;
        }
        if ((i5 & 731) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2055008519, i5, -1, "com.blackhub.bronline.game.ui.widget.block.HorizontalPagerBlock (HorizontalPagerBlock.kt:37)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
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
            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            PagerKt.m8350HorizontalPagerxYaah8o(pagerState, null, null, PageSize.Fill.INSTANCE, i, 0.0f, null, null, false, false, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1741762144, true, new Function4<PagerScope, Integer, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.HorizontalPagerBlockKt$HorizontalPagerBlock$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
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
                public final void invoke(@NotNull PagerScope HorizontalPager, int i6, @Nullable Composer composer3, int i7) {
                    Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1741762144, i7, -1, "com.blackhub.bronline.game.ui.widget.block.HorizontalPagerBlock.<anonymous>.<anonymous> (HorizontalPagerBlock.kt:46)");
                    }
                    content.invoke(Integer.valueOf(i6), composer3, Integer.valueOf((i7 >> 3) & 14));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, (i5 & 14) | 3072 | ((i5 << 9) & 57344), 384, 4070);
            composer2 = composerStartRestartGroup;
            composer2.startReplaceableGroup(-824018751);
            i3 = i;
            if (i3 > 1) {
                Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(columnScopeInstance.align(SizeKt.wrapContentWidth$default(SizeKt.fillMaxHeight(companion, 0.5f), companion2.getCenterHorizontally(), false, 2, null), companion2.getCenterHorizontally()), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._6sdp, composer2, 6), 0.0f, 0.0f, 13, null);
                Arrangement.HorizontalOrVertical center = arrangement.getCenter();
                composer2.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, companion2.getTop(), composer2, 6);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
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
                Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                composer2.startReplaceableGroup(1678294283);
                int pageCount = pagerState.getPageCount();
                for (int i6 = 0; i6 < pageCount; i6++) {
                    if (pagerState.getCurrentPage() == i6) {
                        composer2.startReplaceableGroup(-777796006);
                        i4 = R.color.red;
                    } else {
                        composer2.startReplaceableGroup(-777795974);
                        i4 = R.color.white_25;
                    }
                    long jColorResource = ColorResources_androidKt.colorResource(i4, composer2, 6);
                    composer2.endReplaceableGroup();
                    BoxKt.Box(SizeKt.m8172size3ABfNKs(BackgroundKt.m7770backgroundbw27NRU(ClipKt.clip(PaddingKt.m8125paddingVpY3zN4$default(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._2sdp, composer2, 6), 0.0f, 2, null), RoundedCornerShapeKt.getCircleShape()), jColorResource, RoundedCornerShapeKt.getCircleShape()), PrimitiveResources_androidKt.dimensionResource(R.dimen._8sdp, composer2, 6)), composer2, 0);
                }
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
            }
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            i3 = i;
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.HorizontalPagerBlockKt.HorizontalPagerBlock.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i7) {
                    HorizontalPagerBlockKt.HorizontalPagerBlock(pagerState, i3, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(device = "spec:width=360dp,height=640dp,dpi=420,isRound=false,chinSize=0dp,orientation=landscape", name = "Phone 360 x 640 Android small")
    public static final void PreviewHorizontalPagerBlock(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1940520925);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1940520925, i, -1, "com.blackhub.bronline.game.ui.widget.block.PreviewHorizontalPagerBlock (HorizontalPagerBlock.kt:82)");
            }
            HorizontalPagerBlock(PagerStateKt.rememberPagerState(0, 0.0f, new Function0<Integer>() { // from class: com.blackhub.bronline.game.ui.widget.block.HorizontalPagerBlockKt$PreviewHorizontalPagerBlock$pagerState$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Integer invoke() {
                    return 2;
                }
            }, composerStartRestartGroup, 384, 3), 2, ComposableSingletons$HorizontalPagerBlockKt.INSTANCE.m15041getLambda1$app_siteRelease(), composerStartRestartGroup, 432);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.HorizontalPagerBlockKt.PreviewHorizontalPagerBlock.1
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
                    HorizontalPagerBlockKt.PreviewHorizontalPagerBlock(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

