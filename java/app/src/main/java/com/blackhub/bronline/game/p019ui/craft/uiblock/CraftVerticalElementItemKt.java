package com.blackhub.bronline.game.p019ui.craft.uiblock;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.text.style.TextOverflow;
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
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.blackhub.bronline.game.common.resources.StringResourceCompose;
import com.blackhub.bronline.game.core.enums.CommonRarityEnum;
import com.blackhub.bronline.game.gui.craft.enums.CraftElementStatusEnum;
import com.blackhub.bronline.game.gui.craft.enums.CraftScreenTypeEnum;
import com.blackhub.bronline.game.gui.craft.model.CraftElement;
import com.blackhub.bronline.game.gui.craft.model.CraftItemTextBlock;
import com.blackhub.bronline.game.p019ui.widget.block.ClickAnimateBlockKt;
import com.blackhub.bronline.game.p019ui.widget.block.ImageAndStatusBlockKt;
import com.blackhub.bronline.game.p019ui.widget.timer.CountDownTimerDorHorMKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
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

/* compiled from: CraftVerticalElementItem.kt */
@SourceDebugExtension({"SMAP\nCraftVerticalElementItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CraftVerticalElementItem.kt\ncom/blackhub/bronline/game/ui/craft/uiblock/CraftVerticalElementItemKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,181:1\n1116#2,6:182\n1116#2,6:188\n81#3:194\n81#3:195\n*S KotlinDebug\n*F\n+ 1 CraftVerticalElementItem.kt\ncom/blackhub/bronline/game/ui/craft/uiblock/CraftVerticalElementItemKt\n*L\n48#1:182,6\n51#1:188,6\n48#1:194\n51#1:195\n*E\n"})
/* loaded from: classes2.dex */
public final class CraftVerticalElementItemKt {

    /* compiled from: CraftVerticalElementItem.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CraftScreenTypeEnum.values().length];
            try {
                iArr[CraftScreenTypeEnum.PROGRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CraftScreenTypeEnum.STASH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void CraftVerticalElementItem(@NotNull final CraftElement element, final boolean z, @NotNull final CraftScreenTypeEnum currentScreen, @NotNull final Function1<? super CraftElement, Unit> onItemClick, @NotNull final Function1<? super CraftElement, Unit> isNeedToDeleteElement, @Nullable Composer composer, final int i) {
        int i2;
        float fDimensionResource;
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(currentScreen, "currentScreen");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        Intrinsics.checkNotNullParameter(isNeedToDeleteElement, "isNeedToDeleteElement");
        Composer composerStartRestartGroup = composer.startRestartGroup(1478233632);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1478233632, i, -1, "com.blackhub.bronline.game.ui.craft.uiblock.CraftVerticalElementItem (CraftVerticalElementItem.kt:45)");
        }
        final float fDimensionResource2 = PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(1796965819);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            i2 = 2;
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(RoundedCornerShapeKt.m8394RoundedCornerShapea9UjIt4$default(0.0f, fDimensionResource2, 0.0f, 0.0f, 13, null), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        } else {
            i2 = 2;
        }
        final MutableState mutableState = (MutableState) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(1796965924);
        boolean z2 = (((i & 112) ^ 48) > 32 && composerStartRestartGroup.changed(z)) || (i & 48) == 32;
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (z2 || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0<Brush>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftVerticalElementItemKt$CraftVerticalElementItem$borderBrush$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Brush invoke() {
                    long jM11375getTransparent0d7_KjU;
                    if (z) {
                        jM11375getTransparent0d7_KjU = Color.INSTANCE.m11377getWhite0d7_KjU();
                    } else {
                        jM11375getTransparent0d7_KjU = Color.INSTANCE.m11375getTransparent0d7_KjU();
                    }
                    return Brush.Companion.m11289horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(Color.INSTANCE.m11375getTransparent0d7_KjU()), Color.m11330boximpl(jM11375getTransparent0d7_KjU)}), 0.0f, 0.0f, 0, 14, (Object) null);
                }
            });
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        final State state = (State) objRememberedValue2;
        composerStartRestartGroup.endReplaceableGroup();
        final AnnotatedString annotatedStringCraftElementStatus = StringResourceCompose.INSTANCE.craftElementStatus(element.getElementState(), currentScreen, composerStartRestartGroup, ((i >> 3) & 112) | 384);
        int i3 = WhenMappings.$EnumSwitchMapping$0[currentScreen.ordinal()];
        if (i3 == 1 || i3 == i2) {
            composerStartRestartGroup.startReplaceableGroup(1796966532);
            fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._110wdp, composerStartRestartGroup, 6);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(1796966588);
            fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._180wdp, composerStartRestartGroup, 6);
            composerStartRestartGroup.endReplaceableGroup();
        }
        final float f = fDimensionResource;
        ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(PaddingKt.m8127paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composerStartRestartGroup, 6), 7, null), null, false, null, false, false, false, false, null, 0, 0L, null, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftVerticalElementItemKt.CraftVerticalElementItem.1
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
                onItemClick.invoke(element);
            }
        }, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -532299217, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftVerticalElementItemKt.CraftVerticalElementItem.2
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

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@Nullable Composer composer2, int i4) {
                final CraftElement craftElement;
                if ((i4 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-532299217, i4, -1, "com.blackhub.bronline.game.ui.craft.uiblock.CraftVerticalElementItem.<anonymous> (CraftVerticalElementItem.kt:77)");
                    }
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    Alignment centerStart = companion2.getCenterStart();
                    CraftElement craftElement2 = element;
                    MutableState<RoundedCornerShape> mutableState2 = mutableState;
                    State<Brush> state2 = state;
                    float f2 = f;
                    AnnotatedString annotatedString = annotatedStringCraftElementStatus;
                    float f3 = fDimensionResource2;
                    final Function1<CraftElement, Unit> function1 = isNeedToDeleteElement;
                    composer2.startReplaceableGroup(733328855);
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(centerStart, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion4.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion3);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier modifierM7784borderziNgDLE = BorderKt.m7784borderziNgDLE(BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._250wdp, composer2, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._49wdp, composer2, 6)), ColorResources_androidKt.colorResource(R.color.total_black_50, composer2, 6), CraftVerticalElementItemKt.CraftVerticalElementItem$lambda$1(mutableState2)), PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composer2, 6), CraftVerticalElementItemKt.CraftVerticalElementItem$lambda$3(state2), CraftVerticalElementItemKt.CraftVerticalElementItem$lambda$1(mutableState2));
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM7784borderziNgDLE);
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
                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    Modifier modifierAlign = boxScopeInstance.align(SizeKt.m8177width3ABfNKs(PaddingKt.m8127paddingqDBjuR0$default(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._57wdp, composer2, 6), 0.0f, 0.0f, 0.0f, 14, null), f2), companion2.getCenterStart());
                    TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
                    TextKt.m10024Text4IGK_g(craftElement2.getTextBlock().getName(), modifierAlign, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m13608getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._12wsp, 0L, 0, 0L, 0.0f, null, composer2, 1572870, 62), composer2, 0, 3120, 55292);
                    TextKt.m10025TextIbK3jfQ(annotatedString, boxScopeInstance.align(PaddingKt.m8127paddingqDBjuR0$default(companion3, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer2, 6), 0.0f, 11, null), companion2.getCenterEnd()), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._12wsp, 0L, 0, 0L, 0.0f, null, composer2, 1572870, 62), composer2, 0, 0, 131068);
                    Long valueOfTimer = craftElement2.getValueOfTimer();
                    composer2.startReplaceableGroup(791386183);
                    if (valueOfTimer == null) {
                        craftElement = craftElement2;
                    } else {
                        craftElement = craftElement2;
                        CountDownTimerDorHorMKt.CountDownTimerDorHorM(boxScopeInstance.align(PaddingKt.m8124paddingVpY3zN4(BackgroundKt.background$default(companion3, Brush.Companion.m11297verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.yellow, composer2, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.yellow_orange, composer2, 6))}), 0.0f, 0.0f, 0, 14, (Object) null), RoundedCornerShapeKt.m8394RoundedCornerShapea9UjIt4$default(0.0f, f3, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composer2, 6), 5, null), 0.0f, 4, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._14wdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composer2, 6)), companion2.getTopEnd()), typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._8wsp, 0L, 0, Offset.INSTANCE.m11115getZeroF1C5BW0(), 0.0f, null, composer2, 1600518, 38), valueOfTimer.longValue(), new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftVerticalElementItemKt$CraftVerticalElementItem$2$1$1$1$1
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
                                function1.invoke(craftElement);
                            }
                        }, composer2, 0, 0);
                    }
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    ImageAndStatusBlockKt.ImageAndStatusBlock(R.dimen._49wdp, craftElement, false, false, false, null, composer2, 28102, 32);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, 0, 3072, 4094);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftVerticalElementItemKt.CraftVerticalElementItem.3
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

                public final void invoke(@Nullable Composer composer2, int i4) {
                    CraftVerticalElementItemKt.CraftVerticalElementItem(element, z, currentScreen, onItemClick, isNeedToDeleteElement, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(name = "CraftVerticalElementItem")
    public static final void PreviewCraftVerticalElementItem(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1728558553);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1728558553, i, -1, "com.blackhub.bronline.game.ui.craft.uiblock.PreviewCraftVerticalElementItem (CraftVerticalElementItem.kt:161)");
            }
            CraftItemTextBlock craftItemTextBlock = new CraftItemTextBlock("Маска из мешковинки qwe qwe qwe", "99 ч 39 мин 44 сек", 25, 0, 9.99f, "description", 8, null);
            CraftVerticalElementItem(new CraftElement(0, 0, null, 0, 0, 0, null, CommonRarityEnum.EPIC, CraftElementStatusEnum.DEFAULT, 0, craftItemTextBlock, null, 0, 1718982500L, 0, 0, 55935, null), true, CraftScreenTypeEnum.PROGRESS, new Function1<CraftElement, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftVerticalElementItemKt.PreviewCraftVerticalElementItem.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull CraftElement it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CraftElement craftElement) {
                    invoke2(craftElement);
                    return Unit.INSTANCE;
                }
            }, new Function1<CraftElement, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftVerticalElementItemKt.PreviewCraftVerticalElementItem.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull CraftElement it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CraftElement craftElement) {
                    invoke2(craftElement);
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 28088);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftVerticalElementItemKt.PreviewCraftVerticalElementItem.3
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
                    CraftVerticalElementItemKt.PreviewCraftVerticalElementItem(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final RoundedCornerShape CraftVerticalElementItem$lambda$1(MutableState<RoundedCornerShape> mutableState) {
        return mutableState.getValue();
    }

    public static final Brush CraftVerticalElementItem$lambda$3(State<? extends Brush> state) {
        return state.getValue();
    }
}

