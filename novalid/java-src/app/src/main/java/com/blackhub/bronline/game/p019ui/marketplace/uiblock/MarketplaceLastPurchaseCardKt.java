package com.blackhub.bronline.game.p019ui.marketplace.uiblock;

import android.graphics.Bitmap;
import androidx.annotation.DimenRes;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p003ui.graphics.GraphicsLayerScope;
import androidx.compose.p003ui.graphics.painter.Painter;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PainterResources_androidKt;
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
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import com.blackhub.bronline.game.GameRender;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.gui.marketplace.enums.MarketplaceHistoryStatusEnum;
import com.blackhub.bronline.game.gui.marketplace.enums.MarketplaceRarityEnum;
import com.blackhub.bronline.game.gui.marketplace.model.MarketplaceProduct;
import com.blackhub.bronline.game.p019ui.widget.utils.ImageBitmapKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
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
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MarketplaceLastPurchaseCard.kt */
@Metadata(m7104d1 = {"\u0000(\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\u001aY\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00012\b\b\u0003\u0010\u0007\u001a\u00020\u00012\b\b\u0003\u0010\b\u001a\u00020\u00012\b\b\u0003\u0010\t\u001a\u00020\u00012\b\b\u0003\u0010\n\u001a\u00020\u00012\b\b\u0003\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000e\u001a\r\u0010\u000f\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0010\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011²\u0006\f\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u008a\u008e\u0002²\u0006\n\u0010\u0014\u001a\u00020\u0015X\u008a\u0084\u0002"}, m7105d2 = {"DURATION", "", "MarketplaceLastPurchaseCard", "", "modifier", "Landroidx/compose/ui/Modifier;", "innerBoxWidth", "textSize", "textWidth", "textPadding", "iconSize", "iconPadding", "marketplaceProduct", "Lcom/blackhub/bronline/game/gui/marketplace/model/MarketplaceProduct;", "(Landroidx/compose/ui/Modifier;IIIIIILcom/blackhub/bronline/game/gui/marketplace/model/MarketplaceProduct;Landroidx/compose/runtime/Composer;II)V", "MarketplaceLastPurchaseCardPreview", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease", "productImage", "Landroid/graphics/Bitmap;", "alphaAnim", ""}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nMarketplaceLastPurchaseCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketplaceLastPurchaseCard.kt\ncom/blackhub/bronline/game/ui/marketplace/uiblock/MarketplaceLastPurchaseCardKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,197:1\n1116#2,6:198\n1116#2,6:318\n67#3,7:204\n74#3:239\n69#3,5:240\n74#3:273\n69#3,5:274\n74#3:307\n78#3:312\n78#3:317\n78#3:328\n79#4,11:211\n79#4,11:245\n79#4,11:279\n92#4:311\n92#4:316\n92#4:327\n456#5,8:222\n464#5,3:236\n456#5,8:256\n464#5,3:270\n456#5,8:290\n464#5,3:304\n467#5,3:308\n467#5,3:313\n467#5,3:324\n3737#6,6:230\n3737#6,6:264\n3737#6,6:298\n81#7:329\n107#7,2:330\n81#7:332\n*S KotlinDebug\n*F\n+ 1 MarketplaceLastPurchaseCard.kt\ncom/blackhub/bronline/game/ui/marketplace/uiblock/MarketplaceLastPurchaseCardKt\n*L\n64#1:198,6\n168#1:318,6\n109#1:204,7\n109#1:239\n110#1:240,5\n110#1:273\n118#1:274,5\n118#1:307\n118#1:312\n110#1:317\n109#1:328\n109#1:211,11\n110#1:245,11\n118#1:279,11\n118#1:311\n110#1:316\n109#1:327\n109#1:222,8\n109#1:236,3\n110#1:256,8\n110#1:270,3\n118#1:290,8\n118#1:304,3\n118#1:308,3\n110#1:313,3\n109#1:324,3\n109#1:230,6\n110#1:264,6\n118#1:298,6\n64#1:329\n64#1:330,2\n100#1:332\n*E\n"})
/* loaded from: classes3.dex */
public final class MarketplaceLastPurchaseCardKt {
    public static final int DURATION = 400;

    public static final /* synthetic */ void access$MarketplaceLastPurchaseCard$lambda$2(MutableState mutableState, Bitmap bitmap) {
        mutableState.setValue(bitmap);
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void MarketplaceLastPurchaseCard(@NotNull final Modifier modifier, @DimenRes final int i, @DimenRes int i2, @DimenRes int i3, @DimenRes int i4, @DimenRes int i5, @DimenRes int i6, @NotNull final MarketplaceProduct marketplaceProduct, @Nullable Composer composer, final int i7, final int i8) {
        final int i9;
        int i10;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(marketplaceProduct, "marketplaceProduct");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1286821319);
        final int i11 = (i8 & 4) != 0 ? R.dimen._15wsp : i2;
        final int i12 = (i8 & 8) != 0 ? R.dimen._195wdp : i3;
        final int i13 = (i8 & 16) != 0 ? R.dimen._75wdp : i4;
        int i14 = (i8 & 32) != 0 ? R.dimen._18wdp : i5;
        int i15 = (i8 & 64) != 0 ? R.dimen._20wdp : i6;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1286821319, i7, -1, "com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceLastPurchaseCard (MarketplaceLastPurchaseCard.kt:62)");
        }
        composerStartRestartGroup.startReplaceableGroup(-1325984432);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        MutableState mutableState = (MutableState) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(marketplaceProduct.getName(), new C59071(marketplaceProduct, mutableState, null), composerStartRestartGroup, 64);
        Brush.Companion companion2 = Brush.INSTANCE;
        Brush brushM11297verticalGradient8A3gB4$default = Brush.Companion.m11297verticalGradient8A3gB4$default(companion2, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.total_black, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(marketplaceProduct.getBgColor(), composerStartRestartGroup, 0))}), 0.0f, 0.0f, 0, 14, (Object) null);
        Brush brushM11289horizontalGradient8A3gB4$default = Brush.Companion.m11289horizontalGradient8A3gB4$default(companion2, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.transparent, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(marketplaceProduct.getBorderColorForLastPurchaseCardBorder(), composerStartRestartGroup, 0))}), 0.0f, 0.0f, 0, 14, (Object) null);
        RoundedCornerShape roundedCornerShapeM8394RoundedCornerShapea9UjIt4$default = RoundedCornerShapeKt.m8394RoundedCornerShapea9UjIt4$default(0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._6wdp, composerStartRestartGroup, 6), 0.0f, 0.0f, 13, null);
        int i16 = i14;
        final State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(marketplaceProduct.isSelected() ? 1.0f : 0.0f, AnimationSpecKt.tween$default(400, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, composerStartRestartGroup, 0, 20);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Modifier.Companion companion3 = Modifier.INSTANCE;
        Alignment.Companion companion4 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion5.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion3);
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
        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion5.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        int i17 = i15;
        Modifier modifierM7770backgroundbw27NRU = BackgroundKt.m7770backgroundbw27NRU(modifier, ColorResources_androidKt.colorResource(R.color.total_black_50, composerStartRestartGroup, 6), roundedCornerShapeM8394RoundedCornerShapea9UjIt4$default);
        Alignment centerStart = companion4.getCenterStart();
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(centerStart, false, composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM7770backgroundbw27NRU);
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
        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion5.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
        if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        Modifier modifierM7782borderxT4_qwU = BorderKt.m7782borderxT4_qwU(BackgroundKt.background$default(SizeKt.m8177width3ABfNKs(SizeKt.fillMaxHeight$default(companion3, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(i, composerStartRestartGroup, (i7 >> 3) & 14)), brushM11297verticalGradient8A3gB4$default, RoundedCornerShapeKt.m8394RoundedCornerShapea9UjIt4$default(0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._6wdp, composerStartRestartGroup, 6), 0.0f, 0.0f, 13, null), 0.0f, 4, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composerStartRestartGroup, 6), ColorResources_androidKt.colorResource(marketplaceProduct.getBgBorderColor(), composerStartRestartGroup, 0), roundedCornerShapeM8394RoundedCornerShapea9UjIt4$default);
        Alignment center = companion4.getCenter();
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM7782borderxT4_qwU);
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
        Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy3, companion5.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
        if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
        }
        function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        ImageBitmapKt.m15118ImageBitmapAy9G7rc(MarketplaceLastPurchaseCard$lambda$1(mutableState), null, null, ContentScale.INSTANCE.getInside(), 0.0f, null, 0, composerStartRestartGroup, 3080, 118);
        ComposeExtensionKt.IfTrue(Boolean.valueOf(marketplaceProduct.isShiningIconNeed()), ComposableSingletons$MarketplaceLastPurchaseCardKt.INSTANCE.m15004getLambda1$app_siteRelease(), composerStartRestartGroup, 48);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        TextKt.m10024Text4IGK_g(marketplaceProduct.getName(), SizeKt.m8177width3ABfNKs(PaddingKt.m8127paddingqDBjuR0$default(companion3, PrimitiveResources_androidKt.dimensionResource(i13, composerStartRestartGroup, (i7 >> 12) & 14), 0.0f, 0.0f, 0.0f, 14, null), PrimitiveResources_androidKt.dimensionResource(i12, composerStartRestartGroup, (i7 >> 9) & 14)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14862montserratSemiBoldCustomSpcv9FZhg(i11, 0L, 0, 0L, 0.0f, null, composerStartRestartGroup, ((i7 >> 6) & 14) | 1572864, 62), composerStartRestartGroup, 0, 0, 65532);
        Integer historyCardIcon = marketplaceProduct.getHistoryCardIcon();
        composerStartRestartGroup.startReplaceableGroup(-1218810155);
        if (historyCardIcon == null) {
            i10 = i16;
            i9 = i17;
        } else {
            Painter painterPainterResource = PainterResources_androidKt.painterResource(historyCardIcon.intValue(), composerStartRestartGroup, 0);
            i9 = i17;
            Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(boxScopeInstance.align(PaddingKt.m8127paddingqDBjuR0$default(companion3, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(i9, composerStartRestartGroup, (i7 >> 18) & 14), 0.0f, 11, null), companion4.getCenterEnd()), PrimitiveResources_androidKt.dimensionResource(i16, composerStartRestartGroup, (i7 >> 15) & 14));
            i10 = i16;
            ImageKt.Image(painterPainterResource, (String) null, modifierM8172size3ABfNKs, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
            Unit unit = Unit.INSTANCE;
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-1218809655);
        boolean zChanged = composerStartRestartGroup.changed(stateAnimateFloatAsState);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function1<GraphicsLayerScope, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceLastPurchaseCardKt$MarketplaceLastPurchaseCard$2$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                    invoke2(graphicsLayerScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull GraphicsLayerScope graphicsLayer) {
                    Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
                    graphicsLayer.setAlpha(MarketplaceLastPurchaseCardKt.MarketplaceLastPurchaseCard$lambda$3(stateAnimateFloatAsState));
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        BoxKt.Box(BorderKt.m7784borderziNgDLE(SizeKt.fillMaxSize$default(GraphicsLayerModifierKt.graphicsLayer(modifier, (Function1) objRememberedValue2), 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composerStartRestartGroup, 6), brushM11289horizontalGradient8A3gB4$default, roundedCornerShapeM8394RoundedCornerShapea9UjIt4$default), composerStartRestartGroup, 0);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i18 = i10;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceLastPurchaseCardKt.MarketplaceLastPurchaseCard.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i19) {
                    MarketplaceLastPurchaseCardKt.MarketplaceLastPurchaseCard(modifier, i, i11, i12, i13, i18, i9, marketplaceProduct, composer2, RecomposeScopeImplKt.updateChangedFlags(i7 | 1), i8);
                }
            });
        }
    }

    /* compiled from: MarketplaceLastPurchaseCard.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceLastPurchaseCardKt$MarketplaceLastPurchaseCard$1", m7120f = "MarketplaceLastPurchaseCard.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceLastPurchaseCardKt$MarketplaceLastPurchaseCard$1 */
    /* loaded from: classes7.dex */
    public static final class C59071 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ MarketplaceProduct $marketplaceProduct;
        public final /* synthetic */ MutableState<Bitmap> $productImage$delegate;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C59071(MarketplaceProduct marketplaceProduct, MutableState<Bitmap> mutableState, Continuation<? super C59071> continuation) {
            super(2, continuation);
            this.$marketplaceProduct = marketplaceProduct;
            this.$productImage$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C59071(this.$marketplaceProduct, this.$productImage$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C59071) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                if (AnyExtensionKt.isNotNull(MarketplaceLastPurchaseCardKt.MarketplaceLastPurchaseCard$lambda$1(this.$productImage$delegate))) {
                    MarketplaceLastPurchaseCardKt.MarketplaceLastPurchaseCard$lambda$2(this.$productImage$delegate, null);
                }
                GameRender gameRender = GameRender.getInstance();
                int type = this.$marketplaceProduct.getRenderInfo().getType();
                int modelId = this.$marketplaceProduct.getRenderInfo().getModelId();
                int modelId2 = this.$marketplaceProduct.getRenderInfo().getModelId();
                int color = this.$marketplaceProduct.getRenderInfo().getColor();
                int color2 = this.$marketplaceProduct.getRenderInfo().getColor();
                Float rotationX = this.$marketplaceProduct.getRenderInfo().getRotationX();
                float fFloatValue = rotationX != null ? rotationX.floatValue() : 20.0f;
                Float rotationY = this.$marketplaceProduct.getRenderInfo().getRotationY();
                float fFloatValue2 = rotationY != null ? rotationY.floatValue() : 180.0f;
                Float rotationZ = this.$marketplaceProduct.getRenderInfo().getRotationZ();
                float fFloatValue3 = rotationZ != null ? rotationZ.floatValue() : 45.0f;
                float zoom = this.$marketplaceProduct.getRenderInfo().getZoom();
                final MutableState<Bitmap> mutableState = this.$productImage$delegate;
                gameRender.RequestRender(type, modelId, modelId2, color, color2, fFloatValue, fFloatValue2, fFloatValue3, zoom, new GameRender.GameRenderListener() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceLastPurchaseCardKt$MarketplaceLastPurchaseCard$1$$ExternalSyntheticLambda0
                    @Override // com.blackhub.bronline.game.GameRender.GameRenderListener
                    public final void OnRenderComplete(int i, Bitmap bitmap) {
                        MarketplaceLastPurchaseCardKt.access$MarketplaceLastPurchaseCard$lambda$2(mutableState, bitmap);
                    }
                });
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void MarketplaceLastPurchaseCardPreview(@Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(2144900088);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2144900088, i, -1, "com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceLastPurchaseCardPreview (MarketplaceLastPurchaseCard.kt:182)");
            }
            MarketplaceLastPurchaseCard(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._316wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._62wdp, composerStartRestartGroup, 6)), R.dimen._62wdp, 0, 0, 0, 0, 0, new MarketplaceProduct(false, "Маска из мешковины", null, MarketplaceRarityEnum.LEGENDARY, null, 0, null, 0, 0, 0, 0, 0L, 0, null, null, null, 0.0d, 0, MarketplaceHistoryStatusEnum.PURCHASED, true, false, false, false, null, 15990773, null), composerStartRestartGroup, 16777264, 124);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceLastPurchaseCardKt.MarketplaceLastPurchaseCardPreview.1
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
                    MarketplaceLastPurchaseCardKt.MarketplaceLastPurchaseCardPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final Bitmap MarketplaceLastPurchaseCard$lambda$1(MutableState<Bitmap> mutableState) {
        return mutableState.getValue();
    }

    public static final void MarketplaceLastPurchaseCard$lambda$2(MutableState<Bitmap> mutableState, Bitmap bitmap) {
        mutableState.setValue(bitmap);
    }

    public static final float MarketplaceLastPurchaseCard$lambda$3(State<Float> state) {
        return state.getValue().floatValue();
    }
}
