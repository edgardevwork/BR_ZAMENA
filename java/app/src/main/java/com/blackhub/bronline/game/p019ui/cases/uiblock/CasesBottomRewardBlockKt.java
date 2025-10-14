package com.blackhub.bronline.game.p019ui.cases.uiblock;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.RoundRect;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.AndroidPath_androidKt;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.Path;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.tooling.preview.Preview;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import com.blackhub.bronline.game.core.enums.CommonRarityEnum;
import com.blackhub.bronline.game.core.extension.BooleanExtensionKt;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.extension.FloatExtensionKt;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.gui.cases.model.CaseReward;
import com.bless.client.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CasesBottomRewardBlock.kt */
@SourceDebugExtension({"SMAP\nCasesBottomRewardBlock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CasesBottomRewardBlock.kt\ncom/blackhub/bronline/game/ui/cases/uiblock/CasesBottomRewardBlockKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,382:1\n1116#2,6:383\n1116#2,6:389\n1116#2,6:395\n1116#2,6:401\n1116#2,6:441\n69#3,5:407\n74#3:440\n78#3:451\n79#4,11:412\n92#4:450\n456#5,8:423\n464#5,3:437\n467#5,3:447\n3737#6,6:431\n81#7:452\n81#7:453\n107#7,2:454\n*S KotlinDebug\n*F\n+ 1 CasesBottomRewardBlock.kt\ncom/blackhub/bronline/game/ui/cases/uiblock/CasesBottomRewardBlockKt\n*L\n99#1:383,6\n105#1:389,6\n110#1:395,6\n119#1:401,6\n191#1:441,6\n131#1:407,5\n131#1:440\n131#1:451\n131#1:412,11\n131#1:450\n131#1:423,8\n131#1:437,3\n131#1:447,3\n131#1:431,6\n99#1:452\n105#1:453\n105#1:454,2\n*E\n"})

public final class CasesBottomRewardBlockKt {
    public static final float CENTER_DOT_BOTTOM_ARROW = 0.8f;
    public static final float CENTER_DOT_TOP_ARROW = 0.2f;
    public static final float CENTER_SCREEN = 0.5f;
    public static final float HEIGHT_OF_BOTTOM_LINE = 0.98f;
    public static final float HEIGHT_OF_TOP_LINE = 0.02f;
    public static final float LEFT_DOT_ARROW = 0.49f;
    public static final float RIGHT_DOT_ARROW = 0.51f;
    public static final float WEIGHT_WIDTH_OF_BLUR = 0.1f;

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void CasesBottomRewardBlock(@Nullable Modifier modifier, final int i, @NotNull final List<CaseReward> allRewards, final int i2, final int i3, final int i4, final boolean z, @NotNull final Function1<? super Integer, Unit> onClickItem, @NotNull final Function1<? super Integer, Unit> selectItem, @NotNull final Function2<? super Bitmap, ? super Integer, Unit> getSelectedImage, @Nullable Composer composer, final int i5, final int i6) {
        Boolean bool;
        int i7;
        LazyListState lazyListState;
        Intrinsics.checkNotNullParameter(allRewards, "allRewards");
        Intrinsics.checkNotNullParameter(onClickItem, "onClickItem");
        Intrinsics.checkNotNullParameter(selectItem, "selectItem");
        Intrinsics.checkNotNullParameter(getSelectedImage, "getSelectedImage");
        Composer composerStartRestartGroup = composer.startRestartGroup(1423008939);
        Modifier modifier2 = (i6 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1423008939, i5, -1, "com.blackhub.bronline.game.ui.cases.uiblock.CasesBottomRewardBlock (CasesBottomRewardBlock.kt:67)");
        }
        Brush.Companion companion = Brush.INSTANCE;
        final Modifier modifier3 = modifier2;
        Brush brushM11289horizontalGradient8A3gB4$default = Brush.Companion.m11289horizontalGradient8A3gB4$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.total_black, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.total_black_50, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.transparent, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
        Brush brushM11289horizontalGradient8A3gB4$default2 = Brush.Companion.m11289horizontalGradient8A3gB4$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.transparent, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.total_black_50, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.total_black, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
        final MutableIntState mutableIntState = (MutableIntState) RememberSaveableKt.m10957rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) new Function0<MutableIntState>() { // from class: com.blackhub.bronline.game.ui.cases.uiblock.CasesBottomRewardBlockKt$CasesBottomRewardBlock$selectedBottomItemIndex$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final MutableIntState invoke() {
                return SnapshotIntStateKt.mutableIntStateOf(0);
            }
        }, composerStartRestartGroup, 3080, 6);
        final Brush brushM11289horizontalGradient8A3gB4$default3 = Brush.Companion.m11289horizontalGradient8A3gB4$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.transparent, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.transparent, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
        LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
        final int iRoundToIntSafely = FloatExtensionKt.roundToIntSafely(ComposeExtensionKt.m14409dpToPx8Feqmps(PrimitiveResources_androidKt.dimensionResource(R.dimen._50wdp, composerStartRestartGroup, 6), composerStartRestartGroup, 0));
        final int iRoundToIntSafely2 = FloatExtensionKt.roundToIntSafely(ComposeExtensionKt.m14409dpToPx8Feqmps(PrimitiveResources_androidKt.dimensionResource(R.dimen._7wdp, composerStartRestartGroup, 6), composerStartRestartGroup, 0));
        composerStartRestartGroup.startReplaceableGroup(404728453);
        int i8 = (i5 & 7168) ^ 3072;
        boolean z2 = ((((i5 & 112) ^ 48) > 32 && composerStartRestartGroup.changed(i)) || (i5 & 48) == 32) | ((i8 > 2048 && composerStartRestartGroup.changed(i2)) || (i5 & 3072) == 2048);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0<Integer>() { // from class: com.blackhub.bronline.game.ui.cases.uiblock.CasesBottomRewardBlockKt$CasesBottomRewardBlock$centerOffsetForScroll$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Integer invoke() {
                    return Integer.valueOf(((i - iRoundToIntSafely) / 2) + iRoundToIntSafely2);
                }
            });
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        State state = (State) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(404728645);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion2 = Composer.INSTANCE;
        if (objRememberedValue2 == companion2.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        MutableState mutableState = (MutableState) objRememberedValue2;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(404728697);
        if (IntExtensionKt.isNotZero(Integer.valueOf(i))) {
            Integer numValueOf = Integer.valueOf(i2);
            composerStartRestartGroup.startReplaceableGroup(404728765);
            boolean zChanged = composerStartRestartGroup.changed(lazyListStateRememberLazyListState) | ((i8 > 2048 && composerStartRestartGroup.changed(i2)) || (i5 & 3072) == 2048) | composerStartRestartGroup.changed(state);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == companion2.getEmpty()) {
                objRememberedValue3 = new CasesBottomRewardBlockKt$CasesBottomRewardBlock$1$1(lazyListStateRememberLazyListState, i2, state, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, ((i5 >> 9) & 14) | 64);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Boolean boolValueOf = Boolean.valueOf(lazyListStateRememberLazyListState.isScrollInProgress());
        composerStartRestartGroup.startReplaceableGroup(404729003);
        boolean zChanged2 = composerStartRestartGroup.changed(lazyListStateRememberLazyListState) | composerStartRestartGroup.changed(mutableIntState) | composerStartRestartGroup.changed(state);
        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
        if (zChanged2 || objRememberedValue4 == companion2.getEmpty()) {
            bool = boolValueOf;
            i7 = 1;
            lazyListState = lazyListStateRememberLazyListState;
            CasesBottomRewardBlockKt$CasesBottomRewardBlock$2$1 casesBottomRewardBlockKt$CasesBottomRewardBlock$2$1 = new CasesBottomRewardBlockKt$CasesBottomRewardBlock$2$1(lazyListStateRememberLazyListState, mutableIntState, mutableState, state, null);
            composerStartRestartGroup.updateRememberedValue(casesBottomRewardBlockKt$CasesBottomRewardBlock$2$1);
            objRememberedValue4 = casesBottomRewardBlockKt$CasesBottomRewardBlock$2$1;
        } else {
            bool = boolValueOf;
            lazyListState = lazyListStateRememberLazyListState;
            i7 = 1;
        }
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(bool, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 64);
        Modifier modifierM7771backgroundbw27NRU$default = BackgroundKt.m7771backgroundbw27NRU$default(SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3, 0.0f, i7, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._60wdp, composerStartRestartGroup, 6)), ColorResources_androidKt.colorResource(R.color.total_black_50, composerStartRestartGroup, 6), null, 2, null);
        Alignment.Companion companion3 = Alignment.INSTANCE;
        Alignment center = companion3.getCenter();
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM7771backgroundbw27NRU$default);
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
        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion4.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Modifier.Companion companion5 = Modifier.INSTANCE;
        final LazyListState lazyListState2 = lazyListState;
        LazyDslKt.LazyRow(SizeKt.fillMaxSize$default(companion5, 0.0f, 1, null), lazyListState, null, false, Arrangement.INSTANCE.m8032spacedBy0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composerStartRestartGroup, 6)), companion3.getCenterVertically(), null, z, new Function1<LazyListScope, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.uiblock.CasesBottomRewardBlockKt$CasesBottomRewardBlock$3$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
                invoke2(lazyListScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull LazyListScope LazyRow) {
                Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
                final List<CaseReward> list = allRewards;
                final LazyListState lazyListState3 = lazyListState2;
                final MutableIntState mutableIntState2 = mutableIntState;
                final boolean z3 = z;
                final int i9 = i3;
                final int i10 = i4;
                final Function1<Integer, Unit> function1 = selectItem;
                final Function1<Integer, Unit> function12 = onClickItem;
                final Function2<Bitmap, Integer, Unit> function2 = getSelectedImage;
                final int i11 = i;
                LazyRow.items(list.size(), null, new Function1<Integer, Object>() { // from class: com.blackhub.bronline.game.ui.cases.uiblock.CasesBottomRewardBlockKt$CasesBottomRewardBlock$3$1$invoke$$inlined$itemsIndexed$default$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                        return invoke(num.intValue());
                    }

                    @Nullable
                    public final Object invoke(int i12) {
                        list.get(i12);
                        return null;
                    }
                }, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.uiblock.CasesBottomRewardBlockKt$CasesBottomRewardBlock$3$1$invoke$$inlined$itemsIndexed$default$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer2, Integer num2) {
                        invoke(lazyItemScope, num.intValue(), composer2, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@NotNull LazyItemScope lazyItemScope, final int i12, @Nullable Composer composer2, int i13) {
                        int i14;
                        if ((i13 & 14) == 0) {
                            i14 = i13 | (composer2.changed(lazyItemScope) ? 4 : 2);
                        } else {
                            i14 = i13;
                        }
                        if ((i13 & 112) == 0) {
                            i14 |= composer2.changed(i12) ? 32 : 16;
                        }
                        if ((i14 & 731) == 146 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1091073711, i14, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:183)");
                        }
                        int i15 = i14 & 126;
                        CaseReward caseReward = (CaseReward) list.get(i12);
                        final int i16 = i11;
                        final List list2 = list;
                        MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: com.blackhub.bronline.game.ui.cases.uiblock.CasesBottomRewardBlockKt$CasesBottomRewardBlock$3$1$1$2
                            @Override // androidx.compose.p003ui.layout.MeasurePolicy
                            @NotNull
                            /* renamed from: measure-3p2s80s */
                            public final MeasureResult mo7599measure3p2s80s(@NotNull MeasureScope Layout, @NotNull List<? extends Measurable> measurables, long j) {
                                Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                                Intrinsics.checkNotNullParameter(measurables, "measurables");
                                final Placeable placeableMo12610measureBRTryo0 = ((Measurable) CollectionsKt___CollectionsKt.first((List) measurables)).mo12610measureBRTryo0(j);
                                int width = placeableMo12610measureBRTryo0.getWidth();
                                int i17 = i12;
                                final int i18 = i17 == 0 ? (i16 - width) / 2 : 0;
                                int width2 = placeableMo12610measureBRTryo0.getWidth() + i18 + (i17 == CollectionsKt__CollectionsKt.getLastIndex(list2) ? (i16 - width) / 2 : 0);
                                int height = placeableMo12610measureBRTryo0.getHeight();
                                final int i19 = i12;
                                return MeasureScope.layout$default(Layout, width2, height, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.uiblock.CasesBottomRewardBlockKt$CasesBottomRewardBlock$3$1$1$2.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                        invoke2(placementScope);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull Placeable.PlacementScope layout) {
                                        Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                        Placeable.PlacementScope.place$default(layout, placeableMo12610measureBRTryo0, i19 == 0 ? i18 : 0, 0, 0.0f, 4, null);
                                    }
                                }, 4, null);
                            }
                        };
                        composer2.startReplaceableGroup(-1323940314);
                        Modifier.Companion companion6 = Modifier.INSTANCE;
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion7.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion6);
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
                        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicy, companion7.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion7.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion7.getSetCompositeKeyHash();
                        if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        CasesBottomRewardItemKt.CasesBottomRewardItem(caseReward, 0, lazyListState3, i12, mutableIntState2, z3, i9, i10, function1, function12, function2, composer2, ((i15 << 6) & 7168) | 8, 0, 2);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
            }
        }, composerStartRestartGroup, ((i5 << 3) & 29360128) | 196614, 76);
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion5, 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(335220668);
        boolean zChanged3 = composerStartRestartGroup.changed(brushM11289horizontalGradient8A3gB4$default3) | ((((i5 & 3670016) ^ 1572864) > 1048576 && composerStartRestartGroup.changed(z)) || (i5 & 1572864) == 1048576);
        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
        if (zChanged3 || objRememberedValue5 == companion2.getEmpty()) {
            objRememberedValue5 = new Function1<DrawScope, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.uiblock.CasesBottomRewardBlockKt$CasesBottomRewardBlock$3$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                    invoke2(drawScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull final DrawScope Canvas) {
                    Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                    final Path Path = AndroidPath_androidKt.Path();
                    boolean z3 = z;
                    Path.addRoundRect(new RoundRect(0.0f, 0.0f, Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()), Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) * 0.02f, 0L, 0L, 0L, 0L, 240, null));
                    BooleanExtensionKt.ifTrue(Boolean.valueOf(z3), new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.cases.uiblock.CasesBottomRewardBlockKt$CasesBottomRewardBlock$3$2$1$arrowTop$1$1
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
                            Path.moveTo(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()) * 0.5f, Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) * 0.2f);
                            Path.lineTo(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()) * 0.51f, 0.0f);
                            Path.lineTo(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()) * 0.49f, 0.0f);
                        }
                    });
                    Path.close();
                    final Path Path2 = AndroidPath_androidKt.Path();
                    boolean z4 = z;
                    Path2.addRoundRect(new RoundRect(0.0f, Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) * 0.98f, Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()), Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()), 0L, 0L, 0L, 0L, 240, null));
                    BooleanExtensionKt.ifTrue(Boolean.valueOf(z4), new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.cases.uiblock.CasesBottomRewardBlockKt$CasesBottomRewardBlock$3$2$1$arrowBottom$1$1
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
                            Path2.moveTo(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()) * 0.51f, Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()));
                            Path2.lineTo(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()) * 0.5f, Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) * 0.8f);
                            Path2.lineTo(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()) * 0.49f, Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()));
                        }
                    });
                    Path2.close();
                    DrawScope.m11879drawPathGBMwjPU$default(Canvas, Path, brushM11289horizontalGradient8A3gB4$default3, 0.0f, null, null, 0, 60, null);
                    DrawScope.m11879drawPathGBMwjPU$default(Canvas, Path2, brushM11289horizontalGradient8A3gB4$default3, 0.0f, null, null, 0, 60, null);
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
        }
        composerStartRestartGroup.endReplaceableGroup();
        CanvasKt.Canvas(modifierFillMaxSize$default, (Function1) objRememberedValue5, composerStartRestartGroup, 6);
        BoxKt.Box(BackgroundKt.background$default(boxScopeInstance.align(SizeKt.fillMaxWidth(SizeKt.fillMaxHeight$default(companion5, 0.0f, 1, null), 0.1f), companion3.getCenterEnd()), brushM11289horizontalGradient8A3gB4$default2, null, 0.0f, 6, null), composerStartRestartGroup, 0);
        BoxKt.Box(BackgroundKt.background$default(boxScopeInstance.align(SizeKt.fillMaxWidth(SizeKt.fillMaxHeight$default(companion5, 0.0f, 1, null), 0.1f), companion3.getCenterStart()), brushM11289horizontalGradient8A3gB4$default, null, 0.0f, 6, null), composerStartRestartGroup, 0);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.uiblock.CasesBottomRewardBlockKt.CasesBottomRewardBlock.4
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

                public final void invoke(@Nullable Composer composer2, int i9) {
                    CasesBottomRewardBlockKt.CasesBottomRewardBlock(modifier3, i, allRewards, i2, i3, i4, z, onClickItem, selectItem, getSelectedImage, composer2, RecomposeScopeImplKt.updateChangedFlags(i5 | 1), i6);
                }
            });
        }
    }

    public static final void CasesBottomRewardBlock$lambda$4(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @SuppressLint({"UnrememberedMutableState"})
    @Composable
    @Preview
    public static final void PreviewCasesBottomRewardBlock(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(286076086);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(286076086, i, -1, "com.blackhub.bronline.game.ui.cases.uiblock.PreviewCasesBottomRewardBlock (CasesBottomRewardBlock.kt:254)");
            }
            Modifier modifierM7771backgroundbw27NRU$default = BackgroundKt.m7771backgroundbw27NRU$default(Modifier.INSTANCE, Color.INSTANCE.m11374getRed0d7_KjU(), null, 2, null);
            CommonRarityEnum commonRarityEnum = CommonRarityEnum.COMMON;
            String str = "ololo";
            CaseReward caseReward = new CaseReward(1, 0, str, null, null, null, 0, null, commonRarityEnum, false, false, false, 0, false, null, null, 0, 128250, null);
            String str2 = null;
            String str3 = null;
            int i2 = 0;
            Bitmap bitmap = null;
            String str4 = "ololo";
            byte b = 0 == true ? 1 : 0;
            byte b2 = 0 == true ? 1 : 0;
            byte b3 = 0 == true ? 1 : 0;
            byte b4 = 0 == true ? 1 : 0;
            byte b5 = 0 == true ? 1 : 0;
            CaseReward caseReward2 = new CaseReward(2, 0, str4, str2, null, str3, i2, bitmap, CommonRarityEnum.UNCOMMON, false, b, b2, b3, b4, null, b5, 0, 128250, null);
            String str5 = null;
            String str6 = "ololo";
            byte b6 = 0 == true ? 1 : 0;
            byte b7 = 0 == true ? 1 : 0;
            byte b8 = 0 == true ? 1 : 0;
            byte b9 = 0 == true ? 1 : 0;
            byte b10 = 0 == true ? 1 : 0;
            CaseReward caseReward3 = new CaseReward(3, 0, str6, str5, str5, str5, 0, null, CommonRarityEnum.LEGENDARY, false, b6, b7, b8, b9, null, b10, 0, 128250, null);
            String str7 = "ololo";
            byte b11 = 0 == true ? 1 : 0;
            byte b12 = 0 == true ? 1 : 0;
            byte b13 = 0 == true ? 1 : 0;
            byte b14 = 0 == true ? 1 : 0;
            byte b15 = 0 == true ? 1 : 0;
            byte b16 = 0 == true ? 1 : 0;
            byte b17 = 0 == true ? 1 : 0;
            CaseReward caseReward4 = new CaseReward(4, b11, str7, str2, b12, str3, i2, bitmap, CommonRarityEnum.RARE, false, b13, b14, b15, b16, null, b17, 0, 128250, null);
            String str8 = null;
            String str9 = "ololo";
            byte b18 = 0 == true ? 1 : 0;
            byte b19 = 0 == true ? 1 : 0;
            byte b20 = 0 == true ? 1 : 0;
            byte b21 = 0 == true ? 1 : 0;
            byte b22 = 0 == true ? 1 : 0;
            String str10 = "ololo";
            String str11 = "ololo";
            String str12 = "ololo";
            String str13 = "ololo";
            String str14 = "ololo";
            String str15 = "ololo";
            String str16 = "ololo";
            String str17 = "ololo";
            String str18 = "ololo";
            String str19 = "ololo";
            String str20 = "ololo";
            byte b23 = 0 == true ? 1 : 0;
            CasesBottomRewardBlock(modifierM7771backgroundbw27NRU$default, 1980, CollectionsKt__CollectionsKt.listOf((Object[]) new CaseReward[]{caseReward, caseReward2, caseReward3, caseReward4, new CaseReward(5, 0, str9, str8, str8, str8, 0, null, CommonRarityEnum.EPIC, false, b18, b19, b20, b21, null, b22, 0, 128250, null), new CaseReward(6, 0, str10, null, null, null, 0, null, commonRarityEnum, false, false, false, 0, false, null, null, 0, 128250, null), new CaseReward(7, 0, str11, null, null, null, 0, null, commonRarityEnum, false, false, false, 0, false, null, null, 0, 128250, null), new CaseReward(8, 0, str12, null, null, null, 0, null, commonRarityEnum, false, false, false, 0, false, null, null, 0, 128250, null), new CaseReward(9, 0, str13, null, null, null, 0, null, commonRarityEnum, false, false, false, 0, false, null, null, 0, 128250, null), new CaseReward(10, 0, str14, null, null, null, 0, null, commonRarityEnum, false, false, false, 0, false, null, null, 0, 128250, null), new CaseReward(11, 0, str15, null, null, null, 0, null, commonRarityEnum, false, false, false, 0, false, null, null, 0, 128250, null), new CaseReward(12, 0, str16, null, null, null, 0, null, commonRarityEnum, false, false, false, 0, false, null, null, 0, 128250, null), new CaseReward(13, 0, str17, null, null, null, 0, null, commonRarityEnum, false, false, false, 0, false, null, null, 0, 128250, null), new CaseReward(14, 0, str18, null, null, null, 0, null, commonRarityEnum, false, false, false, 0, false, null, null, 0, 128250, null), new CaseReward(15, 0, str19, null, null, null, 0, null, commonRarityEnum, false, false, false, 0, false, null, null, 0, 128250, null), new CaseReward(16, 0, str20, null, null, null, 0, null, commonRarityEnum, false, false, b23, 0, false, 0 == true ? 1 : 0, str3, i2, 128250, null)}), 2, 512, 512, true, new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.uiblock.CasesBottomRewardBlockKt.PreviewCasesBottomRewardBlock.1
                public final void invoke(int i3) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }
            }, new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.uiblock.CasesBottomRewardBlockKt.PreviewCasesBottomRewardBlock.2
                public final void invoke(int i3) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }
            }, new Function2<Bitmap, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.uiblock.CasesBottomRewardBlockKt.PreviewCasesBottomRewardBlock.3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@Nullable Bitmap bitmap2, @Nullable Integer num) {
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap2, Integer num) {
                    invoke2(bitmap2, num);
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 920350262, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.uiblock.CasesBottomRewardBlockKt.PreviewCasesBottomRewardBlock.4
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
                    CasesBottomRewardBlockKt.PreviewCasesBottomRewardBlock(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final int CasesBottomRewardBlock$lambda$1(State<Integer> state) {
        return state.getValue().intValue();
    }

    public static final boolean CasesBottomRewardBlock$lambda$3(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }
}

