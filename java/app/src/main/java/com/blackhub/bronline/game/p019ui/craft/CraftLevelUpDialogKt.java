package com.blackhub.bronline.game.p019ui.craft;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p003ui.graphics.GraphicsLayerScope;
import androidx.compose.p003ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextStyle;
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
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.blackhub.bronline.game.core.enums.CommonRarityEnum;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.gui.craft.model.CraftElement;
import com.blackhub.bronline.game.gui.craft.model.CraftItemTextBlock;
import com.blackhub.bronline.game.p019ui.craft.uiblock.CraftLevelUpDialogItemKt;
import com.blackhub.bronline.game.p019ui.widget.button.ButtonContentBlockKt;
import com.blackhub.bronline.game.p019ui.widget.other.FakeDialogKt;
import com.blackhub.bronline.game.p019ui.widget.other.NarrowOvalWithGradientCustomKt;
import com.blackhub.bronline.game.p019ui.widget.other.TriangleWidgetKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
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

/* compiled from: CraftLevelUpDialog.kt */
@SourceDebugExtension({"SMAP\nCraftLevelUpDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CraftLevelUpDialog.kt\ncom/blackhub/bronline/game/ui/craft/CraftLevelUpDialogKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,386:1\n1116#2,6:387\n1116#2,6:393\n1116#2,6:399\n1116#2,6:405\n1116#2,6:411\n1116#2,6:417\n1116#2,6:423\n1116#2,6:429\n1116#2,6:435\n1116#2,3:446\n1119#2,3:452\n1116#2,6:456\n487#3,4:441\n491#3,2:449\n495#3:455\n25#4:445\n487#5:451\n81#6:462\n107#6,2:463\n81#6:465\n107#6,2:466\n81#6:468\n107#6,2:469\n81#6:471\n107#6,2:472\n81#6:474\n107#6,2:475\n81#6:477\n*S KotlinDebug\n*F\n+ 1 CraftLevelUpDialog.kt\ncom/blackhub/bronline/game/ui/craft/CraftLevelUpDialogKt\n*L\n77#1:387,6\n78#1:393,6\n79#1:399,6\n81#1:405,6\n82#1:411,6\n90#1:417,6\n91#1:423,6\n110#1:429,6\n136#1:435,6\n156#1:446,3\n156#1:452,3\n165#1:456,6\n156#1:441,4\n156#1:449,2\n156#1:455\n156#1:445\n156#1:451\n77#1:462\n77#1:463,2\n78#1:465\n78#1:466,2\n79#1:468\n79#1:469,2\n81#1:471\n81#1:472,2\n82#1:474\n82#1:475,2\n91#1:477\n*E\n"})
/* loaded from: classes2.dex */
public final class CraftLevelUpDialogKt {
    public static final long BASIC_DELAY = 550;
    public static final int DEFAULT_DELAY_500 = 500;
    public static final int MIN_COUNT_OF_ELEMENTS_FOR_SCROLL = 5;
    public static final float ROTATION_ANGLE_LEFT_ARROW = -90.0f;
    public static final float ROTATION_ANGLE_RIGHT_ARROW = 90.0f;
    public static final long SCROLL_DELAY = 100;
    public static final int SCROLL_STEP = 250;

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void CraftLevelUpDialog(final int i, @NotNull final List<CraftElement> newElementsForCraft, @NotNull final Function0<Unit> onCloseClick, @Nullable Composer composer, final int i2) {
        Intrinsics.checkNotNullParameter(newElementsForCraft, "newElementsForCraft");
        Intrinsics.checkNotNullParameter(onCloseClick, "onCloseClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-793129847);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-793129847, i2, -1, "com.blackhub.bronline.game.ui.craft.CraftLevelUpDialog (CraftLevelUpDialog.kt:73)");
        }
        final ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
        composerStartRestartGroup.startReplaceableGroup(1681238596);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(R.color.white_40), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        final MutableState mutableState = (MutableState) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(1681238669);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(R.color.white_40), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        final MutableState mutableState2 = (MutableState) objRememberedValue2;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(1681238741);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        final MutableState mutableState3 = (MutableState) objRememberedValue3;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(1681238803);
        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
        }
        final MutableState mutableState4 = (MutableState) objRememberedValue4;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(1681238865);
        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue5 == companion.getEmpty()) {
            objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
        }
        final MutableState mutableState5 = (MutableState) objRememberedValue5;
        composerStartRestartGroup.endReplaceableGroup();
        final Brush brushM11297verticalGradient8A3gB4$default = Brush.Companion.m11297verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.blue_black, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.total_black, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
        composerStartRestartGroup.startReplaceableGroup(1681239103);
        Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue6 == companion.getEmpty()) {
            objRememberedValue6 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
        }
        final Animatable animatable = (Animatable) objRememberedValue6;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(1681239166);
        Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue7 == companion.getEmpty()) {
            objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new Pair(Float.valueOf(1.0f), 500), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
        }
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(Unit.INSTANCE, new C54161(animatable, (MutableState) objRememberedValue7, null), composerStartRestartGroup, 70);
        Boolean boolValueOf = Boolean.valueOf(CraftLevelUpDialog$lambda$10(mutableState4));
        Boolean boolValueOf2 = Boolean.valueOf(CraftLevelUpDialog$lambda$13(mutableState5));
        composerStartRestartGroup.startReplaceableGroup(1681239649);
        boolean zChanged = composerStartRestartGroup.changed(scrollStateRememberScrollState);
        Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue8 == companion.getEmpty()) {
            objRememberedValue8 = new CraftLevelUpDialogKt$CraftLevelUpDialog$2$1(scrollStateRememberScrollState, mutableState5, mutableState4, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
        }
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(boolValueOf, boolValueOf2, (Function2) objRememberedValue8, composerStartRestartGroup, 512);
        Boolean boolValueOf3 = Boolean.valueOf(scrollStateRememberScrollState.isScrollInProgress());
        composerStartRestartGroup.startReplaceableGroup(1681240461);
        boolean zChanged2 = composerStartRestartGroup.changed(scrollStateRememberScrollState);
        Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
        if (zChanged2 || objRememberedValue9 == companion.getEmpty()) {
            objRememberedValue9 = new CraftLevelUpDialogKt$CraftLevelUpDialog$3$1(scrollStateRememberScrollState, mutableState, mutableState2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
        }
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(boolValueOf3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue9, composerStartRestartGroup, 64);
        composerStartRestartGroup.startReplaceableGroup(773894976);
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue10 == companion.getEmpty()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
            composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            objRememberedValue10 = compositionScopedCoroutineScopeCanceller;
        }
        composerStartRestartGroup.endReplaceableGroup();
        final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue10).getCoroutineScope();
        composerStartRestartGroup.endReplaceableGroup();
        final RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composerStartRestartGroup, 6));
        Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(Modifier.INSTANCE, new Function1<GraphicsLayerScope, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftLevelUpDialogKt.CraftLevelUpDialog.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                invoke2(graphicsLayerScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull GraphicsLayerScope graphicsLayer) {
                Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.setAlpha(animatable.getValue().floatValue());
            }
        });
        composerStartRestartGroup.startReplaceableGroup(1681241433);
        Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue11 == companion.getEmpty()) {
            objRememberedValue11 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftLevelUpDialogKt$CraftLevelUpDialog$5$1
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
                    CraftLevelUpDialogKt.CraftLevelUpDialog$lambda$8(mutableState3, true);
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
        }
        composerStartRestartGroup.endReplaceableGroup();
        FakeDialogKt.m15089FakeDialog3IgeMak(ComposeExtensionKt.noRippleClickable$default(modifierGraphicsLayer, false, (Function0) objRememberedValue11, 1, null), ColorResources_androidKt.colorResource(R.color.total_black_70, composerStartRestartGroup, 6), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1763811563, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftLevelUpDialogKt.CraftLevelUpDialog.6
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
                final MutableState<Boolean> mutableState6;
                if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1763811563, i3, -1, "com.blackhub.bronline.game.ui.craft.CraftLevelUpDialog.<anonymous> (CraftLevelUpDialog.kt:169)");
                    }
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.HorizontalOrVertical center = arrangement.getCenter();
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                    final Function0<Unit> function0 = onCloseClick;
                    final MutableState<Boolean> mutableState7 = mutableState3;
                    Brush brush = brushM11297verticalGradient8A3gB4$default;
                    RoundedCornerShape roundedCornerShape = roundedCornerShapeM8392RoundedCornerShape0680j_4;
                    int i4 = i;
                    ScrollState scrollState = scrollStateRememberScrollState;
                    MutableState<Boolean> mutableState8 = mutableState4;
                    CoroutineScope coroutineScope2 = coroutineScope;
                    MutableState<Integer> mutableState9 = mutableState;
                    List<CraftElement> list = newElementsForCraft;
                    MutableState<Boolean> mutableState10 = mutableState5;
                    MutableState<Integer> mutableState11 = mutableState2;
                    composer2.startReplaceableGroup(-483455358);
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, 54);
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
                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(OffsetKt.m8084offsetVpY3zN4$default(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._15wdp, composer2, 6), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer2, 6), 7, null);
                    composer2.startReplaceableGroup(50838300);
                    Object objRememberedValue12 = composer2.rememberedValue();
                    Composer.Companion companion5 = Composer.INSTANCE;
                    if (objRememberedValue12 == companion5.getEmpty()) {
                        objRememberedValue12 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftLevelUpDialogKt$CraftLevelUpDialog$6$1$1$1
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
                                CraftLevelUpDialogKt.CraftLevelUpDialog$lambda$8(mutableState7, true);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue12);
                    }
                    composer2.endReplaceableGroup();
                    Modifier modifierNoRippleClickable$default = ComposeExtensionKt.noRippleClickable$default(modifierM8127paddingqDBjuR0$default, false, (Function0) objRememberedValue12, 1, null);
                    Arrangement.HorizontalOrVertical center2 = arrangement.getCenter();
                    Alignment.Vertical centerVertically = companion2.getCenterVertically();
                    composer2.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center2, centerVertically, composer2, 54);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierNoRippleClickable$default);
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
                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    Modifier modifierM7782borderxT4_qwU = BorderKt.m7782borderxT4_qwU(BackgroundKt.background$default(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._431wdp, composer2, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._46wdp, composer2, 6)), brush, roundedCornerShape, 0.0f, 4, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composer2, 6), ColorResources_androidKt.colorResource(R.color.white, composer2, 6), roundedCornerShape);
                    Alignment centerStart = companion2.getCenterStart();
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(centerStart, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM7782borderxT4_qwU);
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
                    Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    String strStringResource = StringResources_androidKt.stringResource(R.string.craft_master_level_up_title, composer2, 6);
                    Locale locale = Locale.ROOT;
                    String upperCase = strStringResource.toUpperCase(locale);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
                    TextKt.m10024Text4IGK_g(upperCase, PaddingKt.m8127paddingqDBjuR0$default(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._15wdp, composer2, 6), 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._18wsp, 0L, 0, 0L, 0.0f, null, null, composer2, 12582918, 126), composer2, 0, 0, 65532);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    Modifier modifierM7782borderxT4_qwU2 = BorderKt.m7782borderxT4_qwU(BackgroundKt.m7770backgroundbw27NRU(ComposeExtensionKt.m14410shadowo6VuwKU(SizeKt.m8172size3ABfNKs(OffsetKt.m8084offsetVpY3zN4$default(companion3, C2046Dp.m13666constructorimpl(-PrimitiveResources_androidKt.dimensionResource(R.dimen._50wdp, composer2, 6)), 0.0f, 2, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._77wdp, composer2, 6)), (242 & 1) != 0 ? Color.INSTANCE.m11366getBlack0d7_KjU() : ColorResources_androidKt.colorResource(R.color.red, composer2, 6), (242 & 2) != 0 ? 1.0f : 0.0f, (242 & 4) != 0 ? C2046Dp.m13666constructorimpl(0) : PrimitiveResources_androidKt.dimensionResource(R.dimen._50wdp, composer2, 6), (242 & 8) != 0 ? C2046Dp.m13666constructorimpl(0) : PrimitiveResources_androidKt.dimensionResource(R.dimen._15wdp, composer2, 6), (242 & 16) != 0 ? C2046Dp.m13666constructorimpl(0) : 0.0f, (242 & 32) != 0 ? C2046Dp.m13666constructorimpl(0) : 0.0f, (242 & 64) != 0 ? C2046Dp.m13666constructorimpl(0) : 0.0f, (242 & 128) != 0 ? Modifier.INSTANCE : null), ColorResources_androidKt.colorResource(R.color.blue_black, composer2, 6), RoundedCornerShapeKt.getCircleShape()), PrimitiveResources_androidKt.dimensionResource(R.dimen._4wdp, composer2, 6), ColorResources_androidKt.colorResource(R.color.red, composer2, 6), RoundedCornerShapeKt.getCircleShape());
                    Alignment center3 = companion2.getCenter();
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center3, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM7782borderxT4_qwU2);
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
                    Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRememberBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion4.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    IconKt.m9496Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_craft, composer2, 6), (String) null, SizeKt.m8172size3ABfNKs(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._35wdp, composer2, 6)), ColorResources_androidKt.colorResource(R.color.white_50, composer2, 6), composer2, 56, 0);
                    NarrowOvalWithGradientCustomKt.m15096NarrowOvalWithGradientCustomiJQMabo(SizeKt.m8172size3ABfNKs(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._55wdp, composer2, 6)), ColorResources_androidKt.colorResource(R.color.total_black, composer2, 6), composer2, 0, 0);
                    TextKt.m10024Text4IGK_g(String.valueOf(i4), PaddingKt.m8127paddingqDBjuR0$default(companion3, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer2, 6), 0.0f, 11, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14816montserratBoldItalicCustomSpbl3sdaw(R.dimen._55wsp, 0L, 0, 0L, 0.0f, composer2, 196614, 30), composer2, 0, 0, 65532);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    String upperCase2 = StringResources_androidKt.stringResource(R.string.craft_master_level_up_new_craft_elements, composer2, 6).toUpperCase(locale);
                    Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                    TextStyle textStyleM14862montserratSemiBoldCustomSpcv9FZhg = typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._15wsp, ColorResources_androidKt.colorResource(R.color.white_40, composer2, 6), 0, 0L, 0.0f, null, composer2, 1572870, 60);
                    composer2.startReplaceableGroup(50841865);
                    Object objRememberedValue13 = composer2.rememberedValue();
                    if (objRememberedValue13 == companion5.getEmpty()) {
                        mutableState6 = mutableState7;
                        objRememberedValue13 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftLevelUpDialogKt$CraftLevelUpDialog$6$1$3$1
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
                                CraftLevelUpDialogKt.CraftLevelUpDialog$lambda$8(mutableState6, true);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue13);
                    } else {
                        mutableState6 = mutableState7;
                    }
                    composer2.endReplaceableGroup();
                    MutableState<Boolean> mutableState12 = mutableState6;
                    TextKt.m10024Text4IGK_g(upperCase2, ComposeExtensionKt.noRippleClickable$default(companion3, false, (Function0) objRememberedValue13, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleM14862montserratSemiBoldCustomSpcv9FZhg, composer2, 0, 0, 65532);
                    Modifier modifierM8127paddingqDBjuR0$default2 = PaddingKt.m8127paddingqDBjuR0$default(companion3, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._15wdp, composer2, 6), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._25wdp, composer2, 6), 5, null);
                    Arrangement.HorizontalOrVertical center4 = arrangement.getCenter();
                    Alignment.Vertical centerVertically2 = companion2.getCenterVertically();
                    composer2.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(center4, centerVertically2, composer2, 54);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor5 = companion4.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default2);
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
                    Updater.m10877setimpl(composerM10870constructorimpl5, measurePolicyRowMeasurePolicy2, companion4.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl5, currentCompositionLocalMap5, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion4.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                        composerM10870constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                        composerM10870constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                    }
                    function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    TriangleWidgetKt.m15099TriangleWidgetm7uSSuA(SuspendingPointerInputFilterKt.pointerInput(companion3, Unit.INSTANCE, new CraftLevelUpDialogKt$CraftLevelUpDialog$6$1$4$1(mutableState8, coroutineScope2, scrollState, null)), PrimitiveResources_androidKt.dimensionResource(R.dimen._45wdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composer2, 6), ColorResources_androidKt.colorResource(CraftLevelUpDialogKt.CraftLevelUpDialog$lambda$1(mutableState9), composer2, 0), 0.0f, -90.0f, 0.0f, composer2, ProfileVerifier.CompilationStatus.f342xf2722a21, 80);
                    Modifier modifierHorizontalScroll$default = ScrollKt.horizontalScroll$default(SizeKt.m8158height3ABfNKs(RowScope.weight$default(rowScopeInstance, companion3, 1.0f, false, 2, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._160wdp, composer2, 6)), scrollState, false, null, false, 14, null);
                    Arrangement.HorizontalOrVertical center5 = arrangement.getCenter();
                    composer2.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(center5, companion2.getTop(), composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor6 = companion4.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierHorizontalScroll$default);
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
                    Updater.m10877setimpl(composerM10870constructorimpl6, measurePolicyRowMeasurePolicy3, companion4.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl6, currentCompositionLocalMap6, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion4.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                        composerM10870constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                        composerM10870constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                    }
                    function3ModifierMaterializerOf6.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    composer2.startReplaceableGroup(1195127903);
                    int i5 = 0;
                    for (Object obj : list) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                        }
                        CraftLevelUpDialogItemKt.CraftLevelUpDialogItem(null, (CraftElement) obj, CraftLevelUpDialogKt.CraftLevelUpDialog$lambda$7(mutableState12), i5 * 550, composer2, 64, 1);
                        i5 = i6;
                    }
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    Modifier.Companion companion6 = Modifier.INSTANCE;
                    TriangleWidgetKt.m15099TriangleWidgetm7uSSuA(SuspendingPointerInputFilterKt.pointerInput(companion6, Unit.INSTANCE, new CraftLevelUpDialogKt$CraftLevelUpDialog$6$1$4$3(mutableState10, coroutineScope2, scrollState, null)), PrimitiveResources_androidKt.dimensionResource(R.dimen._45wdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composer2, 6), ColorResources_androidKt.colorResource(CraftLevelUpDialogKt.CraftLevelUpDialog$lambda$4(mutableState11), composer2, 0), 0.0f, 90.0f, 0.0f, composer2, ProfileVerifier.CompilationStatus.f342xf2722a21, 80);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    Modifier modifierM8177width3ABfNKs = SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion6, PrimitiveResources_androidKt.dimensionResource(R.dimen._33wdp, composer2, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._140wdp, composer2, 6));
                    float fM14409dpToPx8Feqmps = ComposeExtensionKt.m14409dpToPx8Feqmps(PrimitiveResources_androidKt.dimensionResource(R.dimen._90wdp, composer2, 6), composer2, 0);
                    RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composer2, 6));
                    composer2.startReplaceableGroup(50845732);
                    boolean zChanged3 = composer2.changed(function0);
                    Object objRememberedValue14 = composer2.rememberedValue();
                    if (zChanged3 || objRememberedValue14 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue14 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftLevelUpDialogKt$CraftLevelUpDialog$6$1$5$1
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
                                function0.invoke();
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue14);
                    }
                    composer2.endReplaceableGroup();
                    ButtonContentBlockKt.m15069ButtonContentBlockkmJHe8M(null, modifierM8177width3ABfNKs, 0L, 0L, fM14409dpToPx8Feqmps, null, roundedCornerShapeM8392RoundedCornerShape0680j_42, null, null, false, false, null, false, false, false, false, 0, null, (Function0) objRememberedValue14, ComposableSingletons$CraftLevelUpDialogKt.INSTANCE.m14950getLambda1$app_siteRelease(), composer2, 0, 805306368, 262061);
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
        }), composerStartRestartGroup, 384, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftLevelUpDialogKt.CraftLevelUpDialog.7
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
                    CraftLevelUpDialogKt.CraftLevelUpDialog(i, newElementsForCraft, onCloseClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    public static final void CraftLevelUpDialog$lambda$2(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    public static final void CraftLevelUpDialog$lambda$5(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    public static final void CraftLevelUpDialog$lambda$8(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final void CraftLevelUpDialog$lambda$11(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final void CraftLevelUpDialog$lambda$14(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* compiled from: CraftLevelUpDialog.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.craft.CraftLevelUpDialogKt$CraftLevelUpDialog$1", m7120f = "CraftLevelUpDialog.kt", m7121i = {}, m7122l = {101}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.ui.craft.CraftLevelUpDialogKt$CraftLevelUpDialog$1 */
    /* loaded from: classes7.dex */
    public static final class C54161 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Animatable<Float, AnimationVector1D> $bgAnimatedFloat;
        public final /* synthetic */ MutableState<Pair<Float, Integer>> $valueForBgFinal$delegate;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C54161(Animatable<Float, AnimationVector1D> animatable, MutableState<Pair<Float, Integer>> mutableState, Continuation<? super C54161> continuation) {
            super(2, continuation);
            this.$bgAnimatedFloat = animatable;
            this.$valueForBgFinal$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C54161(this.$bgAnimatedFloat, this.$valueForBgFinal$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C54161) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Animatable<Float, AnimationVector1D> animatable = this.$bgAnimatedFloat;
                Object first = CraftLevelUpDialogKt.CraftLevelUpDialog$lambda$17(this.$valueForBgFinal$delegate).getFirst();
                TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(((Number) CraftLevelUpDialogKt.CraftLevelUpDialog$lambda$17(this.$valueForBgFinal$delegate).getSecond()).intValue(), 0, EasingKt.getLinearEasing(), 2, null);
                this.label = 1;
                if (Animatable.animateTo$default(animatable, first, tweenSpecTween$default, null, null, this, 12, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void CraftLevelUpDialogPreview(@Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1666912100);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1666912100, i, -1, "com.blackhub.bronline.game.ui.craft.CraftLevelUpDialogPreview (CraftLevelUpDialog.kt:348)");
            }
            CraftLevelUpDialog(5, CollectionsKt__CollectionsKt.listOf((Object[]) new CraftElement[]{new CraftElement(0, 0, null, 0, 0, 0, null, CommonRarityEnum.COMMON, null, 0, new CraftItemTextBlock("Крутая маска", null, 0, 0, 0.0f, null, 62, null), null, 0, null, 0, 0, 64383, null), new CraftElement(0, 0, null, 0, 0, 0, null, CommonRarityEnum.UNCOMMON, null, 0, new CraftItemTextBlock("Крутая маска", null, 0, 0, 0.0f, null, 62, null), null, 0, null, 0, 0, 64383, null), new CraftElement(0, 0, null, 0, 0, 0, null, CommonRarityEnum.RARE, null, 0, new CraftItemTextBlock("Крутая маска", null, 0, 0, 0.0f, null, 62, null), null, 0, null, 0, 0, 64383, null), new CraftElement(0, 0, null, 0, 0, 0, null, CommonRarityEnum.EPIC, null, 0, new CraftItemTextBlock("Крутая маска", null, 0, 0, 0.0f, null, 62, null), null, 0, null, 0, 0, 64383, null), new CraftElement(0, 0, null, 0, 0, 0, null, CommonRarityEnum.LEGENDARY, null, 0, new CraftItemTextBlock("Крутая маска", null, 0, 0, 0.0f, null, 62, null), null, 0, null, 0, 0, 64383, null)}), new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftLevelUpDialogKt.CraftLevelUpDialogPreview.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 454);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftLevelUpDialogKt.CraftLevelUpDialogPreview.2
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
                    CraftLevelUpDialogKt.CraftLevelUpDialogPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final int CraftLevelUpDialog$lambda$1(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    public static final int CraftLevelUpDialog$lambda$4(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    public static final boolean CraftLevelUpDialog$lambda$7(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final boolean CraftLevelUpDialog$lambda$10(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final boolean CraftLevelUpDialog$lambda$13(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final Pair<Float, Integer> CraftLevelUpDialog$lambda$17(MutableState<Pair<Float, Integer>> mutableState) {
        return mutableState.getValue();
    }
}

