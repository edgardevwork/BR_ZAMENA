package com.blackhub.bronline.game.p019ui.admintools.adminpanel;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.graphics.painter.Painter;
import androidx.compose.p003ui.layout.ContentScale;
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
import androidx.compose.p003ui.tooling.preview.Preview;
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
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.gui.admintools.model.ATPlayerInfoItemModel;
import com.blackhub.bronline.game.p019ui.widget.button.MainButtonGradientKt;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ATInfoPlayerBlock.kt */
/* loaded from: classes.dex */
public final class ATInfoPlayerBlockKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void ATInfoPlayerBlock(@Nullable Modifier modifier, @NotNull final List<ATPlayerInfoItemModel> playerInfoList, @NotNull final Function0<Unit> onStatisticClick, @Nullable Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(playerInfoList, "playerInfoList");
        Intrinsics.checkNotNullParameter(onStatisticClick, "onStatisticClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1699253712);
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1699253712, i, -1, "com.blackhub.bronline.game.ui.admintools.adminpanel.ATInfoPlayerBlock (ATInfoPlayerBlock.kt:44)");
        }
        final Modifier modifier3 = modifier2;
        SurfaceKt.m9876SurfaceT9BRK9s(SizeKt.m8177width3ABfNKs(modifier2, PrimitiveResources_androidKt.dimensionResource(R.dimen._150wdp, composerStartRestartGroup, 6)), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._8wdp, composerStartRestartGroup, 6)), ColorResources_androidKt.colorResource(R.color.black_70, composerStartRestartGroup, 6), 0L, 0.0f, 0.0f, BorderStrokeKt.m7798BorderStrokecXLIe8U(PrimitiveResources_androidKt.dimensionResource(R.dimen._05wdp, composerStartRestartGroup, 6), ColorResources_androidKt.colorResource(R.color.light_gray_blue, composerStartRestartGroup, 6)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1528093131, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.adminpanel.ATInfoPlayerBlockKt.ATInfoPlayerBlock.1
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
                if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1528093131, i3, -1, "com.blackhub.bronline.game.ui.admintools.adminpanel.ATInfoPlayerBlock.<anonymous> (ATInfoPlayerBlock.kt:56)");
                    }
                    Painter painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.ic_br_logo, composer2, 6);
                    Alignment.Companion companion = Alignment.INSTANCE;
                    ImageKt.Image(painterPainterResource, (String) null, (Modifier) null, companion.getCenter(), (ContentScale) null, 0.1f, (ColorFilter) null, composer2, 199736, 84);
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Modifier modifierM8123padding3ABfNKs = PaddingKt.m8123padding3ABfNKs(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer2, 6));
                    Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                    final Function0<Unit> function0 = onStatisticClick;
                    final List<ATPlayerInfoItemModel> list = playerInfoList;
                    composer2.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer2, 48);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8123padding3ABfNKs);
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
                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    String strStringResource = StringResources_androidKt.stringResource(R.string.admin_tools_player_information, composer2, 6);
                    Modifier modifierM8125paddingVpY3zN4$default = PaddingKt.m8125paddingVpY3zN4$default(companion2, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._8wdp, composer2, 6), 1, null);
                    TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
                    TextKt.m10024Text4IGK_g(strStringResource, modifierM8125paddingVpY3zN4$default, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._8wsp, 0L, 0, 0L, 0.0f, null, composer2, 1572870, 62), composer2, 0, 0, 65532);
                    CanvasKt.Canvas(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), new Function1<DrawScope, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.adminpanel.ATInfoPlayerBlockKt$ATInfoPlayerBlock$1$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull DrawScope Canvas) {
                            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                            DrawScope.m11876drawLineNGM6Ib0$default(Canvas, Color.INSTANCE.m11377getWhite0d7_KjU(), Offset.INSTANCE.m11115getZeroF1C5BW0(), OffsetKt.Offset(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()), 0.0f), 0.0f, 0, null, 0.0f, null, 0, 504, null);
                        }
                    }, composer2, 54);
                    LazyDslKt.LazyColumn(PaddingKt.m8125paddingVpY3zN4$default(companion2, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composer2, 6), 1, null), null, null, false, null, null, null, false, new Function1<LazyListScope, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.adminpanel.ATInfoPlayerBlockKt$ATInfoPlayerBlock$1$1$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                            final List<ATPlayerInfoItemModel> list2 = list;
                            final C4768x600bebf8 c4768x600bebf8 = new Function1() { // from class: com.blackhub.bronline.game.ui.admintools.adminpanel.ATInfoPlayerBlockKt$ATInfoPlayerBlock$1$1$2$invoke$$inlined$items$default$1
                                @Override // kotlin.jvm.functions.Function1
                                @Nullable
                                public final Void invoke(ATPlayerInfoItemModel aTPlayerInfoItemModel) {
                                    return null;
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    return invoke((ATPlayerInfoItemModel) obj);
                                }
                            };
                            LazyColumn.items(list2.size(), null, new Function1<Integer, Object>() { // from class: com.blackhub.bronline.game.ui.admintools.adminpanel.ATInfoPlayerBlockKt$ATInfoPlayerBlock$1$1$2$invoke$$inlined$items$default$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                    return invoke(num.intValue());
                                }

                                @Nullable
                                public final Object invoke(int i4) {
                                    return c4768x600bebf8.invoke(list2.get(i4));
                                }
                            }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.adminpanel.ATInfoPlayerBlockKt$ATInfoPlayerBlock$1$1$2$invoke$$inlined$items$default$4
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
                                public final void invoke(@NotNull LazyItemScope lazyItemScope, int i4, @Nullable Composer composer3, int i5) {
                                    int i6;
                                    if ((i5 & 14) == 0) {
                                        i6 = i5 | (composer3.changed(lazyItemScope) ? 4 : 2);
                                    } else {
                                        i6 = i5;
                                    }
                                    if ((i5 & 112) == 0) {
                                        i6 |= composer3.changed(i4) ? 32 : 16;
                                    }
                                    if ((i6 & 731) == 146 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-632812321, i6, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:148)");
                                    }
                                    ATPlayerInfoItemModel aTPlayerInfoItemModel = (ATPlayerInfoItemModel) list2.get(i4);
                                    Modifier.Companion companion4 = Modifier.INSTANCE;
                                    Modifier modifierM8125paddingVpY3zN4$default2 = PaddingKt.m8125paddingVpY3zN4$default(companion4, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composer3, 6), 1, null);
                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                    composer3.startReplaceableGroup(693286680);
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer3, 48);
                                    composer3.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM8125paddingVpY3zN4$default2);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor2);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer3);
                                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRowMeasurePolicy, companion5.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    ImageKt.Image(PainterResources_androidKt.painterResource(aTPlayerInfoItemModel.getImageRes(), composer3, 0), (String) null, PaddingKt.m8127paddingqDBjuR0$default(SizeKt.m8158height3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._9wdp, composer3, 6)), 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._4wdp, composer3, 6), 0.0f, 11, null), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composer3, 24632, 104);
                                    String text = aTPlayerInfoItemModel.getText();
                                    TypographyStyle typographyStyle2 = TypographyStyle.INSTANCE;
                                    TextKt.m10024Text4IGK_g(text, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle2.m14811montserratBoldCustomSpIzzofJo(R.dimen._8wsp, 0L, 0, 0L, 0.0f, null, null, composer3, 12582918, 126), composer3, 0, 0, 65534);
                                    TextKt.m10024Text4IGK_g(String.valueOf(aTPlayerInfoItemModel.getValue()), RowScope.weight$default(rowScopeInstance, companion4, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m13551boximpl(TextAlign.INSTANCE.m13559getEnde0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle2.m14811montserratBoldCustomSpIzzofJo(R.dimen._8wsp, 0L, 0, 0L, 0.0f, null, null, composer3, 12582918, 126), composer3, 0, 0, 65020);
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }));
                        }
                    }, composer2, 0, 254);
                    Modifier modifierM8156defaultMinSizeVpY3zN4 = SizeKt.m8156defaultMinSizeVpY3zN4(PaddingKt.m8127paddingqDBjuR0$default(companion2, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._4wdp, composer2, 6), 0.0f, 0.0f, 13, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._105wdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composer2, 6));
                    String strStringResource2 = StringResources_androidKt.stringResource(R.string.admin_tools_statistic, composer2, 6);
                    TextStyle textStyleM14811montserratBoldCustomSpIzzofJo = typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._8wsp, 0L, 0, 0L, 0.0f, null, null, composer2, 12582918, 126);
                    float fM14409dpToPx8Feqmps = ComposeExtensionKt.m14409dpToPx8Feqmps(PrimitiveResources_androidKt.dimensionResource(R.dimen._50wdp, composer2, 6), composer2, 0);
                    RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer2, 6));
                    BorderStroke borderStrokeM7798BorderStrokecXLIe8U = BorderStrokeKt.m7798BorderStrokecXLIe8U(PrimitiveResources_androidKt.dimensionResource(R.dimen._05wdp, composer2, 6), Color.INSTANCE.m11377getWhite0d7_KjU());
                    composer2.startReplaceableGroup(-256812326);
                    boolean zChanged = composer2.changed(function0);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.adminpanel.ATInfoPlayerBlockKt$ATInfoPlayerBlock$1$1$3$1
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
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceableGroup();
                    MainButtonGradientKt.m15077MainButtonGradientlunQu3Y(modifierM8156defaultMinSizeVpY3zN4, null, strStringResource2, textStyleM14811montserratBoldCustomSpIzzofJo, 0.0f, 0, null, null, null, 0.0f, 0L, fM14409dpToPx8Feqmps, null, roundedCornerShapeM8392RoundedCornerShape0680j_4, borderStrokeM7798BorderStrokecXLIe8U, 0.0f, 0.0f, false, false, null, false, false, false, null, (Function0) objRememberedValue, composer2, 0, 100663296, 0, 16488434);
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
        }), composerStartRestartGroup, 12582912, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.adminpanel.ATInfoPlayerBlockKt.ATInfoPlayerBlock.2
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
                    ATInfoPlayerBlockKt.ATInfoPlayerBlock(modifier3, playerInfoList, onStatisticClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(name = "ATInfoPlayerBlock")
    public static final void PreviewATInfoPlayerBlock(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1886287981);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1886287981, i, -1, "com.blackhub.bronline.game.ui.admintools.adminpanel.PreviewATInfoPlayerBlock (ATInfoPlayerBlock.kt:130)");
            }
            ATInfoPlayerBlock(null, CollectionsKt__CollectionsKt.listOf((Object[]) new ATPlayerInfoItemModel[]{new ATPlayerInfoItemModel(1, StringResources_androidKt.stringResource(R.string.admin_tools_player_info_level, composerStartRestartGroup, 6), 100), new ATPlayerInfoItemModel(2, StringResources_androidKt.stringResource(R.string.admin_tools_player_info_hp, composerStartRestartGroup, 6), 100), new ATPlayerInfoItemModel(3, StringResources_androidKt.stringResource(R.string.admin_tools_player_info_armor, composerStartRestartGroup, 6), 100), new ATPlayerInfoItemModel(4, StringResources_androidKt.stringResource(R.string.admin_tools_player_info_speed, composerStartRestartGroup, 6), 100), new ATPlayerInfoItemModel(5, StringResources_androidKt.stringResource(R.string.admin_tools_player_info_ping, composerStartRestartGroup, 6), 100), new ATPlayerInfoItemModel(6, StringResources_androidKt.stringResource(R.string.admin_tools_player_info_money, composerStartRestartGroup, 6), 1234567890), new ATPlayerInfoItemModel(7, StringResources_androidKt.stringResource(R.string.common_transport, composerStartRestartGroup, 6), 100), new ATPlayerInfoItemModel(8, StringResources_androidKt.stringResource(R.string.admin_tools_player_info_transport_strength, composerStartRestartGroup, 6), 100)}), new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.adminpanel.ATInfoPlayerBlockKt.PreviewATInfoPlayerBlock.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 384, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.adminpanel.ATInfoPlayerBlockKt.PreviewATInfoPlayerBlock.2
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
                    ATInfoPlayerBlockKt.PreviewATInfoPlayerBlock(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

