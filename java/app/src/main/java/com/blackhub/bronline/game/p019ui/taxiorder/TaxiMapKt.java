package com.blackhub.bronline.game.p019ui.taxiorder;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.AlphaKt;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.graphics.painter.Painter;
import androidx.compose.p003ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
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
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntOffsetKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.blackhub.bronline.game.core.extension.FloatExtensionKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.gui.taxiorder.CoordinatesModel;
import com.blackhub.bronline.game.p019ui.widget.button.MainButtonGradientKt;
import com.blackhub.bronline.game.p019ui.widget.other.FakeDialogKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TaxiMap.kt */
@SourceDebugExtension({"SMAP\nTaxiMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaxiMap.kt\ncom/blackhub/bronline/game/ui/taxiorder/TaxiMapKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,224:1\n1116#2,6:225\n1116#2,6:231\n74#3:237\n81#4:238\n107#4,2:239\n81#4:241\n107#4,2:242\n*S KotlinDebug\n*F\n+ 1 TaxiMap.kt\ncom/blackhub/bronline/game/ui/taxiorder/TaxiMapKt\n*L\n58#1:225,6\n59#1:231,6\n61#1:237\n58#1:238\n58#1:239,2\n59#1:241\n59#1:242,2\n*E\n"})
/* loaded from: classes2.dex */
public final class TaxiMapKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void TaxiMap(@NotNull final Function2<? super CoordinatesModel, ? super Float, Unit> onSelect, @NotNull final Function0<Unit> onDismiss, @Nullable Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(onSelect, "onSelect");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1836770724);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(onSelect) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDismiss) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1836770724, i2, -1, "com.blackhub.bronline.game.ui.taxiorder.TaxiMap (TaxiMap.kt:56)");
            }
            composerStartRestartGroup.startReplaceableGroup(624995467);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m11088boximpl(OffsetKt.Offset(0.0f, 0.0f)), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(624995554);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final MutableState mutableState2 = (MutableState) objRememberedValue2;
            composerStartRestartGroup.endReplaceableGroup();
            final Ref.FloatRef floatRef = new Ref.FloatRef();
            final float density = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).getDensity();
            final Ref.FloatRef floatRef2 = new Ref.FloatRef();
            floatRef2.element = PrimitiveResources_androidKt.dimensionResource(R.dimen._560wdp, composerStartRestartGroup, 6);
            Brush.Companion companion2 = Brush.INSTANCE;
            Color colorM11330boximpl = Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.red, composerStartRestartGroup, 6));
            final int i3 = R.color.orange;
            final Brush brushM11289horizontalGradient8A3gB4$default = Brush.Companion.m11289horizontalGradient8A3gB4$default(companion2, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{colorM11330boximpl, Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.orange, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
            Color.Companion companion3 = Color.INSTANCE;
            final Brush brushM11289horizontalGradient8A3gB4$default2 = Brush.Companion.m11289horizontalGradient8A3gB4$default(companion2, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(companion3.m11366getBlack0d7_KjU()), Color.m11330boximpl(companion3.m11366getBlack0d7_KjU())}), 0.0f, 0.0f, 0, 14, (Object) null);
            final BorderStroke borderStrokeM7798BorderStrokecXLIe8U = BorderStrokeKt.m7798BorderStrokecXLIe8U(PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composerStartRestartGroup, 6), ColorResources_androidKt.colorResource(R.color.orange, composerStartRestartGroup, 6));
            final BorderStroke borderStrokeM7798BorderStrokecXLIe8U2 = BorderStrokeKt.m7798BorderStrokecXLIe8U(PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composerStartRestartGroup, 6), companion3.m11375getTransparent0d7_KjU());
            composer2 = composerStartRestartGroup;
            FakeDialogKt.m15089FakeDialog3IgeMak(BackgroundKt.m7770backgroundbw27NRU(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ColorResources_androidKt.colorResource(R.color.total_black_50, composerStartRestartGroup, 6), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composerStartRestartGroup, 6))), 0L, ComposableLambdaKt.composableLambda(composer2, 77360720, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.taxiorder.TaxiMapKt.TaxiMap.1
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
                    final MutableState<Offset> mutableState3;
                    if ((i4 & 11) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(77360720, i4, -1, "com.blackhub.bronline.game.ui.taxiorder.TaxiMap.<anonymous> (TaxiMap.kt:101)");
                        }
                        Modifier.Companion companion4 = Modifier.INSTANCE;
                        Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(ScrollKt.verticalScroll$default(companion4, ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._23wdp, composer3, 6), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._23wdp, composer3, 6), 5, null);
                        Alignment.Companion companion5 = Alignment.INSTANCE;
                        Alignment.Horizontal centerHorizontally = companion5.getCenterHorizontally();
                        int i5 = i3;
                        final Ref.FloatRef floatRef3 = floatRef2;
                        Ref.FloatRef floatRef4 = floatRef;
                        MutableState<Boolean> mutableState4 = mutableState2;
                        MutableState<Offset> mutableState5 = mutableState;
                        Brush brush = brushM11289horizontalGradient8A3gB4$default;
                        BorderStroke borderStroke = borderStrokeM7798BorderStrokecXLIe8U2;
                        Brush brush2 = brushM11289horizontalGradient8A3gB4$default2;
                        BorderStroke borderStroke2 = borderStrokeM7798BorderStrokecXLIe8U;
                        final Function0<Unit> function0 = onDismiss;
                        final Function2<CoordinatesModel, Float, Unit> function2 = onSelect;
                        final float f = density;
                        composer3.startReplaceableGroup(-483455358);
                        Arrangement arrangement = Arrangement.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer3, 48);
                        composer3.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion6.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
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
                        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy, companion6.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion6.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion6.getSetCompositeKeyHash();
                        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        String strStringResource = StringResources_androidKt.stringResource(R.string.taxi_map_choose_an_endpoint, composer3, 6);
                        TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
                        TextStyle textStyleM14873mullerBoldCustomSpbl3sdaw = typographyStyle.m14873mullerBoldCustomSpbl3sdaw(R.dimen._15wsp, ColorResources_androidKt.colorResource(i5, composer3, 6), 0, 0L, 0.0f, composer3, 196614, 28);
                        int iM13558getCentere0LSkKk = TextAlign.INSTANCE.m13558getCentere0LSkKk();
                        TextKt.m10024Text4IGK_g(strStringResource, SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), Color.INSTANCE.m11377getWhite0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m13551boximpl(iM13558getCentere0LSkKk), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleM14873mullerBoldCustomSpbl3sdaw, composer3, 432, 0, 65016);
                        Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(PaddingKt.m8127paddingqDBjuR0$default(SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion4, floatRef3.element), floatRef3.element), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._11wdp, composer3, 6), 0.0f, 0.0f, 13, null), Unit.INSTANCE, new TaxiMapKt$TaxiMap$1$1$1(floatRef4, mutableState4, mutableState5, null));
                        composer3.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion5.getTopStart(), false, composer3, 0);
                        composer3.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierPointerInput);
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
                        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion6.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion6.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion6.getSetCompositeKeyHash();
                        if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.img_taxi_map, composer3, 6), (String) null, SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, composer3, 25016, 104);
                        Painter painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.ic_close_small_in_oval, composer3, 6);
                        Modifier modifierAlpha = AlphaKt.alpha(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._17wdp, composer3, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._17wdp, composer3, 6)), floatRef4.element);
                        composer3.startReplaceableGroup(1356569560);
                        Object objRememberedValue3 = composer3.rememberedValue();
                        Composer.Companion companion7 = Composer.INSTANCE;
                        if (objRememberedValue3 == companion7.getEmpty()) {
                            mutableState3 = mutableState5;
                            objRememberedValue3 = new Function1<Density, IntOffset>() { // from class: com.blackhub.bronline.game.ui.taxiorder.TaxiMapKt$TaxiMap$1$1$2$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ IntOffset invoke(Density density2) {
                                    return IntOffset.m13785boximpl(m15027invokeBjo55l4(density2));
                                }

                                /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                                public final long m15027invokeBjo55l4(@NotNull Density offset) {
                                    Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                    return IntOffsetKt.IntOffset(FloatExtensionKt.roundToIntSafely(Offset.m11099getXimpl(TaxiMapKt.TaxiMap$lambda$1(mutableState3))), FloatExtensionKt.roundToIntSafely(Offset.m11100getYimpl(TaxiMapKt.TaxiMap$lambda$1(mutableState3))));
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue3);
                        } else {
                            mutableState3 = mutableState5;
                        }
                        composer3.endReplaceableGroup();
                        ImageKt.Image(painterPainterResource, (String) null, androidx.compose.foundation.layout.OffsetKt.offset(modifierAlpha, (Function1) objRememberedValue3), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        Modifier modifierM8127paddingqDBjuR0$default2 = PaddingKt.m8127paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._11wdp, composer3, 6), 0.0f, 0.0f, 13, null);
                        Arrangement.HorizontalOrVertical center = arrangement.getCenter();
                        composer3.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, companion5.getTop(), composer3, 6);
                        composer3.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default2);
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor3);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composer3);
                        Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRowMeasurePolicy, companion6.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion6.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion6.getSetCompositeKeyHash();
                        if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        Modifier modifierM8177width3ABfNKs = SizeKt.m8177width3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._90wdp, composer3, 6));
                        RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._23wdp, composer3, 6));
                        final MutableState<Offset> mutableState6 = mutableState3;
                        MainButtonGradientKt.m15077MainButtonGradientlunQu3Y(modifierM8177width3ABfNKs, null, StringResources_androidKt.stringResource(R.string.common_select, composer3, 6), typographyStyle.m14873mullerBoldCustomSpbl3sdaw(R.dimen._11wsp, 0L, 0, 0L, 0.0f, composer3, 196614, 30), 0.0f, 0, null, null, null, 0.0f, 0L, 0.0f, brush, roundedCornerShapeM8392RoundedCornerShape0680j_4, borderStroke, PrimitiveResources_androidKt.dimensionResource(R.dimen._11wdp, composer3, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._11wdp, composer3, 6), false, false, null, TaxiMapKt.TaxiMap$lambda$4(mutableState4), false, false, null, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.taxiorder.TaxiMapKt$TaxiMap$1$1$3$1
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
                                function2.invoke(new CoordinatesModel(Offset.m11099getXimpl(TaxiMapKt.TaxiMap$lambda$1(mutableState6)) / f, floatRef3.element - (Offset.m11100getYimpl(TaxiMapKt.TaxiMap$lambda$1(mutableState6)) / f)), Float.valueOf(floatRef3.element));
                            }
                        }, composer3, 0, 100663296, 0, 15339506);
                        SpacerKt.Spacer(SizeKt.m8177width3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._6wdp, composer3, 6)), composer3, 0);
                        Modifier modifierM8177width3ABfNKs2 = SizeKt.m8177width3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._90wdp, composer3, 6));
                        RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._23wdp, composer3, 6));
                        TextStyle textStyleM14873mullerBoldCustomSpbl3sdaw2 = typographyStyle.m14873mullerBoldCustomSpbl3sdaw(R.dimen._11wsp, 0L, 0, 0L, 0.0f, composer3, 196614, 30);
                        String strStringResource2 = StringResources_androidKt.stringResource(R.string.common_cancel, composer3, 6);
                        float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._11wdp, composer3, 6);
                        float fDimensionResource2 = PrimitiveResources_androidKt.dimensionResource(R.dimen._11wdp, composer3, 6);
                        composer3.startReplaceableGroup(1356572085);
                        boolean zChanged = composer3.changed(function0);
                        Object objRememberedValue4 = composer3.rememberedValue();
                        if (zChanged || objRememberedValue4 == companion7.getEmpty()) {
                            objRememberedValue4 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.taxiorder.TaxiMapKt$TaxiMap$1$1$3$2$1
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
                            composer3.updateRememberedValue(objRememberedValue4);
                        }
                        composer3.endReplaceableGroup();
                        MainButtonGradientKt.m15077MainButtonGradientlunQu3Y(modifierM8177width3ABfNKs2, null, strStringResource2, textStyleM14873mullerBoldCustomSpbl3sdaw2, 0.0f, 0, null, null, null, 0.0f, 0L, 0.0f, brush2, roundedCornerShapeM8392RoundedCornerShape0680j_42, borderStroke2, fDimensionResource, fDimensionResource2, false, false, null, false, false, false, null, (Function0) objRememberedValue4, composer3, 0, 100663680, 0, 16388082);
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
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
            }), composer2, 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.taxiorder.TaxiMapKt.TaxiMap.2
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
                    TaxiMapKt.TaxiMap(onSelect, onDismiss, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void TaxiMap$lambda$2(MutableState<Offset> mutableState, long j) {
        mutableState.setValue(Offset.m11088boximpl(j));
    }

    public static final void TaxiMap$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void TaxiMapPreview(@Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(592327482);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(592327482, i, -1, "com.blackhub.bronline.game.ui.taxiorder.TaxiMapPreview (TaxiMap.kt:219)");
            }
            TaxiMap(new Function2<CoordinatesModel, Float, Unit>() { // from class: com.blackhub.bronline.game.ui.taxiorder.TaxiMapKt.TaxiMapPreview.1
                public final void invoke(@NotNull CoordinatesModel coordinatesModel, float f) {
                    Intrinsics.checkNotNullParameter(coordinatesModel, "<anonymous parameter 0>");
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(CoordinatesModel coordinatesModel, Float f) {
                    invoke(coordinatesModel, f.floatValue());
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.taxiorder.TaxiMapKt.TaxiMapPreview.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.taxiorder.TaxiMapKt.TaxiMapPreview.3
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
                    TaxiMapKt.TaxiMapPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final long TaxiMap$lambda$1(MutableState<Offset> mutableState) {
        return mutableState.getValue().getPackedValue();
    }

    public static final boolean TaxiMap$lambda$4(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }
}

