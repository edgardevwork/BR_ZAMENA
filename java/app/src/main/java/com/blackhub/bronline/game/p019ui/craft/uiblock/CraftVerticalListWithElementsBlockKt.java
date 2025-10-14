package com.blackhub.bronline.game.p019ui.craft.uiblock;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
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
import androidx.profileinstaller.ProfileVerifier;
import com.blackhub.bronline.game.core.enums.CommonRarityEnum;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.gui.craft.enums.CraftElementStatusEnum;
import com.blackhub.bronline.game.gui.craft.enums.CraftScreenTypeEnum;
import com.blackhub.bronline.game.gui.craft.model.CraftElement;
import com.blackhub.bronline.game.gui.craft.model.CraftItemTextBlock;
import com.blackhub.bronline.game.p019ui.widget.button.ButtonWithLineKt;
import com.blackhub.bronline.game.p019ui.widget.scroll.CarouselDefaults;
import com.blackhub.bronline.game.p019ui.widget.scroll.CarouselKt;
import com.bless.client.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CraftVerticalListWithElementsBlock.kt */
@SourceDebugExtension({"SMAP\nCraftVerticalListWithElementsBlock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CraftVerticalListWithElementsBlock.kt\ncom/blackhub/bronline/game/ui/craft/uiblock/CraftVerticalListWithElementsBlockKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,262:1\n1116#2,6:263\n1116#2,6:269\n1116#2,6:275\n1116#2,6:281\n1116#2,6:401\n68#3,6:287\n74#3:321\n68#3,6:322\n74#3:356\n78#3:400\n78#3:411\n79#4,11:293\n79#4,11:328\n79#4,11:362\n92#4:394\n92#4:399\n92#4:410\n456#5,8:304\n464#5,3:318\n456#5,8:339\n464#5,3:353\n456#5,8:373\n464#5,3:387\n467#5,3:391\n467#5,3:396\n467#5,3:407\n3737#6,6:312\n3737#6,6:347\n3737#6,6:381\n88#7,5:357\n93#7:390\n97#7:395\n75#8:412\n108#8,2:413\n75#8:415\n108#8,2:416\n81#9:418\n107#9,2:419\n81#9:421\n*S KotlinDebug\n*F\n+ 1 CraftVerticalListWithElementsBlock.kt\ncom/blackhub/bronline/game/ui/craft/uiblock/CraftVerticalListWithElementsBlockKt\n*L\n54#1:263,6\n56#1:269,6\n57#1:275,6\n89#1:281,6\n146#1:401,6\n95#1:287,6\n95#1:321\n98#1:322,6\n98#1:356\n98#1:400\n95#1:411\n95#1:293,11\n98#1:328,11\n103#1:362,11\n103#1:394\n98#1:399\n95#1:410\n95#1:304,8\n95#1:318,3\n98#1:339,8\n98#1:353,3\n103#1:373,8\n103#1:387,3\n103#1:391,3\n98#1:396,3\n95#1:407,3\n95#1:312,6\n98#1:347,6\n103#1:381,6\n103#1:357,5\n103#1:390\n103#1:395\n54#1:412\n54#1:413,2\n56#1:415\n56#1:416,2\n57#1:418\n57#1:419,2\n89#1:421\n*E\n"})

public final class CraftVerticalListWithElementsBlockKt {
    public static final float FRACTION = 0.99f;

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void CraftVerticalListWithElementsBlock(@Nullable Modifier modifier, @NotNull final CraftScreenTypeEnum currentScreen, @NotNull final List<CraftElement> allElements, @NotNull final Function1<? super CraftElement, Unit> onItemClick, @NotNull final String buttonWithLineText, @NotNull final Function0<Unit> onButtonGetAllOrAddClick, @NotNull final Function1<? super CraftElement, Unit> isNeedToDeleteElement, @Nullable Composer composer, final int i, final int i2) {
        Composer composer2;
        Intrinsics.checkNotNullParameter(currentScreen, "currentScreen");
        Intrinsics.checkNotNullParameter(allElements, "allElements");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        Intrinsics.checkNotNullParameter(buttonWithLineText, "buttonWithLineText");
        Intrinsics.checkNotNullParameter(onButtonGetAllOrAddClick, "onButtonGetAllOrAddClick");
        Intrinsics.checkNotNullParameter(isNeedToDeleteElement, "isNeedToDeleteElement");
        Composer composerStartRestartGroup = composer.startRestartGroup(1279635358);
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1279635358, i, -1, "com.blackhub.bronline.game.ui.craft.uiblock.CraftVerticalListWithElementsBlock (CraftVerticalListWithElementsBlock.kt:52)");
        }
        composerStartRestartGroup.startReplaceableGroup(173736739);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotIntStateKt.mutableIntStateOf(0);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        final MutableIntState mutableIntState = (MutableIntState) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
        composerStartRestartGroup.startReplaceableGroup(173736847);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = SnapshotIntStateKt.mutableIntStateOf(allElements.size());
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        MutableIntState mutableIntState2 = (MutableIntState) objRememberedValue2;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(173736917);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(currentScreen, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(allElements, new C55291(allElements, currentScreen, lazyListStateRememberLazyListState, onItemClick, mutableIntState2, (MutableState) objRememberedValue3, mutableIntState, null), composerStartRestartGroup, 72);
        Brush.Companion companion2 = Brush.INSTANCE;
        Brush brushM11289horizontalGradient8A3gB4$default = Brush.Companion.m11289horizontalGradient8A3gB4$default(companion2, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.dark_gray_blue, composerStartRestartGroup, 6)), Color.m11330boximpl(Color.INSTANCE.m11377getWhite0d7_KjU())}), 0.0f, 0.0f, 0, 14, (Object) null);
        Brush brushM11289horizontalGradient8A3gB4$default2 = Brush.Companion.m11289horizontalGradient8A3gB4$default(companion2, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.light_gray_blue_25, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
        composerStartRestartGroup.startReplaceableGroup(173737993);
        boolean z = (((i & 112) ^ 48) > 32 && composerStartRestartGroup.changed(currentScreen)) || (i & 48) == 32;
        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
        if (z || objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0<Integer>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftVerticalListWithElementsBlockKt$CraftVerticalListWithElementsBlock$listBottomPadding$2$1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Integer invoke() {
                    return Integer.valueOf(currentScreen != CraftScreenTypeEnum.CRAFT ? R.dimen._68wdp : R.dimen._1wdp);
                }
            });
            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
        }
        State state = (State) objRememberedValue4;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion3 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
        Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(SizeKt.fillMaxSize$default(companion5, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(CraftVerticalListWithElementsBlock$lambda$10(state), composerStartRestartGroup, 0), 7, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
        if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion5, 0.0f, 1, null);
        Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, companion3.getTop(), composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor3);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
        if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
        }
        function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        LazyDslKt.LazyColumn(SizeKt.fillMaxHeight$default(companion5, 0.0f, 1, null), lazyListStateRememberLazyListState, null, false, null, null, null, false, new Function1<LazyListScope, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftVerticalListWithElementsBlockKt$CraftVerticalListWithElementsBlock$2$1$1$1
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
            public final void invoke2(@NotNull LazyListScope LazyColumn) {
                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                final List<CraftElement> list = allElements;
                final CraftScreenTypeEnum craftScreenTypeEnum = currentScreen;
                final Function1<CraftElement, Unit> function1 = isNeedToDeleteElement;
                final MutableIntState mutableIntState3 = mutableIntState;
                final Function1<CraftElement, Unit> function12 = onItemClick;
                LazyColumn.items(list.size(), null, new Function1<Integer, Object>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftVerticalListWithElementsBlockKt$CraftVerticalListWithElementsBlock$2$1$1$1$invoke$$inlined$itemsIndexed$default$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                        return invoke(num.intValue());
                    }

                    @Nullable
                    public final Object invoke(int i3) {
                        list.get(i3);
                        return null;
                    }
                }, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftVerticalListWithElementsBlockKt$CraftVerticalListWithElementsBlock$2$1$1$1$invoke$$inlined$itemsIndexed$default$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer3, Integer num2) {
                        invoke(lazyItemScope, num.intValue(), composer3, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@NotNull LazyItemScope lazyItemScope, final int i3, @Nullable Composer composer3, int i4) {
                        int i5;
                        if ((i4 & 14) == 0) {
                            i5 = (composer3.changed(lazyItemScope) ? 4 : 2) | i4;
                        } else {
                            i5 = i4;
                        }
                        if ((i4 & 112) == 0) {
                            i5 |= composer3.changed(i3) ? 32 : 16;
                        }
                        if ((i5 & 731) == 146 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1091073711, i5, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:183)");
                        }
                        final CraftElement craftElement = (CraftElement) list.get(i3);
                        boolean z2 = mutableIntState3.getIntValue() == i3;
                        CraftScreenTypeEnum craftScreenTypeEnum2 = craftScreenTypeEnum;
                        final Function1 function13 = function12;
                        final MutableIntState mutableIntState4 = mutableIntState3;
                        CraftVerticalElementItemKt.CraftVerticalElementItem(craftElement, z2, craftScreenTypeEnum2, new Function1<CraftElement, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftVerticalListWithElementsBlockKt$CraftVerticalListWithElementsBlock$2$1$1$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(CraftElement craftElement2) {
                                invoke2(craftElement2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull CraftElement it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                CraftVerticalListWithElementsBlockKt.CraftVerticalListWithElementsBlock$lambda$2(mutableIntState4, i3);
                                function13.invoke(craftElement);
                            }
                        }, function1, composer3, 8);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
            }
        }, composerStartRestartGroup, 6, SnappyCompressorOutputStream.FOUR_SIZE_BYTE_MARKER);
        CarouselKt.Carousel(lazyListStateRememberLazyListState, SizeKt.fillMaxHeight(SizeKt.m8177width3ABfNKs(companion5, PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composerStartRestartGroup, 6)), 0.99f), 0.0f, 0.0f, CarouselDefaults.INSTANCE.colors(brushM11289horizontalGradient8A3gB4$default, null, brushM11289horizontalGradient8A3gB4$default2, null, composerStartRestartGroup, CpioConstants.C_ISBLK, 10), composerStartRestartGroup, 0, 12);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(173739723);
        if ((currentScreen == CraftScreenTypeEnum.STASH && (!allElements.isEmpty())) || currentScreen == CraftScreenTypeEnum.PROGRESS) {
            Modifier modifierAlign = boxScopeInstance.align(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion5, PrimitiveResources_androidKt.dimensionResource(R.dimen._157wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composerStartRestartGroup, 6)), companion3.getBottomCenter());
            composerStartRestartGroup.startReplaceableGroup(-1968118161);
            boolean z2 = (((458752 & i) ^ ProfileVerifier.CompilationStatus.f342xf2722a21) > 131072 && composerStartRestartGroup.changed(onButtonGetAllOrAddClick)) || (i & ProfileVerifier.CompilationStatus.f342xf2722a21) == 131072;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftVerticalListWithElementsBlockKt$CraftVerticalListWithElementsBlock$2$2$1
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
                        onButtonGetAllOrAddClick.invoke();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            ButtonWithLineKt.ButtonWithLine(modifierAlign, R.color.dark_medium_green, 0, 0, buttonWithLineText, false, 0, 0.0f, (Function0) objRememberedValue5, composer2, (57344 & i) | 48, 236);
        } else {
            composer2 = composerStartRestartGroup;
        }
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier3 = modifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftVerticalListWithElementsBlockKt.CraftVerticalListWithElementsBlock.3
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

                public final void invoke(@Nullable Composer composer3, int i3) {
                    CraftVerticalListWithElementsBlockKt.CraftVerticalListWithElementsBlock(modifier3, currentScreen, allElements, onItemClick, buttonWithLineText, onButtonGetAllOrAddClick, isNeedToDeleteElement, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* compiled from: CraftVerticalListWithElementsBlock.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.craft.uiblock.CraftVerticalListWithElementsBlockKt$CraftVerticalListWithElementsBlock$1", m7120f = "CraftVerticalListWithElementsBlock.kt", m7121i = {}, m7122l = {63}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.ui.craft.uiblock.CraftVerticalListWithElementsBlockKt$CraftVerticalListWithElementsBlock$1 */
    /* loaded from: classes7.dex */
    public static final class C55291 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ List<CraftElement> $allElements;
        public final /* synthetic */ CraftScreenTypeEnum $currentScreen;
        public final /* synthetic */ LazyListState $listState;
        public final /* synthetic */ MutableIntState $oldListSize$delegate;
        public final /* synthetic */ MutableState<CraftScreenTypeEnum> $oldScreen$delegate;
        public final /* synthetic */ Function1<CraftElement, Unit> $onItemClick;
        public final /* synthetic */ MutableIntState $selectedIndex$delegate;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C55291(List<CraftElement> list, CraftScreenTypeEnum craftScreenTypeEnum, LazyListState lazyListState, Function1<? super CraftElement, Unit> function1, MutableIntState mutableIntState, MutableState<CraftScreenTypeEnum> mutableState, MutableIntState mutableIntState2, Continuation<? super C55291> continuation) {
            super(2, continuation);
            this.$allElements = list;
            this.$currentScreen = craftScreenTypeEnum;
            this.$listState = lazyListState;
            this.$onItemClick = function1;
            this.$oldListSize$delegate = mutableIntState;
            this.$oldScreen$delegate = mutableState;
            this.$selectedIndex$delegate = mutableIntState2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C55291(this.$allElements, this.$currentScreen, this.$listState, this.$onItemClick, this.$oldListSize$delegate, this.$oldScreen$delegate, this.$selectedIndex$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C55291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                if (!(!this.$allElements.isEmpty()) || (CraftVerticalListWithElementsBlockKt.CraftVerticalListWithElementsBlock$lambda$4(this.$oldListSize$delegate) == this.$allElements.size() && this.$currentScreen == CraftVerticalListWithElementsBlockKt.CraftVerticalListWithElementsBlock$lambda$7(this.$oldScreen$delegate))) {
                    CraftVerticalListWithElementsBlockKt.CraftVerticalListWithElementsBlock$lambda$5(this.$oldListSize$delegate, this.$allElements.size());
                    CraftVerticalListWithElementsBlockKt.CraftVerticalListWithElementsBlock$lambda$8(this.$oldScreen$delegate, this.$currentScreen);
                    return Unit.INSTANCE;
                }
                CraftVerticalListWithElementsBlockKt.CraftVerticalListWithElementsBlock$lambda$8(this.$oldScreen$delegate, this.$currentScreen);
                CraftVerticalListWithElementsBlockKt.CraftVerticalListWithElementsBlock$lambda$5(this.$oldListSize$delegate, this.$allElements.size());
                LazyListState lazyListState = this.$listState;
                this.label = 1;
                if (LazyListState.scrollToItem$default(lazyListState, 0, 0, this, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            MutableIntState mutableIntState = this.$selectedIndex$delegate;
            if (AnyExtensionKt.isNotNull(CollectionsKt___CollectionsKt.firstOrNull((List) this.$allElements))) {
                i = 0;
                this.$onItemClick.invoke(this.$allElements.get(0));
            } else {
                i = -1;
            }
            CraftVerticalListWithElementsBlockKt.CraftVerticalListWithElementsBlock$lambda$2(mutableIntState, i);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void PreviewCraftVerticalListWithElementsBlock(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-2145791263);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2145791263, i, -1, "com.blackhub.bronline.game.ui.craft.uiblock.PreviewCraftVerticalListWithElementsBlock (CraftVerticalListWithElementsBlock.kt:152)");
            }
            Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(SizeKt.m8177width3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._261wdp, composerStartRestartGroup, 6)), 0.0f, 1, null);
            CraftItemTextBlock craftItemTextBlock = new CraftItemTextBlock("Крутая маска", "99 ч 39 мин 44 сек", 25, 0, 9.99f, "description", 8, null);
            CraftElementStatusEnum craftElementStatusEnum = CraftElementStatusEnum.NEW_ELEMENT;
            CommonRarityEnum commonRarityEnum = CommonRarityEnum.LEGENDARY;
            CraftElement craftElement = new CraftElement(0, 0, null, 0, 0, 0, null, commonRarityEnum, craftElementStatusEnum, 0, craftItemTextBlock, null, 0, 1718874198L, 0, 0, 55935, null);
            CraftElement craftElement2 = new CraftElement(0, 0, null, 0, 0, 0, null, commonRarityEnum, craftElementStatusEnum, 0, new CraftItemTextBlock("Крутая маска", "99 ч 39 мин 44 сек", 25, 0, 9.99f, "description", 8, null), null, 0, 1718874198L, 0, 0, 55935, null);
            CraftElement craftElement3 = new CraftElement(0, 0, null, 0, 0, 0, null, commonRarityEnum, craftElementStatusEnum, 0, new CraftItemTextBlock("Крутая маска", "99 ч 39 мин 44 сек", 25, 0, 9.99f, "description", 8, null), null, 0, 1718874198L, 0, 0, 55935, null);
            CraftElement craftElement4 = new CraftElement(0, 0, null, 0, 0, 0, null, commonRarityEnum, craftElementStatusEnum, 0, new CraftItemTextBlock("Крутая маска", "99 ч 39 мин 44 сек", 25, 0, 9.99f, "description", 8, null), null, 0, 1718874198L, 0, 0, 55935, null);
            CraftItemTextBlock craftItemTextBlock2 = new CraftItemTextBlock("Крутая маска", "99 ч 39 мин 44 сек", 25, 0, 9.99f, "description", 8, null);
            CommonRarityEnum commonRarityEnum2 = CommonRarityEnum.COMMON;
            CraftVerticalListWithElementsBlock(modifierFillMaxHeight$default, CraftScreenTypeEnum.STASH, CollectionsKt__CollectionsKt.listOf((Object[]) new CraftElement[]{craftElement, craftElement2, craftElement3, craftElement4, new CraftElement(0, 0, null, 0, 0, 0, null, commonRarityEnum2, craftElementStatusEnum, 0, craftItemTextBlock2, null, 0, 1718874198L, 0, 0, 55935, null), new CraftElement(0, 0, null, 0, 0, 0, null, commonRarityEnum, craftElementStatusEnum, 0, new CraftItemTextBlock("Крутая маска", "99 ч 39 мин 44 сек", 25, 0, 9.99f, "description", 8, null), null, 0, 1718874198L, 0, 0, 55935, null), new CraftElement(0, 0, null, 0, 0, 0, null, commonRarityEnum2, craftElementStatusEnum, 0, new CraftItemTextBlock("Крутая маска", "99 ч 39 мин 44 сек", 25, 0, 9.99f, "description", 8, null), null, 0, 1718874198L, 0, 0, 55935, null), new CraftElement(0, 0, null, 0, 0, 0, null, commonRarityEnum2, CraftElementStatusEnum.IN_THE_QUEUE, 0, new CraftItemTextBlock("Крутая маска", "99 ч 39 мин 44 сек", 25, 0, 9.99f, "description", 8, null), null, 0, 1718874198L, 0, 0, 55935, null)}), new Function1<CraftElement, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftVerticalListWithElementsBlockKt.PreviewCraftVerticalListWithElementsBlock.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull CraftElement craftElement5) {
                    Intrinsics.checkNotNullParameter(craftElement5, "<anonymous parameter 0>");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CraftElement craftElement5) {
                    invoke2(craftElement5);
                    return Unit.INSTANCE;
                }
            }, "Получить все", new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftVerticalListWithElementsBlockKt.PreviewCraftVerticalListWithElementsBlock.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function1<CraftElement, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftVerticalListWithElementsBlockKt.PreviewCraftVerticalListWithElementsBlock.3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull CraftElement it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CraftElement craftElement5) {
                    invoke2(craftElement5);
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 1797680, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftVerticalListWithElementsBlockKt.PreviewCraftVerticalListWithElementsBlock.4
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
                    CraftVerticalListWithElementsBlockKt.PreviewCraftVerticalListWithElementsBlock(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void CraftVerticalListWithElementsBlock$lambda$2(MutableIntState mutableIntState, int i) {
        mutableIntState.setIntValue(i);
    }

    public static final int CraftVerticalListWithElementsBlock$lambda$4(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    public static final void CraftVerticalListWithElementsBlock$lambda$5(MutableIntState mutableIntState, int i) {
        mutableIntState.setIntValue(i);
    }

    public static final CraftScreenTypeEnum CraftVerticalListWithElementsBlock$lambda$7(MutableState<CraftScreenTypeEnum> mutableState) {
        return mutableState.getValue();
    }

    public static final void CraftVerticalListWithElementsBlock$lambda$8(MutableState<CraftScreenTypeEnum> mutableState, CraftScreenTypeEnum craftScreenTypeEnum) {
        mutableState.setValue(craftScreenTypeEnum);
    }

    public static final int CraftVerticalListWithElementsBlock$lambda$10(State<Integer> state) {
        return state.getValue().intValue();
    }
}

