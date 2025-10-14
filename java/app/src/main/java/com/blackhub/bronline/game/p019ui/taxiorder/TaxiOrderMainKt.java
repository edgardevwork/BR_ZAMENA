package com.blackhub.bronline.game.p019ui.taxiorder;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.AlphaKt;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorFilter;
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
import androidx.compose.p003ui.text.TextRange;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.input.ImeAction;
import androidx.compose.p003ui.text.input.KeyboardCapitalization;
import androidx.compose.p003ui.text.input.TextFieldValue;
import androidx.compose.p003ui.text.input.VisualTransformation;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.unit.C2046Dp;
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
import androidx.profileinstaller.ProfileVerifier;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.gui.taxiorder.TaxiCompanyEnum;
import com.blackhub.bronline.game.gui.taxiorder.TaxiRateEnum;
import com.blackhub.bronline.game.p019ui.widget.button.MainButtonGradientKt;
import com.blackhub.bronline.game.p019ui.widget.button.ToggleButtonKt;
import com.blackhub.bronline.game.p019ui.widget.other.NarrowOvalWithGradientCustomKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsJVMKt;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TaxiOrderMain.kt */
@SourceDebugExtension({"SMAP\nTaxiOrderMain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaxiOrderMain.kt\ncom/blackhub/bronline/game/ui/taxiorder/TaxiOrderMainKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,515:1\n1116#2,6:516\n1116#2,6:592\n1116#2,6:745\n1116#2,6:827\n1116#2,6:882\n1116#2,6:888\n1116#2,6:894\n1116#2,6:941\n1116#2,6:947\n1116#2,6:953\n1116#2,6:1031\n1116#2,6:1042\n1549#3:522\n1620#3,3:523\n74#4,6:526\n80#4:560\n75#4,5:672\n80#4:705\n84#4:710\n74#4,6:761\n80#4:795\n84#4:842\n84#4:1057\n79#5,11:532\n79#5,11:563\n92#5:601\n79#5,11:608\n79#5,11:643\n79#5,11:677\n92#5:709\n79#5,11:716\n92#5:754\n92#5:759\n79#5,11:767\n79#5,11:798\n92#5:836\n92#5:841\n92#5:846\n79#5,11:853\n92#5:903\n79#5,11:912\n92#5:962\n79#5,11:966\n79#5,11:1002\n92#5:1040\n92#5:1051\n92#5:1056\n456#6,8:543\n464#6,3:557\n456#6,8:574\n464#6,3:588\n467#6,3:598\n456#6,8:619\n464#6,3:633\n456#6,8:654\n464#6,3:668\n456#6,8:688\n464#6,3:702\n467#6,3:706\n456#6,8:727\n464#6,3:741\n467#6,3:751\n467#6,3:756\n456#6,8:778\n464#6,3:792\n456#6,8:809\n464#6,3:823\n467#6,3:833\n467#6,3:838\n467#6,3:843\n456#6,8:864\n464#6,3:878\n467#6,3:900\n456#6,8:923\n464#6,3:937\n467#6,3:959\n456#6,8:977\n464#6,3:991\n456#6,8:1013\n464#6,3:1027\n467#6,3:1037\n467#6,3:1048\n467#6,3:1053\n3737#7,6:551\n3737#7,6:582\n3737#7,6:627\n3737#7,6:662\n3737#7,6:696\n3737#7,6:735\n3737#7,6:786\n3737#7,6:817\n3737#7,6:872\n3737#7,6:931\n3737#7,6:985\n3737#7,6:1021\n91#8,2:561\n93#8:591\n97#8:602\n88#8,5:603\n93#8:636\n87#8,6:637\n93#8:671\n97#8:760\n91#8,2:796\n93#8:826\n97#8:837\n97#8:847\n88#8,5:848\n93#8:881\n97#8:904\n87#8,6:906\n93#8:940\n97#8:963\n91#8,2:964\n93#8:994\n97#8:1052\n69#9,5:711\n74#9:744\n78#9:755\n67#9,7:995\n74#9:1030\n78#9:1041\n64#10:905\n81#11:1058\n107#11,2:1059\n*S KotlinDebug\n*F\n+ 1 TaxiOrderMain.kt\ncom/blackhub/bronline/game/ui/taxiorder/TaxiOrderMainKt\n*L\n84#1:516,6\n155#1:592,6\n236#1:745,6\n291#1:827,6\n326#1:882,6\n333#1:888,6\n340#1:894,6\n359#1:941,6\n366#1:947,6\n373#1:953,6\n397#1:1031,6\n450#1:1042,6\n114#1:522\n114#1:523,3\n117#1:526,6\n117#1:560\n191#1:672,5\n191#1:705\n191#1:710\n246#1:761,6\n246#1:795\n246#1:842\n117#1:1057\n117#1:532,11\n125#1:563,11\n125#1:601\n168#1:608,11\n180#1:643,11\n191#1:677,11\n191#1:709\n218#1:716,11\n218#1:754\n180#1:759\n246#1:767,11\n269#1:798,11\n269#1:836\n246#1:841\n168#1:846\n314#1:853,11\n314#1:903\n350#1:912,11\n350#1:962\n378#1:966,11\n391#1:1002,11\n391#1:1040\n378#1:1051\n117#1:1056\n117#1:543,8\n117#1:557,3\n125#1:574,8\n125#1:588,3\n125#1:598,3\n168#1:619,8\n168#1:633,3\n180#1:654,8\n180#1:668,3\n191#1:688,8\n191#1:702,3\n191#1:706,3\n218#1:727,8\n218#1:741,3\n218#1:751,3\n180#1:756,3\n246#1:778,8\n246#1:792,3\n269#1:809,8\n269#1:823,3\n269#1:833,3\n246#1:838,3\n168#1:843,3\n314#1:864,8\n314#1:878,3\n314#1:900,3\n350#1:923,8\n350#1:937,3\n350#1:959,3\n378#1:977,8\n378#1:991,3\n391#1:1013,8\n391#1:1027,3\n391#1:1037,3\n378#1:1048,3\n117#1:1053,3\n117#1:551,6\n125#1:582,6\n168#1:627,6\n180#1:662,6\n191#1:696,6\n218#1:735,6\n246#1:786,6\n269#1:817,6\n314#1:872,6\n350#1:931,6\n378#1:985,6\n391#1:1021,6\n125#1:561,2\n125#1:591\n125#1:602\n168#1:603,5\n168#1:636\n180#1:637,6\n180#1:671\n180#1:760\n269#1:796,2\n269#1:826\n269#1:837\n168#1:847\n314#1:848,5\n314#1:881\n314#1:904\n350#1:906,6\n350#1:940\n350#1:963\n378#1:964,2\n378#1:994\n378#1:1052\n218#1:711,5\n218#1:744\n218#1:755\n391#1:995,7\n391#1:1030\n391#1:1041\n353#1:905\n84#1:1058\n84#1:1059,2\n*E\n"})

public final class TaxiOrderMainKt {
    public static final float PERCENT_WIDTH = 0.7f;

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void TaxiOrderMain(final int i, @NotNull final List<Integer> selectButtonBrushColors, final int i2, @NotNull final String placeName, final float f, final float f2, final boolean z, final int i3, final int i4, final int i5, @NotNull final List<Integer> yandexButtonBrushColors, @NotNull final List<Integer> gettButtonBrushColors, @NotNull final List<Integer> cityMobileButtonBrushColors, final int i6, final int i7, final int i8, final int i9, final int i10, final int i11, @NotNull final String addressFromString, @NotNull final Function1<? super TaxiCompanyEnum, Unit> selectCompany, @NotNull final Function1<? super TaxiRateEnum, Unit> selectRate, @NotNull final Function1<? super Boolean, Unit> selectPayment, @NotNull final Function0<Unit> openLocationMenu, @NotNull final Function0<Unit> closeScreen, @NotNull final Function1<? super String, Unit> orderTaxi, @Nullable Composer composer, final int i12, final int i13, final int i14) {
        final MutableState mutableState;
        Intrinsics.checkNotNullParameter(selectButtonBrushColors, "selectButtonBrushColors");
        Intrinsics.checkNotNullParameter(placeName, "placeName");
        Intrinsics.checkNotNullParameter(yandexButtonBrushColors, "yandexButtonBrushColors");
        Intrinsics.checkNotNullParameter(gettButtonBrushColors, "gettButtonBrushColors");
        Intrinsics.checkNotNullParameter(cityMobileButtonBrushColors, "cityMobileButtonBrushColors");
        Intrinsics.checkNotNullParameter(addressFromString, "addressFromString");
        Intrinsics.checkNotNullParameter(selectCompany, "selectCompany");
        Intrinsics.checkNotNullParameter(selectRate, "selectRate");
        Intrinsics.checkNotNullParameter(selectPayment, "selectPayment");
        Intrinsics.checkNotNullParameter(openLocationMenu, "openLocationMenu");
        Intrinsics.checkNotNullParameter(closeScreen, "closeScreen");
        Intrinsics.checkNotNullParameter(orderTaxi, "orderTaxi");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1592437413);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1592437413, i12, i13, "com.blackhub.bronline.game.ui.taxiorder.TaxiOrderMain (TaxiOrderMain.kt:82)");
        }
        composerStartRestartGroup.startReplaceableGroup(2020153611);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(AnyExtensionKt.empty(StringCompanionObject.INSTANCE), 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        MutableState mutableState2 = (MutableState) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        Brush.Companion companion = Brush.INSTANCE;
        Brush brushM11289horizontalGradient8A3gB4$default = Brush.Companion.m11289horizontalGradient8A3gB4$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.dark_orange, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.orange, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
        BorderStroke borderStrokeM7798BorderStrokecXLIe8U = BorderStrokeKt.m7798BorderStrokecXLIe8U(PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composerStartRestartGroup, 6), Color.INSTANCE.m11375getTransparent0d7_KjU());
        BorderStroke borderStrokeM7798BorderStrokecXLIe8U2 = BorderStrokeKt.m7798BorderStrokecXLIe8U(PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composerStartRestartGroup, 6), ColorResources_androidKt.colorResource(i, composerStartRestartGroup, i12 & 14));
        composerStartRestartGroup.startReplaceableGroup(2020154537);
        List<Integer> list = selectButtonBrushColors;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Color.m11330boximpl(ColorResources_androidKt.colorResource(((Number) it.next()).intValue(), composerStartRestartGroup, 0)));
        }
        composerStartRestartGroup.endReplaceableGroup();
        Brush brushM11289horizontalGradient8A3gB4$default2 = Brush.Companion.m11289horizontalGradient8A3gB4$default(companion, arrayList, 0.0f, 0.0f, 0, 14, (Object) null);
        Modifier.Companion companion2 = Modifier.INSTANCE;
        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._630wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._360wdp, composerStartRestartGroup, 6)), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
        Alignment.Companion companion3 = Alignment.INSTANCE;
        Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierVerticalScroll$default);
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
        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        Modifier modifierM8124paddingVpY3zN4 = PaddingKt.m8124paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._23wdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._6wdp, composerStartRestartGroup, 6));
        Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
        Alignment.Vertical centerVertically = companion3.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composerStartRestartGroup, 54);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM8124paddingVpY3zN4);
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
        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
        if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        String strStringResource = StringResources_androidKt.stringResource(R.string.taxi_order_title, composerStartRestartGroup, 6);
        TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
        TextKt.m10024Text4IGK_g(strStringResource, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14873mullerBoldCustomSpbl3sdaw(R.dimen._14wsp, ColorResources_androidKt.colorResource(R.color.orange, composerStartRestartGroup, 6), 0, 0L, 0.0f, composerStartRestartGroup, 196614, 28), composerStartRestartGroup, 0, 0, 65534);
        Modifier modifierM8177width3ABfNKs = SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._34wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._79wdp, composerStartRestartGroup, 6));
        RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._23wdp, composerStartRestartGroup, 6));
        TextStyle textStyleM14873mullerBoldCustomSpbl3sdaw = typographyStyle.m14873mullerBoldCustomSpbl3sdaw(R.dimen._14wsp, 0L, 0, 0L, 0.0f, composerStartRestartGroup, 196614, 30);
        String strStringResource2 = StringResources_androidKt.stringResource(R.string.common_close, composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-2066533220);
        boolean z2 = (((57344 & i14) ^ CpioConstants.C_ISBLK) > 16384 && composerStartRestartGroup.changed(closeScreen)) || (i14 & CpioConstants.C_ISBLK) == 16384;
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.taxiorder.TaxiOrderMainKt$TaxiOrderMain$1$1$1$1
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
                    closeScreen.invoke();
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MainButtonGradientKt.m15077MainButtonGradientlunQu3Y(modifierM8177width3ABfNKs, null, strStringResource2, textStyleM14873mullerBoldCustomSpbl3sdaw, 0.0f, 0, null, null, null, 0.0f, 0L, 0.0f, brushM11289horizontalGradient8A3gB4$default, roundedCornerShapeM8392RoundedCornerShape0680j_4, borderStrokeM7798BorderStrokecXLIe8U, 0.0f, 0.0f, false, false, null, false, false, false, null, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 100663296, 0, 16486386);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        NarrowOvalWithGradientCustomKt.m15096NarrowOvalWithGradientCustomiJQMabo(SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composerStartRestartGroup, 6)), 0L, composerStartRestartGroup, 0, 2);
        Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._23wdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._17wdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._56wdp, composerStartRestartGroup, 6), 0.0f, 8, null);
        Arrangement.HorizontalOrVertical spaceBetween2 = arrangement.getSpaceBetween();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween2, companion3.getTop(), composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
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
        Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRowMeasurePolicy2, companion4.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
        if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
        }
        function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(companion2, 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion3.getTop(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierFillMaxHeight$default);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor4);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRowMeasurePolicy3, companion4.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion4.getSetCompositeKeyHash();
        if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
            composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
            composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
        }
        function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.img_taxi_path, composerStartRestartGroup, 6), (String) null, SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._90wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._34wdp, composerStartRestartGroup, 6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
        Modifier modifierM8124paddingVpY3zN42 = PaddingKt.m8124paddingVpY3zN4(SizeKt.m8158height3ABfNKs(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._90wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._12wdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._9wdp, composerStartRestartGroup, 6));
        Arrangement.HorizontalOrVertical spaceBetween3 = arrangement.getSpaceBetween();
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(spaceBetween3, companion3.getStart(), composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor5 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierM8124paddingVpY3zN42);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor5);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl5 = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl5, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl5, currentCompositionLocalMap5, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion4.getSetCompositeKeyHash();
        if (composerM10870constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
            composerM10870constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
            composerM10870constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
        }
        function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(addressFromString, Arrays.copyOf(new Object[]{String.valueOf(placeName)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        TextKt.m10024Text4IGK_g(str, (Modifier) companion2, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14873mullerBoldCustomSpbl3sdaw(R.dimen._12wsp, 0L, 0, 0L, 0.0f, composerStartRestartGroup, 196614, 30), composerStartRestartGroup, 48, 0, 65532);
        TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.taxi_order_your_address, composerStartRestartGroup, 6), (Modifier) companion2, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14873mullerBoldCustomSpbl3sdaw(R.dimen._12wsp, 0L, 0, 0L, 0.0f, composerStartRestartGroup, 196614, 30), composerStartRestartGroup, 48, 0, 65532);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierM8127paddingqDBjuR0$default2 = PaddingKt.m8127paddingqDBjuR0$default(SizeKt.m8158height3ABfNKs(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._90wdp, composerStartRestartGroup, 6)), 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composerStartRestartGroup, 6), 7, null);
        Alignment bottomStart = companion3.getBottomStart();
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(bottomStart, false, composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor6 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default2);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor6);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl6 = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl6, measurePolicyRememberBoxMeasurePolicy, companion4.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl6, currentCompositionLocalMap6, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion4.getSetCompositeKeyHash();
        if (composerM10870constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
            composerM10870constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
            composerM10870constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
        }
        function3ModifierMaterializerOf6.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Modifier modifierM8177width3ABfNKs2 = SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._23wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._90wdp, composerStartRestartGroup, 6));
        RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._23wdp, composerStartRestartGroup, 6));
        TextStyle textStyleM14873mullerBoldCustomSpbl3sdaw2 = typographyStyle.m14873mullerBoldCustomSpbl3sdaw(R.dimen._12wsp, 0L, 0, 0L, 0.0f, composerStartRestartGroup, 196614, 30);
        String strStringResource3 = StringResources_androidKt.stringResource(i2, composerStartRestartGroup, (i12 >> 6) & 14);
        composerStartRestartGroup.startReplaceableGroup(-722162476);
        boolean z3 = (((i14 & 7168) ^ 3072) > 2048 && composerStartRestartGroup.changed(openLocationMenu)) || (i14 & 3072) == 2048;
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (z3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue3 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.taxiorder.TaxiOrderMainKt$TaxiOrderMain$1$2$1$2$1$1
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
                    openLocationMenu.invoke();
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MainButtonGradientKt.m15077MainButtonGradientlunQu3Y(modifierM8177width3ABfNKs2, null, strStringResource3, textStyleM14873mullerBoldCustomSpbl3sdaw2, 0.0f, 0, null, null, null, 0.0f, 0L, 0.0f, brushM11289horizontalGradient8A3gB4$default2, roundedCornerShapeM8392RoundedCornerShape0680j_42, borderStrokeM7798BorderStrokecXLIe8U2, 0.0f, 0.0f, false, false, null, false, false, false, null, (Function0) objRememberedValue3, composerStartRestartGroup, 0, 100663296, 0, 16486386);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierM7770backgroundbw27NRU = BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._90wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._135wdp, composerStartRestartGroup, 6)), ColorResources_androidKt.colorResource(R.color.total_black_50, composerStartRestartGroup, 6), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composerStartRestartGroup, 6)));
        Alignment.Horizontal centerHorizontally2 = companion3.getCenterHorizontally();
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally2, composerStartRestartGroup, 48);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor7 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierM7770backgroundbw27NRU);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor7);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl7 = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl7, measurePolicyColumnMeasurePolicy3, companion4.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl7, currentCompositionLocalMap7, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = companion4.getSetCompositeKeyHash();
        if (composerM10870constructorimpl7.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
            composerM10870constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
            composerM10870constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
        }
        function3ModifierMaterializerOf7.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.taxi_order_type_of_pay, composerStartRestartGroup, 6), PaddingKt.m8127paddingqDBjuR0$default(companion2, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._6wdp, composerStartRestartGroup, 6), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._6wdp, composerStartRestartGroup, 6), 5, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14873mullerBoldCustomSpbl3sdaw(R.dimen._14wsp, 0L, 0, 0L, 0.0f, composerStartRestartGroup, 196614, 30), composerStartRestartGroup, 0, 0, 65532);
        Modifier modifierM8126paddingqDBjuR0 = PaddingKt.m8126paddingqDBjuR0(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._6wdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._6wdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._6wdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._12wdp, composerStartRestartGroup, 6));
        Alignment.Vertical centerVertically2 = companion3.getCenterVertically();
        Arrangement.HorizontalOrVertical spaceBetween4 = arrangement.getSpaceBetween();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(spaceBetween4, centerVertically2, composerStartRestartGroup, 54);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor8 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(modifierM8126paddingqDBjuR0);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor8);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl8 = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl8, measurePolicyRowMeasurePolicy4, companion4.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl8, currentCompositionLocalMap8, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash8 = companion4.getSetCompositeKeyHash();
        if (composerM10870constructorimpl8.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
            composerM10870constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
            composerM10870constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
        }
        function3ModifierMaterializerOf8.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        Painter painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.img_money, composerStartRestartGroup, 6);
        Modifier modifierAlpha = AlphaKt.alpha(SizeKt.m8158height3ABfNKs(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._23wdp, composerStartRestartGroup, 6)), f);
        ContentScale.Companion companion5 = ContentScale.INSTANCE;
        ImageKt.Image(painterPainterResource, (String) null, modifierAlpha, (Alignment) null, companion5.getFillHeight(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
        composerStartRestartGroup.startReplaceableGroup(-722160301);
        boolean z4 = (((i14 & 896) ^ 384) > 256 && composerStartRestartGroup.changed(selectPayment)) || (i14 & 384) == 256;
        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
        if (z4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue4 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.taxiorder.TaxiOrderMainKt$TaxiOrderMain$1$2$2$1$1$1
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
                    selectPayment.invoke(Boolean.TRUE);
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
        }
        composerStartRestartGroup.endReplaceableGroup();
        ToggleButtonKt.m15079ToggleButtoncmhDWc(0.0f, 0.0f, null, null, (Function0) objRememberedValue4, composerStartRestartGroup, 0, 15);
        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.img_card, composerStartRestartGroup, 6), (String) null, AlphaKt.alpha(SizeKt.m8158height3ABfNKs(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._23wdp, composerStartRestartGroup, 6)), f2), (Alignment) null, companion5.getFillHeight(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        SpacerKt.Spacer(SizeKt.m8158height3ABfNKs(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._12wdp, composerStartRestartGroup, 6)), composerStartRestartGroup, 0);
        NarrowOvalWithGradientCustomKt.m15096NarrowOvalWithGradientCustomiJQMabo(SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composerStartRestartGroup, 6)), 0L, composerStartRestartGroup, 0, 2);
        Modifier modifierM8127paddingqDBjuR0$default3 = PaddingKt.m8127paddingqDBjuR0$default(companion2, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._12wdp, composerStartRestartGroup, 6), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._12wdp, composerStartRestartGroup, 6), 5, null);
        Arrangement.HorizontalOrVertical spaceBetween5 = arrangement.getSpaceBetween();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy5 = RowKt.rowMeasurePolicy(spaceBetween5, companion3.getTop(), composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap9 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor9 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf9 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default3);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor9);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl9 = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl9, measurePolicyRowMeasurePolicy5, companion4.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl9, currentCompositionLocalMap9, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash9 = companion4.getSetCompositeKeyHash();
        if (composerM10870constructorimpl9.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
            composerM10870constructorimpl9.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash9));
            composerM10870constructorimpl9.apply(Integer.valueOf(currentCompositeKeyHash9), setCompositeKeyHash9);
        }
        function3ModifierMaterializerOf9.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        TaxiCompanyEnum taxiCompanyEnum = TaxiCompanyEnum.YANDEX_TAXI;
        composerStartRestartGroup.startReplaceableGroup(-2066526575);
        int i15 = (i14 & 14) ^ 6;
        boolean z5 = (i15 > 4 && composerStartRestartGroup.changed(selectCompany)) || (i14 & 6) == 4;
        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
        if (z5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue5 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.taxiorder.TaxiOrderMainKt$TaxiOrderMain$1$3$1$1
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
                    selectCompany.invoke(TaxiCompanyEnum.YANDEX_TAXI);
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
        }
        composerStartRestartGroup.endReplaceableGroup();
        TaxiCompanyButtonKt.TaxiCompanyButton(i3, yandexButtonBrushColors, taxiCompanyEnum, (Function0) objRememberedValue5, composerStartRestartGroup, ((i12 >> 21) & 14) | 448);
        TaxiCompanyEnum taxiCompanyEnum2 = TaxiCompanyEnum.CITY_MOBILE_TAXI;
        composerStartRestartGroup.startReplaceableGroup(-2066526273);
        boolean z6 = (i15 > 4 && composerStartRestartGroup.changed(selectCompany)) || (i14 & 6) == 4;
        Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
        if (z6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue6 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.taxiorder.TaxiOrderMainKt$TaxiOrderMain$1$3$2$1
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
                    selectCompany.invoke(TaxiCompanyEnum.CITY_MOBILE_TAXI);
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
        }
        composerStartRestartGroup.endReplaceableGroup();
        TaxiCompanyButtonKt.TaxiCompanyButton(i5, cityMobileButtonBrushColors, taxiCompanyEnum2, (Function0) objRememberedValue6, composerStartRestartGroup, ((i12 >> 27) & 14) | 448);
        TaxiCompanyEnum taxiCompanyEnum3 = TaxiCompanyEnum.GETT_TAXI;
        composerStartRestartGroup.startReplaceableGroup(-2066525985);
        boolean z7 = (i15 > 4 && composerStartRestartGroup.changed(selectCompany)) || (i14 & 6) == 4;
        Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
        if (z7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue7 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.taxiorder.TaxiOrderMainKt$TaxiOrderMain$1$3$3$1
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
                    selectCompany.invoke(TaxiCompanyEnum.GETT_TAXI);
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
        }
        composerStartRestartGroup.endReplaceableGroup();
        TaxiCompanyButtonKt.TaxiCompanyButton(i4, gettButtonBrushColors, taxiCompanyEnum3, (Function0) objRememberedValue7, composerStartRestartGroup, ((i12 >> 24) & 14) | 448);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        NarrowOvalWithGradientCustomKt.m15096NarrowOvalWithGradientCustomiJQMabo(SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composerStartRestartGroup, 6)), 0L, composerStartRestartGroup, 0, 2);
        Modifier modifierM8084offsetVpY3zN4$default = OffsetKt.m8084offsetVpY3zN4$default(PaddingKt.m8127paddingqDBjuR0$default(companion2, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._12wdp, composerStartRestartGroup, 6), 0.0f, 0.0f, 13, null), C2046Dp.m13666constructorimpl(-PrimitiveResources_androidKt.dimensionResource(R.dimen._6wdp, composerStartRestartGroup, 6)), 0.0f, 2, null);
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy6 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion3.getTop(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash10 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap10 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor10 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf10 = LayoutKt.modifierMaterializerOf(modifierM8084offsetVpY3zN4$default);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor10);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl10 = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl10, measurePolicyRowMeasurePolicy6, companion4.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl10, currentCompositionLocalMap10, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash10 = companion4.getSetCompositeKeyHash();
        if (composerM10870constructorimpl10.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl10.rememberedValue(), Integer.valueOf(currentCompositeKeyHash10))) {
            composerM10870constructorimpl10.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash10));
            composerM10870constructorimpl10.apply(Integer.valueOf(currentCompositeKeyHash10), setCompositeKeyHash10);
        }
        function3ModifierMaterializerOf10.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        TaxiRateEnum taxiRateEnum = TaxiRateEnum.ECONOMY;
        composerStartRestartGroup.startReplaceableGroup(-2066525352);
        int i16 = (i14 & 112) ^ 48;
        boolean z8 = (i16 > 32 && composerStartRestartGroup.changed(selectRate)) || (i14 & 48) == 32;
        Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
        if (z8 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue8 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.taxiorder.TaxiOrderMainKt$TaxiOrderMain$1$4$1$1
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
                    selectRate.invoke(TaxiRateEnum.ECONOMY);
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
        }
        Function0 function0 = (Function0) objRememberedValue8;
        composerStartRestartGroup.endReplaceableGroup();
        int i17 = i13 >> 12;
        TaxiRateButtonKt.TaxiRateButton(taxiRateEnum, i6, i9, function0, composerStartRestartGroup, ((i13 >> 6) & 112) | 6 | (i17 & 896));
        TaxiRateEnum taxiRateEnum2 = TaxiRateEnum.COMFORTABLE;
        composerStartRestartGroup.startReplaceableGroup(-2066525105);
        boolean z9 = (i16 > 32 && composerStartRestartGroup.changed(selectRate)) || (i14 & 48) == 32;
        Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
        if (z9 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue9 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.taxiorder.TaxiOrderMainKt$TaxiOrderMain$1$4$2$1
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
                    selectRate.invoke(TaxiRateEnum.COMFORTABLE);
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
        }
        composerStartRestartGroup.endReplaceableGroup();
        TaxiRateButtonKt.TaxiRateButton(taxiRateEnum2, i7, i10, (Function0) objRememberedValue9, composerStartRestartGroup, ((i13 >> 9) & 112) | 6 | ((i13 >> 15) & 896));
        TaxiRateEnum taxiRateEnum3 = TaxiRateEnum.BUSINESS;
        composerStartRestartGroup.startReplaceableGroup(-2066524855);
        boolean z10 = (i16 > 32 && composerStartRestartGroup.changed(selectRate)) || (i14 & 48) == 32;
        Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
        if (z10 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue10 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.taxiorder.TaxiOrderMainKt$TaxiOrderMain$1$4$3$1
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
                    selectRate.invoke(TaxiRateEnum.BUSINESS);
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
        }
        composerStartRestartGroup.endReplaceableGroup();
        TaxiRateButtonKt.TaxiRateButton(taxiRateEnum3, i8, i11, (Function0) objRememberedValue10, composerStartRestartGroup, (i17 & 112) | 6 | ((i13 >> 18) & 896));
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierM8126paddingqDBjuR02 = PaddingKt.m8126paddingqDBjuR0(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._23wdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._17wdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._23wdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._12wdp, composerStartRestartGroup, 6));
        Arrangement.HorizontalOrVertical spaceBetween6 = arrangement.getSpaceBetween();
        Alignment.Vertical centerVertically3 = companion3.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy7 = RowKt.rowMeasurePolicy(spaceBetween6, centerVertically3, composerStartRestartGroup, 54);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash11 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap11 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor11 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11 = LayoutKt.modifierMaterializerOf(modifierM8126paddingqDBjuR02);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor11);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl11 = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl11, measurePolicyRowMeasurePolicy7, companion4.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl11, currentCompositionLocalMap11, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash11 = companion4.getSetCompositeKeyHash();
        if (composerM10870constructorimpl11.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl11.rememberedValue(), Integer.valueOf(currentCompositeKeyHash11))) {
            composerM10870constructorimpl11.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash11));
            composerM10870constructorimpl11.apply(Integer.valueOf(currentCompositeKeyHash11), setCompositeKeyHash11);
        }
        function3ModifierMaterializerOf11.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        Alignment centerStart = companion3.getCenterStart();
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(centerStart, false, composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash12 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap12 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor12 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf12 = LayoutKt.modifierMaterializerOf(companion2);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor12);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl12 = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl12, measurePolicyRememberBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl12, currentCompositionLocalMap12, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash12 = companion4.getSetCompositeKeyHash();
        if (composerM10870constructorimpl12.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl12.rememberedValue(), Integer.valueOf(currentCompositeKeyHash12))) {
            composerM10870constructorimpl12.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash12));
            composerM10870constructorimpl12.apply(Integer.valueOf(currentCompositeKeyHash12), setCompositeKeyHash12);
        }
        function3ModifierMaterializerOf12.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        TextFieldValue textFieldValueTaxiOrderMain$lambda$1 = TaxiOrderMain$lambda$1(mutableState2);
        KeyboardOptions keyboardOptions = new KeyboardOptions(KeyboardCapitalization.INSTANCE.m13371getSentencesIUNYP9k(), true, 0, ImeAction.INSTANCE.m13342getDoneeUduSuo(), null, 20, null);
        TextStyle textStyleM14873mullerBoldCustomSpbl3sdaw3 = typographyStyle.m14873mullerBoldCustomSpbl3sdaw(R.dimen._12wsp, Color.INSTANCE.m11377getWhite0d7_KjU(), 0, 0L, 0.0f, composerStartRestartGroup, 196662, 28);
        Modifier modifierM8124paddingVpY3zN43 = PaddingKt.m8124paddingVpY3zN4(BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth(companion2, 0.7f), PrimitiveResources_androidKt.dimensionResource(R.dimen._34wdp, composerStartRestartGroup, 6)), ColorResources_androidKt.colorResource(R.color.total_black_70, composerStartRestartGroup, 6), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._12wdp, composerStartRestartGroup, 6))), PrimitiveResources_androidKt.dimensionResource(R.dimen._12wdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._9wdp, composerStartRestartGroup, 6));
        composerStartRestartGroup.startReplaceableGroup(-1568144633);
        Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion6 = Composer.INSTANCE;
        if (objRememberedValue11 == companion6.getEmpty()) {
            mutableState = mutableState2;
            objRememberedValue11 = new Function1<TextFieldValue, Unit>() { // from class: com.blackhub.bronline.game.ui.taxiorder.TaxiOrderMainKt$TaxiOrderMain$1$5$1$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                    invoke2(textFieldValue);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull TextFieldValue newText) {
                    Intrinsics.checkNotNullParameter(newText, "newText");
                    mutableState.setValue(newText);
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
        } else {
            mutableState = mutableState2;
        }
        composerStartRestartGroup.endReplaceableGroup();
        BasicTextFieldKt.BasicTextField(textFieldValueTaxiOrderMain$lambda$1, (Function1<? super TextFieldValue, Unit>) objRememberedValue11, modifierM8124paddingVpY3zN43, false, false, textStyleM14873mullerBoldCustomSpbl3sdaw3, keyboardOptions, (KeyboardActions) null, true, 1, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) null, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) null, composerStartRestartGroup, 907542576, 0, 64664);
        composerStartRestartGroup.startReplaceableGroup(-2066522835);
        String text = TaxiOrderMain$lambda$1(mutableState).getText();
        if (text == null || StringsKt__StringsJVMKt.isBlank(text)) {
            TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.taxi_order_hint_comment, composerStartRestartGroup, 6), PaddingKt.m8127paddingqDBjuR0$default(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._12wdp, composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14873mullerBoldCustomSpbl3sdaw(R.dimen._12wsp, ColorResources_androidKt.colorResource(R.color.dark_gray, composerStartRestartGroup, 6), 0, 0L, 0.0f, composerStartRestartGroup, 196614, 28), composerStartRestartGroup, 0, 0, 65532);
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._146wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._34wdp, composerStartRestartGroup, 6));
        RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_43 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._23wdp, composerStartRestartGroup, 6));
        TextStyle textStyleM14873mullerBoldCustomSpbl3sdaw4 = typographyStyle.m14873mullerBoldCustomSpbl3sdaw(R.dimen._15wsp, 0L, 0, 0L, 0.0f, composerStartRestartGroup, 196614, 30);
        String strStringResource4 = StringResources_androidKt.stringResource(R.string.taxi_order_order_a_taxi, composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-2066521718);
        boolean z11 = (((458752 & i14) ^ ProfileVerifier.CompilationStatus.f342xf2722a21) > 131072 && composerStartRestartGroup.changed(orderTaxi)) || (196608 & i14) == 131072;
        Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
        if (z11 || objRememberedValue12 == companion6.getEmpty()) {
            objRememberedValue12 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.taxiorder.TaxiOrderMainKt$TaxiOrderMain$1$5$2$1
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
                    orderTaxi.invoke(TaxiOrderMainKt.TaxiOrderMain$lambda$1(mutableState).getText());
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MainButtonGradientKt.m15077MainButtonGradientlunQu3Y(modifierM8158height3ABfNKs, null, strStringResource4, textStyleM14873mullerBoldCustomSpbl3sdaw4, 0.0f, 0, null, null, null, 0.0f, 0L, 0.0f, brushM11289horizontalGradient8A3gB4$default, roundedCornerShapeM8392RoundedCornerShape0680j_43, borderStrokeM7798BorderStrokecXLIe8U, 0.0f, 0.0f, false, false, null, z, false, false, null, (Function0) objRememberedValue12, composerStartRestartGroup, 0, 100663296, (i12 >> 18) & 14, 15437810);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.taxiorder.TaxiOrderMainKt.TaxiOrderMain.2
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

                public final void invoke(@Nullable Composer composer2, int i18) {
                    TaxiOrderMainKt.TaxiOrderMain(i, selectButtonBrushColors, i2, placeName, f, f2, z, i3, i4, i5, yandexButtonBrushColors, gettButtonBrushColors, cityMobileButtonBrushColors, i6, i7, i8, i9, i10, i11, addressFromString, selectCompany, selectRate, selectPayment, openLocationMenu, closeScreen, orderTaxi, composer2, RecomposeScopeImplKt.updateChangedFlags(i12 | 1), RecomposeScopeImplKt.updateChangedFlags(i13), RecomposeScopeImplKt.updateChangedFlags(i14));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void TaxiOrderMainPreview(@Nullable Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-261349852);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-261349852, i, -1, "com.blackhub.bronline.game.ui.taxiorder.TaxiOrderMainPreview (TaxiOrderMain.kt:462)");
            }
            composer2 = composerStartRestartGroup;
            TaxiOrderMain(R.color.orange, CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.color.red), Integer.valueOf(R.color.orange)}), R.string.common_select, StringResources_androidKt.stringResource(R.string.taxi_order_s, composerStartRestartGroup, 6), 1.0f, 0.5f, true, R.drawable.ic_taxi_element_inactive, R.drawable.ic_taxi_element_inactive, R.drawable.ic_taxi_element_inactive, CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.color.red), Integer.valueOf(R.color.orange)}), CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.color.total_black_50), Integer.valueOf(R.color.total_black_50)}), CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.color.total_black_50), Integer.valueOf(R.color.total_black_50)}), 100, 200, 300, R.color.transparent, R.color.transparent, R.color.orange, StringResources_androidKt.stringResource(R.string.taxi_your_address, composerStartRestartGroup, 6), new Function1<TaxiCompanyEnum, Unit>() { // from class: com.blackhub.bronline.game.ui.taxiorder.TaxiOrderMainKt.TaxiOrderMainPreview.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull TaxiCompanyEnum it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(TaxiCompanyEnum taxiCompanyEnum) {
                    invoke2(taxiCompanyEnum);
                    return Unit.INSTANCE;
                }
            }, new Function1<TaxiRateEnum, Unit>() { // from class: com.blackhub.bronline.game.ui.taxiorder.TaxiOrderMainKt.TaxiOrderMainPreview.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull TaxiRateEnum it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(TaxiRateEnum taxiRateEnum) {
                    invoke2(taxiRateEnum);
                    return Unit.INSTANCE;
                }
            }, new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.game.ui.taxiorder.TaxiOrderMainKt.TaxiOrderMainPreview.3
                public final void invoke(boolean z) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.taxiorder.TaxiOrderMainKt.TaxiOrderMainPreview.4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.taxiorder.TaxiOrderMainKt.TaxiOrderMainPreview.5
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.ui.taxiorder.TaxiOrderMainKt.TaxiOrderMainPreview.6
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull String it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }
            }, composer2, 920347062, 115043766, 224694);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.taxiorder.TaxiOrderMainKt.TaxiOrderMainPreview.7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i2) {
                    TaxiOrderMainKt.TaxiOrderMainPreview(composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final TextFieldValue TaxiOrderMain$lambda$1(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }
}

