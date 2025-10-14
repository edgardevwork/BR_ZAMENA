package com.blackhub.bronline.game.p019ui.menu;

import androidx.compose.foundation.OverscrollConfiguration_androidKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.gui.menu.model.MenuListModel;
import com.blackhub.bronline.game.p019ui.widget.scroll.ScrollSilverThumbCarouselGridKt;
import com.bless.client.R;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options.IFramePlayerOptions;
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

/* compiled from: MenuListGrid.kt */
@SourceDebugExtension({"SMAP\nMenuListGrid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuListGrid.kt\ncom/blackhub/bronline/game/ui/menu/MenuListGridKt\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,146:1\n88#2,5:147\n93#2:180\n97#2:186\n79#3,11:152\n92#3:185\n456#4,8:163\n464#4,3:177\n467#4,3:182\n3737#5,6:171\n154#6:181\n154#6:187\n154#6:188\n*S KotlinDebug\n*F\n+ 1 MenuListGrid.kt\ncom/blackhub/bronline/game/ui/menu/MenuListGridKt\n*L\n49#1:147,5\n49#1:180\n49#1:186\n49#1:152,11\n49#1:185\n49#1:163,8\n49#1:177,3\n49#1:182,3\n49#1:171,6\n71#1:181\n103#1:187\n145#1:188\n*E\n"})
/* loaded from: classes3.dex */
public final class MenuListGridKt {
    public static final int THREE_ROWS = 3;
    public static final float WIDTH_FOR_GRID = 0.97f;

    /* JADX WARN: Removed duplicated region for block: B:35:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: MenuListGrid-UR9CgXA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m15008MenuListGridUR9CgXA(@NotNull final Modifier modifier, @NotNull final List<MenuListModel> list, final float f, final int i, boolean z, boolean z2, @NotNull final Function0<Unit> blockButtons, @NotNull final Function1<? super Integer, Unit> onItemClick, @Nullable Composer composer, final int i2, final int i3) {
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(blockButtons, "blockButtons");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-713102974);
        boolean z3 = (i3 & 16) != 0 ? false : z;
        boolean z4 = (i3 & 32) != 0 ? false : z2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-713102974, i2, -1, "com.blackhub.bronline.game.ui.menu.MenuListGrid (MenuListGrid.kt:45)");
        }
        final LazyGridState lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null);
        Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, Alignment.INSTANCE.getTop(), composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
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
        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        CompositionLocalKt.CompositionLocalProvider(OverscrollConfiguration_androidKt.getLocalOverscrollConfiguration().provides(null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1910621986, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.menu.MenuListGridKt$MenuListGrid$1$1
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

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@Nullable Composer composer3, int i4) {
                if ((i4 & 11) != 2 || !composer3.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1910621986, i4, -1, "com.blackhub.bronline.game.ui.menu.MenuListGrid.<anonymous>.<anonymous> (MenuListGrid.kt:54)");
                    }
                    Modifier modifierFillMaxWidth = SizeKt.fillMaxWidth(SizeKt.fillMaxHeight$default(modifier, 0.0f, 1, null), 0.97f);
                    GridCells.Fixed fixed = new GridCells.Fixed(i);
                    LazyGridState lazyGridState = lazyGridStateRememberLazyGridState;
                    final List<MenuListModel> list2 = list;
                    final float f2 = f;
                    final Function0<Unit> function0 = blockButtons;
                    final Function1<Integer, Unit> function1 = onItemClick;
                    LazyGridDslKt.LazyVerticalGrid(fixed, modifierFillMaxWidth, lazyGridState, null, false, null, null, null, false, new Function1<LazyGridScope, Unit>() { // from class: com.blackhub.bronline.game.ui.menu.MenuListGridKt$MenuListGrid$1$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(LazyGridScope lazyGridScope) {
                            invoke2(lazyGridScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull LazyGridScope LazyVerticalGrid) {
                            Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
                            int size = list2.size();
                            final float f3 = f2;
                            final List<MenuListModel> list3 = list2;
                            final Function0<Unit> function02 = function0;
                            final Function1<Integer, Unit> function12 = function1;
                            LazyGridScope.items$default(LazyVerticalGrid, size, null, null, null, ComposableLambdaKt.composableLambdaInstance(-1523318199, true, new Function4<LazyGridItemScope, Integer, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.menu.MenuListGridKt.MenuListGrid.1.1.1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(4);
                                }

                                @Override // kotlin.jvm.functions.Function4
                                public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer4, Integer num2) {
                                    invoke(lazyGridItemScope, num.intValue(), composer4, num2.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@NotNull LazyGridItemScope items, final int i5, @Nullable Composer composer4, int i6) {
                                    Intrinsics.checkNotNullParameter(items, "$this$items");
                                    if ((i6 & 112) == 0) {
                                        i6 |= composer4.changed(i5) ? 32 : 16;
                                    }
                                    if ((i6 & 721) == 144 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1523318199, i6, -1, "com.blackhub.bronline.game.ui.menu.MenuListGrid.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MenuListGrid.kt:62)");
                                    }
                                    Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(Modifier.INSTANCE, C2046Dp.m13666constructorimpl(f3 / 3));
                                    MenuListModel menuListModel = list3.get(i5);
                                    composer4.startReplaceableGroup(696530199);
                                    boolean zChanged = composer4.changed(function02);
                                    final Function0<Unit> function03 = function02;
                                    Object objRememberedValue = composer4.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.menu.MenuListGridKt$MenuListGrid$1$1$1$1$1$1
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
                                        composer4.updateRememberedValue(objRememberedValue);
                                    }
                                    composer4.endReplaceableGroup();
                                    final Function1<Integer, Unit> function13 = function12;
                                    final List<MenuListModel> list4 = list3;
                                    MenuListItemKt.MenuListItem(modifierM8158height3ABfNKs, menuListModel, (Function0) objRememberedValue, new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.menu.MenuListGridKt.MenuListGrid.1.1.1.1.2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                                            invoke(num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(int i7) {
                                            function13.invoke(Integer.valueOf(list4.get(i5).getId()));
                                        }
                                    }, composer4, 0, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), 14, null);
                        }
                    }, composer3, 0, 504);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }), composerStartRestartGroup, ProvidedValue.$stable | 48);
        composerStartRestartGroup.startReplaceableGroup(1374006817);
        if (z3 && !z4) {
            if (!C2046Dp.m13671equalsimpl0(f, C2046Dp.m13666constructorimpl(0))) {
                Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(SizeKt.m8177width3ABfNKs(SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._6sdp, composerStartRestartGroup, 6)), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._16sdp, composerStartRestartGroup, 6), 0.0f, 0.0f, 13, null);
                Brush.Companion companion2 = Brush.INSTANCE;
                composer2 = composerStartRestartGroup;
                ScrollSilverThumbCarouselGridKt.ScrollSilverThumbCarouselGrid(modifierM8127paddingqDBjuR0$default, lazyGridStateRememberLazyGridState, i, 0.0f, 0.0f, Brush.Companion.m11289horizontalGradient8A3gB4$default(companion2, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.red, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.red, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null), Brush.Companion.m11289horizontalGradient8A3gB4$default(companion2, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.light_gray_blue_25, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.light_gray_blue_25, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null), composer2, (i2 >> 3) & 896, 24);
            }
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final boolean z5 = z3;
                final boolean z6 = z4;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.menu.MenuListGridKt$MenuListGrid$2
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

                    public final void invoke(@Nullable Composer composer3, int i4) {
                        MenuListGridKt.m15008MenuListGridUR9CgXA(modifier, list, f, i, z5, z6, blockButtons, onItemClick, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                    }
                });
                return;
            }
            return;
        }
        composer2 = composerStartRestartGroup;
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void PreviewMenuListGrid(@Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-310742457);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-310742457, i, -1, "com.blackhub.bronline.game.ui.menu.PreviewMenuListGrid (MenuListGrid.kt:101)");
            }
            m15008MenuListGridUR9CgXA(PaddingKt.m8127paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, C2046Dp.m13666constructorimpl(16), 0.0f, 0.0f, 13, null), CollectionsKt__CollectionsKt.listOf((Object[]) new MenuListModel[]{new MenuListModel(0, R.drawable.ic_menu_compass, R.string.menu_action_navigator), new MenuListModel(1, R.drawable.ic_menu_taxi, R.string.menu_action_taxi_call), new MenuListModel(2, R.drawable.ic_menu_menu_red, R.string.menu_action_menu), new MenuListModel(3, R.drawable.ic_menu_chat, R.string.menu_action_communication), new MenuListModel(4, R.drawable.ic_menu_bag, R.string.common_inventory), new MenuListModel(5, R.drawable.ic_menu_anim, R.string.menu_action_animations), new MenuListModel(6, R.drawable.ic_menu_ruble, R.string.common_donate), new MenuListModel(7, R.drawable.ic_menu_car, R.string.menu_action_cars), new MenuListModel(8, R.drawable.ic_menu_gift_box, R.string.menu_action_promo), new MenuListModel(9, R.drawable.ic_menu_help_desk, R.string.menu_action_complaint)}), C2046Dp.m13666constructorimpl(350), 4, false, false, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.menu.MenuListGridKt.PreviewMenuListGrid.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.menu.MenuListGridKt.PreviewMenuListGrid.2
                public final void invoke(int i2) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 14159238, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.menu.MenuListGridKt.PreviewMenuListGrid.3
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
                    MenuListGridKt.PreviewMenuListGrid(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

