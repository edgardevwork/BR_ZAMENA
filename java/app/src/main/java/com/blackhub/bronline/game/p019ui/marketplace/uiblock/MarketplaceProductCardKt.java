package com.blackhub.bronline.game.p019ui.marketplace.uiblock;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.ScaleKt;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
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
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.blackhub.bronline.game.GameRender;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.marketplace.enums.MarketplaceHistoryStatusEnum;
import com.blackhub.bronline.game.gui.marketplace.enums.MarketplaceNotificationEnum;
import com.blackhub.bronline.game.gui.marketplace.enums.MarketplaceRarityEnum;
import com.blackhub.bronline.game.gui.marketplace.enums.MarketplaceTypeProductCardEnum;
import com.blackhub.bronline.game.gui.marketplace.model.MarketplaceProduct;
import com.blackhub.bronline.game.p019ui.widget.block.ClickAnimateBlockKt;
import com.blackhub.bronline.game.p019ui.widget.timer.CountdownTimerWithSecondsToEndKt;
import com.blackhub.bronline.game.p019ui.widget.utils.ImageBitmapKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import com.google.android.datatransport.cct.CctTransportBackend;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.compress.archivers.zip.UnixStat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MarketplaceProductCard.kt */
@SourceDebugExtension({"SMAP\nMarketplaceProductCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketplaceProductCard.kt\ncom/blackhub/bronline/game/ui/marketplace/uiblock/MarketplaceProductCardKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,387:1\n74#2:388\n1116#3,6:389\n1116#3,6:395\n1116#3,6:692\n74#4,6:401\n80#4:435\n75#4,5:622\n80#4:655\n84#4:707\n84#4:722\n79#5,11:407\n79#5,11:438\n79#5,11:473\n92#5:505\n92#5:510\n79#5,11:518\n79#5,11:554\n79#5,11:588\n92#5:620\n79#5,11:627\n79#5,11:663\n92#5:701\n92#5:706\n92#5:711\n92#5:716\n92#5:721\n456#6,8:418\n464#6,3:432\n456#6,8:449\n464#6,3:463\n456#6,8:484\n464#6,3:498\n467#6,3:502\n467#6,3:507\n456#6,8:529\n464#6,3:543\n456#6,8:565\n464#6,3:579\n456#6,8:599\n464#6,3:613\n467#6,3:617\n456#6,8:638\n464#6,3:652\n456#6,8:674\n464#6,3:688\n467#6,3:698\n467#6,3:703\n467#6,3:708\n467#6,3:713\n467#6,3:718\n3737#7,6:426\n3737#7,6:457\n3737#7,6:492\n3737#7,6:537\n3737#7,6:573\n3737#7,6:607\n3737#7,6:646\n3737#7,6:682\n91#8,2:436\n93#8:466\n87#8,6:467\n93#8:501\n97#8:506\n97#8:511\n86#8,7:547\n93#8:582\n86#8,7:656\n93#8:691\n97#8:702\n97#8:712\n68#9,6:512\n74#9:546\n69#9,5:583\n74#9:616\n78#9:621\n78#9:717\n81#10:723\n107#10,2:724\n81#10:726\n*S KotlinDebug\n*F\n+ 1 MarketplaceProductCard.kt\ncom/blackhub/bronline/game/ui/marketplace/uiblock/MarketplaceProductCardKt\n*L\n77#1:388\n79#1:389,6\n81#1:395,6\n277#1:692,6\n124#1:401,6\n124#1:435\n245#1:622,5\n245#1:655\n245#1:707\n124#1:722\n124#1:407,11\n139#1:438,11\n153#1:473,11\n153#1:505\n139#1:510\n195#1:518,11\n199#1:554,11\n200#1:588,11\n200#1:620\n245#1:627,11\n272#1:663,11\n272#1:701\n245#1:706\n199#1:711\n195#1:716\n124#1:721\n124#1:418,8\n124#1:432,3\n139#1:449,8\n139#1:463,3\n153#1:484,8\n153#1:498,3\n153#1:502,3\n139#1:507,3\n195#1:529,8\n195#1:543,3\n199#1:565,8\n199#1:579,3\n200#1:599,8\n200#1:613,3\n200#1:617,3\n245#1:638,8\n245#1:652,3\n272#1:674,8\n272#1:688,3\n272#1:698,3\n245#1:703,3\n199#1:708,3\n195#1:713,3\n124#1:718,3\n124#1:426,6\n139#1:457,6\n153#1:492,6\n195#1:537,6\n199#1:573,6\n200#1:607,6\n245#1:646,6\n272#1:682,6\n139#1:436,2\n139#1:466\n153#1:467,6\n153#1:501\n153#1:506\n139#1:511\n199#1:547,7\n199#1:582\n272#1:656,7\n272#1:691\n272#1:702\n199#1:712\n195#1:512,6\n195#1:546\n200#1:583,5\n200#1:616\n200#1:621\n195#1:717\n79#1:723\n79#1:724,2\n81#1:726\n*E\n"})
/* loaded from: classes3.dex */
public final class MarketplaceProductCardKt {
    public static final float ALPHA = 0.7f;
    public static final float VIP_SCALE = 1.15f;

    public static final /* synthetic */ void access$MarketplaceProductCard$lambda$2(MutableState mutableState, Bitmap bitmap) {
        mutableState.setValue(bitmap);
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void MarketplaceProductCard(@Nullable Modifier modifier, @NotNull final MarketplaceProduct product, final boolean z, @NotNull final Function0<Unit> onClickMainButton, @NotNull final Function0<Unit> onClickLike, @Nullable Composer composer, final int i, final int i2) {
        Modifier.Companion companion;
        int i3;
        State state;
        MutableState mutableState;
        int i4;
        int i5;
        Modifier.Companion companion2;
        int i6;
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(onClickMainButton, "onClickMainButton");
        Intrinsics.checkNotNullParameter(onClickLike, "onClickLike");
        Composer composerStartRestartGroup = composer.startRestartGroup(1965823027);
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1965823027, i, -1, "com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceProductCard (MarketplaceProductCard.kt:75)");
        }
        Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        composerStartRestartGroup.startReplaceableGroup(-2031271841);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion3 = Composer.INSTANCE;
        if (objRememberedValue == companion3.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        MutableState mutableState2 = (MutableState) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        long price = product.getPrice();
        composerStartRestartGroup.startReplaceableGroup(-2031271774);
        boolean zChanged = composerStartRestartGroup.changed(price);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue2 == companion3.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0<String>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceProductCardKt$MarketplaceProductCard$priceString$2$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return UsefulKt.getPriceWithSpaces(Long.valueOf(product.getPrice()));
                }
            });
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        State state2 = (State) objRememberedValue2;
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(Integer.valueOf(product.getId()), new C59141(product, context, mutableState2, null), composerStartRestartGroup, 64);
        Modifier modifierM7770backgroundbw27NRU = BackgroundKt.m7770backgroundbw27NRU(ComposeExtensionKt.m14410shadowo6VuwKU(SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(modifier2, PrimitiveResources_androidKt.dimensionResource(R.dimen._144wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._320wdp, composerStartRestartGroup, 6)), (242 & 1) != 0 ? Color.INSTANCE.m11366getBlack0d7_KjU() : ColorResources_androidKt.colorResource(product.getCardShadowColor(), composerStartRestartGroup, 0), (242 & 2) != 0 ? 1.0f : 0.7f, (242 & 4) != 0 ? C2046Dp.m13666constructorimpl(0) : PrimitiveResources_androidKt.dimensionResource(R.dimen._6wdp, composerStartRestartGroup, 6), (242 & 8) != 0 ? C2046Dp.m13666constructorimpl(0) : PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composerStartRestartGroup, 6), (242 & 16) != 0 ? C2046Dp.m13666constructorimpl(0) : 0.0f, (242 & 32) != 0 ? C2046Dp.m13666constructorimpl(0) : 0.0f, (242 & 64) != 0 ? C2046Dp.m13666constructorimpl(0) : 0.0f, (242 & 128) != 0 ? Modifier.INSTANCE : null), ColorResources_androidKt.colorResource(R.color.total_black, composerStartRestartGroup, 6), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._6wdp, composerStartRestartGroup, 6)));
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Vertical top = arrangement.getTop();
        Alignment.Companion companion4 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion4.getStart(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion5.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM7770backgroundbw27NRU);
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
        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        Modifier.Companion companion6 = Modifier.INSTANCE;
        Modifier modifierM7770backgroundbw27NRU2 = BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._25wdp, composerStartRestartGroup, 6)), ColorResources_androidKt.colorResource(product.getCardHeaderColor(), composerStartRestartGroup, 0), RoundedCornerShapeKt.m8394RoundedCornerShapea9UjIt4$default(PrimitiveResources_androidKt.dimensionResource(R.dimen._6wdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._6wdp, composerStartRestartGroup, 6), 0.0f, 0.0f, 12, null));
        Alignment.Vertical centerVertically = companion4.getCenterVertically();
        Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composerStartRestartGroup, 54);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM7770backgroundbw27NRU2);
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
        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRowMeasurePolicy, companion5.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
        if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(companion6, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
        Alignment.Vertical centerVertically2 = companion4.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically2, composerStartRestartGroup, 48);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
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
        Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRowMeasurePolicy2, companion5.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
        if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
        }
        function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        Integer cardTitleIcon = product.getCardTitleIcon();
        composerStartRestartGroup.startReplaceableGroup(1113052045);
        if (cardTitleIcon == null) {
            companion = companion6;
            i3 = 0;
            mutableState = mutableState2;
            state = state2;
        } else {
            companion = companion6;
            i3 = 0;
            state = state2;
            mutableState = mutableState2;
            ImageKt.Image(PainterResources_androidKt.painterResource(cardTitleIcon.intValue(), composerStartRestartGroup, 0), (String) null, PaddingKt.m8127paddingqDBjuR0$default(SizeKt.m8172size3ABfNKs(companion6, PrimitiveResources_androidKt.dimensionResource(R.dimen._18wdp, composerStartRestartGroup, 6)), 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composerStartRestartGroup, 6), 0.0f, 11, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
            Unit unit = Unit.INSTANCE;
        }
        composerStartRestartGroup.endReplaceableGroup();
        String strStringResource = StringResources_androidKt.stringResource(product.getCardTitle(), composerStartRestartGroup, i3);
        TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
        long jColorResource = ColorResources_androidKt.colorResource(product.getCardTextColor(), composerStartRestartGroup, i3);
        Offset.Companion companion7 = Offset.INSTANCE;
        TextKt.m10024Text4IGK_g(strStringResource, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._11wsp, jColorResource, 0, companion7.m11115getZeroF1C5BW0(), 0.0f, null, composerStartRestartGroup, 1575942, 52), composerStartRestartGroup, 0, 0, 65534);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        Integer cardTitleLeftTimeText = product.getCardTitleLeftTimeText();
        composerStartRestartGroup.startReplaceableGroup(-1854723941);
        if (cardTitleLeftTimeText == null) {
            i4 = 6;
        } else {
            i4 = 6;
            CountdownTimerWithSecondsToEndKt.CountdownTimerWithSecondsToEnd(PaddingKt.m8127paddingqDBjuR0$default(companion, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composerStartRestartGroup, 6), 0.0f, 11, null), typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._12wsp, ColorResources_androidKt.colorResource(product.getCardTextColor(), composerStartRestartGroup, i3), 0, companion7.m11115getZeroF1C5BW0(), 0.0f, null, composerStartRestartGroup, 1575942, 52), product.getTimeVipCard(), composerStartRestartGroup, 0, 0);
            Unit unit2 = Unit.INSTANCE;
        }
        composerStartRestartGroup.endReplaceableGroup();
        Integer cardTitleLeftCountText = product.getCardTitleLeftCountText();
        composerStartRestartGroup.startReplaceableGroup(-1970597089);
        if (cardTitleLeftCountText == null) {
            i5 = i4;
        } else {
            i5 = i4;
            TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(cardTitleLeftCountText.intValue(), new Object[]{Integer.valueOf(product.getCount())}, composerStartRestartGroup, 64), PaddingKt.m8127paddingqDBjuR0$default(companion, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composerStartRestartGroup, i5), 0.0f, 11, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._12wsp, 0L, 0, 0L, 0.0f, null, composerStartRestartGroup, 1572870, 62), composerStartRestartGroup, 0, 0, 65532);
            Unit unit3 = Unit.INSTANCE;
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        Modifier.Companion companion8 = companion;
        Modifier modifierM8123padding3ABfNKs = PaddingKt.m8123padding3ABfNKs(companion8, PrimitiveResources_androidKt.dimensionResource(R.dimen._12wdp, composerStartRestartGroup, i5));
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor4 = companion5.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM8123padding3ABfNKs);
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
        Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRememberBoxMeasurePolicy, companion5.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion5.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion5.getSetCompositeKeyHash();
        if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
            composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
            composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
        }
        function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        final BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion4.getTop(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor5 = companion5.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(companion8);
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
        Updater.m10877setimpl(composerM10870constructorimpl5, measurePolicyRowMeasurePolicy3, companion5.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl5, currentCompositionLocalMap5, companion5.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion5.getSetCompositeKeyHash();
        if (composerM10870constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
            composerM10870constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
            composerM10870constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
        }
        function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        Modifier modifierM7770backgroundbw27NRU3 = BackgroundKt.m7770backgroundbw27NRU(BorderKt.m7782borderxT4_qwU(SizeKt.m8172size3ABfNKs(companion8, PrimitiveResources_androidKt.dimensionResource(R.dimen._95wdp, composerStartRestartGroup, i5)), PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composerStartRestartGroup, i5), ColorResources_androidKt.colorResource(product.getBgBorderColor(), composerStartRestartGroup, 0), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._4wdp, composerStartRestartGroup, i5))), ColorResources_androidKt.colorResource(R.color.dark_gray_30, composerStartRestartGroup, i5), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._4wdp, composerStartRestartGroup, i5)));
        Alignment center = companion4.getCenter();
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, i5);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor6 = companion5.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierM7770backgroundbw27NRU3);
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
        Updater.m10877setimpl(composerM10870constructorimpl6, measurePolicyRememberBoxMeasurePolicy2, companion5.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl6, currentCompositionLocalMap6, companion5.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion5.getSetCompositeKeyHash();
        if (composerM10870constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
            composerM10870constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
            composerM10870constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
        }
        function3ModifierMaterializerOf6.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        if (product.isPlatinumVipProduct()) {
            composerStartRestartGroup.startReplaceableGroup(-1970576742);
            companion2 = companion8;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.vip_platinum, composerStartRestartGroup, i5), (String) null, ScaleKt.scale(SizeKt.fillMaxSize$default(companion8, 0.0f, 1, null), 1.15f), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
            composerStartRestartGroup.endReplaceableGroup();
            i6 = 48;
        } else {
            companion2 = companion8;
            composerStartRestartGroup.startReplaceableGroup(-1970576371);
            ImageBitmapKt.m15118ImageBitmapAy9G7rc(MarketplaceProductCard$lambda$1(mutableState), null, null, ContentScale.INSTANCE.getInside(), 0.0f, null, 0, composerStartRestartGroup, 3080, 118);
            i6 = 48;
            ComposeExtensionKt.IfTrue(Boolean.valueOf(z), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 718972561, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceProductCardKt$MarketplaceProductCard$2$2$1$1$1
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
                public final void invoke(@Nullable Composer composer2, int i7) {
                    if ((i7 & 11) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(718972561, i7, -1, "com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceProductCard.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MarketplaceProductCard.kt:228)");
                        }
                        TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(product.getTimeTemplate(), new Object[]{Integer.valueOf(product.getTime())}, composer2, 64), boxScopeInstance.align(PaddingKt.m8123padding3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer2, 6)), Alignment.INSTANCE.getBottomStart()), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14811montserratBoldCustomSpIzzofJo(R.dimen._12wsp, 0L, 0, 0L, 0.0f, null, null, composer2, 12582918, 126), composer2, 0, 0, 65532);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), composerStartRestartGroup, ((i >> 6) & 14) | 48);
            composerStartRestartGroup.endReplaceableGroup();
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        Modifier.Companion companion9 = companion2;
        Modifier modifierM8127paddingqDBjuR0$default2 = PaddingKt.m8127paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(SizeKt.m8158height3ABfNKs(companion9, PrimitiveResources_androidKt.dimensionResource(R.dimen._95wdp, composerStartRestartGroup, 6)), 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
        Arrangement.HorizontalOrVertical spaceBetween2 = arrangement.getSpaceBetween();
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(spaceBetween2, companion4.getStart(), composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor7 = companion5.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default2);
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
        Updater.m10877setimpl(composerM10870constructorimpl7, measurePolicyColumnMeasurePolicy2, companion5.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl7, currentCompositionLocalMap7, companion5.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = companion5.getSetCompositeKeyHash();
        if (composerM10870constructorimpl7.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
            composerM10870constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
            composerM10870constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
        }
        function3ModifierMaterializerOf7.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        int i7 = i6;
        TextKt.m10024Text4IGK_g(product.getName(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._12wsp, 0L, 0, 0L, 0.0f, null, null, composerStartRestartGroup, 12582918, 126), composerStartRestartGroup, 0, 0, 65534);
        if (product.isPlatinumVipProduct()) {
            composerStartRestartGroup.startReplaceableGroup(-1970574869);
            TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.marketplace_vip_preview_text, composerStartRestartGroup, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._16wsp, 0L, 0, 0L, 0.0f, null, composerStartRestartGroup, 1572870, 62), composerStartRestartGroup, 0, 0, 65534);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(-1970574557);
            final State state3 = state;
            ComposeExtensionKt.IfFalse(Boolean.valueOf(!product.isPublished() && product.isUser()), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 758455934, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceProductCardKt$MarketplaceProductCard$2$2$1$2$1
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
                public final void invoke(@Nullable Composer composer2, int i8) {
                    if ((i8 & 11) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(758455934, i8, -1, "com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceProductCard.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MarketplaceProductCard.kt:262)");
                        }
                        TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.common_string_with_ruble, new Object[]{MarketplaceProductCardKt.MarketplaceProductCard$lambda$4(state3)}, composer2, 70), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._16wsp, 0L, 0, 0L, 0.0f, null, composer2, 1572870, 62), composer2, 0, 0, 65534);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), composerStartRestartGroup, i7);
            composerStartRestartGroup.endReplaceableGroup();
        }
        Alignment.Vertical centerVertically3 = companion4.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically3, composerStartRestartGroup, i7);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor8 = companion5.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(companion9);
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
        Updater.m10877setimpl(composerM10870constructorimpl8, measurePolicyRowMeasurePolicy4, companion5.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl8, currentCompositionLocalMap8, companion5.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash8 = companion5.getSetCompositeKeyHash();
        if (composerM10870constructorimpl8.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
            composerM10870constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
            composerM10870constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
        }
        function3ModifierMaterializerOf8.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        composerStartRestartGroup.startReplaceableGroup(-1375729469);
        boolean z2 = (((i & 7168) ^ 3072) > 2048 && composerStartRestartGroup.changed(onClickMainButton)) || (i & 3072) == 2048;
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (z2 || objRememberedValue3 == companion3.getEmpty()) {
            objRememberedValue3 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceProductCardKt$MarketplaceProductCard$2$2$1$2$2$1$1
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
                    onClickMainButton.invoke();
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        composerStartRestartGroup.endReplaceableGroup();
        ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(null, null, false, null, false, false, false, false, null, 0, 0L, null, (Function0) objRememberedValue3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -897727670, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceProductCardKt$MarketplaceProductCard$2$2$1$2$2$2
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
            public final void invoke(@Nullable Composer composer2, int i8) {
                if ((i8 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-897727670, i8, -1, "com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceProductCard.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MarketplaceProductCard.kt:280)");
                    }
                    Modifier.Companion companion10 = Modifier.INSTANCE;
                    Modifier modifierM7770backgroundbw27NRU4 = BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion10, PrimitiveResources_androidKt.dimensionResource(R.dimen._156wdp, composer2, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composer2, 6)), ColorResources_androidKt.colorResource(product.getButtonColor(), composer2, 0), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composer2, 6)));
                    Alignment.Companion companion11 = Alignment.INSTANCE;
                    Alignment center2 = companion11.getCenter();
                    MarketplaceProduct marketplaceProduct = product;
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(center2, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap9 = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion12 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor9 = companion12.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf9 = LayoutKt.modifierMaterializerOf(modifierM7770backgroundbw27NRU4);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor9);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM10870constructorimpl9 = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl9, measurePolicyRememberBoxMeasurePolicy3, companion12.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl9, currentCompositionLocalMap9, companion12.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash9 = companion12.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl9.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
                        composerM10870constructorimpl9.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash9));
                        composerM10870constructorimpl9.apply(Integer.valueOf(currentCompositeKeyHash9), setCompositeKeyHash9);
                    }
                    function3ModifierMaterializerOf9.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    BoxKt.Box(BoxScopeInstance.INSTANCE.align(BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8177width3ABfNKs(SizeKt.fillMaxHeight$default(companion10, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._4wdp, composer2, 6)), ColorResources_androidKt.colorResource(R.color.white, composer2, 6), RoundedCornerShapeKt.m8394RoundedCornerShapea9UjIt4$default(PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composer2, 6), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composer2, 6), 0.0f, 10, null)), companion11.getCenterStart()), composer2, 0);
                    TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(marketplaceProduct.getCardButtonText(), composer2, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14811montserratBoldCustomSpIzzofJo(R.dimen._11wsp, ColorResources_androidKt.colorResource(marketplaceProduct.getCardTextColor(), composer2, 0), 0, 0L, 0.0f, null, null, composer2, 12582918, 124), composer2, 0, 0, 65534);
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
        }), composerStartRestartGroup, 0, 3072, UnixStat.PERM_MASK);
        ComposeExtensionKt.IfTrue(Boolean.valueOf((product.isUser() || product.isPlatinumVipProduct()) ? false : true), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 382657889, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceProductCardKt$MarketplaceProductCard$2$2$1$2$2$3
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
            public final void invoke(@Nullable Composer composer2, int i8) {
                if ((i8 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(382657889, i8, -1, "com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceProductCard.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MarketplaceProductCard.kt:314)");
                    }
                    composer2.startReplaceableGroup(1464337186);
                    boolean zChanged2 = composer2.changed(onClickLike);
                    final Function0<Unit> function0 = onClickLike;
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceProductCardKt$MarketplaceProductCard$2$2$1$2$2$3$1$1
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
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    composer2.endReplaceableGroup();
                    final MarketplaceProduct marketplaceProduct = product;
                    ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(null, null, false, null, false, false, false, false, null, 0, 0L, (Function0) objRememberedValue4, null, ComposableLambdaKt.composableLambda(composer2, -2113015694, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceProductCardKt$MarketplaceProductCard$2$2$1$2$2$3.2
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
                        public final void invoke(@Nullable Composer composer3, int i9) {
                            if ((i9 & 11) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2113015694, i9, -1, "com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceProductCard.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MarketplaceProductCard.kt:319)");
                                }
                                Modifier.Companion companion10 = Modifier.INSTANCE;
                                Modifier modifierM7770backgroundbw27NRU4 = BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8172size3ABfNKs(PaddingKt.m8127paddingqDBjuR0$default(companion10, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer3, 6), 0.0f, 0.0f, 0.0f, 14, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._25wdp, composer3, 6)), ColorResources_androidKt.colorResource(R.color.white, composer3, 6), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composer3, 6)));
                                Alignment center2 = Alignment.INSTANCE.getCenter();
                                MarketplaceProduct marketplaceProduct2 = marketplaceProduct;
                                composer3.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(center2, false, composer3, 6);
                                composer3.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap9 = composer3.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor9 = companion11.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf9 = LayoutKt.modifierMaterializerOf(modifierM7770backgroundbw27NRU4);
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor9);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM10870constructorimpl9 = Updater.m10870constructorimpl(composer3);
                                Updater.m10877setimpl(composerM10870constructorimpl9, measurePolicyRememberBoxMeasurePolicy3, companion11.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl9, currentCompositionLocalMap9, companion11.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash9 = companion11.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl9.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
                                    composerM10870constructorimpl9.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash9));
                                    composerM10870constructorimpl9.apply(Integer.valueOf(currentCompositeKeyHash9), setCompositeKeyHash9);
                                }
                                function3ModifierMaterializerOf9.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_heart, composer3, 6), (String) null, SizeKt.m8172size3ABfNKs(companion10, PrimitiveResources_androidKt.dimensionResource(R.dimen._15wdp, composer3, 6)), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m11381tintxETnrds$default(ColorFilter.INSTANCE, ColorResources_androidKt.colorResource(marketplaceProduct2.getHeartColor(), composer3, 0), 0, 2, null), composer3, 56, 56);
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
                    }), composer2, 0, 3072, 6143);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, i7);
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
            final Modifier modifier3 = modifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceProductCardKt.MarketplaceProductCard.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i8) {
                    MarketplaceProductCardKt.MarketplaceProductCard(modifier3, product, z, onClickMainButton, onClickLike, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* compiled from: MarketplaceProductCard.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceProductCardKt$MarketplaceProductCard$1", m7120f = "MarketplaceProductCard.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceProductCardKt$MarketplaceProductCard$1 */
    /* loaded from: classes7.dex */
    public static final class C59141 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ MarketplaceProduct $product;
        public final /* synthetic */ MutableState<Bitmap> $productImage$delegate;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C59141(MarketplaceProduct marketplaceProduct, Context context, MutableState<Bitmap> mutableState, Continuation<? super C59141> continuation) {
            super(2, continuation);
            this.$product = marketplaceProduct;
            this.$context = context;
            this.$productImage$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C59141(this.$product, this.$context, this.$productImage$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C59141) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            ImageTypePathInCDNEnum imageTypePathInCDNEnum;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                if (AnyExtensionKt.isNotNull(MarketplaceProductCardKt.MarketplaceProductCard$lambda$1(this.$productImage$delegate))) {
                    MarketplaceProductCardKt.MarketplaceProductCard$lambda$2(this.$productImage$delegate, null);
                }
                if (this.$product.getImageName().length() > 0) {
                    int type = this.$product.getRenderInfo().getType();
                    if (type == 0) {
                        imageTypePathInCDNEnum = ImageTypePathInCDNEnum.ACCESSORY;
                    } else if (type == 2) {
                        imageTypePathInCDNEnum = ImageTypePathInCDNEnum.SKIN;
                    } else if (type == 7) {
                        imageTypePathInCDNEnum = ImageTypePathInCDNEnum.VEHICLE;
                    } else {
                        imageTypePathInCDNEnum = ImageTypePathInCDNEnum.IMAGE;
                    }
                    MarketplaceProductCardKt.MarketplaceProductCard$lambda$2(this.$productImage$delegate, BitmapUtilsKt.getBitmapFromZip$default(this.$context, this.$product.getImageName(), imageTypePathInCDNEnum, 0.0f, 0.0f, 24, null));
                } else {
                    GameRender gameRender = GameRender.getInstance();
                    int type2 = this.$product.getRenderInfo().getType();
                    int modelId = this.$product.getRenderInfo().getModelId();
                    int modelId2 = this.$product.getRenderInfo().getModelId();
                    int color = this.$product.getRenderInfo().getColor();
                    int color2 = this.$product.getRenderInfo().getColor();
                    Float rotationX = this.$product.getRenderInfo().getRotationX();
                    float fFloatValue = rotationX != null ? rotationX.floatValue() : 20.0f;
                    Float rotationY = this.$product.getRenderInfo().getRotationY();
                    float fFloatValue2 = rotationY != null ? rotationY.floatValue() : 180.0f;
                    Float rotationZ = this.$product.getRenderInfo().getRotationZ();
                    float fFloatValue3 = rotationZ != null ? rotationZ.floatValue() : 45.0f;
                    float zoom = this.$product.getRenderInfo().getZoom();
                    final MutableState<Bitmap> mutableState = this.$productImage$delegate;
                    gameRender.RequestRender(type2, modelId, modelId2, color, color2, fFloatValue, fFloatValue2, fFloatValue3, zoom, new GameRender.GameRenderListener() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceProductCardKt$MarketplaceProductCard$1$$ExternalSyntheticLambda0
                        @Override // com.blackhub.bronline.game.GameRender.GameRenderListener
                        public final void OnRenderComplete(int i, Bitmap bitmap) {
                            MarketplaceProductCardKt.access$MarketplaceProductCard$lambda$2(mutableState, bitmap);
                        }
                    });
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void MarketplaceProductCardPreview(@Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1745517810);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1745517810, i, -1, "com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceProductCardPreview (MarketplaceProductCard.kt:347)");
            }
            MarketplaceProductCard(Modifier.INSTANCE, new MarketplaceProduct(false, "Маска «Ленин»", null, MarketplaceRarityEnum.COMMON, MarketplaceTypeProductCardEnum.COMMON, 0, null, 0, 0, 0, 0, 0L, 332, null, null, null, 0.0d, 0, MarketplaceHistoryStatusEnum.SOLD, false, false, false, false, null, 11792357, null), true, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceProductCardKt.MarketplaceProductCardPreview.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceProductCardKt.MarketplaceProductCardPreview.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 28102, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceProductCardKt.MarketplaceProductCardPreview.3
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
                    MarketplaceProductCardKt.MarketplaceProductCardPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void MarketplaceProductVipCardPreview(@Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-587143065);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-587143065, i, -1, "com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceProductVipCardPreview (MarketplaceProductCard.kt:367)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MarketplaceTypeProductCardEnum marketplaceTypeProductCardEnum = MarketplaceTypeProductCardEnum.BEST;
            MarketplaceProductCard(companion, new MarketplaceProduct(true, StringResources_androidKt.stringResource(R.string.craft_is_with_vip_platinum, composerStartRestartGroup, 6), null, MarketplaceRarityEnum.SPECIAL, marketplaceTypeProductCardEnum, 0, MarketplaceNotificationEnum.THE_BEST, 0, 0, 0, 0, 1000L, 0, StringResources_androidKt.stringResource(R.string.common_black_russia, composerStartRestartGroup, 6), StringResources_androidKt.stringResource(R.string.marketplace_vip_description, composerStartRestartGroup, 6), null, 0.0d, 0, null, false, false, false, false, null, 16750372, null), false, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceProductCardKt.MarketplaceProductVipCardPreview.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceProductCardKt.MarketplaceProductVipCardPreview.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 28102, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceProductCardKt.MarketplaceProductVipCardPreview.3
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
                    MarketplaceProductCardKt.MarketplaceProductVipCardPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final Bitmap MarketplaceProductCard$lambda$1(MutableState<Bitmap> mutableState) {
        return mutableState.getValue();
    }

    public static final void MarketplaceProductCard$lambda$2(MutableState<Bitmap> mutableState, Bitmap bitmap) {
        mutableState.setValue(bitmap);
    }

    public static final String MarketplaceProductCard$lambda$4(State<String> state) {
        return state.getValue();
    }
}

