package com.blackhub.bronline.game.p019ui.brsimbanner;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
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
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.ClipKt;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
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
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.gui.brsimbanner.model.BrSimBannerItem;
import com.blackhub.bronline.game.gui.brsimbanner.model.BrSimBannerItemForRowStateModel;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options.IFramePlayerOptions;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BrSimBannerHorizontalPager.kt */
@Metadata(m7104d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\u001a\r\u0010\r\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u000e\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m7105d2 = {"HEIGHT_FOR_HORIZONTAL_PAGER_COLUMN", "", "HEIGHT_FOR_INDICATOR", "WEIGHT_FOR_ROW_OF_IMAGES", "WEIGHT_FOR_TEXT", "BrSimBannerHorizontalPager", "", IFramePlayerOptions.Builder.LIST, "", "Lcom/blackhub/bronline/game/gui/brsimbanner/model/BrSimBannerItem;", "pagerState", "Landroidx/compose/foundation/pager/PagerState;", "(Ljava/util/List;Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/runtime/Composer;I)V", "PreviewBrSimBannerHorizontalPager", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nBrSimBannerHorizontalPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BrSimBannerHorizontalPager.kt\ncom/blackhub/bronline/game/ui/brsimbanner/BrSimBannerHorizontalPagerKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,180:1\n74#2,6:181\n80#2:215\n84#2:259\n79#3,11:187\n79#3,11:221\n92#3:253\n92#3:258\n456#4,8:198\n464#4,3:212\n456#4,8:232\n464#4,3:246\n467#4,3:250\n467#4,3:255\n3737#5,6:206\n3737#5,6:240\n88#6,5:216\n93#6:249\n97#6:254\n*S KotlinDebug\n*F\n+ 1 BrSimBannerHorizontalPager.kt\ncom/blackhub/bronline/game/ui/brsimbanner/BrSimBannerHorizontalPagerKt\n*L\n46#1:181,6\n46#1:215\n46#1:259\n46#1:187,11\n87#1:221,11\n87#1:253\n46#1:258\n46#1:198,8\n46#1:212,3\n87#1:232,8\n87#1:246,3\n87#1:250,3\n46#1:255,3\n46#1:206,6\n87#1:240,6\n87#1:216,5\n87#1:249\n87#1:254\n*E\n"})
/* loaded from: classes2.dex */
public final class BrSimBannerHorizontalPagerKt {
    public static final float HEIGHT_FOR_HORIZONTAL_PAGER_COLUMN = 0.8f;
    public static final float HEIGHT_FOR_INDICATOR = 0.5f;
    public static final float WEIGHT_FOR_ROW_OF_IMAGES = 0.45f;
    public static final float WEIGHT_FOR_TEXT = 0.14f;

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void BrSimBannerHorizontalPager(@NotNull final List<BrSimBannerItem> list, @NotNull final PagerState pagerState, @Nullable Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(pagerState, "pagerState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1827427963);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1827427963, i, -1, "com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerHorizontalPager (BrSimBannerHorizontalPager.kt:44)");
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
        PagerKt.m8350HorizontalPagerxYaah8o(pagerState, null, null, PageSize.Fill.INSTANCE, list.size(), 0.0f, null, null, false, false, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 441944876, true, new Function4<PagerScope, Integer, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerHorizontalPagerKt$BrSimBannerHorizontalPager$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(PagerScope pagerScope, Integer num, Composer composer2, Integer num2) {
                invoke(pagerScope, num.intValue(), composer2, num2.intValue());
                return Unit.INSTANCE;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@NotNull PagerScope HorizontalPager, int i3, @Nullable Composer composer2, int i4) {
                Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(441944876, i4, -1, "com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerHorizontalPager.<anonymous>.<anonymous> (BrSimBannerHorizontalPager.kt:53)");
                }
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.fillMaxHeight(companion4, 0.8f), 0.0f, 1, null);
                Alignment.Companion companion5 = Alignment.INSTANCE;
                Alignment.Horizontal centerHorizontally = companion5.getCenterHorizontally();
                List<BrSimBannerItem> list2 = list;
                composer2.startReplaceableGroup(-483455358);
                Arrangement arrangement2 = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), centerHorizontally, composer2, 48);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
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
                Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyColumnMeasurePolicy2, companion6.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion6.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion6.getSetCompositeKeyHash();
                if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                TextKt.m10024Text4IGK_g(list2.get(i3).getText(), ColumnScope.weight$default(columnScopeInstance2, companion4, 0.14f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14843montserratMediumCustomSpbl3sdaw(R.dimen._10wsp, 0L, 0, 0L, 0.0f, composer2, 196614, 30), composer2, 0, 0, 65532);
                Modifier modifierWeight$default = ColumnScope.weight$default(columnScopeInstance2, companion4, 0.45f, false, 2, null);
                Alignment.Vertical centerVertically = companion5.getCenterVertically();
                Arrangement.HorizontalOrVertical spaceBetween = arrangement2.getSpaceBetween();
                composer2.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer2, 54);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierWeight$default);
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
                Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRowMeasurePolicy, companion6.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion6.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion6.getSetCompositeKeyHash();
                if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                composer2.startReplaceableGroup(1765572553);
                Iterator<T> it = list2.get(i3).getListOfTopItems().iterator();
                while (it.hasNext()) {
                    BrSimBannerItemForRowKt.BrSimBannerItemForRow((BrSimBannerItemForRowStateModel) it.next(), composer2, 0);
                }
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                Modifier modifierWeight$default2 = ColumnScope.weight$default(columnScopeInstance2, Modifier.INSTANCE, 0.45f, false, 2, null);
                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                Arrangement.HorizontalOrVertical spaceBetween2 = Arrangement.INSTANCE.getSpaceBetween();
                composer2.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween2, centerVertically2, composer2, 54);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor4 = companion7.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierWeight$default2);
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
                Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRowMeasurePolicy2, companion7.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion7.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion7.getSetCompositeKeyHash();
                if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                composer2.startReplaceableGroup(1765572964);
                Iterator<T> it2 = list2.get(i3).getListOfBotItems().iterator();
                while (it2.hasNext()) {
                    BrSimBannerItemForRowKt.BrSimBannerItemForRow((BrSimBannerItemForRowStateModel) it2.next(), composer2, 0);
                }
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), composerStartRestartGroup, ((i >> 3) & 14) | 3072, 384, 4070);
        Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(columnScopeInstance.align(SizeKt.wrapContentWidth$default(SizeKt.fillMaxHeight(companion, 0.5f), companion2.getCenterHorizontally(), false, 2, null), companion2.getCenterHorizontally()), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._8wdp, composerStartRestartGroup, 6), 0.0f, 0.0f, 13, null);
        Arrangement.HorizontalOrVertical center = arrangement.getCenter();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, companion2.getTop(), composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
        if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(-1628054380);
        int pageCount = pagerState.getPageCount();
        for (int i3 = 0; i3 < pageCount; i3++) {
            if (pagerState.getCurrentPage() == i3) {
                composerStartRestartGroup.startReplaceableGroup(1765573595);
                i2 = R.color.red;
            } else {
                composerStartRestartGroup.startReplaceableGroup(1765573627);
                i2 = R.color.white_25;
            }
            long jColorResource = ColorResources_androidKt.colorResource(i2, composerStartRestartGroup, 6);
            composerStartRestartGroup.endReplaceableGroup();
            BoxKt.Box(SizeKt.m8172size3ABfNKs(BackgroundKt.m7770backgroundbw27NRU(ClipKt.clip(PaddingKt.m8125paddingVpY3zN4$default(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._4wdp, composerStartRestartGroup, 6), 0.0f, 2, null), RoundedCornerShapeKt.getCircleShape()), jColorResource, RoundedCornerShapeKt.getCircleShape()), PrimitiveResources_androidKt.dimensionResource(R.dimen._9wdp, composerStartRestartGroup, 6)), composerStartRestartGroup, 0);
        }
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerHorizontalPagerKt.BrSimBannerHorizontalPager.2
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
                    BrSimBannerHorizontalPagerKt.BrSimBannerHorizontalPager(list, pagerState, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void PreviewBrSimBannerHorizontalPager(@Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1911054329);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1911054329, i, -1, "com.blackhub.bronline.game.ui.brsimbanner.PreviewBrSimBannerHorizontalPager (BrSimBannerHorizontalPager.kt:114)");
            }
            final List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new BrSimBannerItem[]{new BrSimBannerItem(StringResources_androidKt.stringResource(R.string.br_sim_banner_text_for_pager_1, composerStartRestartGroup, 6), CollectionsKt__CollectionsKt.listOf((Object[]) new BrSimBannerItemForRowStateModel[]{new BrSimBannerItemForRowStateModel(StringExtensionKt.htmlTextToAnnotatedString(StringResources_androidKt.stringResource(R.string.br_sim_banner_prize_1, composerStartRestartGroup, 6)), R.color.gray, R.drawable.ic_br_logo_no_white, 0.8f, 0.0f, 16, null), new BrSimBannerItemForRowStateModel(StringExtensionKt.htmlTextToAnnotatedString(StringResources_androidKt.stringResource(R.string.br_sim_banner_prize_2, composerStartRestartGroup, 6)), R.color.gray, R.drawable.ic_youtube, 0.7f, 0.0f, 16, null), new BrSimBannerItemForRowStateModel(StringExtensionKt.htmlTextToAnnotatedString(StringResources_androidKt.stringResource(R.string.br_sim_banner_prize_3, composerStartRestartGroup, 6)), R.color.gray, R.drawable.ic_twitch, 0.7f, 0.0f, 16, null)}), CollectionsKt__CollectionsKt.listOf((Object[]) new BrSimBannerItemForRowStateModel[]{new BrSimBannerItemForRowStateModel(StringExtensionKt.htmlTextToAnnotatedString(StringResources_androidKt.stringResource(R.string.br_sim_banner_prize_4, composerStartRestartGroup, 6)), R.color.yellow, R.drawable.vip_gold, 0.0f, 0.0f, 24, null), new BrSimBannerItemForRowStateModel(StringExtensionKt.htmlTextToAnnotatedString(StringResources_androidKt.stringResource(R.string.br_sim_banner_prize_5, composerStartRestartGroup, 6)), R.color.light_blue, R.drawable.x2_cash, 1.5f, 0.0f, 16, null)})), new BrSimBannerItem(StringResources_androidKt.stringResource(R.string.br_sim_banner_text_for_pager_2, composerStartRestartGroup, 6), CollectionsKt__CollectionsKt.listOf((Object[]) new BrSimBannerItemForRowStateModel[]{new BrSimBannerItemForRowStateModel(StringExtensionKt.htmlTextToAnnotatedString(StringResources_androidKt.stringResource(R.string.br_sim_banner_prize_6, composerStartRestartGroup, 6)), R.color.yellow, R.drawable.vip_gold, 0.0f, 0.0f, 24, null), new BrSimBannerItemForRowStateModel(StringExtensionKt.htmlTextToAnnotatedString(StringResources_androidKt.stringResource(R.string.br_sim_banner_prize_7, composerStartRestartGroup, 6)), R.color.light_blue, R.drawable.ic_br_sim_banner_skin, 0.0f, 0.8f, 8, null)}), CollectionsKt__CollectionsJVMKt.listOf(new BrSimBannerItemForRowStateModel(StringExtensionKt.htmlTextToAnnotatedString(StringResources_androidKt.stringResource(R.string.br_sim_banner_prize_8, composerStartRestartGroup, 6)), R.color.dark_orange, R.drawable.ic_br_sim_banner_car_for_month, 0.0f, 1.3f, 8, null)))});
            BrSimBannerHorizontalPager(listListOf, PagerStateKt.rememberPagerState(0, 0.0f, new Function0<Integer>() { // from class: com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerHorizontalPagerKt.PreviewBrSimBannerHorizontalPager.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Integer invoke() {
                    return Integer.valueOf(listListOf.size());
                }
            }, composerStartRestartGroup, 0, 3), composerStartRestartGroup, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerHorizontalPagerKt.PreviewBrSimBannerHorizontalPager.2
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
                    BrSimBannerHorizontalPagerKt.PreviewBrSimBannerHorizontalPager(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
