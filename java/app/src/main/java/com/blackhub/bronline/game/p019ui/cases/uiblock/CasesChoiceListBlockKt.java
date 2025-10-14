package com.blackhub.bronline.game.p019ui.cases.uiblock;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.gui.cases.model.Case;
import com.blackhub.bronline.game.p019ui.widget.other.TriangleWidgetKt;
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
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CasesChoiceListBlock.kt */
@SourceDebugExtension({"SMAP\nCasesChoiceListBlock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CasesChoiceListBlock.kt\ncom/blackhub/bronline/game/ui/cases/uiblock/CasesChoiceListBlockKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,113:1\n1116#2,6:114\n1116#2,6:120\n1116#2,6:126\n1116#2,6:132\n74#3,6:138\n80#3:172\n84#3:177\n79#4,11:144\n92#4:176\n456#5,8:155\n464#5,3:169\n467#5,3:173\n3737#6,6:163\n81#7:178\n81#7:179\n*S KotlinDebug\n*F\n+ 1 CasesChoiceListBlock.kt\ncom/blackhub/bronline/game/ui/cases/uiblock/CasesChoiceListBlockKt\n*L\n35#1:114,6\n37#1:120,6\n45#1:126,6\n54#1:132,6\n58#1:138,6\n58#1:172\n58#1:177\n58#1:144,11\n58#1:176\n58#1:155,8\n58#1:169,3\n58#1:173,3\n58#1:163,6\n37#1:178\n45#1:179\n*E\n"})

public final class CasesChoiceListBlockKt {
    public static final float HALF_ALPHA = 0.5f;

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void CasesChoiceListBlock(@Nullable Modifier modifier, @NotNull final List<Case> casesList, final int i, final int i2, final boolean z, @NotNull final Function1<? super Case, Unit> onSelectCase, @Nullable Composer composer, final int i3, final int i4) {
        Intrinsics.checkNotNullParameter(casesList, "casesList");
        Intrinsics.checkNotNullParameter(onSelectCase, "onSelectCase");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2007678960);
        Modifier modifier2 = (i4 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2007678960, i3, -1, "com.blackhub.bronline.game.ui.cases.uiblock.CasesChoiceListBlock (CasesChoiceListBlock.kt:32)");
        }
        final LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
        composerStartRestartGroup.startReplaceableGroup(2065499718);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0<Integer>() { // from class: com.blackhub.bronline.game.ui.cases.uiblock.CasesChoiceListBlockKt$CasesChoiceListBlock$firstVisibleItemIndex$1$1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Integer invoke() {
                    return Integer.valueOf(lazyListStateRememberLazyListState.getFirstVisibleItemIndex());
                }
            });
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(2065499808);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0<Float>() { // from class: com.blackhub.bronline.game.ui.cases.uiblock.CasesChoiceListBlockKt$CasesChoiceListBlock$topArrowAlpha$2$1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Float invoke() {
                    return Float.valueOf(!lazyListStateRememberLazyListState.getCanScrollBackward() ? 0.5f : 1.0f);
                }
            });
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        State state = (State) objRememberedValue2;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(2065500037);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0<Float>() { // from class: com.blackhub.bronline.game.ui.cases.uiblock.CasesChoiceListBlockKt$CasesChoiceListBlock$bottomArrowAlpha$2$1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Float invoke() {
                    return Float.valueOf(!lazyListStateRememberLazyListState.getCanScrollForward() ? 0.5f : 1.0f);
                }
            });
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        State state2 = (State) objRememberedValue3;
        composerStartRestartGroup.endReplaceableGroup();
        Integer numValueOf = Integer.valueOf(i2);
        composerStartRestartGroup.startReplaceableGroup(2065500270);
        boolean zChanged = composerStartRestartGroup.changed(lazyListStateRememberLazyListState) | ((((i3 & 7168) ^ 3072) > 2048 && composerStartRestartGroup.changed(i2)) || (i3 & 3072) == 2048);
        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = new CasesChoiceListBlockKt$CasesChoiceListBlock$1$1(lazyListStateRememberLazyListState, i2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
        }
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, ((i3 >> 9) & 14) | 64);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
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
        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        TriangleWidgetKt.m15099TriangleWidgetm7uSSuA(null, 0.0f, 0.0f, 0L, CasesChoiceListBlock$lambda$2(state), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._8wdp, composerStartRestartGroup, 6), composerStartRestartGroup, 0, 47);
        LazyDslKt.LazyColumn(SizeKt.m8158height3ABfNKs(PaddingKt.m8125paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._8wdp, composerStartRestartGroup, 6), 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._175wdp, composerStartRestartGroup, 6)), lazyListStateRememberLazyListState, null, false, null, null, null, z, new Function1<LazyListScope, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.uiblock.CasesChoiceListBlockKt$CasesChoiceListBlock$2$1
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
                final List<Case> list = casesList;
                final int i5 = i;
                final boolean z2 = z;
                final Function1<Case, Unit> function1 = onSelectCase;
                LazyColumn.items(list.size(), null, new Function1<Integer, Object>() { // from class: com.blackhub.bronline.game.ui.cases.uiblock.CasesChoiceListBlockKt$CasesChoiceListBlock$2$1$invoke$$inlined$itemsIndexed$default$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                        return invoke(num.intValue());
                    }

                    @Nullable
                    public final Object invoke(int i6) {
                        list.get(i6);
                        return null;
                    }
                }, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.uiblock.CasesChoiceListBlockKt$CasesChoiceListBlock$2$1$invoke$$inlined$itemsIndexed$default$3
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
                    public final void invoke(@NotNull LazyItemScope lazyItemScope, int i6, @Nullable Composer composer2, int i7) {
                        int i8;
                        if ((i7 & 14) == 0) {
                            i8 = (composer2.changed(lazyItemScope) ? 4 : 2) | i7;
                        } else {
                            i8 = i7;
                        }
                        if ((i7 & 112) == 0) {
                            i8 |= composer2.changed(i6) ? 32 : 16;
                        }
                        if ((i8 & 731) == 146 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1091073711, i8, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:183)");
                        }
                        final Case r0 = (Case) list.get(i6);
                        boolean z3 = i5 == r0.getId();
                        boolean z4 = z2;
                        final Function1 function12 = function1;
                        CaseListItemKt.CaseListItem(r0, z3, z4, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.cases.uiblock.CasesChoiceListBlockKt$CasesChoiceListBlock$2$1$1$1
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
                                function12.invoke(r0);
                            }
                        }, composer2, 8);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
            }
        }, composerStartRestartGroup, (i3 << 9) & 29360128, 124);
        TriangleWidgetKt.m15099TriangleWidgetm7uSSuA(null, 0.0f, 0.0f, 0L, CasesChoiceListBlock$lambda$4(state2), 180.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._8wdp, composerStartRestartGroup, 6), composerStartRestartGroup, ProfileVerifier.CompilationStatus.f342xf2722a21, 15);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier3 = modifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.uiblock.CasesChoiceListBlockKt.CasesChoiceListBlock.3
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
                    CasesChoiceListBlockKt.CasesChoiceListBlock(modifier3, casesList, i, i2, z, onSelectCase, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void CasesChoiceListPreview(@Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(334670065);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(334670065, i, -1, "com.blackhub.bronline.game.ui.cases.uiblock.CasesChoiceListPreview (CasesChoiceListBlock.kt:95)");
            }
            CasesChoiceListBlock(null, CollectionsKt__CollectionsKt.mutableListOf(new Case(0, null, null, null, 0, false, 1, null, null, null, 0, false, null, null, 0, null, 65454, null), new Case(1, null, null, null, 100, false, 3, null, null, null, 0, false, null, null, 0, null, 65454, null), new Case(2, null, null, null, 999, false, 2, null, null, null, 0, false, null, null, 0, null, 65454, null), new Case(3, null, null, null, 0, false, 0, null, null, null, 0, false, null, null, 0, null, 65454, null), new Case(4, null, null, null, 0, false, 3, null, null, null, 0, false, null, null, 0, null, 65454, null), new Case(5, null, null, null, 0, false, 2, null, null, null, 0, false, null, null, 0, null, 65454, null), new Case(6, null, null, null, 0, false, 1, null, null, null, 0, false, null, null, 0, null, 65454, null)), 1, 0, true, new Function1<Case, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.uiblock.CasesChoiceListBlockKt.CasesChoiceListPreview.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Case it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Case r1) {
                    invoke2(r1);
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 224704, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.uiblock.CasesChoiceListBlockKt.CasesChoiceListPreview.2
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
                    CasesChoiceListBlockKt.CasesChoiceListPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final float CasesChoiceListBlock$lambda$2(State<Float> state) {
        return state.getValue().floatValue();
    }

    public static final float CasesChoiceListBlock$lambda$4(State<Float> state) {
        return state.getValue().floatValue();
    }
}

