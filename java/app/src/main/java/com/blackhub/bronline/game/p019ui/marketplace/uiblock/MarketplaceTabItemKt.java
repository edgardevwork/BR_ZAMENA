package com.blackhub.bronline.game.p019ui.marketplace.uiblock;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.CacheDrawScope;
import androidx.compose.p003ui.draw.DrawModifierKt;
import androidx.compose.p003ui.draw.DrawResult;
import androidx.compose.p003ui.graphics.BlendMode;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.graphics.CompositingStrategy;
import androidx.compose.p003ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p003ui.graphics.GraphicsLayerScope;
import androidx.compose.p003ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.graphics.painter.Painter;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.unit.C2046Dp;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.gui.marketplace.model.MarketplaceTab;
import com.blackhub.bronline.game.p019ui.widget.block.cloud.CloudArrowLeftBlockKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MarketplaceTabItem.kt */
@SourceDebugExtension({"SMAP\nMarketplaceTabItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketplaceTabItem.kt\ncom/blackhub/bronline/game/ui/marketplace/uiblock/MarketplaceTabItemKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,131:1\n1549#2:132\n1620#2,3:133\n87#3,6:136\n93#3:170\n97#3:220\n79#4,11:142\n79#4,11:176\n92#4:214\n92#4:219\n456#5,8:153\n464#5,3:167\n456#5,8:187\n464#5,3:201\n467#5,3:211\n467#5,3:216\n3737#6,6:161\n3737#6,6:195\n69#7,5:171\n74#7:204\n78#7:215\n1116#8,6:205\n*S KotlinDebug\n*F\n+ 1 MarketplaceTabItem.kt\ncom/blackhub/bronline/game/ui/marketplace/uiblock/MarketplaceTabItemKt\n*L\n48#1:132\n48#1:133,3\n58#1:136,6\n58#1:170\n58#1:220\n58#1:142,11\n59#1:176,11\n59#1:214\n58#1:219\n58#1:153,8\n58#1:167,3\n59#1:187,8\n59#1:201,3\n59#1:211,3\n58#1:216,3\n58#1:161,6\n59#1:195,6\n59#1:171,5\n59#1:204\n59#1:215\n76#1:205,6\n*E\n"})
/* loaded from: classes3.dex */
public final class MarketplaceTabItemKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void MarketplaceTabItem(@Nullable Modifier modifier, @NotNull final MarketplaceTab tab, final boolean z, @Nullable Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        Composer composerStartRestartGroup = composer.startRestartGroup(2038505825);
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2038505825, i, -1, "com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceTabItem (MarketplaceTabItem.kt:45)");
        }
        Brush.Companion companion = Brush.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(-1021992343);
        List<Integer> iconColorList = tab.getIconColorList();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iconColorList, 10));
        Iterator<T> it = iconColorList.iterator();
        while (it.hasNext()) {
            arrayList.add(Color.m11330boximpl(ColorResources_androidKt.colorResource(((Number) it.next()).intValue(), composerStartRestartGroup, 0)));
        }
        composerStartRestartGroup.endReplaceableGroup();
        final Brush brushM11297verticalGradient8A3gB4$default = Brush.Companion.m11297verticalGradient8A3gB4$default(companion, arrayList, 0.0f, 0.0f, 0, 14, (Object) null);
        final Brush brushM11289horizontalGradient8A3gB4$default = Brush.Companion.m11289horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black_gray_blue, composerStartRestartGroup, 6)), Color.m11330boximpl(Color.INSTANCE.m11375getTransparent0d7_KjU())}), 0.0f, 0.0f, 0, 14, (Object) null);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        Alignment.Vertical centerVertically = companion2.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        Modifier.Companion companion4 = Modifier.INSTANCE;
        Modifier modifierM7770backgroundbw27NRU = BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8172size3ABfNKs(PaddingKt.m8125paddingVpY3zN4$default(companion4, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._6wdp, composerStartRestartGroup, 6), 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composerStartRestartGroup, 6)), ColorResources_androidKt.colorResource(tab.getIconBgColor(), composerStartRestartGroup, 0), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composerStartRestartGroup, 6)));
        Alignment center = companion2.getCenter();
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM7770backgroundbw27NRU);
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
        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
        if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        final BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Painter painterPainterResource = PainterResources_androidKt.painterResource(tab.getIcon(), composerStartRestartGroup, 0);
        Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(OffsetKt.m8084offsetVpY3zN4$default(SizeKt.m8172size3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._18wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(tab.getPadding(), composerStartRestartGroup, 0), 0.0f, 2, null), new Function1<GraphicsLayerScope, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceTabItemKt$MarketplaceTabItem$1$1$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                invoke2(graphicsLayerScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull GraphicsLayerScope graphicsLayer) {
                Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.mo11531setCompositingStrategyaDBOjCE(CompositingStrategy.INSTANCE.m11431getOffscreenNrFUSI());
            }
        });
        composerStartRestartGroup.startReplaceableGroup(-818885935);
        boolean zChanged = composerStartRestartGroup.changed(brushM11297verticalGradient8A3gB4$default);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1<CacheDrawScope, DrawResult>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceTabItemKt$MarketplaceTabItem$1$1$2$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final DrawResult invoke(@NotNull CacheDrawScope drawWithCache) {
                    Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
                    final Brush brush = brushM11297verticalGradient8A3gB4$default;
                    return drawWithCache.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceTabItemKt$MarketplaceTabItem$1$1$2$1.1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                            invoke2(contentDrawScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull ContentDrawScope onDrawWithContent) {
                            Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
                            onDrawWithContent.drawContent();
                            DrawScope.m11883drawRectAsUm42w$default(onDrawWithContent, brush, 0L, 0L, 0.0f, null, null, BlendMode.INSTANCE.m11279getSrcAtop0nO6VwU(), 62, null);
                        }
                    });
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        final Modifier modifier3 = modifier2;
        ImageKt.Image(painterPainterResource, (String) null, DrawModifierKt.drawWithCache(modifierGraphicsLayer, (Function1) objRememberedValue), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
        ComposeExtensionKt.IfTrue(Boolean.valueOf(tab.isHaveUpdates()), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1205457503, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceTabItemKt$MarketplaceTabItem$1$1$3
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
                        ComposerKt.traceEventStart(1205457503, i3, -1, "com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceTabItem.<anonymous>.<anonymous>.<anonymous> (MarketplaceTabItem.kt:84)");
                    }
                    BoxKt.Box(boxScopeInstance.align(BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8172size3ABfNKs(OffsetKt.m8083offsetVpY3zN4(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._7wdp, composer2, 6), C2046Dp.m13666constructorimpl(-PrimitiveResources_androidKt.dimensionResource(R.dimen._7wdp, composer2, 6))), PrimitiveResources_androidKt.dimensionResource(R.dimen._14wdp, composer2, 6)), ColorResources_androidKt.colorResource(R.color.red, composer2, 6), RoundedCornerShapeKt.getCircleShape()), Alignment.INSTANCE.getTopEnd()), composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, 48);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        ComposeExtensionKt.IfTrue(Boolean.valueOf(z), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1232432293, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceTabItemKt$MarketplaceTabItem$1$2
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
                        ComposerKt.traceEventStart(1232432293, i3, -1, "com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceTabItem.<anonymous>.<anonymous> (MarketplaceTabItem.kt:98)");
                    }
                    final MarketplaceTab marketplaceTab = tab;
                    CloudArrowLeftBlockKt.CloudArrowLeftBlock(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._194wdp, composer2, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composer2, 6)), brushM11289horizontalGradient8A3gB4$default, null, null, null, new float[]{0.05f, 0.2f}, null, ComposableLambdaKt.composableLambda(composer2, 1434349477, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceTabItemKt$MarketplaceTabItem$1$2.1
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
                                    ComposerKt.traceEventStart(1434349477, i4, -1, "com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceTabItem.<anonymous>.<anonymous>.<anonymous> (MarketplaceTabItem.kt:105)");
                                }
                                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                MarketplaceTab marketplaceTab2 = marketplaceTab;
                                composer3.startReplaceableGroup(-483455358);
                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                composer3.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor3);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composer3);
                                Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                }
                                function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                String strStringResource = StringResources_androidKt.stringResource(marketplaceTab2.getHintTitle(), composer3, 0);
                                TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
                                TextKt.m10024Text4IGK_g(strStringResource, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._9wsp, 0L, 0, 0L, 0.0f, null, null, composer3, 12582918, 126), composer3, 0, 0, 65534);
                                TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(marketplaceTab2.getHintDescription(), composer3, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14843montserratMediumCustomSpbl3sdaw(R.dimen._9wsp, 0L, 0, 0L, 0.0f, composer3, 196614, 30), composer3, 0, 0, 65534);
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
                    }), composer2, 12845056, 92);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, 48 | ((i >> 6) & 14));
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceTabItemKt.MarketplaceTabItem.2
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
                    MarketplaceTabItemKt.MarketplaceTabItem(modifier3, tab, z, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void MarketplaceCategoryItemPreview(@Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(730998769);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(730998769, i, -1, "com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceCategoryItemPreview (MarketplaceTabItem.kt:124)");
            }
            MarketplaceTabItem(Modifier.INSTANCE, new MarketplaceTab(false, 2, null, 0, 0, true, false, null, 221, null), true, composerStartRestartGroup, 454, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceTabItemKt.MarketplaceCategoryItemPreview.1
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
                    MarketplaceTabItemKt.MarketplaceCategoryItemPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

