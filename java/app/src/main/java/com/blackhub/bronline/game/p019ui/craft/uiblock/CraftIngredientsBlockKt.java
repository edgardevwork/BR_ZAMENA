package com.blackhub.bronline.game.p019ui.craft.uiblock;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.layout.LayoutCoordinates;
import androidx.compose.p003ui.layout.LayoutCoordinatesKt;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntOffsetKt;
import androidx.compose.p003ui.unit.IntSize;
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
import com.blackhub.bronline.game.core.enums.CommonRarityEnum;
import com.blackhub.bronline.game.core.extension.FloatExtensionKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.gui.craft.model.CraftIngredient;
import com.blackhub.bronline.game.p019ui.craft.CraftIngredientInfoWindowKt;
import com.blackhub.bronline.game.p019ui.craft.CraftIngredientItemKt;
import com.bless.client.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CraftIngredientsBlock.kt */
@SourceDebugExtension({"SMAP\nCraftIngredientsBlock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CraftIngredientsBlock.kt\ncom/blackhub/bronline/game/ui/craft/uiblock/CraftIngredientsBlockKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 8 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n*L\n1#1,175:1\n1116#2,6:176\n1116#2,6:182\n1116#2,6:188\n1116#2,6:194\n1116#2,6:200\n1116#2,6:206\n1116#2,6:212\n1116#2,6:218\n1116#2,6:224\n1116#2,6:265\n1116#2,6:271\n1116#2,6:277\n1116#2,6:288\n87#3,6:230\n93#3:264\n97#3:287\n79#4,11:236\n92#4:286\n456#5,8:247\n464#5,3:261\n467#5,3:283\n3737#6,6:255\n81#7:294\n107#7,2:295\n81#7:300\n107#7,2:301\n81#7:303\n107#7,2:304\n81#7:312\n81#7:313\n75#8:297\n108#8,2:298\n75#8:306\n108#8,2:307\n75#8:309\n108#8,2:310\n*S KotlinDebug\n*F\n+ 1 CraftIngredientsBlock.kt\ncom/blackhub/bronline/game/ui/craft/uiblock/CraftIngredientsBlockKt\n*L\n47#1:176,6\n49#1:182,6\n51#1:188,6\n53#1:194,6\n54#1:200,6\n55#1:206,6\n57#1:212,6\n58#1:218,6\n90#1:224,6\n109#1:265,6\n115#1:271,6\n126#1:277,6\n134#1:288,6\n103#1:230,6\n103#1:264\n103#1:287\n103#1:236,11\n103#1:286\n103#1:247,8\n103#1:261,3\n103#1:283,3\n103#1:255,6\n47#1:294\n47#1:295,2\n51#1:300\n51#1:301,2\n53#1:303\n53#1:304,2\n57#1:312\n58#1:313\n49#1:297\n49#1:298,2\n54#1:306\n54#1:307,2\n55#1:309\n55#1:310,2\n*E\n"})

public final class CraftIngredientsBlockKt {
    public static final long WAITING_MILLIS = 5000;

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void CraftIngredientsBlock(@Nullable Modifier modifier, @NotNull final List<CraftIngredient> ingredients, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(ingredients, "ingredients");
        Composer composerStartRestartGroup = composer.startRestartGroup(-408269232);
        final Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-408269232, i, -1, "com.blackhub.bronline.game.ui.craft.uiblock.CraftIngredientsBlock (CraftIngredientsBlock.kt:42)");
        }
        Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._25wdp, composerStartRestartGroup, 6), 0.0f, 11, null);
        composerStartRestartGroup.startReplaceableGroup(-1173331833);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ingredients, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        MutableState mutableState = (MutableState) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-1173331759);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = SnapshotIntStateKt.mutableIntStateOf(-1);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        final MutableIntState mutableIntState = (MutableIntState) objRememberedValue2;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-1173331683);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        final MutableState mutableState2 = (MutableState) objRememberedValue3;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-1173331613);
        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntOffset.m13785boximpl(IntOffset.INSTANCE.m13804getZeronOccac()), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
        }
        final MutableState mutableState3 = (MutableState) objRememberedValue4;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-1173331538);
        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue5 == companion.getEmpty()) {
            objRememberedValue5 = SnapshotIntStateKt.mutableIntStateOf(0);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
        }
        final MutableIntState mutableIntState2 = (MutableIntState) objRememberedValue5;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-1173331465);
        Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue6 == companion.getEmpty()) {
            objRememberedValue6 = SnapshotIntStateKt.mutableIntStateOf(0);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
        }
        final MutableIntState mutableIntState3 = (MutableIntState) objRememberedValue6;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-1173331404);
        Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue7 == companion.getEmpty()) {
            objRememberedValue7 = SnapshotStateKt.derivedStateOf(new Function0<Integer>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftIngredientsBlockKt$CraftIngredientsBlock$yOffset$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Integer invoke() {
                    return Integer.valueOf(IntOffset.m13795getYimpl(CraftIngredientsBlockKt.CraftIngredientsBlock$lambda$10(mutableState3)) - mutableIntState3.getIntValue());
                }
            });
            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
        }
        final State state = (State) objRememberedValue7;
        composerStartRestartGroup.endReplaceableGroup();
        int intValue = mutableIntState.getIntValue();
        composerStartRestartGroup.startReplaceableGroup(-1173331305);
        boolean zChanged = composerStartRestartGroup.changed(intValue);
        Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue8 == companion.getEmpty()) {
            objRememberedValue8 = SnapshotStateKt.derivedStateOf(new Function0<Integer>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftIngredientsBlockKt$CraftIngredientsBlock$xOffset$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Integer invoke() {
                    int iM13794getXimpl;
                    int intValue2;
                    int i4;
                    int iM13794getXimpl2;
                    int intValue3;
                    int intValue4;
                    int intValue5;
                    int intValue6;
                    int size = ingredients.size();
                    if (size == 2) {
                        iM13794getXimpl = IntOffset.m13794getXimpl(CraftIngredientsBlockKt.CraftIngredientsBlock$lambda$10(mutableState3));
                        intValue2 = mutableIntState2.getIntValue();
                    } else {
                        if (size != 3) {
                            if (size == 4) {
                                int intValue7 = mutableIntState.getIntValue();
                                if (intValue7 == 0) {
                                    iM13794getXimpl2 = IntOffset.m13794getXimpl(CraftIngredientsBlockKt.CraftIngredientsBlock$lambda$10(mutableState3));
                                    intValue3 = mutableIntState2.getIntValue();
                                    intValue5 = intValue3 * 5;
                                } else if (intValue7 != 1) {
                                    if (intValue7 != 2) {
                                        iM13794getXimpl2 = IntOffset.m13794getXimpl(CraftIngredientsBlockKt.CraftIngredientsBlock$lambda$10(mutableState3));
                                        intValue6 = mutableIntState2.getIntValue();
                                    } else {
                                        iM13794getXimpl2 = IntOffset.m13794getXimpl(CraftIngredientsBlockKt.CraftIngredientsBlock$lambda$10(mutableState3));
                                        intValue6 = mutableIntState2.getIntValue();
                                    }
                                    intValue5 = intValue6 * 3;
                                } else {
                                    iM13794getXimpl2 = IntOffset.m13794getXimpl(CraftIngredientsBlockKt.CraftIngredientsBlock$lambda$10(mutableState3));
                                    intValue4 = mutableIntState2.getIntValue();
                                    intValue5 = intValue4 * 4;
                                }
                            } else if (size != 5) {
                                iM13794getXimpl = IntOffset.m13794getXimpl(CraftIngredientsBlockKt.CraftIngredientsBlock$lambda$10(mutableState3));
                                intValue2 = mutableIntState2.getIntValue();
                            } else {
                                int intValue8 = mutableIntState.getIntValue();
                                if (intValue8 == 0) {
                                    iM13794getXimpl2 = IntOffset.m13794getXimpl(CraftIngredientsBlockKt.CraftIngredientsBlock$lambda$10(mutableState3));
                                    intValue5 = mutableIntState2.getIntValue() * 8;
                                } else if (intValue8 == 1) {
                                    iM13794getXimpl2 = IntOffset.m13794getXimpl(CraftIngredientsBlockKt.CraftIngredientsBlock$lambda$10(mutableState3));
                                    intValue5 = mutableIntState2.getIntValue() * 7;
                                } else if (intValue8 != 2) {
                                    if (intValue8 != 3) {
                                        iM13794getXimpl2 = IntOffset.m13794getXimpl(CraftIngredientsBlockKt.CraftIngredientsBlock$lambda$10(mutableState3));
                                        intValue6 = mutableIntState2.getIntValue();
                                    } else {
                                        iM13794getXimpl2 = IntOffset.m13794getXimpl(CraftIngredientsBlockKt.CraftIngredientsBlock$lambda$10(mutableState3));
                                        intValue6 = mutableIntState2.getIntValue();
                                    }
                                    intValue5 = intValue6 * 3;
                                } else {
                                    iM13794getXimpl2 = IntOffset.m13794getXimpl(CraftIngredientsBlockKt.CraftIngredientsBlock$lambda$10(mutableState3));
                                    intValue4 = mutableIntState2.getIntValue();
                                    intValue5 = intValue4 * 4;
                                }
                            }
                            i4 = iM13794getXimpl2 - intValue5;
                        } else {
                            int intValue9 = mutableIntState.getIntValue();
                            if (intValue9 == 0) {
                                iM13794getXimpl2 = IntOffset.m13794getXimpl(CraftIngredientsBlockKt.CraftIngredientsBlock$lambda$10(mutableState3));
                                intValue3 = mutableIntState2.getIntValue();
                                intValue5 = intValue3 * 5;
                                i4 = iM13794getXimpl2 - intValue5;
                            } else if (intValue9 != 1) {
                                iM13794getXimpl = IntOffset.m13794getXimpl(CraftIngredientsBlockKt.CraftIngredientsBlock$lambda$10(mutableState3));
                                intValue2 = mutableIntState2.getIntValue();
                            } else {
                                iM13794getXimpl2 = IntOffset.m13794getXimpl(CraftIngredientsBlockKt.CraftIngredientsBlock$lambda$10(mutableState3));
                                intValue4 = mutableIntState2.getIntValue();
                                intValue5 = intValue4 * 4;
                                i4 = iM13794getXimpl2 - intValue5;
                            }
                        }
                        return Integer.valueOf(i4);
                    }
                    i4 = iM13794getXimpl - (intValue2 * 2);
                    return Integer.valueOf(i4);
                }
            });
            composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
        }
        final State state2 = (State) objRememberedValue8;
        composerStartRestartGroup.endReplaceableGroup();
        Integer numValueOf = Integer.valueOf(mutableIntState.getIntValue());
        MutableIntState mutableIntState4 = mutableIntState3;
        composerStartRestartGroup.startReplaceableGroup(-1173329651);
        Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue9 == companion.getEmpty()) {
            objRememberedValue9 = new CraftIngredientsBlockKt$CraftIngredientsBlock$1$1(mutableState2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
        }
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue9, composerStartRestartGroup, 64);
        if (!ingredients.isEmpty()) {
            if (Intrinsics.areEqual(ingredients, CraftIngredientsBlock$lambda$1(mutableState))) {
                i3 = 0;
            } else {
                mutableState.setValue(ingredients);
                i3 = 0;
                CraftIngredientsBlock$lambda$8(mutableState2, false);
            }
            int size = ingredients.size() - 1;
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, i3);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i3);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(887540621);
            final int i4 = 0;
            while (i4 < size) {
                CraftIngredient craftIngredient = ingredients.get(i4);
                boolean zCraftIngredientsBlock$lambda$7 = CraftIngredientsBlock$lambda$7(mutableState2);
                composerStartRestartGroup.startReplaceableGroup(887540862);
                boolean zChanged2 = composerStartRestartGroup.changed(i4);
                Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue10 = new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftIngredientsBlockKt$CraftIngredientsBlock$2$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                            invoke(bool.booleanValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(boolean z) {
                            CraftIngredientsBlockKt.CraftIngredientsBlock$lambda$8(mutableState2, z);
                            mutableIntState.setIntValue(i4);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CraftIngredientItemKt.IngredientItem(modifierM8127paddingqDBjuR0$default, craftIngredient, zCraftIngredientsBlock$lambda$7, (Function1) objRememberedValue10, composerStartRestartGroup, 64, 0);
                i4++;
                mutableIntState4 = mutableIntState4;
                size = size;
                modifierM8127paddingqDBjuR0$default = modifierM8127paddingqDBjuR0$default;
            }
            final int i5 = size;
            final MutableIntState mutableIntState5 = mutableIntState4;
            composerStartRestartGroup.endReplaceableGroup();
            Modifier.Companion companion3 = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(887541088);
            Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objRememberedValue11 == companion4.getEmpty()) {
                objRememberedValue11 = new Function1<LayoutCoordinates, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftIngredientsBlockKt$CraftIngredientsBlock$2$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                        invoke2(layoutCoordinates);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull LayoutCoordinates coordinates) {
                        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
                        long jPositionInRoot = LayoutCoordinatesKt.positionInRoot(coordinates);
                        CraftIngredientsBlockKt.CraftIngredientsBlock$lambda$11(mutableState3, IntOffsetKt.IntOffset(FloatExtensionKt.roundToIntSafely(Offset.m11099getXimpl(jPositionInRoot)), FloatExtensionKt.roundToIntSafely(Offset.m11100getYimpl(jPositionInRoot))));
                        mutableIntState2.setIntValue(IntSize.m13836getWidthimpl(coordinates.mo12617getSizeYbymL2g()));
                        mutableIntState5.setIntValue(IntSize.m13835getHeightimpl(coordinates.mo12617getSizeYbymL2g()));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(companion3, (Function1) objRememberedValue11);
            CraftIngredient craftIngredient2 = ingredients.get(i5);
            boolean zCraftIngredientsBlock$lambda$72 = CraftIngredientsBlock$lambda$7(mutableState2);
            composerStartRestartGroup.startReplaceableGroup(887541641);
            boolean zChanged3 = composerStartRestartGroup.changed(i5);
            Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue12 == companion4.getEmpty()) {
                objRememberedValue12 = new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftIngredientsBlockKt$CraftIngredientsBlock$2$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                        invoke(bool.booleanValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean z) {
                        CraftIngredientsBlockKt.CraftIngredientsBlock$lambda$8(mutableState2, z);
                        mutableIntState.setIntValue(i5);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CraftIngredientItemKt.IngredientItem(modifierOnGloballyPositioned, craftIngredient2, zCraftIngredientsBlock$lambda$72, (Function1) objRememberedValue12, composerStartRestartGroup, 70, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (CraftIngredientsBlock$lambda$7(mutableState2)) {
                composerStartRestartGroup.startReplaceableGroup(-1173328019);
                boolean zChanged4 = composerStartRestartGroup.changed(state2);
                Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                if (zChanged4 || objRememberedValue13 == companion4.getEmpty()) {
                    objRememberedValue13 = new Function1<Density, IntOffset>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftIngredientsBlockKt$CraftIngredientsBlock$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
                            return IntOffset.m13785boximpl(m14972invokeBjo55l4(density));
                        }

                        /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                        public final long m14972invokeBjo55l4(@NotNull Density offset) {
                            Intrinsics.checkNotNullParameter(offset, "$this$offset");
                            return IntOffsetKt.IntOffset(CraftIngredientsBlockKt.CraftIngredientsBlock$lambda$21(state2), CraftIngredientsBlockKt.CraftIngredientsBlock$lambda$19(state));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CraftIngredientInfoWindowKt.CraftIngredientInfoWindow(OffsetKt.offset(companion3, (Function1) objRememberedValue13), ingredients.get(mutableIntState.getIntValue()), composerStartRestartGroup, 64, 0);
            }
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftIngredientsBlockKt.CraftIngredientsBlock.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i6) {
                    CraftIngredientsBlockKt.CraftIngredientsBlock(modifier2, ingredients, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    public static final void CraftIngredientsBlock$lambda$8(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final void CraftIngredientsBlock$lambda$11(MutableState<IntOffset> mutableState, long j) {
        mutableState.setValue(IntOffset.m13785boximpl(j));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void CraftIngredientsBlockPreview(@Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-235717605);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-235717605, i, -1, "com.blackhub.bronline.game.ui.craft.uiblock.CraftIngredientsBlockPreview (CraftIngredientsBlock.kt:142)");
            }
            CommonRarityEnum commonRarityEnum = CommonRarityEnum.COMMON;
            CraftIngredient craftIngredient = new CraftIngredient(0, commonRarityEnum, null, null, null, 0, 0, 10, 10, false, false, 1661, null);
            CraftIngredient craftIngredient2 = new CraftIngredient(0, CommonRarityEnum.UNCOMMON, null, null, null, 0, 0, 10, 10, false, false, 1661, null);
            CraftIngredient craftIngredient3 = new CraftIngredient(0, CommonRarityEnum.LEGENDARY, null, null, null, 0, 0, 10, 10, true, false, 1149, null);
            CommonRarityEnum commonRarityEnum2 = CommonRarityEnum.EPIC;
            CraftIngredientsBlock(null, CollectionsKt__CollectionsKt.listOf((Object[]) new CraftIngredient[]{craftIngredient, craftIngredient2, craftIngredient3, new CraftIngredient(0, commonRarityEnum2, null, null, null, 0, 0, 10, 10, false, false, 1661, null), new CraftIngredient(0, commonRarityEnum2, null, null, null, 0, 0, 0, 0, false, false, 2045, null), new CraftIngredient(0, commonRarityEnum, null, null, null, 0, 0, 0, 0, false, false, 2045, null)}), composerStartRestartGroup, 64, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.uiblock.CraftIngredientsBlockKt.CraftIngredientsBlockPreview.1
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
                    CraftIngredientsBlockKt.CraftIngredientsBlockPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final List<CraftIngredient> CraftIngredientsBlock$lambda$1(MutableState<List<CraftIngredient>> mutableState) {
        return mutableState.getValue();
    }

    public static final boolean CraftIngredientsBlock$lambda$7(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final long CraftIngredientsBlock$lambda$10(MutableState<IntOffset> mutableState) {
        return mutableState.getValue().getPackedValue();
    }

    public static final int CraftIngredientsBlock$lambda$19(State<Integer> state) {
        return state.getValue().intValue();
    }

    public static final int CraftIngredientsBlock$lambda$21(State<Integer> state) {
        return state.getValue().intValue();
    }
}

