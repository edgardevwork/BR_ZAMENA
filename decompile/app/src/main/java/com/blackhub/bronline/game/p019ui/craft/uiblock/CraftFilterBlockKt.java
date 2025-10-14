package com.blackhub.bronline.game.p019ui.craft.uiblock;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.FlowRowScopeInstance;
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
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.gui.craft.model.response.CraftCategoryFilter;
import com.blackhub.bronline.game.gui.craft.model.response.CraftItemCategoryFilter;
import com.blackhub.bronline.game.p019ui.widget.button.ButtonWithLineKt;
import com.blackhub.bronline.game.p019ui.widget.scroll.CarouselScrollState;
import com.blackhub.bronline.game.p019ui.widget.scroll.ScrollKt;
import com.blackhub.bronline.game.p019ui.widget.scroll.SliderVerticalScrollerKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
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
import org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CraftFilterBlock.kt */
@Metadata(m7104d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001ar\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\b2!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00010\fH\u0007¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, m7105d2 = {"CraftFilterBlock", "", "filterList", "", "Lcom/blackhub/bronline/game/gui/craft/model/response/CraftCategoryFilter;", "isBlockOpen", "", "onResetClick", "Lkotlin/Function0;", "onApplyOrHideClick", "onHideClick", "onCheckBoxClick", "Lkotlin/Function1;", "Lcom/blackhub/bronline/game/gui/craft/model/response/CraftItemCategoryFilter;", "Lkotlin/ParameterName;", "name", "craftFilterItem", "(Ljava/util/List;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "PreviewCraftFilterBlock", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nCraftFilterBlock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CraftFilterBlock.kt\ncom/blackhub/bronline/game/ui/craft/uiblock/CraftFilterBlockKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,280:1\n1116#2,6:281\n67#3,7:287\n74#3:322\n78#3:327\n79#4,11:294\n92#4:326\n456#5,8:305\n464#5,3:319\n467#5,3:323\n3737#6,6:313\n*S KotlinDebug\n*F\n+ 1 CraftFilterBlock.kt\ncom/blackhub/bronline/game/ui/craft/uiblock/CraftFilterBlockKt\n*L\n56#1:281,6\n58#1:287,7\n58#1:322\n58#1:327\n58#1:294,11\n58#1:326\n58#1:305,8\n58#1:319,3\n58#1:323,3\n58#1:313,6\n*E\n"})
/* loaded from: classes2.dex */
public final class CraftFilterBlockKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void CraftFilterBlock(@NotNull final List<CraftCategoryFilter> filterList, final boolean z, @NotNull final Function0<Unit> onResetClick, @NotNull final Function0<Unit> onApplyOrHideClick, @Nullable Function0<Unit> function0, @NotNull final Function1<? super CraftItemCategoryFilter, Unit> onCheckBoxClick, @Nullable Composer composer, final int i, final int i2) {
        final Function0<Unit> function02;
        int i3;
        Intrinsics.checkNotNullParameter(filterList, "filterList");
        Intrinsics.checkNotNullParameter(onResetClick, "onResetClick");
        Intrinsics.checkNotNullParameter(onApplyOrHideClick, "onApplyOrHideClick");
        Intrinsics.checkNotNullParameter(onCheckBoxClick, "onCheckBoxClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1265401402);
        if ((i2 & 16) != 0) {
            i3 = i & (-57345);
            function02 = onApplyOrHideClick;
        } else {
            function02 = function0;
            i3 = i;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1265401402, i3, -1, "com.blackhub.bronline.game.ui.craft.uiblock.CraftFilterBlock (CraftFilterBlock.kt:52)");
        }
        final CarouselScrollState carouselScrollStateRememberCarouselScrollState = ScrollKt.rememberCarouselScrollState(0, composerStartRestartGroup, 0, 1);
        final boolean z2 = carouselScrollStateRememberCarouselScrollState.getMaxValue() != 0;
        composerStartRestartGroup.startReplaceableGroup(-1043230539);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        final MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        Alignment.Companion companion = Alignment.INSTANCE;
        Alignment centerEnd = companion.getCenterEnd();
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Modifier.Companion companion2 = Modifier.INSTANCE;
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(centerEnd, false, composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion2);
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
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        int i4 = (i3 >> 3) & 14;
        ComposeExtensionKt.IfTrue(Boolean.valueOf(z), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2021299932, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftFilterBlockKt$CraftFilterBlock$1$1
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
                        ComposerKt.traceEventStart(-2021299932, i5, -1, "com.blackhub.bronline.game.ui.craft.uiblock.CraftFilterBlock.<anonymous>.<anonymous> (CraftFilterBlock.kt:59)");
                    }
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                    composer2.startReplaceableGroup(-1720406298);
                    boolean zChanged = composer2.changed(function02);
                    final Function0<Unit> function03 = function02;
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftFilterBlockKt$CraftFilterBlock$1$1$1$1
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
                                function03.invoke();
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    BoxKt.Box(ClickableKt.m7803clickableO2vRcR0$default(modifierFillMaxSize$default, mutableInteractionSource2, null, false, null, null, (Function0) objRememberedValue2, 28, null), composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, i4 | 48);
        final Function0<Unit> function03 = function02;
        AnimatedVisibilityKt.AnimatedVisibility(z, (Modifier) null, EnterExitTransitionKt.slideInHorizontally$default(null, new Function1<Integer, Integer>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftFilterBlockKt$CraftFilterBlock$1$2
            @NotNull
            public final Integer invoke(int i5) {
                return Integer.valueOf(i5);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                return invoke(num.intValue());
            }
        }, 1, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, companion.getEnd(), false, null, 13, null)).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null)), EnterExitTransitionKt.slideOutHorizontally$default(null, new Function1<Integer, Integer>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftFilterBlockKt$CraftFilterBlock$1$3
            @NotNull
            public final Integer invoke(int i5) {
                return Integer.valueOf(i5);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                return invoke(num.intValue());
            }
        }, 1, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, companion.getEnd(), false, null, 13, null)).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1381929252, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftFilterBlockKt$CraftFilterBlock$1$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                invoke(animatedVisibilityScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@NotNull AnimatedVisibilityScope AnimatedVisibility, @Nullable Composer composer2, int i5) {
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1381929252, i5, -1, "com.blackhub.bronline.game.ui.craft.uiblock.CraftFilterBlock.<anonymous>.<anonymous> (CraftFilterBlock.kt:78)");
                }
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Modifier modifierM7771backgroundbw27NRU$default = BackgroundKt.m7771backgroundbw27NRU$default(SizeKt.m8177width3ABfNKs(SizeKt.fillMaxHeight$default(companion4, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._288wdp, composer2, 6)), ColorResources_androidKt.colorResource(R.color.black_gray_blue_2, composer2, 6), null, 2, null);
                final CarouselScrollState carouselScrollState = carouselScrollStateRememberCarouselScrollState;
                boolean z3 = z2;
                List<CraftCategoryFilter> list = filterList;
                Function1<CraftItemCategoryFilter, Unit> function1 = onCheckBoxClick;
                final Function0<Unit> function04 = onResetClick;
                final Function0<Unit> function05 = onApplyOrHideClick;
                composer2.startReplaceableGroup(733328855);
                Alignment.Companion companion5 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion5.getTopStart(), false, composer2, 0);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM7771backgroundbw27NRU$default);
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
                Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion6.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion6.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion6.getSetCompositeKeyHash();
                if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                Function1<CraftItemCategoryFilter, Unit> function12 = function1;
                TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.craft_title_filter_setting, composer2, 6), PaddingKt.m8127paddingqDBjuR0$default(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._16wdp, composer2, 6), 0.0f, 0.0f, 12, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._12wsp, ColorResources_androidKt.colorResource(R.color.white, composer2, 6), 0, 0L, 0.0f, null, composer2, 1572870, 60), composer2, 0, 0, 65532);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m8127paddingqDBjuR0$default(SizeKt.fillMaxHeight$default(PaddingKt.m8127paddingqDBjuR0$default(companion4, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._37wdp, composer2, 6), 0.0f, 0.0f, 13, null), 0.0f, 1, null), 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._68wdp, composer2, 6), 7, null), 0.0f, 1, null);
                composer2.startReplaceableGroup(693286680);
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion5.getTop(), composer2, 0);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
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
                Modifier modifierM8177width3ABfNKs = SizeKt.m8177width3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composer2, 6));
                Alignment center = companion5.getCenter();
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor4 = companion6.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM8177width3ABfNKs);
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
                Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRememberBoxMeasurePolicy3, companion6.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion6.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion6.getSetCompositeKeyHash();
                if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                ComposeExtensionKt.IfTrue(Boolean.valueOf(z3), ComposableLambdaKt.composableLambda(composer2, 1144012396, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftFilterBlockKt$CraftFilterBlock$1$4$1$1$1$1
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
                    public final void invoke(@Nullable Composer composer3, int i6) {
                        if ((i6 & 11) != 2 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1144012396, i6, -1, "com.blackhub.bronline.game.ui.craft.uiblock.CraftFilterBlock.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CraftFilterBlock.kt:108)");
                            }
                            SliderVerticalScrollerKt.m15108SliderVerticalScrollermcqpVzo(PaddingKt.m8125paddingVpY3zN4$default(SizeKt.m8177width3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._3sdp, composer3, 6)), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._7wdp, composer3, 6), 1, null), carouselScrollState, 0.0f, 0L, 0.0f, 0.0f, null, null, composer3, 0, SnappyCompressorOutputStream.FOUR_SIZE_BYTE_MARKER);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }), composer2, 48);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(ScrollKt.verticalScroll$default(companion4, carouselScrollState, false, null, false, 14, null), 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer2, 6), 0.0f, 11, null);
                composer2.startReplaceableGroup(1098475987);
                MeasurePolicy measurePolicyRowMeasurementHelper = FlowLayoutKt.rowMeasurementHelper(arrangement.getStart(), arrangement.getTop(), Integer.MAX_VALUE, composer2, 0);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor5 = companion6.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor5);
                } else {
                    composer2.useNode();
                }
                Composer composerM10870constructorimpl5 = Updater.m10870constructorimpl(composer2);
                Updater.m10877setimpl(composerM10870constructorimpl5, measurePolicyRowMeasurementHelper, companion6.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl5, currentCompositionLocalMap5, companion6.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion6.getSetCompositeKeyHash();
                if (composerM10870constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    composerM10870constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                    composerM10870constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                }
                function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                FlowRowScopeInstance flowRowScopeInstance = FlowRowScopeInstance.INSTANCE;
                composer2.startReplaceableGroup(-316788818);
                for (CraftCategoryFilter craftCategoryFilter : list) {
                    CraftFilterDividerTextItemKt.CraftFilterDividerTextItem(craftCategoryFilter.getCategoryFilterName(), composer2, 0);
                    composer2.startReplaceableGroup(-1574507072);
                    for (CraftItemCategoryFilter craftItemCategoryFilter : craftCategoryFilter.getFilters()) {
                        composer2.startReplaceableGroup(1442557001);
                        final Function1<CraftItemCategoryFilter, Unit> function13 = function12;
                        boolean zChanged = composer2.changed(function13);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<CraftItemCategoryFilter, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftFilterBlockKt$CraftFilterBlock$1$4$1$1$2$1$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(CraftItemCategoryFilter craftItemCategoryFilter2) {
                                    invoke2(craftItemCategoryFilter2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull CraftItemCategoryFilter item) {
                                    Intrinsics.checkNotNullParameter(item, "item");
                                    function13.invoke(item);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        CraftFilterCheckBoxWithTextItemKt.CraftFilterSelectItem(craftItemCategoryFilter, (Function1) objRememberedValue2, composer2, 8);
                        function12 = function13;
                    }
                    composer2.endReplaceableGroup();
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
                Modifier.Companion companion7 = Modifier.INSTANCE;
                Modifier modifierM8127paddingqDBjuR0$default2 = PaddingKt.m8127paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion7, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._16wdp, composer2, 6), 7, null);
                Alignment.Companion companion8 = Alignment.INSTANCE;
                Modifier modifierAlign = boxScopeInstance2.align(modifierM8127paddingqDBjuR0$default2, companion8.getBottomCenter());
                Arrangement.HorizontalOrVertical spaceEvenly = Arrangement.INSTANCE.getSpaceEvenly();
                composer2.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceEvenly, companion8.getTop(), composer2, 6);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor6 = companion9.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierAlign);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor6);
                } else {
                    composer2.useNode();
                }
                Composer composerM10870constructorimpl6 = Updater.m10870constructorimpl(composer2);
                Updater.m10877setimpl(composerM10870constructorimpl6, measurePolicyRowMeasurePolicy2, companion9.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl6, currentCompositionLocalMap6, companion9.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion9.getSetCompositeKeyHash();
                if (composerM10870constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                    composerM10870constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                    composerM10870constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                }
                function3ModifierMaterializerOf6.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion7, PrimitiveResources_androidKt.dimensionResource(R.dimen._95wdp, composer2, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._36wdp, composer2, 6));
                String strStringResource = StringResources_androidKt.stringResource(R.string.craft_filter_refresh, composer2, 6);
                composer2.startReplaceableGroup(-316787396);
                boolean zChanged2 = composer2.changed(function04);
                Object objRememberedValue3 = composer2.rememberedValue();
                if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftFilterBlockKt$CraftFilterBlock$1$4$1$2$1$1
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
                            function04.invoke();
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                composer2.endReplaceableGroup();
                ButtonWithLineKt.ButtonWithLine(modifierM8158height3ABfNKs, R.color.gray_blue, 0, 0, strStringResource, false, 0, 0.0f, (Function0) objRememberedValue3, composer2, 48, 236);
                Modifier modifierM8158height3ABfNKs2 = SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion7, PrimitiveResources_androidKt.dimensionResource(R.dimen._150wdp, composer2, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._36wdp, composer2, 6));
                String strStringResource2 = StringResources_androidKt.stringResource(R.string.common_apply, composer2, 6);
                composer2.startReplaceableGroup(-316786947);
                boolean zChanged3 = composer2.changed(function05);
                Object objRememberedValue4 = composer2.rememberedValue();
                if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftFilterBlockKt$CraftFilterBlock$1$4$1$2$2$1
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
                            function05.invoke();
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue4);
                }
                composer2.endReplaceableGroup();
                ButtonWithLineKt.ButtonWithLine(modifierM8158height3ABfNKs2, R.color.gray_blue, 0, 0, strStringResource2, false, 0, 0.0f, (Function0) objRememberedValue4, composer2, 48, 236);
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
        }), composerStartRestartGroup, i4 | 200064, 18);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftFilterBlockKt.CraftFilterBlock.2
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
                    CraftFilterBlockKt.CraftFilterBlock(filterList, z, onResetClick, onApplyOrHideClick, function03, onCheckBoxClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void PreviewCraftFilterBlock(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-634939921);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-634939921, i, -1, "com.blackhub.bronline.game.ui.craft.uiblock.PreviewCraftFilterBlock (CraftFilterBlock.kt:171)");
            }
            CraftFilterBlock(CollectionsKt__CollectionsKt.listOf((Object[]) new CraftCategoryFilter[]{new CraftCategoryFilter(1, "Редкость", CollectionsKt__CollectionsKt.listOf((Object[]) new CraftItemCategoryFilter[]{new CraftItemCategoryFilter(1, "Обычные", ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6), 1, "", R.dimen._1wdp, false, null, 128, null), new CraftItemCategoryFilter(2, "Необычные", ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6), 1, "", R.dimen._1wdp, false, null, 128, null), new CraftItemCategoryFilter(3, "Редкие", ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6), 1, "", R.dimen._1wdp, false, null, 128, null), new CraftItemCategoryFilter(4, "Эпические", ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6), 1, "", R.dimen._1wdp, false, null, 128, null), new CraftItemCategoryFilter(5, "Легендарные", ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6), 1, "", R.dimen._1wdp, false, null, 128, null)})), new CraftCategoryFilter(2, "Ресурсы", CollectionsKt__CollectionsKt.listOf((Object[]) new CraftItemCategoryFilter[]{new CraftItemCategoryFilter(6, "Есть ресурсы", ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6), 2, "", R.dimen._50wdp, false, null, 128, null), new CraftItemCategoryFilter(7, "Нет ресурсов", ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6), 2, "", R.dimen._50wdp, false, null, 128, null)})), new CraftCategoryFilter(3, "Доступность", CollectionsKt__CollectionsKt.listOf((Object[]) new CraftItemCategoryFilter[]{new CraftItemCategoryFilter(8, "Открыто", ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6), 3, "", R.dimen._1wdp, false, null, 128, null), new CraftItemCategoryFilter(9, "Закрыто", ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6), 3, "", R.dimen._1wdp, false, null, 128, null)}))}), true, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftFilterBlockKt.PreviewCraftFilterBlock.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftFilterBlockKt.PreviewCraftFilterBlock.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, null, new Function1<CraftItemCategoryFilter, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftFilterBlockKt.PreviewCraftFilterBlock.3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull CraftItemCategoryFilter it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CraftItemCategoryFilter craftItemCategoryFilter) {
                    invoke2(craftItemCategoryFilter);
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 200120, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftFilterBlockKt.PreviewCraftFilterBlock.4
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
                    CraftFilterBlockKt.PreviewCraftFilterBlock(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
