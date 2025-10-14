package com.blackhub.bronline.game.p019ui.craft.uiblock;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
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
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import com.blackhub.bronline.game.gui.craft.model.response.CraftItemCategoryFilter;
import com.blackhub.bronline.game.p019ui.widget.checkbox.CheckBoxCustomKt;
import com.blackhub.bronline.game.p019ui.widget.utils.ImageBitmapKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CraftFilterCheckBoxWithTextItem.kt */
@SourceDebugExtension({"SMAP\nCraftFilterCheckBoxWithTextItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CraftFilterCheckBoxWithTextItem.kt\ncom/blackhub/bronline/game/ui/craft/uiblock/CraftFilterCheckBoxWithTextItemKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,118:1\n1116#2,6:119\n1116#2,6:125\n1116#2,6:131\n1116#2,6:137\n1116#2,6:178\n87#3,6:143\n93#3:177\n97#3:188\n79#4,11:149\n92#4:187\n456#5,8:160\n464#5,3:174\n467#5,3:184\n3737#6,6:168\n81#7:189\n107#7,2:190\n*S KotlinDebug\n*F\n+ 1 CraftFilterCheckBoxWithTextItem.kt\ncom/blackhub/bronline/game/ui/craft/uiblock/CraftFilterCheckBoxWithTextItemKt\n*L\n35#1:119,6\n38#1:125,6\n39#1:131,6\n47#1:137,6\n91#1:178,6\n51#1:143,6\n51#1:177\n51#1:188\n51#1:149,11\n51#1:187\n51#1:160,8\n51#1:174,3\n51#1:184,3\n51#1:168,6\n38#1:189\n38#1:190,2\n*E\n"})
/* loaded from: classes2.dex */
public final class CraftFilterCheckBoxWithTextItemKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void CraftFilterSelectItem(@NotNull final CraftItemCategoryFilter craftFilterItem, @NotNull final Function1<? super CraftItemCategoryFilter, Unit> onClickCheckBox, @Nullable Composer composer, final int i) {
        Modifier.Companion companion;
        int i2;
        Intrinsics.checkNotNullParameter(craftFilterItem, "craftFilterItem");
        Intrinsics.checkNotNullParameter(onClickCheckBox, "onClickCheckBox");
        Composer composerStartRestartGroup = composer.startRestartGroup(-82698565);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-82698565, i, -1, "com.blackhub.bronline.game.ui.craft.uiblock.CraftFilterSelectItem (CraftFilterCheckBoxWithTextItem.kt:33)");
        }
        composerStartRestartGroup.startReplaceableGroup(1268184793);
        boolean zChanged = composerStartRestartGroup.changed(craftFilterItem);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(craftFilterItem.getStateOfCheckBox()), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        final MutableState mutableState = (MutableState) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(1268184901);
        boolean zChanged2 = composerStartRestartGroup.changed(craftFilterItem);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        MutableState mutableState2 = (MutableState) objRememberedValue2;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(1268184981);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion2 = Composer.INSTANCE;
        if (objRememberedValue3 == companion2.getEmpty()) {
            objRememberedValue3 = InteractionSourceKt.MutableInteractionSource();
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objRememberedValue3;
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(mutableState.getValue(), new C54981(onClickCheckBox, craftFilterItem, mutableState2, null), composerStartRestartGroup, 64);
        composerStartRestartGroup.startReplaceableGroup(1268185193);
        boolean zChanged3 = composerStartRestartGroup.changed(mutableState2);
        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
        if (zChanged3 || objRememberedValue4 == companion2.getEmpty()) {
            objRememberedValue4 = new CraftFilterCheckBoxWithTextItemKt$CraftFilterSelectItem$2$1(mutableState2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
        }
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(craftFilterItem, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 72);
        Modifier.Companion companion3 = Modifier.INSTANCE;
        Modifier modifierM8126paddingqDBjuR0 = PaddingKt.m8126paddingqDBjuR0(SizeKt.m8157defaultMinSizeVpY3zN4$default(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._100wdp, composerStartRestartGroup, 6), 0.0f, 2, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._11wdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(craftFilterItem.getCustomEndPadding(), composerStartRestartGroup, 0), PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composerStartRestartGroup, 6));
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8126paddingqDBjuR0);
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
        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        CheckBoxCustomKt.CheckBoxCustom(SizeKt.m8172size3ABfNKs(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composerStartRestartGroup, 6)), mutableState, R.dimen._3wdp, R.dimen._1wdp, null, null, null, 0, null, Brush.Companion.m11289horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.yellow_orange, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.yellow_orange, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null), 0, composerStartRestartGroup, 3456, 0, CircularIndeterminateAnimatorDelegate.CONSTANT_ROTATION_DEGREES);
        composerStartRestartGroup.startReplaceableGroup(1161398172);
        if (craftFilterItem.getIconCDNBitmap() != null) {
            SpacerKt.Spacer(SizeKt.m8172size3ABfNKs(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._7wdp, composerStartRestartGroup, 6)), composerStartRestartGroup, 0);
            companion = companion3;
            i2 = 6;
            ImageBitmapKt.m15118ImageBitmapAy9G7rc(craftFilterItem.getIconCDNBitmap(), SizeKt.m8172size3ABfNKs(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composerStartRestartGroup, 6)), null, null, 0.0f, null, 0, composerStartRestartGroup, 8, 124);
        } else {
            companion = companion3;
            i2 = 6;
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._7wdp, composerStartRestartGroup, i2), 0.0f, 0.0f, 0.0f, 14, null);
        composerStartRestartGroup.startReplaceableGroup(1161398750);
        boolean zChanged4 = composerStartRestartGroup.changed(mutableState);
        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
        if (zChanged4 || objRememberedValue5 == companion2.getEmpty()) {
            objRememberedValue5 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftFilterCheckBoxWithTextItemKt$CraftFilterSelectItem$3$1$1
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
                    mutableState.setValue(Boolean.valueOf(!r0.getValue().booleanValue()));
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
        }
        composerStartRestartGroup.endReplaceableGroup();
        TextKt.m10024Text4IGK_g(craftFilterItem.getFilterName(), ClickableKt.m7803clickableO2vRcR0$default(modifierM8127paddingqDBjuR0$default, mutableInteractionSource, null, false, null, null, (Function0) objRememberedValue5, 28, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._12wsp, craftFilterItem.m14451getColor0d7_KjU(), 0, 0L, 0.0f, null, composerStartRestartGroup, 1572870, 60), composerStartRestartGroup, 0, 0, 65532);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftFilterCheckBoxWithTextItemKt.CraftFilterSelectItem.4
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

                public final void invoke(@Nullable Composer composer2, int i3) {
                    CraftFilterCheckBoxWithTextItemKt.CraftFilterSelectItem(craftFilterItem, onClickCheckBox, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void CraftFilterSelectItem$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* compiled from: CraftFilterCheckBoxWithTextItem.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.craft.uiblock.CraftFilterCheckBoxWithTextItemKt$CraftFilterSelectItem$1", m7120f = "CraftFilterCheckBoxWithTextItem.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.ui.craft.uiblock.CraftFilterCheckBoxWithTextItemKt$CraftFilterSelectItem$1 */
    /* loaded from: classes7.dex */
    public static final class C54981 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ CraftItemCategoryFilter $craftFilterItem;
        public final /* synthetic */ MutableState<Boolean> $isInit$delegate;
        public final /* synthetic */ Function1<CraftItemCategoryFilter, Unit> $onClickCheckBox;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C54981(Function1<? super CraftItemCategoryFilter, Unit> function1, CraftItemCategoryFilter craftItemCategoryFilter, MutableState<Boolean> mutableState, Continuation<? super C54981> continuation) {
            super(2, continuation);
            this.$onClickCheckBox = function1;
            this.$craftFilterItem = craftItemCategoryFilter;
            this.$isInit$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C54981(this.$onClickCheckBox, this.$craftFilterItem, this.$isInit$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C54981) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                if (CraftFilterCheckBoxWithTextItemKt.CraftFilterSelectItem$lambda$2(this.$isInit$delegate)) {
                    this.$onClickCheckBox.invoke(this.$craftFilterItem);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(name = "CraftFilterSelectItem")
    public static final void PreviewCraftFilterSelectItem(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1849274471);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1849274471, i, -1, "com.blackhub.bronline.game.ui.craft.uiblock.PreviewCraftFilterSelectItem (CraftFilterCheckBoxWithTextItem.kt:104)");
            }
            CraftFilterSelectItem(new CraftItemCategoryFilter(7, "Нет ресурсов", Color.INSTANCE.m11377getWhite0d7_KjU(), 2, "", R.dimen._50wdp, false, null, 128, null), new Function1<CraftItemCategoryFilter, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftFilterCheckBoxWithTextItemKt.PreviewCraftFilterSelectItem.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull CraftItemCategoryFilter it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CraftItemCategoryFilter craftItemCategoryFilter) {
                    invoke2(craftItemCategoryFilter);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftFilterCheckBoxWithTextItemKt.PreviewCraftFilterSelectItem.2
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
                    CraftFilterCheckBoxWithTextItemKt.PreviewCraftFilterSelectItem(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final boolean CraftFilterSelectItem$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }
}

