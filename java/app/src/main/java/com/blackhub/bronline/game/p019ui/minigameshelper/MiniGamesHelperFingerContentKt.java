package com.blackhub.bronline.game.p019ui.minigameshelper;

import android.annotation.SuppressLint;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.layout.LayoutCoordinates;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
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
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
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

/* compiled from: MiniGamesHelperFingerContent.kt */
@SourceDebugExtension({"SMAP\nMiniGamesHelperFingerContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiniGamesHelperFingerContent.kt\ncom/blackhub/bronline/game/ui/minigameshelper/MiniGamesHelperFingerContentKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,113:1\n1116#2,6:114\n1116#2,6:120\n1116#2,6:126\n1116#2,6:132\n68#3,6:138\n74#3:172\n78#3:177\n79#4,11:144\n92#4:176\n456#5,8:155\n464#5,3:169\n467#5,3:173\n3737#6,6:163\n75#7:178\n108#7,2:179\n81#8:181\n81#8:182\n81#8:183\n*S KotlinDebug\n*F\n+ 1 MiniGamesHelperFingerContent.kt\ncom/blackhub/bronline/game/ui/minigameshelper/MiniGamesHelperFingerContentKt\n*L\n43#1:114,6\n45#1:120,6\n48#1:126,6\n51#1:132,6\n55#1:138,6\n55#1:172\n55#1:177\n55#1:144,11\n55#1:176\n55#1:155,8\n55#1:169,3\n55#1:173,3\n55#1:163,6\n43#1:178\n43#1:179,2\n45#1:181\n48#1:182\n51#1:183\n*E\n"})
/* loaded from: classes3.dex */
public final class MiniGamesHelperFingerContentKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void MiniGamesHelperFingerContent(@NotNull final Modifier modifier, final int i, @NotNull final MutableState<Boolean> isLineHit, @Nullable Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(isLineHit, "isLineHit");
        Composer composerStartRestartGroup = composer.startRestartGroup(1597021633);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(isLineHit) ? 256 : 128;
        }
        if ((i3 & 731) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1597021633, i3, -1, "com.blackhub.bronline.game.ui.minigameshelper.MiniGamesHelperFingerContent (MiniGamesHelperFingerContent.kt:41)");
            }
            composerStartRestartGroup.startReplaceableGroup(1941042530);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotIntStateKt.mutableIntStateOf(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableIntState mutableIntState = (MutableIntState) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(1941042594);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0<Integer>() { // from class: com.blackhub.bronline.game.ui.minigameshelper.MiniGamesHelperFingerContentKt$MiniGamesHelperFingerContent$chunkWidth$2$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final Integer invoke() {
                        return Integer.valueOf(mutableIntState.getIntValue() / 4);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final State state = (State) objRememberedValue2;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(1941042679);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0<Integer>() { // from class: com.blackhub.bronline.game.ui.minigameshelper.MiniGamesHelperFingerContentKt$MiniGamesHelperFingerContent$chunk$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final Integer invoke() {
                        return Integer.valueOf((mutableIntState.getIntValue() / 100) / i);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final State state2 = (State) objRememberedValue3;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(1941042777);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0<Integer>() { // from class: com.blackhub.bronline.game.ui.minigameshelper.MiniGamesHelperFingerContentKt$MiniGamesHelperFingerContent$margin$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final Integer invoke() {
                        return Integer.valueOf(MiniGamesHelperFingerContentKt.MiniGamesHelperFingerContent$lambda$6(state2) * 100);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            final State state3 = (State) objRememberedValue4;
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierM8125paddingVpY3zN4$default = PaddingKt.m8125paddingVpY3zN4$default(SizeKt.m8158height3ABfNKs(modifier, PrimitiveResources_androidKt.dimensionResource(R.dimen._46wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composerStartRestartGroup, 6), 0.0f, 2, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8125paddingVpY3zN4$default);
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
            SurfaceKt.m9876SurfaceT9BRK9s(BoxScopeInstance.INSTANCE.align(SizeKt.m8158height3ABfNKs(SizeKt.wrapContentSize$default(Modifier.INSTANCE, null, false, 3, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._16wdp, composerStartRestartGroup, 6)), companion2.getCenter()), RoundedCornerShapeKt.getCircleShape(), ColorResources_androidKt.colorResource(R.color.transparent, composerStartRestartGroup, 6), ColorResources_androidKt.colorResource(R.color.transparent, composerStartRestartGroup, 6), 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -690296192, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.minigameshelper.MiniGamesHelperFingerContentKt$MiniGamesHelperFingerContent$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                public final void invoke(@Nullable Composer composer3, int i4) {
                    if ((i4 & 11) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-690296192, i4, -1, "com.blackhub.bronline.game.ui.minigameshelper.MiniGamesHelperFingerContent.<anonymous>.<anonymous> (MiniGamesHelperFingerContent.kt:68)");
                        }
                        Modifier.Companion companion4 = Modifier.INSTANCE;
                        Modifier modifierBackground$default = BackgroundKt.background$default(SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null), Brush.Companion.m11291linearGradientmHitzGk$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.transparent, composer3, 6)), Color.m11330boximpl(Color.INSTANCE.m11377getWhite0d7_KjU()), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.transparent, composer3, 6))}), 0L, 0L, 0, 14, (Object) null), RoundedCornerShapeKt.getCircleShape(), 0.0f, 4, null);
                        composer3.startReplaceableGroup(-294225484);
                        final MutableIntState mutableIntState2 = mutableIntState;
                        Object objRememberedValue5 = composer3.rememberedValue();
                        if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new Function1<LayoutCoordinates, Unit>() { // from class: com.blackhub.bronline.game.ui.minigameshelper.MiniGamesHelperFingerContentKt$MiniGamesHelperFingerContent$1$1$1$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                                    invoke2(layoutCoordinates);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull LayoutCoordinates layoutCoordinates) {
                                    Intrinsics.checkNotNullParameter(layoutCoordinates, "layoutCoordinates");
                                    mutableIntState2.setIntValue(IntSize.m13836getWidthimpl(layoutCoordinates.mo12617getSizeYbymL2g()));
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue5);
                        }
                        composer3.endReplaceableGroup();
                        BoxKt.Box(OnGloballyPositionedModifierKt.onGloballyPositioned(modifierBackground$default, (Function1) objRememberedValue5), composer3, 0);
                        BoxKt.Box(BackgroundKt.m7771backgroundbw27NRU$default(OffsetKt.m8084offsetVpY3zN4$default(SizeKt.fillMaxHeight$default(SizeKt.m8177width3ABfNKs(companion4, ComposeExtensionKt.pxToDp(MiniGamesHelperFingerContentKt.MiniGamesHelperFingerContent$lambda$4(state), composer3, 0)), 0.0f, 1, null), ComposeExtensionKt.pxToDp(MiniGamesHelperFingerContentKt.MiniGamesHelperFingerContent$lambda$8(state3), composer3, 0), 0.0f, 2, null), ColorResources_androidKt.colorResource(R.color.light_green, composer3, 6), null, 2, null), composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), composerStartRestartGroup, 12582912, 112);
            composer2 = composerStartRestartGroup;
            MovingVerticalLineKt.m15011MovingVerticalLine36lltbM(ColorResources_androidKt.colorResource(R.color.red, composerStartRestartGroup, 6), ComposeExtensionKt.pxToDp(MiniGamesHelperFingerContent$lambda$6(state2), composerStartRestartGroup, 0), ComposeExtensionKt.pxToDp(mutableIntState.getIntValue(), composerStartRestartGroup, 0), i, isLineHit, composerStartRestartGroup, (i3 << 6) & 64512);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.minigameshelper.MiniGamesHelperFingerContentKt.MiniGamesHelperFingerContent.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i4) {
                    MiniGamesHelperFingerContentKt.MiniGamesHelperFingerContent(modifier, i, isLineHit, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @FigmaLargePreview
    @SuppressLint({"UnrememberedMutableState"})
    @Composable
    public static final void MiniGamesHelperFingerContentPreview(@Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1034919060);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1034919060, i, -1, "com.blackhub.bronline.game.ui.minigameshelper.MiniGamesHelperFingerContentPreview (MiniGamesHelperFingerContent.kt:106)");
            }
            MiniGamesHelperFingerContent(Modifier.INSTANCE, 7, SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null), composerStartRestartGroup, 54);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.minigameshelper.MiniGamesHelperFingerContentKt.MiniGamesHelperFingerContentPreview.1
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
                    MiniGamesHelperFingerContentKt.MiniGamesHelperFingerContentPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final int MiniGamesHelperFingerContent$lambda$4(State<Integer> state) {
        return state.getValue().intValue();
    }

    public static final int MiniGamesHelperFingerContent$lambda$6(State<Integer> state) {
        return state.getValue().intValue();
    }

    public static final int MiniGamesHelperFingerContent$lambda$8(State<Integer> state) {
        return state.getValue().intValue();
    }
}

