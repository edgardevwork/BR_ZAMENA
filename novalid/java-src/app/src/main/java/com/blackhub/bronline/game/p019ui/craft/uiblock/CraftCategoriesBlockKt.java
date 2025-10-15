package com.blackhub.bronline.game.p019ui.craft.uiblock;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.AlphaKt;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
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
import androidx.profileinstaller.ProfileVerifier;
import com.blackhub.bronline.game.core.extension.BooleanExtensionKt;
import com.blackhub.bronline.game.core.extension.FloatExtensionKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.core.utils.attachment.main.CommonButtonCategory;
import com.blackhub.bronline.game.p019ui.widget.other.TriangleWidgetKt;
import com.bless.client.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CraftCategoriesBlock.kt */
@Metadata(m7104d1 = {"\u00002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a[\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\rH\u0007¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0011\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m7105d2 = {"ANGLE", "", "CraftCategoriesBlock", "", "modifier", "Landroidx/compose/ui/Modifier;", "categories", "", "Lcom/blackhub/bronline/game/core/utils/attachment/main/CommonButtonCategory;", "onArrowBottomClick", "Lkotlin/Function0;", "onArrowTopClick", "onCategoryClick", "Lkotlin/Function2;", "", "(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "CraftCategoriesBlockPreview", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nCraftCategoriesBlock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CraftCategoriesBlock.kt\ncom/blackhub/bronline/game/ui/craft/uiblock/CraftCategoriesBlockKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,115:1\n64#2:116\n1116#3,6:117\n1116#3,6:123\n1116#3,6:160\n1116#3,6:202\n1116#3,6:214\n78#4,2:129\n80#4:159\n75#4,5:166\n80#4:199\n84#4:213\n84#4:224\n79#5,11:131\n79#5,11:171\n92#5:212\n92#5:223\n456#6,8:142\n464#6,3:156\n456#6,8:182\n464#6,3:196\n467#6,3:209\n467#6,3:220\n3737#7,6:150\n3737#7,6:190\n1864#8,2:200\n1866#8:208\n*S KotlinDebug\n*F\n+ 1 CraftCategoriesBlock.kt\ncom/blackhub/bronline/game/ui/craft/uiblock/CraftCategoriesBlockKt\n*L\n41#1:116\n43#1:117,6\n47#1:123,6\n63#1:160,6\n77#1:202,6\n92#1:214,6\n51#1:129,2\n51#1:159\n67#1:166,5\n67#1:199\n67#1:213\n51#1:224\n51#1:131,11\n67#1:171,11\n67#1:212\n51#1:223\n51#1:142,8\n51#1:156,3\n67#1:182,8\n67#1:196,3\n67#1:209,3\n51#1:220,3\n51#1:150,6\n67#1:190,6\n73#1:200,2\n73#1:208\n*E\n"})
/* loaded from: classes2.dex */
public final class CraftCategoriesBlockKt {
    public static final float ANGLE = 180.0f;

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void CraftCategoriesBlock(@Nullable Modifier modifier, @NotNull final List<CommonButtonCategory> categories, @NotNull final Function0<Unit> onArrowBottomClick, @NotNull final Function0<Unit> onArrowTopClick, @NotNull final Function2<? super CommonButtonCategory, ? super Integer, Unit> onCategoryClick, @Nullable Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(onArrowBottomClick, "onArrowBottomClick");
        Intrinsics.checkNotNullParameter(onArrowTopClick, "onArrowTopClick");
        Intrinsics.checkNotNullParameter(onCategoryClick, "onCategoryClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1983389898);
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1983389898, i, -1, "com.blackhub.bronline.game.ui.craft.uiblock.CraftCategoriesBlock (CraftCategoriesBlock.kt:38)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierM8084offsetVpY3zN4$default = OffsetKt.m8084offsetVpY3zN4$default(companion, C2046Dp.m13666constructorimpl(-PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composerStartRestartGroup, 6)), 0.0f, 2, null);
        composerStartRestartGroup.startReplaceableGroup(-657091243);
        boolean zChanged = composerStartRestartGroup.changed(categories);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            CommonButtonCategory commonButtonCategory = (CommonButtonCategory) CollectionsKt___CollectionsKt.firstOrNull((List) categories);
            objRememberedValue = Float.valueOf(BooleanExtensionKt.getOrFalse(commonButtonCategory != null ? Boolean.valueOf(commonButtonCategory.isSelected()) : null) ? 0.5f : 1.0f);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        float fFloatValue = ((Number) objRememberedValue).floatValue();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-657091102);
        boolean zChanged2 = composerStartRestartGroup.changed(categories);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            CommonButtonCategory commonButtonCategory2 = (CommonButtonCategory) CollectionsKt___CollectionsKt.lastOrNull((List) categories);
            objRememberedValue2 = Float.valueOf(BooleanExtensionKt.getOrFalse(commonButtonCategory2 != null ? Boolean.valueOf(commonButtonCategory2.isSelected()) : null) ? 0.5f : 1.0f);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        float fFloatValue2 = ((Number) objRememberedValue2).floatValue();
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(SizeKt.m8177width3ABfNKs(modifier2, PrimitiveResources_androidKt.dimensionResource(R.dimen._36wdp, composerStartRestartGroup, 6)), 0.0f, 1, null);
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
        Alignment.Companion companion2 = Alignment.INSTANCE;
        Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(spaceBetween, centerHorizontally, composerStartRestartGroup, 54);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxHeight$default);
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
        Modifier modifierAlpha = AlphaKt.alpha(modifierM8084offsetVpY3zN4$default, fFloatValue);
        boolean zIsOne = FloatExtensionKt.isOne(Float.valueOf(fFloatValue));
        composerStartRestartGroup.startReplaceableGroup(607413555);
        boolean z = (((i & 7168) ^ 3072) > 2048 && composerStartRestartGroup.changed(onArrowTopClick)) || (i & 3072) == 2048;
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (z || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue3 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftCategoriesBlockKt$CraftCategoriesBlock$1$1$1
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
                    onArrowTopClick.invoke();
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        composerStartRestartGroup.endReplaceableGroup();
        final Modifier modifier3 = modifier2;
        TriangleWidgetKt.m15099TriangleWidgetm7uSSuA(ClickableKt.m7805clickableXHw0xAI$default(modifierAlpha, zIsOne, null, null, (Function0) objRememberedValue3, 6, null), 0.0f, 0.0f, 0L, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 0, 126);
        boolean z2 = true;
        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
        Arrangement.HorizontalOrVertical center = arrangement.getCenter();
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(center, companion2.getStart(), composerStartRestartGroup, 6);
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
        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
        if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        composerStartRestartGroup.startReplaceableGroup(607413847);
        final int i3 = 0;
        for (Object obj : categories) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            final CommonButtonCategory commonButtonCategory3 = (CommonButtonCategory) obj;
            Modifier.Companion companion4 = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(1189954780);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CraftCategoryItemKt.CraftCategoryItem(ClickableKt.m7803clickableO2vRcR0$default(companion4, (MutableInteractionSource) objRememberedValue4, null, false, null, null, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftCategoriesBlockKt$CraftCategoriesBlock$1$2$1$2
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
                    onCategoryClick.invoke(commonButtonCategory3, Integer.valueOf(i3));
                }
            }, 28, null), commonButtonCategory3, composerStartRestartGroup, 64, 0);
            i3 = i4;
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierAlpha2 = AlphaKt.alpha(PaddingKt.m8127paddingqDBjuR0$default(modifierM8084offsetVpY3zN4$default, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composerStartRestartGroup, 6), 0.0f, 0.0f, 13, null), fFloatValue2);
        boolean zIsOne2 = FloatExtensionKt.isOne(Float.valueOf(fFloatValue2));
        composerStartRestartGroup.startReplaceableGroup(607414598);
        if ((((i & 896) ^ 384) <= 256 || !composerStartRestartGroup.changed(onArrowBottomClick)) && (i & 384) != 256) {
            z2 = false;
        }
        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
        if (z2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue5 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftCategoriesBlockKt$CraftCategoriesBlock$1$3$1
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
                    onArrowBottomClick.invoke();
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
        }
        composerStartRestartGroup.endReplaceableGroup();
        TriangleWidgetKt.m15099TriangleWidgetm7uSSuA(ClickableKt.m7805clickableXHw0xAI$default(modifierAlpha2, zIsOne2, null, null, (Function0) objRememberedValue5, 6, null), 0.0f, 0.0f, 0L, 0.0f, 180.0f, 0.0f, composerStartRestartGroup, ProfileVerifier.CompilationStatus.f342xf2722a21, 94);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftCategoriesBlockKt.CraftCategoriesBlock.2
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
                    CraftCategoriesBlockKt.CraftCategoriesBlock(modifier3, categories, onArrowBottomClick, onArrowTopClick, onCategoryClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void CraftCategoriesBlockPreview(@Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(772849017);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(772849017, i, -1, "com.blackhub.bronline.game.ui.craft.uiblock.CraftCategoriesBlockPreview (CraftCategoriesBlock.kt:101)");
            }
            CraftCategoriesBlock(null, CollectionsKt__CollectionsKt.listOf((Object[]) new CommonButtonCategory[]{new CommonButtonCategory(0, null, null, false, true, null, null, 111, null), new CommonButtonCategory(0, null, null, true, false, null, null, 119, null), new CommonButtonCategory(0, null, null, false, false, null, null, 127, null), new CommonButtonCategory(0, null, null, false, false, null, null, 127, null)}), new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftCategoriesBlockKt.CraftCategoriesBlockPreview.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftCategoriesBlockKt.CraftCategoriesBlockPreview.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function2<CommonButtonCategory, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftCategoriesBlockKt.CraftCategoriesBlockPreview.3
                public final void invoke(@NotNull CommonButtonCategory commonButtonCategory, int i2) {
                    Intrinsics.checkNotNullParameter(commonButtonCategory, "<anonymous parameter 0>");
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(CommonButtonCategory commonButtonCategory, Integer num) {
                    invoke(commonButtonCategory, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 28096, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftCategoriesBlockKt.CraftCategoriesBlockPreview.4
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
                    CraftCategoriesBlockKt.CraftCategoriesBlockPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
