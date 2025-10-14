package com.blackhub.bronline.game.p019ui.cases.p020ui;

import android.graphics.Bitmap;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutCoordinates;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.layout.OnGloballyPositionedModifierKt;
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
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutKt;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.HorizontalAnchorable;
import androidx.constraintlayout.compose.Measurer;
import androidx.constraintlayout.compose.ToolingUtilsKt;
import androidx.constraintlayout.compose.VerticalAnchorable;
import androidx.media3.extractor.MpegAudioUtil;
import com.blackhub.bronline.game.core.enums.CommonRarityEnum;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.gui.cases.model.Case;
import com.blackhub.bronline.game.gui.cases.model.CaseBonus;
import com.blackhub.bronline.game.gui.cases.model.CaseRenderAttachment;
import com.blackhub.bronline.game.gui.cases.model.CaseReward;
import com.blackhub.bronline.game.p019ui.cases.uiblock.CasesBonusBlockKt;
import com.blackhub.bronline.game.p019ui.cases.uiblock.CasesBottomRewardBlockKt;
import com.blackhub.bronline.game.p019ui.cases.uiblock.CasesChoiceListBlockKt;
import com.blackhub.bronline.game.p019ui.cases.uiblock.CasesOpenButtonsBlockKt;
import com.blackhub.bronline.game.p019ui.cases.uiblock.CasesRewardBlockKt;
import com.blackhub.bronline.game.p019ui.cases.uiblock.CasesSprayScaleBlockKt;
import com.blackhub.bronline.game.p019ui.widget.block.ClickAnimateBlockKt;
import com.blackhub.bronline.game.p019ui.widget.block.cloud.CloudArrowBottomBlockKt;
import com.blackhub.bronline.game.p019ui.widget.block.cloud.CloudArrowLeftBlockKt;
import com.blackhub.bronline.game.p019ui.widget.block.cloud.CloudArrowTopBlockKt;
import com.blackhub.bronline.game.p019ui.widget.block.cloud.CloudArrowTopRightBlockKt;
import com.blackhub.bronline.game.p019ui.widget.block.main.CommonBcBlockKt;
import com.blackhub.bronline.game.p019ui.widget.button.ButtonContentBlockKt;
import com.blackhub.bronline.game.p019ui.widget.other.GradientAngle;
import com.blackhub.bronline.game.p019ui.widget.other.GradientOffsetKt;
import com.blackhub.bronline.game.p019ui.widget.utils.ImageBitmapKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.Utf8;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CasesMainUi.kt */
@SourceDebugExtension({"SMAP\nCasesMainUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CasesMainUi.kt\ncom/blackhub/bronline/game/ui/cases/ui/CasesMainUiKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 5 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n*L\n1#1,855:1\n64#2:856\n64#2:857\n1116#3,6:858\n1116#3,6:864\n1116#3,6:870\n1116#3,6:876\n81#4:882\n107#4,2:883\n81#4:885\n107#4,2:886\n75#5:888\n108#5,2:889\n*S KotlinDebug\n*F\n+ 1 CasesMainUi.kt\ncom/blackhub/bronline/game/ui/cases/ui/CasesMainUiKt\n*L\n144#1:856\n145#1:857\n169#1:858,6\n170#1:864,6\n171#1:870,6\n176#1:876,6\n169#1:882\n169#1:883,2\n170#1:885\n170#1:886,2\n171#1:888\n171#1:889,2\n*E\n"})
/* loaded from: classes2.dex */
public final class CasesMainUiKt {
    public static final float BLUR_FOR_SHADOW_TEXT = 2.0f;
    public static final float CORNER_COEFF_FIRST = 0.05f;
    public static final float CORNER_COEFF_SECOND = 0.2f;
    public static final float HINT_RADIUS_VAL_FIRST = 0.05f;
    public static final float HINT_RADIUS_VAL_SECOND = 0.3f;
    public static final float OFFSET_FOR_SHADOW_TEXT = 2.0f;

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void CasesMainUi(@Nullable final Bitmap bitmap, @NotNull final Case selectedCase, @Nullable final String str, @NotNull final AnnotatedString bcAmount, @NotNull final List<Case> casesList, final int i, final int i2, final int i3, final int i4, @NotNull final List<CaseBonus> bonuses, @NotNull final List<Float> progressBarStatesInFloat, final int i5, final int i6, final int i7, @NotNull final String rewardName, @ColorRes final int i8, final float f, final float f2, final float f3, final float f4, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable Integer num2, @Nullable String str4, @Nullable String str5, final int i9, final int i10, final float f5, @DrawableRes final int i11, boolean z, @NotNull final AnnotatedString saleOneHintText, @NotNull final AnnotatedString saleTenHintText, @NotNull final AnnotatedString uniqueCaseHintText, @NotNull final AnnotatedString scaleHintText, @NotNull final List<CaseReward> allRewardsBottom, final int i12, @NotNull final Function1<? super Float, Unit> onOpenOneClick, @NotNull final Function1<? super Float, Unit> onOpenTenClick, @NotNull final Function1<? super Case, Unit> onSelectCase, @NotNull final Function2<? super CaseBonus, ? super Bitmap, Unit> onBonusClick, @NotNull final Function0<Unit> onInfoSprayClick, @NotNull final Function0<Unit> onBonusInfoClick, @NotNull final Function0<Unit> onCloseClick, @NotNull final Function0<Unit> onBcButtonClick, @NotNull final Function1<? super Integer, Unit> onClickBottomItem, @NotNull final Function0<Unit> onBpRewardsClick, @NotNull final Function1<? super Integer, Unit> selectItem, @Nullable Composer composer, final int i13, final int i14, final int i15, final int i16, final int i17, final int i18, final int i19) {
        SnapshotMutationPolicy snapshotMutationPolicy;
        Intrinsics.checkNotNullParameter(selectedCase, "selectedCase");
        Intrinsics.checkNotNullParameter(bcAmount, "bcAmount");
        Intrinsics.checkNotNullParameter(casesList, "casesList");
        Intrinsics.checkNotNullParameter(bonuses, "bonuses");
        Intrinsics.checkNotNullParameter(progressBarStatesInFloat, "progressBarStatesInFloat");
        Intrinsics.checkNotNullParameter(rewardName, "rewardName");
        Intrinsics.checkNotNullParameter(saleOneHintText, "saleOneHintText");
        Intrinsics.checkNotNullParameter(saleTenHintText, "saleTenHintText");
        Intrinsics.checkNotNullParameter(uniqueCaseHintText, "uniqueCaseHintText");
        Intrinsics.checkNotNullParameter(scaleHintText, "scaleHintText");
        Intrinsics.checkNotNullParameter(allRewardsBottom, "allRewardsBottom");
        Intrinsics.checkNotNullParameter(onOpenOneClick, "onOpenOneClick");
        Intrinsics.checkNotNullParameter(onOpenTenClick, "onOpenTenClick");
        Intrinsics.checkNotNullParameter(onSelectCase, "onSelectCase");
        Intrinsics.checkNotNullParameter(onBonusClick, "onBonusClick");
        Intrinsics.checkNotNullParameter(onInfoSprayClick, "onInfoSprayClick");
        Intrinsics.checkNotNullParameter(onBonusInfoClick, "onBonusInfoClick");
        Intrinsics.checkNotNullParameter(onCloseClick, "onCloseClick");
        Intrinsics.checkNotNullParameter(onBcButtonClick, "onBcButtonClick");
        Intrinsics.checkNotNullParameter(onClickBottomItem, "onClickBottomItem");
        Intrinsics.checkNotNullParameter(onBpRewardsClick, "onBpRewardsClick");
        Intrinsics.checkNotNullParameter(selectItem, "selectItem");
        Composer composerStartRestartGroup = composer.startRestartGroup(-971631490);
        String str6 = (i18 & 1048576) != 0 ? null : str2;
        String str7 = (i18 & 2097152) != 0 ? null : str3;
        Integer num3 = (i18 & 4194304) != 0 ? null : num;
        Integer num4 = (i18 & 8388608) != 0 ? null : num2;
        String str8 = (i18 & 16777216) != 0 ? null : str4;
        String str9 = (i18 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? null : str5;
        boolean z2 = (i18 & 1073741824) != 0 ? false : z;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-971631490, i13, i14, "com.blackhub.bronline.game.ui.cases.ui.CasesMainUi (CasesMainUi.kt:133)");
        }
        final float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._48wdp, composerStartRestartGroup, 6);
        final float fDimensionResource2 = PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composerStartRestartGroup, 6);
        final float fDimensionResource3 = PrimitiveResources_androidKt.dimensionResource(R.dimen._27wdp, composerStartRestartGroup, 6);
        final float fDimensionResource4 = PrimitiveResources_androidKt.dimensionResource(R.dimen._40wdp, composerStartRestartGroup, 6);
        final float fDimensionResource5 = PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composerStartRestartGroup, 6);
        final float fDimensionResource6 = PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composerStartRestartGroup, 6);
        final float fDimensionResource7 = PrimitiveResources_androidKt.dimensionResource(R.dimen._6wdp, composerStartRestartGroup, 6);
        final float fDimensionResource8 = PrimitiveResources_androidKt.dimensionResource(R.dimen._105wdp, composerStartRestartGroup, 6);
        final float fM13666constructorimpl = C2046Dp.m13666constructorimpl(-PrimitiveResources_androidKt.dimensionResource(R.dimen._65wdp, composerStartRestartGroup, 6));
        final float fM13666constructorimpl2 = C2046Dp.m13666constructorimpl(-PrimitiveResources_androidKt.dimensionResource(R.dimen._8wdp, composerStartRestartGroup, 6));
        Brush.Companion companion = Brush.INSTANCE;
        final Brush brushM11289horizontalGradient8A3gB4$default = Brush.Companion.m11289horizontalGradient8A3gB4$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black_gray_blue, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.blue_black, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.transparent, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
        final Brush brushM11297verticalGradient8A3gB4$default = Brush.Companion.m11297verticalGradient8A3gB4$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.transparent, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.blue_black, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black_gray_blue, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
        final Brush brushM11297verticalGradient8A3gB4$default2 = Brush.Companion.m11297verticalGradient8A3gB4$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black_gray_blue, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.blue_black, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.transparent, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
        composerStartRestartGroup.startReplaceableGroup(400525801);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion2 = Composer.INSTANCE;
        if (objRememberedValue == companion2.getEmpty()) {
            snapshotMutationPolicy = null;
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        } else {
            snapshotMutationPolicy = null;
        }
        final MutableState mutableState = (MutableState) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(400525871);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == companion2.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(snapshotMutationPolicy, snapshotMutationPolicy, 2, snapshotMutationPolicy);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        final MutableState mutableState2 = (MutableState) objRememberedValue2;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(400525934);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue3 == companion2.getEmpty()) {
            objRememberedValue3 = SnapshotIntStateKt.mutableIntStateOf(0);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        final MutableIntState mutableIntState = (MutableIntState) objRememberedValue3;
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(400526086);
        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue4 == companion2.getEmpty()) {
            objRememberedValue4 = new Function1<LayoutCoordinates, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesMainUiKt$CasesMainUi$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                    invoke2(layoutCoordinates);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull LayoutCoordinates coordinates) {
                    Intrinsics.checkNotNullParameter(coordinates, "coordinates");
                    mutableIntState.setIntValue(IntSize.m13836getWidthimpl(coordinates.mo12617getSizeYbymL2g()));
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
        }
        composerStartRestartGroup.endReplaceableGroup();
        final boolean z3 = z2;
        final String str10 = str6;
        final String str11 = str7;
        final Integer num5 = num3;
        final Integer num6 = num4;
        final String str12 = str8;
        final String str13 = str9;
        SurfaceKt.m9876SurfaceT9BRK9s(OnGloballyPositionedModifierKt.onGloballyPositioned(modifierFillMaxSize$default, (Function1) objRememberedValue4), null, ColorResources_androidKt.colorResource(R.color.gray_bg, composerStartRestartGroup, 6), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1074071143, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesMainUiKt.CasesMainUi.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num7) {
                invoke(composer2, num7.intValue());
                return Unit.INSTANCE;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@Nullable Composer composer2, int i20) {
                Function2<CaseBonus, Bitmap, Unit> function2;
                if ((i20 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1074071143, i20, -1, "com.blackhub.bronline.game.ui.cases.ui.CasesMainUi.<anonymous> (CasesMainUi.kt:180)");
                    }
                    Bitmap bgImageBitmap = selectedCase.getBgImageBitmap();
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    ImageBitmapKt.m15118ImageBitmapAy9G7rc(bgImageBitmap, SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, composer2, 3128, 116);
                    final AnnotatedString annotatedString = bcAmount;
                    final Function0<Unit> function0 = onBcButtonClick;
                    final float f6 = fDimensionResource6;
                    final List<CaseBonus> list = bonuses;
                    final List<Float> list2 = progressBarStatesInFloat;
                    final int i21 = i5;
                    final int i22 = i3;
                    final Function0<Unit> function02 = onBonusInfoClick;
                    Function2<CaseBonus, Bitmap, Unit> function22 = onBonusClick;
                    final Case r1 = selectedCase;
                    final String str14 = str;
                    final boolean z4 = z3;
                    final float f7 = fDimensionResource5;
                    final List<CaseReward> list3 = allRewardsBottom;
                    final int i23 = i12;
                    final int i24 = i4;
                    final Function1<Integer, Unit> function1 = onClickBottomItem;
                    final Function1<Integer, Unit> function12 = selectItem;
                    final float f8 = fDimensionResource;
                    final Function0<Unit> function03 = onCloseClick;
                    final float f9 = fDimensionResource7;
                    final float f10 = f5;
                    final String str15 = rewardName;
                    final int i25 = i8;
                    final String str16 = str10;
                    final String str17 = str11;
                    final Integer num7 = num5;
                    final Integer num8 = num6;
                    final String str18 = str12;
                    final String str19 = str13;
                    final float f11 = f;
                    final float f12 = f2;
                    final float f13 = f3;
                    final float f14 = f4;
                    final int i26 = i9;
                    final int i27 = i10;
                    final Function1<Float, Unit> function13 = onOpenOneClick;
                    final Function1<Float, Unit> function14 = onOpenTenClick;
                    final float f15 = fDimensionResource4;
                    final List<Case> list4 = casesList;
                    final int i28 = i;
                    final int i29 = i2;
                    final Function1<Case, Unit> function15 = onSelectCase;
                    final float f16 = fDimensionResource2;
                    final float f17 = fDimensionResource3;
                    final Function0<Unit> function04 = onBpRewardsClick;
                    final Bitmap bitmap2 = bitmap;
                    final int i30 = i6;
                    final int i31 = i7;
                    final Function0<Unit> function05 = onInfoSprayClick;
                    final MutableState<Bitmap> mutableState3 = mutableState;
                    final MutableState<Integer> mutableState4 = mutableState2;
                    final MutableIntState mutableIntState2 = mutableIntState;
                    final int i32 = i11;
                    final Brush brush = brushM11289horizontalGradient8A3gB4$default;
                    final float f18 = fDimensionResource8;
                    final Brush brush2 = brushM11297verticalGradient8A3gB4$default;
                    final float f19 = fM13666constructorimpl;
                    final Brush brush3 = brushM11297verticalGradient8A3gB4$default2;
                    final float f20 = fM13666constructorimpl2;
                    final AnnotatedString annotatedString2 = saleOneHintText;
                    final AnnotatedString annotatedString3 = saleTenHintText;
                    final AnnotatedString annotatedString4 = uniqueCaseHintText;
                    final AnnotatedString annotatedString5 = scaleHintText;
                    composer2.startReplaceableGroup(-270267587);
                    composer2.startReplaceableGroup(-3687241);
                    Object objRememberedValue5 = composer2.rememberedValue();
                    Composer.Companion companion4 = Composer.INSTANCE;
                    if (objRememberedValue5 == companion4.getEmpty()) {
                        objRememberedValue5 = new Measurer();
                        composer2.updateRememberedValue(objRememberedValue5);
                    }
                    composer2.endReplaceableGroup();
                    final Measurer measurer = (Measurer) objRememberedValue5;
                    composer2.startReplaceableGroup(-3687241);
                    Object objRememberedValue6 = composer2.rememberedValue();
                    if (objRememberedValue6 == companion4.getEmpty()) {
                        objRememberedValue6 = new ConstraintLayoutScope();
                        composer2.updateRememberedValue(objRememberedValue6);
                    }
                    composer2.endReplaceableGroup();
                    final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue6;
                    composer2.startReplaceableGroup(-3687241);
                    Object objRememberedValue7 = composer2.rememberedValue();
                    if (objRememberedValue7 == companion4.getEmpty()) {
                        function2 = function22;
                        objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composer2.updateRememberedValue(objRememberedValue7);
                    } else {
                        function2 = function22;
                    }
                    composer2.endReplaceableGroup();
                    Pair<MeasurePolicy, Function0<Unit>> pairRememberConstraintLayoutMeasurePolicy = ConstraintLayoutKt.rememberConstraintLayoutMeasurePolicy(257, constraintLayoutScope, (MutableState<Boolean>) objRememberedValue7, measurer, composer2, 4544);
                    MeasurePolicy measurePolicyComponent1 = pairRememberConstraintLayoutMeasurePolicy.component1();
                    final Function0<Unit> function0Component2 = pairRememberConstraintLayoutMeasurePolicy.component2();
                    final int i33 = 0;
                    final Function2<CaseBonus, Bitmap, Unit> function23 = function2;
                    LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(companion3, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesMainUiKt$CasesMainUi$2$invoke$$inlined$ConstraintLayout$1
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
                    }, 1, null), ComposableLambdaKt.composableLambda(composer2, -819894182, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesMainUiKt$CasesMainUi$2$invoke$$inlined$ConstraintLayout$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num9) {
                            invoke(composer3, num9.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@Nullable Composer composer3, int i34) {
                            Composer composer4;
                            Modifier.Companion companion5;
                            final ConstraintLayoutScope constraintLayoutScope2;
                            ConstrainedLayoutReference constrainedLayoutReference;
                            ConstrainedLayoutReference constrainedLayoutReference2;
                            ConstraintLayoutScope constraintLayoutScope3;
                            ConstrainedLayoutReference constrainedLayoutReference3;
                            Modifier.Companion companion6;
                            if (((i34 & 11) ^ 2) != 0 || !composer3.getSkipping()) {
                                int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                                constraintLayoutScope.reset();
                                ConstraintLayoutScope constraintLayoutScope4 = constraintLayoutScope;
                                ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope4.createRefs();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent1 = constrainedLayoutReferencesCreateRefs.component1();
                                ConstrainedLayoutReference constrainedLayoutReferenceComponent2 = constrainedLayoutReferencesCreateRefs.component2();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent3 = constrainedLayoutReferencesCreateRefs.component3();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent4 = constrainedLayoutReferencesCreateRefs.component4();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent5 = constrainedLayoutReferencesCreateRefs.component5();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent6 = constrainedLayoutReferencesCreateRefs.component6();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent7 = constrainedLayoutReferencesCreateRefs.component7();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent8 = constrainedLayoutReferencesCreateRefs.component8();
                                ConstrainedLayoutReference constrainedLayoutReferenceComponent9 = constrainedLayoutReferencesCreateRefs.component9();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent10 = constrainedLayoutReferencesCreateRefs.component10();
                                ConstrainedLayoutReference constrainedLayoutReferenceComponent11 = constrainedLayoutReferencesCreateRefs.component11();
                                ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs2 = constraintLayoutScope4.createRefs();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent12 = constrainedLayoutReferencesCreateRefs2.component1();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent22 = constrainedLayoutReferencesCreateRefs2.component2();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent32 = constrainedLayoutReferencesCreateRefs2.component3();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent42 = constrainedLayoutReferencesCreateRefs2.component4();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent52 = constrainedLayoutReferencesCreateRefs2.component5();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent62 = constrainedLayoutReferencesCreateRefs2.component6();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent72 = constrainedLayoutReferencesCreateRefs2.component7();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent82 = constrainedLayoutReferencesCreateRefs2.component8();
                                Modifier.Companion companion7 = Modifier.INSTANCE;
                                Modifier modifierM8174sizeVpY3zN4 = SizeKt.m8174sizeVpY3zN4(companion7, PrimitiveResources_androidKt.dimensionResource(R.dimen._118wdp, composer3, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composer3, 6));
                                composer3.startReplaceableGroup(-529434616);
                                boolean zChanged = composer3.changed(constrainedLayoutReferenceComponent4) | composer3.changed(constrainedLayoutReferenceComponent8);
                                Object objRememberedValue8 = composer3.rememberedValue();
                                if (zChanged || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue8 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesMainUiKt$CasesMainUi$2$1$1$1
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
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReferenceComponent4.getTop(), 0.0f, 0.0f, 6, null);
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReferenceComponent4.getBottom(), 0.0f, 0.0f, 6, null);
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainedLayoutReferenceComponent8.getEnd(), 0.0f, 0.0f, 6, null);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue8);
                                }
                                composer3.endReplaceableGroup();
                                Modifier modifierConstrainAs = constraintLayoutScope4.constrainAs(modifierM8174sizeVpY3zN4, constrainedLayoutReferenceComponent2, (Function1) objRememberedValue8);
                                AnnotatedString annotatedString6 = annotatedString;
                                composer3.startReplaceableGroup(-529434346);
                                boolean zChanged2 = composer3.changed(function0);
                                Object objRememberedValue9 = composer3.rememberedValue();
                                if (zChanged2 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                    final Function0 function06 = function0;
                                    objRememberedValue9 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesMainUiKt$CasesMainUi$2$1$2$1
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
                                            function06.invoke();
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue9);
                                }
                                composer3.endReplaceableGroup();
                                CommonBcBlockKt.m15060CommonBcBlockOo4ZOEs(modifierConstrainAs, annotatedString6, false, null, 0L, null, (Function0) objRememberedValue9, composer3, 0, 60);
                                Modifier modifierM8177width3ABfNKs = SizeKt.m8177width3ABfNKs(companion7, PrimitiveResources_androidKt.dimensionResource(R.dimen._88wdp, composer3, 6));
                                composer3.startReplaceableGroup(-529434121);
                                boolean zChanged3 = composer3.changed(constrainedLayoutReferenceComponent1) | composer3.changed(constrainedLayoutReferenceComponent4) | composer3.changed(f6) | composer3.changed(constrainedLayoutReferenceComponent6);
                                Object objRememberedValue10 = composer3.rememberedValue();
                                if (zChanged3 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                    final float f21 = f6;
                                    objRememberedValue10 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesMainUiKt$CasesMainUi$2$1$3$1
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
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReferenceComponent1.getBottom(), 0.0f, 0.0f, 6, null);
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainedLayoutReferenceComponent4.getEnd(), f21, 0.0f, 4, null);
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReferenceComponent6.getTop(), 0.0f, 0.0f, 6, null);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue10);
                                }
                                composer3.endReplaceableGroup();
                                CasesBonusBlockKt.CasesBonusBlock(constraintLayoutScope4.constrainAs(modifierM8177width3ABfNKs, constrainedLayoutReferenceComponent7, (Function1) objRememberedValue10), list, list2, i21, i22, function02, function23, composer3, MpegAudioUtil.SAMPLES_PER_FRAME_L3_V2, 0);
                                CasesRewardBlockKt.CasesRewardBlock(constraintLayoutScope4.constrainAs(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion7, PrimitiveResources_androidKt.dimensionResource(R.dimen._270wdp, composer3, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._257wdp, composer3, 6)), constrainedLayoutReferenceComponent9, new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesMainUiKt$CasesMainUi$2$1$4
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                        invoke2(constrainScope);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                        HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                                        VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                                        VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                                    }
                                }), CasesMainUiKt.CasesMainUi$lambda$1(mutableState3), CasesMainUiKt.CasesMainUi$lambda$4(mutableState4), composer3, 64, 0);
                                String name = r1.getName();
                                Locale locale = Locale.ROOT;
                                String upperCase = name.toUpperCase(locale);
                                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                                composer3.startReplaceableGroup(-529432849);
                                boolean zChanged4 = composer3.changed(constrainedLayoutReferenceComponent3);
                                Object objRememberedValue11 = composer3.rememberedValue();
                                if (zChanged4 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue11 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesMainUiKt$CasesMainUi$2$1$5$1
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
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReferenceComponent3.getBottom(), 0.0f, 0.0f, 6, null);
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue11);
                                }
                                composer3.endReplaceableGroup();
                                Modifier modifierConstrainAs2 = constraintLayoutScope4.constrainAs(companion7, constrainedLayoutReferenceComponent10, (Function1) objRememberedValue11);
                                TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
                                TextKt.m10024Text4IGK_g(upperCase, modifierConstrainAs2, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._25wsp, ColorResources_androidKt.colorResource(R.color.white, composer3, 6), 0, OffsetKt.Offset(2.0f, 2.0f), 2.0f, null, null, composer3, 12610566, 100), composer3, 0, 0, 65532);
                                composer3.startReplaceableGroup(-529432259);
                                String str20 = str14;
                                if (str20 != null) {
                                    String upperCase2 = str20.toUpperCase(locale);
                                    Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                                    composer3.startReplaceableGroup(-529432096);
                                    boolean zChanged5 = composer3.changed(constrainedLayoutReferenceComponent10);
                                    Object objRememberedValue12 = composer3.rememberedValue();
                                    if (zChanged5 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue12 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesMainUiKt$CasesMainUi$2$1$6$1
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
                                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReferenceComponent10.getBottom(), 0.0f, 0.0f, 6, null);
                                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                                            }
                                        };
                                        composer3.updateRememberedValue(objRememberedValue12);
                                    }
                                    composer3.endReplaceableGroup();
                                    companion5 = companion7;
                                    constraintLayoutScope2 = constraintLayoutScope4;
                                    composer4 = composer3;
                                    TextKt.m10024Text4IGK_g(upperCase2, constraintLayoutScope4.constrainAs(companion7, constrainedLayoutReferenceComponent11, (Function1) objRememberedValue12), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14843montserratMediumCustomSpbl3sdaw(R.dimen._10wsp, ColorResources_androidKt.colorResource(R.color.white_80, composer3, 6), 0, Offset.INSTANCE.m11115getZeroF1C5BW0(), 0.0f, composer3, 199686, 20), composer3, 0, 0, 65532);
                                } else {
                                    composer4 = composer3;
                                    companion5 = companion7;
                                    constraintLayoutScope2 = constraintLayoutScope4;
                                }
                                composer3.endReplaceableGroup();
                                ComposeExtensionKt.IfTrue(Boolean.valueOf(z4), ComposableLambdaKt.composableLambda(composer4, -1150745396, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesMainUiKt$CasesMainUi$2$1$7
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num9) {
                                        invoke(composer5, num9.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer5, int i35) {
                                        if ((i35 & 11) != 2 || !composer5.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1150745396, i35, -1, "com.blackhub.bronline.game.ui.cases.ui.CasesMainUi.<anonymous>.<anonymous>.<anonymous> (CasesMainUi.kt:291)");
                                            }
                                            SurfaceKt.m9876SurfaceT9BRK9s(constraintLayoutScope2.constrainAs(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), constrainedLayoutReferenceComponent12, new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesMainUiKt$CasesMainUi$2$1$7.1
                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                                    invoke2(constrainScope);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                                    Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                                                }
                                            }), null, ColorResources_androidKt.colorResource(R.color.total_black_90, composer5, 6), 0L, 0.0f, 0.0f, null, ComposableSingletons$CasesMainUiKt.INSTANCE.m14931getLambda1$app_siteRelease(), composer5, 12582912, 122);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer5.skipToGroupEnd();
                                    }
                                }), composer4, 48);
                                Modifier.Companion companion8 = companion5;
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m8158height3ABfNKs(companion8, PrimitiveResources_androidKt.dimensionResource(R.dimen._60wdp, composer4, 6)), 0.0f, 1, null);
                                composer4.startReplaceableGroup(-529430869);
                                boolean zChanged6 = composer4.changed(f7);
                                Object objRememberedValue13 = composer3.rememberedValue();
                                if (zChanged6 || objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                                    final float f22 = f7;
                                    objRememberedValue13 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesMainUiKt$CasesMainUi$2$1$8$1
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
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), f22, 0.0f, 4, null);
                                        }
                                    };
                                    composer4.updateRememberedValue(objRememberedValue13);
                                }
                                composer3.endReplaceableGroup();
                                Modifier modifierConstrainAs3 = constraintLayoutScope2.constrainAs(modifierFillMaxWidth$default, constrainedLayoutReferenceComponent6, (Function1) objRememberedValue13);
                                int intValue = mutableIntState2.getIntValue();
                                boolean z5 = !z4;
                                List list5 = list3;
                                int i35 = i23;
                                int i36 = i22;
                                int i37 = i24;
                                Function1 function16 = function1;
                                Function1 function17 = function12;
                                composer4.startReplaceableGroup(-529430275);
                                Object objRememberedValue14 = composer3.rememberedValue();
                                Composer.Companion companion9 = Composer.INSTANCE;
                                if (objRememberedValue14 == companion9.getEmpty()) {
                                    final MutableState mutableState5 = mutableState3;
                                    constrainedLayoutReference = constrainedLayoutReferenceComponent6;
                                    final MutableState mutableState6 = mutableState4;
                                    objRememberedValue14 = new Function2<Bitmap, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesMainUiKt$CasesMainUi$2$1$9$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap3, Integer num9) {
                                            invoke2(bitmap3, num9);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@Nullable Bitmap bitmap3, @Nullable Integer num9) {
                                            mutableState5.setValue(bitmap3);
                                            mutableState6.setValue(num9);
                                        }
                                    };
                                    composer4.updateRememberedValue(objRememberedValue14);
                                } else {
                                    constrainedLayoutReference = constrainedLayoutReferenceComponent6;
                                }
                                Function2 function24 = (Function2) objRememberedValue14;
                                composer3.endReplaceableGroup();
                                final ConstrainedLayoutReference constrainedLayoutReference4 = constrainedLayoutReference;
                                Composer composer5 = composer4;
                                ConstraintLayoutScope constraintLayoutScope5 = constraintLayoutScope2;
                                CasesBottomRewardBlockKt.CasesBottomRewardBlock(modifierConstrainAs3, intValue, list5, i35, i36, i37, z5, function16, function17, function24, composer3, 805306880, 0);
                                Modifier modifierM8174sizeVpY3zN42 = SizeKt.m8174sizeVpY3zN4(companion8, PrimitiveResources_androidKt.dimensionResource(R.dimen._17wdp, composer5, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._17wdp, composer5, 6));
                                composer5.startReplaceableGroup(-529429836);
                                boolean zChanged7 = composer5.changed(constrainedLayoutReferenceComponent4) | composer5.changed(f8);
                                Object objRememberedValue15 = composer3.rememberedValue();
                                if (zChanged7 || objRememberedValue15 == companion9.getEmpty()) {
                                    final float f23 = f8;
                                    objRememberedValue15 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesMainUiKt$CasesMainUi$2$1$10$1
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
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReferenceComponent4.getTop(), 0.0f, 0.0f, 6, null);
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReferenceComponent4.getBottom(), 0.0f, 0.0f, 6, null);
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), f23, 0.0f, 4, null);
                                        }
                                    };
                                    composer5.updateRememberedValue(objRememberedValue15);
                                }
                                composer3.endReplaceableGroup();
                                Modifier modifierConstrainAs4 = constraintLayoutScope5.constrainAs(modifierM8174sizeVpY3zN42, constrainedLayoutReferenceComponent1, (Function1) objRememberedValue15);
                                composer5.startReplaceableGroup(-529429504);
                                boolean zChanged8 = composer5.changed(function03);
                                Object objRememberedValue16 = composer3.rememberedValue();
                                if (zChanged8 || objRememberedValue16 == companion9.getEmpty()) {
                                    final Function0 function07 = function03;
                                    objRememberedValue16 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesMainUiKt$CasesMainUi$2$1$11$1
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
                                            function07.invoke();
                                        }
                                    };
                                    composer5.updateRememberedValue(objRememberedValue16);
                                }
                                composer3.endReplaceableGroup();
                                final int i38 = i32;
                                ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierConstrainAs4, null, false, null, false, false, false, false, null, 0, 0L, null, (Function0) objRememberedValue16, ComposableLambdaKt.composableLambda(composer5, -389694155, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesMainUiKt$CasesMainUi$2$1$12
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num9) {
                                        invoke(composer6, num9.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer6, int i39) {
                                        if ((i39 & 11) != 2 || !composer6.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-389694155, i39, -1, "com.blackhub.bronline.game.ui.cases.ui.CasesMainUi.<anonymous>.<anonymous>.<anonymous> (CasesMainUi.kt:344)");
                                            }
                                            IconKt.m9496Iconww6aTOc(PainterResources_androidKt.painterResource(i38, composer6, 0), (String) null, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ColorResources_androidKt.colorResource(R.color.white, composer6, 6), composer6, 440, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer6.skipToGroupEnd();
                                    }
                                }), composer3, 0, 3072, 4094);
                                if (z4) {
                                    composer3.startReplaceableGroup(-529429137);
                                    Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(companion8, PrimitiveResources_androidKt.dimensionResource(R.dimen._45wdp, composer3, 6));
                                    composer3.startReplaceableGroup(-529428944);
                                    boolean zChanged9 = composer3.changed(constrainedLayoutReference4) | composer3.changed(f9);
                                    Object objRememberedValue17 = composer3.rememberedValue();
                                    if (zChanged9 || objRememberedValue17 == companion9.getEmpty()) {
                                        final float f24 = f9;
                                        objRememberedValue17 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesMainUiKt$CasesMainUi$2$1$13$1
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
                                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReference4.getTop(), f24, 0.0f, 4, null);
                                            }
                                        };
                                        composer3.updateRememberedValue(objRememberedValue17);
                                    }
                                    composer3.endReplaceableGroup();
                                    CasesOpenButtonsBlockKt.CasesOpenButtonsBlock(constraintLayoutScope5.constrainAs(modifierM8158height3ABfNKs, constrainedLayoutReferenceComponent8, (Function1) objRememberedValue17), "", R.color.yellow, R.color.gray_blue, R.color.red, StringResources_androidKt.stringResource(R.string.cases_info_price, composer3, 6), StringResources_androidKt.stringResource(R.string.cases_info_price_two, composer3, 6), 10, 10, StringResources_androidKt.stringResource(R.string.cases_info_price_sale, composer3, 6), StringResources_androidKt.stringResource(R.string.cases_info_price_sale_two, composer3, 6), 0.5f, 0.5f, 1.0f, 1.0f, 2, 2, f10, false, new Function1<Float, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesMainUiKt$CasesMainUi$2$1$14
                                        public final void invoke(float f25) {
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(Float f25) {
                                            invoke(f25.floatValue());
                                            return Unit.INSTANCE;
                                        }
                                    }, new Function1<Float, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesMainUiKt$CasesMainUi$2$1$15
                                        public final void invoke(float f25) {
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(Float f25) {
                                            invoke(f25.floatValue());
                                            return Unit.INSTANCE;
                                        }
                                    }, composer3, 113274288, 907767216, 6, 0);
                                    composer3.endReplaceableGroup();
                                    constrainedLayoutReference2 = constrainedLayoutReferenceComponent8;
                                    constraintLayoutScope3 = constraintLayoutScope5;
                                    constrainedLayoutReference3 = constrainedLayoutReference4;
                                    companion6 = companion8;
                                } else {
                                    composer3.startReplaceableGroup(-529427416);
                                    Modifier modifierM8158height3ABfNKs2 = SizeKt.m8158height3ABfNKs(companion8, PrimitiveResources_androidKt.dimensionResource(R.dimen._45wdp, composer3, 6));
                                    composer3.startReplaceableGroup(-529427223);
                                    boolean zChanged10 = composer3.changed(constrainedLayoutReference4) | composer3.changed(f9);
                                    Object objRememberedValue18 = composer3.rememberedValue();
                                    if (zChanged10 || objRememberedValue18 == companion9.getEmpty()) {
                                        final float f25 = f9;
                                        objRememberedValue18 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesMainUiKt$CasesMainUi$2$1$16$1
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
                                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReference4.getTop(), f25, 0.0f, 4, null);
                                            }
                                        };
                                        composer3.updateRememberedValue(objRememberedValue18);
                                    }
                                    composer3.endReplaceableGroup();
                                    constrainedLayoutReference2 = constrainedLayoutReferenceComponent8;
                                    constraintLayoutScope3 = constraintLayoutScope5;
                                    constrainedLayoutReference3 = constrainedLayoutReference4;
                                    companion6 = companion8;
                                    CasesOpenButtonsBlockKt.CasesOpenButtonsBlock(constraintLayoutScope5.constrainAs(modifierM8158height3ABfNKs2, constrainedLayoutReferenceComponent8, (Function1) objRememberedValue18), str15, i25, R.color.gray_blue, R.color.red, str16, str17, num7, num8, str18, str19, f11, f12, f13, f14, i26, i27, f10, !z4, function13, function14, composer3, 27648, 0, 0, 0);
                                    composer3.endReplaceableGroup();
                                }
                                Modifier.Companion companion10 = companion6;
                                Modifier modifierM8174sizeVpY3zN43 = SizeKt.m8174sizeVpY3zN4(companion10, PrimitiveResources_androidKt.dimensionResource(R.dimen._66wdp, composer3, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._212wdp, composer3, 6));
                                composer3.startReplaceableGroup(-529425456);
                                boolean zChanged11 = composer3.changed(constrainedLayoutReferenceComponent7) | composer3.changed(f15);
                                Object objRememberedValue19 = composer3.rememberedValue();
                                if (zChanged11 || objRememberedValue19 == companion9.getEmpty()) {
                                    final float f26 = f15;
                                    objRememberedValue19 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesMainUiKt$CasesMainUi$2$1$17$1
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
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReferenceComponent7.getTop(), 0.0f, 0.0f, 6, null);
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), f26, 0.0f, 4, null);
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReferenceComponent7.getBottom(), 0.0f, 0.0f, 6, null);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue19);
                                }
                                composer3.endReplaceableGroup();
                                final ConstraintLayoutScope constraintLayoutScope6 = constraintLayoutScope3;
                                Modifier modifierConstrainAs5 = constraintLayoutScope6.constrainAs(modifierM8174sizeVpY3zN43, constrainedLayoutReferenceComponent5, (Function1) objRememberedValue19);
                                List list6 = list4;
                                int i39 = i28;
                                int i40 = i29;
                                boolean z6 = !z4;
                                composer3.startReplaceableGroup(-529424922);
                                boolean zChanged12 = composer3.changed(function15);
                                Object objRememberedValue20 = composer3.rememberedValue();
                                if (zChanged12 || objRememberedValue20 == companion9.getEmpty()) {
                                    final Function1 function18 = function15;
                                    objRememberedValue20 = new Function1<Case, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesMainUiKt$CasesMainUi$2$1$18$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(Case r12) {
                                            invoke2(r12);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@NotNull Case caseId) {
                                            Intrinsics.checkNotNullParameter(caseId, "caseId");
                                            function18.invoke(caseId);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue20);
                                }
                                composer3.endReplaceableGroup();
                                CasesChoiceListBlockKt.CasesChoiceListBlock(modifierConstrainAs5, list6, i39, i40, z6, (Function1) objRememberedValue20, composer3, 64, 0);
                                Modifier modifierM8174sizeVpY3zN44 = SizeKt.m8174sizeVpY3zN4(companion10, PrimitiveResources_androidKt.dimensionResource(R.dimen._27wdp, composer3, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._27wdp, composer3, 6));
                                composer3.startReplaceableGroup(-529424527);
                                boolean zChanged13 = composer3.changed(f16) | composer3.changed(f17);
                                Object objRememberedValue21 = composer3.rememberedValue();
                                if (zChanged13 || objRememberedValue21 == companion9.getEmpty()) {
                                    final float f27 = f16;
                                    final float f28 = f17;
                                    objRememberedValue21 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesMainUiKt$CasesMainUi$2$1$19$1
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
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), f27, 0.0f, 4, null);
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), f28, 0.0f, 4, null);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue21);
                                }
                                composer3.endReplaceableGroup();
                                Modifier modifierConstrainAs6 = constraintLayoutScope6.constrainAs(modifierM8174sizeVpY3zN44, constrainedLayoutReferenceComponent4, (Function1) objRememberedValue21);
                                Brush.Companion companion11 = Brush.INSTANCE;
                                List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.gray_blue, composer3, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.blue_black, composer3, 6))});
                                GradientAngle gradientAngle = GradientAngle.CW90;
                                ButtonContentBlockKt.m15069ButtonContentBlockkmJHe8M(modifierConstrainAs6, null, 0L, 0L, 0.0f, Brush.Companion.m11291linearGradientmHitzGk$default(companion11, listListOf, GradientOffsetKt.gradientOffset(gradientAngle).m15095getStartF1C5BW0(), GradientOffsetKt.gradientOffset(gradientAngle).m15094getEndF1C5BW0(), 0, 8, (Object) null), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composer3, 6)), BorderStrokeKt.m7798BorderStrokecXLIe8U(PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composer3, 6), Color.INSTANCE.m11377getWhite0d7_KjU()), null, false, !z4, null, true, false, false, false, 0, null, function04, ComposableSingletons$CasesMainUiKt.INSTANCE.m14932getLambda2$app_siteRelease(), composer3, 0, 805306752, 256798);
                                Modifier modifierM8174sizeVpY3zN45 = SizeKt.m8174sizeVpY3zN4(companion10, PrimitiveResources_androidKt.dimensionResource(R.dimen._227wdp, composer3, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._34wdp, composer3, 6));
                                composer3.startReplaceableGroup(-529422723);
                                boolean zChanged14 = composer3.changed(constrainedLayoutReferenceComponent4);
                                Object objRememberedValue22 = composer3.rememberedValue();
                                if (zChanged14 || objRememberedValue22 == companion9.getEmpty()) {
                                    objRememberedValue22 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesMainUiKt$CasesMainUi$2$1$20$1
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
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReferenceComponent4.getTop(), 0.0f, 0.0f, 6, null);
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReferenceComponent4.getBottom(), 0.0f, 0.0f, 6, null);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue22);
                                }
                                composer3.endReplaceableGroup();
                                Modifier modifierConstrainAs7 = constraintLayoutScope6.constrainAs(modifierM8174sizeVpY3zN45, constrainedLayoutReferenceComponent3, (Function1) objRememberedValue22);
                                Bitmap bitmap3 = bitmap2;
                                Modifier modifierM8158height3ABfNKs3 = SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(PaddingKt.m8127paddingqDBjuR0$default(companion10, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._24wdp, composer3, 6), 0.0f, 11, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._170wdp, composer3, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._16wdp, composer3, 6));
                                int i41 = i30;
                                int i42 = i31;
                                boolean z7 = !z4;
                                composer3.startReplaceableGroup(-529421947);
                                boolean zChanged15 = composer3.changed(function05);
                                Object objRememberedValue23 = composer3.rememberedValue();
                                if (zChanged15 || objRememberedValue23 == companion9.getEmpty()) {
                                    final Function0 function08 = function05;
                                    objRememberedValue23 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesMainUiKt$CasesMainUi$2$1$21$1
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
                                            function08.invoke();
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue23);
                                }
                                composer3.endReplaceableGroup();
                                CasesSprayScaleBlockKt.CasesSprayScaleBlock(modifierConstrainAs7, bitmap3, modifierM8158height3ABfNKs3, R.dimen._16wdp, i41, 0, i42, false, z7, (Function0) objRememberedValue23, composer3, 3136, 160);
                                Boolean boolValueOf = Boolean.valueOf(z4);
                                final Brush brush4 = brush;
                                final float f29 = f18;
                                final Brush brush5 = brush2;
                                final float f30 = f19;
                                final Brush brush6 = brush3;
                                final float f31 = f20;
                                final AnnotatedString annotatedString7 = annotatedString2;
                                final AnnotatedString annotatedString8 = annotatedString3;
                                final AnnotatedString annotatedString9 = annotatedString4;
                                final AnnotatedString annotatedString10 = annotatedString5;
                                final ConstrainedLayoutReference constrainedLayoutReference5 = constrainedLayoutReference2;
                                final ConstrainedLayoutReference constrainedLayoutReference6 = constrainedLayoutReference3;
                                ComposeExtensionKt.IfTrue(boolValueOf, ComposableLambdaKt.composableLambda(composer3, 1728689909, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesMainUiKt$CasesMainUi$2$1$22
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num9) {
                                        invoke(composer6, num9.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer6, int i43) {
                                        if ((i43 & 11) == 2 && composer6.getSkipping()) {
                                            composer6.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1728689909, i43, -1, "com.blackhub.bronline.game.ui.cases.ui.CasesMainUi.<anonymous>.<anonymous>.<anonymous> (CasesMainUi.kt:518)");
                                        }
                                        ConstraintLayoutScope constraintLayoutScope7 = constraintLayoutScope6;
                                        Modifier.Companion companion12 = Modifier.INSTANCE;
                                        Modifier modifierM8177width3ABfNKs2 = SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion12, PrimitiveResources_androidKt.dimensionResource(R.dimen._35wdp, composer6, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._200wdp, composer6, 6));
                                        ConstrainedLayoutReference constrainedLayoutReference7 = constrainedLayoutReferenceComponent42;
                                        composer6.startReplaceableGroup(102596735);
                                        boolean zChanged16 = composer6.changed(constrainedLayoutReferenceComponent5);
                                        final ConstrainedLayoutReference constrainedLayoutReference8 = constrainedLayoutReferenceComponent5;
                                        Object objRememberedValue24 = composer6.rememberedValue();
                                        if (zChanged16 || objRememberedValue24 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue24 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesMainUiKt$CasesMainUi$2$1$22$1$1
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
                                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReference8.getTop(), 0.0f, 0.0f, 6, null);
                                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReference8.getBottom(), 0.0f, 0.0f, 6, null);
                                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReference8.getEnd(), 0.0f, 0.0f, 6, null);
                                                }
                                            };
                                            composer6.updateRememberedValue(objRememberedValue24);
                                        }
                                        composer6.endReplaceableGroup();
                                        Brush brush7 = brush4;
                                        ComposableSingletons$CasesMainUiKt composableSingletons$CasesMainUiKt = ComposableSingletons$CasesMainUiKt.INSTANCE;
                                        CloudArrowLeftBlockKt.CloudArrowLeftBlock(constraintLayoutScope7.constrainAs(modifierM8177width3ABfNKs2, constrainedLayoutReference7, (Function1) objRememberedValue24), brush7, null, new float[]{0.0f, 0.0f}, null, new float[]{0.05f, 0.3f}, null, composableSingletons$CasesMainUiKt.m14933getLambda3$app_siteRelease(), composer6, 12849152, 84);
                                        ConstraintLayoutScope constraintLayoutScope8 = constraintLayoutScope6;
                                        Modifier modifierM8177width3ABfNKs3 = SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion12, PrimitiveResources_androidKt.dimensionResource(R.dimen._50wdp, composer6, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._125wdp, composer6, 6));
                                        ConstrainedLayoutReference constrainedLayoutReference9 = constrainedLayoutReferenceComponent32;
                                        composer6.startReplaceableGroup(102598114);
                                        boolean zChanged17 = composer6.changed(constrainedLayoutReference5) | composer6.changed(f29);
                                        final ConstrainedLayoutReference constrainedLayoutReference10 = constrainedLayoutReference5;
                                        final float f32 = f29;
                                        Object objRememberedValue25 = composer6.rememberedValue();
                                        if (zChanged17 || objRememberedValue25 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue25 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesMainUiKt$CasesMainUi$2$1$22$2$1
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
                                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReference10.getTop(), 0.0f, 0.0f, 6, null);
                                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReference10.getStart(), f32, 0.0f, 4, null);
                                                }
                                            };
                                            composer6.updateRememberedValue(objRememberedValue25);
                                        }
                                        composer6.endReplaceableGroup();
                                        Modifier modifierConstrainAs8 = constraintLayoutScope8.constrainAs(modifierM8177width3ABfNKs3, constrainedLayoutReference9, (Function1) objRememberedValue25);
                                        Brush brush8 = brush5;
                                        final AnnotatedString annotatedString11 = annotatedString7;
                                        CloudArrowBottomBlockKt.CloudArrowBottomBlock(modifierConstrainAs8, brush8, ComposableLambdaKt.composableLambda(composer6, -1170629804, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesMainUiKt$CasesMainUi$2$1$22.3
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num9) {
                                                invoke(composer7, num9.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                            @Composable
                                            public final void invoke(@Nullable Composer composer7, int i44) {
                                                if ((i44 & 11) != 2 || !composer7.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1170629804, i44, -1, "com.blackhub.bronline.game.ui.cases.ui.CasesMainUi.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CasesMainUi.kt:557)");
                                                    }
                                                    TextKt.m10025TextIbK3jfQ(annotatedString11, Modifier.INSTANCE, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, TypographyStyle.INSTANCE.m14843montserratMediumCustomSpbl3sdaw(R.dimen._9wsp, ColorResources_androidKt.colorResource(R.color.white, composer7, 6), TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, composer7, 196614, 24), composer7, 48, 0, 131068);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer7.skipToGroupEnd();
                                            }
                                        }), composer6, 384, 0);
                                        ConstraintLayoutScope constraintLayoutScope9 = constraintLayoutScope6;
                                        Modifier modifierM8177width3ABfNKs4 = SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion12, PrimitiveResources_androidKt.dimensionResource(R.dimen._43wdp, composer6, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._158wdp, composer6, 6));
                                        ConstrainedLayoutReference constrainedLayoutReference11 = constrainedLayoutReferenceComponent82;
                                        composer6.startReplaceableGroup(102599075);
                                        boolean zChanged18 = composer6.changed(constrainedLayoutReference6);
                                        final ConstrainedLayoutReference constrainedLayoutReference12 = constrainedLayoutReference6;
                                        Object objRememberedValue26 = composer6.rememberedValue();
                                        if (zChanged18 || objRememberedValue26 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue26 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesMainUiKt$CasesMainUi$2$1$22$4$1
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
                                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReference12.getTop(), 0.0f, 0.0f, 6, null);
                                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReference12.getStart(), 0.0f, 0.0f, 6, null);
                                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainedLayoutReference12.getEnd(), 0.0f, 0.0f, 6, null);
                                                }
                                            };
                                            composer6.updateRememberedValue(objRememberedValue26);
                                        }
                                        composer6.endReplaceableGroup();
                                        CloudArrowBottomBlockKt.CloudArrowBottomBlock(constraintLayoutScope9.constrainAs(modifierM8177width3ABfNKs4, constrainedLayoutReference11, (Function1) objRememberedValue26), brush5, composableSingletons$CasesMainUiKt.m14934getLambda4$app_siteRelease(), composer6, 384, 0);
                                        ConstraintLayoutScope constraintLayoutScope10 = constraintLayoutScope6;
                                        Modifier modifierM8177width3ABfNKs5 = SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion12, PrimitiveResources_androidKt.dimensionResource(R.dimen._50wdp, composer6, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._152wdp, composer6, 6));
                                        ConstrainedLayoutReference constrainedLayoutReference13 = constrainedLayoutReferenceComponent22;
                                        composer6.startReplaceableGroup(102600104);
                                        boolean zChanged19 = composer6.changed(constrainedLayoutReference5) | composer6.changed(f30);
                                        final ConstrainedLayoutReference constrainedLayoutReference14 = constrainedLayoutReference5;
                                        final float f33 = f30;
                                        Object objRememberedValue27 = composer6.rememberedValue();
                                        if (zChanged19 || objRememberedValue27 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue27 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesMainUiKt$CasesMainUi$2$1$22$5$1
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
                                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReference14.getTop(), 0.0f, 0.0f, 6, null);
                                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainedLayoutReference14.getEnd(), f33, 0.0f, 4, null);
                                                }
                                            };
                                            composer6.updateRememberedValue(objRememberedValue27);
                                        }
                                        composer6.endReplaceableGroup();
                                        Modifier modifierConstrainAs9 = constraintLayoutScope10.constrainAs(modifierM8177width3ABfNKs5, constrainedLayoutReference13, (Function1) objRememberedValue27);
                                        Brush brush9 = brush5;
                                        final AnnotatedString annotatedString12 = annotatedString8;
                                        CloudArrowBottomBlockKt.CloudArrowBottomBlock(modifierConstrainAs9, brush9, ComposableLambdaKt.composableLambda(composer6, 1317329692, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesMainUiKt$CasesMainUi$2$1$22.6
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num9) {
                                                invoke(composer7, num9.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                            @Composable
                                            public final void invoke(@Nullable Composer composer7, int i44) {
                                                if ((i44 & 11) != 2 || !composer7.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1317329692, i44, -1, "com.blackhub.bronline.game.ui.cases.ui.CasesMainUi.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CasesMainUi.kt:598)");
                                                    }
                                                    TextKt.m10025TextIbK3jfQ(annotatedString12, Modifier.INSTANCE, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, TypographyStyle.INSTANCE.m14843montserratMediumCustomSpbl3sdaw(R.dimen._9wsp, ColorResources_androidKt.colorResource(R.color.white, composer7, 6), TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, composer7, 196614, 24), composer7, 48, 0, 131068);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer7.skipToGroupEnd();
                                            }
                                        }), composer6, 384, 0);
                                        ConstraintLayoutScope constraintLayoutScope11 = constraintLayoutScope6;
                                        Modifier modifierM8177width3ABfNKs6 = SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion12, PrimitiveResources_androidKt.dimensionResource(R.dimen._35wdp, composer6, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._135wdp, composer6, 6));
                                        ConstrainedLayoutReference constrainedLayoutReference15 = constrainedLayoutReferenceComponent72;
                                        composer6.startReplaceableGroup(102601068);
                                        boolean zChanged20 = composer6.changed(constrainedLayoutReferenceComponent4);
                                        final ConstrainedLayoutReference constrainedLayoutReference16 = constrainedLayoutReferenceComponent4;
                                        Object objRememberedValue28 = composer6.rememberedValue();
                                        if (zChanged20 || objRememberedValue28 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue28 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesMainUiKt$CasesMainUi$2$1$22$7$1
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
                                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReference16.getBottom(), 0.0f, 0.0f, 6, null);
                                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainedLayoutReference16.getEnd(), 0.0f, 0.0f, 6, null);
                                                }
                                            };
                                            composer6.updateRememberedValue(objRememberedValue28);
                                        }
                                        composer6.endReplaceableGroup();
                                        CloudArrowTopRightBlockKt.CloudArrowTopRightBlock(constraintLayoutScope11.constrainAs(modifierM8177width3ABfNKs6, constrainedLayoutReference15, (Function1) objRememberedValue28), brush6, 0.0f, 0.0f, 0.05f, 0.2f, composableSingletons$CasesMainUiKt.m14935getLambda5$app_siteRelease(), composer6, 1797504, 0);
                                        ConstraintLayoutScope constraintLayoutScope12 = constraintLayoutScope6;
                                        Modifier modifierM8177width3ABfNKs7 = SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion12, PrimitiveResources_androidKt.dimensionResource(R.dimen._34wdp, composer6, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._200wdp, composer6, 6));
                                        ConstrainedLayoutReference constrainedLayoutReference17 = constrainedLayoutReferenceComponent62;
                                        composer6.startReplaceableGroup(102602258);
                                        boolean zChanged21 = composer6.changed(constrainedLayoutReferenceComponent3);
                                        final ConstrainedLayoutReference constrainedLayoutReference18 = constrainedLayoutReferenceComponent3;
                                        Object objRememberedValue29 = composer6.rememberedValue();
                                        if (zChanged21 || objRememberedValue29 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue29 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesMainUiKt$CasesMainUi$2$1$22$8$1
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
                                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReference18.getTop(), 0.0f, 0.0f, 6, null);
                                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReference18.getEnd(), 0.0f, 0.0f, 6, null);
                                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReference18.getBottom(), 0.0f, 0.0f, 6, null);
                                                }
                                            };
                                            composer6.updateRememberedValue(objRememberedValue29);
                                        }
                                        composer6.endReplaceableGroup();
                                        Brush brush10 = brush4;
                                        final AnnotatedString annotatedString13 = annotatedString9;
                                        CloudArrowLeftBlockKt.CloudArrowLeftBlock(constraintLayoutScope12.constrainAs(modifierM8177width3ABfNKs7, constrainedLayoutReference17, (Function1) objRememberedValue29), brush10, null, new float[]{0.0f, 0.0f}, null, new float[]{0.05f, 0.3f}, null, ComposableLambdaKt.composableLambda(composer6, -1478192418, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesMainUiKt$CasesMainUi$2$1$22.9
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num9) {
                                                invoke(composer7, num9.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                            @Composable
                                            public final void invoke(@Nullable Composer composer7, int i44) {
                                                if ((i44 & 11) != 2 || !composer7.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1478192418, i44, -1, "com.blackhub.bronline.game.ui.cases.ui.CasesMainUi.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CasesMainUi.kt:651)");
                                                    }
                                                    TextKt.m10025TextIbK3jfQ(annotatedString13, PaddingKt.m8127paddingqDBjuR0$default(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer7, 6), 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, TypographyStyle.INSTANCE.m14843montserratMediumCustomSpbl3sdaw(R.dimen._9wsp, ColorResources_androidKt.colorResource(R.color.white, composer7, 6), 0, 0L, 0.0f, composer7, 196614, 28), composer7, 0, 0, 131068);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer7.skipToGroupEnd();
                                            }
                                        }), composer6, 12849152, 84);
                                        ConstraintLayoutScope constraintLayoutScope13 = constraintLayoutScope6;
                                        Modifier modifierM8177width3ABfNKs8 = SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion12, PrimitiveResources_androidKt.dimensionResource(R.dimen._51wdp, composer6, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._214wdp, composer6, 6));
                                        ConstrainedLayoutReference constrainedLayoutReference19 = constrainedLayoutReferenceComponent52;
                                        composer6.startReplaceableGroup(102603613);
                                        boolean zChanged22 = composer6.changed(constrainedLayoutReferenceComponent3) | composer6.changed(f31);
                                        final ConstrainedLayoutReference constrainedLayoutReference20 = constrainedLayoutReferenceComponent3;
                                        final float f34 = f31;
                                        Object objRememberedValue30 = composer6.rememberedValue();
                                        if (zChanged22 || objRememberedValue30 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue30 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesMainUiKt$CasesMainUi$2$1$22$10$1
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
                                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReference20.getBottom(), f34, 0.0f, 4, null);
                                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReference20.getStart(), 0.0f, 0.0f, 6, null);
                                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainedLayoutReference20.getEnd(), 0.0f, 0.0f, 6, null);
                                                }
                                            };
                                            composer6.updateRememberedValue(objRememberedValue30);
                                        }
                                        composer6.endReplaceableGroup();
                                        Modifier modifierConstrainAs10 = constraintLayoutScope13.constrainAs(modifierM8177width3ABfNKs8, constrainedLayoutReference19, (Function1) objRememberedValue30);
                                        Brush brush11 = brush6;
                                        final AnnotatedString annotatedString14 = annotatedString10;
                                        CloudArrowTopBlockKt.CloudArrowTopBlock(modifierConstrainAs10, brush11, ComposableLambdaKt.composableLambda(composer6, 172118042, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesMainUiKt$CasesMainUi$2$1$22.11
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num9) {
                                                invoke(composer7, num9.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                            @Composable
                                            public final void invoke(@Nullable Composer composer7, int i44) {
                                                if ((i44 & 11) != 2 || !composer7.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(172118042, i44, -1, "com.blackhub.bronline.game.ui.cases.ui.CasesMainUi.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CasesMainUi.kt:672)");
                                                    }
                                                    TextKt.m10025TextIbK3jfQ(annotatedString14, PaddingKt.m8127paddingqDBjuR0$default(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer7, 6), 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, TypographyStyle.INSTANCE.m14843montserratMediumCustomSpbl3sdaw(R.dimen._9wsp, ColorResources_androidKt.colorResource(R.color.white, composer7, 6), 0, 0L, 0.0f, composer7, 196614, 28), composer7, 0, 0, 131068);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer7.skipToGroupEnd();
                                            }
                                        }), composer6, 384, 0);
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
        }), composerStartRestartGroup, 12582918, 122);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final String str14 = str6;
            final String str15 = str7;
            final Integer num7 = num3;
            final Integer num8 = num4;
            final String str16 = str8;
            final String str17 = str9;
            final boolean z4 = z2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesMainUiKt.CasesMainUi.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num9) {
                    invoke(composer2, num9.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i20) {
                    CasesMainUiKt.CasesMainUi(bitmap, selectedCase, str, bcAmount, casesList, i, i2, i3, i4, bonuses, progressBarStatesInFloat, i5, i6, i7, rewardName, i8, f, f2, f3, f4, str14, str15, num7, num8, str16, str17, i9, i10, f5, i11, z4, saleOneHintText, saleTenHintText, uniqueCaseHintText, scaleHintText, allRewardsBottom, i12, onOpenOneClick, onOpenTenClick, onSelectCase, onBonusClick, onInfoSprayClick, onBonusInfoClick, onCloseClick, onBcButtonClick, onClickBottomItem, onBpRewardsClick, selectItem, composer2, RecomposeScopeImplKt.updateChangedFlags(i13 | 1), RecomposeScopeImplKt.updateChangedFlags(i14), RecomposeScopeImplKt.updateChangedFlags(i15), RecomposeScopeImplKt.updateChangedFlags(i16), RecomposeScopeImplKt.updateChangedFlags(i17), i18, i19);
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void PreviewCasesMainUi(@Nullable Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(963630491);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(963630491, i, -1, "com.blackhub.bronline.game.ui.cases.ui.PreviewCasesMainUi (CasesMainUi.kt:690)");
            }
            List listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new Case(0, null, null, null, 0, false, 1, null, null, null, 0, false, null, null, 0, null, 65454, null), new Case(1, null, null, null, 100, false, 3, null, null, null, 0, false, null, null, 0, null, 65454, null), new Case(2, null, null, null, 999, false, 2, null, null, null, 0, false, null, null, 0, null, 65454, null), new Case(3, null, null, null, 0, false, 0, null, null, null, 0, false, null, null, 0, null, 65454, null), new Case(4, null, null, null, 0, false, 3, null, null, null, 0, false, null, null, 0, null, 65454, null), new Case(5, null, null, null, 0, false, 2, null, null, null, 0, false, null, null, 0, null, 65454, null), new Case(6, null, null, null, 0, false, 1, null, null, null, 0, false, null, null, 0, null, 65454, null));
            Case r7 = new Case(0, "legendary case", null, null, 0, false, 0, null, null, null, 0, false, null, null, 0, null, Utf8.REPLACEMENT_CODE_POINT, null);
            AnnotatedString annotatedStringHtmlTextToAnnotatedString = StringExtensionKt.htmlTextToAnnotatedString("<![CDATA[<font color=#FFC700>999 999 ВС</font>]]");
            CommonRarityEnum commonRarityEnum = CommonRarityEnum.LEGENDARY;
            CaseBonus caseBonus = new CaseBonus(1, 0, null, null, 0, 50, commonRarityEnum, 0, false, null, null, 0, 3982, null);
            CommonRarityEnum commonRarityEnum2 = CommonRarityEnum.EPIC;
            CaseBonus caseBonus2 = new CaseBonus(1, 0, null, null, 0, 35, commonRarityEnum2, 0, false, null, null, 0, 3982, null);
            CommonRarityEnum commonRarityEnum3 = CommonRarityEnum.RARE;
            CaseBonus caseBonus3 = new CaseBonus(1, 0, null, null, 1, 20, commonRarityEnum3, 0, false, null, null, 0, 3982, null);
            CommonRarityEnum commonRarityEnum4 = CommonRarityEnum.UNCOMMON;
            Bitmap bitmap = null;
            List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new CaseBonus[]{caseBonus, caseBonus2, caseBonus3, new CaseBonus(1, 0, null, null, 2, 10, commonRarityEnum4, 0, false, null, null, 0, 3982, null), new CaseBonus(1, 0, null, null, 3, 5, commonRarityEnum2, 0, false, null, null, 0, 3982, null)});
            List listListOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(0.1f), Float.valueOf(0.1f), Float.valueOf(1.0f), Float.valueOf(1.0f), Float.valueOf(1.0f)});
            AnnotatedString annotatedStringHtmlTextToAnnotatedString2 = StringExtensionKt.htmlTextToAnnotatedString(StringResources_androidKt.stringResource(R.string.cases_hint_sale_one, composerStartRestartGroup, 6));
            AnnotatedString annotatedStringHtmlTextToAnnotatedString3 = StringExtensionKt.htmlTextToAnnotatedString(StringResources_androidKt.stringResource(R.string.cases_hint_sale_ten, composerStartRestartGroup, 6));
            AnnotatedString annotatedStringHtmlTextToAnnotatedString4 = StringExtensionKt.htmlTextToAnnotatedString(StringResources_androidKt.stringResource(R.string.cases_hint_unique_case, composerStartRestartGroup, 6));
            AnnotatedString annotatedStringHtmlTextToAnnotatedString5 = StringExtensionKt.htmlTextToAnnotatedString(StringResources_androidKt.stringResource(R.string.cases_hint_scale_hint, composerStartRestartGroup, 6));
            CommonRarityEnum commonRarityEnum5 = CommonRarityEnum.COMMON;
            int i2 = 1;
            int i3 = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            int i4 = 0;
            boolean z = false;
            int i5 = 0;
            boolean z2 = false;
            CaseRenderAttachment caseRenderAttachment = null;
            String str4 = null;
            int i6 = 0;
            String str5 = "ololo";
            CaseReward caseReward = new CaseReward(i2, i3, str5, str, str2, str3, i4, bitmap, commonRarityEnum5, z, false, false, i5, z2, caseRenderAttachment, str4, i6, 128250, null);
            int i7 = 2;
            String str6 = null;
            String str7 = null;
            int i8 = 0;
            Bitmap bitmap2 = null;
            boolean z3 = false;
            boolean z4 = false;
            int i9 = 0;
            String str8 = "ololo";
            CaseReward caseReward2 = new CaseReward(i7, 0, str8, null, str6, str7, i8, bitmap2, commonRarityEnum4, z3, z4, false, 0, false, null, null, i9, 128250, null);
            int i10 = 3;
            String str9 = null;
            String str10 = "ololo";
            byte b = 0 == true ? 1 : 0;
            String str11 = "ololo";
            byte b2 = 0 == true ? 1 : 0;
            composer2 = composerStartRestartGroup;
            CasesMainUi(null, r7, "XX.XX.XXXX - YY.YY.YYYY 05:00 (UTC +3)", annotatedStringHtmlTextToAnnotatedString, listMutableListOf, 1, 1, 512, 512, listListOf, listListOf2, 17, 99, 100, "арррриваа", R.color.green_50, 0.5f, 0.5f, 0.5f, 1.0f, "100 BC", "1000 BC", -10, -10, "90 BC", "900 BC", 2, 1, 1.0f, R.drawable.ic_close_rounded, false, annotatedStringHtmlTextToAnnotatedString2, annotatedStringHtmlTextToAnnotatedString3, annotatedStringHtmlTextToAnnotatedString4, annotatedStringHtmlTextToAnnotatedString5, CollectionsKt__CollectionsKt.listOf((Object[]) new CaseReward[]{caseReward, caseReward2, new CaseReward(i10, 0, str10, null, str9, null, 0, null, commonRarityEnum, false, false, b, 0, false, 0 == true ? 1 : 0, str7, i8, 128250, null), new CaseReward(4, i9, str11, b2, null, null, 0, null, commonRarityEnum3, false, false, false, 0, false, null, null, 0, 128250, null)}), 1, new Function1<Float, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesMainUiKt.PreviewCasesMainUi.1
                public final void invoke(float f) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                    invoke(f.floatValue());
                    return Unit.INSTANCE;
                }
            }, new Function1<Float, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesMainUiKt.PreviewCasesMainUi.2
                public final void invoke(float f) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                    invoke(f.floatValue());
                    return Unit.INSTANCE;
                }
            }, new Function1<Case, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesMainUiKt.PreviewCasesMainUi.3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Case it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Case r1) {
                    invoke2(r1);
                    return Unit.INSTANCE;
                }
            }, new Function2<CaseBonus, Bitmap, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesMainUiKt.PreviewCasesMainUi.4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull CaseBonus caseBonus4, @Nullable Bitmap bitmap3) {
                    Intrinsics.checkNotNullParameter(caseBonus4, "<anonymous parameter 0>");
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(CaseBonus caseBonus4, Bitmap bitmap3) {
                    invoke2(caseBonus4, bitmap3);
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesMainUiKt.PreviewCasesMainUi.5
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesMainUiKt.PreviewCasesMainUi.6
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesMainUiKt.PreviewCasesMainUi.7
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesMainUiKt.PreviewCasesMainUi.8
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesMainUiKt.PreviewCasesMainUi.9
                public final void invoke(int i11) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesMainUiKt.PreviewCasesMainUi.10
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesMainUiKt.PreviewCasesMainUi.11
                public final void invoke(int i11) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }
            }, composer2, 1188790726, 920350134, 920350134, 920387590, 14380470, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.ui.CasesMainUiKt.PreviewCasesMainUi.12
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i11) {
                    CasesMainUiKt.PreviewCasesMainUi(composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final Bitmap CasesMainUi$lambda$1(MutableState<Bitmap> mutableState) {
        return mutableState.getValue();
    }

    public static final Integer CasesMainUi$lambda$4(MutableState<Integer> mutableState) {
        return mutableState.getValue();
    }
}

