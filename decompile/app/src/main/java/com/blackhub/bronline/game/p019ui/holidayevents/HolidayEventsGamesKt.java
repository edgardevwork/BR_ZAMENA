package com.blackhub.bronline.game.p019ui.holidayevents;

import androidx.annotation.StringRes;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
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
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
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
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.gui.holidayevents.model.HolidayEventsGameItemModel;
import com.blackhub.bronline.game.p019ui.holidayevents.uiblock.HolidayEventsGameItemKt;
import com.blackhub.bronline.game.p019ui.widget.button.ButtonWithLineKt;
import com.blackhub.bronline.game.p019ui.widget.scroll.ScrollSilverThumbCarouselKt;
import com.bless.client.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HolidayEventsGames.kt */
@Metadata(m7104d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ac\u0010\u0000\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, m7105d2 = {"HolidayEventsGames", "", "buttonText", "", "listOfGames", "", "Lcom/blackhub/bronline/game/gui/holidayevents/model/HolidayEventsGameItemModel;", "selectedColor", "Landroidx/compose/ui/graphics/Color;", "onGameClick", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "gameItem", "onPlayClick", "Lkotlin/Function0;", "HolidayEventsGames-cf5BqRc", "(ILjava/util/List;JLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "HolidayEventsGamesPreview", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nHolidayEventsGames.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HolidayEventsGames.kt\ncom/blackhub/bronline/game/ui/holidayevents/HolidayEventsGamesKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,111:1\n68#2,6:112\n74#2:146\n68#2,6:183\n74#2:217\n78#2:222\n78#2:227\n79#3,11:118\n79#3,11:149\n92#3:181\n79#3,11:189\n92#3:221\n92#3:226\n456#4,8:129\n464#4,3:143\n456#4,8:160\n464#4,3:174\n467#4,3:178\n456#4,8:200\n464#4,3:214\n467#4,3:218\n467#4,3:223\n3737#5,6:137\n3737#5,6:168\n3737#5,6:208\n78#6,2:147\n80#6:177\n84#6:182\n*S KotlinDebug\n*F\n+ 1 HolidayEventsGames.kt\ncom/blackhub/bronline/game/ui/holidayevents/HolidayEventsGamesKt\n*L\n41#1:112,6\n41#1:146\n79#1:183,6\n79#1:217\n79#1:222\n41#1:227\n41#1:118,11\n47#1:149,11\n47#1:181\n79#1:189,11\n79#1:221\n41#1:226\n41#1:129,8\n41#1:143,3\n47#1:160,8\n47#1:174,3\n47#1:178,3\n79#1:200,8\n79#1:214,3\n79#1:218,3\n41#1:223,3\n41#1:137,6\n47#1:168,6\n79#1:208,6\n47#1:147,2\n47#1:177\n47#1:182\n*E\n"})
/* loaded from: classes3.dex */
public final class HolidayEventsGamesKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: HolidayEventsGames-cf5BqRc, reason: not valid java name */
    public static final void m14981HolidayEventsGamescf5BqRc(@StringRes final int i, @NotNull final List<HolidayEventsGameItemModel> listOfGames, final long j, @NotNull final Function1<? super HolidayEventsGameItemModel, Unit> onGameClick, @NotNull final Function0<Unit> onPlayClick, @Nullable Composer composer, final int i2) {
        Intrinsics.checkNotNullParameter(listOfGames, "listOfGames");
        Intrinsics.checkNotNullParameter(onGameClick, "onGameClick");
        Intrinsics.checkNotNullParameter(onPlayClick, "onPlayClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(2085557930);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2085557930, i2, -1, "com.blackhub.bronline.game.ui.holidayevents.HolidayEventsGames (HolidayEventsGames.kt:36)");
        }
        LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(PaddingKt.m8125paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._44wdp, composerStartRestartGroup, 6), 0.0f, 2, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._228wdp, composerStartRestartGroup, 6));
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8158height3ABfNKs);
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
        Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
        Modifier modifierM8158height3ABfNKs2 = SizeKt.m8158height3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._188wdp, composerStartRestartGroup, 6));
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(spaceBetween, centerHorizontally, composerStartRestartGroup, 54);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM8158height3ABfNKs2);
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
        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
        if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        LazyDslKt.LazyRow(SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._180wdp, composerStartRestartGroup, 6)), lazyListStateRememberLazyListState, null, false, arrangement.m8032spacedBy0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._12wdp, composerStartRestartGroup, 6)), null, null, false, new Function1<LazyListScope, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsGamesKt$HolidayEventsGames$1$1$1
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
                final List<HolidayEventsGameItemModel> list = listOfGames;
                final long j2 = j;
                final Function1<HolidayEventsGameItemModel, Unit> function1 = onGameClick;
                final C5690x1861e6f7 c5690x1861e6f7 = new Function1() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsGamesKt$HolidayEventsGames$1$1$1$invoke$$inlined$items$default$1
                    @Override // kotlin.jvm.functions.Function1
                    @Nullable
                    public final Void invoke(HolidayEventsGameItemModel holidayEventsGameItemModel) {
                        return null;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke((HolidayEventsGameItemModel) obj);
                    }
                };
                LazyRow.items(list.size(), null, new Function1<Integer, Object>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsGamesKt$HolidayEventsGames$1$1$1$invoke$$inlined$items$default$3
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
                        return c5690x1861e6f7.invoke(list.get(i3));
                    }
                }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsGamesKt$HolidayEventsGames$1$1$1$invoke$$inlined$items$default$4
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
                    public final void invoke(@NotNull LazyItemScope lazyItemScope, int i3, @Nullable Composer composer2, int i4) {
                        int i5;
                        if ((i4 & 14) == 0) {
                            i5 = (composer2.changed(lazyItemScope) ? 4 : 2) | i4;
                        } else {
                            i5 = i4;
                        }
                        if ((i4 & 112) == 0) {
                            i5 |= composer2.changed(i3) ? 32 : 16;
                        }
                        if ((i5 & 731) == 146 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-632812321, i5, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:148)");
                        }
                        final HolidayEventsGameItemModel holidayEventsGameItemModel = (HolidayEventsGameItemModel) list.get(i3);
                        long j3 = j2;
                        final Function1 function12 = function1;
                        HolidayEventsGameItemKt.m14986HolidayEventsGameItemiJQMabo(holidayEventsGameItemModel, j3, new Function1<HolidayEventsGameItemModel, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsGamesKt$HolidayEventsGames$1$1$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(HolidayEventsGameItemModel holidayEventsGameItemModel2) {
                                invoke2(holidayEventsGameItemModel2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull HolidayEventsGameItemModel it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                function12.invoke(holidayEventsGameItemModel);
                            }
                        }, composer2, 8);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
            }
        }, composerStartRestartGroup, 0, 236);
        ScrollSilverThumbCarouselKt.ScrollSilverThumbCarousel(PaddingKt.m8125paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(SizeKt.m8158height3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composerStartRestartGroup, 6)), 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composerStartRestartGroup, 6), 0.0f, 2, null), lazyListStateRememberLazyListState, 0.0f, 0.0f, null, null, composerStartRestartGroup, 0, 60);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierAlign = boxScopeInstance.align(SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._36wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._197wdp, composerStartRestartGroup, 6)), companion2.getBottomCenter());
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierAlign);
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
        Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
        if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
        }
        function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        ButtonWithLineKt.ButtonWithLine(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), 0, R.dimen._5wdp, R.dimen._12wsp, StringResources_androidKt.stringResource(i, composerStartRestartGroup, i2 & 14), false, 0, 0.0f, onPlayClick, composerStartRestartGroup, ((i2 << 12) & 234881024) | 3462, 226);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsGamesKt$HolidayEventsGames$2
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
                    HolidayEventsGamesKt.m14981HolidayEventsGamescf5BqRc(i, listOfGames, j, onGameClick, onPlayClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void HolidayEventsGamesPreview(@Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-542712365);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-542712365, i, -1, "com.blackhub.bronline.game.ui.holidayevents.HolidayEventsGamesPreview (HolidayEventsGames.kt:97)");
            }
            m14981HolidayEventsGamescf5BqRc(R.string.common_play, CollectionsKt__CollectionsKt.listOf((Object[]) new HolidayEventsGameItemModel[]{new HolidayEventsGameItemModel(0, false, false, null, null, 31, null), new HolidayEventsGameItemModel(0, true, false, null, null, 29, null), new HolidayEventsGameItemModel(0, false, false, null, null, 31, null)}), ColorResources_androidKt.colorResource(R.color.purpur, composerStartRestartGroup, 6), new Function1<HolidayEventsGameItemModel, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsGamesKt.HolidayEventsGamesPreview.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull HolidayEventsGameItemModel it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(HolidayEventsGameItemModel holidayEventsGameItemModel) {
                    invoke2(holidayEventsGameItemModel);
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsGamesKt.HolidayEventsGamesPreview.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 27718);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsGamesKt.HolidayEventsGamesPreview.3
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
                    HolidayEventsGamesKt.HolidayEventsGamesPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
