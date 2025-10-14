package com.blackhub.bronline.game.p019ui.plates;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.gui.plates.PlatesCountryItem;
import com.blackhub.bronline.game.p019ui.widget.block.ClickAnimateBlockKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
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
import org.apache.commons.compress.archivers.zip.UnixStat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PlatesButtonBlock.kt */
@SourceDebugExtension({"SMAP\nPlatesButtonBlock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatesButtonBlock.kt\ncom/blackhub/bronline/game/ui/plates/PlatesButtonBlockKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n*L\n1#1,148:1\n1116#2,6:149\n75#3:155\n108#3,2:156\n*S KotlinDebug\n*F\n+ 1 PlatesButtonBlock.kt\ncom/blackhub/bronline/game/ui/plates/PlatesButtonBlockKt\n*L\n44#1:149,6\n44#1:155\n44#1:156,2\n*E\n"})

public final class PlatesButtonBlockKt {
    public static final int VALUE_OF_COLUMNS = 2;

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void PlatesButtonBlock(@Nullable Modifier modifier, @NotNull final List<PlatesCountryItem> buttonList, @Nullable Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(buttonList, "buttonList");
        Composer composerStartRestartGroup = composer.startRestartGroup(1207748948);
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1207748948, i, -1, "com.blackhub.bronline.game.ui.plates.PlatesButtonBlock (PlatesButtonBlock.kt:39)");
        }
        final float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._70wdp, composerStartRestartGroup, 6);
        final float fDimensionResource2 = PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composerStartRestartGroup, 6);
        float fDimensionResource3 = PrimitiveResources_androidKt.dimensionResource(R.dimen._140wdp, composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-951890357);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotIntStateKt.mutableIntStateOf(-1);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        final MutableIntState mutableIntState = (MutableIntState) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        Brush.Companion companion = Brush.INSTANCE;
        final Brush brushM11289horizontalGradient8A3gB4$default = Brush.Companion.m11289horizontalGradient8A3gB4$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.total_black_70, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.total_black_70, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
        final Brush brushM11289horizontalGradient8A3gB4$default2 = Brush.Companion.m11289horizontalGradient8A3gB4$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.orange, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.dark_red, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
        Modifier modifierM8177width3ABfNKs = SizeKt.m8177width3ABfNKs(modifier2, fDimensionResource3);
        GridCells.Fixed fixed = new GridCells.Fixed(2);
        Function1<LazyGridScope, Unit> function1 = new Function1<LazyGridScope, Unit>() { // from class: com.blackhub.bronline.game.ui.plates.PlatesButtonBlockKt.PlatesButtonBlock.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                final List<PlatesCountryItem> list = buttonList;
                final MutableIntState mutableIntState2 = mutableIntState;
                final Brush brush = brushM11289horizontalGradient8A3gB4$default2;
                final Brush brush2 = brushM11289horizontalGradient8A3gB4$default;
                final float f = fDimensionResource;
                final float f2 = fDimensionResource2;
                final C5990x14fbc943 c5990x14fbc943 = new Function1() { // from class: com.blackhub.bronline.game.ui.plates.PlatesButtonBlockKt$PlatesButtonBlock$1$invoke$$inlined$items$default$1
                    @Override // kotlin.jvm.functions.Function1
                    @Nullable
                    public final Void invoke(PlatesCountryItem platesCountryItem) {
                        return null;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke((PlatesCountryItem) obj);
                    }
                };
                LazyVerticalGrid.items(list.size(), null, null, new Function1<Integer, Object>() { // from class: com.blackhub.bronline.game.ui.plates.PlatesButtonBlockKt$PlatesButtonBlock$1$invoke$$inlined$items$default$4
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
                        return c5990x14fbc943.invoke(list.get(i3));
                    }
                }, ComposableLambdaKt.composableLambdaInstance(699646206, true, new Function4<LazyGridItemScope, Integer, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.plates.PlatesButtonBlockKt$PlatesButtonBlock$1$invoke$$inlined$items$default$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer2, Integer num2) {
                        invoke(lazyGridItemScope, num.intValue(), composer2, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@NotNull LazyGridItemScope lazyGridItemScope, int i3, @Nullable Composer composer2, int i4) {
                        int i5;
                        if ((i4 & 14) == 0) {
                            i5 = i4 | (composer2.changed(lazyGridItemScope) ? 4 : 2);
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
                            ComposerKt.traceEventStart(699646206, i5, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:461)");
                        }
                        final PlatesCountryItem platesCountryItem = (PlatesCountryItem) list.get(i3);
                        composer2.startReplaceableGroup(366386318);
                        boolean zChanged = composer2.changed(platesCountryItem);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            final MutableIntState mutableIntState3 = mutableIntState2;
                            objRememberedValue2 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.plates.PlatesButtonBlockKt$PlatesButtonBlock$1$1$1$1
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
                                    mutableIntState3.setIntValue(platesCountryItem.getCountryId());
                                    platesCountryItem.getOnItemClick().invoke();
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        final Brush brush3 = brush;
                        final Brush brush4 = brush2;
                        final float f3 = f;
                        final float f4 = f2;
                        final MutableIntState mutableIntState4 = mutableIntState2;
                        ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(null, null, false, null, false, false, false, false, null, 0, 0L, null, (Function0) objRememberedValue2, ComposableLambdaKt.composableLambda(composer2, 1071625941, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.plates.PlatesButtonBlockKt$PlatesButtonBlock$1$1$2
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
                            public final void invoke(@Nullable Composer composer3, int i6) {
                                Brush brush5;
                                if ((i6 & 11) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1071625941, i6, -1, "com.blackhub.bronline.game.ui.plates.PlatesButtonBlock.<anonymous>.<anonymous>.<anonymous> (PlatesButtonBlock.kt:67)");
                                    }
                                    if (mutableIntState4.getIntValue() == platesCountryItem.getCountryId()) {
                                        brush5 = brush3;
                                    } else {
                                        brush5 = brush4;
                                    }
                                    Brush brush6 = brush5;
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    Modifier modifierBackground$default = BackgroundKt.background$default(BorderKt.border(PaddingKt.m8123padding3ABfNKs(SizeKt.m8172size3ABfNKs(companion2, f3), f4), new BorderStroke(PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composer3, 6), brush3, null), platesCountryItem.getBgShape()), brush6, platesCountryItem.getBgShape(), 0.0f, 4, null);
                                    PlatesCountryItem platesCountryItem2 = platesCountryItem;
                                    composer3.startReplaceableGroup(733328855);
                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer3, 0);
                                    composer3.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierBackground$default);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer3);
                                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    TextKt.m10024Text4IGK_g(platesCountryItem2.getText(), SizeKt.wrapContentHeight$default(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), null, false, 3, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14873mullerBoldCustomSpbl3sdaw(R.dimen._15wsp, 0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, composer3, 196614, 26), composer3, 48, 0, 65532);
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }), composer2, 0, 3072, UnixStat.PERM_MASK);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
            }
        };
        final Modifier modifier3 = modifier2;
        LazyGridDslKt.LazyVerticalGrid(fixed, modifierM8177width3ABfNKs, null, null, false, null, null, null, false, function1, composerStartRestartGroup, 0, 508);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.plates.PlatesButtonBlockKt.PlatesButtonBlock.2
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
                    PlatesButtonBlockKt.PlatesButtonBlock(modifier3, buttonList, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void PreviewPlatesButtonBlock(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(385183933);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(385183933, i, -1, "com.blackhub.bronline.game.ui.plates.PreviewPlatesButtonBlock (PlatesButtonBlock.kt:106)");
            }
            float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._21wdp, composerStartRestartGroup, 6);
            PlatesButtonBlock(null, CollectionsKt__CollectionsKt.listOf((Object[]) new PlatesCountryItem[]{new PlatesCountryItem(0, "RUS", RoundedCornerShapeKt.m8394RoundedCornerShapea9UjIt4$default(fDimensionResource, fDimensionResource, 0.0f, fDimensionResource, 4, null), false, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.plates.PlatesButtonBlockKt.PreviewPlatesButtonBlock.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, 9, null), new PlatesCountryItem(0, "UA", RoundedCornerShapeKt.m8394RoundedCornerShapea9UjIt4$default(fDimensionResource, fDimensionResource, fDimensionResource, 0.0f, 8, null), false, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.plates.PlatesButtonBlockKt.PreviewPlatesButtonBlock.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, 9, null), new PlatesCountryItem(0, "BY", RoundedCornerShapeKt.m8394RoundedCornerShapea9UjIt4$default(fDimensionResource, 0.0f, fDimensionResource, fDimensionResource, 2, null), false, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.plates.PlatesButtonBlockKt.PreviewPlatesButtonBlock.3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, 9, null), new PlatesCountryItem(0, "KZ", RoundedCornerShapeKt.m8394RoundedCornerShapea9UjIt4$default(0.0f, fDimensionResource, fDimensionResource, fDimensionResource, 1, null), false, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.plates.PlatesButtonBlockKt.PreviewPlatesButtonBlock.4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, 9, null)}), composerStartRestartGroup, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.plates.PlatesButtonBlockKt.PreviewPlatesButtonBlock.5
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
                    PlatesButtonBlockKt.PreviewPlatesButtonBlock(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

