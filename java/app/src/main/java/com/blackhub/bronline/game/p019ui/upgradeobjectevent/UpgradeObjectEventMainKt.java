package com.blackhub.bronline.game.p019ui.upgradeobjectevent;

import android.graphics.Bitmap;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
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
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.ClipKt;
import androidx.compose.p003ui.draw.ScaleKt;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.graphics.RectangleShapeKt;
import androidx.compose.p003ui.graphics.TransformOriginKt;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.LayoutDirection;
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
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutKt;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.HorizontalAnchorable;
import androidx.constraintlayout.compose.Measurer;
import androidx.constraintlayout.compose.ToolingUtilsKt;
import androidx.constraintlayout.compose.VerticalAnchorable;
import androidx.recyclerview.widget.FastScroller;
import com.blackhub.bronline.game.core.enums.SideEnum;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.gui.upgradeobjectevent.UpgradeObjectEventImages;
import com.blackhub.bronline.game.gui.upgradeobjectevent.UpgradeObjectEventStrings;
import com.blackhub.bronline.game.gui.upgradeobjectevent.model.UpgradeObjectEventTopListOfServersItem;
import com.blackhub.bronline.game.p019ui.cases.p020ui.CasesReceivingSuperRewardUiKt;
import com.blackhub.bronline.game.p019ui.widget.anim.LottieLoopKt;
import com.blackhub.bronline.game.p019ui.widget.block.ClickAnimateBlockKt;
import com.blackhub.bronline.game.p019ui.widget.block.cloud.CloudArrowBottomBlockKt;
import com.blackhub.bronline.game.p019ui.widget.block.cloud.CloudArrowLeftBlockKt;
import com.blackhub.bronline.game.p019ui.widget.block.cloud.CloudArrowRightBlockKt;
import com.blackhub.bronline.game.p019ui.widget.block.cloud.CloudArrowTopBlockKt;
import com.blackhub.bronline.game.p019ui.widget.button.ButtonContentBlockKt;
import com.blackhub.bronline.game.p019ui.widget.other.GradientSphereKt;
import com.blackhub.bronline.game.p019ui.widget.other.RectShadowKt;
import com.blackhub.bronline.game.p019ui.widget.utils.ImageBitmapKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayerBridge;
import io.ktor.client.plugins.websocket.WebSocketContentKt;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UpgradeObjectEventMain.kt */
@SourceDebugExtension({"SMAP\nUpgradeObjectEventMain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpgradeObjectEventMain.kt\ncom/blackhub/bronline/game/ui/upgradeobjectevent/UpgradeObjectEventMainKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1256:1\n64#2:1257\n64#2:1258\n64#2:1259\n1116#3,6:1260\n*S KotlinDebug\n*F\n+ 1 UpgradeObjectEventMain.kt\ncom/blackhub/bronline/game/ui/upgradeobjectevent/UpgradeObjectEventMainKt\n*L\n145#1:1257\n147#1:1258\n158#1:1259\n181#1:1260,6\n*E\n"})
/* loaded from: classes3.dex */
public final class UpgradeObjectEventMainKt {
    public static final float BAG_BLOCK_HINT_REF_HORIZONTAL_BIAS = 0.27f;
    public static final float BAG_PIVOT_FRACTION_X = 0.5f;
    public static final float BAG_PIVOT_FRACTION_Y = 1.0f;
    public static final float BAG_TEXT_GRADIENT_SCALE_X = 4.0f;
    public static final float BAG_TEXT_GRADIENT_SCALE_Y = 1.0f;
    public static final int BLOCK_CHANGE_UPGRADE_OBJECT_ANIMATION_DURATION = 200;
    public static final float BTN_CLOSE_PIVOT_FRACTION_X = 1.0f;
    public static final float BTN_CLOSE_PIVOT_FRACTION_Y = 0.0f;
    public static final float BTN_INFO_PIVOT_FRACTION_X = 1.0f;
    public static final float BTN_INFO_PIVOT_FRACTION_Y = 0.5f;
    public static final float COLOR_STOPS_END = 1.0f;
    public static final float COLOR_STOPS_START = 0.2f;
    public static final int COUNT_GIFTS_FOUR = 4;
    public static final int COUNT_GIFTS_ONE = 1;
    public static final int COUNT_GIFTS_THREE = 3;
    public static final int COUNT_GIFTS_TWO = 2;
    public static final float GRADIENT_SPHERE_ALPHA = 1.0f;
    public static final float GRADIENT_SPHERE_SCALE_X = 1.0f;
    public static final float GRADIENT_SPHERE_SCALE_Y = 0.5f;
    public static final float LOTTIE_HEIGHT_PERCENT = 0.2f;
    public static final float LOTTIE_WIDTH_PERCENT = 0.6f;
    public static final int OFFSET_Y_FOR_TREE_LEVEL = -8;
    public static final float SCORE_ENERGY_COLOR_STOPS_END = 1.0f;
    public static final float SCORE_ENERGY_COLOR_STOPS_START = 0.4f;
    public static final float UPGRADE_OBJECT_HEIGHT_PERCENT = 0.7f;

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void UpgradeObjectEventMain(@Nullable Modifier modifier, final boolean z, final int i, final boolean z2, @NotNull final AnnotatedString eventObjectName, final int i2, final int i3, final int i4, final int i5, final int i6, @NotNull final AnnotatedString bagText, final boolean z3, final boolean z4, final boolean z5, final boolean z6, @Nullable final List<UpgradeObjectEventTopListOfServersItem> list, @DimenRes final int i7, @ColorRes final int i8, @Nullable final Bitmap bitmap, @Nullable final Bitmap bitmap2, @NotNull final UpgradeObjectEventStrings upgradeObjectStrings, @NotNull final UpgradeObjectEventImages upgradeObjectImages, @NotNull final Function0<Unit> onLevelEventObjectClick, @NotNull final Function0<Unit> onWantBuyGiftClick, @NotNull final Function0<Unit> onCloseClick, @NotNull final Function0<Unit> onCloseHintClick, @NotNull final Function0<Unit> onInfoClick, @NotNull final Function0<Unit> onCurrencyEventInfoClick, @NotNull final Function0<Unit> onBuyUpgradeOneClick, @NotNull final Function0<Unit> onBuyUpgradeTwoClick, @NotNull final Function0<Unit> onBuyUpgradeThreeClick, @NotNull final Function0<Unit> onEventObjectServerClick, @NotNull final Function0<Unit> onEventObjectPlayerClick, @NotNull final Function0<Unit> onGiftsQuestionClick, @NotNull final Function0<Unit> onBagClick, @NotNull final Function0<Unit> onTopListPlayerClick, @NotNull final Function0<Unit> onTopListServerClick, @NotNull final Function0<Unit> onTurnBlockingLoadingClick, @Nullable Composer composer, final int i9, final int i10, final int i11, final int i12, final int i13, final int i14) {
        Intrinsics.checkNotNullParameter(eventObjectName, "eventObjectName");
        Intrinsics.checkNotNullParameter(bagText, "bagText");
        Intrinsics.checkNotNullParameter(upgradeObjectStrings, "upgradeObjectStrings");
        Intrinsics.checkNotNullParameter(upgradeObjectImages, "upgradeObjectImages");
        Intrinsics.checkNotNullParameter(onLevelEventObjectClick, "onLevelEventObjectClick");
        Intrinsics.checkNotNullParameter(onWantBuyGiftClick, "onWantBuyGiftClick");
        Intrinsics.checkNotNullParameter(onCloseClick, "onCloseClick");
        Intrinsics.checkNotNullParameter(onCloseHintClick, "onCloseHintClick");
        Intrinsics.checkNotNullParameter(onInfoClick, "onInfoClick");
        Intrinsics.checkNotNullParameter(onCurrencyEventInfoClick, "onCurrencyEventInfoClick");
        Intrinsics.checkNotNullParameter(onBuyUpgradeOneClick, "onBuyUpgradeOneClick");
        Intrinsics.checkNotNullParameter(onBuyUpgradeTwoClick, "onBuyUpgradeTwoClick");
        Intrinsics.checkNotNullParameter(onBuyUpgradeThreeClick, "onBuyUpgradeThreeClick");
        Intrinsics.checkNotNullParameter(onEventObjectServerClick, "onEventObjectServerClick");
        Intrinsics.checkNotNullParameter(onEventObjectPlayerClick, "onEventObjectPlayerClick");
        Intrinsics.checkNotNullParameter(onGiftsQuestionClick, "onGiftsQuestionClick");
        Intrinsics.checkNotNullParameter(onBagClick, "onBagClick");
        Intrinsics.checkNotNullParameter(onTopListPlayerClick, "onTopListPlayerClick");
        Intrinsics.checkNotNullParameter(onTopListServerClick, "onTopListServerClick");
        Intrinsics.checkNotNullParameter(onTurnBlockingLoadingClick, "onTurnBlockingLoadingClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-908212268);
        Modifier modifier2 = (i13 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-908212268, i9, i10, "com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMain (UpgradeObjectEventMain.kt:142)");
        }
        final float fM13666constructorimpl = C2046Dp.m13666constructorimpl(-PrimitiveResources_androidKt.dimensionResource(R.dimen._135wdp, composerStartRestartGroup, 6));
        final float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._4wdp, composerStartRestartGroup, 6);
        final float fM13666constructorimpl2 = C2046Dp.m13666constructorimpl(-PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composerStartRestartGroup, 6));
        final float fDimensionResource2 = PrimitiveResources_androidKt.dimensionResource(R.dimen._9wdp, composerStartRestartGroup, 6);
        final float fDimensionResource3 = PrimitiveResources_androidKt.dimensionResource(R.dimen._9wdp, composerStartRestartGroup, 6);
        final RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composerStartRestartGroup, 6));
        final float fDimensionResource4 = PrimitiveResources_androidKt.dimensionResource(R.dimen._60wdp, composerStartRestartGroup, 6);
        final float fDimensionResource5 = PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composerStartRestartGroup, 6);
        final float fDimensionResource6 = PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composerStartRestartGroup, 6);
        final float fDimensionResource7 = PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composerStartRestartGroup, 6);
        final float fDimensionResource8 = PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composerStartRestartGroup, 6);
        final float fDimensionResource9 = PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composerStartRestartGroup, 6);
        final float fM13666constructorimpl3 = C2046Dp.m13666constructorimpl(-PrimitiveResources_androidKt.dimensionResource(R.dimen._67wdp, composerStartRestartGroup, 6));
        Brush.Companion companion = Brush.INSTANCE;
        final Brush brushM11297verticalGradient8A3gB4$default = Brush.Companion.m11297verticalGradient8A3gB4$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.orange, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.red, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
        final Brush brushM11297verticalGradient8A3gB4$default2 = Brush.Companion.m11297verticalGradient8A3gB4$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.gray_blue, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
        final Brush brushM11289horizontalGradient8A3gB4$default = Brush.Companion.m11289horizontalGradient8A3gB4$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black_gray_blue_2, composerStartRestartGroup, 6)), Color.m11330boximpl(Color.INSTANCE.m11375getTransparent0d7_KjU())}), 0.0f, 0.0f, 0, 14, (Object) null);
        composerStartRestartGroup.startReplaceableGroup(-2114913786);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        final MutableState mutableState = (MutableState) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        final Modifier modifier3 = modifier2;
        SurfaceKt.m9876SurfaceT9BRK9s(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), null, ColorResources_androidKt.colorResource(i8, composerStartRestartGroup, (i10 >> 21) & 14), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1849669863, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt.UpgradeObjectEventMain.1
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
            public final void invoke(@Nullable Composer composer2, int i15) {
                UpgradeObjectEventStrings upgradeObjectEventStrings;
                if ((i15 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1849669863, i15, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMain.<anonymous> (UpgradeObjectEventMain.kt:187)");
                    }
                    Bitmap bitmap3 = bitmap2;
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    ImageBitmapKt.m15118ImageBitmapAy9G7rc(bitmap3, SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, composer2, 3128, 116);
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                    final boolean z7 = z2;
                    final boolean z8 = z;
                    final Bitmap bitmap4 = bitmap;
                    final float f = fDimensionResource5;
                    final Brush brush = brushM11289horizontalGradient8A3gB4$default;
                    final float f2 = fDimensionResource;
                    final int i16 = i;
                    final UpgradeObjectEventImages upgradeObjectEventImages = upgradeObjectImages;
                    UpgradeObjectEventStrings upgradeObjectEventStrings2 = upgradeObjectStrings;
                    final int i17 = i4;
                    final int i18 = i5;
                    final MutableState<Boolean> mutableState2 = mutableState;
                    final Function0<Unit> function0 = onCloseHintClick;
                    final Function0<Unit> function02 = onCloseClick;
                    final float f3 = fDimensionResource6;
                    final float f4 = fDimensionResource7;
                    final Brush brush2 = brushM11297verticalGradient8A3gB4$default2;
                    final Function0<Unit> function03 = onTurnBlockingLoadingClick;
                    final Function0<Unit> function04 = onEventObjectServerClick;
                    final float f5 = fDimensionResource8;
                    final float f6 = fDimensionResource9;
                    final Function0<Unit> function05 = onEventObjectPlayerClick;
                    final float f7 = fDimensionResource4;
                    final Function0<Unit> function06 = onInfoClick;
                    final Brush brush3 = brushM11297verticalGradient8A3gB4$default;
                    final AnnotatedString annotatedString = eventObjectName;
                    final Function0<Unit> function07 = onLevelEventObjectClick;
                    final RoundedCornerShape roundedCornerShape = roundedCornerShapeM8392RoundedCornerShape0680j_4;
                    final Function0<Unit> function08 = onBagClick;
                    final float f8 = fDimensionResource2;
                    final Function0<Unit> function09 = onGiftsQuestionClick;
                    final float f9 = fDimensionResource3;
                    final int i19 = i6;
                    final AnnotatedString annotatedString2 = bagText;
                    final Function0<Unit> function010 = onWantBuyGiftClick;
                    final Function0<Unit> function011 = onCurrencyEventInfoClick;
                    final int i20 = i2;
                    final int i21 = i7;
                    final boolean z9 = z6;
                    final boolean z10 = z3;
                    final Function0<Unit> function012 = onBuyUpgradeThreeClick;
                    final boolean z11 = z4;
                    final Function0<Unit> function013 = onBuyUpgradeOneClick;
                    final float f10 = fM13666constructorimpl;
                    final boolean z12 = z5;
                    final Function0<Unit> function014 = onBuyUpgradeTwoClick;
                    final int i22 = i3;
                    final float f11 = fM13666constructorimpl3;
                    final Function0<Unit> function015 = onTopListServerClick;
                    final Function0<Unit> function016 = onTopListPlayerClick;
                    final List<UpgradeObjectEventTopListOfServersItem> list2 = list;
                    final float f12 = fM13666constructorimpl2;
                    composer2.startReplaceableGroup(-270267587);
                    composer2.startReplaceableGroup(-3687241);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    Composer.Companion companion3 = Composer.INSTANCE;
                    if (objRememberedValue2 == companion3.getEmpty()) {
                        objRememberedValue2 = new Measurer();
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    final Measurer measurer = (Measurer) objRememberedValue2;
                    composer2.startReplaceableGroup(-3687241);
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (objRememberedValue3 == companion3.getEmpty()) {
                        objRememberedValue3 = new ConstraintLayoutScope();
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    composer2.endReplaceableGroup();
                    final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue3;
                    composer2.startReplaceableGroup(-3687241);
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (objRememberedValue4 == companion3.getEmpty()) {
                        upgradeObjectEventStrings = upgradeObjectEventStrings2;
                        objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composer2.updateRememberedValue(objRememberedValue4);
                    } else {
                        upgradeObjectEventStrings = upgradeObjectEventStrings2;
                    }
                    composer2.endReplaceableGroup();
                    Pair<MeasurePolicy, Function0<Unit>> pairRememberConstraintLayoutMeasurePolicy = ConstraintLayoutKt.rememberConstraintLayoutMeasurePolicy(257, constraintLayoutScope, (MutableState<Boolean>) objRememberedValue4, measurer, composer2, 4544);
                    MeasurePolicy measurePolicyComponent1 = pairRememberConstraintLayoutMeasurePolicy.component1();
                    final Function0<Unit> function0Component2 = pairRememberConstraintLayoutMeasurePolicy.component2();
                    final int i23 = 6;
                    final UpgradeObjectEventStrings upgradeObjectEventStrings3 = upgradeObjectEventStrings;
                    LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierFillMaxSize$default, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$invoke$$inlined$ConstraintLayout$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                            ToolingUtilsKt.setDesignInfoProvider(semantics, measurer);
                        }
                    }, 1, null), ComposableLambdaKt.composableLambda(composer2, -819894182, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$invoke$$inlined$ConstraintLayout$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@Nullable Composer composer3, int i24) {
                            ConstraintLayoutScope constraintLayoutScope2;
                            if (((i24 & 11) ^ 2) != 0 || !composer3.getSkipping()) {
                                int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                                constraintLayoutScope.reset();
                                final ConstraintLayoutScope constraintLayoutScope3 = constraintLayoutScope;
                                ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope3.createRefs();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent1 = constrainedLayoutReferencesCreateRefs.component1();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent2 = constrainedLayoutReferencesCreateRefs.component2();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent3 = constrainedLayoutReferencesCreateRefs.component3();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent4 = constrainedLayoutReferencesCreateRefs.component4();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent5 = constrainedLayoutReferencesCreateRefs.component5();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent6 = constrainedLayoutReferencesCreateRefs.component6();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent7 = constrainedLayoutReferencesCreateRefs.component7();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent8 = constrainedLayoutReferencesCreateRefs.component8();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent9 = constrainedLayoutReferencesCreateRefs.component9();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent10 = constrainedLayoutReferencesCreateRefs.component10();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent11 = constrainedLayoutReferencesCreateRefs.component11();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent12 = constrainedLayoutReferencesCreateRefs.component12();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent13 = constrainedLayoutReferencesCreateRefs.component13();
                                ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs2 = constraintLayoutScope3.createRefs();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent14 = constrainedLayoutReferencesCreateRefs2.component1();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent22 = constrainedLayoutReferencesCreateRefs2.component2();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent32 = constrainedLayoutReferencesCreateRefs2.component3();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent42 = constrainedLayoutReferencesCreateRefs2.component4();
                                ConstrainedLayoutReference constrainedLayoutReferenceComponent52 = constrainedLayoutReferencesCreateRefs2.component5();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent62 = constrainedLayoutReferencesCreateRefs2.component6();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent72 = constrainedLayoutReferencesCreateRefs2.component7();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent82 = constrainedLayoutReferencesCreateRefs2.component8();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent92 = constrainedLayoutReferencesCreateRefs2.component9();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent102 = constrainedLayoutReferencesCreateRefs2.component10();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent112 = constrainedLayoutReferencesCreateRefs2.component11();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent122 = constrainedLayoutReferencesCreateRefs2.component12();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent132 = constrainedLayoutReferencesCreateRefs2.component13();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent142 = constrainedLayoutReferencesCreateRefs2.component14();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent15 = constrainedLayoutReferencesCreateRefs2.component15();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent16 = constrainedLayoutReferencesCreateRefs2.component16();
                                Boolean boolValueOf = Boolean.valueOf(!z7 && z8);
                                final float f13 = f7;
                                final MutableState mutableState3 = mutableState2;
                                final Function0 function017 = function06;
                                final Brush brush4 = brush3;
                                ComposeExtensionKt.IfTrue(boolValueOf, ComposableLambdaKt.composableLambda(composer3, 1659906886, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer4, int i25) {
                                        if ((i25 & 11) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1659906886, i25, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMain.<anonymous>.<anonymous>.<anonymous> (UpgradeObjectEventMain.kt:230)");
                                        }
                                        ConstraintLayoutScope constraintLayoutScope4 = constraintLayoutScope3;
                                        Modifier.Companion companion4 = Modifier.INSTANCE;
                                        ConstrainedLayoutReference constrainedLayoutReference = constrainedLayoutReferenceComponent16;
                                        composer4.startReplaceableGroup(-1221358799);
                                        boolean zChanged = composer4.changed(f13);
                                        final float f14 = f13;
                                        Object objRememberedValue5 = composer4.rememberedValue();
                                        if (zChanged || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue5 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$1$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                                    invoke2(constrainScope);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                                    Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), f14, 0.0f, 4, null);
                                                }
                                            };
                                            composer4.updateRememberedValue(objRememberedValue5);
                                        }
                                        composer4.endReplaceableGroup();
                                        Modifier modifierConstrainAs = constraintLayoutScope4.constrainAs(companion4, constrainedLayoutReference, (Function1) objRememberedValue5);
                                        MutableState<Boolean> mutableState4 = mutableState3;
                                        long jTransformOrigin = TransformOriginKt.TransformOrigin(1.0f, 0.5f);
                                        composer4.startReplaceableGroup(-1221358336);
                                        boolean zChanged2 = composer4.changed(function017);
                                        final Function0<Unit> function018 = function017;
                                        Object objRememberedValue6 = composer4.rememberedValue();
                                        if (zChanged2 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue6 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$1$2$1
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
                                                    function018.invoke();
                                                }
                                            };
                                            composer4.updateRememberedValue(objRememberedValue6);
                                        }
                                        composer4.endReplaceableGroup();
                                        final Brush brush5 = brush4;
                                        ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierConstrainAs, null, false, mutableState4, false, false, false, false, null, 0, jTransformOrigin, null, (Function0) objRememberedValue6, ComposableLambdaKt.composableLambda(composer4, 524318421, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$1.3
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                invoke(composer5, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                            @Composable
                                            public final void invoke(@Nullable Composer composer5, int i26) {
                                                if ((i26 & 11) != 2 || !composer5.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(524318421, i26, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMain.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UpgradeObjectEventMain.kt:243)");
                                                    }
                                                    Modifier.Companion companion5 = Modifier.INSTANCE;
                                                    Modifier modifierBackground$default = BackgroundKt.background$default(SizeKt.m8172size3ABfNKs(companion5, PrimitiveResources_androidKt.dimensionResource(R.dimen._43wdp, composer5, 6)), brush5, RoundedCornerShapeKt.m8394RoundedCornerShapea9UjIt4$default(PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer5, 6), 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer5, 6), 6, null), 0.0f, 4, null);
                                                    Alignment center = Alignment.INSTANCE.getCenter();
                                                    composer5.startReplaceableGroup(733328855);
                                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer5, 6);
                                                    composer5.startReplaceableGroup(-1323940314);
                                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                    CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                                                    Function0<ComposeUiNode> constructor = companion6.getConstructor();
                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierBackground$default);
                                                    if (!(composer5.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer5.startReusableNode();
                                                    if (composer5.getInserting()) {
                                                        composer5.createNode(constructor);
                                                    } else {
                                                        composer5.useNode();
                                                    }
                                                    Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer5);
                                                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion6.getSetMeasurePolicy());
                                                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion6.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion6.getSetCompositeKeyHash();
                                                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                    }
                                                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer5)), composer5, 0);
                                                    composer5.startReplaceableGroup(2058660585);
                                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                    IconKt.m9496Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_info, composer5, 6), (String) null, SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion5, PrimitiveResources_androidKt.dimensionResource(R.dimen._15wdp, composer5, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._25wdp, composer5, 6)), Color.INSTANCE.m11377getWhite0d7_KjU(), composer5, 3128, 0);
                                                    composer5.endReplaceableGroup();
                                                    composer5.endNode();
                                                    composer5.endReplaceableGroup();
                                                    composer5.endReplaceableGroup();
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer5.skipToGroupEnd();
                                            }
                                        }), composer4, 3072, 3072, 3062);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), composer3, 48);
                                Bitmap bitmap5 = bitmap4;
                                Modifier.Companion companion4 = Modifier.INSTANCE;
                                ImageBitmapKt.m15118ImageBitmapAy9G7rc(bitmap5, constraintLayoutScope3.constrainAs(OffsetKt.m8084offsetVpY3zN4$default(SizeKt.fillMaxHeight(companion4, 0.7f), 0.0f, C2046Dp.m13666constructorimpl(-PrimitiveResources_androidKt.dimensionResource(R.dimen._14wdp, composer3, 6)), 1, null), constrainedLayoutReferenceComponent52, new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$2
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                        invoke2(constrainScope);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                        VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                                        VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                                        HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                                    }
                                }), null, ContentScale.INSTANCE.getFillHeight(), 0.0f, null, 0, composer3, 3080, 116);
                                composer3.startReplaceableGroup(1214205804);
                                boolean zChanged = composer3.changed(f);
                                Object objRememberedValue5 = composer3.rememberedValue();
                                if (zChanged || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                    final float f14 = f;
                                    objRememberedValue5 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$3$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                            invoke2(constrainScope);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), f14, 0.0f, 4, null);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue5);
                                }
                                composer3.endReplaceableGroup();
                                Modifier modifierM8125paddingVpY3zN4$default = PaddingKt.m8125paddingVpY3zN4$default(BackgroundKt.background$default(constraintLayoutScope3.constrainAs(companion4, constrainedLayoutReferenceComponent3, (Function1) objRememberedValue5), brush, null, 0.0f, 6, null), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composer3, 6), 1, null);
                                Alignment.Companion companion5 = Alignment.INSTANCE;
                                Alignment.Vertical centerVertically = companion5.getCenterVertically();
                                composer3.startReplaceableGroup(693286680);
                                Arrangement arrangement = Arrangement.INSTANCE;
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composer3, 48);
                                composer3.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion6.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8125paddingVpY3zN4$default);
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
                                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy, companion6.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion6.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion6.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                ImageKt.Image(PainterResources_androidKt.painterResource(upgradeObjectEventImages.getEventObjectIcon(), composer3, 0), (String) null, SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(PaddingKt.m8127paddingqDBjuR0$default(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._17wdp, composer3, 6), 0.0f, 0.0f, 0.0f, 14, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._22wdp, composer3, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._34wdp, composer3, 6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                                AnnotatedString annotatedString3 = annotatedString;
                                Modifier modifierM8125paddingVpY3zN4$default2 = PaddingKt.m8125paddingVpY3zN4$default(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._13wdp, composer3, 6), 0.0f, 2, null);
                                TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
                                TextKt.m10025TextIbK3jfQ(annotatedString3, modifierM8125paddingVpY3zN4$default2, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle.m14823montserratExtraBoldCustomSp5OKGny8(R.dimen._13wsp, 0L, 0, 0L, 0.0f, null, composer3, 1572870, 62), composer3, 0, 0, 131068);
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.startReplaceableGroup(1214207002);
                                boolean zChanged2 = composer3.changed(f2);
                                Object objRememberedValue6 = composer3.rememberedValue();
                                if (zChanged2 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                    final float f15 = f2;
                                    objRememberedValue6 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$5$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                            invoke2(constrainScope);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), f15, 0.0f, 4, null);
                                            ConstrainScope.centerHorizontallyTo$default(constrainAs, constrainAs.getParent(), 0.0f, 2, null);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue6);
                                }
                                composer3.endReplaceableGroup();
                                Modifier modifierConstrainAs = constraintLayoutScope3.constrainAs(companion4, constrainedLayoutReferenceComponent1, (Function1) objRememberedValue6);
                                Alignment.Vertical centerVertically2 = companion5.getCenterVertically();
                                composer3.startReplaceableGroup(693286680);
                                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically2, composer3, 48);
                                composer3.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierConstrainAs);
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
                                Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRowMeasurePolicy2, companion6.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion6.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion6.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(upgradeObjectEventStrings3.getTitle(), composer3, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._17wsp, 0L, 0, 0L, 0.0f, null, null, composer3, 12582918, 126), composer3, 0, 0, 65534);
                                composer3.startReplaceableGroup(1214207449);
                                if (z8) {
                                    Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._6wdp, composer3, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    MutableState mutableState4 = mutableState2;
                                    composer3.startReplaceableGroup(-1221354496);
                                    boolean zChanged3 = composer3.changed(function07);
                                    Object objRememberedValue7 = composer3.rememberedValue();
                                    if (zChanged3 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                        final Function0 function018 = function07;
                                        objRememberedValue7 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$6$1$1
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
                                                function018.invoke();
                                            }
                                        };
                                        composer3.updateRememberedValue(objRememberedValue7);
                                    }
                                    Function0 function019 = (Function0) objRememberedValue7;
                                    composer3.endReplaceableGroup();
                                    final Brush brush5 = brush3;
                                    final RoundedCornerShape roundedCornerShape2 = roundedCornerShape;
                                    constraintLayoutScope2 = constraintLayoutScope3;
                                    ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierM8127paddingqDBjuR0$default, null, false, mutableState4, true, true, false, false, null, 0, 0L, null, function019, ComposableLambdaKt.composableLambda(composer3, -662045773, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$6$2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(@Nullable Composer composer4, int i25) {
                                            if ((i25 & 11) != 2 || !composer4.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-662045773, i25, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMain.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UpgradeObjectEventMain.kt:323)");
                                                }
                                                Modifier.Companion companion7 = Modifier.INSTANCE;
                                                Modifier modifierBackground$default = BackgroundKt.background$default(SizeKt.m8172size3ABfNKs(companion7, PrimitiveResources_androidKt.dimensionResource(R.dimen._22wdp, composer4, 6)), brush5, roundedCornerShape2, 0.0f, 4, null);
                                                Alignment bottomCenter = Alignment.INSTANCE.getBottomCenter();
                                                composer4.startReplaceableGroup(733328855);
                                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(bottomCenter, false, composer4, 6);
                                                composer4.startReplaceableGroup(-1323940314);
                                                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                                                ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                                                Function0<ComposeUiNode> constructor3 = companion8.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierBackground$default);
                                                if (!(composer4.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer4.startReusableNode();
                                                if (composer4.getInserting()) {
                                                    composer4.createNode(constructor3);
                                                } else {
                                                    composer4.useNode();
                                                }
                                                Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composer4);
                                                Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy, companion8.getSetMeasurePolicy());
                                                Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion8.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion8.getSetCompositeKeyHash();
                                                if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                    composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                    composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                                }
                                                function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                                composer4.startReplaceableGroup(2058660585);
                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                IconKt.m9496Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_gift_box, composer4, 6), (String) null, SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion7, PrimitiveResources_androidKt.dimensionResource(R.dimen._14wdp, composer4, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._25wdp, composer4, 6)), Color.INSTANCE.m11377getWhite0d7_KjU(), composer4, 3128, 0);
                                                composer4.endReplaceableGroup();
                                                composer4.endNode();
                                                composer4.endReplaceableGroup();
                                                composer4.endReplaceableGroup();
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer4.skipToGroupEnd();
                                        }
                                    }), composer3, 224256, 3072, 4038);
                                } else {
                                    constraintLayoutScope2 = constraintLayoutScope3;
                                }
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                Boolean boolValueOf2 = Boolean.valueOf(z7);
                                ComposableSingletons$UpgradeObjectEventMainKt composableSingletons$UpgradeObjectEventMainKt = ComposableSingletons$UpgradeObjectEventMainKt.INSTANCE;
                                ComposeExtensionKt.IfTrue(boolValueOf2, composableSingletons$UpgradeObjectEventMainKt.m15035getLambda2$app_siteRelease(), composer3, 48);
                                Boolean boolValueOf3 = Boolean.valueOf(z8);
                                final boolean z13 = z7;
                                final MutableState mutableState5 = mutableState2;
                                final Function0 function020 = function08;
                                final float f16 = f8;
                                final Function0 function021 = function09;
                                final float f17 = f9;
                                final UpgradeObjectEventImages upgradeObjectEventImages2 = upgradeObjectEventImages;
                                final int i25 = i19;
                                final Brush brush6 = brush3;
                                final AnnotatedString annotatedString4 = annotatedString2;
                                final ConstraintLayoutScope constraintLayoutScope4 = constraintLayoutScope2;
                                ComposeExtensionKt.IfTrue(boolValueOf3, ComposableLambdaKt.composableLambda(composer3, -1755883330, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$7
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer4, int i26) {
                                        if ((i26 & 11) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1755883330, i26, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMain.<anonymous>.<anonymous>.<anonymous> (UpgradeObjectEventMain.kt:348)");
                                        }
                                        ConstraintLayoutScope constraintLayoutScope5 = constraintLayoutScope4;
                                        Modifier.Companion companion7 = Modifier.INSTANCE;
                                        Modifier modifierConstrainAs2 = constraintLayoutScope5.constrainAs(companion7, constrainedLayoutReferenceComponent62, new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$7.1
                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                                invoke2(constrainScope);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                                Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                                ConstrainScope.centerHorizontallyTo$default(constrainAs, constrainAs.getParent(), 0.0f, 2, null);
                                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                                            }
                                        });
                                        boolean z14 = !z13;
                                        MutableState<Boolean> mutableState6 = mutableState5;
                                        long jTransformOrigin = TransformOriginKt.TransformOrigin(0.5f, 1.0f);
                                        composer4.startReplaceableGroup(-1221352651);
                                        boolean zChanged4 = composer4.changed(function020);
                                        final Function0<Unit> function022 = function020;
                                        Object objRememberedValue8 = composer4.rememberedValue();
                                        if (zChanged4 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue8 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$7$2$1
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
                                                    function022.invoke();
                                                }
                                            };
                                            composer4.updateRememberedValue(objRememberedValue8);
                                        }
                                        Function0 function023 = (Function0) objRememberedValue8;
                                        composer4.endReplaceableGroup();
                                        final UpgradeObjectEventImages upgradeObjectEventImages3 = upgradeObjectEventImages2;
                                        final int i27 = i25;
                                        ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierConstrainAs2, null, z14, mutableState6, true, false, false, false, null, 0, jTransformOrigin, null, function023, ComposableLambdaKt.composableLambda(composer4, -2134705011, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$7.3
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                invoke(composer5, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                            @Composable
                                            public final void invoke(@Nullable Composer composer5, int i28) {
                                                BoxScopeInstance boxScopeInstance;
                                                int i29;
                                                UpgradeObjectEventImages upgradeObjectEventImages4;
                                                if ((i28 & 11) != 2 || !composer5.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-2134705011, i28, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMain.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UpgradeObjectEventMain.kt:363)");
                                                    }
                                                    Modifier.Companion companion8 = Modifier.INSTANCE;
                                                    Modifier modifierM8084offsetVpY3zN4$default = OffsetKt.m8084offsetVpY3zN4$default(SizeKt.m8158height3ABfNKs(companion8, PrimitiveResources_androidKt.dimensionResource(R.dimen._110wdp, composer5, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer5, 6), 0.0f, 2, null);
                                                    UpgradeObjectEventImages upgradeObjectEventImages5 = upgradeObjectEventImages3;
                                                    int i30 = i27;
                                                    composer5.startReplaceableGroup(733328855);
                                                    Alignment.Companion companion9 = Alignment.INSTANCE;
                                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion9.getTopStart(), false, composer5, 0);
                                                    composer5.startReplaceableGroup(-1323940314);
                                                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                    CompositionLocalMap currentCompositionLocalMap3 = composer5.getCurrentCompositionLocalMap();
                                                    ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                                                    Function0<ComposeUiNode> constructor3 = companion10.getConstructor();
                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM8084offsetVpY3zN4$default);
                                                    if (!(composer5.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer5.startReusableNode();
                                                    if (composer5.getInserting()) {
                                                        composer5.createNode(constructor3);
                                                    } else {
                                                        composer5.useNode();
                                                    }
                                                    Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composer5);
                                                    Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy, companion10.getSetMeasurePolicy());
                                                    Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion10.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion10.getSetCompositeKeyHash();
                                                    if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                        composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                        composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                                    }
                                                    function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer5)), composer5, 0);
                                                    composer5.startReplaceableGroup(2058660585);
                                                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                                    Integer giftBag = upgradeObjectEventImages5.getGiftBag();
                                                    composer5.startReplaceableGroup(2144448843);
                                                    if (giftBag == null) {
                                                        boxScopeInstance = boxScopeInstance2;
                                                        i29 = i30;
                                                        upgradeObjectEventImages4 = upgradeObjectEventImages5;
                                                    } else {
                                                        boxScopeInstance = boxScopeInstance2;
                                                        i29 = i30;
                                                        upgradeObjectEventImages4 = upgradeObjectEventImages5;
                                                        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_bag_back, composer5, 6), (String) null, boxScopeInstance2.align(SizeKt.m8158height3ABfNKs(companion8, PrimitiveResources_androidKt.dimensionResource(R.dimen._115wdp, composer5, 6)), companion9.getBottomCenter()), (Alignment) null, ContentScale.INSTANCE.getFillHeight(), 0.0f, (ColorFilter) null, composer5, 24632, 104);
                                                    }
                                                    composer5.endReplaceableGroup();
                                                    Modifier modifierM8084offsetVpY3zN4$default2 = OffsetKt.m8084offsetVpY3zN4$default(PaddingKt.m8127paddingqDBjuR0$default(boxScopeInstance.align(companion8, companion9.getTopCenter()), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._4wdp, composer5, 6), 0.0f, 0.0f, 13, null), C2046Dp.m13666constructorimpl(-PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composer5, 6)), 0.0f, 2, null);
                                                    composer5.startReplaceableGroup(693286680);
                                                    MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion9.getTop(), composer5, 0);
                                                    composer5.startReplaceableGroup(-1323940314);
                                                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                    CompositionLocalMap currentCompositionLocalMap4 = composer5.getCurrentCompositionLocalMap();
                                                    Function0<ComposeUiNode> constructor4 = companion10.getConstructor();
                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM8084offsetVpY3zN4$default2);
                                                    if (!(composer5.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer5.startReusableNode();
                                                    if (composer5.getInserting()) {
                                                        composer5.createNode(constructor4);
                                                    } else {
                                                        composer5.useNode();
                                                    }
                                                    Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composer5);
                                                    Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRowMeasurePolicy3, companion10.getSetMeasurePolicy());
                                                    Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion10.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion10.getSetCompositeKeyHash();
                                                    if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                                        composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                                        composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                                    }
                                                    function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer5)), composer5, 0);
                                                    composer5.startReplaceableGroup(2058660585);
                                                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                                    int i31 = i29;
                                                    final UpgradeObjectEventImages upgradeObjectEventImages6 = upgradeObjectEventImages4;
                                                    ComposeExtensionKt.IfTrue(Boolean.valueOf(i31 >= 1), ComposableLambdaKt.composableLambda(composer5, -1534180913, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$7$3$1$2$1
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                            invoke(composer6, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                        @Composable
                                                        public final void invoke(@Nullable Composer composer6, int i32) {
                                                            if ((i32 & 11) != 2 || !composer6.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(-1534180913, i32, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMain.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UpgradeObjectEventMain.kt:387)");
                                                                }
                                                                ImageKt.Image(PainterResources_androidKt.painterResource(upgradeObjectEventImages6.getGiftOneImage(), composer6, 0), (String) null, SizeKt.m8158height3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._110wdp, composer6, 6)), (Alignment) null, ContentScale.INSTANCE.getFillHeight(), 0.0f, (ColorFilter) null, composer6, 24632, 104);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            composer6.skipToGroupEnd();
                                                        }
                                                    }), composer5, 48);
                                                    ComposeExtensionKt.IfTrue(Boolean.valueOf(i31 >= 2), ComposableLambdaKt.composableLambda(composer5, -322437882, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$7$3$1$2$2
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                            invoke(composer6, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                        @Composable
                                                        public final void invoke(@Nullable Composer composer6, int i32) {
                                                            if ((i32 & 11) != 2 || !composer6.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(-322437882, i32, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMain.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UpgradeObjectEventMain.kt:396)");
                                                                }
                                                                ImageKt.Image(PainterResources_androidKt.painterResource(upgradeObjectEventImages6.getGiftTwoImage(), composer6, 0), (String) null, OffsetKt.m8083offsetVpY3zN4(SizeKt.m8158height3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._110wdp, composer6, 6)), C2046Dp.m13666constructorimpl(-PrimitiveResources_androidKt.dimensionResource(R.dimen._7wdp, composer6, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._7wdp, composer6, 6)), (Alignment) null, ContentScale.INSTANCE.getFillHeight(), 0.0f, (ColorFilter) null, composer6, 24632, 104);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            composer6.skipToGroupEnd();
                                                        }
                                                    }), composer5, 48);
                                                    ComposeExtensionKt.IfTrue(Boolean.valueOf(i31 >= 3), ComposableLambdaKt.composableLambda(composer5, 1350281543, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$7$3$1$2$3
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                            invoke(composer6, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                        @Composable
                                                        public final void invoke(@Nullable Composer composer6, int i32) {
                                                            if ((i32 & 11) != 2 || !composer6.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(1350281543, i32, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMain.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UpgradeObjectEventMain.kt:409)");
                                                                }
                                                                ImageKt.Image(PainterResources_androidKt.painterResource(upgradeObjectEventImages6.getGiftThreeImage(), composer6, 0), (String) null, OffsetKt.m8083offsetVpY3zN4(SizeKt.m8158height3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._100wdp, composer6, 6)), C2046Dp.m13666constructorimpl(-PrimitiveResources_androidKt.dimensionResource(R.dimen._14wdp, composer6, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._7wdp, composer6, 6)), (Alignment) null, ContentScale.INSTANCE.getFillHeight(), 0.0f, (ColorFilter) null, composer6, 24632, 104);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            composer6.skipToGroupEnd();
                                                        }
                                                    }), composer5, 48);
                                                    ComposeExtensionKt.IfTrue(Boolean.valueOf(i31 >= 4), ComposableLambdaKt.composableLambda(composer5, -1271966328, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$7$3$1$2$4
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                            invoke(composer6, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                        @Composable
                                                        public final void invoke(@Nullable Composer composer6, int i32) {
                                                            if ((i32 & 11) != 2 || !composer6.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(-1271966328, i32, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMain.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UpgradeObjectEventMain.kt:422)");
                                                                }
                                                                ImageKt.Image(PainterResources_androidKt.painterResource(upgradeObjectEventImages6.getGiftFourImage(), composer6, 0), (String) null, OffsetKt.m8083offsetVpY3zN4(SizeKt.m8158height3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._110wdp, composer6, 6)), C2046Dp.m13666constructorimpl(-PrimitiveResources_androidKt.dimensionResource(R.dimen._21wdp, composer6, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._7wdp, composer6, 6)), (Alignment) null, ContentScale.INSTANCE.getFillHeight(), 0.0f, (ColorFilter) null, composer6, 24632, 104);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            composer6.skipToGroupEnd();
                                                        }
                                                    }), composer5, 48);
                                                    composer5.endReplaceableGroup();
                                                    composer5.endNode();
                                                    composer5.endReplaceableGroup();
                                                    composer5.endReplaceableGroup();
                                                    Integer giftBag2 = upgradeObjectEventImages6.getGiftBag();
                                                    composer5.startReplaceableGroup(1445531511);
                                                    if (giftBag2 != null) {
                                                        ImageKt.Image(PainterResources_androidKt.painterResource(giftBag2.intValue(), composer5, 0), (String) null, SizeKt.m8158height3ABfNKs(OffsetKt.m8084offsetVpY3zN4$default(boxScopeInstance.align(companion8, companion9.getBottomCenter()), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer5, 6), 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._120wdp, composer5, 6)), (Alignment) null, ContentScale.INSTANCE.getFillHeight(), 0.0f, (ColorFilter) null, composer5, 24632, 104);
                                                    }
                                                    composer5.endReplaceableGroup();
                                                    composer5.endReplaceableGroup();
                                                    composer5.endNode();
                                                    composer5.endReplaceableGroup();
                                                    composer5.endReplaceableGroup();
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer5.skipToGroupEnd();
                                            }
                                        }), composer4, 27648, 3072, 3042);
                                        ConstraintLayoutScope constraintLayoutScope6 = constraintLayoutScope4;
                                        Modifier modifierScale = ScaleKt.scale(SizeKt.m8158height3ABfNKs(companion7, PrimitiveResources_androidKt.dimensionResource(R.dimen._52wdp, composer4, 6)), 4.0f, 1.0f);
                                        ConstrainedLayoutReference constrainedLayoutReference = constrainedLayoutReferenceComponent102;
                                        composer4.startReplaceableGroup(-1221347231);
                                        boolean zChanged5 = composer4.changed(constrainedLayoutReferenceComponent92);
                                        final ConstrainedLayoutReference constrainedLayoutReference2 = constrainedLayoutReferenceComponent92;
                                        Object objRememberedValue9 = composer4.rememberedValue();
                                        if (zChanged5 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue9 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$7$4$1
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                                    invoke2(constrainScope);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                                    Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                                    constrainAs.centerTo(constrainedLayoutReference2);
                                                }
                                            };
                                            composer4.updateRememberedValue(objRememberedValue9);
                                        }
                                        composer4.endReplaceableGroup();
                                        GradientSphereKt.GradientSphere(constraintLayoutScope6.constrainAs(modifierScale, constrainedLayoutReference, (Function1) objRememberedValue9), SideEnum.CENTER, null, new Pair[]{TuplesKt.m7112to(Float.valueOf(0.2f), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black_gray_blue, composer4, 6))), TuplesKt.m7112to(Float.valueOf(1.0f), Color.m11330boximpl(Color.INSTANCE.m11375getTransparent0d7_KjU()))}, 1.0f, ComposeExtensionKt.m14409dpToPx8Feqmps(PrimitiveResources_androidKt.dimensionResource(R.dimen._45wdp, composer4, 6), composer4, 0), composer4, 24624, 4);
                                        ConstraintLayoutScope constraintLayoutScope7 = constraintLayoutScope4;
                                        ConstrainedLayoutReference constrainedLayoutReference3 = constrainedLayoutReferenceComponent82;
                                        composer4.startReplaceableGroup(-1221346597);
                                        boolean zChanged6 = composer4.changed(constrainedLayoutReferenceComponent92) | composer4.changed(f16);
                                        final ConstrainedLayoutReference constrainedLayoutReference4 = constrainedLayoutReferenceComponent92;
                                        final float f18 = f16;
                                        Object objRememberedValue10 = composer4.rememberedValue();
                                        if (zChanged6 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue10 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$7$5$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                                    invoke2(constrainScope);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                                    Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainedLayoutReference4.getStart(), f18, 0.0f, 4, null);
                                                    ConstrainScope.centerVerticallyTo$default(constrainAs, constrainedLayoutReference4, 0.0f, 2, null);
                                                }
                                            };
                                            composer4.updateRememberedValue(objRememberedValue10);
                                        }
                                        composer4.endReplaceableGroup();
                                        Modifier modifierConstrainAs3 = constraintLayoutScope7.constrainAs(companion7, constrainedLayoutReference3, (Function1) objRememberedValue10);
                                        boolean z15 = !z13;
                                        MutableState<Boolean> mutableState7 = mutableState5;
                                        composer4.startReplaceableGroup(-1221346117);
                                        boolean zChanged7 = composer4.changed(function021);
                                        final Function0<Unit> function024 = function021;
                                        Object objRememberedValue11 = composer4.rememberedValue();
                                        if (zChanged7 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue11 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$7$6$1
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
                                                    function024.invoke();
                                                }
                                            };
                                            composer4.updateRememberedValue(objRememberedValue11);
                                        }
                                        composer4.endReplaceableGroup();
                                        final Brush brush7 = brush6;
                                        ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierConstrainAs3, null, z15, mutableState7, true, false, false, false, null, 0, 0L, null, (Function0) objRememberedValue11, ComposableLambdaKt.composableLambda(composer4, -499936252, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$7.7
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                invoke(composer5, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                            @Composable
                                            public final void invoke(@Nullable Composer composer5, int i28) {
                                                if ((i28 & 11) != 2 || !composer5.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-499936252, i28, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMain.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UpgradeObjectEventMain.kt:480)");
                                                    }
                                                    Modifier.Companion companion8 = Modifier.INSTANCE;
                                                    Modifier modifierM8084offsetVpY3zN4$default = OffsetKt.m8084offsetVpY3zN4$default(SizeKt.m8172size3ABfNKs(companion8, PrimitiveResources_androidKt.dimensionResource(R.dimen._24wdp, composer5, 6)), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._6wdp, composer5, 6), 1, null);
                                                    Color.Companion companion9 = Color.INSTANCE;
                                                    RectShadowKt.m15098RectShadowOfrYxbw(modifierM8084offsetVpY3zN4$default, companion9.m11366getBlack0d7_KjU(), 0.0f, 0.0f, ComposeExtensionKt.m14409dpToPx8Feqmps(PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer5, 6), composer5, 0), 0.0f, C2046Dp.m13666constructorimpl(0), composer5, 1572912, 44);
                                                    Modifier modifierBackground$default = BackgroundKt.background$default(SizeKt.m8172size3ABfNKs(PaddingKt.m8123padding3ABfNKs(companion8, PrimitiveResources_androidKt.dimensionResource(R.dimen._9wdp, composer5, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._24wdp, composer5, 6)), brush7, RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composer5, 6)), 0.0f, 4, null);
                                                    Alignment center = Alignment.INSTANCE.getCenter();
                                                    composer5.startReplaceableGroup(733328855);
                                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer5, 6);
                                                    composer5.startReplaceableGroup(-1323940314);
                                                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                    CompositionLocalMap currentCompositionLocalMap3 = composer5.getCurrentCompositionLocalMap();
                                                    ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                                                    Function0<ComposeUiNode> constructor3 = companion10.getConstructor();
                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierBackground$default);
                                                    if (!(composer5.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer5.startReusableNode();
                                                    if (composer5.getInserting()) {
                                                        composer5.createNode(constructor3);
                                                    } else {
                                                        composer5.useNode();
                                                    }
                                                    Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composer5);
                                                    Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy, companion10.getSetMeasurePolicy());
                                                    Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion10.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion10.getSetCompositeKeyHash();
                                                    if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                        composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                        composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                                    }
                                                    function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer5)), composer5, 0);
                                                    composer5.startReplaceableGroup(2058660585);
                                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                    IconKt.m9496Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_question, composer5, 6), (String) null, SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(OffsetKt.m8084offsetVpY3zN4$default(companion8, C2046Dp.m13666constructorimpl(-PrimitiveResources_androidKt.dimensionResource(R.dimen._05wdp, composer5, 6)), 0.0f, 2, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._8wdp, composer5, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._11wdp, composer5, 6)), companion9.m11377getWhite0d7_KjU(), composer5, 3128, 0);
                                                    composer5.endReplaceableGroup();
                                                    composer5.endNode();
                                                    composer5.endReplaceableGroup();
                                                    composer5.endReplaceableGroup();
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer5.skipToGroupEnd();
                                            }
                                        }), composer4, 27648, 3072, 4066);
                                        ConstraintLayoutScope constraintLayoutScope8 = constraintLayoutScope4;
                                        ConstrainedLayoutReference constrainedLayoutReference5 = constrainedLayoutReferenceComponent92;
                                        composer4.startReplaceableGroup(-1221344419);
                                        boolean zChanged8 = composer4.changed(f17);
                                        final float f19 = f17;
                                        Object objRememberedValue12 = composer4.rememberedValue();
                                        if (zChanged8 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue12 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$7$8$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                                    invoke2(constrainScope);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                                    Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                                    ConstrainScope.centerHorizontallyTo$default(constrainAs, constrainAs.getParent(), 0.0f, 2, null);
                                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), f19, 0.0f, 4, null);
                                                }
                                            };
                                            composer4.updateRememberedValue(objRememberedValue12);
                                        }
                                        composer4.endReplaceableGroup();
                                        Modifier modifierConstrainAs4 = constraintLayoutScope8.constrainAs(companion7, constrainedLayoutReference5, (Function1) objRememberedValue12);
                                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                        Arrangement.HorizontalOrVertical horizontalOrVerticalM8032spacedBy0680j_4 = Arrangement.INSTANCE.m8032spacedBy0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._6wdp, composer4, 6));
                                        int i28 = i25;
                                        AnnotatedString annotatedString5 = annotatedString4;
                                        composer4.startReplaceableGroup(-483455358);
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM8032spacedBy0680j_4, centerHorizontally, composer4, 48);
                                        composer4.startReplaceableGroup(-1323940314);
                                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                        CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                                        ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor3 = companion8.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierConstrainAs4);
                                        if (!(composer4.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor3);
                                        } else {
                                            composer4.useNode();
                                        }
                                        Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composer4);
                                        Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyColumnMeasurePolicy, companion8.getSetMeasurePolicy());
                                        Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion8.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion8.getSetCompositeKeyHash();
                                        if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                            composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                            composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                        }
                                        function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                        composer4.startReplaceableGroup(2058660585);
                                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                        String upperCase = StringResources_androidKt.stringResource(R.string.christmas_tree_gifts_two_dots, new Object[]{Integer.valueOf(i28)}, composer4, 70).toUpperCase(Locale.ROOT);
                                        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                                        TypographyStyle typographyStyle2 = TypographyStyle.INSTANCE;
                                        TextKt.m10024Text4IGK_g(upperCase, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle2.m14823montserratExtraBoldCustomSp5OKGny8(R.dimen._17wsp, 0L, 0, 0L, 0.0f, null, composer4, 1572870, 62), composer4, 0, 0, 65534);
                                        TextKt.m10025TextIbK3jfQ(annotatedString5, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle2.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._12wsp, 0L, 0, 0L, 0.0f, null, composer4, 1572870, 62), composer4, 0, 0, 131070);
                                        composer4.endReplaceableGroup();
                                        composer4.endNode();
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                        if (upgradeObjectEventImages2.getGiftBag() != null) {
                                            LottieLoopKt.LottieLoop(constraintLayoutScope4.constrainAs(SizeKt.fillMaxWidth(SizeKt.fillMaxHeight(companion7, 0.2f), 0.6f), constrainedLayoutReferenceComponent112, new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$7$10$1
                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                                    invoke2(constrainScope);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                                    Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                                                }
                                            }), R.raw.bag_blink_effect, 0, composer4, 48, 4);
                                            Unit unit = Unit.INSTANCE;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), composer3, 48);
                                Modifier modifierM8084offsetVpY3zN4$default = OffsetKt.m8084offsetVpY3zN4$default(SizeKt.m8177width3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._266wdp, composer3, 6)), 0.0f, C2046Dp.m13666constructorimpl(-8), 1, null);
                                composer3.startReplaceableGroup(1214219700);
                                boolean zChanged4 = composer3.changed(constrainedLayoutReferenceComponent1);
                                Object objRememberedValue8 = composer3.rememberedValue();
                                if (zChanged4 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue8 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$8$1
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                            invoke2(constrainScope);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReferenceComponent1.getBottom(), 0.0f, 0.0f, 6, null);
                                            ConstrainScope.centerHorizontallyTo$default(constrainAs, constrainAs.getParent(), 0.0f, 2, null);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue8);
                                }
                                composer3.endReplaceableGroup();
                                final ConstraintLayoutScope constraintLayoutScope5 = constraintLayoutScope2;
                                UpgradeObjectEventLevelKt.UpgradeObjectEventLevel(constraintLayoutScope5.constrainAs(modifierM8084offsetVpY3zN4$default, constrainedLayoutReferenceComponent2, (Function1) objRememberedValue8), z8, i17, i18, i16, i16 + 1, upgradeObjectEventImages.getCurrencyEventImage(), upgradeObjectEventStrings3.getLevelHintText(), z7, composer3, 0, 0);
                                Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._43wdp, composer3, 6));
                                composer3.startReplaceableGroup(1214220462);
                                boolean zChanged5 = composer3.changed(constrainedLayoutReferenceComponent2) | composer3.changed(constrainedLayoutReferenceComponent8);
                                Object objRememberedValue9 = composer3.rememberedValue();
                                if (zChanged5 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue9 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$9$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                            invoke2(constrainScope);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReferenceComponent2.getEnd(), 0.0f, 0.0f, 6, null);
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainedLayoutReferenceComponent8.getStart(), 0.0f, 0.0f, 6, null);
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue9);
                                }
                                composer3.endReplaceableGroup();
                                Modifier modifierConstrainAs2 = constraintLayoutScope5.constrainAs(modifierM8158height3ABfNKs, constrainedLayoutReferenceComponent6, (Function1) objRememberedValue9);
                                composer3.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion5.getTopStart(), false, composer3, 0);
                                composer3.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierConstrainAs2);
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
                                Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy, companion6.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion6.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion6.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                }
                                function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                Modifier modifierAlign = boxScopeInstance.align(companion4, companion5.getCenterEnd());
                                composer3.startReplaceableGroup(693286680);
                                MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion5.getTop(), composer3, 0);
                                composer3.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor4 = companion6.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierAlign);
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
                                Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRowMeasurePolicy3, companion6.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion6.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion6.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                    composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                    composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                }
                                function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                Modifier modifierM7771backgroundbw27NRU$default = BackgroundKt.m7771backgroundbw27NRU$default(SizeKt.m8177width3ABfNKs(SizeKt.fillMaxHeight$default(PaddingKt.m8127paddingqDBjuR0$default(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._13wdp, composer3, 6), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._106wdp, composer3, 6)), ColorResources_androidKt.colorResource(R.color.black, composer3, 6), null, 2, null);
                                Alignment center = companion5.getCenter();
                                composer3.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, composer3, 6);
                                composer3.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor5 = companion6.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierM7771backgroundbw27NRU$default);
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor5);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM10870constructorimpl5 = Updater.m10870constructorimpl(composer3);
                                Updater.m10877setimpl(composerM10870constructorimpl5, measurePolicyRememberBoxMeasurePolicy2, companion6.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl5, currentCompositionLocalMap5, companion6.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion6.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                    composerM10870constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                    composerM10870constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                }
                                function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                String strValueOf = String.valueOf(i19);
                                Modifier modifierAlign2 = boxScopeInstance.align(PaddingKt.m8127paddingqDBjuR0$default(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._18wdp, composer3, 6), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._7wdp, composer3, 6), 0.0f, 10, null), companion5.getCenter());
                                TextAlign.Companion companion7 = TextAlign.INSTANCE;
                                TextKt.m10024Text4IGK_g(strValueOf, modifierAlign2, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m13551boximpl(companion7.m13558getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._20wsp, 0L, companion7.m13558getCentere0LSkKk(), 0L, 0.0f, null, null, composer3, 12582918, 122), composer3, 0, 0, 65020);
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                ImageKt.Image(PainterResources_androidKt.painterResource(upgradeObjectEventImages.getGiftImage(), composer3, 0), (String) null, PaddingKt.m8124paddingVpY3zN4(BackgroundKt.background$default(SizeKt.m8177width3ABfNKs(SizeKt.fillMaxHeight$default(companion4, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._25wdp, composer3, 6)), brush2, null, 0.0f, 6, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._4wdp, composer3, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._9wdp, composer3, 6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                Modifier modifierAlign3 = boxScopeInstance.align(companion4, companion5.getCenterStart());
                                boolean z14 = !z7;
                                MutableState mutableState6 = mutableState2;
                                composer3.startReplaceableGroup(-1221339376);
                                boolean zChanged6 = composer3.changed(function010);
                                Object objRememberedValue10 = composer3.rememberedValue();
                                if (zChanged6 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                    final Function0 function022 = function010;
                                    objRememberedValue10 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$10$2$1
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
                                            function022.invoke();
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue10);
                                }
                                Function0 function023 = (Function0) objRememberedValue10;
                                composer3.endReplaceableGroup();
                                final Brush brush7 = brush3;
                                ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierAlign3, null, z14, mutableState6, true, false, false, false, null, 0, 0L, null, function023, ComposableLambdaKt.composableLambda(composer3, 1352068675, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$10$3
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer4, int i26) {
                                        if ((i26 & 11) != 2 || !composer4.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1352068675, i26, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMain.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UpgradeObjectEventMain.kt:619)");
                                            }
                                            Modifier.Companion companion8 = Modifier.INSTANCE;
                                            Modifier modifierBackground$default = BackgroundKt.background$default(SizeKt.m8172size3ABfNKs(companion8, PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composer4, 6)), brush7, RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._9wdp, composer4, 6)), 0.0f, 4, null);
                                            Alignment center2 = Alignment.INSTANCE.getCenter();
                                            composer4.startReplaceableGroup(733328855);
                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(center2, false, composer4, 6);
                                            composer4.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                            CompositionLocalMap currentCompositionLocalMap6 = composer4.getCurrentCompositionLocalMap();
                                            ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor6 = companion9.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierBackground$default);
                                            if (!(composer4.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor6);
                                            } else {
                                                composer4.useNode();
                                            }
                                            Composer composerM10870constructorimpl6 = Updater.m10870constructorimpl(composer4);
                                            Updater.m10877setimpl(composerM10870constructorimpl6, measurePolicyRememberBoxMeasurePolicy3, companion9.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl6, currentCompositionLocalMap6, companion9.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion9.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                                                composerM10870constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                                                composerM10870constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                                            }
                                            function3ModifierMaterializerOf6.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                            composer4.startReplaceableGroup(2058660585);
                                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                            IconKt.m9496Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_plus, composer4, 6), (String) null, SizeKt.m8172size3ABfNKs(companion8, PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composer4, 6)), Color.INSTANCE.m11377getWhite0d7_KjU(), composer4, 3128, 0);
                                            composer4.endReplaceableGroup();
                                            composer4.endNode();
                                            composer4.endReplaceableGroup();
                                            composer4.endReplaceableGroup();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                }), composer3, 27648, 3072, 4066);
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                Modifier modifierConstrainAs3 = constraintLayoutScope5.constrainAs(companion4, constrainedLayoutReferenceComponent8, new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$11
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                        invoke2(constrainScope);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                        VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                                        HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                                    }
                                });
                                MutableState mutableState7 = mutableState2;
                                long jTransformOrigin = TransformOriginKt.TransformOrigin(1.0f, 0.0f);
                                composer3.startReplaceableGroup(1214224356);
                                boolean zChanged7 = composer3.changed(z7) | composer3.changed(function0) | composer3.changed(function02);
                                Object objRememberedValue11 = composer3.rememberedValue();
                                if (zChanged7 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                    final boolean z15 = z7;
                                    final Function0 function024 = function0;
                                    final Function0 function025 = function02;
                                    objRememberedValue11 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$12$1
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
                                            if (z15) {
                                                function024.invoke();
                                            } else {
                                                function025.invoke();
                                            }
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue11);
                                }
                                composer3.endReplaceableGroup();
                                ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierConstrainAs3, null, false, mutableState7, false, false, false, false, null, 0, jTransformOrigin, null, (Function0) objRememberedValue11, composableSingletons$UpgradeObjectEventMainKt.m15036getLambda3$app_siteRelease(), composer3, 3072, 3072, 3062);
                                Modifier modifierBackground$default = BackgroundKt.background$default(SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._35wdp, composer3, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._124wdp, composer3, 6)), brush, null, 0.0f, 6, null);
                                composer3.startReplaceableGroup(1214225691);
                                boolean zChanged8 = composer3.changed(constrainedLayoutReferenceComponent3) | composer3.changed(f3);
                                Object objRememberedValue12 = composer3.rememberedValue();
                                if (zChanged8 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                                    final float f18 = f3;
                                    objRememberedValue12 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$13$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                            invoke2(constrainScope);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReferenceComponent3.getBottom(), f18, 0.0f, 4, null);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue12);
                                }
                                composer3.endReplaceableGroup();
                                Modifier modifierClip = ClipKt.clip(constraintLayoutScope5.constrainAs(modifierBackground$default, constrainedLayoutReferenceComponent4, (Function1) objRememberedValue12), RectangleShapeKt.getRectangleShape());
                                Alignment center2 = companion5.getCenter();
                                composer3.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(center2, false, composer3, 6);
                                composer3.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap6 = composer3.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor6 = companion6.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierClip);
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor6);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM10870constructorimpl6 = Updater.m10870constructorimpl(composer3);
                                Updater.m10877setimpl(composerM10870constructorimpl6, measurePolicyRememberBoxMeasurePolicy3, companion6.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl6, currentCompositionLocalMap6, companion6.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion6.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                                    composerM10870constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                                    composerM10870constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                                }
                                function3ModifierMaterializerOf6.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null);
                                Alignment center3 = companion5.getCenter();
                                composer3.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(center3, false, composer3, 6);
                                composer3.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap7 = composer3.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor7 = companion6.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default2);
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor7);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM10870constructorimpl7 = Updater.m10870constructorimpl(composer3);
                                Updater.m10877setimpl(composerM10870constructorimpl7, measurePolicyRememberBoxMeasurePolicy4, companion6.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl7, currentCompositionLocalMap7, companion6.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = companion6.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl7.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                                    composerM10870constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                                    composerM10870constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                                }
                                function3ModifierMaterializerOf7.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                GradientSphereKt.GradientSphere(OffsetKt.m8083offsetVpY3zN4(ScaleKt.scale(PaddingKt.m8127paddingqDBjuR0$default(SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._35wdp, composer3, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._103wdp, composer3, 6)), 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._23wdp, composer3, 6), 0.0f, 11, null), 1.0f, 0.5f), PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composer3, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._42wdp, composer3, 6)), SideEnum.BOTTOM_CENTER, null, new Pair[]{TuplesKt.m7112to(Float.valueOf(0.4f), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.turquoise, composer3, 6))), TuplesKt.m7112to(Float.valueOf(1.0f), Color.m11330boximpl(Color.INSTANCE.m11375getTransparent0d7_KjU()))}, 1.0f, ComposeExtensionKt.m14409dpToPx8Feqmps(PrimitiveResources_androidKt.dimensionResource(R.dimen._56wdp, composer3, 6), composer3, 0), composer3, 24624, 4);
                                Modifier modifierM8127paddingqDBjuR0$default2 = PaddingKt.m8127paddingqDBjuR0$default(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._133wdp, composer3, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._29wdp, composer3, 6)), 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._18wdp, composer3, 6), 0.0f, 11, null);
                                Alignment.Vertical centerVertically3 = companion5.getCenterVertically();
                                composer3.startReplaceableGroup(693286680);
                                MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically3, composer3, 48);
                                composer3.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap8 = composer3.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor8 = companion6.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default2);
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor8);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM10870constructorimpl8 = Updater.m10870constructorimpl(composer3);
                                Updater.m10877setimpl(composerM10870constructorimpl8, measurePolicyRowMeasurePolicy4, companion6.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl8, currentCompositionLocalMap8, companion6.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash8 = companion6.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl8.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                                    composerM10870constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
                                    composerM10870constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
                                }
                                function3ModifierMaterializerOf8.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                boolean z16 = false;
                                ImageKt.Image(PainterResources_androidKt.painterResource(upgradeObjectEventImages.getCurrencyEventImage(), composer3, 0), (String) null, SizeKt.m8172size3ABfNKs(PaddingKt.m8127paddingqDBjuR0$default(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer3, 6), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer3, 6), 0.0f, 10, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._36wdp, composer3, 6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                                TextKt.m10024Text4IGK_g(String.valueOf(i20), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14831montserratExtraBoldItalicCustomSp2884n0o(R.dimen._13wsp, 0L, 0, 0L, 0.0f, 0L, composer3, 1572870, 62), composer3, 0, 0, 65534);
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                Modifier modifierAlign4 = boxScopeInstance.align(SizeKt.fillMaxHeight$default(companion4, 0.0f, 1, null), companion5.getCenterEnd());
                                boolean z17 = !z7;
                                MutableState mutableState8 = mutableState2;
                                composer3.startReplaceableGroup(1445546368);
                                boolean zChanged9 = composer3.changed(function011);
                                Object objRememberedValue13 = composer3.rememberedValue();
                                if (zChanged9 || objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                                    final Function0 function026 = function011;
                                    objRememberedValue13 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$14$1$2$1
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
                                            function026.invoke();
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue13);
                                }
                                Function0 function027 = (Function0) objRememberedValue13;
                                composer3.endReplaceableGroup();
                                final Brush brush8 = brush3;
                                ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierAlign4, null, z17, mutableState8, true, false, false, false, null, 0, 0L, null, function027, ComposableLambdaKt.composableLambda(composer3, 666599488, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$14$1$3
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer4, int i26) {
                                        if ((i26 & 11) != 2 || !composer4.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(666599488, i26, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMain.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UpgradeObjectEventMain.kt:743)");
                                            }
                                            Modifier.Companion companion8 = Modifier.INSTANCE;
                                            Modifier modifierBackground$default2 = BackgroundKt.background$default(SizeKt.m8172size3ABfNKs(PaddingKt.m8127paddingqDBjuR0$default(companion8, PrimitiveResources_androidKt.dimensionResource(R.dimen._7wdp, composer4, 6), 0.0f, 0.0f, 0.0f, 14, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._22wdp, composer4, 6)), brush8, RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composer4, 6)), 0.0f, 4, null);
                                            Alignment center4 = Alignment.INSTANCE.getCenter();
                                            composer4.startReplaceableGroup(733328855);
                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(center4, false, composer4, 6);
                                            composer4.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                            CompositionLocalMap currentCompositionLocalMap9 = composer4.getCurrentCompositionLocalMap();
                                            ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor9 = companion9.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf9 = LayoutKt.modifierMaterializerOf(modifierBackground$default2);
                                            if (!(composer4.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor9);
                                            } else {
                                                composer4.useNode();
                                            }
                                            Composer composerM10870constructorimpl9 = Updater.m10870constructorimpl(composer4);
                                            Updater.m10877setimpl(composerM10870constructorimpl9, measurePolicyRememberBoxMeasurePolicy5, companion9.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl9, currentCompositionLocalMap9, companion9.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash9 = companion9.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl9.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
                                                composerM10870constructorimpl9.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash9));
                                                composerM10870constructorimpl9.apply(Integer.valueOf(currentCompositeKeyHash9), setCompositeKeyHash9);
                                            }
                                            function3ModifierMaterializerOf9.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                            composer4.startReplaceableGroup(2058660585);
                                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                            IconKt.m9496Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_info, composer4, 6), (String) null, SizeKt.m8172size3ABfNKs(companion8, PrimitiveResources_androidKt.dimensionResource(R.dimen._12wdp, composer4, 6)), Color.INSTANCE.m11377getWhite0d7_KjU(), composer4, 3128, 0);
                                            composer4.endReplaceableGroup();
                                            composer4.endNode();
                                            composer4.endReplaceableGroup();
                                            composer4.endReplaceableGroup();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                }), composer3, 27648, 3072, 4066);
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._40wdp, composer3, 6));
                                composer3.startReplaceableGroup(1214230226);
                                boolean zChanged10 = composer3.changed(constrainedLayoutReferenceComponent32) | composer3.changed(f4);
                                Object objRememberedValue14 = composer3.rememberedValue();
                                if (zChanged10 || objRememberedValue14 == Composer.INSTANCE.getEmpty()) {
                                    final float f19 = f4;
                                    objRememberedValue14 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$15$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                            invoke2(constrainScope);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReferenceComponent32.getStart(), 0.0f, 0.0f, 6, null);
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReferenceComponent32.getTop(), f19, 0.0f, 4, null);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue14);
                                }
                                composer3.endReplaceableGroup();
                                Modifier modifierConstrainAs4 = constraintLayoutScope5.constrainAs(modifierM8172size3ABfNKs, constrainedLayoutReferenceComponent14, (Function1) objRememberedValue14);
                                Brush brush9 = brush2;
                                boolean z18 = z8 && !z7;
                                MutableState mutableState9 = mutableState2;
                                boolean z19 = !z7;
                                Function0 function028 = function03;
                                composer3.startReplaceableGroup(1214230960);
                                boolean zChanged11 = composer3.changed(function04);
                                Object objRememberedValue15 = composer3.rememberedValue();
                                if (zChanged11 || objRememberedValue15 == Composer.INSTANCE.getEmpty()) {
                                    final Function0 function029 = function04;
                                    objRememberedValue15 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$16$1
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
                                            function029.invoke();
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue15);
                                }
                                Function0 function030 = (Function0) objRememberedValue15;
                                composer3.endReplaceableGroup();
                                final UpgradeObjectEventImages upgradeObjectEventImages3 = upgradeObjectEventImages;
                                ButtonContentBlockKt.m15069ButtonContentBlockkmJHe8M(modifierConstrainAs4, null, 0L, 0L, 0.0f, brush9, null, null, null, false, z18, mutableState9, true, z19, false, false, 200, function028, function030, ComposableLambdaKt.composableLambda(composer3, 491329473, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$17
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer4, int i26) {
                                        if ((i26 & 11) != 2 || !composer4.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(491329473, i26, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMain.<anonymous>.<anonymous>.<anonymous> (UpgradeObjectEventMain.kt:783)");
                                            }
                                            Alignment bottomCenter = Alignment.INSTANCE.getBottomCenter();
                                            UpgradeObjectEventImages upgradeObjectEventImages4 = upgradeObjectEventImages3;
                                            composer4.startReplaceableGroup(733328855);
                                            Modifier.Companion companion8 = Modifier.INSTANCE;
                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(bottomCenter, false, composer4, 6);
                                            composer4.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                            CompositionLocalMap currentCompositionLocalMap9 = composer4.getCurrentCompositionLocalMap();
                                            ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor9 = companion9.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf9 = LayoutKt.modifierMaterializerOf(companion8);
                                            if (!(composer4.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor9);
                                            } else {
                                                composer4.useNode();
                                            }
                                            Composer composerM10870constructorimpl9 = Updater.m10870constructorimpl(composer4);
                                            Updater.m10877setimpl(composerM10870constructorimpl9, measurePolicyRememberBoxMeasurePolicy5, companion9.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl9, currentCompositionLocalMap9, companion9.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash9 = companion9.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl9.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
                                                composerM10870constructorimpl9.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash9));
                                                composerM10870constructorimpl9.apply(Integer.valueOf(currentCompositeKeyHash9), setCompositeKeyHash9);
                                            }
                                            function3ModifierMaterializerOf9.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                            composer4.startReplaceableGroup(2058660585);
                                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                            ImageKt.Image(PainterResources_androidKt.painterResource(upgradeObjectEventImages4.getIcButtonBg(), composer4, 0), (String) null, SizeKt.m8158height3ABfNKs(companion8, PrimitiveResources_androidKt.dimensionResource(R.dimen._27wdp, composer4, 6)), (Alignment) null, ContentScale.INSTANCE.getFillHeight(), 0.0f, (ColorFilter) null, composer4, 24632, 104);
                                            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_three_silhouettes, composer4, 6), (String) null, SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion8, PrimitiveResources_androidKt.dimensionResource(R.dimen._25wdp, composer4, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._18wdp, composer4, 6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer4, 56, 120);
                                            composer4.endReplaceableGroup();
                                            composer4.endNode();
                                            composer4.endReplaceableGroup();
                                            composer4.endReplaceableGroup();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                }), composer3, 0, 806879664, 50142);
                                Modifier modifierM8172size3ABfNKs2 = SizeKt.m8172size3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._40wdp, composer3, 6));
                                composer3.startReplaceableGroup(1214232060);
                                boolean zChanged12 = composer3.changed(f5) | composer3.changed(f6);
                                Object objRememberedValue16 = composer3.rememberedValue();
                                if (zChanged12 || objRememberedValue16 == Composer.INSTANCE.getEmpty()) {
                                    final float f20 = f5;
                                    final float f21 = f6;
                                    objRememberedValue16 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$18$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                            invoke2(constrainScope);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), f20, 0.0f, 4, null);
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), f21, 0.0f, 4, null);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue16);
                                }
                                composer3.endReplaceableGroup();
                                Modifier modifierConstrainAs5 = constraintLayoutScope5.constrainAs(modifierM8172size3ABfNKs2, constrainedLayoutReferenceComponent32, (Function1) objRememberedValue16);
                                Brush brush10 = brush2;
                                if (!z8 && !z7) {
                                    z16 = true;
                                }
                                MutableState mutableState10 = mutableState2;
                                boolean z20 = !z7;
                                Function0 function031 = function03;
                                composer3.startReplaceableGroup(1214232804);
                                boolean zChanged13 = composer3.changed(function05);
                                Object objRememberedValue17 = composer3.rememberedValue();
                                if (zChanged13 || objRememberedValue17 == Composer.INSTANCE.getEmpty()) {
                                    final Function0 function032 = function05;
                                    objRememberedValue17 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$19$1
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
                                            function032.invoke();
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue17);
                                }
                                Function0 function033 = (Function0) objRememberedValue17;
                                composer3.endReplaceableGroup();
                                final UpgradeObjectEventImages upgradeObjectEventImages4 = upgradeObjectEventImages;
                                ButtonContentBlockKt.m15069ButtonContentBlockkmJHe8M(modifierConstrainAs5, null, 0L, 0L, 0.0f, brush10, null, null, null, false, z16, mutableState10, true, z20, false, false, 200, function031, function033, ComposableLambdaKt.composableLambda(composer3, -88489224, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$20
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer4, int i26) {
                                        if ((i26 & 11) != 2 || !composer4.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-88489224, i26, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMain.<anonymous>.<anonymous>.<anonymous> (UpgradeObjectEventMain.kt:819)");
                                            }
                                            Alignment bottomCenter = Alignment.INSTANCE.getBottomCenter();
                                            UpgradeObjectEventImages upgradeObjectEventImages5 = upgradeObjectEventImages4;
                                            composer4.startReplaceableGroup(733328855);
                                            Modifier.Companion companion8 = Modifier.INSTANCE;
                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(bottomCenter, false, composer4, 6);
                                            composer4.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                            CompositionLocalMap currentCompositionLocalMap9 = composer4.getCurrentCompositionLocalMap();
                                            ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor9 = companion9.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf9 = LayoutKt.modifierMaterializerOf(companion8);
                                            if (!(composer4.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor9);
                                            } else {
                                                composer4.useNode();
                                            }
                                            Composer composerM10870constructorimpl9 = Updater.m10870constructorimpl(composer4);
                                            Updater.m10877setimpl(composerM10870constructorimpl9, measurePolicyRememberBoxMeasurePolicy5, companion9.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl9, currentCompositionLocalMap9, companion9.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash9 = companion9.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl9.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
                                                composerM10870constructorimpl9.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash9));
                                                composerM10870constructorimpl9.apply(Integer.valueOf(currentCompositeKeyHash9), setCompositeKeyHash9);
                                            }
                                            function3ModifierMaterializerOf9.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                            composer4.startReplaceableGroup(2058660585);
                                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                            ImageKt.Image(PainterResources_androidKt.painterResource(upgradeObjectEventImages5.getIcButtonBg(), composer4, 0), (String) null, SizeKt.m8158height3ABfNKs(companion8, PrimitiveResources_androidKt.dimensionResource(R.dimen._27wdp, composer4, 6)), (Alignment) null, ContentScale.INSTANCE.getFillHeight(), 0.0f, (ColorFilter) null, composer4, 24632, 104);
                                            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_one_silhouette, composer4, 6), (String) null, SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion8, PrimitiveResources_androidKt.dimensionResource(R.dimen._14wdp, composer4, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._18wdp, composer4, 6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer4, 56, 120);
                                            composer4.endReplaceableGroup();
                                            composer4.endNode();
                                            composer4.endReplaceableGroup();
                                            composer4.endReplaceableGroup();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                }), composer3, 0, 806879664, 50142);
                                Boolean boolValueOf4 = Boolean.valueOf(z8);
                                final boolean z21 = z7;
                                final int i26 = i21;
                                final boolean z22 = z9;
                                final boolean z23 = z10;
                                final MutableState mutableState11 = mutableState2;
                                final Function0 function034 = function03;
                                final Function0 function035 = function012;
                                final boolean z24 = z11;
                                final Function0 function036 = function013;
                                final float f22 = f10;
                                final boolean z25 = z12;
                                final Function0 function037 = function014;
                                final UpgradeObjectEventImages upgradeObjectEventImages5 = upgradeObjectEventImages;
                                final int i27 = i22;
                                final float f23 = f11;
                                final UpgradeObjectEventStrings upgradeObjectEventStrings4 = upgradeObjectEventStrings3;
                                ComposeExtensionKt.IfTrue(boolValueOf4, ComposableLambdaKt.composableLambda(composer3, -1144739777, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$21
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer4, int i28) {
                                        if ((i28 & 11) != 2 || !composer4.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1144739777, i28, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMain.<anonymous>.<anonymous>.<anonymous> (UpgradeObjectEventMain.kt:837)");
                                            }
                                            Boolean boolValueOf5 = Boolean.valueOf(z21);
                                            final ConstraintLayoutScope constraintLayoutScope6 = constraintLayoutScope5;
                                            final ConstrainedLayoutReference constrainedLayoutReference = constrainedLayoutReferenceComponent9;
                                            final boolean z26 = z21;
                                            final boolean z27 = z24;
                                            final boolean z28 = z23;
                                            final MutableState<Boolean> mutableState12 = mutableState11;
                                            final Function0<Unit> function038 = function034;
                                            final Function0<Unit> function039 = function036;
                                            final ConstrainedLayoutReference constrainedLayoutReference2 = constrainedLayoutReferenceComponent10;
                                            final float f24 = f22;
                                            final boolean z29 = z25;
                                            final Function0<Unit> function040 = function037;
                                            final UpgradeObjectEventImages upgradeObjectEventImages6 = upgradeObjectEventImages5;
                                            final int i29 = i27;
                                            ComposeExtensionKt.IfFalse(boolValueOf5, ComposableLambdaKt.composableLambda(composer4, 1971383258, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$21.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                    invoke(composer5, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                @Composable
                                                public final void invoke(@Nullable Composer composer5, int i30) {
                                                    if ((i30 & 11) != 2 || !composer5.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(1971383258, i30, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMain.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UpgradeObjectEventMain.kt:838)");
                                                        }
                                                        ConstraintLayoutScope constraintLayoutScope7 = constraintLayoutScope6;
                                                        Modifier.Companion companion8 = Modifier.INSTANCE;
                                                        Modifier modifierConstrainAs6 = constraintLayoutScope7.constrainAs(OffsetKt.m8083offsetVpY3zN4(companion8, PrimitiveResources_androidKt.dimensionResource(R.dimen._160wdp, composer5, 6), C2046Dp.m13666constructorimpl(-PrimitiveResources_androidKt.dimensionResource(R.dimen._60wdp, composer5, 6))), constrainedLayoutReference, new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt.UpgradeObjectEventMain.1.1.21.1.1
                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                                                invoke2(constrainScope);
                                                                return Unit.INSTANCE;
                                                            }

                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                            public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                                                Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                                                ConstrainScope.centerVerticallyTo$default(constrainAs, constrainAs.getParent(), 0.0f, 2, null);
                                                                ConstrainScope.centerHorizontallyTo$default(constrainAs, constrainAs.getParent(), 0.0f, 2, null);
                                                            }
                                                        });
                                                        boolean z30 = false;
                                                        boolean z31 = (z26 || !z27 || z28) ? false : true;
                                                        MutableState<Boolean> mutableState13 = mutableState12;
                                                        Function0<Unit> function041 = function038;
                                                        Function0<Unit> function042 = function039;
                                                        final UpgradeObjectEventImages upgradeObjectEventImages7 = upgradeObjectEventImages6;
                                                        final int i31 = i29;
                                                        final boolean z32 = z27;
                                                        ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierConstrainAs6, null, z31, mutableState13, true, false, false, false, null, 0, 0L, function041, function042, ComposableLambdaKt.composableLambda(composer5, 1277074667, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt.UpgradeObjectEventMain.1.1.21.1.2
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(2);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function2
                                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                                invoke(composer6, num.intValue());
                                                                return Unit.INSTANCE;
                                                            }

                                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                            @Composable
                                                            public final void invoke(@Nullable Composer composer6, int i32) {
                                                                if ((i32 & 11) != 2 || !composer6.getSkipping()) {
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventStart(1277074667, i32, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMain.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UpgradeObjectEventMain.kt:854)");
                                                                    }
                                                                    UpgradeObjectEventButtonKt.UpgradeObjectEventButton(null, LayoutDirection.Rtl, upgradeObjectEventImages7.getCurrencyEventImage(), upgradeObjectEventImages7.getUpgradeImage(), i31, z32, Brush.Companion.m11289horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black, composer6, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.transparent, composer6, 6))}), 0.0f, 0.0f, 0, 14, (Object) null), composer6, 48, 1);
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventEnd();
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                composer6.skipToGroupEnd();
                                                            }
                                                        }), composer5, 27648, 3072, 2018);
                                                        Modifier modifierM8083offsetVpY3zN4 = OffsetKt.m8083offsetVpY3zN4(constraintLayoutScope6.constrainAs(OffsetKt.m8084offsetVpY3zN4$default(companion8, C2046Dp.m13666constructorimpl(-PrimitiveResources_androidKt.dimensionResource(R.dimen._35wdp, composer5, 6)), 0.0f, 2, null), constrainedLayoutReference2, new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt.UpgradeObjectEventMain.1.1.21.1.3
                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                                                invoke2(constrainScope);
                                                                return Unit.INSTANCE;
                                                            }

                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                            public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                                                Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                                                ConstrainScope.centerVerticallyTo$default(constrainAs, constrainAs.getParent(), 0.0f, 2, null);
                                                                ConstrainScope.centerHorizontallyTo$default(constrainAs, constrainAs.getParent(), 0.0f, 2, null);
                                                            }
                                                        }), f24, C2046Dp.m13666constructorimpl(-PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer5, 6)));
                                                        if (!z26 && z29 && !z28) {
                                                            z30 = true;
                                                        }
                                                        MutableState<Boolean> mutableState14 = mutableState12;
                                                        Function0<Unit> function043 = function038;
                                                        Function0<Unit> function044 = function040;
                                                        final UpgradeObjectEventImages upgradeObjectEventImages8 = upgradeObjectEventImages6;
                                                        final int i32 = i29;
                                                        final boolean z33 = z29;
                                                        ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierM8083offsetVpY3zN4, null, z30, mutableState14, true, false, false, false, null, 0, 0L, function043, function044, ComposableLambdaKt.composableLambda(composer5, 1796183892, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt.UpgradeObjectEventMain.1.1.21.1.4
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(2);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function2
                                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                                invoke(composer6, num.intValue());
                                                                return Unit.INSTANCE;
                                                            }

                                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                            @Composable
                                                            public final void invoke(@Nullable Composer composer6, int i33) {
                                                                if ((i33 & 11) != 2 || !composer6.getSkipping()) {
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventStart(1796183892, i33, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMain.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UpgradeObjectEventMain.kt:885)");
                                                                    }
                                                                    UpgradeObjectEventButtonKt.UpgradeObjectEventButton(null, null, upgradeObjectEventImages8.getCurrencyEventImage(), upgradeObjectEventImages8.getUpgradeImage(), i32, z33, Brush.Companion.m11289horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.transparent, composer6, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black, composer6, 6))}), 0.0f, 0.0f, 0, 14, (Object) null), composer6, 0, 3);
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventEnd();
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                composer6.skipToGroupEnd();
                                                            }
                                                        }), composer5, 27648, 3072, 2018);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer5.skipToGroupEnd();
                                                }
                                            }), composer4, 48);
                                            Modifier modifierConstrainAs6 = constraintLayoutScope5.constrainAs(OffsetKt.m8083offsetVpY3zN4(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._185wdp, composer4, 6), PrimitiveResources_androidKt.dimensionResource(i26, composer4, 0)), constrainedLayoutReferenceComponent11, new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$21.2
                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                                    invoke2(constrainScope);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                                    Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                                    ConstrainScope.centerVerticallyTo$default(constrainAs, constrainAs.getParent(), 0.0f, 2, null);
                                                    ConstrainScope.centerHorizontallyTo$default(constrainAs, constrainAs.getParent(), 0.0f, 2, null);
                                                }
                                            });
                                            boolean z30 = (z21 || !z22 || z23) ? false : true;
                                            MutableState<Boolean> mutableState13 = mutableState11;
                                            Function0<Unit> function041 = function034;
                                            Function0<Unit> function042 = function035;
                                            final UpgradeObjectEventImages upgradeObjectEventImages7 = upgradeObjectEventImages5;
                                            final int i30 = i27;
                                            final boolean z31 = z22;
                                            ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierConstrainAs6, null, z30, mutableState13, true, false, false, false, null, 0, 0L, function041, function042, ComposableLambdaKt.composableLambda(composer4, -1523561458, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$21.3
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                    invoke(composer5, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                @Composable
                                                public final void invoke(@Nullable Composer composer5, int i31) {
                                                    if ((i31 & 11) != 2 || !composer5.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-1523561458, i31, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMain.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UpgradeObjectEventMain.kt:915)");
                                                        }
                                                        UpgradeObjectEventButtonKt.UpgradeObjectEventButton(null, LayoutDirection.Rtl, upgradeObjectEventImages7.getCurrencyEventImage(), upgradeObjectEventImages7.getUpgradeImage(), i30, z31, Brush.Companion.m11289horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black, composer5, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.transparent, composer5, 6))}), 0.0f, 0.0f, 0, 14, (Object) null), composer5, 48, 1);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer5.skipToGroupEnd();
                                                }
                                            }), composer4, 27648, 3072, 2018);
                                            Boolean boolValueOf6 = Boolean.valueOf(z21);
                                            final ConstraintLayoutScope constraintLayoutScope7 = constraintLayoutScope5;
                                            final int i31 = i26;
                                            final ConstrainedLayoutReference constrainedLayoutReference3 = constrainedLayoutReferenceComponent12;
                                            final ConstrainedLayoutReference constrainedLayoutReference4 = constrainedLayoutReferenceComponent11;
                                            final float f25 = f23;
                                            final UpgradeObjectEventStrings upgradeObjectEventStrings5 = upgradeObjectEventStrings4;
                                            ComposeExtensionKt.IfTrue(boolValueOf6, ComposableLambdaKt.composableLambda(composer4, 160137495, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$21.4
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                    invoke(composer5, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                @Composable
                                                public final void invoke(@Nullable Composer composer5, int i32) {
                                                    if ((i32 & 11) == 2 && composer5.getSkipping()) {
                                                        composer5.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(160137495, i32, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMain.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UpgradeObjectEventMain.kt:930)");
                                                    }
                                                    ConstraintLayoutScope constraintLayoutScope8 = constraintLayoutScope7;
                                                    Modifier modifierM8083offsetVpY3zN4 = OffsetKt.m8083offsetVpY3zN4(SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._40wdp, composer5, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._169wdp, composer5, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._185wdp, composer5, 6), PrimitiveResources_androidKt.dimensionResource(i31, composer5, 0));
                                                    ConstrainedLayoutReference constrainedLayoutReference5 = constrainedLayoutReference3;
                                                    composer5.startReplaceableGroup(1445556582);
                                                    boolean zChanged14 = composer5.changed(constrainedLayoutReference4) | composer5.changed(f25);
                                                    final ConstrainedLayoutReference constrainedLayoutReference6 = constrainedLayoutReference4;
                                                    final float f26 = f25;
                                                    Object objRememberedValue18 = composer5.rememberedValue();
                                                    if (zChanged14 || objRememberedValue18 == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue18 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$21$4$1$1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                                                invoke2(constrainScope);
                                                                return Unit.INSTANCE;
                                                            }

                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                            public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                                                Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReference6.getStart(), f26, 0.0f, 4, null);
                                                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReference6.getTop(), 0.0f, 0.0f, 6, null);
                                                            }
                                                        };
                                                        composer5.updateRememberedValue(objRememberedValue18);
                                                    }
                                                    composer5.endReplaceableGroup();
                                                    Modifier modifierConstrainAs7 = constraintLayoutScope8.constrainAs(modifierM8083offsetVpY3zN4, constrainedLayoutReference5, (Function1) objRememberedValue18);
                                                    final UpgradeObjectEventStrings upgradeObjectEventStrings6 = upgradeObjectEventStrings5;
                                                    CloudArrowBottomBlockKt.CloudArrowBottomBlock(modifierConstrainAs7, null, ComposableLambdaKt.composableLambda(composer5, -786718568, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt.UpgradeObjectEventMain.1.1.21.4.2
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                            invoke(composer6, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                        @Composable
                                                        public final void invoke(@Nullable Composer composer6, int i33) {
                                                            if ((i33 & 11) != 2 || !composer6.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(-786718568, i33, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMain.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UpgradeObjectEventMain.kt:946)");
                                                                }
                                                                TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(upgradeObjectEventStrings6.getUpgradeHintText(), composer6, 0), (Modifier) Modifier.INSTANCE, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14843montserratMediumCustomSpbl3sdaw(R.dimen._8wsp, 0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, composer6, 196614, 26), composer6, 48, 3072, 57340);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            composer6.skipToGroupEnd();
                                                        }
                                                    }), composer5, 384, 2);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }), composer4, 48);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                }), composer3, 48);
                                Boolean boolValueOf5 = Boolean.valueOf(z8);
                                final float f24 = f4;
                                final boolean z26 = z7;
                                final Brush brush11 = brush2;
                                final MutableState mutableState12 = mutableState2;
                                final Function0 function038 = function015;
                                final float f25 = f6;
                                final float f26 = f5;
                                final Function0 function039 = function016;
                                final UpgradeObjectEventImages upgradeObjectEventImages6 = upgradeObjectEventImages;
                                final UpgradeObjectEventStrings upgradeObjectEventStrings5 = upgradeObjectEventStrings3;
                                ComposeExtensionKt.IfTrue(boolValueOf5, ComposableLambdaKt.composableLambda(composer3, -533596224, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$22
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer4, int i28) {
                                        if ((i28 & 11) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-533596224, i28, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMain.<anonymous>.<anonymous>.<anonymous> (UpgradeObjectEventMain.kt:959)");
                                        }
                                        ConstraintLayoutScope constraintLayoutScope6 = constraintLayoutScope5;
                                        Modifier.Companion companion8 = Modifier.INSTANCE;
                                        Modifier modifierM8172size3ABfNKs3 = SizeKt.m8172size3ABfNKs(companion8, PrimitiveResources_androidKt.dimensionResource(R.dimen._40wdp, composer4, 6));
                                        ConstrainedLayoutReference constrainedLayoutReference = constrainedLayoutReferenceComponent122;
                                        composer4.startReplaceableGroup(-1221322108);
                                        boolean zChanged14 = composer4.changed(constrainedLayoutReferenceComponent142) | composer4.changed(f24);
                                        final ConstrainedLayoutReference constrainedLayoutReference2 = constrainedLayoutReferenceComponent142;
                                        final float f27 = f24;
                                        Object objRememberedValue18 = composer4.rememberedValue();
                                        if (zChanged14 || objRememberedValue18 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue18 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$22$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                                    invoke2(constrainScope);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                                    Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainedLayoutReference2.getEnd(), 0.0f, 0.0f, 6, null);
                                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReference2.getTop(), f27, 0.0f, 4, null);
                                                }
                                            };
                                            composer4.updateRememberedValue(objRememberedValue18);
                                        }
                                        composer4.endReplaceableGroup();
                                        Modifier modifierConstrainAs6 = constraintLayoutScope6.constrainAs(modifierM8172size3ABfNKs3, constrainedLayoutReference, (Function1) objRememberedValue18);
                                        boolean z27 = !z26;
                                        Brush brush12 = brush11;
                                        MutableState<Boolean> mutableState13 = mutableState12;
                                        composer4.startReplaceableGroup(-1221321576);
                                        boolean zChanged15 = composer4.changed(function038);
                                        final Function0<Unit> function040 = function038;
                                        Object objRememberedValue19 = composer4.rememberedValue();
                                        if (zChanged15 || objRememberedValue19 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue19 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$22$2$1
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
                                                    function040.invoke();
                                                }
                                            };
                                            composer4.updateRememberedValue(objRememberedValue19);
                                        }
                                        composer4.endReplaceableGroup();
                                        final UpgradeObjectEventImages upgradeObjectEventImages7 = upgradeObjectEventImages6;
                                        ButtonContentBlockKt.m15069ButtonContentBlockkmJHe8M(modifierConstrainAs6, null, 0L, 0L, 0.0f, brush12, null, null, null, false, z27, mutableState13, true, false, false, false, 0, null, (Function0) objRememberedValue19, ComposableLambdaKt.composableLambda(composer4, -220531885, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$22.3
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                invoke(composer5, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                            @Composable
                                            public final void invoke(@Nullable Composer composer5, int i29) {
                                                if ((i29 & 11) != 2 || !composer5.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-220531885, i29, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMain.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UpgradeObjectEventMain.kt:975)");
                                                    }
                                                    Alignment bottomCenter = Alignment.INSTANCE.getBottomCenter();
                                                    UpgradeObjectEventImages upgradeObjectEventImages8 = upgradeObjectEventImages7;
                                                    composer5.startReplaceableGroup(733328855);
                                                    Modifier.Companion companion9 = Modifier.INSTANCE;
                                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(bottomCenter, false, composer5, 6);
                                                    composer5.startReplaceableGroup(-1323940314);
                                                    int currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                    CompositionLocalMap currentCompositionLocalMap9 = composer5.getCurrentCompositionLocalMap();
                                                    ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                                                    Function0<ComposeUiNode> constructor9 = companion10.getConstructor();
                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf9 = LayoutKt.modifierMaterializerOf(companion9);
                                                    if (!(composer5.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer5.startReusableNode();
                                                    if (composer5.getInserting()) {
                                                        composer5.createNode(constructor9);
                                                    } else {
                                                        composer5.useNode();
                                                    }
                                                    Composer composerM10870constructorimpl9 = Updater.m10870constructorimpl(composer5);
                                                    Updater.m10877setimpl(composerM10870constructorimpl9, measurePolicyRememberBoxMeasurePolicy5, companion10.getSetMeasurePolicy());
                                                    Updater.m10877setimpl(composerM10870constructorimpl9, currentCompositionLocalMap9, companion10.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash9 = companion10.getSetCompositeKeyHash();
                                                    if (composerM10870constructorimpl9.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
                                                        composerM10870constructorimpl9.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash9));
                                                        composerM10870constructorimpl9.apply(Integer.valueOf(currentCompositeKeyHash9), setCompositeKeyHash9);
                                                    }
                                                    function3ModifierMaterializerOf9.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer5)), composer5, 0);
                                                    composer5.startReplaceableGroup(2058660585);
                                                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                                    ImageKt.Image(PainterResources_androidKt.painterResource(upgradeObjectEventImages8.getIcReward(), composer5, 0), (String) null, SizeKt.m8172size3ABfNKs(companion9, PrimitiveResources_androidKt.dimensionResource(R.dimen._25wdp, composer5, 6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer5, 56, 120);
                                                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_three_silhouettes, composer5, 6), (String) null, SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion9, PrimitiveResources_androidKt.dimensionResource(R.dimen._25wdp, composer5, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._18wdp, composer5, 6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer5, 56, 120);
                                                    composer5.endReplaceableGroup();
                                                    composer5.endNode();
                                                    composer5.endReplaceableGroup();
                                                    composer5.endReplaceableGroup();
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer5.skipToGroupEnd();
                                            }
                                        }), composer4, 0, 805306800, 254942);
                                        Boolean boolValueOf6 = Boolean.valueOf(z26);
                                        final ConstraintLayoutScope constraintLayoutScope7 = constraintLayoutScope5;
                                        final ConstrainedLayoutReference constrainedLayoutReference3 = constrainedLayoutReferenceComponent132;
                                        final ConstrainedLayoutReference constrainedLayoutReference4 = constrainedLayoutReferenceComponent122;
                                        final UpgradeObjectEventStrings upgradeObjectEventStrings6 = upgradeObjectEventStrings5;
                                        ComposeExtensionKt.IfTrue(boolValueOf6, ComposableLambdaKt.composableLambda(composer4, 771281048, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$22.4
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                invoke(composer5, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                            @Composable
                                            public final void invoke(@Nullable Composer composer5, int i29) {
                                                if ((i29 & 11) == 2 && composer5.getSkipping()) {
                                                    composer5.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(771281048, i29, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMain.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UpgradeObjectEventMain.kt:992)");
                                                }
                                                ConstraintLayoutScope constraintLayoutScope8 = constraintLayoutScope7;
                                                Modifier modifierM8177width3ABfNKs = SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composer5, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._162wdp, composer5, 6));
                                                ConstrainedLayoutReference constrainedLayoutReference5 = constrainedLayoutReference3;
                                                composer5.startReplaceableGroup(1445559440);
                                                boolean zChanged16 = composer5.changed(constrainedLayoutReference4);
                                                final ConstrainedLayoutReference constrainedLayoutReference6 = constrainedLayoutReference4;
                                                Object objRememberedValue20 = composer5.rememberedValue();
                                                if (zChanged16 || objRememberedValue20 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue20 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$22$4$1$1
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                                            invoke2(constrainScope);
                                                            return Unit.INSTANCE;
                                                        }

                                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                        public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                                            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainedLayoutReference6.getStart(), 0.0f, 0.0f, 6, null);
                                                            ConstrainScope.centerVerticallyTo$default(constrainAs, constrainedLayoutReference6, 0.0f, 2, null);
                                                        }
                                                    };
                                                    composer5.updateRememberedValue(objRememberedValue20);
                                                }
                                                composer5.endReplaceableGroup();
                                                Modifier modifierConstrainAs7 = constraintLayoutScope8.constrainAs(modifierM8177width3ABfNKs, constrainedLayoutReference5, (Function1) objRememberedValue20);
                                                final UpgradeObjectEventStrings upgradeObjectEventStrings7 = upgradeObjectEventStrings6;
                                                CloudArrowRightBlockKt.CloudArrowRightBlock(modifierConstrainAs7, null, null, null, null, null, null, ComposableLambdaKt.composableLambda(composer5, -933813135, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt.UpgradeObjectEventMain.1.1.22.4.2
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                        invoke(composer6, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                    @Composable
                                                    public final void invoke(@Nullable Composer composer6, int i30) {
                                                        if ((i30 & 11) != 2 || !composer6.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(-933813135, i30, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMain.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UpgradeObjectEventMain.kt:1001)");
                                                            }
                                                            TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(upgradeObjectEventStrings7.getTopListPersonalHintText(), composer6, 0), (Modifier) Modifier.INSTANCE, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14843montserratMediumCustomSpbl3sdaw(R.dimen._8wsp, 0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, composer6, 196614, 26), composer6, 48, 3072, 57340);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        composer6.skipToGroupEnd();
                                                    }
                                                }), composer5, 12582912, 126);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }), composer4, 48);
                                        ConstraintLayoutScope constraintLayoutScope8 = constraintLayoutScope5;
                                        Modifier modifierM8172size3ABfNKs4 = SizeKt.m8172size3ABfNKs(companion8, PrimitiveResources_androidKt.dimensionResource(R.dimen._40wdp, composer4, 6));
                                        ConstrainedLayoutReference constrainedLayoutReference5 = constrainedLayoutReferenceComponent142;
                                        composer4.startReplaceableGroup(-1221319433);
                                        boolean zChanged16 = composer4.changed(f25) | composer4.changed(f26);
                                        final float f28 = f25;
                                        final float f29 = f26;
                                        Object objRememberedValue20 = composer4.rememberedValue();
                                        if (zChanged16 || objRememberedValue20 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue20 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$22$5$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                                    invoke2(constrainScope);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                                    Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), f28, 0.0f, 4, null);
                                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), f29, 0.0f, 4, null);
                                                }
                                            };
                                            composer4.updateRememberedValue(objRememberedValue20);
                                        }
                                        composer4.endReplaceableGroup();
                                        Modifier modifierConstrainAs7 = constraintLayoutScope8.constrainAs(modifierM8172size3ABfNKs4, constrainedLayoutReference5, (Function1) objRememberedValue20);
                                        boolean z28 = !z26;
                                        Brush brush13 = brush11;
                                        MutableState<Boolean> mutableState14 = mutableState12;
                                        composer4.startReplaceableGroup(-1221318868);
                                        boolean zChanged17 = composer4.changed(function039);
                                        final Function0<Unit> function041 = function039;
                                        Object objRememberedValue21 = composer4.rememberedValue();
                                        if (zChanged17 || objRememberedValue21 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue21 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$22$6$1
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
                                                    function041.invoke();
                                                }
                                            };
                                            composer4.updateRememberedValue(objRememberedValue21);
                                        }
                                        composer4.endReplaceableGroup();
                                        final UpgradeObjectEventImages upgradeObjectEventImages8 = upgradeObjectEventImages6;
                                        ButtonContentBlockKt.m15069ButtonContentBlockkmJHe8M(modifierConstrainAs7, null, 0L, 0L, 0.0f, brush13, null, null, null, false, z28, mutableState14, true, false, false, false, 0, null, (Function0) objRememberedValue21, ComposableLambdaKt.composableLambda(composer4, -95114806, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$22.7
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                invoke(composer5, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                            @Composable
                                            public final void invoke(@Nullable Composer composer5, int i29) {
                                                if ((i29 & 11) != 2 || !composer5.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-95114806, i29, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMain.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UpgradeObjectEventMain.kt:1028)");
                                                    }
                                                    Alignment bottomCenter = Alignment.INSTANCE.getBottomCenter();
                                                    UpgradeObjectEventImages upgradeObjectEventImages9 = upgradeObjectEventImages8;
                                                    composer5.startReplaceableGroup(733328855);
                                                    Modifier.Companion companion9 = Modifier.INSTANCE;
                                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(bottomCenter, false, composer5, 6);
                                                    composer5.startReplaceableGroup(-1323940314);
                                                    int currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                    CompositionLocalMap currentCompositionLocalMap9 = composer5.getCurrentCompositionLocalMap();
                                                    ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                                                    Function0<ComposeUiNode> constructor9 = companion10.getConstructor();
                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf9 = LayoutKt.modifierMaterializerOf(companion9);
                                                    if (!(composer5.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer5.startReusableNode();
                                                    if (composer5.getInserting()) {
                                                        composer5.createNode(constructor9);
                                                    } else {
                                                        composer5.useNode();
                                                    }
                                                    Composer composerM10870constructorimpl9 = Updater.m10870constructorimpl(composer5);
                                                    Updater.m10877setimpl(composerM10870constructorimpl9, measurePolicyRememberBoxMeasurePolicy5, companion10.getSetMeasurePolicy());
                                                    Updater.m10877setimpl(composerM10870constructorimpl9, currentCompositionLocalMap9, companion10.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash9 = companion10.getSetCompositeKeyHash();
                                                    if (composerM10870constructorimpl9.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
                                                        composerM10870constructorimpl9.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash9));
                                                        composerM10870constructorimpl9.apply(Integer.valueOf(currentCompositeKeyHash9), setCompositeKeyHash9);
                                                    }
                                                    function3ModifierMaterializerOf9.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer5)), composer5, 0);
                                                    composer5.startReplaceableGroup(2058660585);
                                                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                                    ImageKt.Image(PainterResources_androidKt.painterResource(upgradeObjectEventImages9.getIcReward(), composer5, 0), (String) null, SizeKt.m8172size3ABfNKs(companion9, PrimitiveResources_androidKt.dimensionResource(R.dimen._25wdp, composer5, 6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer5, 56, 120);
                                                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_one_silhouette, composer5, 6), (String) null, SizeKt.m8158height3ABfNKs(companion9, PrimitiveResources_androidKt.dimensionResource(R.dimen._18wdp, composer5, 6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer5, 56, 120);
                                                    composer5.endReplaceableGroup();
                                                    composer5.endNode();
                                                    composer5.endReplaceableGroup();
                                                    composer5.endReplaceableGroup();
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer5.skipToGroupEnd();
                                            }
                                        }), composer4, 0, 805306800, 254942);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), composer3, 48);
                                Boolean boolValueOf6 = Boolean.valueOf(z8);
                                final UpgradeObjectEventImages upgradeObjectEventImages7 = upgradeObjectEventImages;
                                final UpgradeObjectEventStrings upgradeObjectEventStrings6 = upgradeObjectEventStrings3;
                                final List list3 = list2;
                                ComposeExtensionKt.IfFalse(boolValueOf6, ComposableLambdaKt.composableLambda(composer3, -698914359, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$23
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer4, int i28) {
                                        if ((i28 & 11) != 2 || !composer4.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-698914359, i28, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMain.<anonymous>.<anonymous>.<anonymous> (UpgradeObjectEventMain.kt:1045)");
                                            }
                                            Modifier modifierConstrainAs6 = constraintLayoutScope5.constrainAs(SizeKt.m8177width3ABfNKs(PaddingKt.m8127paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._36wdp, composer4, 6), 0.0f, 0.0f, 13, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._233wdp, composer4, 6)), constrainedLayoutReferenceComponent13, new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$23.1
                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                                    invoke2(constrainScope);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                                    Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                                                }
                                            });
                                            UpgradeObjectEventImages upgradeObjectEventImages8 = upgradeObjectEventImages7;
                                            UpgradeObjectEventStrings upgradeObjectEventStrings7 = upgradeObjectEventStrings6;
                                            List<UpgradeObjectEventTopListOfServersItem> list4 = list3;
                                            composer4.startReplaceableGroup(733328855);
                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer4, 0);
                                            composer4.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                            CompositionLocalMap currentCompositionLocalMap9 = composer4.getCurrentCompositionLocalMap();
                                            ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor9 = companion8.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf9 = LayoutKt.modifierMaterializerOf(modifierConstrainAs6);
                                            if (!(composer4.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor9);
                                            } else {
                                                composer4.useNode();
                                            }
                                            Composer composerM10870constructorimpl9 = Updater.m10870constructorimpl(composer4);
                                            Updater.m10877setimpl(composerM10870constructorimpl9, measurePolicyRememberBoxMeasurePolicy5, companion8.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl9, currentCompositionLocalMap9, companion8.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash9 = companion8.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl9.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
                                                composerM10870constructorimpl9.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash9));
                                                composerM10870constructorimpl9.apply(Integer.valueOf(currentCompositeKeyHash9), setCompositeKeyHash9);
                                            }
                                            function3ModifierMaterializerOf9.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                            composer4.startReplaceableGroup(2058660585);
                                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                            UpgradeObjectEventTopServersKt.UpgradeObjectEventTopServers(null, list4, upgradeObjectEventImages8.getIcReward(), upgradeObjectEventStrings7.getTopServerTitle(), composer4, 64, 1);
                                            composer4.endReplaceableGroup();
                                            composer4.endNode();
                                            composer4.endReplaceableGroup();
                                            composer4.endReplaceableGroup();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                }), composer3, 48);
                                Boolean boolValueOf7 = Boolean.valueOf(z7);
                                final float f27 = f12;
                                final UpgradeObjectEventStrings upgradeObjectEventStrings7 = upgradeObjectEventStrings3;
                                ComposeExtensionKt.IfTrue(boolValueOf7, ComposableLambdaKt.composableLambda(composer3, 77547329, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$24
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer4, int i28) {
                                        if ((i28 & 11) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(77547329, i28, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMain.<anonymous>.<anonymous>.<anonymous> (UpgradeObjectEventMain.kt:1062)");
                                        }
                                        ConstraintLayoutScope constraintLayoutScope6 = constraintLayoutScope5;
                                        Modifier.Companion companion8 = Modifier.INSTANCE;
                                        Modifier modifierM8177width3ABfNKs = SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion8, PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composer4, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._162wdp, composer4, 6));
                                        ConstrainedLayoutReference constrainedLayoutReference = constrainedLayoutReferenceComponent5;
                                        composer4.startReplaceableGroup(-1221316951);
                                        boolean zChanged14 = composer4.changed(constrainedLayoutReferenceComponent4);
                                        final ConstrainedLayoutReference constrainedLayoutReference2 = constrainedLayoutReferenceComponent4;
                                        Object objRememberedValue18 = composer4.rememberedValue();
                                        if (zChanged14 || objRememberedValue18 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue18 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$24$1$1
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                                    invoke2(constrainScope);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                                    Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReference2.getEnd(), 0.0f, 0.0f, 6, null);
                                                    ConstrainScope.centerVerticallyTo$default(constrainAs, constrainedLayoutReference2, 0.0f, 2, null);
                                                }
                                            };
                                            composer4.updateRememberedValue(objRememberedValue18);
                                        }
                                        composer4.endReplaceableGroup();
                                        Modifier modifierConstrainAs6 = constraintLayoutScope6.constrainAs(modifierM8177width3ABfNKs, constrainedLayoutReference, (Function1) objRememberedValue18);
                                        final UpgradeObjectEventStrings upgradeObjectEventStrings8 = upgradeObjectEventStrings7;
                                        CloudArrowLeftBlockKt.CloudArrowLeftBlock(modifierConstrainAs6, null, null, null, null, null, null, ComposableLambdaKt.composableLambda(composer4, -243899327, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$24.2
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                invoke(composer5, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                            @Composable
                                            public final void invoke(@Nullable Composer composer5, int i29) {
                                                if ((i29 & 11) != 2 || !composer5.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-243899327, i29, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMain.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UpgradeObjectEventMain.kt:1071)");
                                                    }
                                                    TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(upgradeObjectEventStrings8.getCurrencyHintText(), composer5, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14843montserratMediumCustomSpbl3sdaw(R.dimen._8wsp, 0L, TextAlign.INSTANCE.m13563getStarte0LSkKk(), 0L, 0.0f, composer5, 196614, 26), composer5, 0, 3072, 57342);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer5.skipToGroupEnd();
                                            }
                                        }), composer4, 12582912, 126);
                                        ConstraintLayoutScope constraintLayoutScope7 = constraintLayoutScope5;
                                        Modifier modifierM8177width3ABfNKs2 = SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion8, PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composer4, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._162wdp, composer4, 6));
                                        ConstrainedLayoutReference constrainedLayoutReference3 = constrainedLayoutReferenceComponent22;
                                        composer4.startReplaceableGroup(-1221316093);
                                        boolean zChanged15 = composer4.changed(constrainedLayoutReferenceComponent14);
                                        final ConstrainedLayoutReference constrainedLayoutReference4 = constrainedLayoutReferenceComponent14;
                                        Object objRememberedValue19 = composer4.rememberedValue();
                                        if (zChanged15 || objRememberedValue19 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue19 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$24$3$1
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                                    invoke2(constrainScope);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                                    Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReference4.getEnd(), 0.0f, 0.0f, 6, null);
                                                    ConstrainScope.centerVerticallyTo$default(constrainAs, constrainedLayoutReference4, 0.0f, 2, null);
                                                }
                                            };
                                            composer4.updateRememberedValue(objRememberedValue19);
                                        }
                                        composer4.endReplaceableGroup();
                                        Modifier modifierConstrainAs7 = constraintLayoutScope7.constrainAs(modifierM8177width3ABfNKs2, constrainedLayoutReference3, (Function1) objRememberedValue19);
                                        final UpgradeObjectEventStrings upgradeObjectEventStrings9 = upgradeObjectEventStrings7;
                                        CloudArrowLeftBlockKt.CloudArrowLeftBlock(modifierConstrainAs7, null, null, null, null, null, null, ComposableLambdaKt.composableLambda(composer4, 636318584, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$24.4
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                invoke(composer5, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                            @Composable
                                            public final void invoke(@Nullable Composer composer5, int i29) {
                                                if ((i29 & 11) != 2 || !composer5.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(636318584, i29, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMain.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UpgradeObjectEventMain.kt:1089)");
                                                    }
                                                    TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(upgradeObjectEventStrings9.getSwitchMainText(), composer5, 0), (Modifier) Modifier.INSTANCE, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14843montserratMediumCustomSpbl3sdaw(R.dimen._8wsp, 0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, composer5, 196614, 26), composer5, 48, 3072, 57340);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer5.skipToGroupEnd();
                                            }
                                        }), composer4, 12582912, 126);
                                        ConstraintLayoutScope constraintLayoutScope8 = constraintLayoutScope5;
                                        Modifier modifierM8177width3ABfNKs3 = SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion8, PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composer4, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._169wdp, composer4, 6));
                                        ConstrainedLayoutReference constrainedLayoutReference5 = constrainedLayoutReferenceComponent42;
                                        composer4.startReplaceableGroup(-1221315157);
                                        boolean zChanged16 = composer4.changed(constrainedLayoutReferenceComponent32);
                                        final ConstrainedLayoutReference constrainedLayoutReference6 = constrainedLayoutReferenceComponent32;
                                        Object objRememberedValue20 = composer4.rememberedValue();
                                        if (zChanged16 || objRememberedValue20 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue20 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$24$5$1
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                                    invoke2(constrainScope);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                                    Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReference6.getEnd(), 0.0f, 0.0f, 6, null);
                                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReference6.getTop(), 0.0f, 0.0f, 6, null);
                                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReference6.getBottom(), 0.0f, 0.0f, 6, null);
                                                }
                                            };
                                            composer4.updateRememberedValue(objRememberedValue20);
                                        }
                                        composer4.endReplaceableGroup();
                                        Modifier modifierConstrainAs8 = constraintLayoutScope8.constrainAs(modifierM8177width3ABfNKs3, constrainedLayoutReference5, (Function1) objRememberedValue20);
                                        final UpgradeObjectEventStrings upgradeObjectEventStrings10 = upgradeObjectEventStrings7;
                                        CloudArrowLeftBlockKt.CloudArrowLeftBlock(modifierConstrainAs8, null, null, null, null, null, null, ComposableLambdaKt.composableLambda(composer4, 692113849, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$24.6
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                invoke(composer5, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                            @Composable
                                            public final void invoke(@Nullable Composer composer5, int i29) {
                                                if ((i29 & 11) != 2 || !composer5.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(692113849, i29, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMain.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UpgradeObjectEventMain.kt:1109)");
                                                    }
                                                    TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(upgradeObjectEventStrings10.getSwitchPersonalText(), composer5, 0), (Modifier) Modifier.INSTANCE, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14843montserratMediumCustomSpbl3sdaw(R.dimen._8wsp, 0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, composer5, 196614, 26), composer5, 48, 3072, 57340);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer5.skipToGroupEnd();
                                            }
                                        }), composer4, 12582912, 126);
                                        ConstraintLayoutScope constraintLayoutScope9 = constraintLayoutScope5;
                                        Modifier modifierM8177width3ABfNKs4 = SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion8, PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composer4, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._169wdp, composer4, 6));
                                        ConstrainedLayoutReference constrainedLayoutReference7 = constrainedLayoutReferenceComponent15;
                                        composer4.startReplaceableGroup(-1221314150);
                                        boolean zChanged17 = composer4.changed(constrainedLayoutReferenceComponent142);
                                        final ConstrainedLayoutReference constrainedLayoutReference8 = constrainedLayoutReferenceComponent142;
                                        Object objRememberedValue21 = composer4.rememberedValue();
                                        if (zChanged17 || objRememberedValue21 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue21 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$24$7$1
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                                    invoke2(constrainScope);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                                    Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainedLayoutReference8.getStart(), 0.0f, 0.0f, 6, null);
                                                    ConstrainScope.centerVerticallyTo$default(constrainAs, constrainedLayoutReference8, 0.0f, 2, null);
                                                }
                                            };
                                            composer4.updateRememberedValue(objRememberedValue21);
                                        }
                                        composer4.endReplaceableGroup();
                                        Modifier modifierConstrainAs9 = constraintLayoutScope9.constrainAs(modifierM8177width3ABfNKs4, constrainedLayoutReference7, (Function1) objRememberedValue21);
                                        final UpgradeObjectEventStrings upgradeObjectEventStrings11 = upgradeObjectEventStrings7;
                                        CloudArrowRightBlockKt.CloudArrowRightBlock(modifierConstrainAs9, null, null, null, null, null, null, ComposableLambdaKt.composableLambda(composer4, 1922639898, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$24.8
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                invoke(composer5, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                            @Composable
                                            public final void invoke(@Nullable Composer composer5, int i29) {
                                                if ((i29 & 11) != 2 || !composer5.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1922639898, i29, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMain.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UpgradeObjectEventMain.kt:1128)");
                                                    }
                                                    TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(upgradeObjectEventStrings11.getTopListHintText(), composer5, 0), (Modifier) Modifier.INSTANCE, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14843montserratMediumCustomSpbl3sdaw(R.dimen._8wsp, 0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, composer5, 196614, 26), composer5, 48, 3072, 57340);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer5.skipToGroupEnd();
                                            }
                                        }), composer4, 12582912, 126);
                                        ConstraintLayoutScope constraintLayoutScope10 = constraintLayoutScope5;
                                        Modifier modifierM8177width3ABfNKs5 = SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion8, PrimitiveResources_androidKt.dimensionResource(R.dimen._41wdp, composer4, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._169wdp, composer4, 6));
                                        ConstrainedLayoutReference constrainedLayoutReference9 = constrainedLayoutReferenceComponent72;
                                        composer4.startReplaceableGroup(-1221313255);
                                        boolean zChanged18 = composer4.changed(constrainedLayoutReferenceComponent62) | composer4.changed(f27);
                                        final ConstrainedLayoutReference constrainedLayoutReference10 = constrainedLayoutReferenceComponent62;
                                        final float f28 = f27;
                                        Object objRememberedValue22 = composer4.rememberedValue();
                                        if (zChanged18 || objRememberedValue22 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue22 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$24$9$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                                    invoke2(constrainScope);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                                    Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReference10.getTop(), f28, 0.0f, 4, null);
                                                    constrainAs.centerHorizontallyTo(constrainedLayoutReference10, 0.27f);
                                                }
                                            };
                                            composer4.updateRememberedValue(objRememberedValue22);
                                        }
                                        composer4.endReplaceableGroup();
                                        Modifier modifierConstrainAs10 = constraintLayoutScope10.constrainAs(modifierM8177width3ABfNKs5, constrainedLayoutReference9, (Function1) objRememberedValue22);
                                        final UpgradeObjectEventStrings upgradeObjectEventStrings12 = upgradeObjectEventStrings7;
                                        CloudArrowBottomBlockKt.CloudArrowBottomBlock(modifierConstrainAs10, null, ComposableLambdaKt.composableLambda(composer4, -1845642302, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$24.10
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                invoke(composer5, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                            @Composable
                                            public final void invoke(@Nullable Composer composer5, int i29) {
                                                if ((i29 & 11) != 2 || !composer5.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1845642302, i29, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMain.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UpgradeObjectEventMain.kt:1147)");
                                                    }
                                                    TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(upgradeObjectEventStrings12.getLevelGiftsHintText(), composer5, 0), (Modifier) Modifier.INSTANCE, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14843montserratMediumCustomSpbl3sdaw(R.dimen._8wsp, 0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, composer5, 196614, 26), composer5, 48, 3072, 57340);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer5.skipToGroupEnd();
                                            }
                                        }), composer4, 384, 2);
                                        ConstraintLayoutScope constraintLayoutScope11 = constraintLayoutScope5;
                                        Modifier modifierM8177width3ABfNKs6 = SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion8, PrimitiveResources_androidKt.dimensionResource(R.dimen._41wdp, composer4, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._152wdp, composer4, 6));
                                        ConstrainedLayoutReference constrainedLayoutReference11 = constrainedLayoutReferenceComponent7;
                                        composer4.startReplaceableGroup(-1221312305);
                                        boolean zChanged19 = composer4.changed(constrainedLayoutReferenceComponent6);
                                        final ConstrainedLayoutReference constrainedLayoutReference12 = constrainedLayoutReferenceComponent6;
                                        Object objRememberedValue23 = composer4.rememberedValue();
                                        if (zChanged19 || objRememberedValue23 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue23 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$24$11$1
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                                    invoke2(constrainScope);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                                    Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainedLayoutReference12.getEnd(), 0.0f, 0.0f, 6, null);
                                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReference12.getBottom(), 0.0f, 0.0f, 6, null);
                                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReference12.getStart(), 0.0f, 0.0f, 6, null);
                                                }
                                            };
                                            composer4.updateRememberedValue(objRememberedValue23);
                                        }
                                        composer4.endReplaceableGroup();
                                        Modifier modifierConstrainAs11 = constraintLayoutScope11.constrainAs(modifierM8177width3ABfNKs6, constrainedLayoutReference11, (Function1) objRememberedValue23);
                                        final UpgradeObjectEventStrings upgradeObjectEventStrings13 = upgradeObjectEventStrings7;
                                        CloudArrowTopBlockKt.CloudArrowTopBlock(modifierConstrainAs11, null, ComposableLambdaKt.composableLambda(composer4, 394121660, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt$UpgradeObjectEventMain$1$1$24.12
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                invoke(composer5, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                            @Composable
                                            public final void invoke(@Nullable Composer composer5, int i29) {
                                                if ((i29 & 11) != 2 || !composer5.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(394121660, i29, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMain.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UpgradeObjectEventMain.kt:1167)");
                                                    }
                                                    TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(upgradeObjectEventStrings13.getCountGiftsHintText(), composer5, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14843montserratMediumCustomSpbl3sdaw(R.dimen._8wsp, 0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, composer5, 196614, 26), composer5, 0, 3072, 57342);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer5.skipToGroupEnd();
                                            }
                                        }), composer4, 384, 2);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), composer3, 48);
                                if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                                    function0Component2.invoke();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), measurePolicyComponent1, composer2, 48, 0);
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, 12582912, 122);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt.UpgradeObjectEventMain.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i15) {
                    UpgradeObjectEventMainKt.UpgradeObjectEventMain(modifier3, z, i, z2, eventObjectName, i2, i3, i4, i5, i6, bagText, z3, z4, z5, z6, list, i7, i8, bitmap, bitmap2, upgradeObjectStrings, upgradeObjectImages, onLevelEventObjectClick, onWantBuyGiftClick, onCloseClick, onCloseHintClick, onInfoClick, onCurrencyEventInfoClick, onBuyUpgradeOneClick, onBuyUpgradeTwoClick, onBuyUpgradeThreeClick, onEventObjectServerClick, onEventObjectPlayerClick, onGiftsQuestionClick, onBagClick, onTopListPlayerClick, onTopListServerClick, onTurnBlockingLoadingClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i9 | 1), RecomposeScopeImplKt.updateChangedFlags(i10), RecomposeScopeImplKt.updateChangedFlags(i11), RecomposeScopeImplKt.updateChangedFlags(i12), i13, i14);
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void PreviewUpgradeObjectEventMain(Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(681852135);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(681852135, i, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.PreviewUpgradeObjectEventMain (UpgradeObjectEventMain.kt:1183)");
            }
            composer2 = composerStartRestartGroup;
            UpgradeObjectEventMain(null, true, 11, true, StringExtensionKt.htmlTextToAnnotatedString(StringResources_androidKt.stringResource(R.string.upgrade_object_event_name_for_player, composerStartRestartGroup, 6)), 999999, CasesReceivingSuperRewardUiKt.DELAY_REWARD_FIRST_STEP, FastScroller.HIDE_DELAY_AFTER_DRAGGING_MS, 2000, 0, StringExtensionKt.htmlTextToAnnotatedString(StringResources_androidKt.stringResource(R.string.upgrade_object_event_click_to_open, composerStartRestartGroup, 6)), false, false, true, true, CollectionsKt__CollectionsKt.listOf((Object[]) new UpgradeObjectEventTopListOfServersItem[]{new UpgradeObjectEventTopListOfServersItem("1", "MAKHACHKALA", "112", false, 8, null), new UpgradeObjectEventTopListOfServersItem("2", "MAKHACHKALA", "99", false, 8, null), new UpgradeObjectEventTopListOfServersItem("3", "MAKHACHKALA", "79", false, 8, null), new UpgradeObjectEventTopListOfServersItem("4", "MAKHACHKALA", "33", false, 8, null), new UpgradeObjectEventTopListOfServersItem(YouTubePlayerBridge.ERROR_HTML_5_PLAYER, "MAKHACHKALA", "22", false, 8, null), new UpgradeObjectEventTopListOfServersItem("6", "MAKHACHKALA", "20", false, 8, null), new UpgradeObjectEventTopListOfServersItem("7", "MAKHACHKALA", WebSocketContentKt.WEBSOCKET_VERSION, false, 8, null), new UpgradeObjectEventTopListOfServersItem("8", "MAKHACHKALA", "12", false, 8, null), new UpgradeObjectEventTopListOfServersItem("9", "MAKHACHKALA", "1", false, 8, null), new UpgradeObjectEventTopListOfServersItem("322", "RED", "0", true)}), R.dimen._70wdp, R.color.total_black, null, null, new UpgradeObjectEventStrings(0), new UpgradeObjectEventImages(0), new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt.PreviewUpgradeObjectEventMain.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt.PreviewUpgradeObjectEventMain.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt.PreviewUpgradeObjectEventMain.3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt.PreviewUpgradeObjectEventMain.4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt.PreviewUpgradeObjectEventMain.5
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt.PreviewUpgradeObjectEventMain.6
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt.PreviewUpgradeObjectEventMain.7
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt.PreviewUpgradeObjectEventMain.8
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt.PreviewUpgradeObjectEventMain.9
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt.PreviewUpgradeObjectEventMain.10
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt.PreviewUpgradeObjectEventMain.11
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt.PreviewUpgradeObjectEventMain.12
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt.PreviewUpgradeObjectEventMain.13
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt.PreviewUpgradeObjectEventMain.14
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt.PreviewUpgradeObjectEventMain.15
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt.PreviewUpgradeObjectEventMain.16
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composer2, 920325552, 920415664, 920350080, 14380470, 1, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventMainKt.PreviewUpgradeObjectEventMain.17
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
                    UpgradeObjectEventMainKt.PreviewUpgradeObjectEventMain(composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

