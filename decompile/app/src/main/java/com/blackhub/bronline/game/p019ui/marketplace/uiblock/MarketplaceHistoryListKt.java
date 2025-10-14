package com.blackhub.bronline.game.p019ui.marketplace.uiblock;

import android.annotation.SuppressLint;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
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
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.gui.marketplace.enums.MarketplaceHistoryStatusEnum;
import com.blackhub.bronline.game.gui.marketplace.enums.MarketplaceRarityEnum;
import com.blackhub.bronline.game.gui.marketplace.model.MarketplaceProduct;
import com.blackhub.bronline.game.p019ui.widget.scroll.CarouselScrollState;
import com.blackhub.bronline.game.p019ui.widget.scroll.ScrollKt;
import com.blackhub.bronline.game.p019ui.widget.scroll.SliderVerticalScrollerKt;
import com.bless.client.R;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options.IFramePlayerOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MarketplaceHistoryList.kt */
@Metadata(m7104d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001aA\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\nH\u0007¢\u0006\u0002\u0010\f\u001a\r\u0010\r\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, m7105d2 = {"MarketplaceHistoryList", "", "modifier", "Landroidx/compose/ui/Modifier;", "ifScrollBarVisible", "", IFramePlayerOptions.Builder.LIST, "", "Lcom/blackhub/bronline/game/gui/marketplace/model/MarketplaceProduct;", "onClickElement", "Lkotlin/Function1;", "", "(Landroidx/compose/ui/Modifier;ZLjava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "MarketplaceHistoryListPreview", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nMarketplaceHistoryList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketplaceHistoryList.kt\ncom/blackhub/bronline/game/ui/marketplace/uiblock/MarketplaceHistoryListKt\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,135:1\n87#2,6:136\n93#2:170\n97#2:224\n79#3,11:142\n79#3,11:177\n92#3:218\n92#3:223\n456#4,8:153\n464#4,3:167\n456#4,8:188\n464#4,3:202\n467#4,3:215\n467#4,3:220\n3737#5,6:161\n3737#5,6:196\n74#6,6:171\n80#6:205\n84#6:219\n1864#7,2:206\n1866#7:214\n1116#8,6:208\n*S KotlinDebug\n*F\n+ 1 MarketplaceHistoryList.kt\ncom/blackhub/bronline/game/ui/marketplace/uiblock/MarketplaceHistoryListKt\n*L\n39#1:136,6\n39#1:170\n39#1:224\n39#1:142,11\n42#1:177,11\n42#1:218\n39#1:223\n39#1:153,8\n39#1:167,3\n42#1:188,8\n42#1:202,3\n42#1:215,3\n39#1:220,3\n39#1:161,6\n42#1:196,6\n42#1:171,6\n42#1:205\n42#1:219\n48#1:206,2\n48#1:214\n51#1:208,6\n*E\n"})
/* loaded from: classes3.dex */
public final class MarketplaceHistoryListKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @SuppressLint({"UnrememberedMutableState"})
    public static final void MarketplaceHistoryList(@Nullable Modifier modifier, final boolean z, @NotNull final List<MarketplaceProduct> list, @NotNull final Function1<? super Integer, Unit> onClickElement, @Nullable Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(onClickElement, "onClickElement");
        Composer composerStartRestartGroup = composer.startRestartGroup(618464522);
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(618464522, i, -1, "com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceHistoryList (MarketplaceHistoryList.kt:30)");
        }
        boolean z2 = false;
        ?? r15 = 1;
        CarouselScrollState carouselScrollStateRememberCarouselScrollState = ScrollKt.rememberCarouselScrollState(0, composerStartRestartGroup, 0, 1);
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierM8125paddingVpY3zN4$default = PaddingKt.m8125paddingVpY3zN4$default(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._250wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._49wdp, composerStartRestartGroup, 6)), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composerStartRestartGroup, 6), 1, null);
        composerStartRestartGroup.startReplaceableGroup(693286680);
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Horizontal start = arrangement.getStart();
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion2.getTop(), composerStartRestartGroup, 0);
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
        Modifier modifier3 = modifierM8125paddingVpY3zN4$default;
        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.m8177width3ABfNKs(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._250wdp, composerStartRestartGroup, 6)), carouselScrollStateRememberCarouselScrollState, false, null, false, 14, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierVerticalScroll$default);
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
        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
        if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(-1028635939);
        final int i3 = 0;
        for (Object obj : list) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            MarketplaceProduct marketplaceProduct = (MarketplaceProduct) obj;
            composerStartRestartGroup.startReplaceableGroup(1839370822);
            boolean zChanged = (((((i & 7168) ^ 3072) <= 2048 || !composerStartRestartGroup.changed(onClickElement)) && (i & 3072) != 2048) ? z2 : r15) | composerStartRestartGroup.changed(i3);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceHistoryListKt$MarketplaceHistoryList$1$1$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
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
                        onClickElement.invoke(Integer.valueOf(i3));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifier4 = modifier3;
            MarketplaceLastPurchaseCardKt.MarketplaceLastPurchaseCard(ComposeExtensionKt.noRippleClickable$default(modifier4, z2, (Function0) objRememberedValue, r15, null), R.dimen._49wdp, R.dimen._12wsp, R.dimen._150wdp, R.dimen._59wdp, R.dimen._16wdp, R.dimen._18wdp, marketplaceProduct, composerStartRestartGroup, 18574768, 0);
            i3 = i4;
            modifier3 = modifier4;
            z2 = false;
            r15 = 1;
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (z) {
            composerStartRestartGroup.startReplaceableGroup(-1028635261);
            SliderVerticalScrollerKt.m15108SliderVerticalScrollermcqpVzo(SizeKt.fillMaxHeight$default(SizeKt.m8177width3ABfNKs(PaddingKt.m8124paddingVpY3zN4(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._8wdp, composerStartRestartGroup, 6)), 0.0f, 1, null), carouselScrollStateRememberCarouselScrollState, 0.0f, 0L, PrimitiveResources_androidKt.dimensionResource(R.dimen._44wdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._6wdp, composerStartRestartGroup, 6), null, null, composerStartRestartGroup, 0, 204);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(-1028634668);
            SpacerKt.Spacer(SizeKt.m8177width3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._28wdp, composerStartRestartGroup, 6)), composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier5 = modifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceHistoryListKt.MarketplaceHistoryList.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i5) {
                    MarketplaceHistoryListKt.MarketplaceHistoryList(modifier5, z, list, onClickElement, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void MarketplaceHistoryListPreview(@Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(2081561966);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2081561966, i, -1, "com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceHistoryListPreview (MarketplaceHistoryList.kt:85)");
            }
            MarketplaceHistoryStatusEnum marketplaceHistoryStatusEnum = MarketplaceHistoryStatusEnum.SOLD;
            MarketplaceProduct marketplaceProduct = new MarketplaceProduct(false, "Маска из мешковины", null, MarketplaceRarityEnum.LEGENDARY, null, 0, null, 0, 0, 0, 0, 0L, 0, null, null, null, 0.0d, 0, marketplaceHistoryStatusEnum, false, false, false, false, null, 15990773, null);
            MarketplaceHistoryStatusEnum marketplaceHistoryStatusEnum2 = MarketplaceHistoryStatusEnum.PURCHASED;
            MarketplaceProduct marketplaceProduct2 = new MarketplaceProduct(false, "Маска «Ведро»", null, MarketplaceRarityEnum.EPIC, null, 0, null, 0, 0, 0, 0, 0L, 0, null, null, null, 0.0d, 0, marketplaceHistoryStatusEnum2, true, false, false, false, null, 15990773, null);
            MarketplaceRarityEnum marketplaceRarityEnum = MarketplaceRarityEnum.COMMON;
            MarketplaceHistoryList(null, true, CollectionsKt__CollectionsKt.listOf((Object[]) new MarketplaceProduct[]{marketplaceProduct, marketplaceProduct2, new MarketplaceProduct(false, "Маска «Ленин»", null, marketplaceRarityEnum, null, 0, null, 0, 0, 0, 0, 0L, 0, null, null, null, 0.0d, 0, marketplaceHistoryStatusEnum, false, false, false, false, null, 15990773, null), new MarketplaceProduct(false, "Маска из мешковины", null, MarketplaceRarityEnum.UNCOMMON, null, 0, null, 0, 0, 0, 0, 0L, 0, null, null, null, 0.0d, 0, marketplaceHistoryStatusEnum2, false, false, false, false, null, 15990773, null), new MarketplaceProduct(false, "Маска «Ленин»", null, marketplaceRarityEnum, null, 0, null, 0, 0, 0, 0, 0L, 0, null, null, null, 0.0d, 0, marketplaceHistoryStatusEnum2, false, false, false, false, null, 15990773, null), new MarketplaceProduct(false, "Маска «Ленин»", null, marketplaceRarityEnum, null, 0, null, 0, 0, 0, 0, 0L, 0, null, null, null, 0.0d, 0, marketplaceHistoryStatusEnum2, false, false, false, false, null, 15990773, null), new MarketplaceProduct(false, "Маска «Ленин»", null, marketplaceRarityEnum, null, 0, null, 0, 0, 0, 0, 0L, 0, null, null, null, 0.0d, 0, marketplaceHistoryStatusEnum, false, false, false, false, null, 15990773, null)}), new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceHistoryListKt.MarketplaceHistoryListPreview.1
                public final void invoke(int i2) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 3632, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceHistoryListKt.MarketplaceHistoryListPreview.2
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
                    MarketplaceHistoryListKt.MarketplaceHistoryListPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
