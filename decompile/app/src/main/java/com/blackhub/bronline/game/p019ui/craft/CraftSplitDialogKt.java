package com.blackhub.bronline.game.p019ui.craft;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
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
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.AlphaKt;
import androidx.compose.p003ui.draw.ClipKt;
import androidx.compose.p003ui.graphics.Brush;
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
import androidx.compose.p003ui.text.TextStyle;
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
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.blackhub.bronline.game.core.constants.resources.PngConstantsId49;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.p019ui.widget.block.ClickAnimateBlockKt;
import com.blackhub.bronline.game.p019ui.widget.button.MainButtonFillWithNarrowOvalGradientKt;
import com.blackhub.bronline.game.p019ui.widget.utils.ImageBitmapKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CraftSplitDialog.kt */
@Metadata(m7104d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a3\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0007¢\u0006\u0002\u0010\t\u001a\r\u0010\n\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u000b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m7105d2 = {"LOGO_ALPHA", "", "CraftSplitDialog", "", "bgImage", "Landroid/graphics/Bitmap;", "onCloseSplitClick", "Lkotlin/Function0;", "onBuyVipClick", "(Landroid/graphics/Bitmap;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "CraftSplitDialogPreview", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nCraftSplitDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CraftSplitDialog.kt\ncom/blackhub/bronline/game/ui/craft/CraftSplitDialogKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,265:1\n74#2:266\n1116#3,6:267\n1116#3,6:273\n*S KotlinDebug\n*F\n+ 1 CraftSplitDialog.kt\ncom/blackhub/bronline/game/ui/craft/CraftSplitDialogKt\n*L\n57#1:266\n97#1:267,6\n104#1:273,6\n*E\n"})
/* loaded from: classes2.dex */
public final class CraftSplitDialogKt {
    public static final float LOGO_ALPHA = 0.05f;

    /* compiled from: CraftSplitDialog.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.craft.CraftSplitDialogKt$CraftSplitDialog$2 */
    /* loaded from: classes.dex */
    public static final class C54562 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Bitmap $bgImage;
        public final /* synthetic */ Function0<Unit> $onBuyVipClick;
        public final /* synthetic */ Function0<Unit> $onCloseSplitClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C54562(Bitmap bitmap, Function0<Unit> function0, Function0<Unit> function02, int i) {
            super(2);
            bitmap = bitmap;
            function0 = function0;
            function0 = function02;
            i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            CraftSplitDialogKt.CraftSplitDialog(bitmap, function0, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    /* compiled from: CraftSplitDialog.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.craft.CraftSplitDialogKt$CraftSplitDialogPreview$3 */
    /* loaded from: classes.dex */
    public static final class C54593 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C54593(int i) {
            super(2);
            i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            CraftSplitDialogKt.CraftSplitDialogPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void CraftSplitDialog(@Nullable Bitmap bitmap, @NotNull Function0<Unit> onCloseSplitClick, @NotNull Function0<Unit> onBuyVipClick, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(onCloseSplitClick, "onCloseSplitClick");
        Intrinsics.checkNotNullParameter(onBuyVipClick, "onBuyVipClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1820875059);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1820875059, i, -1, "com.blackhub.bronline.game.ui.craft.CraftSplitDialog (CraftSplitDialog.kt:54)");
        }
        Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        BorderStroke borderStrokeM7798BorderStrokecXLIe8U = BorderStrokeKt.m7798BorderStrokecXLIe8U(PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composerStartRestartGroup, 6), ColorResources_androidKt.colorResource(R.color.darker_gray_blue, composerStartRestartGroup, 6));
        RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composerStartRestartGroup, 6));
        Brush.Companion companion = Brush.INSTANCE;
        Brush brushM11289horizontalGradient8A3gB4$default = Brush.Companion.m11289horizontalGradient8A3gB4$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.total_black_90, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.total_black, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
        Brush brushM11289horizontalGradient8A3gB4$default2 = Brush.Companion.m11289horizontalGradient8A3gB4$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.total_black, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.total_black_90, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
        RoundedCornerShape roundedCornerShapeM8394RoundedCornerShapea9UjIt4$default = RoundedCornerShapeKt.m8394RoundedCornerShapea9UjIt4$default(0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composerStartRestartGroup, 6), 0.0f, 9, null);
        RoundedCornerShape roundedCornerShapeM8394RoundedCornerShapea9UjIt4$default2 = RoundedCornerShapeKt.m8394RoundedCornerShapea9UjIt4$default(PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composerStartRestartGroup, 6), 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composerStartRestartGroup, 6), 6, null);
        Brush brushM11289horizontalGradient8A3gB4$default3 = Brush.Companion.m11289horizontalGradient8A3gB4$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black_gray_blue, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black_20, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
        Brush brushM11289horizontalGradient8A3gB4$default4 = Brush.Companion.m11289horizontalGradient8A3gB4$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.red_15, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.red, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
        composerStartRestartGroup.startReplaceableGroup(160026394);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion2 = Composer.INSTANCE;
        if (objRememberedValue == companion2.getEmpty()) {
            objRememberedValue = BitmapUtilsKt.getBitmapFromZip$default(context, PngConstantsId49.IMG_CRAFT_BANNER_VIP_LEFT, ImageTypePathInCDNEnum.IMAGE, 0.0f, 0.0f, 24, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        Bitmap bitmap2 = (Bitmap) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(160026604);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == companion2.getEmpty()) {
            objRememberedValue2 = BitmapUtilsKt.getBitmapFromZip$default(context, PngConstantsId49.IMG_CRAFT_BANNER_VIP_RIGHT, ImageTypePathInCDNEnum.IMAGE, 0.0f, 0.0f, 24, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        SurfaceKt.m9876SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, ColorResources_androidKt.colorResource(R.color.total_black_90, composerStartRestartGroup, 6), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1156955086, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftSplitDialogKt.CraftSplitDialog.1
            public final /* synthetic */ Bitmap $bgImage;
            public final /* synthetic */ Brush $brushForLeftRow;
            public final /* synthetic */ Brush $brushForRightRow;
            public final /* synthetic */ Brush $brushForTitleLeftBlock;
            public final /* synthetic */ Brush $brushForTitleRightBlock;
            public final /* synthetic */ Bitmap $leftBitmap;
            public final /* synthetic */ Function0<Unit> $onBuyVipClick;
            public final /* synthetic */ Function0<Unit> $onCloseSplitClick;
            public final /* synthetic */ Bitmap $rightBitmap;
            public final /* synthetic */ RoundedCornerShape $shape;
            public final /* synthetic */ RoundedCornerShape $shapeForLeftRow;
            public final /* synthetic */ RoundedCornerShape $shapeForRightRow;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C54551(RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_42, Bitmap bitmap3, Function0<Unit> onCloseSplitClick2, Function0<Unit> onBuyVipClick2, RoundedCornerShape roundedCornerShapeM8394RoundedCornerShapea9UjIt4$default3, Brush brushM11289horizontalGradient8A3gB4$default5, RoundedCornerShape roundedCornerShapeM8394RoundedCornerShapea9UjIt4$default22, Brush brushM11289horizontalGradient8A3gB4$default22, Brush brushM11289horizontalGradient8A3gB4$default32, Bitmap bitmap22, Brush brushM11289horizontalGradient8A3gB4$default42, Bitmap bitmap4) {
                super(2);
                roundedCornerShape = roundedCornerShapeM8392RoundedCornerShape0680j_42;
                bitmap = bitmap3;
                function0 = onCloseSplitClick2;
                function0 = onBuyVipClick2;
                roundedCornerShape = roundedCornerShapeM8394RoundedCornerShapea9UjIt4$default3;
                brush = brushM11289horizontalGradient8A3gB4$default5;
                roundedCornerShape = roundedCornerShapeM8394RoundedCornerShapea9UjIt4$default22;
                brush = brushM11289horizontalGradient8A3gB4$default22;
                brush = brushM11289horizontalGradient8A3gB4$default32;
                bitmap = bitmap22;
                brush = brushM11289horizontalGradient8A3gB4$default42;
                bitmap = bitmap4;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@Nullable Composer composer2, int i2) {
                if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1156955086, i2, -1, "com.blackhub.bronline.game.ui.craft.CraftSplitDialog.<anonymous> (CraftSplitDialog.kt:112)");
                    }
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
                    Alignment.Companion companion4 = Alignment.INSTANCE;
                    Alignment center = companion4.getCenter();
                    BorderStroke borderStroke = borderStroke;
                    RoundedCornerShape roundedCornerShape = roundedCornerShape;
                    Bitmap bitmap3 = bitmap;
                    final Function0<Unit> function0 = function0;
                    final Function0<Unit> function02 = function0;
                    RoundedCornerShape roundedCornerShape2 = roundedCornerShape;
                    Brush brush = brush;
                    RoundedCornerShape roundedCornerShape3 = roundedCornerShape;
                    Brush brush2 = brush;
                    Brush brush3 = brush;
                    Bitmap bitmap4 = bitmap;
                    Brush brush4 = brush;
                    Bitmap bitmap5 = bitmap;
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion5.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
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
                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion5.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier modifierClip = ClipKt.clip(BorderKt.border(SizeKt.m8161requiredHeight3ABfNKs(SizeKt.m8169requiredWidth3ABfNKs(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._784wdp, composer2, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._373wdp, composer2, 6)), borderStroke, roundedCornerShape), roundedCornerShape);
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierClip);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion5.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ImageBitmapKt.m15118ImageBitmapAy9G7rc(bitmap3, SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, composer2, 3128, 116);
                    Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(boxScopeInstance.align(companion3, companion4.getTopCenter()), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer2, 6), 0.0f, 0.0f, 13, null);
                    String strStringResource = StringResources_androidKt.stringResource(R.string.craft_split_increase_your_chance, composer2, 6);
                    Locale locale = Locale.ROOT;
                    String upperCase = strStringResource.toUpperCase(locale);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
                    TextStyle textStyleM14811montserratBoldCustomSpIzzofJo = typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._24wsp, 0L, 0, 0L, 0.0f, null, null, composer2, 12582918, 126);
                    FontStyle.Companion companion6 = FontStyle.INSTANCE;
                    TextKt.m10024Text4IGK_g(upperCase, modifierM8127paddingqDBjuR0$default, 0L, 0L, FontStyle.m13271boximpl(companion6.m13280getItalic_LCdwA()), (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleM14811montserratBoldCustomSpIzzofJo, composer2, 0, 0, 65516);
                    Modifier modifierM8127paddingqDBjuR0$default2 = PaddingKt.m8127paddingqDBjuR0$default(boxScopeInstance.align(SizeKt.m8172size3ABfNKs(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._33wdp, composer2, 6)), companion4.getTopEnd()), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer2, 6), 0.0f, 9, null);
                    composer2.startReplaceableGroup(1020067754);
                    boolean zChanged = composer2.changed(function0);
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftSplitDialogKt$CraftSplitDialog$1$1$1$1$1
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
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    composer2.endReplaceableGroup();
                    ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierM8127paddingqDBjuR0$default2, null, false, null, false, false, false, false, null, 0, 0L, null, (Function0) objRememberedValue3, ComposableSingletons$CraftSplitDialogKt.INSTANCE.m14961getLambda1$app_siteRelease(), composer2, 0, 3072, 4094);
                    Modifier modifierAlign = boxScopeInstance.align(SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._274wdp, composer2, 6)), companion4.getCenter());
                    Alignment.Vertical centerVertically = companion4.getCenterVertically();
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
                    composer2.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer2, 54);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierAlign);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor3);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRowMeasurePolicy, companion5.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    Modifier modifierM8177width3ABfNKs = SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(BackgroundKt.background$default(ClipKt.clip(companion3, roundedCornerShape2), brush, roundedCornerShape2, 0.0f, 4, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._230wdp, composer2, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._284wdp, composer2, 6));
                    Arrangement.HorizontalOrVertical spaceBetween2 = arrangement.getSpaceBetween();
                    Alignment.Horizontal centerHorizontally = companion4.getCenterHorizontally();
                    composer2.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(spaceBetween2, centerHorizontally, composer2, 54);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor4 = companion5.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM8177width3ABfNKs);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor4);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion5.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion5.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(BackgroundKt.background$default(companion3, brush3, null, 0.0f, 6, null), 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._43wdp, composer2, 6));
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor5 = companion5.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierM8158height3ABfNKs);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor5);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM10870constructorimpl5 = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl5, measurePolicyRememberBoxMeasurePolicy3, companion5.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl5, currentCompositionLocalMap5, companion5.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion5.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                        composerM10870constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                        composerM10870constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                    }
                    function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    Modifier modifierAlign2 = boxScopeInstance.align(companion3, companion4.getCenter());
                    String upperCase2 = StringResources_androidKt.stringResource(R.string.craft_split_without_platinum_vip, composer2, 6).toUpperCase(locale);
                    Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                    TextKt.m10024Text4IGK_g(upperCase2, modifierAlign2, 0L, 0L, FontStyle.m13271boximpl(companion6.m13280getItalic_LCdwA()), (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._16wsp, 0L, 0, 0L, 0.0f, null, null, composer2, 12582918, 126), composer2, 0, 0, 65516);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
                    Alignment center2 = companion4.getCenter();
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(center2, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor6 = companion5.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default2);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor6);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM10870constructorimpl6 = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl6, measurePolicyRememberBoxMeasurePolicy4, companion5.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl6, currentCompositionLocalMap6, companion5.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion5.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                        composerM10870constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                        composerM10870constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                    }
                    function3ModifierMaterializerOf6.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ImageBitmapKt.m15118ImageBitmapAy9G7rc(bitmap4, SizeKt.m8158height3ABfNKs(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._120wdp, composer2, 6)), null, null, 0.0f, null, 0, composer2, 8, 124);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    Modifier modifierM8177width3ABfNKs2 = SizeKt.m8177width3ABfNKs(SizeKt.fillMaxHeight$default(BackgroundKt.background$default(ClipKt.clip(companion3, roundedCornerShape3), brush2, roundedCornerShape3, 0.0f, 4, null), 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._450wdp, composer2, 6));
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap7 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor7 = companion5.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierM8177width3ABfNKs2);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor7);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM10870constructorimpl7 = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl7, measurePolicyRememberBoxMeasurePolicy5, companion5.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl7, currentCompositionLocalMap7, companion5.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = companion5.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl7.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                        composerM10870constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                        composerM10870constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                    }
                    function3ModifierMaterializerOf7.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_br_logo, composer2, 6), (String) null, AlphaKt.alpha(SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), 0.05f), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 440, 120);
                    Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
                    Arrangement.HorizontalOrVertical spaceBetween3 = arrangement.getSpaceBetween();
                    Alignment.Horizontal centerHorizontally2 = companion4.getCenterHorizontally();
                    composer2.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(spaceBetween3, centerHorizontally2, composer2, 54);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap8 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor8 = companion5.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default3);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor8);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM10870constructorimpl8 = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl8, measurePolicyColumnMeasurePolicy2, companion5.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl8, currentCompositionLocalMap8, companion5.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash8 = companion5.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl8.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                        composerM10870constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
                        composerM10870constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
                    }
                    function3ModifierMaterializerOf8.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    Modifier modifierBackground$default = BackgroundKt.background$default(SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._50wdp, composer2, 6)), brush4, null, 0.0f, 6, null);
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy6 = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap9 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor9 = companion5.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf9 = LayoutKt.modifierMaterializerOf(modifierBackground$default);
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
                    Updater.m10877setimpl(composerM10870constructorimpl9, measurePolicyRememberBoxMeasurePolicy6, companion5.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl9, currentCompositionLocalMap9, companion5.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash9 = companion5.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl9.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
                        composerM10870constructorimpl9.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash9));
                        composerM10870constructorimpl9.apply(Integer.valueOf(currentCompositeKeyHash9), setCompositeKeyHash9);
                    }
                    function3ModifierMaterializerOf9.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    Modifier modifierAlign3 = boxScopeInstance.align(companion3, companion4.getCenter());
                    String upperCase3 = StringResources_androidKt.stringResource(R.string.craft_split_with_platinum_vip, composer2, 6).toUpperCase(locale);
                    Intrinsics.checkNotNullExpressionValue(upperCase3, "toUpperCase(...)");
                    TextKt.m10024Text4IGK_g(upperCase3, modifierAlign3, 0L, 0L, FontStyle.m13271boximpl(companion6.m13280getItalic_LCdwA()), (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._25wsp, 0L, 0, 0L, 0.0f, null, null, composer2, 12582918, 126), composer2, 0, 0, 65516);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    ImageBitmapKt.m15118ImageBitmapAy9G7rc(bitmap5, SizeKt.m8158height3ABfNKs(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._144wdp, composer2, 6)), null, null, 0.0f, null, 0, composer2, 8, 124);
                    TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.craft_split_increase_your_chances, composer2, 6), PaddingKt.m8127paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._26wdp, composer2, 6), 7, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14843montserratMediumCustomSpbl3sdaw(R.dimen._15wsp, 0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, composer2, 196614, 26), composer2, 0, 0, 65532);
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
                    Modifier modifierM8127paddingqDBjuR0$default3 = PaddingKt.m8127paddingqDBjuR0$default(boxScopeInstance.align(SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._62wdp, composer2, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._173wdp, composer2, 6)), companion4.getBottomCenter()), 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._12wdp, composer2, 6), 7, null);
                    String strStringResource2 = StringResources_androidKt.stringResource(R.string.common_buy, composer2, 6);
                    TextStyle textStyleM14811montserratBoldCustomSpIzzofJo2 = typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._23wdp, 0L, 0, 0L, 0.0f, null, null, composer2, 12582918, 126);
                    long jColorResource = ColorResources_androidKt.colorResource(R.color.red, composer2, 6);
                    composer2.startReplaceableGroup(1020073535);
                    boolean zChanged2 = composer2.changed(function02);
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftSplitDialogKt$CraftSplitDialog$1$1$1$3$1
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
                                function02.invoke();
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    composer2.endReplaceableGroup();
                    MainButtonFillWithNarrowOvalGradientKt.m15076MainButtonFillWithNarrowOvalGradientOKqFZno(modifierM8127paddingqDBjuR0$default3, strStringResource2, textStyleM14811montserratBoldCustomSpIzzofJo2, 0L, jColorResource, 0.0f, false, false, false, false, (Function0) objRememberedValue4, composer2, 0, 0, 1000);
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
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, 12582918, 122);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftSplitDialogKt.CraftSplitDialog.2
                public final /* synthetic */ int $$changed;
                public final /* synthetic */ Bitmap $bgImage;
                public final /* synthetic */ Function0<Unit> $onBuyVipClick;
                public final /* synthetic */ Function0<Unit> $onCloseSplitClick;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C54562(Bitmap bitmap3, Function0<Unit> onCloseSplitClick2, Function0<Unit> onBuyVipClick2, int i2) {
                    super(2);
                    bitmap = bitmap3;
                    function0 = onCloseSplitClick2;
                    function0 = onBuyVipClick2;
                    i = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) {
                    CraftSplitDialogKt.CraftSplitDialog(bitmap, function0, function0, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* compiled from: CraftSplitDialog.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nCraftSplitDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CraftSplitDialog.kt\ncom/blackhub/bronline/game/ui/craft/CraftSplitDialogKt$CraftSplitDialog$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,265:1\n69#2,5:266\n74#2:299\n68#2,6:300\n74#2:334\n68#2,6:403\n74#2:437\n78#2:442\n69#2,5:443\n74#2:476\n78#2:481\n68#2,6:487\n74#2:521\n68#2,6:553\n74#2:587\n78#2:592\n78#2:602\n78#2:618\n78#2:623\n79#3,11:271\n79#3,11:306\n79#3,11:343\n79#3,11:374\n79#3,11:409\n92#3:441\n79#3,11:448\n92#3:480\n92#3:485\n79#3,11:493\n79#3,11:524\n79#3,11:559\n92#3:591\n92#3:596\n92#3:601\n92#3:606\n92#3:617\n92#3:622\n456#4,8:282\n464#4,3:296\n456#4,8:317\n464#4,3:331\n456#4,8:354\n464#4,3:368\n456#4,8:385\n464#4,3:399\n456#4,8:420\n464#4,3:434\n467#4,3:438\n456#4,8:459\n464#4,3:473\n467#4,3:477\n467#4,3:482\n456#4,8:504\n464#4,3:518\n456#4,8:535\n464#4,3:549\n456#4,8:570\n464#4,3:584\n467#4,3:588\n467#4,3:593\n467#4,3:598\n467#4,3:603\n467#4,3:614\n467#4,3:619\n3737#5,6:290\n3737#5,6:325\n3737#5,6:362\n3737#5,6:393\n3737#5,6:428\n3737#5,6:467\n3737#5,6:512\n3737#5,6:543\n3737#5,6:578\n1116#6,6:335\n1116#6,6:608\n91#7,2:341\n93#7:371\n97#7:607\n78#8,2:372\n80#8:402\n84#8:486\n78#8,2:522\n80#8:552\n84#8:597\n*S KotlinDebug\n*F\n+ 1 CraftSplitDialog.kt\ncom/blackhub/bronline/game/ui/craft/CraftSplitDialogKt$CraftSplitDialog$1\n*L\n113#1:266,5\n113#1:299\n114#1:300,6\n114#1:334\n169#1:403,6\n169#1:437\n169#1:442\n183#1:443,5\n183#1:476\n183#1:481\n194#1:487,6\n194#1:521\n214#1:553,6\n214#1:587\n214#1:592\n194#1:602\n114#1:618\n113#1:623\n113#1:271,11\n114#1:306,11\n152#1:343,11\n160#1:374,11\n169#1:409,11\n169#1:441\n183#1:448,11\n183#1:480\n160#1:485\n194#1:493,11\n208#1:524,11\n214#1:559,11\n214#1:591\n208#1:596\n194#1:601\n152#1:606\n114#1:617\n113#1:622\n113#1:282,8\n113#1:296,3\n114#1:317,8\n114#1:331,3\n152#1:354,8\n152#1:368,3\n160#1:385,8\n160#1:399,3\n169#1:420,8\n169#1:434,3\n169#1:438,3\n183#1:459,8\n183#1:473,3\n183#1:477,3\n160#1:482,3\n194#1:504,8\n194#1:518,3\n208#1:535,8\n208#1:549,3\n214#1:570,8\n214#1:584,3\n214#1:588,3\n208#1:593,3\n194#1:598,3\n152#1:603,3\n114#1:614,3\n113#1:619,3\n113#1:290,6\n114#1:325,6\n152#1:362,6\n160#1:393,6\n169#1:428,6\n183#1:467,6\n194#1:512,6\n208#1:543,6\n214#1:578,6\n143#1:335,6\n254#1:608,6\n152#1:341,2\n152#1:371\n152#1:607\n160#1:372,2\n160#1:402\n160#1:486\n208#1:522,2\n208#1:552\n208#1:597\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.ui.craft.CraftSplitDialogKt$CraftSplitDialog$1 */
    /* loaded from: classes.dex */
    public static final class C54551 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ Bitmap $bgImage;
        public final /* synthetic */ Brush $brushForLeftRow;
        public final /* synthetic */ Brush $brushForRightRow;
        public final /* synthetic */ Brush $brushForTitleLeftBlock;
        public final /* synthetic */ Brush $brushForTitleRightBlock;
        public final /* synthetic */ Bitmap $leftBitmap;
        public final /* synthetic */ Function0<Unit> $onBuyVipClick;
        public final /* synthetic */ Function0<Unit> $onCloseSplitClick;
        public final /* synthetic */ Bitmap $rightBitmap;
        public final /* synthetic */ RoundedCornerShape $shape;
        public final /* synthetic */ RoundedCornerShape $shapeForLeftRow;
        public final /* synthetic */ RoundedCornerShape $shapeForRightRow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C54551(RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_42, Bitmap bitmap3, Function0<Unit> onCloseSplitClick2, Function0<Unit> onBuyVipClick2, RoundedCornerShape roundedCornerShapeM8394RoundedCornerShapea9UjIt4$default3, Brush brushM11289horizontalGradient8A3gB4$default5, RoundedCornerShape roundedCornerShapeM8394RoundedCornerShapea9UjIt4$default22, Brush brushM11289horizontalGradient8A3gB4$default22, Brush brushM11289horizontalGradient8A3gB4$default32, Bitmap bitmap22, Brush brushM11289horizontalGradient8A3gB4$default42, Bitmap bitmap4) {
            super(2);
            roundedCornerShape = roundedCornerShapeM8392RoundedCornerShape0680j_42;
            bitmap = bitmap3;
            function0 = onCloseSplitClick2;
            function0 = onBuyVipClick2;
            roundedCornerShape = roundedCornerShapeM8394RoundedCornerShapea9UjIt4$default3;
            brush = brushM11289horizontalGradient8A3gB4$default5;
            roundedCornerShape = roundedCornerShapeM8394RoundedCornerShapea9UjIt4$default22;
            brush = brushM11289horizontalGradient8A3gB4$default22;
            brush = brushM11289horizontalGradient8A3gB4$default32;
            bitmap = bitmap22;
            brush = brushM11289horizontalGradient8A3gB4$default42;
            bitmap = bitmap4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
            invoke(composer2, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@Nullable Composer composer2, int i2) {
            if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1156955086, i2, -1, "com.blackhub.bronline.game.ui.craft.CraftSplitDialog.<anonymous> (CraftSplitDialog.kt:112)");
                }
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
                Alignment.Companion companion4 = Alignment.INSTANCE;
                Alignment center = companion4.getCenter();
                BorderStroke borderStroke = borderStroke;
                RoundedCornerShape roundedCornerShape = roundedCornerShape;
                Bitmap bitmap3 = bitmap;
                final Function0<Unit> function0 = function0;
                final Function0<Unit> function02 = function0;
                RoundedCornerShape roundedCornerShape2 = roundedCornerShape;
                Brush brush = brush;
                RoundedCornerShape roundedCornerShape3 = roundedCornerShape;
                Brush brush2 = brush;
                Brush brush3 = brush;
                Bitmap bitmap4 = bitmap;
                Brush brush4 = brush;
                Bitmap bitmap5 = bitmap;
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion5.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
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
                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion5.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier modifierClip = ClipKt.clip(BorderKt.border(SizeKt.m8161requiredHeight3ABfNKs(SizeKt.m8169requiredWidth3ABfNKs(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._784wdp, composer2, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._373wdp, composer2, 6)), borderStroke, roundedCornerShape), roundedCornerShape);
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, composer2, 0);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierClip);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer2);
                Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion5.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                ImageBitmapKt.m15118ImageBitmapAy9G7rc(bitmap3, SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, composer2, 3128, 116);
                Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(boxScopeInstance.align(companion3, companion4.getTopCenter()), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer2, 6), 0.0f, 0.0f, 13, null);
                String strStringResource = StringResources_androidKt.stringResource(R.string.craft_split_increase_your_chance, composer2, 6);
                Locale locale = Locale.ROOT;
                String upperCase = strStringResource.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
                TextStyle textStyleM14811montserratBoldCustomSpIzzofJo = typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._24wsp, 0L, 0, 0L, 0.0f, null, null, composer2, 12582918, 126);
                FontStyle.Companion companion6 = FontStyle.INSTANCE;
                TextKt.m10024Text4IGK_g(upperCase, modifierM8127paddingqDBjuR0$default, 0L, 0L, FontStyle.m13271boximpl(companion6.m13280getItalic_LCdwA()), (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleM14811montserratBoldCustomSpIzzofJo, composer2, 0, 0, 65516);
                Modifier modifierM8127paddingqDBjuR0$default2 = PaddingKt.m8127paddingqDBjuR0$default(boxScopeInstance.align(SizeKt.m8172size3ABfNKs(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._33wdp, composer2, 6)), companion4.getTopEnd()), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer2, 6), 0.0f, 9, null);
                composer2.startReplaceableGroup(1020067754);
                boolean zChanged = composer2.changed(function0);
                Object objRememberedValue3 = composer2.rememberedValue();
                if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftSplitDialogKt$CraftSplitDialog$1$1$1$1$1
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
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                composer2.endReplaceableGroup();
                ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierM8127paddingqDBjuR0$default2, null, false, null, false, false, false, false, null, 0, 0L, null, (Function0) objRememberedValue3, ComposableSingletons$CraftSplitDialogKt.INSTANCE.m14961getLambda1$app_siteRelease(), composer2, 0, 3072, 4094);
                Modifier modifierAlign = boxScopeInstance.align(SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._274wdp, composer2, 6)), companion4.getCenter());
                Alignment.Vertical centerVertically = companion4.getCenterVertically();
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
                composer2.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer2, 54);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierAlign);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor3);
                } else {
                    composer2.useNode();
                }
                Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composer2);
                Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRowMeasurePolicy, companion5.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
                if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                Modifier modifierM8177width3ABfNKs = SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(BackgroundKt.background$default(ClipKt.clip(companion3, roundedCornerShape2), brush, roundedCornerShape2, 0.0f, 4, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._230wdp, composer2, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._284wdp, composer2, 6));
                Arrangement.HorizontalOrVertical spaceBetween2 = arrangement.getSpaceBetween();
                Alignment.Horizontal centerHorizontally = companion4.getCenterHorizontally();
                composer2.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(spaceBetween2, centerHorizontally, composer2, 54);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor4 = companion5.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM8177width3ABfNKs);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor4);
                } else {
                    composer2.useNode();
                }
                Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composer2);
                Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion5.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion5.getSetCompositeKeyHash();
                if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(BackgroundKt.background$default(companion3, brush3, null, 0.0f, 6, null), 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._43wdp, composer2, 6));
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, composer2, 0);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor5 = companion5.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierM8158height3ABfNKs);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor5);
                } else {
                    composer2.useNode();
                }
                Composer composerM10870constructorimpl5 = Updater.m10870constructorimpl(composer2);
                Updater.m10877setimpl(composerM10870constructorimpl5, measurePolicyRememberBoxMeasurePolicy3, companion5.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl5, currentCompositionLocalMap5, companion5.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion5.getSetCompositeKeyHash();
                if (composerM10870constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    composerM10870constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                    composerM10870constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                }
                function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                Modifier modifierAlign2 = boxScopeInstance.align(companion3, companion4.getCenter());
                String upperCase2 = StringResources_androidKt.stringResource(R.string.craft_split_without_platinum_vip, composer2, 6).toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                TextKt.m10024Text4IGK_g(upperCase2, modifierAlign2, 0L, 0L, FontStyle.m13271boximpl(companion6.m13280getItalic_LCdwA()), (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._16wsp, 0L, 0, 0L, 0.0f, null, null, composer2, 12582918, 126), composer2, 0, 0, 65516);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
                Alignment center2 = companion4.getCenter();
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(center2, false, composer2, 6);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor6 = companion5.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default2);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor6);
                } else {
                    composer2.useNode();
                }
                Composer composerM10870constructorimpl6 = Updater.m10870constructorimpl(composer2);
                Updater.m10877setimpl(composerM10870constructorimpl6, measurePolicyRememberBoxMeasurePolicy4, companion5.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl6, currentCompositionLocalMap6, companion5.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion5.getSetCompositeKeyHash();
                if (composerM10870constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                    composerM10870constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                    composerM10870constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                }
                function3ModifierMaterializerOf6.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                ImageBitmapKt.m15118ImageBitmapAy9G7rc(bitmap4, SizeKt.m8158height3ABfNKs(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._120wdp, composer2, 6)), null, null, 0.0f, null, 0, composer2, 8, 124);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                Modifier modifierM8177width3ABfNKs2 = SizeKt.m8177width3ABfNKs(SizeKt.fillMaxHeight$default(BackgroundKt.background$default(ClipKt.clip(companion3, roundedCornerShape3), brush2, roundedCornerShape3, 0.0f, 4, null), 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._450wdp, composer2, 6));
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, composer2, 0);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap7 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor7 = companion5.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierM8177width3ABfNKs2);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor7);
                } else {
                    composer2.useNode();
                }
                Composer composerM10870constructorimpl7 = Updater.m10870constructorimpl(composer2);
                Updater.m10877setimpl(composerM10870constructorimpl7, measurePolicyRememberBoxMeasurePolicy5, companion5.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl7, currentCompositionLocalMap7, companion5.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = companion5.getSetCompositeKeyHash();
                if (composerM10870constructorimpl7.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                    composerM10870constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                    composerM10870constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                }
                function3ModifierMaterializerOf7.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_br_logo, composer2, 6), (String) null, AlphaKt.alpha(SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), 0.05f), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 440, 120);
                Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
                Arrangement.HorizontalOrVertical spaceBetween3 = arrangement.getSpaceBetween();
                Alignment.Horizontal centerHorizontally2 = companion4.getCenterHorizontally();
                composer2.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(spaceBetween3, centerHorizontally2, composer2, 54);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap8 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor8 = companion5.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default3);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor8);
                } else {
                    composer2.useNode();
                }
                Composer composerM10870constructorimpl8 = Updater.m10870constructorimpl(composer2);
                Updater.m10877setimpl(composerM10870constructorimpl8, measurePolicyColumnMeasurePolicy2, companion5.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl8, currentCompositionLocalMap8, companion5.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash8 = companion5.getSetCompositeKeyHash();
                if (composerM10870constructorimpl8.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                    composerM10870constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
                    composerM10870constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
                }
                function3ModifierMaterializerOf8.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                Modifier modifierBackground$default = BackgroundKt.background$default(SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._50wdp, composer2, 6)), brush4, null, 0.0f, 6, null);
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy6 = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, composer2, 0);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap9 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor9 = companion5.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf9 = LayoutKt.modifierMaterializerOf(modifierBackground$default);
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
                Updater.m10877setimpl(composerM10870constructorimpl9, measurePolicyRememberBoxMeasurePolicy6, companion5.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl9, currentCompositionLocalMap9, companion5.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash9 = companion5.getSetCompositeKeyHash();
                if (composerM10870constructorimpl9.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
                    composerM10870constructorimpl9.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash9));
                    composerM10870constructorimpl9.apply(Integer.valueOf(currentCompositeKeyHash9), setCompositeKeyHash9);
                }
                function3ModifierMaterializerOf9.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                Modifier modifierAlign3 = boxScopeInstance.align(companion3, companion4.getCenter());
                String upperCase3 = StringResources_androidKt.stringResource(R.string.craft_split_with_platinum_vip, composer2, 6).toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase3, "toUpperCase(...)");
                TextKt.m10024Text4IGK_g(upperCase3, modifierAlign3, 0L, 0L, FontStyle.m13271boximpl(companion6.m13280getItalic_LCdwA()), (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._25wsp, 0L, 0, 0L, 0.0f, null, null, composer2, 12582918, 126), composer2, 0, 0, 65516);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                ImageBitmapKt.m15118ImageBitmapAy9G7rc(bitmap5, SizeKt.m8158height3ABfNKs(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._144wdp, composer2, 6)), null, null, 0.0f, null, 0, composer2, 8, 124);
                TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.craft_split_increase_your_chances, composer2, 6), PaddingKt.m8127paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._26wdp, composer2, 6), 7, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14843montserratMediumCustomSpbl3sdaw(R.dimen._15wsp, 0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, composer2, 196614, 26), composer2, 0, 0, 65532);
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
                Modifier modifierM8127paddingqDBjuR0$default3 = PaddingKt.m8127paddingqDBjuR0$default(boxScopeInstance.align(SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._62wdp, composer2, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._173wdp, composer2, 6)), companion4.getBottomCenter()), 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._12wdp, composer2, 6), 7, null);
                String strStringResource2 = StringResources_androidKt.stringResource(R.string.common_buy, composer2, 6);
                TextStyle textStyleM14811montserratBoldCustomSpIzzofJo2 = typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._23wdp, 0L, 0, 0L, 0.0f, null, null, composer2, 12582918, 126);
                long jColorResource = ColorResources_androidKt.colorResource(R.color.red, composer2, 6);
                composer2.startReplaceableGroup(1020073535);
                boolean zChanged2 = composer2.changed(function02);
                Object objRememberedValue4 = composer2.rememberedValue();
                if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftSplitDialogKt$CraftSplitDialog$1$1$1$3$1
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
                            function02.invoke();
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue4);
                }
                composer2.endReplaceableGroup();
                MainButtonFillWithNarrowOvalGradientKt.m15076MainButtonFillWithNarrowOvalGradientOKqFZno(modifierM8127paddingqDBjuR0$default3, strStringResource2, textStyleM14811montserratBoldCustomSpIzzofJo2, 0L, jColorResource, 0.0f, false, false, false, false, (Function0) objRememberedValue4, composer2, 0, 0, 1000);
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
                    return;
                }
                return;
            }
            composer2.skipToGroupEnd();
        }
    }

    /* compiled from: CraftSplitDialog.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.craft.CraftSplitDialogKt$CraftSplitDialogPreview$1 */
    /* loaded from: classes.dex */
    public static final class C54571 extends Lambda implements Function0<Unit> {
        public static final C54571 INSTANCE = ;

        /* renamed from: invoke */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: CraftSplitDialog.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.craft.CraftSplitDialogKt$CraftSplitDialogPreview$2 */
    /* loaded from: classes.dex */
    public static final class C54582 extends Lambda implements Function0<Unit> {
        public static final C54582 INSTANCE = ;

        /* renamed from: invoke */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void CraftSplitDialogPreview(@Nullable Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1720886588);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1720886588, i, -1, "com.blackhub.bronline.game.ui.craft.CraftSplitDialogPreview (CraftSplitDialog.kt:262)");
            }
            CraftSplitDialog(null, C54571.INSTANCE, C54582.INSTANCE, composerStartRestartGroup, 438);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftSplitDialogKt.CraftSplitDialogPreview.3
                public final /* synthetic */ int $$changed;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C54593(int i2) {
                    super(2);
                    i = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) {
                    CraftSplitDialogKt.CraftSplitDialogPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
