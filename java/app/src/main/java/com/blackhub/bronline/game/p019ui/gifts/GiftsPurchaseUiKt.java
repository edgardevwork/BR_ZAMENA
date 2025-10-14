package com.blackhub.bronline.game.p019ui.gifts;

import android.graphics.Bitmap;
import androidx.annotation.DrawableRes;
import androidx.compose.foundation.BackgroundKt;
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
import androidx.compose.material3.IconKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.ClipKt;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.TransformOriginKt;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.tooling.preview.Preview;
import androidx.compose.p003ui.unit.C2046Dp;
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
import coil.compose.SingletonAsyncImageKt;
import com.blackhub.bronline.game.common.resources.StringResourceCompose;
import com.blackhub.bronline.game.gui.gifts.model.GiftsPreviewItemModel;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GiftsPurchaseUi.kt */
@SourceDebugExtension({"SMAP\nGiftsPurchaseUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiftsPurchaseUi.kt\ncom/blackhub/bronline/game/ui/gifts/GiftsPurchaseUiKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,519:1\n75#2:520\n68#3,6:521\n74#3:555\n69#3,5:596\n74#3:629\n78#3:640\n69#3,5:641\n74#3:674\n78#3:679\n69#3,5:680\n74#3:713\n78#3:718\n69#3,5:801\n74#3:834\n78#3:839\n69#3,5:840\n74#3:873\n78#3:878\n78#3:893\n79#4,11:527\n79#4,11:567\n79#4,11:601\n92#4:639\n79#4,11:646\n92#4:678\n79#4,11:685\n92#4:717\n92#4:728\n79#4,11:737\n79#4,11:772\n79#4,11:806\n92#4:838\n79#4,11:845\n92#4:877\n92#4:882\n92#4:887\n92#4:892\n456#5,8:538\n464#5,3:552\n456#5,8:578\n464#5,3:592\n456#5,8:612\n464#5,3:626\n467#5,3:636\n456#5,8:657\n464#5,3:671\n467#5,3:675\n456#5,8:696\n464#5,3:710\n467#5,3:714\n467#5,3:725\n456#5,8:748\n464#5,3:762\n456#5,8:783\n464#5,3:797\n456#5,8:817\n464#5,3:831\n467#5,3:835\n456#5,8:856\n464#5,3:870\n467#5,3:874\n467#5,3:879\n467#5,3:884\n467#5,3:889\n3737#6,6:546\n3737#6,6:586\n3737#6,6:620\n3737#6,6:665\n3737#6,6:704\n3737#6,6:756\n3737#6,6:791\n3737#6,6:825\n3737#6,6:864\n1116#7,6:556\n1116#7,6:630\n1116#7,6:719\n88#8,5:562\n93#8:595\n97#8:729\n87#8,6:766\n93#8:800\n97#8:883\n73#9,7:730\n80#9:765\n84#9:888\n*S KotlinDebug\n*F\n+ 1 GiftsPurchaseUi.kt\ncom/blackhub/bronline/game/ui/gifts/GiftsPurchaseUiKt\n*L\n153#1:520\n175#1:521,6\n175#1:555\n220#1:596,5\n220#1:629\n220#1:640\n266#1:641,5\n266#1:674\n266#1:679\n282#1:680,5\n282#1:713\n282#1:718\n342#1:801,5\n342#1:834\n342#1:839\n402#1:840,5\n402#1:873\n402#1:878\n175#1:893\n175#1:527,11\n215#1:567,11\n220#1:601,11\n220#1:639\n266#1:646,11\n266#1:678\n282#1:685,11\n282#1:717\n215#1:728\n327#1:737,11\n338#1:772,11\n342#1:806,11\n342#1:838\n402#1:845,11\n402#1:877\n338#1:882\n327#1:887\n175#1:892\n175#1:538,8\n175#1:552,3\n215#1:578,8\n215#1:592,3\n220#1:612,8\n220#1:626,3\n220#1:636,3\n266#1:657,8\n266#1:671,3\n266#1:675,3\n282#1:696,8\n282#1:710,3\n282#1:714,3\n215#1:725,3\n327#1:748,8\n327#1:762,3\n338#1:783,8\n338#1:797,3\n342#1:817,8\n342#1:831,3\n342#1:835,3\n402#1:856,8\n402#1:870,3\n402#1:874,3\n338#1:879,3\n327#1:884,3\n175#1:889,3\n175#1:546,6\n215#1:586,6\n220#1:620,6\n266#1:665,6\n282#1:704,6\n327#1:756,6\n338#1:791,6\n342#1:825,6\n402#1:864,6\n195#1:556,6\n244#1:630,6\n306#1:719,6\n215#1:562,5\n215#1:595\n215#1:729\n338#1:766,6\n338#1:800\n338#1:883\n327#1:730,7\n327#1:765\n327#1:888\n*E\n"})
/* loaded from: classes3.dex */
public final class GiftsPurchaseUiKt {
    public static final float HALF_WINDOW = 0.5f;
    public static final float WIDTH_OF_LIST = 0.8f;

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void GiftsPurchaseUi(@Nullable Modifier modifier, final int i, final int i2, @NotNull final List<GiftsPreviewItemModel> standardPrizes, @NotNull final List<GiftsPreviewItemModel> legendaryPrizes, final int i3, final int i4, final int i5, @Nullable final Bitmap bitmap, @NotNull final Function0<Unit> clickPurchaseBC, @NotNull final Function0<Unit> clickCloseInterface, @NotNull final Function1<? super Boolean, Unit> clickOpenStandardItem, @NotNull final Function1<? super Boolean, Unit> clickOpenLegendaryItem, final boolean z, @NotNull final Function0<Unit> clickButtonBack, @DrawableRes final int i6, @DrawableRes final int i7, final boolean z2, @NotNull final GiftsPreviewItemModel firstGift, @Nullable final GiftsPreviewItemModel giftsPreviewItemModel, @DrawableRes final int i8, final boolean z3, final boolean z4, final boolean z5, @NotNull final Function0<Unit> onFlipClick, @NotNull final Function0<Unit> onButtonGetClick, @NotNull final Function0<Unit> onTurnBlockingLoadingClick, @Nullable Composer composer, final int i9, final int i10, final int i11, final int i12) {
        Intrinsics.checkNotNullParameter(standardPrizes, "standardPrizes");
        Intrinsics.checkNotNullParameter(legendaryPrizes, "legendaryPrizes");
        Intrinsics.checkNotNullParameter(clickPurchaseBC, "clickPurchaseBC");
        Intrinsics.checkNotNullParameter(clickCloseInterface, "clickCloseInterface");
        Intrinsics.checkNotNullParameter(clickOpenStandardItem, "clickOpenStandardItem");
        Intrinsics.checkNotNullParameter(clickOpenLegendaryItem, "clickOpenLegendaryItem");
        Intrinsics.checkNotNullParameter(clickButtonBack, "clickButtonBack");
        Intrinsics.checkNotNullParameter(firstGift, "firstGift");
        Intrinsics.checkNotNullParameter(onFlipClick, "onFlipClick");
        Intrinsics.checkNotNullParameter(onButtonGetClick, "onButtonGetClick");
        Intrinsics.checkNotNullParameter(onTurnBlockingLoadingClick, "onTurnBlockingLoadingClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1234064629);
        Modifier modifier2 = (i12 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1234064629, i9, i10, "com.blackhub.bronline.game.ui.gifts.GiftsPurchaseUi (GiftsPurchaseUi.kt:88)");
        }
        final Modifier modifier3 = modifier2;
        SurfaceKt.m9876SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -436821040, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.gifts.GiftsPurchaseUiKt.GiftsPurchaseUi.1
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

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@Nullable Composer composer2, int i13) {
                if ((i13 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-436821040, i13, -1, "com.blackhub.bronline.game.ui.gifts.GiftsPurchaseUi.<anonymous> (GiftsPurchaseUi.kt:90)");
                    }
                    GiftsPurchaseUiKt.GiftsPurchaseUiContent(modifier3, i, i2, standardPrizes, legendaryPrizes, i3, i4, i5, bitmap, i6, i7, clickPurchaseBC, clickCloseInterface, clickOpenStandardItem, clickOpenLegendaryItem, z, clickButtonBack, onTurnBlockingLoadingClick, composer2, 134254592, 0, 0);
                    if (z2) {
                        GiftsOpenPrizesUIKt.GiftsOpenPrizesUI(firstGift, giftsPreviewItemModel, i8, z3, z4, z5, onFlipClick, onButtonGetClick, composer2, 72);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, 12582912, 127);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier4 = modifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.gifts.GiftsPurchaseUiKt.GiftsPurchaseUi.2
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

                public final void invoke(@Nullable Composer composer2, int i13) {
                    GiftsPurchaseUiKt.GiftsPurchaseUi(modifier4, i, i2, standardPrizes, legendaryPrizes, i3, i4, i5, bitmap, clickPurchaseBC, clickCloseInterface, clickOpenStandardItem, clickOpenLegendaryItem, z, clickButtonBack, i6, i7, z2, firstGift, giftsPreviewItemModel, i8, z3, z4, z5, onFlipClick, onButtonGetClick, onTurnBlockingLoadingClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i9 | 1), RecomposeScopeImplKt.updateChangedFlags(i10), RecomposeScopeImplKt.updateChangedFlags(i11), i12);
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void GiftsPurchaseUiContent(@Nullable Modifier modifier, final int i, final int i2, @NotNull final List<GiftsPreviewItemModel> standardPrizes, @NotNull final List<GiftsPreviewItemModel> legendaryPrizes, final int i3, final int i4, final int i5, @Nullable final Bitmap bitmap, @DrawableRes final int i6, @DrawableRes final int i7, @NotNull final Function0<Unit> clickPurchaseBC, @NotNull final Function0<Unit> clickCloseInterface, @NotNull final Function1<? super Boolean, Unit> clickOpenStandardItem, @NotNull final Function1<? super Boolean, Unit> clickOpenLegendaryItem, final boolean z, @NotNull final Function0<Unit> clickButtonBack, @NotNull final Function0<Unit> onTurnBlockingLoadingClick, @Nullable Composer composer, final int i8, final int i9, final int i10) {
        Composer composer2;
        Modifier.Companion companion;
        Modifier modifier2;
        Intrinsics.checkNotNullParameter(standardPrizes, "standardPrizes");
        Intrinsics.checkNotNullParameter(legendaryPrizes, "legendaryPrizes");
        Intrinsics.checkNotNullParameter(clickPurchaseBC, "clickPurchaseBC");
        Intrinsics.checkNotNullParameter(clickCloseInterface, "clickCloseInterface");
        Intrinsics.checkNotNullParameter(clickOpenStandardItem, "clickOpenStandardItem");
        Intrinsics.checkNotNullParameter(clickOpenLegendaryItem, "clickOpenLegendaryItem");
        Intrinsics.checkNotNullParameter(clickButtonBack, "clickButtonBack");
        Intrinsics.checkNotNullParameter(onTurnBlockingLoadingClick, "onTurnBlockingLoadingClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1813149115);
        Modifier modifier3 = (i10 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1813149115, i8, i9, "com.blackhub.bronline.game.ui.gifts.GiftsPurchaseUiContent (GiftsPurchaseUi.kt:147)");
        }
        float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._2sdp, composerStartRestartGroup, 6);
        float fDimensionResource2 = PrimitiveResources_androidKt.dimensionResource(R.dimen._30sdp, composerStartRestartGroup, 6);
        float fDimensionResource3 = PrimitiveResources_androidKt.dimensionResource(R.dimen._24sdp, composerStartRestartGroup, 6);
        float fDimensionResource4 = PrimitiveResources_androidKt.dimensionResource(R.dimen._12sdp, composerStartRestartGroup, 6);
        float fM13666constructorimpl = C2046Dp.m13666constructorimpl(fDimensionResource3 / 2);
        float fDimensionResource5 = PrimitiveResources_androidKt.dimensionResource(R.dimen._8sdp, composerStartRestartGroup, 6);
        float fDimensionResource6 = PrimitiveResources_androidKt.dimensionResource(R.dimen._2sdp, composerStartRestartGroup, 6);
        float fDimensionResource7 = PrimitiveResources_androidKt.dimensionResource(R.dimen._44sdp, composerStartRestartGroup, 6);
        float fDimensionResource8 = PrimitiveResources_androidKt.dimensionResource(R.dimen._44sdp, composerStartRestartGroup, 6);
        float fDimensionResource9 = PrimitiveResources_androidKt.dimensionResource(R.dimen._13sdp, composerStartRestartGroup, 6);
        final float fDimensionResource10 = PrimitiveResources_androidKt.dimensionResource(R.dimen._30sdp, composerStartRestartGroup, 6);
        float fDimensionResource11 = PrimitiveResources_androidKt.dimensionResource(R.dimen._30sdp, composerStartRestartGroup, 6);
        Brush.Companion companion2 = Brush.INSTANCE;
        Brush brushM11297verticalGradient8A3gB4$default = Brush.Companion.m11297verticalGradient8A3gB4$default(companion2, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.gray_blue, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
        final Brush brushM11297verticalGradient8A3gB4$default2 = Brush.Companion.m11297verticalGradient8A3gB4$default(companion2, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.orange, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.red, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
        Modifier modifier4 = modifier3;
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion3 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion4.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Modifier.Companion companion5 = Modifier.INSTANCE;
        SingletonAsyncImageKt.m14279AsyncImage3HmZ8SU(bitmap, null, BackgroundKt.m7771backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion5, 0.0f, 1, null), ColorResources_androidKt.colorResource(R.color.black, composerStartRestartGroup, 6), null, 2, null), null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, composerStartRestartGroup, 1572920, 952);
        composerStartRestartGroup.startReplaceableGroup(719147007);
        if (z) {
            Modifier modifierAlign = boxScopeInstance.align(companion5, companion3.getTopStart());
            long jTransformOrigin = TransformOriginKt.TransformOrigin(0.0f, 0.0f);
            composerStartRestartGroup.startReplaceableGroup(719147327);
            boolean z2 = (((3670016 & i9) ^ 1572864) > 1048576 && composerStartRestartGroup.changed(clickButtonBack)) || (1572864 & i9) == 1048576;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.gifts.GiftsPurchaseUiKt$GiftsPurchaseUiContent$1$1$1
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
                        clickButtonBack.invoke();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierAlign, null, false, null, false, false, false, false, null, 0, jTransformOrigin, null, (Function0) objRememberedValue, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2121349803, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.gifts.GiftsPurchaseUiKt$GiftsPurchaseUiContent$1$2
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
                public final void invoke(@Nullable Composer composer3, int i11) {
                    if ((i11 & 11) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2121349803, i11, -1, "com.blackhub.bronline.game.ui.gifts.GiftsPurchaseUiContent.<anonymous>.<anonymous> (GiftsPurchaseUi.kt:196)");
                        }
                        Modifier.Companion companion6 = Modifier.INSTANCE;
                        Modifier modifierM7771backgroundbw27NRU$default = BackgroundKt.m7771backgroundbw27NRU$default(ClipKt.clip(SizeKt.m8172size3ABfNKs(companion6, fDimensionResource10), RoundedCornerShapeKt.m8394RoundedCornerShapea9UjIt4$default(0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._10sdp, composer3, 6), 0.0f, 11, null)), ColorResources_androidKt.colorResource(R.color.red, composer3, 6), null, 2, null);
                        Alignment center = Alignment.INSTANCE.getCenter();
                        composer3.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, composer3, 6);
                        composer3.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion7.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM7771backgroundbw27NRU$default);
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
                        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion7.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion7.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion7.getSetCompositeKeyHash();
                        if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        IconKt.m9496Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_long_arrow_left, composer3, 6), (String) null, SizeKt.m8172size3ABfNKs(companion6, PrimitiveResources_androidKt.dimensionResource(R.dimen._18sdp, composer3, 6)), Color.INSTANCE.m11377getWhite0d7_KjU(), composer3, 3128, 0);
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
            }), composerStartRestartGroup, 0, 3072, 3070);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null);
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Horizontal end = arrangement.getEnd();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(end, companion3.getTop(), composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
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
        Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(companion5, fDimensionResource2);
        Alignment centerEnd = companion3.getCenterEnd();
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(centerEnd, false, composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM8158height3ABfNKs);
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
        Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
        if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
        }
        function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        BoxKt.Box(SizeKt.m8174sizeVpY3zN4(BackgroundKt.m7770backgroundbw27NRU(companion5, ColorResources_androidKt.colorResource(R.color.black, composerStartRestartGroup, 6), RoundedCornerShapeKt.m8394RoundedCornerShapea9UjIt4$default(0.0f, 0.0f, 0.0f, fDimensionResource, 7, null)), fM13666constructorimpl, fDimensionResource2), composerStartRestartGroup, 0);
        BoxKt.Box(SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(BackgroundKt.m7771backgroundbw27NRU$default(companion5, ColorResources_androidKt.colorResource(R.color.blue_black, composerStartRestartGroup, 6), null, 2, null), fDimensionResource2), fDimensionResource4), composerStartRestartGroup, 0);
        Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(companion5, fDimensionResource3);
        composerStartRestartGroup.startReplaceableGroup(-578797922);
        boolean z3 = (((i9 & 112) ^ 48) > 32 && composerStartRestartGroup.changed(clickPurchaseBC)) || (i9 & 48) == 32;
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (z3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.gifts.GiftsPurchaseUiKt$GiftsPurchaseUiContent$1$3$1$1$1
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
                    clickPurchaseBC.invoke();
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierM8172size3ABfNKs, null, false, null, false, false, false, false, null, 0, 0L, null, (Function0) objRememberedValue2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1252376902, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.gifts.GiftsPurchaseUiKt$GiftsPurchaseUiContent$1$3$1$2
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
            public final void invoke(@Nullable Composer composer3, int i11) {
                if ((i11 & 11) != 2 || !composer3.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1252376902, i11, -1, "com.blackhub.bronline.game.ui.gifts.GiftsPurchaseUiContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GiftsPurchaseUi.kt:245)");
                    }
                    Modifier.Companion companion6 = Modifier.INSTANCE;
                    Modifier modifierBackground$default = BackgroundKt.background$default(SizeKt.m8172size3ABfNKs(companion6, PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composer3, 6)), brushM11297verticalGradient8A3gB4$default2, RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._9wdp, composer3, 6)), 0.0f, 4, null);
                    Alignment center = Alignment.INSTANCE.getCenter();
                    composer3.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(center, false, composer3, 6);
                    composer3.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor4 = companion7.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierBackground$default);
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor4);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composer3);
                    Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRememberBoxMeasurePolicy3, companion7.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion7.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion7.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                    composer3.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    IconKt.m9496Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_plus, composer3, 6), (String) null, SizeKt.m8172size3ABfNKs(companion6, PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composer3, 6)), Color.INSTANCE.m11377getWhite0d7_KjU(), composer3, 3128, 0);
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
        }), composerStartRestartGroup, 0, 3072, 4094);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierM8158height3ABfNKs2 = SizeKt.m8158height3ABfNKs(BackgroundKt.m7771backgroundbw27NRU$default(companion5, ColorResources_androidKt.colorResource(R.color.blue_black, composerStartRestartGroup, 6), null, 2, null), fDimensionResource2);
        Alignment center = companion3.getCenter();
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM8158height3ABfNKs2);
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
        Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRememberBoxMeasurePolicy3, companion4.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion4.getSetCompositeKeyHash();
        if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
            composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
            composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
        }
        function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        Modifier modifierM8125paddingVpY3zN4$default = PaddingKt.m8125paddingVpY3zN4$default(companion5, fDimensionResource5, 0.0f, 2, null);
        StringResourceCompose stringResourceCompose = StringResourceCompose.INSTANCE;
        int i11 = i8 >> 3;
        AnnotatedString annotatedStringGiftsValueOfBC = stringResourceCompose.giftsValueOfBC(i, composerStartRestartGroup, (i11 & 14) | 48);
        TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
        TextAlign.Companion companion6 = TextAlign.INSTANCE;
        TextKt.m10025TextIbK3jfQ(annotatedStringGiftsValueOfBC, modifierM8125paddingVpY3zN4$default, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle.m14857montserratSemiBold20spOr15ssp67j0QOw(0L, companion6.m13558getCentere0LSkKk(), 0L, 0.0f, composerStartRestartGroup, CpioConstants.C_ISBLK, 13), composerStartRestartGroup, 0, 0, 131068);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierM8158height3ABfNKs3 = SizeKt.m8158height3ABfNKs(BackgroundKt.background$default(PaddingKt.m8127paddingqDBjuR0$default(companion5, 0.0f, 0.0f, fDimensionResource7, 0.0f, 11, null), brushM11297verticalGradient8A3gB4$default, RoundedCornerShapeKt.m8394RoundedCornerShapea9UjIt4$default(0.0f, 0.0f, fDimensionResource, 0.0f, 11, null), 0.0f, 4, null), fDimensionResource2);
        Alignment center2 = companion3.getCenter();
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(center2, false, composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor5 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierM8158height3ABfNKs3);
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
        Updater.m10877setimpl(composerM10870constructorimpl5, measurePolicyRememberBoxMeasurePolicy4, companion4.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl5, currentCompositionLocalMap5, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion4.getSetCompositeKeyHash();
        if (composerM10870constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
            composerM10870constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
            composerM10870constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
        }
        function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.common_bc, composerStartRestartGroup, 6), PaddingKt.m8125paddingVpY3zN4$default(companion5, fDimensionResource6, 0.0f, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14794montserratBold15spOr12ssp1PwDTvk(0L, 0, 0L, 0L, 0.0f, null, composerStartRestartGroup, 1572864, 63), composerStartRestartGroup, 0, 0, 65532);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierM8172size3ABfNKs2 = SizeKt.m8172size3ABfNKs(companion5, fDimensionResource10);
        long jTransformOrigin2 = TransformOriginKt.TransformOrigin(1.0f, 0.0f);
        composerStartRestartGroup.startReplaceableGroup(339511868);
        boolean z4 = (((i9 & 896) ^ 384) > 256 && composerStartRestartGroup.changed(clickCloseInterface)) || (i9 & 384) == 256;
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (z4 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue3 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.gifts.GiftsPurchaseUiKt$GiftsPurchaseUiContent$1$3$4$1
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
                    clickCloseInterface.invoke();
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        composerStartRestartGroup.endReplaceableGroup();
        ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierM8172size3ABfNKs2, null, false, null, false, false, false, false, null, 0, jTransformOrigin2, null, (Function0) objRememberedValue3, ComposableSingletons$GiftsPurchaseUiKt.INSTANCE.m14977getLambda1$app_siteRelease(), composerStartRestartGroup, 0, 3072, 3070);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor6 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(companion5);
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
        Updater.m10877setimpl(composerM10870constructorimpl6, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl6, currentCompositionLocalMap6, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion4.getSetCompositeKeyHash();
        if (composerM10870constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
            composerM10870constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
            composerM10870constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
        }
        function3ModifierMaterializerOf6.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), 0.0f, fDimensionResource11, 0.0f, 0.0f, 13, null);
        int i12 = i8 >> 6;
        TextKt.m10025TextIbK3jfQ(stringResourceCompose.giftsTitlePurchase(i2, composerStartRestartGroup, (i12 & 14) | 48), modifierM8127paddingqDBjuR0$default, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle.m14798montserratBold24spOr18ssp67j0QOw(0L, companion6.m13558getCentere0LSkKk(), 0L, 0.0f, composerStartRestartGroup, CpioConstants.C_ISBLK, 13), composerStartRestartGroup, 0, 0, 131068);
        Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion5, 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion3.getTop(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor7 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default2);
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
        Updater.m10877setimpl(composerM10870constructorimpl7, measurePolicyRowMeasurePolicy2, companion4.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl7, currentCompositionLocalMap7, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = companion4.getSetCompositeKeyHash();
        if (composerM10870constructorimpl7.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
            composerM10870constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
            composerM10870constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
        }
        function3ModifierMaterializerOf7.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        Modifier modifierFillMaxWidth = SizeKt.fillMaxWidth(SizeKt.fillMaxHeight$default(companion5, 0.0f, 1, null), 0.5f);
        Alignment centerEnd2 = companion3.getCenterEnd();
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(centerEnd2, false, composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor8 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth);
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
        Updater.m10877setimpl(composerM10870constructorimpl8, measurePolicyRememberBoxMeasurePolicy5, companion4.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl8, currentCompositionLocalMap8, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash8 = companion4.getSetCompositeKeyHash();
        if (composerM10870constructorimpl8.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
            composerM10870constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
            composerM10870constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
        }
        function3ModifierMaterializerOf8.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        if (i2 == 1) {
            composer2 = composerStartRestartGroup;
            companion = companion5;
            modifier2 = modifier4;
            composer2.startReplaceableGroup(-671423597);
            GiftsPurchaseGiftKt.GiftsPurchaseGift(PaddingKt.m8127paddingqDBjuR0$default(companion, 0.0f, 0.0f, fDimensionResource8, 0.0f, 11, null), true, i3, false, 0, 0, 0, false, i6, i7, clickOpenStandardItem, onTurnBlockingLoadingClick, composer2, ((i8 >> 9) & 896) | 12610608 | (i11 & 234881024) | ((i9 << 27) & 1879048192), ((i9 >> 9) & 14) | ((i9 >> 18) & 112), 96);
            composer2.endReplaceableGroup();
            Unit unit = Unit.INSTANCE;
        } else if (i2 == 2) {
            composer2 = composerStartRestartGroup;
            companion = companion5;
            modifier2 = modifier4;
            composer2.startReplaceableGroup(-671422736);
            GiftsPurchaseGiftKt.GiftsPurchaseGift(PaddingKt.m8127paddingqDBjuR0$default(companion, 0.0f, 0.0f, fDimensionResource8, 0.0f, 11, null), true, i3, true, 0, 0, 0, true, i6, i7, clickOpenStandardItem, onTurnBlockingLoadingClick, composer2, ((i8 >> 9) & 896) | 12610608 | (i11 & 234881024) | ((i9 << 27) & 1879048192), ((i9 >> 9) & 14) | ((i9 >> 18) & 112), 96);
            composer2.endReplaceableGroup();
            Unit unit2 = Unit.INSTANCE;
        } else if (i2 == 3) {
            composerStartRestartGroup.startReplaceableGroup(-671421876);
            Modifier modifierM8127paddingqDBjuR0$default2 = PaddingKt.m8127paddingqDBjuR0$default(companion5, 0.0f, 0.0f, fDimensionResource8, 0.0f, 11, null);
            modifier2 = modifier4;
            composer2 = composerStartRestartGroup;
            companion = companion5;
            GiftsPurchaseGiftKt.GiftsPurchaseGift(modifierM8127paddingqDBjuR0$default2, false, i4, true, i4 == 0 ? 2 : 3, i5, i, true, i6, i7, clickOpenLegendaryItem, onTurnBlockingLoadingClick, composer2, (i12 & 458752) | ((i8 >> 12) & 896) | 12586032 | ((i8 << 15) & 3670016) | (i11 & 234881024) | ((i9 << 27) & 1879048192), ((i9 >> 12) & 14) | ((i9 >> 18) & 112), 0);
            composer2.endReplaceableGroup();
            Unit unit3 = Unit.INSTANCE;
        } else {
            composerStartRestartGroup.startReplaceableGroup(-671420752);
            composerStartRestartGroup.endReplaceableGroup();
            Unit unit4 = Unit.INSTANCE;
            composer2 = composerStartRestartGroup;
            companion = companion5;
            modifier2 = modifier4;
        }
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        Modifier.Companion companion7 = companion;
        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(SizeKt.fillMaxHeight$default(companion7, 0.0f, 1, null), 0.0f, 1, null);
        Alignment centerStart = companion3.getCenterStart();
        composer2.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy6 = BoxKt.rememberBoxMeasurePolicy(centerStart, false, composer2, 6);
        composer2.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap9 = composer2.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor9 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf9 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default2);
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
        Updater.m10877setimpl(composerM10870constructorimpl9, measurePolicyRememberBoxMeasurePolicy6, companion4.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl9, currentCompositionLocalMap9, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash9 = companion4.getSetCompositeKeyHash();
        if (composerM10870constructorimpl9.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
            composerM10870constructorimpl9.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash9));
            composerM10870constructorimpl9.apply(Integer.valueOf(currentCompositeKeyHash9), setCompositeKeyHash9);
        }
        function3ModifierMaterializerOf9.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
        composer2.startReplaceableGroup(2058660585);
        if (i2 == 1) {
            composer2.startReplaceableGroup(-671420375);
            GiftsPurchaseGiftKt.GiftsPurchaseGift(PaddingKt.m8127paddingqDBjuR0$default(companion7, fDimensionResource8, 0.0f, 0.0f, 0.0f, 14, null), false, i4, i4 == 0, 1, 0, 0, false, i6, i7, clickOpenLegendaryItem, onTurnBlockingLoadingClick, composer2, (i11 & 234881024) | ((i8 >> 12) & 896) | 12607536 | (1879048192 & (i9 << 27)), ((i9 >> 12) & 14) | ((i9 >> 18) & 112), 96);
            composer2.endReplaceableGroup();
            Unit unit5 = Unit.INSTANCE;
        } else if (i2 == 2) {
            composer2.startReplaceableGroup(-671419480);
            GiftsPreviewItemBlockKt.GiftsPreviewItemBlock(SizeKt.fillMaxWidth(PaddingKt.m8127paddingqDBjuR0$default(companion7, fDimensionResource9, 0.0f, 0.0f, 0.0f, 14, null), 0.8f), standardPrizes, composer2, 64, 0);
            composer2.endReplaceableGroup();
            Unit unit6 = Unit.INSTANCE;
        } else if (i2 == 3) {
            composer2.startReplaceableGroup(-671419053);
            GiftsPreviewItemBlockKt.GiftsPreviewItemBlock(SizeKt.fillMaxWidth(PaddingKt.m8127paddingqDBjuR0$default(companion7, fDimensionResource9, 0.0f, 0.0f, 0.0f, 14, null), 0.8f), legendaryPrizes, composer2, 64, 0);
            composer2.endReplaceableGroup();
            Unit unit7 = Unit.INSTANCE;
        } else {
            composer2.startReplaceableGroup(-671418698);
            composer2.endReplaceableGroup();
            Unit unit8 = Unit.INSTANCE;
        }
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier5 = modifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.gifts.GiftsPurchaseUiKt.GiftsPurchaseUiContent.2
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

                public final void invoke(@Nullable Composer composer3, int i13) {
                    GiftsPurchaseUiKt.GiftsPurchaseUiContent(modifier5, i, i2, standardPrizes, legendaryPrizes, i3, i4, i5, bitmap, i6, i7, clickPurchaseBC, clickCloseInterface, clickOpenStandardItem, clickOpenLegendaryItem, z, clickButtonBack, onTurnBlockingLoadingClick, composer3, RecomposeScopeImplKt.updateChangedFlags(i8 | 1), RecomposeScopeImplKt.updateChangedFlags(i9), i10);
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(device = "spec:width=390dp,height=844dp,dpi=420,isRound=false,chinSize=0dp,orientation=landscape", name = "Android large")
    public static final void PreviewGiftsPurchaseUi(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-735779015);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-735779015, i, -1, "com.blackhub.bronline.game.ui.gifts.PreviewGiftsPurchaseUi (GiftsPurchaseUi.kt:452)");
            }
            GiftsPurchaseUiContent(null, 999999, 1, CollectionsKt__CollectionsKt.listOf((Object[]) new GiftsPreviewItemModel[]{new GiftsPreviewItemModel(null, R.drawable.ic_gift_style_1, "name 1", 1, null), new GiftsPreviewItemModel(null, R.drawable.ic_gift_style_2, "name 2", 1, null), new GiftsPreviewItemModel(null, R.drawable.ic_gift_style_3, "name 3", 1, null), new GiftsPreviewItemModel(null, R.drawable.ic_gift_style_4, "name 3", 1, null), new GiftsPreviewItemModel(null, R.drawable.ic_gift_style_5, "name 3", 1, null), new GiftsPreviewItemModel(null, R.drawable.ic_gift_style_1, "name 3", 1, null), new GiftsPreviewItemModel(null, R.drawable.ic_gift_style_1, "name 3", 1, null), new GiftsPreviewItemModel(null, R.drawable.ic_gift_style_1, "name 3", 1, null)}), CollectionsKt__CollectionsKt.listOf((Object[]) new GiftsPreviewItemModel[]{new GiftsPreviewItemModel(null, R.drawable.ic_gift_style_1, "name 1", 1, null), new GiftsPreviewItemModel(null, R.drawable.ic_gift_style_2, "name 2", 1, null), new GiftsPreviewItemModel(null, R.drawable.ic_gift_style_3, "name 3", 1, null)}), 0, 10, 2000, null, R.drawable.ic_legendary_gift, R.drawable.ic_legendary_gift, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.gifts.GiftsPurchaseUiKt.PreviewGiftsPurchaseUi.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.gifts.GiftsPurchaseUiKt.PreviewGiftsPurchaseUi.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.game.ui.gifts.GiftsPurchaseUiKt.PreviewGiftsPurchaseUi.3
                public final void invoke(boolean z) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return Unit.INSTANCE;
                }
            }, new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.game.ui.gifts.GiftsPurchaseUiKt.PreviewGiftsPurchaseUi.4
                public final void invoke(boolean z) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return Unit.INSTANCE;
                }
            }, true, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.gifts.GiftsPurchaseUiKt.PreviewGiftsPurchaseUi.5
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.gifts.GiftsPurchaseUiKt.PreviewGiftsPurchaseUi.6
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 920359344, 14380470, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.gifts.GiftsPurchaseUiKt.PreviewGiftsPurchaseUi.7
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
                    GiftsPurchaseUiKt.PreviewGiftsPurchaseUi(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

